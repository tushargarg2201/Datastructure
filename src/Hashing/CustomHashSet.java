package Hashing;

import java.util.ArrayList;
import java.util.List;

public class CustomHashSet<K> {
    int capacity;
    List<List<K>> list;

    public static void main(String[] args) {
//        CustomHashSet<Integer> sampleHashSet = new CustomHashSet<>(10);
//        sampleHashSet.add(1);
//        sampleHashSet.add(2);
//        sampleHashSet.add(3);
//        sampleHashSet.add(4);
//
//        System.out.println("SampleHashSet is--->" + sampleHashSet.Contains(5));
//        sampleHashSet.remove(2);

        CustomHashSet<String> sampleHashSet2 = new CustomHashSet<>(10);
        sampleHashSet2.add("Tushar");
        sampleHashSet2.add("Amit");
        sampleHashSet2.add("Anil");
        sampleHashSet2.add("Vinay");

        System.out.println("SampleHashSet is--->" + sampleHashSet2.Contains("Tushar"));
        sampleHashSet2.remove("Amit");

    }


    public CustomHashSet(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            list.add(i, new ArrayList<>());
        }
    }

    private void add(K key) {
        int hashCode = Math.abs(key.hashCode() % 10);
        List<K> tempList = list.get(hashCode);
        tempList.add(key);
        list.clear();
        list.add(tempList);
        System.out.println("List is --->"  + list);
    }

    private boolean Contains(K key) {
        int hashCode = Math.abs(key.hashCode() % 10);
        List<K> tempList = list.get(hashCode);
        for (int i = 0; i < tempList.size(); i++) {
            if (tempList.get(i).equals(key)) {
                return true;
            }
        }
        return false;
    }

    private void remove(K key) {
        int hashCode = key.hashCode() % 10;
        List<K> tempList = list.get(hashCode);
        for (int i = 0; i < tempList.size(); i++) {
            if (key == tempList.get(i)) {
                tempList.remove(i);
            }
        }
        list.add(tempList);
        System.out.println("After removing list is --->" + list);
    }
 }
