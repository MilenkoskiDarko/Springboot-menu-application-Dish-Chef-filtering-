package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Chef;
import mk.ukim.finki.wp.lab.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {
//    List<Dish> findAll();
//    Dish findByDishId(String dishId);
//    Optional<Dish> findById(Long id);
//    Dish save(Dish dish);
//    void deleteById(Long id);
//    void toggleLiked(Long id);

    List<Dish> findAllByChefId(Long chefId);
    Optional<Dish> findByDishId(String dishId);

}