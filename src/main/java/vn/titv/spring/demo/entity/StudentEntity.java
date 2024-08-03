package vn.titv.spring.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sinhvien")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ho_dem")
    private String familyName;

    @Column(name = "ten")
    private String lastName;

    @Column(name = "email")
    private String email;

    public StudentEntity(Long id, String familyName, String lastName, String email) {
        this.id = id;
        this.familyName = familyName;
        this.lastName = lastName;
        this.email = email;
    }

    public StudentEntity(String familyName, String lastName, String email) {
        this.familyName = familyName;
        this.lastName = lastName;
        this.email = email;
    }

    public StudentEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
