package org.example.clearity;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ArrayMemory {

        public static void main(String[] args) throws Exception {
            // Get Unsafe instance
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Unsafe unsafe = (Unsafe) field.get(null);

            // Variables
            int a = 10;
            float b = 20.5f;
            char c = 'A';

            // Array
            int[] arr = {1, 2, 3, 4, 5};

            // Print addresses (as identity hash codes, not actual memory addresses)
            printMemoryAddress("a", a);
            printMemoryAddress("b", b);
            printMemoryAddress("c", c);

            // Print array element addresses
            int[] temp=arr.clone() ;
            for (int i = 0; i < arr.length; i++) {
                long offset = unsafe.arrayBaseOffset(int[].class) + (i * unsafe.arrayIndexScale(int[].class));
                System.out.println("Address of arr[" + i + "]: " + (unsafe.getLong(arr, offset)));
            }
            for (int i = 0; i < arr.length; i++) {
                long offset = unsafe.arrayBaseOffset(int[].class) + (i * unsafe.arrayIndexScale(int[].class));
                System.out.println("Address of temp[" + i + "]: " + (unsafe.getLong(temp, offset)));
            }
        }

        private static void printMemoryAddress(String varName, Object var) {
            int address = System.identityHashCode(var);
            System.out.println("Address of " + varName + ": " + address);
        }
    }


