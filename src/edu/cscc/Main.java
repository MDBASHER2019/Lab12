package edu.cscc;

import java.io.File;
import java.util.Set;

/**
 * Utility to process a document to into sorted set of unique words
 * @author MD BASHER
 * Date: 11/23/2019
 * ProjectName: CSCI-2467 Lab 12 – Finding Unique Words in a Document
 * SourceNote:
 * The copyright for the novella has expired and is now in the public domain. We will use this text as input to process
 * ...and will print a unique list of all the words in the document sorted in alphabetical order.
 * Assignment Download the Lab12.zip starter file. Use 7zip to unzip the file using ‘Extract Here’. Open the project folder in IntelliJ.
 * In the UniqueWords class, you will implement the processDocument() method that will read in the document one line at a time.
 * For each String that is input, the code will break the String (if the String is not null or empty)
 * ...into individual words (using the supplied tokenize() method). The code will then store the word into an appropriate
 * ...Collection object (a sub-class of Set) that will store unique words in sorted order. The processDocument() method will return the collection.
 * Notes:
 * 1.	The returned list of words must be unique – no word may appear more than once.
 * 2.	The list of words must be sorted in alphabetic order.
 * 3.	The selection of the right Collection type will automatically guarantee that the list is both sorted and unique.
 * You will not add any special code beyond choosing the correct Collection type to handle sorting and uniqueness.
 */


public class Main {
    private static final String fname = "AtTheMountainsOfMadness_HP_Lovecraft.txt";

    public static void main(String[] args) {
        File myfile = new File(fname);
        Set<String> uniques = UniqueWords.processDocument(myfile);
        for (String s : uniques) {
            System.out.println(s);
        }
        System.out.println("Got "+uniques.size()+" words");
    }
}
