package com.example;

/**
 * Created by Гунга on 28.05.2017.
 */
public class NonEmptyBST<D extends Comparable> implements Tree<D> {
    D data;
    Tree<D> left;
    Tree<D> right;

    NonEmptyBST(D elm) {
        data = elm;
        left = new EmptyBST<D>();
        right = new EmptyBST<D>();
    }

    public NonEmptyBST(D elm, Tree<D> leftTree, Tree<D> rightTree) {
        data = elm;
        left = leftTree;
        right = rightTree;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return 1 + left.cardinality() + right.cardinality();
    }

    @Override
    public boolean member(D elm) {
        if (data == elm) {
            return true;
        } else {
            if (elm.compareTo(data) < 0) {
                return left.member(elm);
            } else {
                return right.member(elm);
            }
        }
    }

    @Override
    public NonEmptyBST<D> add(D elm) {
        if (data == elm) {
            return this;
        } else {
            if (elm.compareTo(data) < 0) {
                return new NonEmptyBST<>(data, left.add(elm), right);
            } else {
                return new NonEmptyBST<>(data, left, right.add(elm));
            }
        }
    }
}
