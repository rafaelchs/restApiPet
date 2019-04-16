package com.example.demo.Controller;

import com.example.demo.Service.PetService;
import com.example.demo.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.DomainEvents;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class ControllerPet {

    @Autowired
    private PetService petService;

    public ControllerPet() {
    }

    @PostMapping
    @RequestMapping("add")
    public void insert_pet(@RequestBody Pet objPet){

        this.petService.add(objPet);

    }
    @GetMapping
    @RequestMapping("show")
    public List<Pet>list(){

        return this.petService.list();
    }

    @PutMapping
    @RequestMapping("update")
    public void update_pet(@RequestBody Pet objPet){

        this.petService.update(objPet);
    }

    @DeleteMapping(value="delete/{id}")
    public void delete_pet(@PathVariable("id")Integer id){

        this.petService.delete(id);
    }


}
