package Bai1.entity;

import java.util.Comparator;

public class ClassNameComparator implements Comparator<BKapStudent> {
    @Override
    public int compare(BKapStudent o1, BKapStudent o2) {
        return o2.getClassName().compareTo(o1.getClassName());
    }
}
