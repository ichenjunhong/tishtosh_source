package com.bytedance.retrofit2;

import android.os.SystemClock;
import com.bytedance.retrofit2.C12725c.C12726a;
import com.bytedance.retrofit2.C12744f.C12745a;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12683a.C12684a;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12688d;
import com.bytedance.retrofit2.p831b.C12696ac;
import com.bytedance.retrofit2.p831b.C12697ad;
import com.bytedance.retrofit2.p831b.C12701c;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12707i;
import com.bytedance.retrofit2.p831b.C12708j;
import com.bytedance.retrofit2.p831b.C12712n;
import com.bytedance.retrofit2.p831b.C12715q;
import com.bytedance.retrofit2.p831b.C12716r;
import com.bytedance.retrofit2.p831b.C12717s;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12719u;
import com.bytedance.retrofit2.p831b.C12723y;
import com.bytedance.retrofit2.p833c.C12727a;
import com.p683ss.android.ugc.aweme.policy.Policy;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
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
import p2666g.p2672c.C53092w;

/* renamed from: com.bytedance.retrofit2.q */
public final class C12792q {

    /* renamed from: a */
    public final C12684a f33444a;

    /* renamed from: b */
    public final C12748h f33445b;

    /* renamed from: c */
    public final List<C12745a> f33446c;

    /* renamed from: d */
    public final List<C12726a> f33447d;

    /* renamed from: e */
    public final Executor f33448e;

    /* renamed from: f */
    public final Executor f33449f;

    /* renamed from: g */
    public final List<C12727a> f33450g;

    /* renamed from: h */
    private final Map<Method, C12797t> f33451h = new LinkedHashMap();

    /* renamed from: i */
    private final boolean f33452i;

    /* renamed from: com.bytedance.retrofit2.q$a */
    public static final class C12794a {

        /* renamed from: a */
        private C12787p f33456a;

        /* renamed from: b */
        private C12684a f33457b;

        /* renamed from: c */
        private C12748h f33458c;

        /* renamed from: d */
        private List<C12727a> f33459d;

        /* renamed from: e */
        private List<C12745a> f33460e;

        /* renamed from: f */
        private List<C12726a> f33461f;

        /* renamed from: g */
        private Executor f33462g;

        /* renamed from: h */
        private Executor f33463h;

        /* renamed from: i */
        private boolean f33464i;

        public C12794a() {
            this(C12787p.m25632a());
        }

        /* renamed from: a */
        public final C12792q mo23947a() {
            if (this.f33458c == null) {
                throw new IllegalStateException("Endpoint may not be null.");
            } else if (this.f33457b == null) {
                throw new IllegalStateException("ClientProvider may not be null.");
            } else if (this.f33462g != null) {
                Executor executor = this.f33463h;
                if (executor == null) {
                    executor = this.f33456a.mo23930c();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f33461f);
                arrayList.add(this.f33456a.mo23929a(executor2));
                C12792q qVar = new C12792q(this.f33458c, this.f33457b, this.f33459d, new ArrayList(this.f33460e), arrayList, this.f33462g, executor2, this.f33464i);
                return qVar;
            } else {
                throw new IllegalStateException("HttpExecutor may not be null.");
            }
        }

        /* renamed from: b */
        private C12794a m25650b(C12684a aVar) {
            this.f33457b = (C12684a) C12801w.m25696a(aVar, "provider == null");
            return this;
        }

        /* renamed from: a */
        public final C12794a mo23941a(C12684a aVar) {
            return m25650b((C12684a) C12801w.m25696a(aVar, "provider == null"));
        }

        /* renamed from: a */
        public final C12794a mo23942a(C12726a aVar) {
            this.f33461f.add(C12801w.m25696a(aVar, "factory == null"));
            return this;
        }

        private C12794a(C12787p pVar) {
            this.f33459d = new LinkedList();
            this.f33460e = new ArrayList();
            this.f33461f = new ArrayList();
            this.f33456a = pVar;
            this.f33460e.add(new C12673a());
        }

        /* renamed from: a */
        public final C12794a mo23943a(C12727a aVar) {
            this.f33459d.add((C12727a) C12801w.m25696a(aVar, "interceptor == null"));
            return this;
        }

        /* renamed from: a */
        public final C12794a mo23944a(C12745a aVar) {
            this.f33460e.add(C12801w.m25696a(aVar, "factory == null"));
            return this;
        }

        /* renamed from: a */
        public final C12794a mo23945a(String str) {
            if (str == null || str.trim().length() == 0) {
                throw new NullPointerException("Endpoint may not be blank.");
            }
            this.f33458c = C12749i.m25592a(str);
            return this;
        }

        /* renamed from: a */
        public final C12794a mo23946a(Executor executor) {
            this.f33462g = (Executor) C12801w.m25696a(executor, "httpExecutor == null");
            return this;
        }
    }

    /* renamed from: b */
    private void m25642b(Class<?> cls) {
        for (Method a : cls.getDeclaredMethods()) {
            mo23936a(a);
        }
    }

    /* renamed from: a */
    public final <T> T mo23937a(final Class<T> cls) {
        C12801w.m25700a(cls);
        if (this.f33452i) {
            m25642b(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {

            /* renamed from: c */
            private final C12787p f33455c = C12787p.m25632a();

            public final Object invoke(Object obj, Method method, Object... objArr) throws Throwable {
                C12796s sVar = new C12796s();
                sVar.f33469b = System.currentTimeMillis();
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                sVar.f33474g = SystemClock.uptimeMillis();
                C12797t a = C12792q.this.mo23936a(method);
                sVar.f33475h = SystemClock.uptimeMillis();
                a.f33507n = sVar;
                return a.f33497d.mo23896a(new SsHttpCall(a, objArr));
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C12797t mo23936a(Method method) {
        C12797t tVar;
        Annotation[] annotationArr;
        synchronized (this.f33451h) {
            tVar = (C12797t) this.f33451h.get(method);
            if (tVar == null) {
                C12798a aVar = new C12798a(this, method);
                aVar.f33524F = aVar.mo23951a();
                aVar.f33537m = aVar.f33524F.mo23897a();
                if (aVar.f33537m != C12688d.class) {
                    aVar.f33523E = aVar.mo23957b();
                    for (Annotation annotation : aVar.f33527c) {
                        if (annotation instanceof C12701c) {
                            aVar.mo23956a(Policy.ACTION_DELETE, ((C12701c) annotation).mo23872a(), false);
                        } else if (annotation instanceof C12706h) {
                            aVar.mo23956a("GET", ((C12706h) annotation).mo23876a(), false);
                        } else if (annotation instanceof C12707i) {
                            aVar.mo23956a("HEAD", ((C12707i) annotation).mo23877a(), false);
                            if (!Void.class.equals(aVar.f33537m)) {
                                throw aVar.mo23954a("HEAD method must use Void as response type.", new Object[0]);
                            }
                        } else if (annotation instanceof C12717s) {
                            aVar.mo23956a("PATCH", ((C12717s) annotation).mo23885a(), true);
                        } else if (annotation instanceof C12718t) {
                            aVar.mo23956a("POST", ((C12718t) annotation).mo23886a(), true);
                        } else if (annotation instanceof C12719u) {
                            aVar.mo23956a("PUT", ((C12719u) annotation).mo23887a(), true);
                        } else if (annotation instanceof C12716r) {
                            aVar.mo23956a("OPTIONS", ((C12716r) annotation).mo23884a(), false);
                        } else if (annotation instanceof C12708j) {
                            C12708j jVar = (C12708j) annotation;
                            aVar.mo23956a(jVar.mo23878a(), jVar.mo23879b(), jVar.mo23880c());
                        } else if (annotation instanceof C12712n) {
                            String[] a = ((C12712n) annotation).mo23882a();
                            if (a.length != 0) {
                                aVar.f33550z = aVar.mo23955a(a);
                            } else {
                                throw aVar.mo23954a("@Headers annotation is empty.", new Object[0]);
                            }
                        } else if (annotation instanceof C12715q) {
                            if (!aVar.f33547w) {
                                aVar.f33548x = true;
                            } else {
                                throw aVar.mo23954a("Only one encoding annotation is allowed.", new Object[0]);
                            }
                        } else if (annotation instanceof C12705g) {
                            if (!aVar.f33548x) {
                                aVar.f33547w = true;
                            } else {
                                throw aVar.mo23954a("Only one encoding annotation is allowed.", new Object[0]);
                            }
                        } else if (annotation instanceof C12697ad) {
                            aVar.f33532h = true;
                        } else if (annotation instanceof C12723y) {
                            aVar.f33530f = ((C12723y) annotation).mo23893a();
                        } else if (annotation instanceof C12696ac) {
                            aVar.f33531g = ((C12696ac) annotation).mo23871a();
                        }
                        if (C12787p.m25633b()) {
                            if (annotation instanceof C53071b) {
                                aVar.mo23956a(Policy.ACTION_DELETE, ((C53071b) annotation).mo110599a(), false);
                            } else if (annotation instanceof C53075f) {
                                aVar.mo23956a("GET", ((C53075f) annotation).mo110603a(), false);
                            } else if (annotation instanceof C53076g) {
                                aVar.mo23956a("HEAD", ((C53076g) annotation).mo110604a(), false);
                                if (!Void.class.equals(aVar.f33537m)) {
                                    throw aVar.mo23954a("HEAD method must use Void as response type.", new Object[0]);
                                }
                            } else if (annotation instanceof C53083n) {
                                aVar.mo23956a("PATCH", ((C53083n) annotation).mo110611a(), true);
                            } else if (annotation instanceof C53084o) {
                                aVar.mo23956a("POST", ((C53084o) annotation).mo110612a(), true);
                            } else if (annotation instanceof C53085p) {
                                aVar.mo23956a("PUT", ((C53085p) annotation).mo110613a(), true);
                            } else if (annotation instanceof C53082m) {
                                aVar.mo23956a("OPTIONS", ((C53082m) annotation).mo110610a(), false);
                            } else if (annotation instanceof C53077h) {
                                C53077h hVar = (C53077h) annotation;
                                aVar.mo23956a(hVar.mo110605a(), hVar.mo110606b(), hVar.mo110607c());
                            } else if (annotation instanceof C53080k) {
                                String[] a2 = ((C53080k) annotation).mo110609a();
                                if (a2.length != 0) {
                                    aVar.f33550z = aVar.mo23955a(a2);
                                } else {
                                    throw aVar.mo23954a("@Headers annotation is empty.", new Object[0]);
                                }
                            } else if (annotation instanceof C53081l) {
                                if (!aVar.f33547w) {
                                    aVar.f33548x = true;
                                } else {
                                    throw aVar.mo23954a("Only one encoding annotation is allowed.", new Object[0]);
                                }
                            } else if (annotation instanceof C53074e) {
                                if (!aVar.f33548x) {
                                    aVar.f33547w = true;
                                } else {
                                    throw aVar.mo23954a("Only one encoding annotation is allowed.", new Object[0]);
                                }
                            } else if (annotation instanceof C53092w) {
                                aVar.f33532h = true;
                            }
                        }
                    }
                    if (aVar.f33545u != null) {
                        if (!aVar.f33546v && !aVar.f33535k) {
                            if (aVar.f33548x) {
                                throw aVar.mo23954a("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                            } else if (aVar.f33547w) {
                                throw aVar.mo23954a("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                            }
                        }
                        int length = aVar.f33528d.length;
                        aVar.f33522D = new C12761o[length];
                        int i = 0;
                        while (i < length) {
                            Type type = aVar.f33529e[i];
                            if (!C12801w.m25706d(type)) {
                                Annotation[] annotationArr2 = aVar.f33528d[i];
                                if (annotationArr2 != null) {
                                    aVar.f33522D[i] = aVar.mo23952a(i, type, annotationArr2);
                                    i++;
                                } else {
                                    throw aVar.mo23953a(i, "No Retrofit annotation found.", new Object[0]);
                                }
                            } else {
                                throw aVar.mo23953a(i, "Parameter type must not include a type variable or wildcard: %s", type);
                            }
                        }
                        if (aVar.f33549y == null) {
                            if (!aVar.f33543s) {
                                throw aVar.mo23954a("Missing either @%s URL or @Url parameter.", aVar.f33545u);
                            }
                        }
                        if (!aVar.f33547w && !aVar.f33548x && !aVar.f33546v && !aVar.f33535k) {
                            if (aVar.f33540p) {
                                throw aVar.mo23954a("Non-body HTTP method cannot contain @Body.", new Object[0]);
                            }
                        }
                        if (aVar.f33547w) {
                            if (!aVar.f33538n) {
                                throw aVar.mo23954a("Form-encode method must contain at least one @Field.", new Object[0]);
                            }
                        }
                        if (aVar.f33548x) {
                            if (!aVar.f33539o) {
                                throw aVar.mo23954a("Multipart method must contain at least one @Part.", new Object[0]);
                            }
                        }
                        C12797t tVar2 = new C12797t(aVar);
                        this.f33451h.put(method, tVar2);
                        tVar = tVar2;
                    } else {
                        throw aVar.mo23954a("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("'");
                    sb.append(C12801w.m25695a(aVar.f33537m).getName());
                    sb.append("' is not a valid response body type.");
                    throw aVar.mo23954a(sb.toString(), new Object[0]);
                }
            }
        }
        return tVar;
    }

    /* renamed from: a */
    public final <T> C12744f<T, Object> mo23934a(Type type, Annotation[] annotationArr) {
        C12801w.m25696a(type, "type == null");
        C12801w.m25696a(annotationArr, "annotations == null");
        int size = this.f33446c.size();
        for (int i = 0; i < size; i++) {
            C12744f<T, Object> b = ((C12745a) this.f33446c.get(i)).mo23850b(type, annotationArr, this);
            if (b != null) {
                return b;
            }
        }
        throw new IllegalArgumentException("Could not locate object converter");
    }

    /* renamed from: b */
    public final <T> C12744f<T, String> mo23938b(Type type, Annotation[] annotationArr) {
        C12801w.m25696a(type, "type == null");
        C12801w.m25696a(annotationArr, "annotations == null");
        int size = this.f33446c.size();
        for (int i = 0; i < size; i++) {
            C12744f<T, String> c = ((C12745a) this.f33446c.get(i)).mo23851c(type, annotationArr, this);
            if (c != null) {
                return c;
            }
        }
        return C12681h.f33316a;
    }

    /* renamed from: c */
    public final <T> C12744f<T, C12685b> mo23939c(Type type, Annotation[] annotationArr) {
        C12801w.m25696a(type, "type == null");
        C12801w.m25696a(annotationArr, "annotations == null");
        int size = this.f33446c.size();
        for (int i = 0; i < size; i++) {
            C12744f<T, C12685b> d = ((C12745a) this.f33446c.get(i)).mo23852d(type, annotationArr, this);
            if (d != null) {
                return d;
            }
        }
        throw new IllegalArgumentException("Could not locate header converter");
    }

    /* renamed from: a */
    public final <T> C12744f<T, TypedOutput> mo23935a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C12801w.m25696a(type, "type == null");
        C12801w.m25696a(annotationArr, "parameterAnnotations == null");
        C12801w.m25696a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f33446c.indexOf(null) + 1;
        int size = this.f33446c.size();
        for (int i = indexOf; i < size; i++) {
            C12744f<T, TypedOutput> a = ((C12745a) this.f33446c.get(i)).mo9552a(type, annotationArr, annotationArr2, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f33446c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C12745a) this.f33446c.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final C12725c<?> mo23933a(C12726a aVar, Type type, Annotation[] annotationArr) {
        C12801w.m25696a(type, "returnType == null");
        C12801w.m25696a(annotationArr, "annotations == null");
        int indexOf = this.f33447d.indexOf(aVar) + 1;
        int size = this.f33447d.size();
        for (int i = indexOf; i < size; i++) {
            C12725c<?> a = ((C12726a) this.f33447d.get(i)).mo23898a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(((C12726a) this.f33447d.get(i2)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f33447d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C12726a) this.f33447d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    C12792q(C12748h hVar, C12684a aVar, List<C12727a> list, List<C12745a> list2, List<C12726a> list3, Executor executor, Executor executor2, boolean z) {
        this.f33445b = hVar;
        this.f33444a = aVar;
        this.f33450g = list;
        this.f33446c = Collections.unmodifiableList(list2);
        this.f33447d = Collections.unmodifiableList(list3);
        this.f33449f = executor;
        this.f33448e = executor2;
        this.f33452i = z;
    }
}
