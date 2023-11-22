import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static org.junit.Assert.assertEquals;

public class MainTest {
    private static final String INPUT = "From fairest creatures we desire increase,That thereby beauty's rose might never die,But as the riper should by time decease,His tender heir might bear his memory:But thou contracted to thine own bright eyes,Feed'st thy light's flame with self-substantial fuel,Making a famine where abundance lies,Thy self thy foe, to thy sweet self too cruel:Thou that art now the world's fresh ornament,And only herald to the gaudy spring,Within thine own bud buriest thy content,And, tender churl, mak'st waste in niggarding:Pity the world, or else this glutton be,To eat the world's due, by the grave and thee.";

    @Test 
    public void test() {
        Map<String, Map<Integer, List<String>>> result = Arrays.stream(INPUT.split("[:,\\s\\-]+"))
        .collect(Collectors.groupingBy(word -> String.valueOf(word.charAt(0)),
                Collectors.groupingBy(String::length, Collectors.toList())));

        // Or this if we don't consider the case of the word and use toLowerCase at the start 
        // Map<String, Map<Integer, List<String>>> result = Arrays.stream(INPUT.split("[:,\\s\\-]+"))
        // .map(String::toLowerCase)
        // .collect(Collectors.groupingBy(word -> String.valueOf(word.charAt(0)),
        //         Collectors.groupingBy(String::length, Collectors.toList())));

        assertEquals("[abundance]", result.get("a").get(9).toString());
        assertEquals("[by, be, by]", result.get("b").get(2).toString());
        assertEquals("[flame, fresh]", result.get("f").get(5).toString());
        assertEquals("[gaudy, grave]", result.get("g").get(5).toString());
        assertEquals("[should, spring]", result.get("s").get(6).toString());
        assertEquals("[substantial]", result.get("s").get(11).toString());
        assertEquals("[the, thy, thy, thy, too, the, the, thy, the, the, the]",
                result.get("t").get(3).toString());
        // Or this if we don't consider the case of the word and use toLowerCase at the start
        // (added additional thy here because the upperCased Thy would turn into just thy)
        // assertEquals("[the, thy, thy, thy, thy, too, the, the, thy, the, the, the]",
        // result.get("t").get(3).toString());        
        assertEquals("[where, waste, world]", result.get("w").get(5).toString());
    }
}
