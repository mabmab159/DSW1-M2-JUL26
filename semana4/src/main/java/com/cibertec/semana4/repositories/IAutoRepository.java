package com.cibertec.semana4.repositories;

import com.cibertec.semana4.entities.AutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAutoRepository extends JpaRepository<AutoEntity, Long>, PagingAndSortingRepository<AutoEntity, Long> {

    //@Query("SELECT a FROM AutoEntity a WHERE a.marca = ?1 and a.modelo = ?2")
    //List<AutoEntity> searchByMarcaAndModelo(String marca, String modelo);

    @Query(value = "SELECT * FROM auto a WHERE a.marca = ?1 and a.modelo = ?2", nativeQuery = true)
    // select * from auto a where a.marca='' and a.modelo=''
    List<AutoEntity> searchByMarcaAndModeloNative(String marca, String modelo);
}
