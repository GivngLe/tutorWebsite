package com.vti.templaterestfulapi.models;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Course {
        @Id
        private int Id;
        @Transient
        public static final String SEQUENCE_NAME = "profile_sequence";
        private String courseName;
        private Grade grade;
        private Subject subject;
        private String email;
        private String studentName;
        private String address;
        private String parentName;
        private String phoneNumber;

        private Boolean gender;
        private Date createdDate;
        private Date startedDate;
        private Date finishedDate;

        public int getId() {
                return Id;
        }

        public void setId(int Id) {
                this.Id = Id;
        }

        public Boolean getGender() {
                return gender;
        }

        public void setGender(Boolean gender) {
                this.gender = gender;
        }

        public String getCourseName() {
                return courseName;
        }

        public void setCourseName(String courseName) {
                this.courseName = courseName;
        }

        public Grade getGrade() {
                return grade;
        }

        public void setGrade(Grade grade) {
                this.grade = grade;
        }

        public Subject getSubject() {
                return subject;
        }

        public void setSubject(Subject subject) {
                this.subject = subject;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getStudentName() {
                return studentName;
        }

        public void setStudentName(String studentName) {
                this.studentName = studentName;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getParentName() {
                return parentName;
        }

        public void setParentName(String parentName) {
                this.parentName = parentName;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }

        public Date getCreatedDate() {
                return createdDate;
        }

        public void setCreatedDate(Date createdDate) {
                this.createdDate = createdDate;
        }

        public Date getStartedDate() {
                return startedDate;
        }

        public void setStartedDate(Date startedDate) {
                this.startedDate = startedDate;
        }

        public Date getFinishedDate() {
                return finishedDate;
        }

        public void setFinishedDate(Date finishedDate) {
                this.finishedDate = finishedDate;
        }
}
