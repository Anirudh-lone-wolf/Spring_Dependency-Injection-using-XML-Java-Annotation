# Spring_Dependency-Injection-using-XML-Java-Annotation
* This is my code for basic DI using xml config file and java annotations. I am facing some errors. Please review it
* I am not able to use the bean for GKteacher class. i have tried many vairtaion for the bean name but nothing works except giving a custom bean name
* I am getting a getting the following error when i try to use the annotation based dependency injection in MathTeacher. I have used @Qualifier annotation to differentiate between the 2 different DI methods named examTip().
  * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.greatlearning.service.ExamTip.getExamTip()" because "this.examtip" is null
	at com.greatlearning.serviceimpl.MathsTeacher.getExamTip(MathsTeacher.java:31)
	at com.greatlearning.driver.SpringDriver.main(SpringDriver.java:28)

