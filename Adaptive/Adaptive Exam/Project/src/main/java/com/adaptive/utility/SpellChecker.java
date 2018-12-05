/**
 *
 * @author mounika,hari
 */
package com.adaptive.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class SpellChecker {
 
        public static Set<String> dictionary = new HashSet<>();
        
        
    public boolean findWord(String word) throws FileNotFoundException, IOException {
        if(dictionary.isEmpty()){
        FileReader dict = new FileReader(new File("C:\\Users\\mouni\\Desktop\\java final\\monicatest\\src\\main\\resources\\words.utf-8.txt"));
        BufferedReader br = new BufferedReader(dict);
        while (br.readLine() != null) {
        dictionary.add(br.readLine());
    }
        }else
        {
            return dictionary.contains(word);
        }
        return false;
    }
}
