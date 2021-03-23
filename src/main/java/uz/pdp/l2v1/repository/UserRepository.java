package uz.pdp.l2v1.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.l2v1.projection.CustomClient;
import uz.pdp.l2v1.projection.CustomUser;

@RepositoryRestResource(path = "/user", excerptProjection = CustomUser.class)
public interface UserRepository {




}
