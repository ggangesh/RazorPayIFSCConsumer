package com.gangesh.razorpayifsc.dto;

public class ResponseBranchIFSCDto {
    private String bank;
    private String banckCode;
    private String IFSCCode;
    private String address;

    public ResponseBranchIFSCDto(String bank, String banckCode, String IFSCCode, String address) {
        this.bank = bank;
        this.banckCode = banckCode;
        this.IFSCCode = IFSCCode;
        this.address = address;
    }

    public ResponseBranchIFSCDto() {

    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBanckCode() {
        return banckCode;
    }

    public void setBanckCode(String banckCode) {
        this.banckCode = banckCode;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public void setIFSCCode(String IFSCCode) {
        this.IFSCCode = IFSCCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ResponseBranchIFSC{" +
                "bank='" + bank + '\'' +
                ", banckCode='" + banckCode + '\'' +
                ", IFSCCode='" + IFSCCode + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
