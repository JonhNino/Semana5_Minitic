package com.unab.g01.Service;
import com.unab.g01.Models.Proveedor;
import java.util.List;


public interface ProveedorService {
//    Save- agregar
    public Proveedor save(Proveedor proveedor);
//    delte = eliminar
    public void delete(Integer id);
//    findById = consultar un registro por id
    public Proveedor findById(Integer id);
//    findByAll = consultar tods registro 
    public List<Proveedor> findByAll();
    
}
