package service;

import javax.xml.ws.Endpoint;

/**
 * Created by root on 17/8/18.
 */
public class ExecuteService {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:9999/ws/getCustomerDetails", new customerDetailService());

    }
}
