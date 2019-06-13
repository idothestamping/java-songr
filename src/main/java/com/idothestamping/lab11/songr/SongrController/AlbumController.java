package com.idothestamping.lab11.songr.SongrController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.idothestamping.lab11.songr.Album;
import com.idothestamping.lab11.songr.AlbumRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private AlbumRepo AlbumRepo;

    @GetMapping("/main")
    public String getIndex() {

        return "index";
    }

    // Sample Testing Json:
//    @GetMapping("/album")
//    public @ResponseBody Iterable<Album> getAllalbum() {
//        // This returns a JSON or XML with the users
//        return AlbumRepo.findAll();
//    }

    @GetMapping("/album")
    public String getAllAlbum(Model m) {
        Iterable<Album> albums = AlbumRepo.findAll();
        m.addAttribute("allAlbums", albums);
        return "index";
    }

    @PostMapping("/album")
    public RedirectView addAlbum(String title, String artist, Long songCount, Long length, String imageUrl) {
        Album userInput = new Album(title, artist, songCount, length, imageUrl);
        AlbumRepo.save(userInput);
        return new RedirectView("/album");
    }
}