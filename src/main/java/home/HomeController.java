package home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class HomeController {

    private final GenericService<String> s1;
    private final GenericService<String> s2;
    private final GenericService<Integer> s3;

    @Autowired
    public HomeController(
            GenericService<String> s1,
            GenericService<String> s2,
            GenericService<Integer> s3) {

        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @RequestMapping("/int")
    public Integer getInteger(){

        return s3.aMethod();
    }

    @RequestMapping("/string")
    public String getString(){

        return s1.aMethod() + s2.aMethod();
    }
}
