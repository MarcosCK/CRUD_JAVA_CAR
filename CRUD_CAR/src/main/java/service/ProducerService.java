package service;

import Dominio.Producer;
import repository.ProducerRepository;


public class ProducerService {
    public static void create(Producer producer){
        ProducerRepository.create(producer);
    }

    public static void delete(int id){
        requiredValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer){
        requiredValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static void requiredValidId(Integer id){
        if(id == null || id <= 0){
            throw new IllegalArgumentException("Valor de id invalido");
        }
    }
}
