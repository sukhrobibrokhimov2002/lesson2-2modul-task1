package uz.pdp.l2v1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.l2v1.entity.Measurement;

@Projection(name = "CustomMeasurement", types = Measurement.class)
public interface CustomMeasurement {
    Integer getId();

    String getName();

    boolean getActive();
}
