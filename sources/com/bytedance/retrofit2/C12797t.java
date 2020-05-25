package com.bytedance.retrofit2;

import android.text.TextUtils;
import com.C2240a;
import com.bytedance.retrofit2.C12725c.C12726a;
import com.bytedance.retrofit2.C12744f.C12745a;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p830a.C12683a.C12684a;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p831b.C12691a;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12695ab;
import com.bytedance.retrofit2.p831b.C12698ae;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12702d;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12709k;
import com.bytedance.retrofit2.p831b.C12710l;
import com.bytedance.retrofit2.p831b.C12711m;
import com.bytedance.retrofit2.p831b.C12713o;
import com.bytedance.retrofit2.p831b.C12714p;
import com.bytedance.retrofit2.p831b.C12720v;
import com.bytedance.retrofit2.p831b.C12721w;
import com.bytedance.retrofit2.p831b.C12722x;
import com.bytedance.retrofit2.p831b.C12724z;
import com.bytedance.retrofit2.p831b.p832a.C12692a;
import com.bytedance.retrofit2.p831b.p832a.C12693b;
import com.bytedance.retrofit2.p833c.C12727a;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.C53500ac;
import okhttp3.C53671s;
import okhttp3.C53679x.C53681b;
import p2666g.p2672c.C53070a;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53073d;
import p2666g.p2672c.C53078i;
import p2666g.p2672c.C53079j;
import p2666g.p2672c.C53086q;
import p2666g.p2672c.C53087r;
import p2666g.p2672c.C53088s;
import p2666g.p2672c.C53089t;
import p2666g.p2672c.C53090u;
import p2666g.p2672c.C53091v;
import p2666g.p2672c.C53093x;

/* renamed from: com.bytedance.retrofit2.t */
final class C12797t<T> {

    /* renamed from: a */
    static final Pattern f33494a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: b */
    static final Pattern f33495b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: c */
    final C12684a f33496c;

    /* renamed from: d */
    final C12725c<?> f33497d;

    /* renamed from: e */
    final List<C12727a> f33498e;

    /* renamed from: f */
    final Executor f33499f;

    /* renamed from: g */
    final int f33500g;

    /* renamed from: h */
    final String f33501h;

    /* renamed from: i */
    final boolean f33502i;

    /* renamed from: j */
    final int f33503j;

    /* renamed from: k */
    final boolean f33504k;

    /* renamed from: l */
    final Object f33505l;

    /* renamed from: m */
    final Method f33506m;

    /* renamed from: n */
    public C12796s f33507n;

    /* renamed from: o */
    private final C12748h f33508o;

    /* renamed from: p */
    private final C12744f<TypedInput, T> f33509p;

    /* renamed from: q */
    private final String f33510q;

    /* renamed from: r */
    private final String f33511r;

    /* renamed from: s */
    private final boolean f33512s;

    /* renamed from: t */
    private final boolean f33513t;

    /* renamed from: u */
    private final boolean f33514u;

    /* renamed from: v */
    private final boolean f33515v;

    /* renamed from: w */
    private final C12761o<?>[] f33516w;

    /* renamed from: x */
    private List<C12685b> f33517x;

    /* renamed from: y */
    private String f33518y;

    /* renamed from: com.bytedance.retrofit2.t$a */
    static final class C12798a<T> {

        /* renamed from: A */
        String f33519A;

        /* renamed from: B */
        Set<String> f33520B;

        /* renamed from: C */
        String f33521C;

        /* renamed from: D */
        C12761o<?>[] f33522D;

        /* renamed from: E */
        C12744f<TypedInput, T> f33523E;

        /* renamed from: F */
        C12725c<?> f33524F;

        /* renamed from: a */
        final C12792q f33525a;

        /* renamed from: b */
        final Method f33526b;

        /* renamed from: c */
        final Annotation[] f33527c;

        /* renamed from: d */
        final Annotation[][] f33528d;

        /* renamed from: e */
        final Type[] f33529e;

        /* renamed from: f */
        int f33530f = 1;

        /* renamed from: g */
        String f33531g = "";

        /* renamed from: h */
        boolean f33532h;

        /* renamed from: i */
        int f33533i = -1;

        /* renamed from: j */
        boolean f33534j = true;

        /* renamed from: k */
        boolean f33535k;

        /* renamed from: l */
        Object f33536l;

        /* renamed from: m */
        Type f33537m;

        /* renamed from: n */
        boolean f33538n;

        /* renamed from: o */
        boolean f33539o;

        /* renamed from: p */
        boolean f33540p;

        /* renamed from: q */
        boolean f33541q;

        /* renamed from: r */
        boolean f33542r;

        /* renamed from: s */
        boolean f33543s;

        /* renamed from: t */
        boolean f33544t;

        /* renamed from: u */
        String f33545u;

        /* renamed from: v */
        boolean f33546v;

        /* renamed from: w */
        boolean f33547w;

        /* renamed from: x */
        boolean f33548x;

        /* renamed from: y */
        String f33549y;

        /* renamed from: z */
        List<C12685b> f33550z;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C12725c<?> mo23951a() {
            Type genericReturnType = this.f33526b.getGenericReturnType();
            if (C12801w.m25706d(genericReturnType)) {
                throw mo23954a("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                try {
                    return this.f33525a.mo23933a((C12726a) null, genericReturnType, this.f33526b.getAnnotations());
                } catch (RuntimeException e) {
                    throw m25675a((Throwable) e, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw mo23954a("Service methods cannot return void.", new Object[0]);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo23956a(String str, String str2, boolean z) {
            if (this.f33545u == null) {
                this.f33545u = str;
                if (str != null) {
                    this.f33521C = C12797t.m25666b(str);
                }
                if (this.f33521C != null) {
                    this.f33535k = true;
                }
                this.f33546v = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (C12797t.f33494a.matcher(substring).find()) {
                            throw mo23954a("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f33549y = str2;
                    this.f33520B = C12797t.m25665a(str2);
                    return;
                }
                return;
            }
            throw mo23954a("Only one HTTP method is allowed. Found: %s and %s.", this.f33545u, str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public List<C12685b> mo23955a(String[] strArr) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw mo23954a("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    this.f33519A = trim;
                } else {
                    arrayList.add(new C12685b(substring, trim));
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C12761o<?> mo23952a(int i, Type type, Annotation[] annotationArr) {
            C12761o<?> oVar = null;
            for (Annotation annotation : annotationArr) {
                C12761o<?> a = m25669a(i, type, annotationArr, annotation);
                if (a == null && C12787p.m25633b()) {
                    a = m25678b(i, type, annotationArr, annotation);
                }
                if (a != null) {
                    if (oVar == null) {
                        oVar = a;
                    } else {
                        throw mo23953a(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (oVar != null) {
                return oVar;
            }
            throw mo23953a(i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: a */
        private static C53671s m25676a(String str, String str2) {
            StringBuilder sb = new StringBuilder("form-data; name=\"");
            sb.append(str);
            sb.append("\"");
            return C53671s.m114150a("Content-Disposition", sb.toString(), "Content-Transfer-Encoding", str2);
        }

        /* renamed from: a */
        private void m25677a(int i, String str) {
            if (!C12797t.f33495b.matcher(str).matches()) {
                throw mo23953a(i, "@Path parameter name must match %s. Found: %s", C12797t.f33494a.pattern(), str);
            } else if (!this.f33520B.contains(str)) {
                throw mo23953a(i, "URL \"%s\" does not contain \"{%s}\".", this.f33549y, str);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public RuntimeException mo23953a(int i, String str, Object... objArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (parameter #");
            sb.append(i + 1);
            sb.append(")");
            return mo23954a(sb.toString(), objArr);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C12744f<TypedInput, T> mo23957b() {
            Annotation[] annotations = this.f33526b.getAnnotations();
            try {
                C12792q qVar = this.f33525a;
                Type type = this.f33537m;
                C12801w.m25696a(type, "type == null");
                C12801w.m25696a(annotations, "annotations == null");
                int indexOf = qVar.f33446c.indexOf(null) + 1;
                int size = qVar.f33446c.size();
                for (int i = indexOf; i < size; i++) {
                    C12744f<TypedInput, T> a = ((C12745a) qVar.f33446c.get(i)).mo9551a(type, annotations, qVar);
                    if (a != null) {
                        return a;
                    }
                }
                StringBuilder sb = new StringBuilder("Could not locate TypeInput converter for ");
                sb.append(type);
                sb.append(".\n");
                sb.append("  Tried:");
                int size2 = qVar.f33446c.size();
                while (indexOf < size2) {
                    sb.append("\n   * ");
                    sb.append(((C12745a) qVar.f33446c.get(indexOf)).getClass().getName());
                    indexOf++;
                }
                throw new IllegalArgumentException(sb.toString());
            } catch (RuntimeException e) {
                throw m25675a((Throwable) e, "Unable to create converter for %s", this.f33537m);
            }
        }

        /* renamed from: a */
        private static C12761o<?> m25672a(Type type) {
            if (C53500ac.class.isAssignableFrom(C12801w.m25695a(type))) {
                return C12766c.f33407a;
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public RuntimeException mo23954a(String str, Object... objArr) {
            return m25675a((Throwable) null, str, objArr);
        }

        /* renamed from: a */
        private static C12761o<?> m25671a(ParameterizedType parameterizedType, Annotation annotation) {
            if (C53500ac.class.isAssignableFrom(C12801w.m25695a(C12801w.m25697a(1, parameterizedType)))) {
                return new C12768e(((C12721w) annotation).mo23890a());
            }
            return null;
        }

        public C12798a(C12792q qVar, Method method) {
            this.f33525a = qVar;
            this.f33526b = method;
            this.f33527c = method.getAnnotations();
            this.f33529e = method.getGenericParameterTypes();
            this.f33528d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        private C12761o<?> m25673a(Type type, String str, String str2) {
            Class a = C12801w.m25695a(type);
            if (TextUtils.isEmpty(str)) {
                if (Iterable.class.isAssignableFrom(a)) {
                    if ((type instanceof ParameterizedType) && C53681b.class.isAssignableFrom(C12801w.m25695a(C12801w.m25697a(0, (ParameterizedType) type)))) {
                        return C12769f.f33410a.mo23926a();
                    }
                } else if (a.isArray()) {
                    if (C53681b.class.isAssignableFrom(a.getComponentType())) {
                        return C12769f.f33410a.mo23928b();
                    }
                } else if (C53681b.class.isAssignableFrom(a)) {
                    return C12769f.f33410a;
                }
            } else if (Iterable.class.isAssignableFrom(a)) {
                if ((type instanceof ParameterizedType) && C53500ac.class.isAssignableFrom(C12801w.m25695a(C12801w.m25697a(0, (ParameterizedType) type)))) {
                    return new C12767d(m25676a(str, str2)).mo23926a();
                }
            } else if (a.isArray()) {
                if (C53500ac.class.isAssignableFrom(C12797t.m25664a(a.getComponentType()))) {
                    return new C12767d(m25676a(str, str2)).mo23928b();
                }
            } else if (C53500ac.class.isAssignableFrom(a)) {
                return new C12767d(m25676a(str, str2));
            }
            return null;
        }

        /* renamed from: a */
        private RuntimeException m25675a(Throwable th, String str, Object... objArr) {
            String a = C2240a.m6772a(str, objArr);
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n    for method ");
            sb.append(this.f33526b.getDeclaringClass().getSimpleName());
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(this.f33526b.getName());
            return new IllegalArgumentException(sb.toString(), th);
        }

        /* renamed from: a */
        private RuntimeException m25674a(Throwable th, int i, String str, Object... objArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (parameter #");
            sb.append(i + 1);
            sb.append(")");
            return m25675a(th, sb.toString(), objArr);
        }

        /* renamed from: a */
        private C12761o<?> m25669a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof C12699af) {
                if (this.f33543s) {
                    throw mo23953a(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f33541q) {
                    throw mo23953a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f33542r) {
                    throw mo23953a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f33549y == null) {
                    this.f33543s = true;
                    if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new C12785v();
                    }
                    throw mo23953a(i, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw mo23953a(i, "@Url cannot be used with @%s URL", this.f33545u);
                }
            } else if (annotation instanceof C12722x) {
                if (this.f33542r) {
                    throw mo23953a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f33543s) {
                    throw mo23953a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f33549y != null) {
                    this.f33541q = true;
                    C12722x xVar = (C12722x) annotation;
                    String a = xVar.mo23891a();
                    m25677a(i, a);
                    return new C12780q(a, this.f33525a.mo23938b(type, annotationArr), xVar.mo23892b());
                } else {
                    throw mo23953a(i, "@Path can only be used with relative url on @%s", this.f33545u);
                }
            } else if (annotation instanceof C12724z) {
                C12724z zVar = (C12724z) annotation;
                return m25670a(i, type, annotationArr, false, zVar.mo23894a(), zVar.mo23895b());
            } else if (annotation instanceof C12695ab) {
                return m25670a(i, type, annotationArr, true, null, ((C12695ab) annotation).mo23870a());
            } else if (annotation instanceof C12694aa) {
                Class a2 = C12801w.m25695a(type);
                if (Map.class.isAssignableFrom(a2)) {
                    Type a3 = C12801w.m25698a(type, a2, Map.class);
                    if (a3 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) a3;
                        Type a4 = C12801w.m25697a(0, parameterizedType);
                        if (String.class == a4) {
                            return new C12782s(this.f33525a.mo23938b(C12801w.m25697a(1, parameterizedType), annotationArr), ((C12694aa) annotation).mo23869a());
                        }
                        StringBuilder sb = new StringBuilder("@QueryMap keys must be of type String: ");
                        sb.append(a4);
                        throw mo23953a(i, sb.toString(), new Object[0]);
                    }
                    throw mo23953a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw mo23953a(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C12709k) {
                String a5 = ((C12709k) annotation).mo23881a();
                Class a6 = C12801w.m25695a(type);
                if (Iterable.class.isAssignableFrom(a6)) {
                    if (type instanceof ParameterizedType) {
                        return new C12773j(a5, this.f33525a.mo23938b(C12801w.m25697a(0, (ParameterizedType) type), annotationArr)).mo23926a();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a6.getSimpleName());
                    sb2.append(" must include generic type (e.g., ");
                    sb2.append(a6.getSimpleName());
                    sb2.append("<String>)");
                    throw mo23953a(i, sb2.toString(), new Object[0]);
                } else if (!a6.isArray()) {
                    return new C12773j(a5, this.f33525a.mo23938b(type, annotationArr));
                } else {
                    return new C12773j(a5, this.f33525a.mo23938b(C12797t.m25664a(a6.getComponentType()), annotationArr)).mo23928b();
                }
            } else if (annotation instanceof C12710l) {
                Class a7 = C12801w.m25695a(type);
                if (List.class.isAssignableFrom(a7)) {
                    Type a8 = C12801w.m25698a(type, a7, List.class);
                    if (a8 instanceof ParameterizedType) {
                        Type a9 = C12801w.m25697a(0, (ParameterizedType) a8);
                        if (C12685b.class == a9) {
                            return new C12774k(this.f33525a.mo23939c(a9, annotationArr));
                        }
                        StringBuilder sb3 = new StringBuilder("@HeaderList keys must be of type retrofit.client.Header: ");
                        sb3.append(a9);
                        throw mo23953a(i, sb3.toString(), new Object[0]);
                    }
                    throw mo23953a(i, "List must include generic types (e.g., List<Header>)", new Object[0]);
                }
                throw mo23953a(i, "@HeaderList parameter type must be List.", new Object[0]);
            } else if (annotation instanceof C12711m) {
                Class a10 = C12801w.m25695a(type);
                if (Map.class.isAssignableFrom(a10)) {
                    Type a11 = C12801w.m25698a(type, a10, Map.class);
                    if (a11 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) a11;
                        Type a12 = C12801w.m25697a(0, parameterizedType2);
                        if (String.class == a12) {
                            return new C12775l(this.f33525a.mo23938b(C12801w.m25697a(1, parameterizedType2), annotationArr));
                        }
                        StringBuilder sb4 = new StringBuilder("@HeaderMap keys must be of type String: ");
                        sb4.append(a12);
                        throw mo23953a(i, sb4.toString(), new Object[0]);
                    }
                    throw mo23953a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw mo23953a(i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C12703e) {
                if (this.f33547w) {
                    C12703e eVar = (C12703e) annotation;
                    String a13 = eVar.mo23873a();
                    boolean b = eVar.mo23874b();
                    this.f33538n = true;
                    Class a14 = C12801w.m25695a(type);
                    if (Iterable.class.isAssignableFrom(a14)) {
                        if (type instanceof ParameterizedType) {
                            return new C12771h(a13, this.f33525a.mo23938b(C12801w.m25697a(0, (ParameterizedType) type), annotationArr), b).mo23926a();
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(a14.getSimpleName());
                        sb5.append(" must include generic type (e.g., ");
                        sb5.append(a14.getSimpleName());
                        sb5.append("<String>)");
                        throw mo23953a(i, sb5.toString(), new Object[0]);
                    } else if (!a14.isArray()) {
                        return new C12771h(a13, this.f33525a.mo23938b(type, annotationArr), b);
                    } else {
                        return new C12771h(a13, this.f33525a.mo23938b(C12797t.m25664a(a14.getComponentType()), annotationArr), b).mo23928b();
                    }
                } else {
                    throw mo23953a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof C12704f) {
                if (this.f33547w) {
                    Class a15 = C12801w.m25695a(type);
                    if (Map.class.isAssignableFrom(a15)) {
                        Type a16 = C12801w.m25698a(type, a15, Map.class);
                        if (a16 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) a16;
                            Type a17 = C12801w.m25697a(0, parameterizedType3);
                            if (String.class == a17) {
                                C12744f b2 = this.f33525a.mo23938b(C12801w.m25697a(1, parameterizedType3), annotationArr);
                                this.f33538n = true;
                                return new C12772i(b2, ((C12704f) annotation).mo23875a());
                            }
                            StringBuilder sb6 = new StringBuilder("@FieldMap keys must be of type String: ");
                            sb6.append(a17);
                            throw mo23953a(i, sb6.toString(), new Object[0]);
                        }
                        throw mo23953a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw mo23953a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw mo23953a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof C12720v) {
                if (this.f33548x) {
                    C12720v vVar = (C12720v) annotation;
                    this.f33539o = true;
                    C12761o<?> a18 = m25673a(type, vVar.mo23888a(), vVar.mo23889b());
                    if (a18 != null) {
                        return a18;
                    }
                    return new C12778o(vVar.mo23888a(), this.f33525a.mo23935a(type, annotationArr, this.f33527c));
                }
                throw mo23953a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof C12721w) {
                if (this.f33548x) {
                    this.f33539o = true;
                    Class a19 = C12801w.m25695a(type);
                    if (Map.class.isAssignableFrom(a19)) {
                        Type a20 = C12801w.m25698a(type, a19, Map.class);
                        if (a20 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) a20;
                            Type a21 = C12801w.m25697a(0, parameterizedType4);
                            if (String.class == a21) {
                                C12761o<?> a22 = m25671a(parameterizedType4, annotation);
                                if (a22 != null) {
                                    return a22;
                                }
                                return new C12779p(this.f33525a.mo23935a(C12801w.m25697a(1, parameterizedType4), annotationArr, this.f33527c), ((C12721w) annotation).mo23890a());
                            }
                            StringBuilder sb7 = new StringBuilder("@PartMap keys must be of type String: ");
                            sb7.append(a21);
                            throw mo23953a(i, sb7.toString(), new Object[0]);
                        }
                        throw mo23953a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw mo23953a(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw mo23953a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof C12700b) {
                if (this.f33547w || this.f33548x) {
                    throw mo23953a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f33540p) {
                    C12761o<?> a23 = m25672a(type);
                    if (a23 != null) {
                        this.f33540p = true;
                        return a23;
                    }
                    try {
                        C12744f a24 = this.f33525a.mo23935a(type, annotationArr, this.f33527c);
                        this.f33540p = true;
                        return new C12765b(this.f33535k, a24);
                    } catch (RuntimeException e) {
                        throw m25674a((Throwable) e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw mo23953a(i, "Multiple @Body method annotations found.", new Object[0]);
                }
            } else if (annotation instanceof C12714p) {
                if (!this.f33544t) {
                    this.f33544t = true;
                    String a25 = ((C12714p) annotation).mo23883a();
                    if (!C12797t.f33495b.matcher(a25).matches()) {
                        throw mo23953a(i, "@Method parameter name must match %s. Found: %s", C12797t.f33494a.pattern(), a25);
                    } else if (this.f33521C == null || this.f33521C.equals(a25)) {
                        return new C12777n(a25, this.f33525a.mo23938b(type, annotationArr));
                    } else {
                        throw mo23953a(i, "Method \"%s\" does not contain \"{%s}\".", this.f33545u, a25);
                    }
                } else {
                    throw mo23953a(i, "Multiple @Method method annotations found.", new Object[0]);
                }
            } else if (annotation instanceof C12713o) {
                try {
                    return new C12776m(this.f33525a.mo23938b(type, annotationArr));
                } catch (RuntimeException e2) {
                    throw m25674a((Throwable) e2, i, "Unable to create @MaxLength converter for %s", type);
                }
            } else if (annotation instanceof C12691a) {
                try {
                    return new C12764a(this.f33525a.mo23938b(type, annotationArr));
                } catch (RuntimeException e3) {
                    throw m25674a((Throwable) e3, i, "Unable to create @AddCommonParam converter for %s", type);
                }
            } else if (annotation instanceof C12702d) {
                try {
                    return new C12770g(this.f33525a.mo23934a(type, annotationArr));
                } catch (RuntimeException e4) {
                    throw m25674a((Throwable) e4, i, "Unable to create @ExtraInfo converter for %s", type);
                }
            } else if (annotation instanceof C12692a) {
                if (C12693b.class.isAssignableFrom(C12801w.m25695a(type))) {
                    return new C12784u();
                }
                throw mo23953a(i, "Unable to create @QueryObject for %s not QueryParamObject type", type);
            } else if (!(annotation instanceof C12698ae)) {
                return null;
            } else {
                Class a26 = C12801w.m25695a(type);
                int i2 = i - 1;
                while (i2 >= 0) {
                    C12761o<?> oVar = this.f33522D[i2];
                    if (!(oVar instanceof C12786w) || !((C12786w) oVar).f33438a.equals(a26)) {
                        i2--;
                    } else {
                        StringBuilder sb8 = new StringBuilder("@Tag type ");
                        sb8.append(a26.getName());
                        sb8.append(" is duplicate of parameter #");
                        sb8.append(i2 + 1);
                        sb8.append(" and would always overwrite its value.");
                        throw mo23953a(i, sb8.toString(), new Object[0]);
                    }
                }
                return new C12786w(a26);
            }
        }

        /* renamed from: b */
        private C12761o<?> m25678b(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof C53093x) {
                if (this.f33543s) {
                    throw mo23953a(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f33541q) {
                    throw mo23953a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f33542r) {
                    throw mo23953a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f33549y == null) {
                    this.f33543s = true;
                    if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new C12785v();
                    }
                    throw mo23953a(i, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw mo23953a(i, "@Url cannot be used with @%s URL", this.f33545u);
                }
            } else if (annotation instanceof C53088s) {
                if (this.f33542r) {
                    throw mo23953a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f33543s) {
                    throw mo23953a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f33549y != null) {
                    this.f33541q = true;
                    C53088s sVar = (C53088s) annotation;
                    String a = sVar.mo110617a();
                    m25677a(i, a);
                    return new C12780q(a, this.f33525a.mo23938b(type, annotationArr), !sVar.mo110618b());
                } else {
                    throw mo23953a(i, "@Path can only be used with relative url on @%s", this.f33545u);
                }
            } else if (annotation instanceof C53089t) {
                C53089t tVar = (C53089t) annotation;
                String a2 = tVar.mo110619a();
                boolean b = tVar.mo110620b();
                Class a3 = C12801w.m25695a(type);
                this.f33542r = true;
                if (Iterable.class.isAssignableFrom(a3)) {
                    if (type instanceof ParameterizedType) {
                        return new C12781r(a2, this.f33525a.mo23938b(C12801w.m25697a(0, (ParameterizedType) type), annotationArr), !b).mo23926a();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(a3.getSimpleName());
                    sb.append(" must include generic type (e.g., ");
                    sb.append(a3.getSimpleName());
                    sb.append("<String>)");
                    throw mo23953a(i, sb.toString(), new Object[0]);
                } else if (!a3.isArray()) {
                    return new C12781r(a2, this.f33525a.mo23938b(type, annotationArr), !b);
                } else {
                    return new C12781r(a2, this.f33525a.mo23938b(C12797t.m25664a(a3.getComponentType()), annotationArr), !b).mo23928b();
                }
            } else if (annotation instanceof C53091v) {
                boolean a4 = ((C53091v) annotation).mo110622a();
                Class a5 = C12801w.m25695a(type);
                this.f33542r = true;
                if (Iterable.class.isAssignableFrom(a5)) {
                    if (type instanceof ParameterizedType) {
                        return new C12783t(this.f33525a.mo23938b(C12801w.m25697a(0, (ParameterizedType) type), annotationArr), a4).mo23926a();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a5.getSimpleName());
                    sb2.append(" must include generic type (e.g., ");
                    sb2.append(a5.getSimpleName());
                    sb2.append("<String>)");
                    throw mo23953a(i, sb2.toString(), new Object[0]);
                } else if (!a5.isArray()) {
                    return new C12783t(this.f33525a.mo23938b(type, annotationArr), a4);
                } else {
                    return new C12783t(this.f33525a.mo23938b(C12797t.m25664a(a5.getComponentType()), annotationArr), a4).mo23928b();
                }
            } else if (annotation instanceof C53090u) {
                Class a6 = C12801w.m25695a(type);
                if (Map.class.isAssignableFrom(a6)) {
                    Type a7 = C12801w.m25698a(type, a6, Map.class);
                    if (a7 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) a7;
                        Type a8 = C12801w.m25697a(0, parameterizedType);
                        if (String.class == a8) {
                            return new C12782s(this.f33525a.mo23938b(C12801w.m25697a(1, parameterizedType), annotationArr), !((C53090u) annotation).mo110621a());
                        }
                        StringBuilder sb3 = new StringBuilder("@QueryMap keys must be of type String: ");
                        sb3.append(a8);
                        throw mo23953a(i, sb3.toString(), new Object[0]);
                    }
                    throw mo23953a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw mo23953a(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C53078i) {
                String a9 = ((C53078i) annotation).mo110608a();
                Class a10 = C12801w.m25695a(type);
                if (Iterable.class.isAssignableFrom(a10)) {
                    if (type instanceof ParameterizedType) {
                        return new C12773j(a9, this.f33525a.mo23938b(C12801w.m25697a(0, (ParameterizedType) type), annotationArr)).mo23926a();
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(a10.getSimpleName());
                    sb4.append(" must include generic type (e.g., ");
                    sb4.append(a10.getSimpleName());
                    sb4.append("<String>)");
                    throw mo23953a(i, sb4.toString(), new Object[0]);
                } else if (!a10.isArray()) {
                    return new C12773j(a9, this.f33525a.mo23938b(type, annotationArr));
                } else {
                    return new C12773j(a9, this.f33525a.mo23938b(C12797t.m25664a(a10.getComponentType()), annotationArr)).mo23928b();
                }
            } else if (annotation instanceof C53079j) {
                Class a11 = C12801w.m25695a(type);
                if (Map.class.isAssignableFrom(a11)) {
                    Type a12 = C12801w.m25698a(type, a11, Map.class);
                    if (a12 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) a12;
                        Type a13 = C12801w.m25697a(0, parameterizedType2);
                        if (String.class == a13) {
                            return new C12775l(this.f33525a.mo23938b(C12801w.m25697a(1, parameterizedType2), annotationArr));
                        }
                        StringBuilder sb5 = new StringBuilder("@HeaderMap keys must be of type String: ");
                        sb5.append(a13);
                        throw mo23953a(i, sb5.toString(), new Object[0]);
                    }
                    throw mo23953a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw mo23953a(i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C53072c) {
                if (this.f33547w) {
                    C53072c cVar = (C53072c) annotation;
                    String a14 = cVar.mo110600a();
                    boolean b2 = cVar.mo110601b();
                    this.f33538n = true;
                    Class a15 = C12801w.m25695a(type);
                    if (Iterable.class.isAssignableFrom(a15)) {
                        if (type instanceof ParameterizedType) {
                            return new C12771h(a14, this.f33525a.mo23938b(C12801w.m25697a(0, (ParameterizedType) type), annotationArr), !b2).mo23926a();
                        }
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(a15.getSimpleName());
                        sb6.append(" must include generic type (e.g., ");
                        sb6.append(a15.getSimpleName());
                        sb6.append("<String>)");
                        throw mo23953a(i, sb6.toString(), new Object[0]);
                    } else if (!a15.isArray()) {
                        return new C12771h(a14, this.f33525a.mo23938b(type, annotationArr), !b2);
                    } else {
                        return new C12771h(a14, this.f33525a.mo23938b(C12797t.m25664a(a15.getComponentType()), annotationArr), !b2).mo23928b();
                    }
                } else {
                    throw mo23953a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof C53073d) {
                if (this.f33547w) {
                    Class a16 = C12801w.m25695a(type);
                    if (Map.class.isAssignableFrom(a16)) {
                        Type a17 = C12801w.m25698a(type, a16, Map.class);
                        if (a17 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) a17;
                            Type a18 = C12801w.m25697a(0, parameterizedType3);
                            if (String.class == a18) {
                                C12744f b3 = this.f33525a.mo23938b(C12801w.m25697a(1, parameterizedType3), annotationArr);
                                this.f33538n = true;
                                return new C12772i(b3, !((C53073d) annotation).mo110602a());
                            }
                            StringBuilder sb7 = new StringBuilder("@FieldMap keys must be of type String: ");
                            sb7.append(a18);
                            throw mo23953a(i, sb7.toString(), new Object[0]);
                        }
                        throw mo23953a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw mo23953a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw mo23953a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof C53086q) {
                if (this.f33548x) {
                    C53086q qVar = (C53086q) annotation;
                    this.f33539o = true;
                    C12761o<?> a19 = m25673a(type, qVar.mo110614a(), qVar.mo110615b());
                    if (a19 != null) {
                        return a19;
                    }
                    return new C12778o(qVar.mo110614a(), this.f33525a.mo23935a(type, annotationArr, this.f33527c));
                }
                throw mo23953a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof C53087r) {
                if (this.f33548x) {
                    this.f33539o = true;
                    Class a20 = C12801w.m25695a(type);
                    if (Map.class.isAssignableFrom(a20)) {
                        Type a21 = C12801w.m25698a(type, a20, Map.class);
                        if (a21 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) a21;
                            Type a22 = C12801w.m25697a(0, parameterizedType4);
                            if (String.class == a22) {
                                C12761o<?> a23 = m25671a(parameterizedType4, annotation);
                                if (a23 != null) {
                                    return a23;
                                }
                                return new C12779p(this.f33525a.mo23935a(C12801w.m25697a(1, parameterizedType4), annotationArr, this.f33527c), ((C53087r) annotation).mo110616a());
                            }
                            StringBuilder sb8 = new StringBuilder("@PartMap keys must be of type String: ");
                            sb8.append(a22);
                            throw mo23953a(i, sb8.toString(), new Object[0]);
                        }
                        throw mo23953a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw mo23953a(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw mo23953a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof C53070a)) {
                return null;
            } else {
                if (this.f33547w || this.f33548x) {
                    throw mo23953a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f33540p) {
                    C12761o<?> a24 = m25672a(type);
                    if (a24 != null) {
                        this.f33540p = true;
                        return a24;
                    }
                    try {
                        C12744f a25 = this.f33525a.mo23935a(type, annotationArr, this.f33527c);
                        this.f33540p = true;
                        return new C12765b(this.f33535k, a25);
                    } catch (RuntimeException e) {
                        throw m25674a((Throwable) e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw mo23953a(i, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }

        /* renamed from: a */
        private C12761o m25670a(int i, Type type, Annotation[] annotationArr, boolean z, String str, boolean z2) {
            Class a = C12801w.m25695a(type);
            this.f33542r = true;
            if (Iterable.class.isAssignableFrom(a)) {
                if (type instanceof ParameterizedType) {
                    C12744f b = this.f33525a.mo23938b(C12801w.m25697a(0, (ParameterizedType) type), annotationArr);
                    if (z) {
                        return new C12783t(b, z2).mo23926a();
                    }
                    return new C12781r(str, b, z2).mo23926a();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(a.getSimpleName());
                sb.append(" must include generic type (e.g., ");
                sb.append(a.getSimpleName());
                sb.append("<String>)");
                throw mo23953a(i, sb.toString(), new Object[0]);
            } else if (a.isArray()) {
                C12744f b2 = this.f33525a.mo23938b(C12797t.m25664a(a.getComponentType()), annotationArr);
                if (z) {
                    return new C12783t(b2, z2).mo23928b();
                }
                return new C12781r(str, b2, z2).mo23928b();
            } else {
                C12744f b3 = this.f33525a.mo23938b(type, annotationArr);
                if (z) {
                    return new C12783t(b3, z2);
                }
                return new C12781r(str, b3, z2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final T mo23950a(TypedInput typedInput) throws IOException {
        return this.f33509p.mo9557a(typedInput);
    }

    /* renamed from: a */
    static Set<String> m25665a(String str) {
        Matcher matcher = f33494a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    static String m25666b(String str) {
        Matcher matcher = f33494a.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: a */
    static Class<?> m25664a(Class<?> cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        return cls;
    }

    C12797t(C12798a<T> aVar) {
        this.f33496c = aVar.f33525a.f33444a;
        this.f33497d = aVar.f33524F;
        this.f33498e = aVar.f33525a.f33450g;
        this.f33499f = aVar.f33525a.f33449f;
        this.f33508o = aVar.f33525a.f33445b;
        this.f33509p = aVar.f33523E;
        this.f33510q = aVar.f33545u;
        this.f33511r = aVar.f33549y;
        this.f33513t = aVar.f33546v;
        this.f33514u = aVar.f33547w;
        this.f33515v = aVar.f33548x;
        this.f33516w = aVar.f33522D;
        this.f33517x = aVar.f33550z;
        this.f33518y = aVar.f33519A;
        this.f33500g = aVar.f33530f;
        this.f33501h = aVar.f33531g;
        this.f33502i = aVar.f33532h;
        this.f33503j = aVar.f33533i;
        this.f33504k = aVar.f33534j;
        this.f33512s = aVar.f33535k;
        this.f33505l = aVar.f33536l;
        this.f33506m = aVar.f33526b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C12686c mo23949a(C12757k kVar, Object... objArr) throws IOException {
        int i;
        Object[] objArr2 = objArr;
        RequestBuilder requestBuilder = r2;
        RequestBuilder requestBuilder2 = new RequestBuilder(this.f33510q, this.f33508o, this.f33511r, this.f33517x, this.f33518y, this.f33500g, this.f33502i, this.f33503j, this.f33504k, this.f33505l, this.f33513t, this.f33514u, this.f33515v, this.f33501h);
        C12761o[] oVarArr = (C12761o[]) this.f33516w;
        Object[] objArr3 = objArr;
        if (objArr3 != null) {
            i = objArr3.length;
        } else {
            i = 0;
        }
        if (i == oVarArr.length) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(objArr3[i2]);
                oVarArr[i2].mo23927a(requestBuilder, objArr3[i2]);
            }
            RequestBuilder requestBuilder3 = requestBuilder;
            requestBuilder3.mo23822a(C12760n.class, new C12760n(this.f33506m, arrayList));
            return requestBuilder3.mo23820a(kVar);
        }
        StringBuilder sb = new StringBuilder("Argument count (");
        sb.append(i);
        sb.append(") doesn't match expected count (");
        sb.append(oVarArr.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
