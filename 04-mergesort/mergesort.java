import java.io.*;
import java.util.*;

public class mergesort {
    private Arraylist<Integer> deck = new Arraylist<Integer>;
    private Arraylist<Integer> a = new Arraylist<Integer>;
    private Arraylist<Integer> b = new Arraylist<Integer>;

    public mergesort() {
	Random r = new Random();
	for (int i = 0; i < 5; i++) {
	    a.add(r.nextInt(10));
	    b.add(r.nextInt(10));
	}
    }

    public Arraylist<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	
	if (a.size <= 1) return a;
	if (b.size <= 1) return b;
	
    }

    
