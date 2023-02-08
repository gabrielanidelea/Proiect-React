package ro.tuc.react2023.dtos;

import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import ro.tuc.react2023.entities.Device;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MeasurementDTO  {

    private UUID measurement_id;



    @NotNull
    private LocalDate time;

    @NotNull
    private Double energyConsumption;

    @NotNull
    private UUID deviceDTO;

}
