package com.example.demo;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.function.UnaryOperator;

class JavaCustomList<T> implements List<T> {

    private List<T> innerList;
    private Logger logger = LoggerFactory.getLogger(getClass());

    public JavaCustomList(List<T> innerList) {
        this.innerList = innerList;
    }

    @Override
    public int size() {
        return innerList.size();
    }

    @Override
    public boolean isEmpty() {
        logger.info("isEmpty");
        return innerList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return innerList.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return innerList.iterator();
    }

    @Override
    public Object[] toArray() {
        return innerList.toArray();
    }

    @Override
    public <T1> T1[] toArray(@NotNull T1[] a) {
        return innerList.toArray(a);
    }

    @Override
    public boolean add(T t) {
        return innerList.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return innerList.remove(o);
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        return innerList.containsAll(c);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends T> c) {
        return innerList.addAll(c);
    }

    @Override
    public boolean addAll(int index, @NotNull Collection<? extends T> c) {
        return innerList.addAll(index, c);
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        return innerList.removeAll(c);
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        return innerList.retainAll(c);
    }

    @Override
    public void replaceAll(UnaryOperator<T> operator) {
        innerList.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super T> c) {
        innerList.sort(c);
    }

    @Override
    public void clear() {
        innerList.clear();
    }

    @Override
    public boolean equals(Object o) {
        return innerList.equals(o);
    }

    @Override
    public int hashCode() {
        return innerList.hashCode();
    }

    @Override
    public T get(int index) {
        return innerList.get(index);
    }

    @Override
    public T set(int index, T element) {
        return innerList.set(index, element);
    }

    @Override
    public void add(int index, T element) {
        innerList.add(index, element);
    }

    @Override
    public T remove(int index) {
        return innerList.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return innerList.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return innerList.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return innerList.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return innerList.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return innerList.subList(fromIndex, toIndex);
    }

    @Override
    public Spliterator<T> spliterator() {
        return innerList.spliterator();
    }
}