package com.pradpk.gzipdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/test")
    public List<Alphabet> test() {
        return getAll();
    }


    public List<Alphabet> getAll() {
        List<Alphabet> alphabetList = new ArrayList<Alphabet>();
        alphabetList.add(new Alphabet('a', "Apple"));
        alphabetList.add(new Alphabet('b', "Ball"));
        alphabetList.add(new Alphabet('b', "Cat"));
        alphabetList.add(new Alphabet('d', "Dog"));
        alphabetList.add(new Alphabet('e', "Elephant"));
        alphabetList.add(new Alphabet('f', "Fox"));
        alphabetList.add(new Alphabet('g', "Goat"));
        alphabetList.add(new Alphabet('h', "Hen"));
        alphabetList.add(new Alphabet('i', "India"));
        alphabetList.add(new Alphabet('j', "Jackal"));
        alphabetList.add(new Alphabet('k', "Kite"));
        alphabetList.add(new Alphabet('l', "Lamp"));
        alphabetList.add(new Alphabet('m', "Mouse"));
        alphabetList.add(new Alphabet('n', "Night"));
        alphabetList.add(new Alphabet('o', "Ox"));
        alphabetList.add(new Alphabet('p', "Pig"));
        alphabetList.add(new Alphabet('a', "Apple"));
        alphabetList.add(new Alphabet('b', "Ball"));
        alphabetList.add(new Alphabet('b', "Cat"));
        alphabetList.add(new Alphabet('d', "Dog"));
        alphabetList.add(new Alphabet('e', "Elephant"));
        alphabetList.add(new Alphabet('f', "Fox"));
        alphabetList.add(new Alphabet('g', "Goat"));
        alphabetList.add(new Alphabet('h', "Hen"));
        alphabetList.add(new Alphabet('i', "India"));
        alphabetList.add(new Alphabet('j', "Jackal"));
        alphabetList.add(new Alphabet('k', "Kite"));
        alphabetList.add(new Alphabet('l', "Lamp"));
        alphabetList.add(new Alphabet('m', "Mouse"));
        alphabetList.add(new Alphabet('n', "Night"));
        alphabetList.add(new Alphabet('o', "Ox"));
        alphabetList.add(new Alphabet('p', "Pig"));
        alphabetList.add(new Alphabet('a', "Apple"));
        alphabetList.add(new Alphabet('b', "Ball"));
        alphabetList.add(new Alphabet('b', "Cat"));
        alphabetList.add(new Alphabet('d', "Dog"));
        alphabetList.add(new Alphabet('e', "Elephant"));
        alphabetList.add(new Alphabet('f', "Fox"));
        alphabetList.add(new Alphabet('g', "Goat"));
        alphabetList.add(new Alphabet('h', "Hen"));
        alphabetList.add(new Alphabet('i', "India"));
        alphabetList.add(new Alphabet('j', "Jackal"));
        alphabetList.add(new Alphabet('k', "Kite"));
        alphabetList.add(new Alphabet('l', "Lamp"));
        alphabetList.add(new Alphabet('m', "Mouse"));
        alphabetList.add(new Alphabet('n', "Night"));
        alphabetList.add(new Alphabet('o', "Ox"));
        alphabetList.add(new Alphabet('p', "Pig"));
        alphabetList.add(new Alphabet('a', "Apple"));
        alphabetList.add(new Alphabet('b', "Ball"));
        alphabetList.add(new Alphabet('b', "Cat"));
        alphabetList.add(new Alphabet('d', "Dog"));
        alphabetList.add(new Alphabet('e', "Elephant"));
        alphabetList.add(new Alphabet('f', "Fox"));
        alphabetList.add(new Alphabet('g', "Goat"));
        alphabetList.add(new Alphabet('h', "Hen"));
        alphabetList.add(new Alphabet('i', "India"));
        alphabetList.add(new Alphabet('j', "Jackal"));
        alphabetList.add(new Alphabet('k', "Kite"));
        alphabetList.add(new Alphabet('l', "Lamp"));
        alphabetList.add(new Alphabet('m', "Mouse"));
        alphabetList.add(new Alphabet('n', "Night"));
        alphabetList.add(new Alphabet('o', "Ox"));
        alphabetList.add(new Alphabet('p', "Pig"));
        return alphabetList;
    }
}
