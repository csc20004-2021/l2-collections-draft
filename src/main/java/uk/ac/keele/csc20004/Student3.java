/* ***********************
 * CSC-20004 LECTURE 2   *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

public class Student3 extends Student2 {
    
    public Student3(int id, String name) {
        super(id, name);
    }
    
    // equals() is inherited from Student2()
    
    @Override
    public int hashCode() {
        // this is just an example to prove a point
        // the id is *not* a giid choice for a hash code!
        return this.getId();
    }
}
