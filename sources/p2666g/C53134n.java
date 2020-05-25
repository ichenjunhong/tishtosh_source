package p2666g;

import com.p683ss.android.ugc.aweme.policy.Policy;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.C53500ac;
import okhttp3.C53504ad;
import okhttp3.C53524e.C53525a;
import okhttp3.C53673t;
import okhttp3.C53682y;
import p2666g.C53068c.C53069a;
import p2666g.C53095e.C53096a;
import p2666g.p2672c.C53071b;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53076g;
import p2666g.p2672c.C53077h;
import p2666g.p2672c.C53080k;
import p2666g.p2672c.C53081l;
import p2666g.p2672c.C53082m;
import p2666g.p2672c.C53083n;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53085p;

/* renamed from: g.n */
public final class C53134n {

    /* renamed from: a */
    public final C53525a f131638a;

    /* renamed from: b */
    public final C53673t f131639b;

    /* renamed from: c */
    public final List<C53096a> f131640c;

    /* renamed from: d */
    public final List<C53069a> f131641d;

    /* renamed from: e */
    public final Executor f131642e;

    /* renamed from: f */
    final boolean f131643f;

    /* renamed from: g */
    private final Map<Method, C53137o<?, ?>> f131644g = new ConcurrentHashMap();

    /* renamed from: g.n$a */
    public static final class C53136a {

        /* renamed from: a */
        private final C53127k f131648a;

        /* renamed from: b */
        private C53525a f131649b;

        /* renamed from: c */
        private C53673t f131650c;

        /* renamed from: d */
        private final List<C53096a> f131651d;

        /* renamed from: e */
        private final List<C53069a> f131652e;

        /* renamed from: f */
        private Executor f131653f;

        /* renamed from: g */
        private boolean f131654g;

        public C53136a() {
            this(C53127k.m112912a());
        }

        /* renamed from: a */
        public final C53134n mo110657a() {
            if (this.f131650c != null) {
                C53525a aVar = this.f131649b;
                if (aVar == null) {
                    aVar = new C53682y();
                }
                C53525a aVar2 = aVar;
                Executor executor = this.f131653f;
                if (executor == null) {
                    executor = this.f131648a.mo110637b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f131652e);
                arrayList.add(this.f131648a.mo110634a(executor2));
                C53134n nVar = new C53134n(aVar2, this.f131650c, new ArrayList(this.f131651d), arrayList, executor2, this.f131654g);
                return nVar;
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: a */
        private C53136a m112937a(C53525a aVar) {
            this.f131649b = (C53525a) C53139p.m112957a(aVar, "factory == null");
            return this;
        }

        private C53136a(C53127k kVar) {
            this.f131651d = new ArrayList();
            this.f131652e = new ArrayList();
            this.f131648a = kVar;
            this.f131651d.add(new C53043a());
        }

        /* renamed from: a */
        public final C53136a mo110653a(C53069a aVar) {
            this.f131652e.add(C53139p.m112957a(aVar, "factory == null"));
            return this;
        }

        /* renamed from: a */
        private C53136a m112938a(C53673t tVar) {
            C53139p.m112957a(tVar, "baseUrl == null");
            List<String> list = tVar.f133145f;
            if ("".equals(list.get(list.size() - 1))) {
                this.f131650c = tVar;
                return this;
            }
            StringBuilder sb = new StringBuilder("baseUrl must end in /: ");
            sb.append(tVar);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public final C53136a mo110654a(C53096a aVar) {
            this.f131651d.add(C53139p.m112957a(aVar, "factory == null"));
            return this;
        }

        /* renamed from: a */
        public final C53136a mo110655a(String str) {
            C53139p.m112957a(str, "baseUrl == null");
            C53673t f = C53673t.m114180f(str);
            if (f != null) {
                return m112938a(f);
            }
            StringBuilder sb = new StringBuilder("Illegal URL: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public final C53136a mo110656a(C53682y yVar) {
            return m112937a((C53525a) C53139p.m112957a(yVar, "client == null"));
        }
    }

    /* renamed from: b */
    private void m112932b(Class<?> cls) {
        Method[] declaredMethods;
        C53127k a = C53127k.m112912a();
        for (Method method : cls.getDeclaredMethods()) {
            if (!a.mo110636a(method)) {
                mo110650a(method);
            }
        }
    }

    /* renamed from: a */
    public final <T> T mo110651a(final Class<T> cls) {
        C53139p.m112962a(cls);
        if (this.f131643f) {
            m112932b(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {

            /* renamed from: c */
            private final C53127k f131647c = C53127k.m112912a();

            public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (this.f131647c.mo110636a(method)) {
                    return this.f131647c.mo110635a(method, cls, obj, objArr);
                }
                C53137o a = C53134n.this.mo110650a(method);
                return a.f131658d.mo110591a(new C53106i(a, objArr));
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C53137o<?, ?> mo110650a(Method method) {
        C53137o<?, ?> oVar;
        Annotation[] annotationArr;
        C53137o<?, ?> oVar2 = (C53137o) this.f131644g.get(method);
        if (oVar2 != null) {
            return oVar2;
        }
        synchronized (this.f131644g) {
            oVar = (C53137o) this.f131644g.get(method);
            if (oVar == null) {
                C53138a aVar = new C53138a(this, method);
                aVar.f131691w = aVar.mo110659a();
                aVar.f131674f = aVar.f131691w.mo110592a();
                if (aVar.f131674f == C53133m.class || aVar.f131674f == C53504ad.class) {
                    StringBuilder sb = new StringBuilder("'");
                    sb.append(C53139p.m112956a(aVar.f131674f).getName());
                    sb.append("' is not a valid response body type. Did you mean ResponseBody?");
                    throw aVar.mo110662a(sb.toString(), new Object[0]);
                }
                aVar.f131690v = aVar.mo110665b();
                for (Annotation annotation : aVar.f131671c) {
                    if (annotation instanceof C53071b) {
                        aVar.mo110664a(Policy.ACTION_DELETE, ((C53071b) annotation).mo110599a(), false);
                    } else if (annotation instanceof C53075f) {
                        aVar.mo110664a("GET", ((C53075f) annotation).mo110603a(), false);
                    } else if (annotation instanceof C53076g) {
                        aVar.mo110664a("HEAD", ((C53076g) annotation).mo110604a(), false);
                        if (!Void.class.equals(aVar.f131674f)) {
                            throw aVar.mo110662a("HEAD method must use Void as response type.", new Object[0]);
                        }
                    } else if (annotation instanceof C53083n) {
                        aVar.mo110664a("PATCH", ((C53083n) annotation).mo110611a(), true);
                    } else if (annotation instanceof C53084o) {
                        aVar.mo110664a("POST", ((C53084o) annotation).mo110612a(), true);
                    } else if (annotation instanceof C53085p) {
                        aVar.mo110664a("PUT", ((C53085p) annotation).mo110613a(), true);
                    } else if (annotation instanceof C53082m) {
                        aVar.mo110664a("OPTIONS", ((C53082m) annotation).mo110610a(), false);
                    } else if (annotation instanceof C53077h) {
                        C53077h hVar = (C53077h) annotation;
                        aVar.mo110664a(hVar.mo110605a(), hVar.mo110606b(), hVar.mo110607c());
                    } else if (annotation instanceof C53080k) {
                        String[] a = ((C53080k) annotation).mo110609a();
                        if (a.length != 0) {
                            aVar.f131686r = aVar.mo110663a(a);
                        } else {
                            throw aVar.mo110662a("@Headers annotation is empty.", new Object[0]);
                        }
                    } else if (annotation instanceof C53081l) {
                        if (!aVar.f131683o) {
                            aVar.f131684p = true;
                        } else {
                            throw aVar.mo110662a("Only one encoding annotation is allowed.", new Object[0]);
                        }
                    } else if (!(annotation instanceof C53074e)) {
                        continue;
                    } else if (!aVar.f131684p) {
                        aVar.f131683o = true;
                    } else {
                        throw aVar.mo110662a("Only one encoding annotation is allowed.", new Object[0]);
                    }
                }
                if (aVar.f131681m != null) {
                    if (!aVar.f131682n) {
                        if (aVar.f131684p) {
                            throw aVar.mo110662a("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        } else if (aVar.f131683o) {
                            throw aVar.mo110662a("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    }
                    int length = aVar.f131672d.length;
                    aVar.f131689u = new C53111j[length];
                    int i = 0;
                    while (i < length) {
                        Type type = aVar.f131673e[i];
                        if (!C53139p.m112967d(type)) {
                            Annotation[] annotationArr2 = aVar.f131672d[i];
                            if (annotationArr2 != null) {
                                aVar.f131689u[i] = aVar.mo110660a(i, type, annotationArr2);
                                i++;
                            } else {
                                throw aVar.mo110661a(i, "No Retrofit annotation found.", new Object[0]);
                            }
                        } else {
                            throw aVar.mo110661a(i, "Parameter type must not include a type variable or wildcard: %s", type);
                        }
                    }
                    if (aVar.f131685q == null) {
                        if (!aVar.f131680l) {
                            throw aVar.mo110662a("Missing either @%s URL or @Url parameter.", aVar.f131681m);
                        }
                    }
                    if (!aVar.f131683o && !aVar.f131684p && !aVar.f131682n) {
                        if (aVar.f131677i) {
                            throw aVar.mo110662a("Non-body HTTP method cannot contain @Body.", new Object[0]);
                        }
                    }
                    if (aVar.f131683o) {
                        if (!aVar.f131675g) {
                            throw aVar.mo110662a("Form-encoded method must contain at least one @Field.", new Object[0]);
                        }
                    }
                    if (aVar.f131684p) {
                        if (!aVar.f131676h) {
                            throw aVar.mo110662a("Multipart method must contain at least one @Part.", new Object[0]);
                        }
                    }
                    C53137o<?, ?> oVar3 = new C53137o<>(aVar);
                    this.f131644g.put(method, oVar3);
                    oVar = oVar3;
                } else {
                    throw aVar.mo110662a("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
            }
        }
        return oVar;
    }

    /* renamed from: a */
    public final <T> C53095e<T, String> mo110648a(Type type, Annotation[] annotationArr) {
        C53139p.m112957a(type, "type == null");
        C53139p.m112957a(annotationArr, "annotations == null");
        int size = this.f131640c.size();
        for (int i = 0; i < size; i++) {
            this.f131640c.get(i);
        }
        return C53047d.f131528a;
    }

    /* renamed from: a */
    public final <T> C53095e<T, C53500ac> mo110649a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C53139p.m112957a(type, "type == null");
        C53139p.m112957a(annotationArr, "parameterAnnotations == null");
        C53139p.m112957a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f131640c.indexOf(null) + 1;
        int size = this.f131640c.size();
        for (int i = indexOf; i < size; i++) {
            C53095e<T, C53500ac> a = ((C53096a) this.f131640c.get(i)).mo110589a(type, annotationArr, annotationArr2, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f131640c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C53096a) this.f131640c.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    C53134n(C53525a aVar, C53673t tVar, List<C53096a> list, List<C53069a> list2, Executor executor, boolean z) {
        this.f131638a = aVar;
        this.f131639b = tVar;
        this.f131640c = Collections.unmodifiableList(list);
        this.f131641d = Collections.unmodifiableList(list2);
        this.f131642e = executor;
        this.f131643f = z;
    }
}
