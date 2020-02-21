package pl.mateuszek.testapidocker;

import org.springframework.data.repository.CrudRepository;

interface AnimaRepo extends CrudRepository<Animal, Long> {
    /* tutaj będzie extend CrudReposiotory*/
}
