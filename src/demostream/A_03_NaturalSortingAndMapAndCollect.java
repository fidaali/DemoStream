/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author denis
 */
public class A_03_NaturalSortingAndMapAndCollect {
    public static void main(String[] args) {
        List<String> myList =
        Arrays.asList("bonjour", "hello", "morgen", "alphonse", "bernadette");

        List<String> result=
    myList
        .stream()
        .map(String::toUpperCase)
        .sorted()
        .collect(Collectors.toList());
        
        for(int i=0;i<result.size();i++){
            String s = result.get(i);
            System.out.println(""+i+" "+s);
        
        }
        {
            System.out.println("--- For Each ");
            result.stream().forEach(e -> System.out.println("for each " +e));
        }
    }    
        
}
