package com.PabloJimenez07.whereIsThat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.PabloJimenez07.whereIsThat.model.Localizacion;

public interface LocalizacionRepository extends JpaRepository<Localizacion, Long> {

}