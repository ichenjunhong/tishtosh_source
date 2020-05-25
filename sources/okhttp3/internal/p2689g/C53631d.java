package okhttp3.internal.p2689g;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.C53685z;
import okhttp3.internal.C53559c;

/* renamed from: okhttp3.internal.g.d */
final class C53631d extends C53634f {

    /* renamed from: a */
    private final Method f132993a;

    /* renamed from: b */
    private final Method f132994b;

    /* renamed from: c */
    private final Method f132995c;

    /* renamed from: d */
    private final Class<?> f132996d;

    /* renamed from: e */
    private final Class<?> f132997e;

    /* renamed from: okhttp3.internal.g.d$a */
    static class C53632a implements InvocationHandler {

        /* renamed from: a */
        boolean f132998a;

        /* renamed from: b */
        String f132999b;

        /* renamed from: c */
        private final List<String> f133000c;

        C53632a(List<String> list) {
            this.f133000c = list;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<String> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C53559c.f132734b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.valueOf(true);
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f132998a = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f133000c;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f133000c.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f132999b = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.f133000c.get(0);
                    this.f132999b = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f132999b = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    /* renamed from: b */
    public static C53634f m114035b() {
        String str = "org.eclipse.jetty.alpn.ALPN";
        try {
            Class cls = Class.forName(str);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("$Provider");
            Class cls2 = Class.forName(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("$ClientProvider");
            Class cls3 = Class.forName(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("$ServerProvider");
            Class cls4 = Class.forName(sb3.toString());
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            Method method2 = method;
            C53631d dVar = new C53631d(method2, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
            return dVar;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo111519b(SSLSocket sSLSocket) {
        try {
            this.f132995c.invoke(null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C53559c.m113796a("unable to remove alpn", (Exception) e);
        }
    }

    /* renamed from: a */
    public final String mo111501a(SSLSocket sSLSocket) {
        try {
            C53632a aVar = (C53632a) Proxy.getInvocationHandler(this.f132994b.invoke(null, new Object[]{sSLSocket}));
            if (!aVar.f132998a && aVar.f132999b == null) {
                C53634f.m114048c().mo111504a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (aVar.f132998a) {
                return null;
            } else {
                return aVar.f132999b;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C53559c.m113796a("unable to get selected protocol", (Exception) e);
        }
    }

    /* renamed from: a */
    public final void mo111507a(SSLSocket sSLSocket, String str, List<C53685z> list) {
        List a = m114047a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C53634f.class.getClassLoader(), new Class[]{this.f132996d, this.f132997e}, new C53632a(a));
            this.f132993a.invoke(null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C53559c.m113796a("unable to set alpn", (Exception) e);
        }
    }

    private C53631d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f132993a = method;
        this.f132994b = method2;
        this.f132995c = method3;
        this.f132996d = cls;
        this.f132997e = cls2;
    }
}
