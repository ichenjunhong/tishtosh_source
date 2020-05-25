package okhttp3.internal.p2689g;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C53682y;
import okhttp3.C53685z;
import okhttp3.internal.p2690h.C53635a;
import okhttp3.internal.p2690h.C53636b;
import okhttp3.internal.p2690h.C53637c;
import okhttp3.internal.p2690h.C53639e;

/* renamed from: okhttp3.internal.g.f */
public class C53634f {

    /* renamed from: a */
    private static final C53634f f133004a;

    /* renamed from: b */
    private static final Logger f133005b = Logger.getLogger(C53682y.class.getName());

    /* renamed from: c */
    public static C53634f m114048c() {
        return f133004a;
    }

    /* renamed from: d */
    public static String m114049d() {
        return "OkHttp";
    }

    /* renamed from: a */
    public String mo111501a(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: a */
    public void mo111507a(SSLSocket sSLSocket, String str, List<C53685z> list) {
    }

    /* renamed from: b */
    public void mo111519b(SSLSocket sSLSocket) {
    }

    /* renamed from: b */
    public boolean mo111509b(String str) {
        return true;
    }

    public SSLContext cE_() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r0 != null) goto L_0x0044;
     */
    static {
        /*
            okhttp3.internal.g.f r0 = okhttp3.internal.p2689g.C53625a.m114008a()
            if (r0 == 0) goto L_0x0007
            goto L_0x0044
        L_0x0007:
            java.lang.String r0 = "conscrypt"
            java.lang.String r1 = "okhttp.platform"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0017
            r0 = 1
            goto L_0x0028
        L_0x0017:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Conscrypt"
            boolean r0 = r1.equals(r0)
        L_0x0028:
            if (r0 == 0) goto L_0x0031
            okhttp3.internal.g.f r0 = okhttp3.internal.p2689g.C53629b.m114027b()
            if (r0 == 0) goto L_0x0031
            goto L_0x0044
        L_0x0031:
            okhttp3.internal.g.c r0 = okhttp3.internal.p2689g.C53630c.m114031b()
            if (r0 == 0) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            okhttp3.internal.g.f r0 = okhttp3.internal.p2689g.C53631d.m114035b()
            if (r0 == 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            okhttp3.internal.g.f r0 = new okhttp3.internal.g.f
            r0.<init>()
        L_0x0044:
            f133004a = r0
            java.lang.Class<okhttp3.y> r0 = okhttp3.C53682y.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f133005b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2689g.C53634f.<clinit>():void");
    }

    /* renamed from: a */
    public C53637c mo111503a(X509TrustManager x509TrustManager) {
        return new C53635a(mo111508b(x509TrustManager));
    }

    /* renamed from: b */
    public C53639e mo111508b(X509TrustManager x509TrustManager) {
        return new C53636b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: a */
    public Object mo111500a(String str) {
        if (f133005b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: a */
    public static List<String> m114047a(List<C53685z> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C53685z zVar = (C53685z) list.get(i);
            if (zVar != C53685z.HTTP_1_0) {
                arrayList.add(zVar.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C53637c mo111524b(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager a = mo111502a(sSLSocketFactory);
        if (a != null) {
            return mo111503a(a);
        }
        StringBuilder sb = new StringBuilder("Unable to extract the trust manager on ");
        sb.append(m114048c());
        sb.append(", sslSocketFactory is ");
        sb.append(sSLSocketFactory.getClass());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public X509TrustManager mo111502a(SSLSocketFactory sSLSocketFactory) {
        try {
            Object a = m114046a((Object) sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (a == null) {
                return null;
            }
            return (X509TrustManager) m114046a(a, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo111505a(String str, Object obj) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = sb.toString();
        }
        mo111504a(5, str, (Throwable) obj);
    }

    /* renamed from: a */
    public void mo111506a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: a */
    static <T> T m114046a(Object obj, Class<T> cls, String str) {
        do {
            Class<Object> cls2 = obj.getClass();
            while (cls2 != Object.class) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        if (cls.isInstance(obj2)) {
                            return cls.cast(obj2);
                        }
                    }
                    return null;
                } catch (NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                } catch (IllegalAccessException unused2) {
                    throw new AssertionError();
                }
            }
            if (str.equals("delegate")) {
                break;
            }
            obj = m114046a(obj, Object.class, "delegate");
        } while (obj != null);
        return null;
    }

    /* renamed from: a */
    public void mo111504a(int i, String str, Throwable th) {
        Level level;
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f133005b.log(level, str, th);
    }
}
