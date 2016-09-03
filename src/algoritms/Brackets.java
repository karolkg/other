package algoritms;

import java.util.Stack;

public class Brackets {
  
  public int solution(String S) {
    int[] counter = new int[6];
 //   int pointer = -1;
    Stack<Character> stack = new Stack<>();
    
    for(int i = 0; i < S.length(); i++) {
                    
        char c = S.charAt(i);
        switch(c) {
            case '(': counter[0]++;
     //               pointer++;
                    stack.push(c);
                    break;
                    
            case '{':counter[1]++;
  //                  pointer++;
                    stack.push(c);
                    break;
                    
            case '[': counter[2]++;
   //                 pointer++;
                    stack.push(c);
                    break;
                    
            case ')': if(counter[3] < counter[0] && stack.peek() == '(') {
                        counter[3]++;
    //                    pointer--;
                        stack.pop();
                        break;
                        }
                    else return 0;
                    
            case '}': if(counter[4] < counter[1] && stack.peek() == '{') {
                        counter[4]++;
    //                    pointer--;
                        stack.pop();
                        break;
                        }
                        else return 0;
                        
            case ']': if(counter[5] < counter[2] && stack.peek() == '[') {
                        counter[5]++;
     //                   pointer--;
                        stack.pop();
                        break;
                        }
                        else       
                          return 0;
                        
            default: return 0;
        }
    } //end for loop  
    if(counter[0] == counter[3] &&
       counter[1] == counter[4] &&
       counter[2] == counter[5]) {
           return 1;
       }
       else {
           return 0;
       }
  }

  public static void main(String[] args) {
   Brackets b =  new Brackets();
   System.out.println(b.solution("({[]})"));
   System.out.println(b.solution("({{({}[]{})}}[]{})"));

  }

}
