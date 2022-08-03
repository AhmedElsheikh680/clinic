package com.clinic.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "appointment")
public class Appointment{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


//    @JsonFormat(pattern="yyyy-MM-dd")
//    @Temporal(TemporalType.TIMESTAMP)

    @Column(name="date")
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate date;

    @Column(name="hour")
    private int hour;

    @Column(name = "cancle")
    private Boolean cancle=false;

    @Column(name = "reason")
    private String reason;

    @ManyToOne
    @JoinColumn(name = "patient_id")
//    @JsonIgnore
    private Patient patient;

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", date=" + date +
                ", hour=" + hour +
                ", cancle=" + cancle +
                ", reason='" + reason + '\'' +
                '}';
    }
}
