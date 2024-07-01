package com.gangesh.razorpayifsc.service;


import com.gangesh.razorpayifsc.dto.RazorPayBranchIFSCDto;
import com.gangesh.razorpayifsc.dto.ResponseBranchIFSCDto;
import com.gangesh.razorpayifsc.entity.BranchIFSC;
import com.gangesh.razorpayifsc.repository.BranchIFSCRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

import static com.gangesh.razorpayifsc.utils.Converters.getBranchIFSCFromRazorPayBranchIFSCDto;
import static com.gangesh.razorpayifsc.utils.Converters.getResponseBranchIFSCDtoFromBranchIFSCEntity;

@Service
public class IFSCService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private BranchIFSCRepository ifscRepository;

    public ResponseBranchIFSCDto getBranchDetails(String ifsc) {
        //mysql
        Optional<BranchIFSC> byIFSC = ifscRepository.findByIfsc(ifsc);
        BranchIFSC branchIFSC;
        if (byIFSC.isPresent()) {
            branchIFSC = byIFSC.get();
        } else {
            String url = "https://ifsc.razorpay.com/{ifsc}";
            ResponseEntity<RazorPayBranchIFSCDto> response = restTemplate.exchange(url, HttpMethod.GET, null, RazorPayBranchIFSCDto.class, ifsc);
            log.info("StatusCode :: {}", response.getStatusCode());
            log.info("Response body {}", response.getBody());
            RazorPayBranchIFSCDto razorPayBranchIFSCDto = response.getBody();
            branchIFSC = getBranchIFSCFromRazorPayBranchIFSCDto(razorPayBranchIFSCDto);
            log.info(("BranchIFSC object :: {}"), branchIFSC);
            ifscRepository.save(branchIFSC);
        }
        return getResponseBranchIFSCDtoFromBranchIFSCEntity(branchIFSC);
    }

    private RazorPayBranchIFSCDto getRazorPayBranchIFSCDto(String ifsc) {
        String url = "https://ifsc.razorpay.com/{ifsc}";
        ResponseEntity<RazorPayBranchIFSCDto> response = restTemplate.exchange(url, HttpMethod.GET, null, RazorPayBranchIFSCDto.class, ifsc);
        log.info("StatusCode :: {}", response.getStatusCode());
        log.info("Response body {}", response.getBody());
        return response.getBody();
    }

}
