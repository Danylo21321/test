package Empoolye;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employe> list = new ArrayList<>();
        list.add(new Employe(12, 1213, "petro"));
        list.add(new Employe(12, 1213, "ivan"));
        Method1 method = new Method1();
        method.allIO(list);
    }
}
@Data
@AllArgsConstructor
class Employe implements Serializable {
    public transient int  id;
    public int salary;
    String name;
}
