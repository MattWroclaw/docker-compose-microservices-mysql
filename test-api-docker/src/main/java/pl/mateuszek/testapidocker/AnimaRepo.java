package pl.mateuszek.testapidocker;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
interface AnimaRepo extends CrudRepository<Animal, Long> {
    /* tutaj będzie extend CrudReposiotory*/
}
