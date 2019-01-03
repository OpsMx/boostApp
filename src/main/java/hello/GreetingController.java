package hello;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.BufferedReader;
import java.io.InputStreamReader;


@CrossOrigin
@RestController
public class GreetingController {

	private static final Logger LOG = LoggerFactory.getLogger(GreetingController.class);

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

		String query;
		StringBuffer sb = new StringBuffer();
		String query2;
		StringBuffer sb2 = new StringBuffer();

		ClassLoader cl = GreetingController.class.getClassLoader();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(cl.getResource("testpage.html").openStream()));
			while ((query = br.readLine()) != null)
				sb.append(query);
			br.close();

			String whichdog = "dog1";

			/* Introducing Arch. regression */

			whichdog = "dog2";
			/* till here */

			BufferedReader br2 = new BufferedReader(new InputStreamReader(cl.getResource(whichdog).openStream()));
			while ((query2 = br2.readLine()) != null)
				sb2.append(query2);
			br2.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		;

		// getAllUsersFromDB();
		return sb.length() > 0 ? sb.toString().replace("##dogimage##", sb2.toString()) : " No page found";
		// return "POSTGRES_NUM_OPS_METRIC_COUNT : "+ POSTGRES_NUM_OPS_METRIC_COUNT;
	}


	@RequestMapping("/dogcount")
	public String dogCount() {
		return "{ \"dogCount\": 20 }";
	}

	@RequestMapping("/catcount")
	public String catCount() {

		return "{ \"catCount\": 16 }";
	}

}
