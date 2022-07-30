package com.hospital.davs.hospitalback.way;

import com.hospital.davs.hospitalback.model.AppoimentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ServerMysql extends JpaRepository<AppoimentDTO, Long> {
    Optional<AppoimentDTO> findById(Long id);
}
