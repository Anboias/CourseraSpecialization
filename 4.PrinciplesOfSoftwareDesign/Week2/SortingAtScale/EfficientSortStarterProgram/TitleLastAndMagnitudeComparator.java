
/**
 * Write a description of TitleLastAndMagnitudeComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
//import java.lang.*;

public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry> {
    public int compare(QuakeEntry q1, QuakeEntry q2) {
        String lastQ1 = q1.getInfo().substring(q1.getInfo().lastIndexOf(" ")+1);
        String lastQ2 = q2.getInfo().substring(q2.getInfo().lastIndexOf(" ")+1);
        int result = lastQ1.compareTo(lastQ2);
        if (result != 0) {
            return result;
        }
        return Double.compare(q1.getMagnitude(), q2.getMagnitude());
    }
}
