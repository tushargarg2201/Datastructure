package Hashing;

import java.util.ArrayList;
import java.util.List;

public class SampleHashSet {
    int capacity;
    List<List<Integer>> list;

    public static void main(String[] args) {
        SampleHashSet sampleHashSet = new SampleHashSet(10);
        sampleHashSet.add(1);
        sampleHashSet.add(2);
        sampleHashSet.add(3);
        sampleHashSet.add(4);

        System.out.println("SampleHashSet is--->" + sampleHashSet.Contains(5));
        sampleHashSet.remove(2);
    }

    public SampleHashSet(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            list.add(i, new ArrayList<>());
        }
    }

    private void add(int key) {
        int hashCode = key % 10;
        List<Integer> tempList = list.get(hashCode);
        tempList.add(key);
        list.add(tempList);
        //System.out.print("List is --->"  + list);
    }

    private boolean Contains(int key) {
        int hashCode = key % 10;
        List<Integer> tempList = list.get(hashCode);
        if (tempList.size() <= 0) {
            return false;
        }
        return true;
    }

    private void remove(int key) {
        int hashCode = key % 10;
        List<Integer> tempList = list.get(hashCode);
        if (tempList.size() > 0) {
            list.remove(hashCode);
        }
        System.out.println("After removing list is --->" + list);
    }
 }
