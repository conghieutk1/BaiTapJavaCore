package BaiTap1;

import java.util.ArrayList;
import java.util.List;

public class QLCB<T extends CanBo> {
//    List<CanBo> listCanBo = new List<CanBo>() {
//        @Override
//        public int size() {
//            return 0;
//        }
//
//        @Override
//        public boolean isEmpty() {
//            return false;
//        }
//
//        @Override
//        public boolean contains(Object o) {
//            return false;
//        }
//
//        @Override
//        public Iterator<CanBo> iterator() {
//            return null;
//        }
//
//        @Override
//        public Object[] toArray() {
//            return new Object[0];
//        }
//
//        @Override
//        public <T> T[] toArray(T[] a) {
//            return null;
//        }
//
//        @Override
//        public boolean add(CanBo canBo) {
//            return false;
//        }
//
//        @Override
//        public boolean remove(Object o) {
//            return false;
//        }
//
//        @Override
//        public boolean containsAll(Collection<?> c) {
//            return false;
//        }
//
//        @Override
//        public boolean addAll(Collection<? extends CanBo> c) {
//            return false;
//        }
//
//        @Override
//        public boolean addAll(int index, Collection<? extends CanBo> c) {
//            return false;
//        }
//
//        @Override
//        public boolean removeAll(Collection<?> c) {
//            return false;
//        }
//
//        @Override
//        public boolean retainAll(Collection<?> c) {
//            return false;
//        }
//
//        @Override
//        public void clear() {
//
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            return false;
//        }
//
//        @Override
//        public int hashCode() {
//            return 0;
//        }
//
//        @Override
//        public CanBo get(int index) {
//            return null;
//        }
//
//        @Override
//        public CanBo set(int index, CanBo element) {
//            return null;
//        }
//
//        @Override
//        public void add(int index, CanBo element) {
//
//        }
//
//        @Override
//        public CanBo remove(int index) {
//            return null;
//        }
//
//        @Override
//        public int indexOf(Object o) {
//            return 0;
//        }
//
//        @Override
//        public int lastIndexOf(Object o) {
//            return 0;
//        }
//
//        @Override
//        public ListIterator<CanBo> listIterator() {
//            return null;
//        }
//
//        @Override
//        public ListIterator<CanBo> listIterator(int index) {
//            return null;
//        }
//
//        @Override
//        public List<CanBo> subList(int fromIndex, int toIndex) {
//            return null;
//        }
//    };
    private final List<T> listCanBo = new ArrayList<>();
    public void addElement(T element) {
        listCanBo.add(element);
        System.out.println("Added: " + element.getName());
    }
    public T getElement(int index) {
        return listCanBo.get(index);
    }
    public void deleteElement(T element) {
        if (listCanBo.remove(element)) {
            System.out.println("Deleted: " + element);
        } else {
            System.out.println("Object not found: " + element);
        }
    }
    public List<T> getDataList() {
        return listCanBo;
    }
    public void displayList() {
        for (T obj : listCanBo) {
             if (obj instanceof KySu kySu) {
                System.out.println("Class type:" + obj.getClass());
                 System.out.println("Ho ten: " + kySu.getName() + ", Tuoi: " + kySu.getAge() + ", Gioi tinh: " + kySu.getGender() + ", Nganh dao tao: " + kySu.getNganhDaoTao());
            }
            else if (obj instanceof CongNhan congNhan) {
                 System.out.println("Class type:" + obj.getClass());
                 System.out.println("Ho ten: " + congNhan.getName() + ", Tuoi: " + congNhan.getAge() + ", Gioi tinh: " + congNhan.getGender() + ", Cap bac: " + congNhan.getCapBac());
            }
            else if (obj instanceof NhanVien nhanVien) {
                 System.out.println("Class type:" + obj.getClass());
                 System.out.println("Ho ten: " + nhanVien.getName() + ", Tuoi: " + nhanVien.getAge() + ", Gioi tinh: " + nhanVien.getGender() + ", Nganh dao tao: " + nhanVien.getCongViec());
            } else if (obj != null) {
                 System.out.println("Class type:" + obj.getClass());
                System.out.println("Ho ten: " + obj.getName() + ", Tuoi: " + obj.getAge() + ", Gioi tinh: " + obj.getGender() + ", Dia chi: " + obj.getAddress());
            }
        }
    }
    public boolean searchName(String name) {

        for (T obj : listCanBo) {
            if (name.equals(obj.getName())) {
                System.out.println("Tim thay can bo " + name);
                System.out.println("STT: "+ listCanBo.indexOf(obj)+", Ho ten: "+obj.getName() + ", Tuoi: "+ obj.getAge() + ", Gioi tinh: "+ obj.getGender() + ", Dia chi: " + obj.getAddress());
                return true;
            }
        }
        System.out.println("Khong tim thay can bo " + name);
        return false;
    }
}
