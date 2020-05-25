package okhttp3.internal.p2689g;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C53685z;
import okhttp3.internal.C53559c;

/* renamed from: okhttp3.internal.g.c */
final class C53630c extends C53634f {

    /* renamed from: a */
    final Method f132991a;

    /* renamed from: b */
    final Method f132992b;

    /* renamed from: b */
    public static C53630c m114031b() {
        try {
            return new C53630c(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final X509TrustManager mo111502a(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    /* renamed from: a */
    public final String mo111501a(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f132992b.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C53559c.m113796a("unable to get selected protocols", (Exception) e);
        }
    }

    private C53630c(Method method, Method method2) {
        this.f132991a = method;
        this.f132992b = method2;
    }

    /* renamed from: a */
    public final void mo111507a(SSLSocket sSLSocket, String str, List<C53685z> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List a = m114047a(list);
            this.f132991a.invoke(sSLParameters, new Object[]{a.toArray(new String[a.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C53559c.m113796a("unable to set ssl parameters", (Exception) e);
        }
    }
}
