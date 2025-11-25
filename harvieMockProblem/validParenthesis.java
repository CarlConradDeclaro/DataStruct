package harvieMockProblem;

import java.util.Stack;

public class validParenthesis {

    static boolean isValidParenthesis(String s){

       
          Stack<Character> st = new Stack<>();

          for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            
            if(st.isEmpty()){
              st.push(c);
              continue;
            }

            if(st.peek() == '(' && c == ')'){
                st.pop();
            }else if(st.peek() == '{' && c == '}'){
                st.pop();
            }else if(st.peek() == '[' && c == ']'){
                st.pop();
            }else st.push(c);

         
        }
         return st.isEmpty();
    }
    public static void main(String[] args) {
         String s = "({[]})";

         System.out.println(isValidParenthesis(s));
    }
}
