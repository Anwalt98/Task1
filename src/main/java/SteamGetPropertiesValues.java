import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SteamGetPropertiesValues {

    public static String getValue(String value)  {
      String url = "";
      try {
          String jsonString = "src\\main\\resources\\config.json";
          File config = new File(jsonString);
          FileReader reader = new FileReader(config.getAbsolutePath());
          JSONParser jsonParser = new JSONParser();
          JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
          url = (String) jsonObject.get(value);
      }
      catch (ParseException ignored){
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
         return url;
  }
}