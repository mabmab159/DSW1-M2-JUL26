package com.cibertec.semana4.repositories;

import com.cibertec.semana4.entities.AutoEntity;
import com.cibertec.semana4.models.Auto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAutoRepository extends JpaRepository<AutoEntity, Long>, PagingAndSortingRepository<AutoEntity, Long> {
}
