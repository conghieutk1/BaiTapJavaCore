package BaiTap4.Models;

import java.util.ArrayList;
import java.util.List;

public class ResidentialGroup<Family> {
    private final List<Family> listFamily;
    public ResidentialGroup() {
        this.listFamily = new ArrayList<>() ;
    }
    public List<Family> getListFamily() {
        return listFamily;
    }
    public void addFamily(Family family) {
        this.listFamily.add(family);
    }
    public Family getFamily(int index) {
        return listFamily.get(index);
    }
    @Override
    public String toString() {
        return "ResidentialGroup " + listFamily + '\n';
    }
}
