package bj.highfive.springbootdemo;

import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album,Long> {
    
}
