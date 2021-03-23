package uz.pdp.l2v1.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.l2v1.projection.CustomCategory;
import uz.pdp.l2v1.projection.CustomClient;

@RepositoryRestResource(path = "/client", excerptProjection = CustomClient.class)
public interface ClientRepository {




}
