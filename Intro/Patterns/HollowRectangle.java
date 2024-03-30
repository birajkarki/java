package Intro.Patterns;

public class HollowRectangle {
    public static void main (String[]args){
        int rows = 7;
        int columns = 8;
        for (int i = 0;i <rows;i++){
            for (int j = 0;j<columns;j++){
                if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
// || is the logical OR operator. It returns true if at least one of the conditions is true.
// && is the logical AND operator. It returns true only if both conditions are true.
// ! is the logical NOT operator. It reverses the logical state of its operand. If a condition is true, the ! operator makes it false.
