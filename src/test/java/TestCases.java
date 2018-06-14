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
   // If you uncomment this method, make sure to provide user and password on the CloudantClientMgr.java class
   @Test
   public void testDatabaseConnection(){
   	  Assert.assertNotNull("Database connection failed!",db);
   }
   */
	
}
