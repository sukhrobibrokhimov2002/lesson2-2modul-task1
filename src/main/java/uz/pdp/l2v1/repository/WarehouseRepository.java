package uz.pdp.l2v1.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.l2v1.projection.CustomClient;
import uz.pdp.l2v1.projection.CustomWarehouse;

@RepositoryRestResource(path = "/warehouse", excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository {




}
