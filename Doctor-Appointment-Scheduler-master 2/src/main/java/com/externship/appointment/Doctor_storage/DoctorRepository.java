package com.externship.appointment.Doctor_storage;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {
    List<Doctor> findByNameContainingIgnoreCase(String name);
    List<Doctor> findBySpecializationContainingIgnoreCase(String specialization);
    List<Doctor> findByCityContainingIgnoreCase(String city);
    List<Doctor> findByStateContainingIgnoreCase(String state);
}
