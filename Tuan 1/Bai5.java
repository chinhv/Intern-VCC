/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap;

import java.util.*;

/**
 *
 * @author TT
 */
public class Bai5 {
    public List<String> wordBreak(String s, List<String> wordDict){
        Map<String, List<String>> memo = new HashMap<>();
        return wordBreakHelper(s, wordDict, memo);
    }
    
    private List<String> wordBreakHelper(String s, List<String> wordDict, Map<String, List<String>> memo){
        if(memo.containsKey(s)){
            return memo.get(s);
        }
        List<String> result = new ArrayList<>();
        if(s.isEmpty()){
            result.add("");
            return result;
        }
        
        for(String word : wordDict){
            if(s.startsWith(word)){
                List<String> subList = wordBreakHelper(s.substring(word.length()), wordDict, memo);
                for(String sub : subList){
                    String optional = sub.isEmpty() ? "" : " ";
                    result.add(word + optional + sub);
                }
            }
        }
        
        memo.put(s, result);
        return result;
    }
    
    public static void main(String[] args) {
        Bai5 bai5 = new Bai5();
        String s = "catsanddog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
       
        
        List<String> result = bai5.wordBreak(s, wordDict);
        for(String x : result){
            System.out.println(x);
        }
    }
}
