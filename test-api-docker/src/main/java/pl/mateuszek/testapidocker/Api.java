package pl.mateuszek.testapidocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    private AnimaRepo animaRepo;

    @Autowired
    public Api(AnimaRepo animaRepo) {
        this.animaRepo = animaRepo;
        animaRepo.save(new Animal("jamnik"));
    }


    @GetMapping("/animals")
    public Iterable<Animal> getAnimals(){
        return animaRepo.findAll();
    }

    @PostMapping("/animals")
    public void postAnimal(@RequestBody Animal animal){
        animaRepo.save(animal);
    }
}
