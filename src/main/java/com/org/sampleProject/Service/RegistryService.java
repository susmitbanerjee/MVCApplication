package com.org.sampleProject.Service;

import com.org.sampleProject.DAO.ServiceRegistryDAO;
import com.org.sampleProject.Entity.ServiceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@EnableCaching
public class RegistryService {

    @Autowired
    ServiceRegistryDAO serviceRegistryDAO;

    public void addService(ServiceEntity serviceEntity){
        serviceRegistryDAO.add(serviceEntity);
    }
    public List<ServiceEntity> findService(){
        return serviceRegistryDAO.viewEntity();
    }
    public void deleteEntity(int id){
        serviceRegistryDAO.deleteEntity(id);
    }
    /*@Autowired
    ServiceRegistryRepository serviceRegistryRepository;

    public int addService(ServiceEntity serviceEntity){
        serviceRegistryRepository.save(serviceEntity);
        return serviceEntity.getId();
    }

    public List<ServiceEntity> findService(){
        return serviceRegistryRepository.findAll();
    }*/
}
