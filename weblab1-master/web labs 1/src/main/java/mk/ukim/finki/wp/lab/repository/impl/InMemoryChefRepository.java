//package mk.ukim.finki.wp.lab.repository.impl;
//
//import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
//import mk.ukim.finki.wp.lab.model.Chef;
//import mk.ukim.finki.wp.lab.repository.ChefRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//@Repository
//public class InMemoryChefRepository implements ChefRepository {
//    @Override
//    public List<Chef> findAll() {
//        return DataHolder.chefs;
//    }
//
//    @Override
//    public Optional<Chef> findById(Long id) {
//        for (Chef chef : DataHolder.chefs){
//            if (chef.getId().equals(id)){
//                return Optional.of(chef);
//            }
//        }
//        return Optional.empty();
//    }
//
//    @Override
//    public Chef save(Chef chef) {
//        for (Chef chef1 : DataHolder.chefs){
//            if (chef1.getId().equals(chef.getId())){
//                chef1.setFirstName(chef.getFirstName());
//                chef1.setBio(chef.getBio());
//                chef1.setLastName(chef.getLastName());
//                chef1.setDishes(chef.getDishes());
//                return chef1;
//            }
//        }
//        DataHolder.chefs.add(chef);
//        return chef;
//    }
//}
