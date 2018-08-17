package service;

import pojo.CustReqParameters;
import pojo.CustomerDetailResponse;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by root on 17/8/18.
 */

@WebService(portName = "GetCustomerDetailPort",
        serviceName = "CustomerDetailClass", targetNamespace = "http://soap.us", endpointInterface = "service.customerDetails")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class customerDetailService implements customerDetails {

    @Override
    @WebMethod
    @WebResult(name = "CustomerDetails")
    public CustomerDetailResponse GetCustomerDetails(CustReqParameters custReqParameters) {

        CustomerDetailResponse customerDetailResponse = new CustomerDetailResponse()
                .setBankBranchName("BLDE Road SBI Bank")
                .setBankName("SBI BANK")
                .setBrancCode("SBI001");

        return customerDetailResponse;
    }
}
