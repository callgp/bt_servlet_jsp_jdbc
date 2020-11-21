package co.edureka;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("edureka")
public class EdurekaServices {

	//public static String main(String[] args) {
		// TODO Auto-generated method stub

		@GET
		@Produces("text/html")
		public String localService(){
			return "<h2>local customer service center</h2>";
		}
		
		@GET
		@Path("/nri")
		@Produces("text/html")
		public String nriService(){
			return "<h2>local customer service center</h2>";
		}
//	}

}
