package com.gangesh.razorpayifsc.dto;

public class RazorPayBranchIFSCDto {
    private String BRANCH;
    private String CENTRE;
    private String DISTRICT;
    private String STATE;
    private String ADDRESS;
    private String CONTACT;
    private boolean IMPS;
    private String CITY;
    private boolean UPI;
    private String MICR;
    private boolean RTGS;
    private boolean NEFT;
    private String SWIFT;
    private String ISO3166;
    private String BANK;
    private String BANKCODE;
    private String IFSC;

    public RazorPayBranchIFSCDto(String BRANCH, String CENTRE, String DISTRICT, String STATE, String ADDRESS, String CONTACT, boolean IMPS, String CITY, boolean UPI, String MICR, boolean RTGS, boolean NEFT, String SWIFT, String ISO3166, String BANK, String BANKCODE, String IFSC) {
        this.BRANCH = BRANCH;
        this.CENTRE = CENTRE;
        this.DISTRICT = DISTRICT;
        this.STATE = STATE;
        this.ADDRESS = ADDRESS;
        this.CONTACT = CONTACT;
        this.IMPS = IMPS;
        this.CITY = CITY;
        this.UPI = UPI;
        this.MICR = MICR;
        this.RTGS = RTGS;
        this.NEFT = NEFT;
        this.SWIFT = SWIFT;
        this.ISO3166 = ISO3166;
        this.BANK = BANK;
        this.BANKCODE = BANKCODE;
        this.IFSC = IFSC;
    }

    public RazorPayBranchIFSCDto() {

    }

    public String getBRANCH() {
        return BRANCH;
    }

    public void setBRANCH(String BRANCH) {
        this.BRANCH = BRANCH;
    }

    public String getCENTRE() {
        return CENTRE;
    }

    public void setCENTRE(String CENTRE) {
        this.CENTRE = CENTRE;
    }

    public String getDISTRICT() {
        return DISTRICT;
    }

    public void setDISTRICT(String DISTRICT) {
        this.DISTRICT = DISTRICT;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getCONTACT() {
        return CONTACT;
    }

    public void setCONTACT(String CONTACT) {
        this.CONTACT = CONTACT;
    }

    public boolean isIMPS() {
        return IMPS;
    }

    public void setIMPS(boolean IMPS) {
        this.IMPS = IMPS;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public boolean isUPI() {
        return UPI;
    }

    public void setUPI(boolean UPI) {
        this.UPI = UPI;
    }

    public String getMICR() {
        return MICR;
    }

    public void setMICR(String MICR) {
        this.MICR = MICR;
    }

    public boolean isRTGS() {
        return RTGS;
    }

    public void setRTGS(boolean RTGS) {
        this.RTGS = RTGS;
    }

    public boolean isNEFT() {
        return NEFT;
    }

    public void setNEFT(boolean NEFT) {
        this.NEFT = NEFT;
    }

    public String getSWIFT() {
        return SWIFT;
    }

    public void setSWIFT(String SWIFT) {
        this.SWIFT = SWIFT;
    }

    public String getISO3166() {
        return ISO3166;
    }

    public void setISO3166(String ISO3166) {
        this.ISO3166 = ISO3166;
    }

    public String getBANK() {
        return BANK;
    }

    public void setBANK(String BANK) {
        this.BANK = BANK;
    }

    public String getBANKCODE() {
        return BANKCODE;
    }

    public void setBANKCODE(String BANKCODE) {
        this.BANKCODE = BANKCODE;
    }

    public String getIFSC() {
        return IFSC;
    }

    public void setIFSC(String IFSC) {
        this.IFSC = IFSC;
    }

    @Override
    public String toString() {
        return "RazorPayBranchIFSCDto{" +
                "BRANCH='" + BRANCH + '\'' +
                ", CENTRE='" + CENTRE + '\'' +
                ", DISTRICT='" + DISTRICT + '\'' +
                ", STATE='" + STATE + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", CONTACT='" + CONTACT + '\'' +
                ", IMPS=" + IMPS +
                ", CITY='" + CITY + '\'' +
                ", UPI=" + UPI +
                ", MICR='" + MICR + '\'' +
                ", RTGS=" + RTGS +
                ", NEFT=" + NEFT +
                ", SWIFT='" + SWIFT + '\'' +
                ", ISO3166='" + ISO3166 + '\'' +
                ", BANK='" + BANK + '\'' +
                ", BANKCODE='" + BANKCODE + '\'' +
                ", IFSC='" + IFSC + '\'' +
                '}';
    }
}
