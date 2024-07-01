package com.gangesh.razorpayifsc.utils;

import com.gangesh.razorpayifsc.dto.RazorPayBranchIFSCDto;
import com.gangesh.razorpayifsc.dto.ResponseBranchIFSCDto;
import com.gangesh.razorpayifsc.entity.BranchIFSC;

public class Converters {

    public static ResponseBranchIFSCDto getResponseBranchIFSCDtoFromRazorPayBranchIFSCDto(RazorPayBranchIFSCDto razorPayBranchIFSCDto) {
        ResponseBranchIFSCDto basicBranchDetails = new ResponseBranchIFSCDto();
        basicBranchDetails.setAddress(razorPayBranchIFSCDto.getADDRESS());
        basicBranchDetails.setBank(razorPayBranchIFSCDto.getBANK());
        basicBranchDetails.setBanckCode(razorPayBranchIFSCDto.getBANKCODE());
        basicBranchDetails.setIFSCCode(razorPayBranchIFSCDto.getIFSC());
        return basicBranchDetails;
    }

    public static ResponseBranchIFSCDto getResponseBranchIFSCDtoFromBranchIFSCEntity(BranchIFSC branchIFSC) {
        ResponseBranchIFSCDto responseBranchIFSCDto = new ResponseBranchIFSCDto();
        responseBranchIFSCDto.setAddress(branchIFSC.getAddress());
        responseBranchIFSCDto.setBank(branchIFSC.getBank());
        responseBranchIFSCDto.setBanckCode(branchIFSC.getBankCode());
        responseBranchIFSCDto.setIFSCCode(branchIFSC.getIfsc());
        return responseBranchIFSCDto;
    }

    public static BranchIFSC getBranchIFSCFromRazorPayBranchIFSCDto(RazorPayBranchIFSCDto razorPayBranchIFSCDto) {
        BranchIFSC branchIFSC = new BranchIFSC();
        branchIFSC.setBankCode(razorPayBranchIFSCDto.getBANKCODE());
        branchIFSC.setCentre(razorPayBranchIFSCDto.getCENTRE());
        branchIFSC.setCity(razorPayBranchIFSCDto.getCITY());
        branchIFSC.setContact(razorPayBranchIFSCDto.getCONTACT());
        branchIFSC.setDistrict(razorPayBranchIFSCDto.getDISTRICT());
        branchIFSC.setImps(razorPayBranchIFSCDto.isIMPS());
        branchIFSC.setIfsc(razorPayBranchIFSCDto.getIFSC());
        branchIFSC.setMicr(razorPayBranchIFSCDto.getMICR());
        branchIFSC.setName(razorPayBranchIFSCDto.getBRANCH());
        branchIFSC.setRtgs(razorPayBranchIFSCDto.isRTGS());
        branchIFSC.setState(razorPayBranchIFSCDto.getSTATE());
        branchIFSC.setAddress(razorPayBranchIFSCDto.getADDRESS());
        branchIFSC.setUpi(razorPayBranchIFSCDto.isUPI());
        branchIFSC.setNeft(razorPayBranchIFSCDto.isNEFT());
        branchIFSC.setIso3166(razorPayBranchIFSCDto.getISO3166());
        branchIFSC.setSwift(razorPayBranchIFSCDto.getSWIFT());
        branchIFSC.setBank(razorPayBranchIFSCDto.getBANK());
        return branchIFSC;
    }
}
