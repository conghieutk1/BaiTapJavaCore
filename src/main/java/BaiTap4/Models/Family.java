package BaiTap4.Models;

import java.util.ArrayList;
import java.util.List;

public class Family<Person> {
    private int numberOfMember;
    private String address;
    private final List<Person> listMemberOfFamily;

    public Family(String address) {
        this.address = address;
        this.listMemberOfFamily = new ArrayList<>();
        this.numberOfMember = 0;
    }

    public int getNumberOfMember() {
        return numberOfMember;
    }

    public void setNumberOfMember(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Person> getMemberOfFamily() {
        return listMemberOfFamily;
    }

    public void addPerson(Person person) {
        this.listMemberOfFamily.add(person);
        this.numberOfMember = listMemberOfFamily.size();
    }

    @Override
    public String toString() {
        return "\nFamily {\n" +
                "So thanh vien trong gia dinh = " + numberOfMember + '\n' +
                "So nha = " + address + '\n' +
                "Danh sach thanh vien = " + listMemberOfFamily + '\n'+
                '}';
    }
}
