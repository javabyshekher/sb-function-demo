package in.ashokit.repository;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {

    @Autowired
    private SimpleJdbcCall simpleJdbcCall;

    public double getBonus(int empno) {
        //attach the function name
        simpleJdbcCall.withFunctionName("bonus_function");

        //map the inputs
        Map<String, Object> inputMap = new HashMap<>();
        inputMap.put("employee_no", empno);

        // call the function
        Map<String, Object> outputMap = simpleJdbcCall.execute(inputMap);

        // read the output
        Double output = (Double) outputMap.get("return");
        return output;
    }

}
