package rocks.zipcodewilmington.week6.p07172018.marketplace.spices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 7/17/18.
 */
public class SpiceAisle<
        SomeTypeOfSpice extends Spice>
        implements Iterable<SomeTypeOfSpice> {

    private List<SomeTypeOfSpice> spiceList = new ArrayList<>();

    public void stock(SomeTypeOfSpice spice) {
        spiceList.add(spice);
    }

    public void stockAll(SomeTypeOfSpice[] spiceArray) {
        for(SomeTypeOfSpice spice : spiceArray) {
            stock(spice);
        }
    }

    public void sell(SomeTypeOfSpice spice) {
        spiceList.remove(spice);
    }

    public boolean contains(SomeTypeOfSpice spice) {
        return spiceList.contains(spice);
    }

    public SomeTypeOfSpice get(int index) {
        return spiceList.get(index);
    }

    @Override
    public Iterator<SomeTypeOfSpice> iterator() {
        return spiceList.iterator();
    }

    @Override
    public String toString() {
        return Arrays.toString(spiceList.toArray());
    }
}
