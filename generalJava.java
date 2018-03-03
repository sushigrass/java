import java.util.*;
import java.io.*;

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
		int[] array = { 1, 4, 3 }; // int[] to Integer ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>(array.length);
		for (int i = 0; i < array.length; i++)
			list.add(Integer.valueOf(array[i])+10000);
		//Iterator
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ArrayList<String> al3=new ArrayList<String>();
	  al3.add("Ravi");
	  al3.add("Vijay");
	  al3.add("Ajay");
	  ArrayList<String> al2=new ArrayList<String>();
	  al2.add("Sonoo");
	  al2.add("Hanumat");
	  al3.addAll(al2);//adding second list in first list

		//AD ALL adAll
	  Iterator itr2=al3.iterator();
	  while(itr2.hasNext()){
	   System.out.println(itr2.next());
	  }
		//addAll add All
		List<String> list3 = new ArrayList<String>();
    list3.add("C");
    list3.add("Core Java");
    list3.add("Advance Java");
    System.out.println("Initial collection value:"+list3);
    Collections.addAll(list3, "Servlet","JSP");
    System.out.println("After adding elements collection value:"+list3);
    String[] strArr = {"C#", ".Net"};
    Collections.addAll(list3, strArr);
    System.out.println("After adding array collection value:"+list3);

		//RemoveAll remove all
		ArrayList<String> al4=new ArrayList<String>();
	  al4.add("Ravi");
	  al4.add("Vijay");
	  al4.add("Ajay");
	  ArrayList<String> al5=new ArrayList<String>();
	  al5.add("Ravi");
	  al5.add("Hanumat");
	  al4.removeAll(al5);
	  System.out.println("iterating the elements after removing the elements of al2...");
	  Iterator itr3=al4.iterator();
	  while(itr3.hasNext()){
	   System.out.println(itr3.next());
    }

		//RetainAll retain all
		ArrayList<String> al6=new ArrayList<String>();
	  al6.add("Ravi");
	  al6.add("Vijay");
	  al6.add("Ajay");
	  ArrayList<String> al7=new ArrayList<String>();
	  al7.add("Ravi");
	  al7.add("Hanumat");
	  al6.retainAll(al2);
	  System.out.println("iterating the elements after retaining the elements of al2...");
	  Iterator itr4=al6.iterator();
	  while(itr4.hasNext()){
	   System.out.println(itr4.next());
	  }

		// HashMap - unordered
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("key", 6);
		hmap.put("keyg", 1);
		hmap.put("jeye", 3);
		hmap.put("geye", 4);
		hmap.put("eeye", 6);
		hmap.put("weye", 6);
		System.out.println(hmap.get("key"));
		hmap.containsKey("hmmm");
		//hmap.values();
		//hmap.keySet();
		//hmap.clear();
		List<Integer> list7 = new ArrayList<Integer>();
    list7.add(46);
    list7.add(67);
    list7.add(24);
    list7.add(16);
    list7.add(8);
    list7.add(12);
    System.out.println("Value of maximum element from the collection: "+Collections.max(list7));
		System.out.println("Value of min element from the collection: "+Collections.min(list7));

		//Collections sorting sort strings
		ArrayList<String> al8=new ArrayList<String>();
		al8.add("Viru");
		al8.add("Saurav");
		al8.add("Mukesh");
		al8.add("Tahir");



		Collections.sort(al8);
		Iterator itr5=al8.iterator();
		while(itr5.hasNext()){
			System.out.println(itr5.next());
		}

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
