import com.crsardar.handson.java.general.reflexion.SubClassOne;
import com.crsardar.handson.java.general.reflexion.SuperClass;
import org.junit.Assert;
import org.junit.Test;

public class InstanceofTest {

    @Test
    public void test(){

        SubClassOne subClassOne = new SubClassOne();

        System.out.println((subClassOne instanceof SuperClass));

        Assert.assertTrue((subClassOne instanceof SuperClass));
    }
}