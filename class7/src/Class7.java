import com.ming.FromPackage;
import com.ming.FromPackage.*;
public class Class7 extends FromPackage {
    protected int i;
    public Class7(int i){
        this.i = i;
        Class7 s = new Class7(1);
        s.i = 34;

    }


}
