import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n){
       /**
        PROBLEM
        Given n pairs of parenthesis, write a function to generate all combinations
        of well-formed parenthesis
        **/

        //Generate all possible combinations for given number of pairs
        //Write another function that checks if the combination is valid
            List <String> generated = new ArrayList<>();
            recursiveFunction(generated, "", 0, 0, n);
            return generated;
        }

        public  void recursiveFunction(List<String> generated, String s,int openingPare, int closingPare,  int n){
        if (s.length() == n*2){
            return;
        }
        if (openingPare < n){
            recursiveFunction(generated,  s+ "{",openingPare + 1, closingPare, n);
        }
        if (openingPare > closingPare){
            recursiveFunction(generated,s+ "}", openingPare, closingPare +1, n );
        }
        }
    }
