package ro.tuc.react2023.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.tuc.react2023.entities.Device;

import java.util.UUID;

@Repository

public interface DeviceRepository extends JpaRepository<Device, UUID> {
}
