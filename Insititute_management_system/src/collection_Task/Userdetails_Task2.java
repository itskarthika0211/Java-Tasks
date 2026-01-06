package collection_Task;

public class Userdetails_Task2 {
   private String id;
   private String name;
   public String course;
   
   public Userdetails_Task2(String id, String name, String course) {
	this.id = id;
	this.name = name;
	this.course = course;
   }

   public String getId() {
	return id;
   }

   public void setId(String id) {
	this.id = id;
   }

   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
   }

   public String getCourse() {
	return course;
   }

   public void setCourse(String course) {
	this.course = course;
   }

   public String toString() {
	return "Userdetails_Task2 [id=" + id + ", name=" + name + ", course=" + course + "]";
   }
     
}
