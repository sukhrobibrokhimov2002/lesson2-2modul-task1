package uz.pdp.l2v1.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.l2v1.projection.CustomInputProduct;
import uz.pdp.l2v1.projection.CustomMeasurement;

@RepositoryRestResource(path = "/measurement", excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository {




}
