public class EncapsulationEx {
    public static void main(String[] args) {
        Emp ob = new Emp();
        // ob.name="Trupti"; if var are public
        //ob.emp_id=101;
        ob.setEmp_id(101);
        ob.setName("Trupti");
        System.out.println(ob.getEmp_id());
        System.out.println(ob.getName());
    }
}
class Emp{
          private String name;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    private int emp_id;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
