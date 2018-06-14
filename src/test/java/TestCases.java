import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.cloudant.client.api.Database;

public class TestCases {
   
   private String MAVEN_HOME;
   private Database db = null;

   @Before
   public void setUp() throws Exception {
      MAVEN_HOME = System.getenv("MAVEN_HOME");
      try{
      	db = CloudantClientMgr.getDB();
      } catch (Exception e) {
      	return;
      }
   }

   @Test
   public void testMavenHome() {
      Assert.assertNotNull("Apache Maven is not setup!", MAVEN_HOME);
   }
   
   /*
   // ***** COURSE NOTE ******
   // This is the Test Case method to be added while watching video 3.2 of the course.
   // Just be aware that once you add this, the build/test job will fail, as demonstrated in video 3.2
   // You will learn in video 3.3 how to make this test pass, by providing user and password in
   // the CloudantClientMgr.java class
   
   @Test
   public void testDatabaseConnection(){
   	  Assert.assertNotNull("Database connection failed!",db);
   }
   */
	
}
