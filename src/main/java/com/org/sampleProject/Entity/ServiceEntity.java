package com.org.sampleProject.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SERVICE_ENTITY")
public class ServiceEntity {
    @javax.persistence.Id
    @Column
    @JsonProperty("Id")
    private int Id;
    @Column
    @JsonProperty("serviceName")
    private String serviceName;
    @Column
    @JsonProperty("KindOfService")
    private String kindOfService;

    public ServiceEntity() {
    }

    public ServiceEntity(int id, String serviceName, String kindOfService) {
        Id = id;
        this.serviceName = serviceName;
        this.kindOfService = kindOfService;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getKindOfService() {
        return kindOfService;
    }

    public void setKindOfService(String kindOfService) {
        this.kindOfService = kindOfService;
    }
}
