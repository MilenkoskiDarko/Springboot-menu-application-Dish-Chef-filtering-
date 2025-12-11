package mk.ukim.finki.wp.lab.service.impl;

import lombok.RequiredArgsConstructor;
import mk.ukim.finki.wp.lab.model.Chef;
import mk.ukim.finki.wp.lab.model.Dish;
import mk.ukim.finki.wp.lab.repository.ChefRepository;
import mk.ukim.finki.wp.lab.repository.DishRepository;
import mk.ukim.finki.wp.lab.service.ChefService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChefServiceImpl implements ChefService {
    private final ChefRepository chefRepository;
    private final DishRepository dishRepository;

    @Override
    public List<Chef> listChefs() {
        return chefRepository.findAll();
    }

    @Override
    public Chef findById(Long id) {
        Optional<Chef> chefOptional = chefRepository.findById(id);
        return chefOptional.orElse(null);
    }
    @Override // najdi dish i dodaj vo chef
    public Chef addDishToChef(Long chefId, String dishId) {
        Dish d = dishRepository.findByDishId(dishId).get();
        Chef c = findById(chefId);
        c.getDishes().add(d);
        return chefRepository.save(c);
    }
}
