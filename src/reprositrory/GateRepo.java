package reprositrory;

import models.Gates;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepo {
    private Map<Long, Gates> gates = new HashMap<>();
    public Optional<Gates> findGateID(Long ID){           // Optional<> wrapper class indicating whatever is
        if(gates.containsKey(ID)){                           //written might not have a value
            return Optional.of(gates.get(ID));
        }
        return Optional.empty();
    }
}
