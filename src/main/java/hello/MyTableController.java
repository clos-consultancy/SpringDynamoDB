package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTableController {

    @Autowired
    protected MyTableRepositoryDynamoDB myTableRepositoryDynamoDB = null;


    @RequestMapping(value = "/save-psp",method = RequestMethod.POST)
    public String savePsp(@RequestParam(value="pspName") String pspName) {
        MyTable myTableToSave = new MyTable();
        myTableToSave.setPspName(pspName);
        myTableRepositoryDynamoDB.save(myTableToSave);

        return "Saved";
    }
}
