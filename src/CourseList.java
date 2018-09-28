import java.util.ArrayList;

public class CourseList {

    ArrayList<Course> listOfCourses;
    ArrayList<String> listOfDepartmentNames;
    /**
     * This methos is used for testing a debugging the CourseList class
     * @param args
     */
    public static void main(String[] args){

        CourseList courseList = new CourseList();
        CourseListTextScanner.ScanCourseList(courseList);




    }

    /**Constructors */
    public CourseList(){

    }

    /**Getters*/
    public ArrayList<Course> getListOfCourses(){
        return this.listOfCourses;
    }

    public ArrayList<String> getListOfDepNames(){
        return this.listOfDepartmentNames;
    }



    /**
     * This method adds a course to the array list "listOfCourses"
     * @param course course to add to list of courses
     */
    public void addToCourses(Course course){
        this.listOfCourses.add(course);
    }
    /**
     * This method adds a course to the array list "listOfDepartments"
     * @param department department to add to list of department
     */
    public void addToDepartment(String department){ this.listOfDepartmentNames.add(department); }
}


