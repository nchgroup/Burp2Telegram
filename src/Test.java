import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
        try{
            String token = "";
            String chat = "";

            URL url = new URL("https://api.telegram.org/bot"+token+"/sendMessage");
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();

            httpConn.setRequestMethod("POST");

            httpConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            httpConn.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(httpConn.getOutputStream());
            writer.write("chat_id="+chat+"&text=AAAA");
            writer.flush();
            writer.close();
            httpConn.getOutputStream().close();


            InputStream responseStream = httpConn.getResponseCode() / 100 == 2
                    ? httpConn.getInputStream()
                    : httpConn.getErrorStream();

            /*Scanner s = new Scanner(responseStream).useDelimiter("\\A");
            String response = s.hasNext() ? s.next() : "";*/


            System.out.println("hola");
        }catch (IOException e){
            System.out.println(e.toString());
        }

    }
}
