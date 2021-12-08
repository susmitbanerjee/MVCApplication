package com.org.sampleProject.DAO;

import com.org.sampleProject.Entity.ServiceEntity;
import com.org.sampleProject.ServiceRepository.ServiceRegistryRepository;
import org.springframework.stereotype.Component;

import java.util.List;


public interface ServiceRegistryDAO {

    public void add(ServiceEntity serviceEntity);

    public List<ServiceEntity> viewEntity();

    public void deleteEntity(int id);
}
