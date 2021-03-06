import java.io.*;
import java.util.*;

public class mergesort {
    private ArrayList<Integer> randNums = new ArrayList<Integer>();

    public mergesort(){
    }
    
    public mergesort(int listLen, int greatestInt) {
	Random r = new Random();
	for (int i = 0; i < listLen; i++) {
	    randNums.add(r.nextInt(greatestInt));
	}
    }

    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	ArrayList<Integer> sorted = new ArrayList<Integer>();
	int iA = 0;
	int iB = 0;
	while (iA < a.size() || iB < b.size()) {
	    if (iB == b.size() && iA < a.size()) {
		sorted.add(a.get(iA));
		iA++;
	    } else if (iA == a.size() && iB < b.size()) {
		sorted.add(b.get(iB));
		iB++;
	    } else if (a.get(iA) <= b.get(iB)) {
		sorted.add(a.get(iA));
		iA++;
	    } else if (b.get(iB) <= a.get(iA)) {
		sorted.add(b.get(iB));
		iB++;
	    }
	}
	return sorted;
    }

    public ArrayList<Integer> msort(ArrayList<Integer> a) {
	//ArrayList<Integer> sorted = new ArrayList<Integer>();
	ArrayList<Integer> half1 = new ArrayList<Integer>();
	ArrayList<Integer> half2 = new ArrayList<Integer>();
	if (a.size() <= 1) {
	    return a;
	} else {
	    for (int i = 0; i < a.size(); i++) {
		if (i < a.size() / 2) {
		    half1.add(a.get(i));
		} else {
		    half2.add(a.get(i));
		}
	    }
	    ArrayList<Integer> r1 = msort(half1);
	    ArrayList<Integer> r2 = msort(half2);
	    return merge(r1, r2);
	}
    }	

    public ArrayList<Integer> msortspeed() {
	return msort(randNums);
    }
	    
    public static void main(String[] args) {
	mergesort m = new mergesort();
	// -- Testing merge function --
	ArrayList<Integer> test1 = new ArrayList<Integer>();
	ArrayList<Integer> test2 = new ArrayList<Integer>();
	for (int i = 0; i < 5; i++) {
	    test1.add(i);
	    test2.add(i);
	}
	test1.add(7);
	test1.add(9);
	test2.add(5);
	test2.add(6);
	System.out.println("List 1: " + test1);
	System.out.println("List 2: " + test2);
	System.out.println("After merging L1 and L2: " + m.merge(test1, test2));
	// -- Testing msort funstion --
	ArrayList<Integer> randNums = new ArrayList<Integer>();
	for (int i = 0; i < 20; i++) {
	    Random r = new Random();
	    randNums.add(r.nextInt(10));
	}
	System.out.println("Before msort: " + randNums);
	System.out.println("After msort: " + m.msort(randNums));
    }
}

    
