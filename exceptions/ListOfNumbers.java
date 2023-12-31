package exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(Integer.valueOf(i));
        }
    }

    // public void writeList() {
	// // The FileWriter constructor throws IOException, which must be caught.
    //     PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

    //     for (int i = 0; i < SIZE; i++) {
    //         // The get(int) method throws IndexOutOfBoundsException, which must be caught.
    //         out.println("Value at: " + i + " = " + list.get(i));
    //     }
    //     out.close();
    // }

    public void writeList() {
	// The FileWriter constructor throws IOException, which must be caught.
        PrintWriter out = null;

        try{
            System.out.println("Entered try statement.");
            FileWriter f = new FileWriter("OutFile.txt");
            out = new PrintWriter(f);

            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
            f.close();
        } catch(IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if(out != null) {
                System.out.println("Closing Printwriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
        
        out.close();
    }
}
