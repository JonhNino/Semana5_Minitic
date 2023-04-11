package com.unab.g01.Service.Implement;
import com.unab.g01.Models.Proveedor;
import com.unab.g01.Dao.ProveedorDao;
import com.unab.g01.Service.ProveedorService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;  

@Service
public class ProveedorServiceImplem implements ProveedorService{
    @Autowired
    private ProveedorDao proveedorDao;

    @Override
    @Transactional (readOnly=false)
    public Proveedor save(Proveedor proveedor) {
        return proveedorDao.save(proveedor);
    }

    @Override
    @Transactional (readOnly=false)
    public void delete(Integer id) {
        proveedorDao.deleteById(id);
    }

    @Override
    @Transactional (readOnly=true)
    public Proveedor findById(Integer id) {
         return proveedorDao.findById(id).orElse(null);
    }

    @Override
    @Transactional (readOnly=true)
    public List<Proveedor> findByAll() {
        return (List<Proveedor>) proveedorDao.findAll();
    }
    
}
