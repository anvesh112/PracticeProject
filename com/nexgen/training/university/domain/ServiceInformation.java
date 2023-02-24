package com.nexgen.training.university.domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class ServiceInformation {
    public static void main(String[] args) throws Exception {


        // adding students to faculty
        // we are listing the faculty
        // we get the faculty courseId
        // if student course id matches to faculty course id adding the students to one list
        // print the list

        List<Faculty> faculties = creatingFacultyList();

        for (Faculty faculty: faculties) {
            Person facultyPerson = faculty.getPerson();
            int facultyCourseId = facultyPerson.getCourseId();


            List<Student> studentList = creatingStudentsList();

            for (Student student : studentList) {
                Person studentPerson = student.getPerson();
                int studentCourseId = studentPerson.getCourseId();

                if(facultyCourseId == studentCourseId){


                    HashMap<Faculty , Student> hashMap = new HashMap<>();

                    hashMap.put(faculty,student);


                    System.out.println(hashMap);
                }
            }

        }




    }

    public static University creatingUniversity() throws Exception {

        University university = createUniversity("KU", "dean", "register");

        university.setAddress(createAddress(121, "rajan", 123, 21, "wes", "reAW"));
        university.setCampuses(creatingCampusList());

        return university;

    }

    public static List<Campus> creatingCampusList() throws Exception {

        List<Campus> campuses = new ArrayList<>();


        FileReader FacultiesInputData = new FileReader("/Users/anveshchinthala/IdeaProjects/PracticeProject/com/nexgen/training/university/domain/CampusInformation.txt");

        BufferedReader bufferedReaderCampus = new BufferedReader(FacultiesInputData);
        String CampusLine;
        while((CampusLine = bufferedReaderCampus.readLine()) != null ) {

            if (!CampusLine.trim().equals("") && !CampusLine.trim().startsWith("#")) {

                String[] tokens = CampusLine.split(",");
                if (tokens.length == 13) {
                    Campus campusData = new Campus(tokens[8].trim(),
                            new Address(Integer.parseInt(tokens[7].trim()), tokens[8].trim(), Integer.parseInt(tokens[9].trim()), tokens[10].trim(), Integer.parseInt(tokens[11].trim()), tokens[12].trim()));


                    campuses.add(campusData);

                }
            }
        }

        Campus campus1 = createCampus("campus1");

        campus1.setAddress(createAddress(122, "campus", 124, 22, "wes1", "reAW1"));


        campus1.setDepartment(creatingDepartmentsFromNames(Arrays.asList("Cs", "Maths")));


        Campus campus2 = createCampus("campus2");

        campus2.setAddress(createAddress(122, "campus", 124, 22, "wes1", "reAW1"));

        campus2.setDepartment(creatingDepartmentsFromNames(Arrays.asList("Biology", "Social")));

        //  campus2.setDepartment(creatingDepartmentList());

        campuses.add(campus1);
        campuses.add(campus2);

        return campuses;

        //CampusInformation.txt

    }

    // from department names we should create departments
    // we should loop department name then we should create each departments

    public static List<Department> creatingDepartmentsFromNames(List<String> departmentNames) throws Exception {

        List<Department> departments = new ArrayList<>();

        for (String name : departmentNames) {

            Department department1 = creatingDepartmentName(name);

            department1.setFaculty(creatingFacultyList());
            department1.setStudents(creatingStudentsList());

            departments.add(department1);

        }

        return departments;
    }

    public static List<Faculty> creatingFacultyList() throws Exception {

        // adding Faculty to collection
        // taking the data from Faculty information.txt
        // read the data using buffer reader
        // after reading first line data not equal to null it will go to forward
        // removing the first line using condition which contain # value
        // using tokens to take individual values
        // they are separated by comma
        // tokens should contain 13 values to match all fields
        // addding the Faculties to List

        List<Faculty> faculty = new ArrayList<>();

        FileReader FacultiesInputData = new FileReader("/Users/anveshchinthala/IdeaProjects/PracticeProject/com/nexgen/training/university/domain/FacultyInformation.txt");

        BufferedReader bufferedReaderFaculty = new BufferedReader(FacultiesInputData);
        String facultyLine;
        while((facultyLine = bufferedReaderFaculty.readLine()) != null ) {

            if (!facultyLine.trim().equals("") && !facultyLine.trim().startsWith("#")) {

                String[] tokens = facultyLine.split(",");
                if(tokens.length == 13) {
                   Faculty facultyData = new Faculty(
                            new Person(tokens[0].trim(), tokens[1].trim(), Integer.parseInt(tokens[2].trim()), Integer.parseInt(tokens[3].trim()), Long.parseLong(tokens[4].trim()), Integer.parseInt(tokens[5].trim())),
                           tokens[6].trim(),
                            new Address(Integer.parseInt(tokens[7].trim()), tokens[8].trim(), Integer.parseInt(tokens[9].trim()), tokens[10].trim(), Integer.parseInt(tokens[11].trim()), tokens[12].trim()));


                    faculty.add(facultyData);

            }
        }
    }
        return faculty;
    }

    public static List<Student> creatingStudentsList() throws FileNotFoundException {


        // adding Students to collection
        // taking the data from student information.txt
        // read the data using buffer reader
        // after reading first line data not equal to null it will go to forward
        // removing the first line using condition which contain # value
        // using tokens to take individual values
        // they are separated by comma
        // tokens should contain 13 values to match all fields
        // addding the students to List

        List<Student> student = new ArrayList<>();

        FileReader studentInput = new FileReader("/Users/anveshchinthala/IdeaProjects/PracticeProject/com/nexgen/training/university/domain/StudentInformation.txt");

        BufferedReader bufferedReader = new BufferedReader(studentInput);
        String line;
        while(true) {
            try {
                if (!((line = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (!line.trim().equals("") && !line.trim().startsWith("#")) {

                String[] tokens = line.split(",");
                if(tokens.length == 13) {
                    Student student1 = new Student(
                            new Person(tokens[0].trim(), tokens[1].trim(), Integer.parseInt(tokens[2].trim()), Integer.parseInt(tokens[3].trim()), Long.parseLong(tokens[4].trim()), Integer.parseInt(tokens[5].trim())),
                            tokens[6].trim(),
                            new Address(Integer.parseInt(tokens[7].trim()), tokens[8].trim(), Integer.parseInt(tokens[9].trim()), tokens[10].trim(), Integer.parseInt(tokens[11].trim()), tokens[12].trim()));


                    student.add(student1);
                }
            }
        }


        return student;

    }


//    private static Faculty createQualification(String qualification) {
//
//        Faculty faculty = new Faculty();
//        faculty.setQualification(qualification);
//        return faculty;
//    }


    private static Campus createCampus(String name) {
        Campus campus1 = new Campus();

        campus1.setName(name);

        return campus1;
    }

    private static University createUniversity(String universityName, String dean, String register) {
        University university = new University();

        university.setUniversityName(universityName);
        university.setDean(dean);
        university.setRegister(register);
        return university;
    }

    private static Address createAddress(int number, String street, int appartmentnumber, int zipcode, String state,
                                         String city) {
        Address Address1 = new Address();

        Address1.setNumber(number);
        Address1.setStreet(street);
        Address1.setAppartmentnumber(appartmentnumber);
        Address1.setZipcode(zipcode);
        Address1.setState(state);
        Address1.setCity(city);

        return Address1;
    }

    private static Department creatingDepartmentName(String name) {
        Department department1 = new Department();

        department1.setName(name);
        return department1;
    }

//    private static Person createPersonalDetails(int id, String name, String sex, int dob, long phoneNumber, int courseId) throws Exception {
//        Person personalDetails = new Person();
//
//        personalDetails.setName(name);
//
//            personalDetails.setId(id);
//            personalDetails.setSex(sex);
//            personalDetails.setDob(dob);
//            personalDetails.setPhoneNumber(phoneNumber);
//            personalDetails.setCourseId(courseId);
//
//        return personalDetails;
//    }

}
