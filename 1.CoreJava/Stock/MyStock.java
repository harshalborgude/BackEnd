import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
//import org.json.simple.JSONObject;

public class MyStock {

	public static void main(String[] args) {
		String apiKey = "0147f737ea8f0279bc23b2361e605ef7";
		String marketStackUrl = "http://api.marketstack.com/v1/eod?access_key=" + apiKey + "&symbols=HDFCBANK.XNSE";
		System.out.println("url :" + marketStackUrl);

		try {

			HttpURLConnection connection = (HttpURLConnection) new URL(marketStackUrl).openConnection();
			connection.setRequestMethod("GET");
			//InputStream inputStream = connection.getInputStream();
			connection.connect();
			System.out.println("response code:" + connection.getResponseCode());
			//InputStream inputStream=connection.getInputStream();
			
			BufferedReader br = null;
			String output="";
			if (connection.getResponseCode() == 200) {
			    br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			    String strCurrentLine;
			        while ((strCurrentLine = br.readLine()) != null) {
			             //System.out.println(strCurrentLine);
			        	output=output.concat(strCurrentLine);
			        }
			} else {
			    br = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
			    String strCurrentLine;
			        while ((strCurrentLine = br.readLine()) != null) {
			               //System.out.println(strCurrentLine);
			               output=output.concat(strCurrentLine);
			        }
			}
			
			System.out.println("Response :");
			System.out.println(output);
			
			
			
		} catch (MalformedURLException e) {
			System.out.println("Some Exception occured while getting http connection");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
