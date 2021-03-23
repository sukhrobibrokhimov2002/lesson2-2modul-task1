package uz.pdp.l2v1.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.l2v1.projection.CustomInputProduct;
import uz.pdp.l2v1.projection.CustomProduct;

@RepositoryRestResource(path = "/product", excerptProjection = CustomProduct.class)
public interface ProductRepository {




}
