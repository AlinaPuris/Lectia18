public class Employee {
    public String name;
    public String department;
    public boolean canConductInterview;
    public boolean canAttendTraining;
    public boolean isPayedPerHour;
    public int age;

    public Employee(String name, String department, boolean canConductInterview, boolean canAttendTraining, boolean isPayedPerHour, int age) {
        this.name = name;
        this.department = department;
        this.canConductInterview = canConductInterview;
        this.canAttendTraining = canAttendTraining;
        this.isPayedPerHour = isPayedPerHour;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isCanConductInterview() {
        return canConductInterview;
    }

    public boolean isCanAttendTraining() {
        return canAttendTraining;
    }

    public boolean isPayedPerHour() {
        return isPayedPerHour;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", canConductInterview=" + canConductInterview +
                ", canAttendTraining=" + canAttendTraining +
                ", isPayedPerHour=" + isPayedPerHour +
                ", age=" + age +
                '}';
    }
}
