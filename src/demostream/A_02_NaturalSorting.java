/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostream;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author denis
 */
public class A_02_NaturalSorting {
    
    public static void main(String[] args) {
        List<String> myList =
        Arrays.asList("bonjour", "hello", "morgen", "alphonse", "bernadette");

    myList
        .stream()
        .sorted()
        .forEach(System.out::println);
    }    
    
}
