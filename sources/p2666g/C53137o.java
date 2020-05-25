package p2666g;

import com.C2240a;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.C53498ab;
import okhttp3.C53506ae;
import okhttp3.C53524e.C53525a;
import okhttp3.C53671s;
import okhttp3.C53671s.C53672a;
import okhttp3.C53673t;
import okhttp3.C53678w;
import okhttp3.C53679x.C53681b;
import p2666g.C53068c.C53069a;
import p2666g.C53095e.C53096a;
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

/* renamed from: g.o */
final class C53137o<R, T> {

    /* renamed from: a */
    static final Pattern f131655a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: b */
    static final Pattern f131656b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: c */
    final C53525a f131657c;

    /* renamed from: d */
    final C53068c<R, T> f131658d;

    /* renamed from: e */
    final C53095e<C53506ae, R> f131659e;

    /* renamed from: f */
    private final C53673t f131660f;

    /* renamed from: g */
    private final String f131661g;

    /* renamed from: h */
    private final String f131662h;

    /* renamed from: i */
    private final C53671s f131663i;

    /* renamed from: j */
    private final C53678w f131664j;

    /* renamed from: k */
    private final boolean f131665k;

    /* renamed from: l */
    private final boolean f131666l;

    /* renamed from: m */
    private final boolean f131667m;

    /* renamed from: n */
    private final C53111j<?>[] f131668n;

    /* renamed from: g.o$a */
    static final class C53138a<T, R> {

        /* renamed from: a */
        final C53134n f131669a;

        /* renamed from: b */
        final Method f131670b;

        /* renamed from: c */
        final Annotation[] f131671c;

        /* renamed from: d */
        final Annotation[][] f131672d;

        /* renamed from: e */
        final Type[] f131673e;

        /* renamed from: f */
        Type f131674f;

        /* renamed from: g */
        boolean f131675g;

        /* renamed from: h */
        boolean f131676h;

        /* renamed from: i */
        boolean f131677i;

        /* renamed from: j */
        boolean f131678j;

        /* renamed from: k */
        boolean f131679k;

        /* renamed from: l */
        boolean f131680l;

        /* renamed from: m */
        String f131681m;

        /* renamed from: n */
        boolean f131682n;

        /* renamed from: o */
        boolean f131683o;

        /* renamed from: p */
        boolean f131684p;

        /* renamed from: q */
        String f131685q;

        /* renamed from: r */
        C53671s f131686r;

        /* renamed from: s */
        C53678w f131687s;

        /* renamed from: t */
        Set<String> f131688t;

        /* renamed from: u */
        C53111j<?>[] f131689u;

        /* renamed from: v */
        C53095e<C53506ae, T> f131690v;

        /* renamed from: w */
        C53068c<T, R> f131691w;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C53068c<T, R> mo110659a() {
            Type genericReturnType = this.f131670b.getGenericReturnType();
            if (C53139p.m112967d(genericReturnType)) {
                throw mo110662a("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                Annotation[] annotations = this.f131670b.getAnnotations();
                try {
                    C53134n nVar = this.f131669a;
                    C53139p.m112957a(genericReturnType, "returnType == null");
                    C53139p.m112957a(annotations, "annotations == null");
                    int indexOf = nVar.f131641d.indexOf(null) + 1;
                    int size = nVar.f131641d.size();
                    for (int i = indexOf; i < size; i++) {
                        C53068c<T, R> a = ((C53069a) nVar.f131641d.get(i)).mo110593a(genericReturnType, annotations, nVar);
                        if (a != null) {
                            return a;
                        }
                    }
                    StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
                    sb.append(genericReturnType);
                    sb.append(".\n");
                    sb.append("  Tried:");
                    int size2 = nVar.f131641d.size();
                    while (indexOf < size2) {
                        sb.append("\n   * ");
                        sb.append(((C53069a) nVar.f131641d.get(indexOf)).getClass().getName());
                        indexOf++;
                    }
                    throw new IllegalArgumentException(sb.toString());
                } catch (RuntimeException e) {
                    throw m112948a((Throwable) e, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw mo110662a("Service methods cannot return void.", new Object[0]);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C53095e<C53506ae, T> mo110665b() {
            Annotation[] annotations = this.f131670b.getAnnotations();
            try {
                C53134n nVar = this.f131669a;
                Type type = this.f131674f;
                C53139p.m112957a(type, "type == null");
                C53139p.m112957a(annotations, "annotations == null");
                int indexOf = nVar.f131640c.indexOf(null) + 1;
                int size = nVar.f131640c.size();
                for (int i = indexOf; i < size; i++) {
                    C53095e<C53506ae, T> a = ((C53096a) nVar.f131640c.get(i)).mo110588a(type, annotations, nVar);
                    if (a != null) {
                        return a;
                    }
                }
                StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
                sb.append(type);
                sb.append(".\n");
                sb.append("  Tried:");
                int size2 = nVar.f131640c.size();
                while (indexOf < size2) {
                    sb.append("\n   * ");
                    sb.append(((C53096a) nVar.f131640c.get(indexOf)).getClass().getName());
                    indexOf++;
                }
                throw new IllegalArgumentException(sb.toString());
            } catch (RuntimeException e) {
                throw m112948a((Throwable) e, "Unable to create converter for %s", this.f131674f);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C53671s mo110663a(String[] strArr) {
            C53672a aVar = new C53672a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw mo110662a("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    C53678w a = C53678w.m114225a(trim);
                    if (a != null) {
                        this.f131687s = a;
                    } else {
                        throw mo110662a("Malformed content type: %s", trim);
                    }
                } else {
                    aVar.mo111604a(substring, trim);
                }
            }
            return aVar.mo111605a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public RuntimeException mo110662a(String str, Object... objArr) {
            return m112948a((Throwable) null, str, objArr);
        }

        C53138a(C53134n nVar, Method method) {
            this.f131669a = nVar;
            this.f131670b = method;
            this.f131671c = method.getAnnotations();
            this.f131673e = method.getGenericParameterTypes();
            this.f131672d = method.getParameterAnnotations();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public RuntimeException mo110661a(int i, String str, Object... objArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (parameter #");
            sb.append(i + 1);
            sb.append(")");
            return mo110662a(sb.toString(), objArr);
        }

        /* renamed from: a */
        private RuntimeException m112948a(Throwable th, String str, Object... objArr) {
            String a = C2240a.m6772a(str, objArr);
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n    for method ");
            sb.append(this.f131670b.getDeclaringClass().getSimpleName());
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(this.f131670b.getName());
            return new IllegalArgumentException(sb.toString(), th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C53111j<?> mo110660a(int i, Type type, Annotation[] annotationArr) {
            C53111j<?> jVar = null;
            for (Annotation a : annotationArr) {
                C53111j<?> a2 = m112947a(i, type, annotationArr, a);
                if (a2 != null) {
                    if (jVar == null) {
                        jVar = a2;
                    } else {
                        throw mo110661a(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (jVar != null) {
                return jVar;
            }
            throw mo110661a(i, "No Retrofit annotation found.", new Object[0]);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo110664a(String str, String str2, boolean z) {
            if (this.f131681m == null) {
                this.f131681m = str;
                this.f131682n = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (C53137o.f131655a.matcher(substring).find()) {
                            throw mo110662a("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f131685q = str2;
                    this.f131688t = C53137o.m112945a(str2);
                    return;
                }
                return;
            }
            throw mo110662a("Only one HTTP method is allowed. Found: %s and %s.", this.f131681m, str);
        }

        /* renamed from: a */
        private C53111j<?> m112947a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof C53093x) {
                if (this.f131680l) {
                    throw mo110661a(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f131678j) {
                    throw mo110661a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f131679k) {
                    throw mo110661a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f131685q == null) {
                    this.f131680l = true;
                    if (type == C53673t.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new C53126m();
                    }
                    throw mo110661a(i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw mo110661a(i, "@Url cannot be used with @%s URL", this.f131681m);
                }
            } else if (annotation instanceof C53088s) {
                if (this.f131679k) {
                    throw mo110661a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f131680l) {
                    throw mo110661a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f131685q != null) {
                    this.f131678j = true;
                    C53088s sVar = (C53088s) annotation;
                    String a = sVar.mo110617a();
                    if (!C53137o.f131656b.matcher(a).matches()) {
                        throw mo110661a(i, "@Path parameter name must match %s. Found: %s", C53137o.f131655a.pattern(), a);
                    } else if (this.f131688t.contains(a)) {
                        return new C53121h(a, this.f131669a.mo110648a(type, annotationArr), sVar.mo110618b());
                    } else {
                        throw mo110661a(i, "URL \"%s\" does not contain \"{%s}\".", this.f131685q, a);
                    }
                } else {
                    throw mo110661a(i, "@Path can only be used with relative url on @%s", this.f131681m);
                }
            } else if (annotation instanceof C53089t) {
                C53089t tVar = (C53089t) annotation;
                String a2 = tVar.mo110619a();
                boolean b = tVar.mo110620b();
                Class a3 = C53139p.m112956a(type);
                this.f131679k = true;
                if (Iterable.class.isAssignableFrom(a3)) {
                    if (type instanceof ParameterizedType) {
                        return new C53122i(a2, this.f131669a.mo110648a(C53139p.m112958a(0, (ParameterizedType) type), annotationArr), b).mo110631a();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(a3.getSimpleName());
                    sb.append(" must include generic type (e.g., ");
                    sb.append(a3.getSimpleName());
                    sb.append("<String>)");
                    throw mo110661a(i, sb.toString(), new Object[0]);
                } else if (!a3.isArray()) {
                    return new C53122i(a2, this.f131669a.mo110648a(type, annotationArr), b);
                } else {
                    return new C53122i(a2, this.f131669a.mo110648a(C53137o.m112944a(a3.getComponentType()), annotationArr), b).mo110633b();
                }
            } else if (annotation instanceof C53091v) {
                boolean a4 = ((C53091v) annotation).mo110622a();
                Class a5 = C53139p.m112956a(type);
                this.f131679k = true;
                if (Iterable.class.isAssignableFrom(a5)) {
                    if (type instanceof ParameterizedType) {
                        return new C53124k(this.f131669a.mo110648a(C53139p.m112958a(0, (ParameterizedType) type), annotationArr), a4).mo110631a();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a5.getSimpleName());
                    sb2.append(" must include generic type (e.g., ");
                    sb2.append(a5.getSimpleName());
                    sb2.append("<String>)");
                    throw mo110661a(i, sb2.toString(), new Object[0]);
                } else if (!a5.isArray()) {
                    return new C53124k(this.f131669a.mo110648a(type, annotationArr), a4);
                } else {
                    return new C53124k(this.f131669a.mo110648a(C53137o.m112944a(a5.getComponentType()), annotationArr), a4).mo110633b();
                }
            } else if (annotation instanceof C53090u) {
                Class a6 = C53139p.m112956a(type);
                if (Map.class.isAssignableFrom(a6)) {
                    Type a7 = C53139p.m112959a(type, a6, Map.class);
                    if (a7 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) a7;
                        Type a8 = C53139p.m112958a(0, parameterizedType);
                        if (String.class == a8) {
                            return new C53123j(this.f131669a.mo110648a(C53139p.m112958a(1, parameterizedType), annotationArr), ((C53090u) annotation).mo110621a());
                        }
                        StringBuilder sb3 = new StringBuilder("@QueryMap keys must be of type String: ");
                        sb3.append(a8);
                        throw mo110661a(i, sb3.toString(), new Object[0]);
                    }
                    throw mo110661a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw mo110661a(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C53078i) {
                String a9 = ((C53078i) annotation).mo110608a();
                Class a10 = C53139p.m112956a(type);
                if (Iterable.class.isAssignableFrom(a10)) {
                    if (type instanceof ParameterizedType) {
                        return new C53117d(a9, this.f131669a.mo110648a(C53139p.m112958a(0, (ParameterizedType) type), annotationArr)).mo110631a();
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(a10.getSimpleName());
                    sb4.append(" must include generic type (e.g., ");
                    sb4.append(a10.getSimpleName());
                    sb4.append("<String>)");
                    throw mo110661a(i, sb4.toString(), new Object[0]);
                } else if (!a10.isArray()) {
                    return new C53117d(a9, this.f131669a.mo110648a(type, annotationArr));
                } else {
                    return new C53117d(a9, this.f131669a.mo110648a(C53137o.m112944a(a10.getComponentType()), annotationArr)).mo110633b();
                }
            } else if (annotation instanceof C53079j) {
                Class a11 = C53139p.m112956a(type);
                if (Map.class.isAssignableFrom(a11)) {
                    Type a12 = C53139p.m112959a(type, a11, Map.class);
                    if (a12 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) a12;
                        Type a13 = C53139p.m112958a(0, parameterizedType2);
                        if (String.class == a13) {
                            return new C53118e(this.f131669a.mo110648a(C53139p.m112958a(1, parameterizedType2), annotationArr));
                        }
                        StringBuilder sb5 = new StringBuilder("@HeaderMap keys must be of type String: ");
                        sb5.append(a13);
                        throw mo110661a(i, sb5.toString(), new Object[0]);
                    }
                    throw mo110661a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw mo110661a(i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C53072c) {
                if (this.f131683o) {
                    C53072c cVar = (C53072c) annotation;
                    String a14 = cVar.mo110600a();
                    boolean b2 = cVar.mo110601b();
                    this.f131675g = true;
                    Class a15 = C53139p.m112956a(type);
                    if (Iterable.class.isAssignableFrom(a15)) {
                        if (type instanceof ParameterizedType) {
                            return new C53115b(a14, this.f131669a.mo110648a(C53139p.m112958a(0, (ParameterizedType) type), annotationArr), b2).mo110631a();
                        }
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(a15.getSimpleName());
                        sb6.append(" must include generic type (e.g., ");
                        sb6.append(a15.getSimpleName());
                        sb6.append("<String>)");
                        throw mo110661a(i, sb6.toString(), new Object[0]);
                    } else if (!a15.isArray()) {
                        return new C53115b(a14, this.f131669a.mo110648a(type, annotationArr), b2);
                    } else {
                        return new C53115b(a14, this.f131669a.mo110648a(C53137o.m112944a(a15.getComponentType()), annotationArr), b2).mo110633b();
                    }
                } else {
                    throw mo110661a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof C53073d) {
                if (this.f131683o) {
                    Class a16 = C53139p.m112956a(type);
                    if (Map.class.isAssignableFrom(a16)) {
                        Type a17 = C53139p.m112959a(type, a16, Map.class);
                        if (a17 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) a17;
                            Type a18 = C53139p.m112958a(0, parameterizedType3);
                            if (String.class == a18) {
                                C53095e a19 = this.f131669a.mo110648a(C53139p.m112958a(1, parameterizedType3), annotationArr);
                                this.f131675g = true;
                                return new C53116c(a19, ((C53073d) annotation).mo110602a());
                            }
                            StringBuilder sb7 = new StringBuilder("@FieldMap keys must be of type String: ");
                            sb7.append(a18);
                            throw mo110661a(i, sb7.toString(), new Object[0]);
                        }
                        throw mo110661a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw mo110661a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw mo110661a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof C53086q) {
                if (this.f131684p) {
                    C53086q qVar = (C53086q) annotation;
                    this.f131676h = true;
                    String a20 = qVar.mo110614a();
                    Class a21 = C53139p.m112956a(type);
                    if (!a20.isEmpty()) {
                        StringBuilder sb8 = new StringBuilder("form-data; name=\"");
                        sb8.append(a20);
                        sb8.append("\"");
                        C53671s a22 = C53671s.m114150a("Content-Disposition", sb8.toString(), "Content-Transfer-Encoding", qVar.mo110615b());
                        if (Iterable.class.isAssignableFrom(a21)) {
                            if (type instanceof ParameterizedType) {
                                Type a23 = C53139p.m112958a(0, (ParameterizedType) type);
                                if (!C53681b.class.isAssignableFrom(C53139p.m112956a(a23))) {
                                    return new C53119f(a22, this.f131669a.mo110649a(a23, annotationArr, this.f131671c)).mo110631a();
                                }
                                throw mo110661a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(a21.getSimpleName());
                            sb9.append(" must include generic type (e.g., ");
                            sb9.append(a21.getSimpleName());
                            sb9.append("<String>)");
                            throw mo110661a(i, sb9.toString(), new Object[0]);
                        } else if (a21.isArray()) {
                            Class a24 = C53137o.m112944a(a21.getComponentType());
                            if (!C53681b.class.isAssignableFrom(a24)) {
                                return new C53119f(a22, this.f131669a.mo110649a(a24, annotationArr, this.f131671c)).mo110633b();
                            }
                            throw mo110661a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!C53681b.class.isAssignableFrom(a21)) {
                            return new C53119f(a22, this.f131669a.mo110649a(type, annotationArr, this.f131671c));
                        } else {
                            throw mo110661a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(a21)) {
                        if (!(type instanceof ParameterizedType)) {
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append(a21.getSimpleName());
                            sb10.append(" must include generic type (e.g., ");
                            sb10.append(a21.getSimpleName());
                            sb10.append("<String>)");
                            throw mo110661a(i, sb10.toString(), new Object[0]);
                        } else if (C53681b.class.isAssignableFrom(C53139p.m112956a(C53139p.m112958a(0, (ParameterizedType) type)))) {
                            return C53125l.f131619a.mo110631a();
                        } else {
                            throw mo110661a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (a21.isArray()) {
                        if (C53681b.class.isAssignableFrom(a21.getComponentType())) {
                            return C53125l.f131619a.mo110633b();
                        }
                        throw mo110661a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (C53681b.class.isAssignableFrom(a21)) {
                        return C53125l.f131619a;
                    } else {
                        throw mo110661a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw mo110661a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof C53087r) {
                if (this.f131684p) {
                    this.f131676h = true;
                    Class a25 = C53139p.m112956a(type);
                    if (Map.class.isAssignableFrom(a25)) {
                        Type a26 = C53139p.m112959a(type, a25, Map.class);
                        if (a26 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) a26;
                            Type a27 = C53139p.m112958a(0, parameterizedType4);
                            if (String.class == a27) {
                                Type a28 = C53139p.m112958a(1, parameterizedType4);
                                if (!C53681b.class.isAssignableFrom(C53139p.m112956a(a28))) {
                                    return new C53120g(this.f131669a.mo110649a(a28, annotationArr, this.f131671c), ((C53087r) annotation).mo110616a());
                                }
                                throw mo110661a(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            StringBuilder sb11 = new StringBuilder("@PartMap keys must be of type String: ");
                            sb11.append(a27);
                            throw mo110661a(i, sb11.toString(), new Object[0]);
                        }
                        throw mo110661a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw mo110661a(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw mo110661a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof C53070a)) {
                return null;
            } else {
                if (this.f131683o || this.f131684p) {
                    throw mo110661a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f131677i) {
                    try {
                        C53095e a29 = this.f131669a.mo110649a(type, annotationArr, this.f131671c);
                        this.f131677i = true;
                        return new C53114a(a29);
                    } catch (RuntimeException e) {
                        Object[] objArr = {type};
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append("Unable to create @Body converter for %s");
                        sb12.append(" (parameter #");
                        sb12.append(i + 1);
                        sb12.append(")");
                        throw m112948a((Throwable) e, sb12.toString(), objArr);
                    }
                } else {
                    throw mo110661a(i, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }
    }

    /* renamed from: a */
    static Set<String> m112945a(String str) {
        Matcher matcher = f131655a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    C53137o(C53138a<R, T> aVar) {
        this.f131657c = aVar.f131669a.f131638a;
        this.f131658d = aVar.f131691w;
        this.f131660f = aVar.f131669a.f131639b;
        this.f131659e = aVar.f131690v;
        this.f131661g = aVar.f131681m;
        this.f131662h = aVar.f131685q;
        this.f131663i = aVar.f131686r;
        this.f131664j = aVar.f131687s;
        this.f131665k = aVar.f131682n;
        this.f131666l = aVar.f131683o;
        this.f131667m = aVar.f131684p;
        this.f131668n = aVar.f131689u;
    }

    /* renamed from: a */
    static Class<?> m112944a(Class<?> cls) {
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

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C53498ab mo110658a(Object... objArr) throws IOException {
        int i;
        C53131l lVar = new C53131l(this.f131661g, this.f131660f, this.f131662h, this.f131663i, this.f131664j, this.f131665k, this.f131666l, this.f131667m);
        C53111j<?>[] jVarArr = this.f131668n;
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        if (i == jVarArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                jVarArr[i2].mo110632a(lVar, objArr[i2]);
            }
            return lVar.mo110639a();
        }
        StringBuilder sb = new StringBuilder("Argument count (");
        sb.append(i);
        sb.append(") doesn't match expected count (");
        sb.append(jVarArr.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
