import android.content.Context;
import android.widget.Toast;

public class clsTest {

    public static void msg_toast(Context context, String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
