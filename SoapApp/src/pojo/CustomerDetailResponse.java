package pojo;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by pradeep on 17/8/18.
 */
public class CustomerDetailResponse {

    private String bankBranchName;
    private String brancCode;
    private String bankName;


    @XmlElement(name = "BranchName")
    public String getBankBranchName() {
        return bankBranchName;
    }

    public CustomerDetailResponse setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
        return this;
    }

    @XmlElement(name = "Code")
    public String getBrancCode() {
        return brancCode;
    }

    public CustomerDetailResponse setBrancCode(String brancCode) {
        this.brancCode = brancCode;
        return this;
    }

    @XmlElement(name = "Name")
    public String getBankName() {
        return bankName;
    }

    public CustomerDetailResponse setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
}
