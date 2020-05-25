package okhttp3.internal.p2685c;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import okhttp3.C53504ad;
import okhttp3.C53657l;
import okhttp3.C53659m;
import okhttp3.C53671s;
import okhttp3.C53671s.C53672a;
import okhttp3.C53673t;

/* renamed from: okhttp3.internal.c.e */
public final class C53568e {

    /* renamed from: a */
    private static final Pattern f132759a = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");

    /* renamed from: a */
    public static long m113831a(C53504ad adVar) {
        return m113835b(adVar.f132403f);
    }

    /* renamed from: a */
    private static long m113830a(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private static long m113835b(C53671s sVar) {
        return m113830a(sVar.mo111593a("Content-Length"));
    }

    /* renamed from: b */
    public static boolean m113836b(C53504ad adVar) {
        if (adVar.f132398a.f132379b.equals("HEAD")) {
            return false;
        }
        int i = adVar.f132400c;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && m113831a(adVar) == -1 && !"chunked".equalsIgnoreCase(adVar.mo111276b("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Set<String> m113832a(C53671s sVar) {
        Set emptySet = Collections.emptySet();
        int a = sVar.mo111591a();
        Set set = emptySet;
        for (int i = 0; i < a; i++) {
            if ("Vary".equalsIgnoreCase(sVar.mo111592a(i))) {
                String b = sVar.mo111594b(i);
                if (set.isEmpty()) {
                    set = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : b.split(",")) {
                    set.add(trim.trim());
                }
            }
        }
        return set;
    }

    /* renamed from: a */
    public static int m113828a(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static C53671s m113833a(C53671s sVar, C53671s sVar2) {
        Set a = m113832a(sVar2);
        if (a.isEmpty()) {
            return new C53672a().mo111605a();
        }
        C53672a aVar = new C53672a();
        int a2 = sVar.mo111591a();
        for (int i = 0; i < a2; i++) {
            String a3 = sVar.mo111592a(i);
            if (a.contains(a3)) {
                aVar.mo111604a(a3, sVar.mo111594b(i));
            }
        }
        return aVar.mo111605a();
    }

    /* renamed from: a */
    public static int m113829a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static void m113834a(C53659m mVar, C53673t tVar, C53671s sVar) {
        if (mVar != C53659m.f133117a) {
            List a = C53657l.m114116a(tVar, sVar);
            if (!a.isEmpty()) {
                mVar.saveFromResponse(tVar, a);
            }
        }
    }
}
