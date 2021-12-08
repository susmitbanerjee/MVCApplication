package com.org.sampleProject.DAO;

import com.org.sampleProject.Entity.ServiceEntity;
import com.org.sampleProject.ServiceRepository.ServiceRegistryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class ServiceRegistryDAOImpl implements ServiceRegistryDAO {

    @Autowired
    ServiceRegistryRepository registryRepository;

    @Override
    public void add(ServiceEntity serviceEntity) {
        registryRepository.save(serviceEntity);
    }

    @Override
    public List<ServiceEntity> viewEntity() {
        return registryRepository.findAll();
    }

    @Override
    public void deleteEntity(int id) {
        registryRepository.deleteById(id);
    }

}
