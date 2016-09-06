package com.ccsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    String string="++++";
        List<String> res=generatePossibleNextMoves(string);
    }
    //You are playing the following Flip Game with your friend:Given a string that contains only these two
    //characters:+ and -, you an your friend take turns to flip two consecutive "++" into "--"
    //The game ends when a person can  no longer make a move and therefore the other person
    //will be the winner.
    //Write a function to compute all possible states of the string after one valid move.
    public static List<String> generatePossibleNextMoves(String s){
        List<String> result=new ArrayList<>();
        if(s==null||s.length()<2) return result;
        char[] chars=s.toCharArray();
        for (int i = 0; i <= s.length()-2; i++) {       //直叙
            if(chars[i]=='+'&&chars[i+1]==chars[i]){   //遇到两个连续的++，将其变成--
                chars[i]=chars[i+1]='-';
                result.add(new String(chars));
                chars[i]=chars[i+1]='+';               //复原
            }
        }
        return result;
    }
}
