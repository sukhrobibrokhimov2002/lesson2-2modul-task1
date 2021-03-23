package uz.pdp.l2v1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.l2v1.entity.Category;

@Projection(name = "CustomCategory", types = Category.class)
public interface CustomCategory {
    Integer getId();

    Category getParentCategory();

    String getName();

}
