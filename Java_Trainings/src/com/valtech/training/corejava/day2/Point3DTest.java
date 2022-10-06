package com.valtech.training.corejava.day2;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import com.valtech.training.corejava.day1.Point3D;

public class Point3DTest {
	
    @Test
    public void testTreeSet() {
        Set<Point3D> points = new TreeSet<>();
        points.add(new Point3D(2,3, 4));
        points.add(new Point3D(4,3, 2));
        assertEquals(2,points.size());
        points.add(new Point3D(3,3, 1));
        assertEquals(3,points.size());
        points.add(new Point3D(6,2, 3));
        assertEquals(4,points.size());
        assertEquals(1,points.size());
        
    }
    @Test
    public void testSetOfPoints() {
        Set<Point3D> points = new HashSet<>();
        points.add(new Point3D(2,3, 1));
        assertEquals(1,points.size());
        points.add(new Point3D(2,3, 1));
        assertEquals(1,points.size());
    }
    @Test
    public void testSetOfStringsWithGenerics() {
        Set<String> myWords = new HashSet<>();
        myWords.add("Hello");
        myWords.add("How");
        myWords.add("are");
        myWords.add("you");
        //myWords.add(123);
        for (Iterator iterator = myWords.iterator(); iterator.hasNext();) {
            String string = (String) iterator.next();
            System.out.println(string);
        }
    }

   @Test
    public void testSetOfStrings() {
         Set setOfStrings=new HashSet();
            setOfStrings.add("Hello");
            assertEquals(1, setOfStrings.size());
            setOfStrings.add("Hello");
            assertEquals(1, setOfStrings.size());
            setOfStrings.add("HEllo");
            assertEquals(2, setOfStrings.size());
            //System.out.println(setOfStrings);
            for (Iterator iterator = setOfStrings.iterator(); iterator.hasNext();) {
                Object object = (Object) iterator.next();
                String s = (String)object;
                System.out.println(s);
        }
    }
}