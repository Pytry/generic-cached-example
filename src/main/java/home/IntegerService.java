package home;

import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;

@Service(value = "integerService")
public class IntegerService implements GenericService<Integer> {

    @Override
    @Cacheable("IntegerMethod")
    public Integer aMethod() {
        return 42;
    }
}
