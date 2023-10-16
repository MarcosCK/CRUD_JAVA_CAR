package Dominio;


import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer {

    private final Integer id;
    private final String name;
    private final String brand;
    private final String model;

}
