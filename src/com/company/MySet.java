package com.company;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet<T extends Comparable<T>> implements Set<T> {

    private MyMap<Integer, T> map = new MyMap<>();

    @Override
    public int size() {
        return getArrayList().size();
    }

    @Override
    public boolean isEmpty() {
        return map.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return map.contains((T)o);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] t1s) {
        /*ArrayList<Node> nodes = new ArrayList<>();
        t1s = new T1[size];
        nodes.add(root);
        int a = 0;
        for(int i = 0; i < size; i++){
            while (nodes.get(a) == null)
                a++;
            t1s[i] = (T1)nodes.get(a).getValue();
            nodes.add(a * 2 + 1, nodes.get(a).getLeft());
            nodes.add(a * 2 + 2, nodes.get(a).getRight());
        }*/

        return t1s;
    }
    public ArrayList<T> getArrayList(){
        return map.toArray();
    }

    @Override
    public boolean add(T value) {
        return map.add(map.size(), value);
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            map.remove((T) o);
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {
        map.clear();
    }

}
