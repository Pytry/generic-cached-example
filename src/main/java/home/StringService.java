package home;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service(value = "stringService")
public class StringService implements GenericService<String> {

    @Override
    @Cacheable("StringMethod")
    public String aMethod() {
        return "Some Value";
    }
}
