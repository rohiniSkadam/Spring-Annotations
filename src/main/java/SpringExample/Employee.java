package SpringExample;//Bean class

public class Employee {
    int eid;
    String ename;
    String eaddress;
    Address address;

    public Employee() {
    }

    public Employee(Address address){
        this.address=address;
    }

    public Employee(String eaddress) {
        this.eaddress = eaddress;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

    public void myinit(){
        System.out.println("-- In Init method --");
    }

    public void mydestroy(){
        System.out.println("-- In destroy method --");

    }

    @Override
    public String toString() {
        return "SpringExample.Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", eaddress='" + eaddress + '\'' +
                ", address=" + address +
                '}';
    }
}
