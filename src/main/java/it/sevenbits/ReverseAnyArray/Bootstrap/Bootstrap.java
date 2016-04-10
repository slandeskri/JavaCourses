package it.sevenbits.ReverseAnyArray.Bootstrap;


import it.sevenbits.ReverseAnyArray.IReverse.ClassReverse.ClassReverse;

import java.util.Arrays;



/**
 * Created by java on 03.04.16.
 */
final public class Bootstrap {
    /**
     * Default constructor
     */
    private Bootstrap(){
    }

    /**
     * Main method
     * @param arg incoming argument
     */
    public static void main(final String[] arg){

        Integer[] array=new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 10};
        String[] arrayS=new String[]{"abc", "def", "ghi"};

        ClassReverse revInt = new ClassReverse();
        revInt.reverse(array);

        ClassReverse revStr = new ClassReverse();
        revStr.reverse(arrayS);

        System.out.println(Arrays.toString(array));
        System.out.print(Arrays.toString(arrayS));
    }
}
