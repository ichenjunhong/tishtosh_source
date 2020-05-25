package net.openid.appauth.p2682c;

import android.util.Log;
import com.C2240a;
import net.openid.appauth.C53487p;

/* renamed from: net.openid.appauth.c.a */
public final class C53455a {

    /* renamed from: a */
    private static C53455a f132184a;

    /* renamed from: b */
    private final C53457b f132185b;

    /* renamed from: c */
    private final int f132186c;

    /* renamed from: net.openid.appauth.c.a$a */
    static final class C53456a implements C53457b {

        /* renamed from: a */
        public static final C53456a f132187a = new C53456a();

        private C53456a() {
        }

        /* renamed from: a */
        public final String mo111206a(Throwable th) {
            return Log.getStackTraceString(th);
        }

        /* renamed from: a */
        public final boolean mo111207a(String str, int i) {
            return Log.isLoggable(str, i);
        }
    }

    /* renamed from: net.openid.appauth.c.a$b */
    public interface C53457b {
        /* renamed from: a */
        String mo111206a(Throwable th);

        /* renamed from: a */
        boolean mo111207a(String str, int i);
    }

    /* renamed from: a */
    private static synchronized C53455a m113510a() {
        C53455a aVar;
        synchronized (C53455a.class) {
            if (f132184a == null) {
                f132184a = new C53455a(C53456a.f132187a);
            }
            aVar = f132184a;
        }
        return aVar;
    }

    private C53455a(C53457b bVar) {
        this.f132185b = (C53457b) C53487p.m113584a(bVar);
        int i = 7;
        while (i >= 2 && this.f132185b.mo111207a("AppAuth", i)) {
            i--;
        }
        this.f132186c = i + 1;
    }

    /* renamed from: a */
    public static void m113512a(String str, Object... objArr) {
        m113510a().m113511a(3, null, str, objArr);
    }

    /* renamed from: b */
    public static void m113514b(String str, Object... objArr) {
        m113510a().m113511a(4, null, str, objArr);
    }

    /* renamed from: c */
    public static void m113515c(String str, Object... objArr) {
        m113510a().m113511a(5, null, str, objArr);
    }

    /* renamed from: d */
    public static void m113516d(String str, Object... objArr) {
        m113510a().m113511a(6, null, str, objArr);
    }

    /* renamed from: a */
    public static void m113513a(Throwable th, String str, Object... objArr) {
        m113510a().m113511a(3, th, str, objArr);
    }

    /* renamed from: a */
    private void m113511a(int i, Throwable th, String str, Object... objArr) {
        if (this.f132186c <= i) {
            if (objArr != null && objArr.length > 0) {
                str = C2240a.m6772a(str, objArr);
            }
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("\n");
                sb.append(this.f132185b.mo111206a(th));
            }
        }
    }
}
