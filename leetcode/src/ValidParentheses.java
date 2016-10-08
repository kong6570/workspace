import java.util.Stack;

/**
 * Created by zhangjingzhuan on 2016/10/8.
 */
public class ValidParentheses {
    public boolean isValid(String s){
        s = s.trim();
        int length = s.length();
        if(s == null || length == 0){
            return true;
        }
        if(length == 1){
            return  false;
        }
        int i = 0;
        boolean result = true;
        Stack<String> stack = new Stack<String>();
        char temp;
        while (i<length){
            temp = s.charAt(i);
            switch (temp){
                case '{':
                case '[':
                case '(':stack.push(String.valueOf(temp));break;
                case '}':if(!check(stack,"{")){
                            result = false;
                         }
                         break;
                case ']':if(!check(stack,"[")){
                            result = false;
                         }
                         break;
                case ')':if(!check(stack,"(")){
                            result = false;
                         }
                         break;
                default:result = false;
                    break;
            }
            if(!result){
                break;
            }
            i++;
        }
        if(!stack.empty()){
            result = false;
        }
        return result;
    }

    public boolean check(Stack<String> stack, String left){
        if(stack.empty() || !stack.pop().equals(left)){
            return false;
        }
        return  true;
    }

    public static void main(String[] args) {
        ValidParentheses test = new ValidParentheses();
        String s = "{{ }}";
        System.out.println(test.isValid(s));
    }
}
