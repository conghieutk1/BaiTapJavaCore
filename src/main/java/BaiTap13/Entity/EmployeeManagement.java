package BaiTap13.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeManagement {
    List<Employee> employeeList = new ArrayList<>();

    public void insertEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    public EmployeeType getEmployeeType(int id) {
        return employeeList.get(id).employeeType;
    }
    public void deleteEmployee(Employee employee) {
        employeeList.remove(employee);
    }
    public void deleteEmployeeByID(Integer id) {
        employeeList.remove(id - 1);
    }
    public void deleteEmployeeByType(EmployeeType employeeType) {
//        employeeList.stream().filter(employee -> employee != null && employee.getEmployeeType() == employeeType)
//                .forEach(this::deleteEmployee);

        List<Employee> employeesToDelete = new ArrayList<>();
        employeeList.stream()
                .filter(employee -> employee != null && employee.getEmployeeType() == employeeType)
                .forEach(employeesToDelete::add);
        employeeList.removeAll(employeesToDelete);
    }
    public void deleteAllEmployee() {
        employeeList.forEach(this::deleteEmployee);
    }
    public void updateEmployee(Integer id, Employee employee) {
        employeeList.set(searchEmployeeByIdReturnObject(id).getID(), employee);
    }
    public void updateFieldDataEmployee(int id, Employee newEmployee) {
        if (employeeList.get(id - 1).employeeType !=  newEmployee.employeeType ) {
            System.out.println("Lỗi ");
            return;
        }
        if (!employeeList.get(id - 1).getFullName().equals(newEmployee.getFullName())) {
            employeeList.get(id - 1).setFullName(newEmployee.getFullName());
        }
        if (!employeeList.get(id - 1).getBirthDay().equals(newEmployee.getBirthDay())) {
            employeeList.get(id - 1).setBirthDay(newEmployee.getBirthDay());
        }
        if (!employeeList.get(id - 1).getPhone().equals(newEmployee.getPhone())) {
            employeeList.get(id - 1).setPhone(newEmployee.getPhone());
        }
        if (!employeeList.get(id - 1).getEmail().equals(newEmployee.getEmail())) {
            employeeList.get(id - 1).setEmail(newEmployee.getEmail());
        }
        switch (newEmployee.employeeType) {
            case INTERN -> {
                if (!((Intern)employeeList).getMajors().equals(((Intern) newEmployee).getMajors())) {
                    ((Intern)employeeList).setMajors(((Intern) newEmployee).getMajors());
                }
                if (!((Intern)employeeList).getSemester().equals(((Intern) newEmployee).getSemester())) {
                    ((Intern)employeeList).setSemester(((Intern) newEmployee).getSemester());
                }
                if (!((Intern)employeeList).getUniversityName().equals(((Intern) newEmployee).getUniversityName())) {
                    ((Intern)employeeList).setUniversityName(((Intern) newEmployee).getUniversityName());
                }
            }
            case FRESHER -> {
                if (!((Fresher)employeeList).getGraduationDate().equals(((Fresher) newEmployee).getGraduationDate())) {
                    ((Fresher)employeeList).setGraduationDate(((Fresher) newEmployee).getGraduationDate());
                }
                if (!((Fresher)employeeList).getGraduationRank().equals(((Fresher) newEmployee).getGraduationRank())) {
                    ((Fresher)employeeList).setGraduationRank(((Fresher) newEmployee).getGraduationRank());
                }
                if (!((Fresher)employeeList).getEducation().equals(((Fresher) newEmployee).getEducation())) {
                    ((Fresher)employeeList).setEducation(((Fresher) newEmployee).getEducation());
                }
            }
            case EXPERIENCE -> {
                if (((Experience)employeeList).getExpInYear() == ((Experience) newEmployee).getExpInYear()) {
                    ((Experience)employeeList).setExpInYear(((Experience) newEmployee).getExpInYear());
                }
                if (!((Experience)employeeList).getProSkill().equals(((Experience) newEmployee).getProSkill())) {
                    ((Experience)employeeList).setProSkill(((Experience) newEmployee).getProSkill());
                }

            }
        }

    }
    public void showAllEmployee() {
        employeeList.forEach(employee -> {
            System.out.println(employee.ShowMe());
        });
    }
    public boolean searchEmployeeById(int id) {
        return employeeList.stream().anyMatch(employee -> employee.getID() == id);
    }
    public Employee searchEmployeeByIdReturnObject(int id) {
        return employeeList.stream()
                .filter(employee -> employee.getID() == id)
                .findFirst()
                .orElse(null);
    }
    public void showEmployeeByID(Integer id) {
        employeeList.stream()
                .filter(employee -> id.equals(employee.getID()))
                .forEach(employee -> {
                    System.out.println(employee.ShowMe());
                });
    }

    public void showAllEmployeeByType(EmployeeType employeeType) {
        employeeList.stream().filter(employee -> employee.getEmployeeType() == employeeType)
                .forEach(employee -> {
                    System.out.println(employee.ShowMe());
        });
    }
    public void showAMountEmployee(EmployeeType employeeType) {
        System.out.print("Số lượng " + employeeType + ": ");
        switch (employeeType) {
            case INTERN -> {
                System.out.println(employeeList.stream().filter(employee -> employee instanceof Intern).count());
            }
            case FRESHER -> {
                System.out.println(employeeList.stream().filter(employee -> employee instanceof Fresher).count());
            }
            case EXPERIENCE -> {
                System.out.println(employeeList.stream().filter(employee -> employee instanceof Experience).count());
            }
        }
    }

}
