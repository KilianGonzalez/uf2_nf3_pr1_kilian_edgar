import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

public class Main {
    public static void main(String[] args) {
        ODB odb = ODBFactory.open("HR.odb");

        //Query 1
        System.out.println("Query 1:" + "\n");
        CriteriaQuery query1 = new CriteriaQuery(Employee.class, Where.gt("sal", 4850));
        query1.orderByAsc("ecognom");
        Objects<Employee> res = odb.getObjects(query1);

        while (res.hasNext()){
            Employee emp = res.next();
            System.out.println("ID: " + emp.getEmpno() + ", Apellido: " + emp.getEcognom() + ", Salario: " + emp.getSal());
        }

        //Query 2
        System.out.println("\n" + "Query 2:" + "\n");
        CriteriaQuery query2 = new CriteriaQuery(Employee.class, Where.equal("empno", 173));
        Objects<Employee> res2 = odb.getObjects(query2);

        Employee emp2 = res2.next();
        System.out.println("ID: " + emp2.getEmpno() + ", Apellido: " + emp2.getEcognom() + ", Departamento: " + emp2.getDpt());

        //Query 3
        System.out.println("\n" + "Query 3:" + "\n");
        CriteriaQuery query3 = new CriteriaQuery(Employee.class, Where.or().add(Where.gt("sal", 2850)).add(Where.lt("sal", 1500)));
        Objects<Employee> res3 = odb.getObjects(query3);

        while (res3.hasNext()){
            Employee emp3 = res3.next();
            System.out.println("Apellido: " + emp3.getEcognom() + ", Salario: " + emp3.getSal());
        }

        //Query 4
        System.out.println("\n" + "Query 4:" + "\n");
        CriteriaQuery query4 = new CriteriaQuery(Employee.class, Where.or().add(Where.equal("dpt", 10)).add(Where.equal("dpt", 30)));
        Objects<Employee> res4 = odb.getObjects(query4);

        while(res4.hasNext()){
            Employee emp4 = res4.next();
            System.out.println("ID: " + emp4.getEmpno() + ", Apellido: " + emp4.getEcognom() + ", Fecha contratación: " + emp4.getHiredate());
        }

        //Query 5
        System.out.println("\n" + "Query 5:" + "\n");
        CriteriaQuery query5 = new CriteriaQuery(Employee.class,
        Where.and().add(Where.gt("sal", 1500)).add(Where.or().add(Where.equal("dpt", 10)).add(Where.equal("dpt", 30))));
        Objects<Employee> res5 = odb.getObjects(query5);

        while (res5.hasNext()){
            Employee emp5 = res5.next();
            System.out.println("Apellido: " + emp5.getEcognom() + ", Salario: " + emp5.getSal());
        }

        //Query 6
        System.out.println("\n" + "Query 6:" + "\n");
        CriteriaQuery query6 = new CriteriaQuery(Employee.class, Where.gt("comm", 0));

        Objects<Employee> res6 = odb.getObjects(query6);

        while (res6.hasNext()){
            Employee emp6 = res6.next();
            System.out.println("Apellido: " + emp6.getEcognom() + ", Salario: " + emp6.getSal() + ", Comisión: " + emp6.getComm());
        }

        //Query 7
        System.out.println("\n" + "Query 7:" + "\n");
        CriteriaQuery query7 = new CriteriaQuery(Employee.class, Where.or().add(Where.like("enom", "__A%")).add(Where.like("enom", "__a%")));
        Objects<Employee> res7 = odb.getObjects(query7);

        while (res7.hasNext()){
            Employee emp7 = res7.next();
            System.out.println("Apellido: " + emp7.getEcognom());
        }

        //Query 8
        System.out.println("\n" + "Query 8:" + "\n");
        CriteriaQuery query8 = new CriteriaQuery(Employee.class, Where.equal("mgr", 60));
        Objects<Employee> res8 = odb.getObjects(query8);

        while (res8.hasNext()){
            Employee emp8 = res8.next();
            System.out.println("Apellido: " + emp8.getEcognom());
        }

    }
}
