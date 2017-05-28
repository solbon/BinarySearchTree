package com.example;

/**
 * Created by Гунга on 28.05.2017.
 */
public class EmptyBST<D extends Comparable> implements Tree<D> {

    public EmptyBST() {

    }


    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(Comparable elm) {
        return false;
    }

    @Override
    public NonEmptyBST<D> add(D elm) {
        return new NonEmptyBST<D>(elm);
    }
}
