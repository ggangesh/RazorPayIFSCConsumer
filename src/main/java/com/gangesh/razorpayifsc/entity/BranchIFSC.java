package com.gangesh.razorpayifsc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "branchifsc")
public class BranchIFSC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String centre;
    @Column
    private String district;
    @Column
    private String state;
    @Column
    private String address;
    @Column
    private String contact;
    @Column
    private boolean imps;
    @Column
    private String city;
    @Column
    private boolean upi;
    @Column
    private String micr;
    @Column
    private boolean rtgs;
    @Column
    private boolean neft;
    @Column
    private String swift;
    @Column
    private String iso3166;
    @Column
    private String bank;
    @Column
    private String bankCode;
    @Column
    private String ifsc;

    public BranchIFSC(Long id, String name, String centre, String district, String state, String address, String contact, boolean imps, String city, boolean upi, String micr, boolean rtgs, boolean neft, String swift, String iso3166, String bank, String bankCode, String ifsc) {
        this.id = id;
        this.name = name;
        this.centre = centre;
        this.district = district;
        this.state = state;
        this.address = address;
        this.contact = contact;
        this.imps = imps;
        this.city = city;
        this.upi = upi;
        this.micr = micr;
        this.rtgs = rtgs;
        this.neft = neft;
        this.swift = swift;
        this.iso3166 = iso3166;
        this.bank = bank;
        this.bankCode = bankCode;
        this.ifsc = ifsc;
    }

    public BranchIFSC(String name, String centre, String district, String state, String address, String contact, boolean imps, String city, boolean upi, String micr, boolean rtgs, boolean neft, String swift, String iso3166, String bank, String bankCode, String ifsc) {
        this.name = name;
        this.centre = centre;
        this.district = district;
        this.state = state;
        this.address = address;
        this.contact = contact;
        this.imps = imps;
        this.city = city;
        this.upi = upi;
        this.micr = micr;
        this.rtgs = rtgs;
        this.neft = neft;
        this.swift = swift;
        this.iso3166 = iso3166;
        this.bank = bank;
        this.bankCode = bankCode;
        this.ifsc = ifsc;
    }

    public BranchIFSC() {

    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCentre() {
        return centre;
    }

    public void setCentre(String centre) {
        this.centre = centre;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public boolean isImps() {
        return imps;
    }

    public void setImps(boolean imps) {
        this.imps = imps;
    }

    public String getCity() {
        return city;
    }

    public boolean isUpi() {
        return upi;
    }

    public void setUpi(boolean upi) {
        this.upi = upi;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMicr() {
        return micr;
    }

    public void setMicr(String micr) {
        this.micr = micr;
    }

    public boolean isRtgs() {
        return rtgs;
    }

    public void setRtgs(boolean rtgs) {
        this.rtgs = rtgs;
    }

    public boolean isNeft() {
        return neft;
    }

    public void setNeft(boolean neft) {
        this.neft = neft;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    public String getIso3166() {
        return iso3166;
    }

    public void setIso3166(String iso3166) {
        this.iso3166 = iso3166;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    @Override
    public String toString() {
        return "BranchIFSC{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", centre='" + centre + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", imps=" + imps +
                ", city='" + city + '\'' +
                ", upi=" + upi +
                ", micr='" + micr + '\'' +
                ", rtgs=" + rtgs +
                ", neft=" + neft +
                ", swift='" + swift + '\'' +
                ", iso3166='" + iso3166 + '\'' +
                ", bank='" + bank + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", ifsc='" + ifsc + '\'' +
                '}';
    }
}
