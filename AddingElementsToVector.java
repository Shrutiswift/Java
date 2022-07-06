import java.io.*;
import java.util.*;

public class AddingElementsToVector {
    public static void main(String[] args) {
        int n = 5;
        Vector<Integer> vt = new Vector<Integer>(n);
        for (int i = 0; i <= n; n++)
            vt.add(i);
        System.out.println(vt);
        vt.remove(3);
        System.out.println(vt);
        for(int i = 0; i < vt.size(); i++)
            System.out.println(vt.get(i) + " ");
    }
}
