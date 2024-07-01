package com.gangesh.razorpayifsc.controller;

import com.gangesh.razorpayifsc.dto.ResponseBranchIFSCDto;
import com.gangesh.razorpayifsc.service.IFSCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class IFSCController {

    @Autowired
    private IFSCService ifscService;

    @GetMapping("/ifsc/{ifsc}")
    public ResponseEntity<ResponseBranchIFSCDto> getBranch(@PathVariable String ifsc){
        ResponseBranchIFSCDto branchDetails = ifscService.getBranchDetails(ifsc);
        return new ResponseEntity<>(branchDetails, HttpStatus.OK);
    }
}
