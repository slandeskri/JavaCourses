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
    public void testReverse(){
       Integer[] original = new Integer[]{1, 2, 3};
       Integer[] reversed=this.reverser.reverse(original);
       assertArrayEquals("wrong reverse", new Integer[]{3,2,1}, reversed);

    }
}
