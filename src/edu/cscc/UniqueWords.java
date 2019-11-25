package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.TreeSet;

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
public class UniqueWords {
    /**
     * Read file one line at a time
     * Break input String into words
     * Store unique words sorted into alphabetic order
     * @param myfile input file
     * @return sorted set of unique words
     */
    public static Set<String> processDocument(File myfile) {
        /**
        To Implement this method to read the file one line at a time
        and return a Set of sorted unique words. Choose the correct Collection
        type to handle a sorted unique set of words. You will need to make use
        of the tokenize() method below.
        */

        TreeSet<String> strSet = new TreeSet<String>();
        String line = null;


        try {
            Scanner input = new Scanner(myfile);
            while (input.hasNext() ){
                line = input.nextLine();
                String [] str = tokenize(line);

                    // Iterate over the Strings in the array str and add them
                    for (String s : str) {
                        strSet.add(s);
                        //strSet.remove(strSet);
                    }


        }
        }catch (FileNotFoundException e) {
           // e.printStackTrace();
            System.out.println("File not found");// In case of there is no file, this exception will catch the error...
        }
        return strSet ;
    }
    /**
     * Remove all punctuation and numbers from String
     * Tokenize - break into individual words
     * Convert all words to lower case
     * @param str initial non-null String // str replace with set1
     * @return array of words from initial String
     */
    public static String[] tokenize(String str) {
        str = str.replaceAll("[^a-zA-Z \n]"," ");
        String[] tok = str.split(" ");
        for (int i=0; i<tok.length; ++i) {
            tok[i] = tok[i].toLowerCase();
        }
        return tok;
    }
}