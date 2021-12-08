package com.org.sampleProject.Controller;

import com.org.sampleProject.Entity.ServiceEntity;
import com.org.sampleProject.Service.RegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/h1")
public class MainController {

    @Autowired
    RegistryService registryService;

    ServiceEntity serviceEntity = new ServiceEntity(1,"Broadcast Service", "Channel");
    ServiceEntity serviceEntity1 = new ServiceEntity(2,"Telecast Service", "All Time");
    ServiceEntity serviceEntity2 = new ServiceEntity(3,"OTT Service", "OTT");

    @GetMapping("/hello")
    public String someFunction(){
        return "The first base function";
    }

    @RequestMapping(value = "/add", method = { RequestMethod.GET, RequestMethod.POST })
    public String addService(@RequestBody ServiceEntity serviceEntity){
        /*registryService.addService(serviceEntity);
        registryService.addService(serviceEntity1);
        registryService.addService(serviceEntity2);
        */
       registryService.addService(serviceEntity);
        return serviceEntity.getId()+" Added successfully";
    }
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public List<ServiceEntity> viewService(){
        return registryService.findService();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id){
        registryService.deleteEntity(id);
        return id+" is deleted from Database";
    }
}

