package Bai1.entity;

import java.util.Comparator;

public class ScholarShipComparator implements Comparator<BKapStudent> {
    @Override
    public int compare(BKapStudent o1, BKapStudent o2) {
        return Double.compare(o2.getScholarShip(), o1.getScholarShip());
    }
}
