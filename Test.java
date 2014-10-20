public class Test {
    public static void main(String[] args){
//        boolean x = doubleX("!x!!x!x!x!");
//        boolean y = doubleX("!x!x!x!x!");
//        System.err.println(x);
//        System.err.println(y);
        
        int a = 2, b = 3, c = 5;
        
        String history = "";
        if(a*b < c){history += "p";}
        else if(a*b>c){history += "r";}
        else if ((b+a) != 5){history +="booya";}
        if(5==5){history += "foo";}
        
        System.err.println(history);
    }

//    static boolean doubleX(String str){
//        boolean temp = false;
//        int firstX = str.indexOf('x');
//
//        if( str.charAt(firstX+1) == '!' && str.charAt(firstX+2) == '!'){
//            temp = true;
//        }
//        return temp;
    //}
}
