package uz.pdp.l2v1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.l2v1.entity.Currency;

@Projection(name = "CustomCurreny", types = Currency.class)
public interface CustomCurrency {
    Integer getId();

    String getName();
}
