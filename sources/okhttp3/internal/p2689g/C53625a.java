package okhttp3.internal.p2689g;

import android.os.Build.VERSION;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C53685z;
import okhttp3.internal.C53559c;
import okhttp3.internal.p2690h.C53637c;
import okhttp3.internal.p2690h.C53639e;
import okio.Buffer;

/* renamed from: okhttp3.internal.g.a */
final class C53625a extends C53634f {

    /* renamed from: a */
    private final Class<?> f132978a;

    /* renamed from: b */
    private final C53633e<Socket> f132979b;

    /* renamed from: c */
    private final C53633e<Socket> f132980c;

    /* renamed from: d */
    private final C53633e<Socket> f132981d;

    /* renamed from: e */
    private final C53633e<Socket> f132982e;

    /* renamed from: f */
    private final C53628c f132983f = C53628c.m114024a();

    /* renamed from: okhttp3.internal.g.a$a */
    static final class C53626a extends C53637c {

        /* renamed from: a */
        private final Object f132984a;

        /* renamed from: b */
        private final Method f132985b;

        public final int hashCode() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return obj instanceof C53626a;
        }

        C53626a(Object obj, Method method) {
            this.f132984a = obj;
            this.f132985b = method;
        }

        /* renamed from: a */
        public final List<Certificate> mo111510a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                X509Certificate[] x509CertificateArr = (X509Certificate[]) list.toArray(new X509Certificate[list.size()]);
                return (List) this.f132985b.invoke(this.f132984a, new Object[]{x509CertificateArr, "RSA", str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* renamed from: okhttp3.internal.g.a$b */
    static final class C53627b implements C53639e {

        /* renamed from: a */
        private final X509TrustManager f132986a;

        /* renamed from: b */
        private final Method f132987b;

        public final int hashCode() {
            return this.f132986a.hashCode() + (this.f132987b.hashCode() * 31);
        }

        /* renamed from: a */
        public final X509Certificate mo111513a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f132987b.invoke(this.f132986a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw C53559c.m113796a("unable to get issues and signature", (Exception) e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C53627b)) {
                return false;
            }
            C53627b bVar = (C53627b) obj;
            if (!this.f132986a.equals(bVar.f132986a) || !this.f132987b.equals(bVar.f132987b)) {
                return false;
            }
            return true;
        }

        C53627b(X509TrustManager x509TrustManager, Method method) {
            this.f132987b = method;
            this.f132986a = x509TrustManager;
        }
    }

    /* renamed from: okhttp3.internal.g.a$c */
    static final class C53628c {

        /* renamed from: a */
        private final Method f132988a;

        /* renamed from: b */
        private final Method f132989b;

        /* renamed from: c */
        private final Method f132990c;

        /* renamed from: a */
        static C53628c m114024a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C53628c(method3, method, method2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo111517a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f132990c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Object mo111516a(String str) {
            if (this.f132988a != null) {
                try {
                    Object invoke = this.f132988a.invoke(null, new Object[0]);
                    this.f132989b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        private C53628c(Method method, Method method2, Method method3) {
            this.f132988a = method;
            this.f132989b = method2;
            this.f132990c = method3;
        }
    }

    /* renamed from: a */
    public final void mo111506a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C53559c.m113807a(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        } catch (ClassCastException e3) {
            if (VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException("Exception in connect");
                iOException2.initCause(e3);
                throw iOException2;
            }
            throw e3;
        } catch (Exception e4) {
            IOException iOException3 = new IOException("Exception in connect");
            iOException3.initCause(e4);
            throw iOException3;
        }
    }

    /* renamed from: a */
    public final void mo111507a(SSLSocket sSLSocket, String str, List<C53685z> list) {
        if (str != null) {
            this.f132979b.mo111521a(sSLSocket, Boolean.valueOf(true));
            this.f132980c.mo111521a(sSLSocket, str);
        }
        if (this.f132982e != null && this.f132982e.mo111522a(sSLSocket)) {
            Object[] objArr = new Object[1];
            Buffer buffer = new Buffer();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C53685z zVar = (C53685z) list.get(i);
                if (zVar != C53685z.HTTP_1_0) {
                    buffer.writeByte(zVar.toString().length());
                    buffer.writeUtf8(zVar.toString());
                }
            }
            objArr[0] = buffer.readByteArray();
            this.f132982e.mo111523b(sSLSocket, objArr);
        }
    }

    /* renamed from: b */
    private static boolean m114010b() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static C53634f m114008a() {
        Class cls;
        C53633e eVar;
        C53633e eVar2;
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        Class cls2 = cls;
        C53633e eVar3 = new C53633e(null, "setUseSessionTickets", Boolean.TYPE);
        C53633e eVar4 = new C53633e(null, "setHostname", String.class);
        if (m114010b()) {
            C53633e eVar5 = new C53633e(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            eVar = new C53633e(null, "setAlpnProtocols", byte[].class);
            eVar2 = eVar5;
        } else {
            eVar2 = null;
            eVar = null;
        }
        C53625a aVar = new C53625a(cls2, eVar3, eVar4, eVar2, eVar);
        return aVar;
    }

    /* renamed from: a */
    public final Object mo111500a(String str) {
        return this.f132983f.mo111516a(str);
    }

    /* renamed from: b */
    public final C53639e mo111508b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C53627b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo111508b(x509TrustManager);
        }
    }

    /* renamed from: a */
    public final String mo111501a(SSLSocket sSLSocket) {
        if (this.f132981d == null || !this.f132981d.mo111522a(sSLSocket)) {
            return null;
        }
        byte[] bArr = (byte[]) this.f132981d.mo111523b(sSLSocket, new Object[0]);
        if (bArr != null) {
            return new String(bArr, C53559c.f132737e);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo111509b(String str) {
        try {
            Class cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m114009a(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo111509b(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw C53559c.m113796a("unable to determine cleartext support", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final X509TrustManager mo111502a(SSLSocketFactory sSLSocketFactory) {
        Object a = m114046a((Object) sSLSocketFactory, this.f132978a, "sslParameters");
        if (a == null) {
            try {
                a = m114046a((Object) sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.mo111502a(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) m114046a(a, X509TrustManager.class, "x509TrustManager");
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        return (X509TrustManager) m114046a(a, X509TrustManager.class, "trustManager");
    }

    /* renamed from: a */
    public final C53637c mo111503a(X509TrustManager x509TrustManager) {
        try {
            Class cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C53626a(cls.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, String.class, String.class}));
        } catch (Exception unused) {
            return super.mo111503a(x509TrustManager);
        }
    }

    /* renamed from: a */
    public final void mo111505a(String str, Object obj) {
        if (!this.f132983f.mo111517a(obj)) {
            mo111504a(5, str, (Throwable) null);
        }
    }

    /* renamed from: a */
    private boolean m114009a(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m114011b(str, cls, obj);
        }
    }

    /* renamed from: b */
    private boolean m114011b(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo111509b(str);
        }
    }

    /* renamed from: a */
    public final void mo111504a(int i, String str, Throwable th) {
        if (th != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(10);
            sb.append(Log.getStackTraceString(th));
            str = sb.toString();
        }
        int i2 = 0;
        int length = str.length();
        while (i2 < length) {
            int indexOf = str.indexOf(10, i2);
            if (indexOf == -1) {
                indexOf = length;
            }
            do {
                i2 = Math.min(indexOf, i2 + 4000);
            } while (i2 < indexOf);
            i2++;
        }
    }

    private C53625a(Class<?> cls, C53633e<Socket> eVar, C53633e<Socket> eVar2, C53633e<Socket> eVar3, C53633e<Socket> eVar4) {
        this.f132978a = cls;
        this.f132979b = eVar;
        this.f132980c = eVar2;
        this.f132981d = eVar3;
        this.f132982e = eVar4;
    }
}
