
package co.com.acedwdev.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Assignment implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_assignment")
    private Integer idAssignment;
    
    private String turn;
    
    @JoinColumn(name="id_student",referencedColumnName = "id_student")
    @ManyToOne
    private Student student;
    
    @JoinColumn(name="id_course",referencedColumnName = "id_course")
    @ManyToOne
    private Course course;

    public Assignment() {
    }

    public Assignment(Integer idAssignment) {
        this.idAssignment = idAssignment;
    }

    public Integer getIdAssignment() {
        return idAssignment;
    }

    public void setIdAssignment(Integer idAssignment) {
        this.idAssignment = idAssignment;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Assignment{" + "idAssignment=" + idAssignment + ", turn=" + turn + ", student=" + student + ", course=" + course + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.idAssignment);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Assignment other = (Assignment) obj;
        return Objects.equals(this.idAssignment, other.idAssignment);
    }
    
    
    
}
