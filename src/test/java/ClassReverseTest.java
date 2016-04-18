import it.sevenbits.ReverseAnyArray.IReverse.ClassReverse.ClassReverse;
import it.sevenbits.ReverseAnyArray.IReverse.IReverse;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
/**
 * Created by java on 11.04.16.
*/
public class ClassReverseTest {
   private ClassReverse reverser;
    @Before
    public void setUp(){
        this.reverser=new ClassReverse();
    }
   @Test
    public void testReverse() throws Exception {
       Integer[] original = new Integer[]{1, 2, 3};
       Integer[] reversed=this.reverser.reverse(original);
       assertArrayEquals("wrong reverse", new Integer[]{3,2,1}, reversed);
    }

    @Test
    public void testReverseS() throws Exception {
        String[] original = new String[]{"ab", "cd", "ef"};
        String[] reversed = this.reverser.reverse(original);
        assertArrayEquals("wrong string reverse", new String[]{"ef", "cd", "ab"}, reversed);
    }
}
