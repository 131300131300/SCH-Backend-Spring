package com.smithpalacehotel.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.smithpalacehotel.models.*;

@Repository
public interface ReservaEventoRepository extends JpaRepository<ReservaEvento, Integer>{ 
}