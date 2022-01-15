package lesson2;

public class Task3 {

    public static void main(String[] args){

        int heightSquare= 5;
        int widhtSquare = 5;
        String s = "o";

        for(int i = 0; i < heightSquare; i++) {
            for (int j = 0; j < widhtSquare; j++){
                System.out.print(s);
            }
            System.out.println("");
        }
    }
}
