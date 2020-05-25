package okhttp3.internal.p2685c;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import okhttp3.internal.C53559c;

/* renamed from: okhttp3.internal.c.d */
public final class C53566d {

    /* renamed from: a */
    private static final ThreadLocal<DateFormat> f132756a = new ThreadLocal<DateFormat>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C53559c.f132739g);
            return simpleDateFormat;
        }
    };

    /* renamed from: b */
    private static final String[] f132757b;

    /* renamed from: c */
    private static final DateFormat[] f132758c;

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f132757b = strArr;
        f132758c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static String m113826a(Date date) {
        return ((DateFormat) f132756a.get()).format(date);
    }

    /* renamed from: a */
    public static Date m113827a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f132756a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f132757b) {
            int length = f132757b.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = f132758c[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f132757b[i], Locale.US);
                    dateFormat.setTimeZone(C53559c.f132739g);
                    f132758c[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
