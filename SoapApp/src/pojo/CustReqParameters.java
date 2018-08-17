package pojo;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by root on 17/8/18.
 */
public class CustReqParameters {

    private String customerName;
    private String customerId;

    @XmlElement(name = "CustomerName")
    public String getCustomerName() {
        return customerName;
    }

    public CustReqParameters setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }


    @XmlElement(name = "CustomerId")
    public String getCustomerId() {
        return customerId;
    }

    public CustReqParameters setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
}
