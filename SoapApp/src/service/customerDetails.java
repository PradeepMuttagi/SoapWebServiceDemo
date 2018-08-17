package service;

import pojo.CustReqParameters;
import pojo.CustomerDetailResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Pradeep on 17/8/18.
 */
@WebService(targetNamespace = "http://soap.org/", name = "customerDetails")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface customerDetails {

    @WebMethod
    @WebResult(name = "CustomerDetails")
    CustomerDetailResponse GetCustomerDetails(@WebParam CustReqParameters custReqParameters);
}
