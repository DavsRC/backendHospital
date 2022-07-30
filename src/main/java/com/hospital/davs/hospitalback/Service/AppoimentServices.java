package com.hospital.davs.hospitalback.Service;

import com.hospital.davs.hospitalback.model.AppoimentDTO;

import java.util.Collection;

public interface AppoimentServices {
    AppoimentDTO create (AppoimentDTO appomentDTO);
    Collection<AppoimentDTO> list(int limit);
    AppoimentDTO get(Long id);
    AppoimentDTO update(Long id);
    Boolean delete (Long id);
}
