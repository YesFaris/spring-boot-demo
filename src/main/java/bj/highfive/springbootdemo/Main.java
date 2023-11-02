package bj.highfive.springbootdemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main (String[ ] args){
        SpringApllication.run(Main.class, args);
    }
    @GetMapping("/albums")
    public List<Album> getAlbums() {
        return generateAlbums();
    }

    private List<Album> generateAlbums() {
        Album album1 = new Album();
        Album album2 = new Album();
        Album album3 = new Album();

        return Arrays.asList(album1, album2, album3);
    }
}
