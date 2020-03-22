package ru.armirov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import ru.armirov.springcourse.services.Service;

import java.util.Map;

public class TestBean {

    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
