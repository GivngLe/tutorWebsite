package com.vti.templaterestfulapi.database;


import com.vti.templaterestfulapi.models.ERole;
import com.vti.templaterestfulapi.models.Role;
import com.vti.templaterestfulapi.models.User;
import com.vti.templaterestfulapi.models2.Grade;
import com.vti.templaterestfulapi.models2.Subject;
import com.vti.templaterestfulapi.repositories.GradeRepository;
import com.vti.templaterestfulapi.repositories.RoleRepository;
import com.vti.templaterestfulapi.repositories.SubjectReponsitory;
import com.vti.templaterestfulapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Configuration
public class Database {
//https://www.devglan.com/spring-boot/spring-boot-mongodb-configuration
    @Autowired
    PasswordEncoder encoder;

    @Bean
    CommandLineRunner initDatabase(RoleRepository roleRepository,
                                   UserRepository userRepository,
                                   SubjectReponsitory subjectReponsitory,
                                   GradeRepository gradeRepository) {
        return new CommandLineRunner()
        {
            @Override
            public void run(String... args) throws Exception {
              //  new ConectorSQL().mostrarDatos();





                if(gradeRepository.findAll().size()==0){

                    Grade grade1 = new Grade();
                    grade1.setId(1);
                    grade1.setName("Lop 1");
                    gradeRepository.save(grade1);

                    Grade grade2 = new Grade();
                    grade2.setId(2);
                    grade2.setName("Lop 2");
                    gradeRepository.save(grade2);

                    Grade grade3 = new Grade();
                    grade3.setId(3);
                    grade3.setName("Lop 3");
                    gradeRepository.save(grade3);

                    Grade grade4 = new Grade();
                    grade4.setId(4);
                    grade4.setName("Lop 4");
                    gradeRepository.save(grade4);

                    Grade grade6 = new Grade();
                    grade6.setId(6);
                    grade6.setName("Lop 6");
                    gradeRepository.save(grade6);

                    Grade grade7 = new Grade();
                    grade7.setId(7);
                    grade7.setName("Lop 7");
                    gradeRepository.save(grade7);

                    Grade grade8 = new Grade();
                    grade8.setId(8);
                    grade8.setName("Lop 8");
                    gradeRepository.save(grade8);

                    Grade grade9 = new Grade();
                    grade9.setId(9);
                    grade9.setName("Lop 9");
                    gradeRepository.save(grade9);

                    Grade grade10 = new Grade();
                    grade10.setId(10);
                    grade10.setName("Lop 10");
                    gradeRepository.save(grade10);

                    Grade grade11 = new Grade();
                    grade11.setId(11);
                    grade11.setName("Lop 11");
                    gradeRepository.save(grade11);

                    Grade grade12 = new Grade();
                    grade12.setId(12);
                    grade12.setName("Lop 12");
                    gradeRepository.save(grade12);
                }


                if(subjectReponsitory.findAll().size()==0){

                    Subject subject1 = new Subject();
                    subject1.setId(1);
                    subject1.setName("Toan Lop 1");
                    subject1.setCode("MATH");

                    subjectReponsitory.save(subject1);

                    Subject subject2 = new Subject();
                    subject2.setId(2);
                    subject2.setName("Toan Lop 2");
                    subject2.setCode("MATH");
                    subjectReponsitory.save(subject2);

                    Subject subject3 = new Subject();
                    subject3.setId(3);
                    subject3.setName("Toan Lop 3");
                    subject3.setCode("MATH");
                    subjectReponsitory.save(subject3);


                    Subject subject4 = new Subject();
                    subject4.setId(4);
                    subject4.setName("Toan Lop 4");
                    subject4.setCode("MATH");
                    subjectReponsitory.save(subject4);


                    Subject subject5 = new Subject();
                    subject5.setId(5);
                    subject5.setName("Toan Lop 5");
                    subject5.setCode("MATH");
                    subjectReponsitory.save(subject5);


                    Subject subject6 = new Subject();
                    subject6.setId(6);
                    subject6.setName("Toan Lop 6");
                    subject6.setCode("MATH");
                    subjectReponsitory.save(subject6);


                    Subject subject7 = new Subject();
                    subject7.setId(7);
                    subject7.setName("Toan Lop 7");
                    subject7.setCode("MATH");
                    subjectReponsitory.save(subject7);


                    Subject subject8 = new Subject();
                    subject8.setId(8);
                    subject8.setName("Toan Lop 8");
                    subject8.setCode("MATH");
                    subjectReponsitory.save(subject8);


                    Subject subject9 = new Subject();
                    subject9.setId(9);
                    subject9.setName("Toan Lop 9");
                    subject9.setCode("MATH");
                    subjectReponsitory.save(subject9);


                    Subject subject10 = new Subject();
                    subject10.setId(10);
                    subject10.setName("Toan Lop 10");
                    subject10.setCode("MATH");
                    subjectReponsitory.save(subject10);


                    Subject subject11 = new Subject();
                    subject11.setId(11);
                    subject11.setName("Toan Lop 11");
                    subject11.setCode("MATH");
                    subjectReponsitory.save(subject11);


                    Subject subject12 = new Subject();
                    subject12.setId(12);
                    subject12.setName("Toan Lop 12");
                    subject12.setCode("MATH");
                    subjectReponsitory.save(subject12);


                }


                Role role1 = new Role();
                role1.setId(1);
                role1.setName(ERole.ROLE_ADMIN);

                Role role2 = new Role();
                role2.setId(2);
                role2.setName(ERole.ROLE_MODERATOR);

                Role role3 = new Role();
                role3.setId(3);
                role3.setName(ERole.ROLE_AH);

                Role role4 = new Role();
                role4.setId(4);
                role4.setName(ERole.ROLE_TEACHER);
                if(roleRepository.findAll().size()==0){
                    roleRepository.save(role1);
                    roleRepository.save(role2);
                    roleRepository.save(role3);
                    roleRepository.save(role4);
                }

            // Generate user super admin
                if(userRepository.findAll().size()==0){
                    User admin = new User();
                    admin.setId(1l);
                    admin.setUserName("super_admin@fpt.edu.vn");
                    admin.setEmail("super_admin@fpt.edu.vn");
                    admin.setFullName("Super");
                    admin.setCreatedTime(new Date());
                    admin.setParentID(0);
                    admin.setDepartmentID(0);
                    admin.setNote("This is super account");
                    Set<Role> roles = new HashSet<>();
                    admin.setPassWord(encoder.encode("Azd1232421@#"));
                    Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
                            .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                    roles.add(adminRole);
                    admin.setRoles(roles);
                    userRepository.save(admin);
                }
        }};
    }
}