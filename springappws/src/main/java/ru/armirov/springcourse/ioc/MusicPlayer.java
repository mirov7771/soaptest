package ru.armirov.springcourse.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Пример паттерна Inversion of Control
 */
@Component("musicPlayerAuto")
public class MusicPlayer {

    @Autowired
    @Qualifier("rockMusicTest")
    private Music music;

    private Music music2;

    private ClassicalMusic classicalMusic;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(){

    }

    @Autowired
    private RapMusic rapMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusicTest") Music music){
        this.music2 = music;
    }

    @Autowired
    public void setClassicalMusic(ClassicalMusic classicalMusic){
        this.classicalMusic = classicalMusic;
    }

    public void setMusic(Music music){
        this.music = music;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList){
        this.musicList = musicList;
    }

    public void playMusic(){
        String m = music.play();
        if (this.name == null)
            System.out.println(m);
        else
            System.out.println(m+" "+this.name+" "+this.volume);
        System.out.println(music2.play());
    }

    public void playAllMusic(){
        StringBuilder songs = new StringBuilder();
        int i = 1;
        for(Music music : musicList){
            songs.append(i).append(". ").append(music.play()).append("\r\n");
            i++;
        }
        System.out.println(songs.toString());
    }

    public void playClassicMusic(){
        System.out.println("Autowired: "+classicalMusic.play());
    }

    public void playRapMusic(){
        rapMusic.playRapSong();
    }

    public String playSomeMusic(){
        return classicalMusic.play();
    }
}
