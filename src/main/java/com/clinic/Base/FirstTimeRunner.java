package com.clinic.Base;

import com.clinic.model.Appointment;
import com.clinic.service.AppointmentService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class FirstTimeRunner implements CommandLineRunner {

    private final Log log = LogFactory.getLog(FirstTimeRunner.class);

    @Autowired
    private AppointmentService appointmentService;

    @Override
    public void run(String... args) throws Exception {

    }
}
