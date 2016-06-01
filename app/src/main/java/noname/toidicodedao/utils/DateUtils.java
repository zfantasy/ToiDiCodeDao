package noname.toidicodedao.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zfant on 5/25/2016.
 */
public class DateUtils {
    public static String formatDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        return simpleDateFormat.format(date);
    }
}
