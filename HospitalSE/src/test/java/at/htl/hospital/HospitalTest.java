package at.htl.hospital;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class HospitalTest {


    private Client client;
    private WebTarget target;

    @BeforeEach

    public void initClient(){
        this.client = ClientBuilder.newClient();
        this.target = client.target("https://localhost:8080/vehicle/api/");
    }






}
