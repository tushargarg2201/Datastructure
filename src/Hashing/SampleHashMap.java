package Hashing;

import java.util.ArrayList;
import java.util.List;

public class SampleHashMap {
    int capacity;
    List<List<Data>> list;

    public static void main(String[] args) {
        SampleHashMap sampleHashMap = new SampleHashMap(16);
        sampleHashMap.add("One", 1);
        sampleHashMap.add("Two", 2);
        sampleHashMap.add("Three", 3);
        sampleHashMap.add("Four", 4);
        sampleHashMap.add("Five", 5);

        System.out.println("Key 2 contains " +  sampleHashMap.Contains("Two"));
        System.out.println("Key 6 contains " + sampleHashMap.Contains("Six"));
        sampleHashMap.remove("Four");

        List<List<Data>> tempList = sampleHashMap.getList();
        for (int i = 0; i < tempList.size(); i++) {
            List <Data> localList = tempList.get(i);
            for (int j = 0; j < localList.size(); j++) {
                System.out.println("Key is " + localList.get(j).key + "  " + localList.get(j).value);
            }
        }

    }



    public SampleHashMap(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            list.add(i, new ArrayList<>());
        }
    }

    private void add(String key, int value) {
        int hashCode = key.hashCode() % capacity;
        List<Data> tempList = list.get(hashCode);
        Data data = new Data(key, value);
        tempList.add(data);
        list.set(hashCode, tempList);
    }

    private List<List<Data>> getList() {
        return list;
    }

    private boolean Contains(String key) {
        int hashCode = key.hashCode() % capacity;
        List<Data> tempList = list.get(hashCode);
        for (Data data : tempList) {
            if (data.key == key) {
                return true;
            }
        }
        return false;
    }

    private void remove(String key) {
        int hashCode = key.hashCode() % capacity;
        List<Data> tempList = list.get(hashCode);

        for(Data data : tempList) {
            if (data.key == key) {
                tempList.remove(data);
                list.set(hashCode, tempList);
                return;
            }
        }
        System.out.println("After removing list is --->" + list);
    }

    class Data {
        String key;
        int value;

        Data(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
 }
