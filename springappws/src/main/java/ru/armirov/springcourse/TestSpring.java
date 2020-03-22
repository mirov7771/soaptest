package ru.armirov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.armirov.springcourse.gates.*;

import javax.xml.soap.SOAPException;
import java.util.ArrayList;
import java.util.List;

public class TestSpring {

    private static List<String> musicTypes = new ArrayList<>();
    static {
        musicTypes.add("classicMusicBean");
        //musicTypes.add("rockMusicBean");
    }

    public static void main(String[] args) throws SOAPException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//
//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        String beanName = testBean.getName();
//        System.out.println(beanName);
//
//        //создание musicplayer в ручную
//        for(String i : musicTypes) {
//            Music music = context.getBean(i, Music.class);
//            MusicPlayer musicPlayer = new MusicPlayer(music);
//            musicPlayer.playMusic();
//        }
//
//        //создание musicplayer с dependecy injection
//        MusicPlayer musicPlayerNew = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayerNew.playMusic();
//
//        //создание musicplayer с dependecy injection с использованием сеттера
//        MusicPlayer musicPlayerSetter = context.getBean("newMusicPlayer",MusicPlayer.class);
//        musicPlayerSetter.playMusic();
//
//        //создание musicplayer с dependecy injection с использованием сеттера с данными из конфига
//        MusicPlayer musicPlayerConfig = context.getBean("configMusicPlayer",MusicPlayer.class);
//        musicPlayerConfig.playMusic();
//
//        //создание musicplayer с dependecy injection с использованием сеттера для листа с типом Music
//        MusicPlayer musicPlayerWithList = context.getBean("listMusicPlayer", MusicPlayer.class);
//        musicPlayerWithList.playAllMusic();
//
//        //пример scope singleton
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        firstMusicPlayer.setVolume(50);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        secondMusicPlayer.setVolume(70);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer.toString());
//        System.out.println(secondMusicPlayer.toString());
//        //значения volume у обоих обьектов 70, хотя первому ставили 50, потому что скоуп синглтон
//        //сравнение показало что хоть создали два обьекта, но обьект один и тот же
//        //toString вернул одинаковые хэши обьектов
//
//        //пример scope prototype
//        MusicPlayer firstMusicPlayer2 = context.getBean("musicPlayer2", MusicPlayer.class);
//        firstMusicPlayer2.setVolume(50);
//        MusicPlayer secondMusicPlayer2 = context.getBean("musicPlayer2", MusicPlayer.class);
//        secondMusicPlayer2.setVolume(70);
//        System.out.println(firstMusicPlayer2.getVolume());
//        System.out.println(secondMusicPlayer2.getVolume());
//        boolean comparison2 = firstMusicPlayer2 == secondMusicPlayer2;
//        System.out.println(comparison2);
//        System.out.println(firstMusicPlayer2.toString());
//        System.out.println(secondMusicPlayer2.toString());
//        //значения volume у обоих обьектов разные
//        //сравнение показало что оба обьекта разные, хоть и созданы по одному бину
//        //toString вернул разные хэши обьектов
//
//       ClassicalMusic classicalMusic = context.getBean("classicMusicBean",ClassicalMusic.class);
//
//       //factory-metdho
//        TestFactory testFactory = context.getBean("testFactory",TestFactory.class);
////        testFactory.execute();
//
//        Music rockMusic = context.getBean("rockMusicTest",Music.class);
//        Music classicalMusic = context.getBean("classicalMusicTest", Music.class);
//        System.out.println("Test component: "+rockMusic.play());
//        System.out.println("Test component: "+classicalMusic.play());

        //OkhttpInterface okhttpsync = context.getBean("okhttpsync", OkhttpSyncImpl.class);
        //okhttpsync.call();
        //OkhttpInterface okhttpasync = new OkhttpAsyncImpl();
//        //okhttpasync.call();
//        HttpTest httpTest = context.getBean("httptest", HttpTest.class);
//        httpTest.callAsync();

//        SmsCheckGate smsGate = context.getBean("smsCheckGate", SmsCheckGate.class);
//        smsGate.checkOperator();
        SoapTest soapTest = context.getBean("soapTest", SoapTest.class);
        soapTest.test("http://localhost:8080/dbo-early-repayment/ws/", "<sup:commandtext>testService</sup:commandtext><sup:commanddata>123</sup:commanddata>");
//        MusicPlayer musicPlayer = context.getBean("musicPlayerAuto", MusicPlayer.class);
//        musicPlayer.playClassicMusic();
//        musicPlayer.playMusic();
//        musicPlayer.playRapMusic();
//
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer.toString());
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//
//        //Singleton
//        ClassicalMusic cl1 = context.getBean("classicalMusicTest", ClassicalMusic.class);
//        ClassicalMusic cl2 = context.getBean("classicalMusicTest", ClassicalMusic.class);
//
//        cl1.setId(1);
//        cl2.setId(2);
//
//        System.out.println(cl1.getId());
//        System.out.println(cl2.getId());
//        System.out.println(cl1 == cl2);
//
//        //prototype
//        RapMusic rm1 = context.getBean("rapMusic", RapMusic.class);
//        RapMusic rm2 = context.getBean("rapMusic", RapMusic.class);
//
//        rm1.setId(1);
//        rm2.setId(2);
//
//        System.out.println(rm1.getId());
//        System.out.println(rm2.getId());
//        System.out.println(rm1 == rm2);

        context.close();

    }
}
