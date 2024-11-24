package com.example.crudMoscoso.controllers;

import com.example.crudMoscoso.models.Persona;
import com.example.crudMoscoso.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    //anotacion para poder realizar cambios en la bd es de JPA
    @Autowired
    private Repository repo;


    //endpoint para los enrutamientos
    @GetMapping()
    public String index(){
        return"conectado";
    }
    @GetMapping("personas")
    public List<Persona> getPersonas(){
        //el findAll sirve para traer todos los datos
        return repo.findAll();
    }
    @PostMapping("grabar")
    public String post(@RequestBody Persona persona){
        repo.save(persona);
        return "Persona guardada";
    }

    @PutMapping("editar/{id}")
    public String update(@PathVariable Long id,@RequestBody Persona persona){
        Persona updatePersona=repo.findById(id).get();
        updatePersona.setNombre(persona.getNombre());
        updatePersona.setTelefono(persona.getTelefono());
        repo.save(updatePersona);

        return "Edicion completa";
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        Persona deletePersona=repo.findById(id).get();
        repo.delete(deletePersona);
        return "usuario eliminado";
    }

}
