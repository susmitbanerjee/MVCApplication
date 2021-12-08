package com.org.sampleProject.ServiceRepository;

import com.org.sampleProject.Entity.ServiceEntity;
import com.org.sampleProject.Service.RegistryService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRegistryRepository extends JpaRepository<ServiceEntity, Integer> {
}
