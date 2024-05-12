package generics.repairables;

import java.util.List;

public class RepairShop {

    /** Bounds restrict to given types */
    public static <T extends Repairable> void fixAll(List<T> items) {
        items.forEach(T::fix);
    }

}
