package ch.basler.fire.marshall;

import ch.basler.fire.git.FirefileRepo;
import ch.basler.fire.jaxb.ConfigRoot;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class AirlogConfigFileMarshaller {

  private static final String ALEC_FULL_XML = "alec_full.xml";
  //private static final String FIREBOOK_CLIENT_SRC_RESOURCES = "https://vcs.balgroupit.com/gitblit/raw/targetplayground!firebook.git/69de75760b8caf823a742aec043f8ca9545b7475/FirebookClient!src!resources!";

  // neu via Jason "http://svx-build04:8080/view/SH/job/Firebook/ws/FirebookClient/src/resources//FirebookClient!src!resources!alec_table.xml");

  protected ConfigRoot parseAlecFullFile() throws Exception {
    //URL alec_full = new URL(FIREBOOK_CLIENT_SRC_RESOURCES + environment + "!" + ALEC_FULL_XML);
    FirefileRepo repo = new FirefileRepo();
    String alecFull = repo.getLatestCommit();
    InputStream stream = new ByteArrayInputStream(alecFull.getBytes(StandardCharsets.UTF_8));
    //URL alec_full = new URL();
    //InputStream fileStream = ResourceDummy.getFileStream("alec_full.xml");

    JAXBContext context = JAXBContext.newInstance(ConfigRoot.class);
    Unmarshaller unmarshaller = context.createUnmarshaller();
    return (ConfigRoot)unmarshaller.unmarshal(stream);
  }

  protected String latestCommitDate() {
    FirefileRepo repo = new FirefileRepo();
    return repo.getLatestCommitDate();
  }
}
