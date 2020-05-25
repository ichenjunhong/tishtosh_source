package okhttp3.internal.p2683a;

import java.util.Date;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53671s;
import okhttp3.internal.p2685c.C53566d;
import okhttp3.internal.p2685c.C53568e;

/* renamed from: okhttp3.internal.a.c */
public final class C53537c {

    /* renamed from: a */
    public final C53498ab f132623a;

    /* renamed from: b */
    public final C53504ad f132624b;

    /* renamed from: okhttp3.internal.a.c$a */
    public static class C53538a {

        /* renamed from: a */
        final long f132625a;

        /* renamed from: b */
        final C53498ab f132626b;

        /* renamed from: c */
        final C53504ad f132627c;

        /* renamed from: d */
        Date f132628d;

        /* renamed from: e */
        String f132629e;

        /* renamed from: f */
        Date f132630f;

        /* renamed from: g */
        String f132631g;

        /* renamed from: h */
        Date f132632h;

        /* renamed from: i */
        long f132633i;

        /* renamed from: j */
        long f132634j;

        /* renamed from: k */
        String f132635k;

        /* renamed from: l */
        int f132636l = -1;

        public C53538a(long j, C53498ab abVar, C53504ad adVar) {
            this.f132625a = j;
            this.f132626b = abVar;
            this.f132627c = adVar;
            if (adVar != null) {
                this.f132633i = adVar.f132408k;
                this.f132634j = adVar.f132409l;
                C53671s sVar = adVar.f132403f;
                int a = sVar.mo111591a();
                for (int i = 0; i < a; i++) {
                    String a2 = sVar.mo111592a(i);
                    String b = sVar.mo111594b(i);
                    if ("Date".equalsIgnoreCase(a2)) {
                        this.f132628d = C53566d.m113827a(b);
                        this.f132629e = b;
                    } else if ("Expires".equalsIgnoreCase(a2)) {
                        this.f132632h = C53566d.m113827a(b);
                    } else if ("Last-Modified".equalsIgnoreCase(a2)) {
                        this.f132630f = C53566d.m113827a(b);
                        this.f132631g = b;
                    } else if ("ETag".equalsIgnoreCase(a2)) {
                        this.f132635k = b;
                    } else if ("Age".equalsIgnoreCase(a2)) {
                        this.f132636l = C53568e.m113828a(b, -1);
                    }
                }
            }
        }
    }

    C53537c(C53498ab abVar, C53504ad adVar) {
        this.f132623a = abVar;
        this.f132624b = adVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r3.mo111278c().f132473d != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r4.mo111257b().f132473d != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r3.mo111278c().f132476g == false) goto L_0x003c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m113711a(okhttp3.C53504ad r3, okhttp3.C53498ab r4) {
        /*
            int r0 = r3.f132400c
            r1 = 0
            switch(r0) {
                case 200: goto L_0x0029;
                case 203: goto L_0x0029;
                case 204: goto L_0x0029;
                case 300: goto L_0x0029;
                case 301: goto L_0x0029;
                case 302: goto L_0x0007;
                case 307: goto L_0x0007;
                case 308: goto L_0x0029;
                case 404: goto L_0x0029;
                case 405: goto L_0x0029;
                case 410: goto L_0x0029;
                case 414: goto L_0x0029;
                case 501: goto L_0x0029;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x003c
        L_0x0007:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.mo111276b(r0)
            if (r0 != 0) goto L_0x0029
            okhttp3.d r0 = r3.mo111278c()
            int r0 = r0.f132474e
            r2 = -1
            if (r0 != r2) goto L_0x0029
            okhttp3.d r0 = r3.mo111278c()
            boolean r0 = r0.f132477h
            if (r0 != 0) goto L_0x0029
            okhttp3.d r0 = r3.mo111278c()
            boolean r0 = r0.f132476g
            if (r0 != 0) goto L_0x0029
            goto L_0x003c
        L_0x0029:
            okhttp3.d r3 = r3.mo111278c()
            boolean r3 = r3.f132473d
            if (r3 != 0) goto L_0x003b
            okhttp3.d r3 = r4.mo111257b()
            boolean r3 = r3.f132473d
            if (r3 != 0) goto L_0x003b
            r3 = 1
            return r3
        L_0x003b:
            return r1
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2683a.C53537c.m113711a(okhttp3.ad, okhttp3.ab):boolean");
    }
}
