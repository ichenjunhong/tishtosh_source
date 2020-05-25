package okhttp3.internal.p2685c;

import com.p683ss.android.ugc.aweme.policy.Policy;

/* renamed from: okhttp3.internal.c.f */
public final class C53569f {
    /* renamed from: c */
    public static boolean m113839c(String str) {
        if (str.equals("GET") || str.equals("HEAD")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m113837a(String str) {
        if (str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals(Policy.ACTION_DELETE) || str.equals("MOVE")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m113838b(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            return true;
        }
        return false;
    }
}
