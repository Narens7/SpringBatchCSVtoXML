Junit on itemprocessor logic


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Apptest implements ItemProcessor<ExamResult, ExamResult>{

	ExamResult examresult= new ExamResult();
	ExamResultItemProcessor examprocessor= new ExamResultItemProcessor();

    
    @Test
    public void testpercentage() {

      examresult.setPercentage("78");
		
      integer percentage = examprocessor.process(examresult);
      assertEquals(60, percentage, 0.0);
   }


   @Test
   //publc void testage() {

   //examresult.setsetStudentName("2018");
   //String stuname = examprocessor.process(examresult);
   //write the business logic for name validation in biz class-> assertNotNull(60, percentage, 0.0);


   }
}