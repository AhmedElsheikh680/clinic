package com.clinic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class Patient extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "disease")
    private String disease;

    @OneToMany(mappedBy = "patient")
    @JsonIgnore
    private Set<Appointment> appointments;


}
