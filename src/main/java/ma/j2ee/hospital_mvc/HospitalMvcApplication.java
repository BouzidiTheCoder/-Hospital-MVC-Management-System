package ma.j2ee.hospital_mvc;

import ma.j2ee.hospital_mvc.entities.Patient;
import ma.j2ee.hospital_mvc.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalMvcApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalMvcApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        patientRepository.save(new Patient(null, "Mohamed",new Date(), false, 34));
        patientRepository.save(new Patient(null, "Hanane",new Date(), false, 4321));
        patientRepository.save(new Patient(null, "Imane",new Date(), true, 54));

    }
}
