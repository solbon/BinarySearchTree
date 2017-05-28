package com.example;

/**
 * Created by Гунга on 28.05.2017.
 */
public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elm);
    public NonEmptyBST<D> add(D elm);
}
