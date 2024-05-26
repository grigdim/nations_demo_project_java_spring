package grigdim.nationsDemo.services;

import grigdim.nationsDemo.entities.Vip;
import grigdim.nationsDemo.repositories.VipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VipService {

    @Autowired
    private VipRepository vipRepository;

    public List<Vip> getAllVips() {
        return vipRepository.findAll();
    }

    public Vip getVipById(int vipId) {
        Optional<Vip> optionalVip = vipRepository.findById(vipId);
        return optionalVip.orElse(null);
    }

}
