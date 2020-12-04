package designPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class StringExample {
    private static Map<String, Word> stringMap = new HashMap<>();

    public static Word of(String word){
        if(!stringMap.containsKey(word)){
            stringMap.put(word, new Word(word));
        }
        return stringMap.get(word);
    }
}
