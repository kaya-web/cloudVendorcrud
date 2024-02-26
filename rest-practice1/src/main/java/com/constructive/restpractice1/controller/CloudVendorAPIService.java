package com.constructive.restpractice1.controller;

import com.constructive.restpractice1.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

import java.sql.Struct;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService
{
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return cloudVendor;
//        return new CloudVendor("c1","Vendor 1","address1", "xxxxxx");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor Created succefully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor=cloudVendor;
        return "cloud vendor putmapping created succefully";

    }

    @DeleteMapping
    public String deleteCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor=null;
        return "cloud vendor delete mapping created succefully";
    }
}

