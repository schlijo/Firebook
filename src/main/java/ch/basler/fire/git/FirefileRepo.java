package ch.basler.fire.git;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

//import com.sun.jersey.core.util.Base64;

public class FirefileRepo {

  public static final String FBPWD = "";
  public static final String FBUSER = "";
//  private final SecurityConfigurationService securityConfiguration = new SecurityConfigurationServiceBD();

  public String getLocales() {
    String hastag = getLatestHashtag();
    String res = getDataFromServer("" + hastag + "/locales");
    return res;
  }

  public String getLatestCommit() throws Exception {
    String hastag = getLatestHashtag();
    String res = getDataFromServer(
        "" + hastag + "");
    return res;
  }

  private String getLatestHashtag() {
    return "HEAD";
  }

  public String getLatestCommitDate() {
    String feed = getDataFromServer("");
    if (feed != null && feed.length() > 0) {
      String tag = "<dc:date>";
      String endTag = "</dc:date>";
      int beginIndex = feed.indexOf(tag) + tag.length();
      int endIndex = feed.indexOf(endTag);
      return feed.substring(beginIndex, endIndex);
    }
    else {
      return "commits not availabel";
    }
  }

  private URLConnection setUsernamePassword(URL url, String username, String password) throws IOException {
    URLConnection urlConnection = url.openConnection();

    String authString = username + ":" + password;
    String authStringEnc = new String(Base64.getEncoder().encode(authString.getBytes()));
    urlConnection.setRequestProperty("Authorization", "Basic " + authStringEnc);

    return urlConnection;
  }

  private String getDataFromServer(String strUrl) {
    StringBuilder sb = new StringBuilder();
    try {
//      URL url = new URL(strUrl);
//      List<Property> properties = securityConfiguration.getPropertiesForNames("SachHaft", Arrays.asList(new String[] {FBUSER, FBPWD}));
//      if (properties.size() == 2) {
//        URLConnection urlConnection = setUsernamePassword(url, getPropertyValue(properties, FBUSER), getPropertyValue(properties, FBPWD));
//        BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//        String line;
//        while ((line = reader.readLine()) != null) {
//          sb.append(line);
//        }
//        reader.close();
//      }

      return sb.toString();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

//  private String getPropertyValue(List<Property> properties, String propertyName) {
//    for (Property property : properties) {
//      if (property.getName().equalsIgnoreCase(propertyName)) {
//        return property.getValue();
//      }
//    }
//    return "";
//  }

}
