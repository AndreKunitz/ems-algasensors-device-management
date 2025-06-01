package com.akunitz.algasensors.device.management.domain.repository;

import com.akunitz.algasensors.device.management.domain.model.Sensor;
import com.akunitz.algasensors.device.management.domain.model.SensorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, SensorId> {
}
