package test;

import Dominio.Producer;
import repository.ProducerRepository;
import service.ProducerService;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Marcos").brand("Mercedes").model("Gla 200").build();
        Producer producer1 = Producer.builder().id(1).name("Teste").brand("Nissan").model("Nissan Gtr").build();
       // ProducerService.create(producer);
       // ProducerService.update(producer1);
       // ProducerService.delete(4);

    }



}
