package com.example.demo.Service;

import com.example.demo.model.Pet;
import com.example.demo.repository.IPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PetService {

    @Autowired
    private IPetRepository petRepo;

    public PetService() {

    }

    public void add(Pet objPet){

        this.petRepo.save(objPet);
    }

    public List<Pet>list(){

       return this.petRepo.findAll();
    }

    public void update(Pet objPet){

        this.petRepo.save(objPet);
    }

    public void delete(int id){

        this.petRepo.deleteById(id);
    }
}
