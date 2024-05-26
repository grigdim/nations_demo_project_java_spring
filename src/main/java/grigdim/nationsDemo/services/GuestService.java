package grigdim.nationsDemo.services;

import grigdim.nationsDemo.entities.Guest;
import grigdim.nationsDemo.repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    public Guest getGuestById(int id) {
        return guestRepository.findById(id).orElse(null);
    }

}

