package com.verveyko.graphqldemo.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.verveyko.graphqldemo.entity.Vehicle;
import com.verveyko.graphqldemo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

    @Autowired
    private VehicleService vehicleService;

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}
