
package co.com.acedwdev.domain;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
public class Student implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student")
    private Integer idStudent;
    
    private String name;
    
    private String lastName;
    
    @JoinColumn(name="id_address", referencedColumnName = "id_address")
    @ManyToOne(cascade = CascadeType.ALL)
    private Address address;
    
    @JoinColumn(name="id_contact", referencedColumnName = "id_contact")
    @ManyToOne(cascade = CascadeType.ALL)
    private Contact contact;
    
    @OneToMany(mappedBy = "student")
    private List<Assignment> assignment;

    public Student() {
    }

    public Student(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Assignment> getAssignment() {
        return assignment;
    }

    public void setAssignment(List<Assignment> assignment) {
        this.assignment = assignment;
    }        

    @Override
    public String toString() {
        return "Student{" + "idStudent=" + idStudent + ", name=" + name + ", lastName=" + lastName + ", address=" + address + ", contact=" + contact + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.idStudent);
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
        final Student other = (Student) obj;
        return Objects.equals(this.idStudent, other.idStudent);
    }
    
    
    
}
