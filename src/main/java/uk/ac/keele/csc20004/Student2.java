/* ***********************
 * CSC-20004 LECTURE 2   *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

public class Student2 extends Student1 {

    public Student2(int id, String name) {
        super(id, name);
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Student1) {
            return this.getId() == ((Student1)o).getId();
        } else 
            return super.equals(o);
    }
}
