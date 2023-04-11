package com.unab.g01.Controller;

import com.unab.g01.Models.Proveedor;
import com.unab.g01.Service.ProveedorService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/proveedor")
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService; 
    
    @PostMapping("/")
    public ResponseEntity<Proveedor> agregar(@RequestBody Proveedor proveedor){
        Proveedor obj = proveedorService.save(proveedor);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @DeleteMapping(value="/(id)")
    public ResponseEntity<Proveedor>eliminar(@PathVariable Integer id){
    Proveedor obj= proveedorService.findById(id);
    if(obj!=null)
             proveedorService.delete(id);
    else
        return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
    
    return new ResponseEntity<>(obj,HttpStatus.OK);       
    }
    
    @PutMapping(value="/")
    public ResponseEntity<Proveedor>editar(@RequestBody Proveedor proveedor){
    Proveedor obj= proveedorService.findById(proveedor.getId_proveedor());
    if(obj!=null){
        obj.setNombre_proveedor(proveedor.getNombre_proveedor());
        obj.setEmail_proveedor(proveedor.getEmail_proveedor());
        proveedorService.save(obj);
    }    
    else
        return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
    return new ResponseEntity<>(obj,HttpStatus.OK);
    }
    
    @GetMapping("/list")
    public List<Proveedor>consultarTodo(){
        return proveedorService.findByAll();
    }
    
     @GetMapping("/list/{id}")
    public Proveedor consultarPorId(@PathVariable Integer id){
        return proveedorService.findById(id);
    }  
}
