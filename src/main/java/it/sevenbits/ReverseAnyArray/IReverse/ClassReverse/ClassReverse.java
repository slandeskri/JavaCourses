package it.sevenbits.ReverseAnyArray.IReverse.ClassReverse;


import it.sevenbits.ReverseAnyArray.IReverse.IReverse;

/**
 * Created by java on 03.04.16.
 */
public class ClassReverse implements IReverse {
    /**
     * Default constructor
     */
    public ClassReverse() {
    }

    public <T> T[] reverse(T[] array) {
            for (int i = 0; i < array.length / 2; i++) {
                T temporaryStorageValue = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temporaryStorageValue;
            }
            return array;
    }
}
