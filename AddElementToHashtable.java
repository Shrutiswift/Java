import java.util.*;
import java.io.*;
public class AddElementToHashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> hs = new Hashtable<Integer,String>();
        hs.put(1, "Kaushal"); //remove Kaushal
        hs.put(2, "Kaus");
        hs.remove(1);
        System.out.println(hs);
    }
}
