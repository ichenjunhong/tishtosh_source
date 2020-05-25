package com.bytedance.retrofit2.p830a;

import com.bytedance.retrofit2.C12796s;
import com.bytedance.retrofit2.C12801w;
import com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.policy.Policy;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import okhttp3.C53500ac;

/* renamed from: com.bytedance.retrofit2.a.c */
public final class C12686c {

    /* renamed from: a */
    public final String f33320a;

    /* renamed from: b */
    public final String f33321b;

    /* renamed from: c */
    public final List<C12685b> f33322c;

    /* renamed from: d */
    public final TypedOutput f33323d;

    /* renamed from: e */
    public final C53500ac f33324e;

    /* renamed from: f */
    public final int f33325f;

    /* renamed from: g */
    public final boolean f33326g;

    /* renamed from: h */
    public final int f33327h;

    /* renamed from: i */
    public final boolean f33328i;

    /* renamed from: j */
    public Object f33329j;

    /* renamed from: k */
    public String f33330k;

    /* renamed from: l */
    public Map<Class<?>, Object> f33331l;

    /* renamed from: m */
    public C12796s f33332m;

    /* renamed from: com.bytedance.retrofit2.a.c$a */
    public static class C12687a {

        /* renamed from: a */
        String f33333a;

        /* renamed from: b */
        String f33334b;

        /* renamed from: c */
        List<C12685b> f33335c;

        /* renamed from: d */
        TypedOutput f33336d;

        /* renamed from: e */
        C53500ac f33337e;

        /* renamed from: f */
        int f33338f;

        /* renamed from: g */
        boolean f33339g;

        /* renamed from: h */
        int f33340h;

        /* renamed from: i */
        boolean f33341i;

        /* renamed from: j */
        public Object f33342j;

        /* renamed from: k */
        String f33343k;

        /* renamed from: l */
        C12796s f33344l;

        /* renamed from: m */
        Map<Class<?>, Object> f33345m;

        public C12687a() {
            this.f33333a = "GET";
        }

        /* renamed from: a */
        public final C12686c mo23864a() {
            if (this.f33334b != null) {
                return new C12686c(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: a */
        public final C12687a mo23863a(List<C12685b> list) {
            this.f33335c = list;
            return this;
        }

        /* renamed from: a */
        public final C12687a mo23861a(String str) {
            if (str != null) {
                this.f33334b = str;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        C12687a(C12686c cVar) {
            this.f33333a = cVar.f33320a;
            this.f33334b = cVar.f33321b;
            this.f33335c = new LinkedList();
            this.f33335c.addAll(cVar.f33322c);
            this.f33336d = cVar.f33323d;
            this.f33337e = cVar.f33324e;
            this.f33338f = cVar.f33325f;
            this.f33339g = cVar.f33326g;
            this.f33340h = cVar.f33327h;
            this.f33341i = cVar.f33328i;
            this.f33342j = cVar.f33329j;
            this.f33343k = cVar.f33330k;
            this.f33344l = cVar.f33332m;
            this.f33345m = cVar.f33331l;
        }

        /* renamed from: a */
        public final C12687a mo23862a(String str, TypedOutput typedOutput) {
            boolean z;
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() != 0) {
                if (typedOutput != 0) {
                    if (C12801w.m25701a(str) || str.equals("OPTIONS") || str.equals(Policy.ACTION_DELETE) || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        StringBuilder sb = new StringBuilder("method ");
                        sb.append(str);
                        sb.append(" must not have a request body.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                if (typedOutput == 0 && C12801w.m25701a(str)) {
                    r4 = new FormUrlEncodedTypedOutput();
                    r4.addField("body", TEVideoRecorder.FACE_BEAUTY_NULL);
                    typedOutput = r4;
                }
                this.f33333a = str;
                this.f33336d = typedOutput;
                return this;
            } else {
                throw new IllegalArgumentException("method.length() == 0");
            }
        }
    }

    /* renamed from: b */
    public final C12687a mo23858b() {
        return new C12687a(this);
    }

    /* renamed from: a */
    public final TypedOutput mo23857a() {
        if (this.f33324e != null) {
            return C12801w.m25694a(this.f33324e);
        }
        return this.f33323d;
    }

    /* renamed from: c */
    public final String mo23860c() {
        return m25513c(this.f33321b).getPath();
    }

    /* renamed from: c */
    private static URI m25513c(String str) throws RuntimeException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused2) {
                return m25514d(str);
            }
        }
    }

    /* renamed from: d */
    private static URI m25514d(String str) throws RuntimeException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final C12685b mo23856a(String str) {
        if (this.f33322c == null) {
            return null;
        }
        for (C12685b bVar : this.f33322c) {
            if (str.equalsIgnoreCase(bVar.f33318a)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final List<C12685b> mo23859b(String str) {
        ArrayList arrayList = null;
        if (this.f33322c == null) {
            return null;
        }
        for (C12685b bVar : this.f33322c) {
            if (str.equalsIgnoreCase(bVar.f33318a)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    C12686c(C12687a aVar) {
        if (aVar.f33334b != null) {
            this.f33321b = aVar.f33334b;
            if (aVar.f33333a != null) {
                this.f33320a = aVar.f33333a;
                if (aVar.f33335c == null) {
                    this.f33322c = Collections.emptyList();
                } else {
                    this.f33322c = Collections.unmodifiableList(new ArrayList(aVar.f33335c));
                }
                this.f33323d = aVar.f33336d;
                this.f33324e = aVar.f33337e;
                this.f33325f = aVar.f33338f;
                this.f33326g = aVar.f33339g;
                this.f33327h = aVar.f33340h;
                this.f33328i = aVar.f33341i;
                this.f33329j = aVar.f33342j;
                this.f33330k = aVar.f33343k;
                this.f33332m = aVar.f33344l;
                this.f33331l = aVar.f33345m;
                return;
            }
            throw new NullPointerException("Method must not be null.");
        }
        throw new NullPointerException("URL must not be null.");
    }

    public C12686c(String str, String str2, List<C12685b> list, TypedOutput typedOutput, int i, boolean z, int i2, boolean z2, Object obj) {
        this(str, str2, list, typedOutput, null, i, z, i2, z2, obj, "", null);
    }

    public C12686c(String str, String str2, List<C12685b> list, TypedOutput typedOutput, C53500ac acVar, int i, boolean z, int i2, boolean z2, Object obj, String str3, Map<Class<?>, Object> map) {
        if (str == null) {
            throw new NullPointerException("Method must not be null.");
        } else if (str2 != null) {
            this.f33320a = str;
            this.f33321b = str2;
            if (list == null) {
                this.f33322c = Collections.emptyList();
            } else {
                this.f33322c = Collections.unmodifiableList(new ArrayList(list));
            }
            this.f33323d = typedOutput;
            this.f33324e = acVar;
            this.f33325f = i;
            this.f33326g = z;
            this.f33327h = i2;
            this.f33328i = z2;
            this.f33329j = obj;
            this.f33330k = str3;
            this.f33331l = map;
        } else {
            throw new NullPointerException("URL must not be null.");
        }
    }
}
