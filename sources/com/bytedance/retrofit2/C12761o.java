package com.bytedance.retrofit2;

import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.p832a.C12693b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.C53500ac;
import okhttp3.C53671s;
import okhttp3.C53679x.C53681b;

/* renamed from: com.bytedance.retrofit2.o */
abstract class C12761o<T> {

    /* renamed from: com.bytedance.retrofit2.o$a */
    static final class C12764a<T> extends C12761o<T> {

        /* renamed from: a */
        private final C12744f<T, String> f33404a;

        C12764a(C12744f<T, String> fVar) {
            this.f33404a = (C12744f) C12801w.m25696a(fVar, "converter == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo23927a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                try {
                    requestBuilder.f33288l = Boolean.parseBoolean((String) this.f33404a.mo9557a(t));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to AddCommonParam");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$b */
    static final class C12765b<T> extends C12761o<T> {

        /* renamed from: a */
        private final boolean f33405a;

        /* renamed from: b */
        private final C12744f<T, TypedOutput> f33406b;

        C12765b(boolean z, C12744f<T, TypedOutput> fVar) {
            this.f33405a = z;
            this.f33406b = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo23927a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.f33283g = (TypedOutput) this.f33406b.mo9557a(t);
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to TypedOutput");
                    throw new RuntimeException(sb.toString(), e);
                }
            } else if (!this.f33405a) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$c */
    static final class C12766c extends C12761o<C53500ac> {

        /* renamed from: a */
        static final C12766c f33407a = new C12766c();

        C12766c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo23927a(RequestBuilder requestBuilder, Object obj) throws IOException {
            C53500ac acVar = (C53500ac) obj;
            if (acVar != null) {
                requestBuilder.f33291o = acVar;
                requestBuilder.mo23821a();
                return;
            }
            throw new IllegalArgumentException("Body parameter value must not be null.");
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$d */
    static final class C12767d extends C12761o<C53500ac> {

        /* renamed from: a */
        private final C53671s f33408a;

        C12767d(C53671s sVar) {
            this.f33408a = sVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo23927a(RequestBuilder requestBuilder, Object obj) throws IOException {
            C53500ac acVar = (C53500ac) obj;
            if (acVar != null) {
                requestBuilder.mo23825a(this.f33408a, acVar);
                requestBuilder.mo23821a();
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$e */
    static final class C12768e extends C12761o<Map<String, C53500ac>> {

        /* renamed from: a */
        private final String f33409a;

        C12768e(String str) {
            this.f33409a = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo23927a(RequestBuilder requestBuilder, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        C53500ac acVar = (C53500ac) entry.getValue();
                        if (acVar != null) {
                            StringBuilder sb = new StringBuilder("form-data; name=\"");
                            sb.append(str);
                            sb.append("\"");
                            requestBuilder.mo23825a(C53671s.m114150a("Content-Disposition", sb.toString(), "Content-Transfer-Encoding", this.f33409a), acVar);
                        } else {
                            StringBuilder sb2 = new StringBuilder("Part map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                requestBuilder.mo23821a();
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$f */
    static final class C12769f extends C12761o<C53681b> {

        /* renamed from: a */
        static final C12769f f33410a = new C12769f();

        C12769f() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo23927a(RequestBuilder requestBuilder, Object obj) throws IOException {
            C53681b bVar = (C53681b) obj;
            if (bVar != null) {
                requestBuilder.f33290n.mo111649a(bVar);
            }
            requestBuilder.mo23821a();
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$g */
    static final class C12770g<T> extends C12761o<T> {

        /* renamed from: a */
        private final C12744f<T, Object> f33411a;

        C12770g(C12744f<T, Object> fVar) {
            this.f33411a = (C12744f) C12801w.m25696a(fVar, "converter == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo23927a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                try {
                    requestBuilder.f33289m = this.f33411a.mo9557a(t);
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to ExtraInfo");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$h */
    static final class C12771h<T> extends C12761o<T> {

        /* renamed from: a */
        private final String f33412a;

        /* renamed from: b */
        private final C12744f<T, String> f33413b;

        /* renamed from: c */
        private final boolean f33414c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo23927a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.mo23826b(this.f33412a, (String) this.f33413b.mo9557a(t), this.f33414c);
            }
        }

        C12771h(String str, C12744f<T, String> fVar, boolean z) {
            this.f33412a = (String) C12801w.m25696a(str, "name == null");
            this.f33413b = fVar;
            this.f33414c = z;
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$i */
    static final class C12772i<T> extends C12761o<Map<String, T>> {

        /* renamed from: a */
        private final C12744f<T, String> f33415a;

        /* renamed from: b */
        private final boolean f33416b;

        C12772i(C12744f<T, String> fVar, boolean z) {
            this.f33415a = fVar;
            this.f33416b = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo23927a(RequestBuilder requestBuilder, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.mo23826b(str, (String) this.f33415a.mo9557a(value), this.f33416b);
                        } else {
                            StringBuilder sb = new StringBuilder("Field map contained null value for key '");
                            sb.append(str);
                            sb.append("'.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$j */
    static final class C12773j<T> extends C12761o<T> {

        /* renamed from: a */
        private final String f33417a;

        /* renamed from: b */
        private final C12744f<T, String> f33418b;

        C12773j(String str, C12744f<T, String> fVar) {
            this.f33417a = (String) C12801w.m25696a(str, "name == null");
            this.f33418b = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo23927a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.mo23823a(this.f33417a, (String) this.f33418b.mo9557a(t));
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$k */
    static final class C12774k<T> extends C12761o<List<T>> {

        /* renamed from: a */
        private final C12744f<T, C12685b> f33419a;

        C12774k(C12744f<T, C12685b> fVar) {
            this.f33419a = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo23927a(RequestBuilder requestBuilder, Object obj) throws IOException {
            List<Object> list = (List) obj;
            if (list != null) {
                for (Object a : list) {
                    C12685b bVar = (C12685b) this.f33419a.mo9557a(a);
                    requestBuilder.mo23823a(bVar.f33318a, bVar.f33319b);
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$l */
    static final class C12775l<T> extends C12761o<Map<String, T>> {

        /* renamed from: a */
        private final C12744f<T, String> f33420a;

        C12775l(C12744f<T, String> fVar) {
            this.f33420a = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo23927a(RequestBuilder requestBuilder, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.mo23823a(str, (String) this.f33420a.mo9557a(value));
                        } else {
                            StringBuilder sb = new StringBuilder("Header map contained null value for key '");
                            sb.append(str);
                            sb.append("'.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Header map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Header map was null.");
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$m */
    static final class C12776m<T> extends C12761o<T> {

        /* renamed from: a */
        private final C12744f<T, String> f33421a;

        C12776m(C12744f<T, String> fVar) {
            this.f33421a = (C12744f) C12801w.m25696a(fVar, "converter == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo23927a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                try {
                    requestBuilder.f33287k = Integer.parseInt((String) this.f33421a.mo9557a(t));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to MaxLength");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$n */
    static final class C12777n<T> extends C12761o<T> {

        /* renamed from: a */
        private final String f33422a;

        /* renamed from: b */
        private final C12744f<T, String> f33423b;

        C12777n(String str, C12744f<T, String> fVar) {
            this.f33422a = (String) C12801w.m25696a(str, "name == null");
            this.f33423b = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo23927a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                String str = this.f33422a;
                String str2 = (String) this.f33423b.mo9557a(t);
                if (requestBuilder.f33277a != null) {
                    String str3 = requestBuilder.f33277a;
                    StringBuilder sb = new StringBuilder("{");
                    sb.append(str);
                    sb.append("}");
                    requestBuilder.f33277a = str3.replace(sb.toString(), str2);
                    return;
                }
                throw new AssertionError();
            }
            StringBuilder sb2 = new StringBuilder("Method parameter \"");
            sb2.append(this.f33422a);
            sb2.append("\" value must not be null.");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$o */
    static final class C12778o<T> extends C12761o<T> {

        /* renamed from: a */
        private final String f33424a;

        /* renamed from: b */
        private final C12744f<T, TypedOutput> f33425b;

        C12778o(String str, C12744f<T, TypedOutput> fVar) {
            this.f33424a = str;
            this.f33425b = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo23927a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    TypedOutput typedOutput = (TypedOutput) this.f33425b.mo9557a(t);
                    requestBuilder.f33282f.addPart(this.f33424a, typedOutput);
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$p */
    static final class C12779p<T> extends C12761o<Map<String, T>> {

        /* renamed from: a */
        private final C12744f<T, TypedOutput> f33426a;

        /* renamed from: b */
        private final String f33427b;

        C12779p(C12744f<T, TypedOutput> fVar, String str) {
            this.f33426a = fVar;
            this.f33427b = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo23927a(RequestBuilder requestBuilder, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.f33282f.addPart(str, this.f33427b, (TypedOutput) this.f33426a.mo9557a(value));
                        } else {
                            StringBuilder sb = new StringBuilder("Part map contained null value for key '");
                            sb.append(str);
                            sb.append("'.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$q */
    static final class C12780q<T> extends C12761o<T> {

        /* renamed from: a */
        private final String f33428a;

        /* renamed from: b */
        private final C12744f<T, String> f33429b;

        /* renamed from: c */
        private final boolean f33430c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo23927a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                String str = this.f33428a;
                String str2 = (String) this.f33429b.mo9557a(t);
                boolean z = this.f33430c;
                if (requestBuilder.f33279c == null) {
                    throw new AssertionError();
                } else if (str == null) {
                    throw new IllegalArgumentException("Path replacement name must not be null.");
                } else if (str2 == null) {
                    StringBuilder sb = new StringBuilder("Path replacement \"");
                    sb.append(str);
                    sb.append("\" value must not be null.");
                    throw new IllegalArgumentException(sb.toString());
                } else if (z) {
                    try {
                        String replace = URLEncoder.encode(String.valueOf(str2), "UTF-8").replace("+", "%20");
                        String str3 = requestBuilder.f33279c;
                        StringBuilder sb2 = new StringBuilder("{");
                        sb2.append(str);
                        sb2.append("}");
                        requestBuilder.f33279c = str3.replace(sb2.toString(), replace);
                    } catch (UnsupportedEncodingException e) {
                        StringBuilder sb3 = new StringBuilder("Unable to convert path parameter \"");
                        sb3.append(str);
                        sb3.append("\" value to UTF-8:");
                        sb3.append(str2);
                        throw new RuntimeException(sb3.toString(), e);
                    }
                } else {
                    String str4 = requestBuilder.f33279c;
                    StringBuilder sb4 = new StringBuilder("{");
                    sb4.append(str);
                    sb4.append("}");
                    requestBuilder.f33279c = str4.replace(sb4.toString(), String.valueOf(str2));
                }
            } else {
                StringBuilder sb5 = new StringBuilder("Path parameter \"");
                sb5.append(this.f33428a);
                sb5.append("\" value must not be null.");
                throw new IllegalArgumentException(sb5.toString());
            }
        }

        C12780q(String str, C12744f<T, String> fVar, boolean z) {
            this.f33428a = (String) C12801w.m25696a(str, "name == null");
            this.f33429b = fVar;
            this.f33430c = z;
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$r */
    static final class C12781r<T> extends C12761o<T> {

        /* renamed from: a */
        private final String f33431a;

        /* renamed from: b */
        private final C12744f<T, String> f33432b;

        /* renamed from: c */
        private final boolean f33433c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo23927a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.mo23824a(this.f33431a, (String) this.f33432b.mo9557a(t), this.f33433c);
            }
        }

        C12781r(String str, C12744f<T, String> fVar, boolean z) {
            this.f33431a = (String) C12801w.m25696a(str, "name == null");
            this.f33432b = fVar;
            this.f33433c = z;
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$s */
    static final class C12782s<T> extends C12761o<Map<String, T>> {

        /* renamed from: a */
        private final C12744f<T, String> f33434a;

        /* renamed from: b */
        private final boolean f33435b;

        C12782s(C12744f<T, String> fVar, boolean z) {
            this.f33434a = fVar;
            this.f33435b = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo23927a(RequestBuilder requestBuilder, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.mo23824a(str, (String) this.f33434a.mo9557a(value), this.f33435b);
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$t */
    static final class C12783t<T> extends C12761o<T> {

        /* renamed from: a */
        private final C12744f<T, String> f33436a;

        /* renamed from: b */
        private final boolean f33437b;

        C12783t(C12744f<T, String> fVar, boolean z) {
            this.f33436a = fVar;
            this.f33437b = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo23927a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.mo23824a((String) this.f33436a.mo9557a(t), null, this.f33437b);
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$u */
    static final class C12784u<T> extends C12761o<T> {
        C12784u() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo23927a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                if (t instanceof C12693b) {
                    requestBuilder.f33280d = ((C12693b) t).mo23868a();
                    return;
                }
                StringBuilder sb = new StringBuilder("wrong type:");
                sb.append(t.getClass());
                sb.append(",not implement QueryParamObject");
                throw new RuntimeException(sb.toString());
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$v */
    static final class C12785v extends C12761o<Object> {
        C12785v() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo23927a(RequestBuilder requestBuilder, Object obj) {
            if (obj != null) {
                requestBuilder.f33279c = obj.toString();
                return;
            }
            throw new NullPointerException("@Url parameter is null.");
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$w */
    static final class C12786w<T> extends C12761o<T> {

        /* renamed from: a */
        final Class<T> f33438a;

        C12786w(Class<T> cls) {
            this.f33438a = cls;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo23927a(RequestBuilder requestBuilder, T t) {
            requestBuilder.mo23822a(this.f33438a, t);
        }
    }

    C12761o() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo23927a(RequestBuilder requestBuilder, T t) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C12761o<Iterable<T>> mo23926a() {
        return new C12761o<Iterable<T>>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo23927a(RequestBuilder requestBuilder, Object obj) throws IOException {
                Iterable<Object> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (Object a : iterable) {
                        C12761o.this.mo23927a(requestBuilder, a);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C12761o<Object> mo23928b() {
        return new C12761o<Object>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo23927a(RequestBuilder requestBuilder, Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        C12761o.this.mo23927a(requestBuilder, Array.get(obj, i));
                    }
                }
            }
        };
    }
}
