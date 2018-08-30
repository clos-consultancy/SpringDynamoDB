package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PspController {

    @Autowired
    protected IPspRepositoryDynamoDB iPspRepositoryDynamoDB = null;


    @RequestMapping(value = "/save-psp",method = RequestMethod.POST)
    public String savePsp(@RequestParam(value="pspName") String pspName) {
        Psp pspToSave = new Psp();
        pspToSave.setPspName(pspName);
        iPspRepositoryDynamoDB.save(pspToSave);

        return "Saved";
    }
}
