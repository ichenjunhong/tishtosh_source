package p2628d.p2650m;

import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: d.m.aa */
public class C52805aa extends C52846z {
    /* renamed from: c */
    public static final String m112361c(String str, int i) {
        boolean z;
        C52711k.m112240b(str, "$this$drop");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String substring = str.substring(C52753d.m112322d(i, str.length()));
            C52711k.m112236a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        StringBuilder sb = new StringBuilder("Requested character count ");
        sb.append(i);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
