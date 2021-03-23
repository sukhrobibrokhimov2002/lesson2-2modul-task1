package uz.pdp.l2v1.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.l2v1.projection.CustomCategory;

@RepositoryRestResource(path = "/category", excerptProjection = CustomCategory.class)
public interface CategoryRepository {




}
