import java.util.List;
import java.util.Map;
import java.util.Optional;

public class JunitTask {
    public String[] stringInArray(String s) {
        return s.split(" ");
    }

    public int maxElementOfArray(List<Integer> list) {
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        if (max.isPresent()) {
            return max.get();
        } else {
            return 0;
        }
    }

    public String getValueOfHashMap(Integer key, Map<Integer, String> map) {
        return map.get(key);
    }
    public String createStringFullName(String lastName,String firstName,String patronymic){
        return lastName+" "+firstName+" "+patronymic;
    }
    public Person createPerson(String lastName,String firstName,int age){
        return new Person(lastName,firstName,age);
    }
}
