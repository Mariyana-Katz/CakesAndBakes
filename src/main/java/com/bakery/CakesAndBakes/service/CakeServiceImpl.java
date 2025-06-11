package com.bakery.CakesAndBakes.service;

import java.util.List;

import java.util.Optional;
import org.springframework.stereotype.Service;

import com.bakery.CakesAndBakes.entity.Cake;
import com.bakery.CakesAndBakes.exception.CakeNotFoundException;
import com.bakery.CakesAndBakes.repository.CakeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CakeServiceImpl implements CakeService {

    CakeRepository cakeRepository;

    @Override
    public Cake getCake(Long id) {
        Optional<Cake> cake = cakeRepository.findById(id);
        return unwrapCake(cake, id);
    }

    @Override
    public Cake saveCake(Cake cake) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveCake'");
    }

    @Override
    public void deleteCake(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCake'");
    }

    @Override
    public List<Cake> getCakes() {
        return (List<Cake>) cakeRepository.findAll();// because the crudRepository return Iterable<T> we cast is as a
                                                     // List

    }

    // Helper method that handles the Optional and throws an exception if the cake
    // is not found
    static Cake unwrapCake(Optional<Cake> entity, Long id) {
        if (entity.isPresent())
            return entity.get();
        else
            throw new CakeNotFoundException(id);
    }

    // @Override
    // public Cake getCake(String flavor) {
    // List<Cake> cakes = cakeRepository.findByFlavor(flavor);
    // if (cakes == null || cakes.isEmpty()) {
    // throw new CakeNotFoundException(flavor);
    // }
    // return cakes.get(0);
    // }
}
