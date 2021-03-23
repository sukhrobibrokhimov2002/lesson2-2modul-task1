package uz.pdp.l2v1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.l2v1.entity.Client;
import uz.pdp.l2v1.entity.Currency;
import uz.pdp.l2v1.entity.Output;
import uz.pdp.l2v1.entity.WareHouse;

import java.util.Date;

@Projection(name = "CustomOutput", types = Output.class)
public interface CustomOutput {
    Date getDate();

    WareHouse getWareHouse();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();

    Client getClient();
}
