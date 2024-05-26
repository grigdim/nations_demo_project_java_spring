package grigdim.nationsDemo.controllers;

import grigdim.nationsDemo.entities.Vip;
import grigdim.nationsDemo.services.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vips")
public class VipController {

    @Autowired
    private VipService vipService;

    @GetMapping
    public ResponseEntity<List<Vip>> getAllVips() {
        List<Vip> vips = vipService.getAllVips();
        return new ResponseEntity<>(vips, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vip> getVipById(@PathVariable("id") int id) {
        Vip vip = vipService.getVipById(id);
        if (vip == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(vip, HttpStatus.OK);
    }

}
