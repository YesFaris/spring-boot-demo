package bj.highfive.springbootdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping(path="/api")
public class AlbumController {
    @Autowired 
    AlbumRepository albumRepository;
    
    //Create 
    public Album createAlbum(Album album){
        return this.albumRepository.save(album);
    }
    // public List<Album> createAlbums (List<Album> albums){
    //     return this.albumRepository.saveAll(albums);
    // }
// Update
public Album updAlbum(Long id){
    Album existingAlbum = this.albumRepository.findById(album.getId()).orElse(null);
    existingAlbum.setRef(album.getRef());
    existingAlbum.setName(album.getName());
    existingAlbum.setTitle(album.getTitle());
    existingAlbum.setDescription(album.getDescription());
    existingAlbum.setDuration(album.getDuration());
    existingAlbum.setStatus(album.getStatus());
    existingAlbum.setUrl(album.getUrl());
    existingAlbum.setTags(album.getTags());
    existingAlbum.setLike(album.getLike());

    return this.albumRepository.save(existingAlbum);
}
// Delete
@DeleteMapping("/albums/{id}")
public String deleteAlbum(Long id){
    this.albumRepository.deleteById(id);
    return "Album supprimé:" + id;
}

    @PostMapping(path = "/albums")
    public Iterable<Album>getAlbums(){
        return this.albumRepository.findAll();
    }
    public Album getAlbumById(Long id){
        return this.albumRepository.findById(id).orElse(null);
    }
}