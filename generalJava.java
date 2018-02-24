
import java.awt.List;
import java.io.*;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class generalJava {

	public static void main(String[] args) {

		String[] strings = { "one", "two", "three" };
		int[] ints = new int[5];
		ArrayList al = new ArrayList(); // generic
		al.add("string");
		al.add(1);
		al.add(true);
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		for (Object obj : al) {
			System.out.println(obj);
		}
		// ArrayList
		int[] ints2 = { 1, 3, 4, 5, 6 };
		ArrayList<Integer> kv = new ArrayList<Integer>();
		ArrayList<Integer> kv2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		kv.add(5);
		kv.add(3);
		kv.remove(0); // index 0
		kv.get(0); // get index 0
		kv.addAll(kv2);
		kv.isEmpty();
		kv.set(0, 5);// set index 0 to 5
		System.out.println(kv);// prints array on one line
		int[] array = { 1, 2, 3 }; // int[] to Integer ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>(array.length);
		for (int i = 0; i < array.length; i++)
			list.add(Integer.valueOf(array[i]));

		// HashMap - unordered
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("key", 6);
		System.out.println(hmap.get("key"));
		hmap.containsKey("hmmm");
		hmap.values();
		hmap.keySet();
		hmap.clear();

		// TreeMap - ordered by keys
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
		tmap.put("key", 6);
		System.out.println(hmap.get("key"));
		tmap.containsKey("hmmm");
		tmap.values();
		tmap.keySet();
		tmap.clear();

		// HashSet - unordered Set
		HashSet<Integer> hs = new HashSet<>();
		hs.add(5);
		hs.add(5);// returns true if set did not already contain element
		hs.remove(5);// remove element
		hs.clear();

		// TreeSet - ordered Set
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(5);
		ts.add(5);// returns true if set did not already contain element
		ts.remove(5);// remove element
		ts.clear();

		// Queue interface
		Queue q1 = new LinkedList();
		Queue q2 = new PriorityQueue();
		Queue<String> q = new LinkedList<String>();
		// Adding elements to the Queue
		q.add("Negan");
		q.add("Daryl");
		q.remove();// removes first element
		q.element();// first element
		q.poll();// removes first element and returns
		q.peek();// returns first element but doesnt remove

		// Basic try/catch
		/*
		 * try { int x = 5/0; } catch (ArithmeticException e) { e.printStackTrace(); }
		 * //make your own error message (also multiple catch) try { int x = 5/0; }
		 * catch (ArithmeticException e) { throw new
		 * ArithmeticException("divided by 0"); } catch (InputMismatchException e) {
		 * throw new InputMismatchException("somehow got input mismatch error haha"); }
		 * 
		 * try { int x = 5/0; } catch (ArithmeticException | InputMismatchException e) {
		 * System.out.println(e.toString()); }
		 */
		// FileWriter
		String[] text = { "Hello world", "leoloelg" };
		BufferedWriter output = null;
		try {
			File file = new File("example.txt");
			output = new BufferedWriter(new FileWriter(file));
			for (String str : text) {
				output.write(str + System.lineSeparator());// string then new line
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		// FileReader
		Scanner in;
		try {
			in = new Scanner(new FileReader("example.txt"));
			/*
			 * space separated while (in.hasNext()) { System.out.println(in.next()); }
			 */
			// line separated
			while (in.hasNextLine()) {
				System.out.println(in.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread thread = new Thread(new ExampleThread(5));
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static class Example implements Runnable {
		int param;

		Example(int param) {
			this.param = param;
		}

		@Override
		public void run() {
			for (int i = 0; i < this.param; i++) {
				System.out.println("iterating: " + i);
			}

		}
	}

}
