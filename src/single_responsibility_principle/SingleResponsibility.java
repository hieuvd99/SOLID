package single_responsibility_principle;

/*Một class chỉ nên giữ 1 trách nhiệm duy nhất 
(Chỉ có thể sửa đổi class với 1 lý do duy nhất)*/

class Student { 
    String name;  
    int age;
    
    public Student(String name, int age) {
    	this.name = name;
    	this.age = age;
    }
}
 
 class Formatter {
	  public String FormatStudentText(String name, int age) {
	    return "Name: " + name + ". Age: " + age;
	  }
}

public class SingleResponsibility {
	public static void main(String[] args) {
		Student student = new Student("Hieu", 23);
		Formatter formatter = new Formatter();
		String str = formatter.FormatStudentText(student.name, student.age);
		System.out.println(str);
	}
	
}