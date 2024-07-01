package com.gangesh.razorpayifsc.repository;

import com.gangesh.razorpayifsc.entity.BranchIFSC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BranchIFSCRepository extends JpaRepository<BranchIFSC, Long> {
    Optional<BranchIFSC> findByIfsc(String ifsc);
}
