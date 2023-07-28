package hr.fer.oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ludaMetoda(0);
    }

    public static int ludaMetoda(int i){
        return ludaMetoda(i+1);
    }
}
