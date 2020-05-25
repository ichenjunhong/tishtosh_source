package com.bytedance.p780m;

import android.text.TextUtils;
import com.C2240a;
import com.bytedance.p780m.p781a.C12357a;
import com.bytedance.p780m.p781a.C12358b;
import com.bytedance.p780m.p781a.C12360d;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.m.b */
public final class C12361b {

    /* renamed from: a */
    public final Map<Object, Map<?, C12372e<?>>> f32572a;

    /* renamed from: b */
    public final Map<Object, List<C12372e<?>>> f32573b;

    /* renamed from: c */
    public final Map<Object, Set<C12372e<?>>> f32574c;

    /* renamed from: d */
    public final C12364c f32575d = new C12364c();

    /* renamed from: e */
    public final C12365d f32576e = new C12365d();

    /* renamed from: f */
    public final C12363b f32577f = new C12363b();

    /* renamed from: g */
    private final C12361b f32578g;

    /* renamed from: h */
    private final Map<C12373f, C12372e<?>> f32579h;

    /* renamed from: i */
    private final Map<Class<? extends Object>, Object<?, ?>> f32580i;

    /* renamed from: j */
    private final Map<C12373f, C12362a> f32581j = new LinkedHashMap();

    /* renamed from: k */
    private final Map<C12373f, Object> f32582k = new HashMap();

    /* renamed from: com.bytedance.m.b$a */
    static class C12362a {

        /* renamed from: a */
        String f32583a;

        C12362a(String str) {
            this.f32583a = str;
        }
    }

    /* renamed from: com.bytedance.m.b$b */
    public class C12363b {
        public C12363b() {
        }
    }

    /* renamed from: com.bytedance.m.b$c */
    public class C12364c {
        public C12364c() {
        }
    }

    /* renamed from: com.bytedance.m.b$d */
    public class C12365d {
        public C12365d() {
        }
    }

    /* renamed from: a */
    public final <T> T mo23372a(Class<T> cls) {
        return mo23373a(cls, (String) null);
    }

    /* renamed from: b */
    public final <T> T mo23374b(Class<T> cls) {
        return mo23375b(cls, (String) null);
    }

    /* renamed from: a */
    private <T> C12372e<T> m24895a(C12373f fVar) {
        C12361b bVar = this;
        while (!bVar.f32579h.containsKey(fVar)) {
            if (bVar.f32578g == null) {
                return null;
            }
            bVar = bVar.f32578g;
        }
        return (C12372e) bVar.f32579h.get(fVar);
    }

    /* renamed from: a */
    public final <T> T mo23373a(Class<T> cls, String str) {
        return m24896a((Type) cls, str);
    }

    /* renamed from: b */
    public final <T> T mo23375b(Class<T> cls, String str) {
        return m24897b((Type) cls, (String) null);
    }

    /* renamed from: b */
    private <T> T m24897b(Type type, String str) {
        if (type != C12361b.class) {
            C12373f a = C12373f.m24914a(type, str);
            return mo23371a(a, m24895a(a));
        } else if (TextUtils.isEmpty(str)) {
            return this;
        } else {
            throw new IllegalArgumentException("ObjectContainer.class should not contain name");
        }
    }

    /* renamed from: a */
    private <T> T m24896a(Type type, String str) {
        T b = m24897b(type, str);
        if (b != null) {
            return b;
        }
        if (this.f32581j.size() > 0) {
            Set<C12373f> keySet = this.f32581j.keySet();
            StringBuilder sb = new StringBuilder();
            for (C12373f fVar : keySet) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fVar.mo23385a());
                sb2.append("\n ╚> ");
                sb.append(sb2.toString());
            }
            sb.append(C12373f.m24914a(type, str).mo23385a());
            throw new C12360d(C2240a.m6772a("Dependency not found: \n %s", new Object[]{sb.toString()}));
        }
        throw new C12360d(C2240a.m6772a("Dependency not found %s", new Object[]{type.toString()}));
    }

    /* renamed from: a */
    public final synchronized <T> T mo23371a(C12373f fVar, C12372e<T> eVar) {
        if (this.f32582k.containsKey(fVar)) {
            return this.f32582k.get(fVar);
        } else if (eVar == null) {
            return null;
        } else {
            if (this.f32581j.containsKey(fVar)) {
                Set<C12373f> keySet = this.f32581j.keySet();
                StringBuilder sb = new StringBuilder();
                for (C12373f fVar2 : keySet) {
                    C12362a aVar = (C12362a) this.f32581j.get(fVar2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(fVar2.mo23385a());
                    sb2.append(" ");
                    sb2.append(aVar.f32583a);
                    sb2.append("\n ╚> ");
                    sb.append(sb2.toString());
                }
                sb.append(fVar.mo23385a());
                throw new C12357a(C2240a.m6772a("circle dependency: \n %s", new Object[]{sb.toString()}));
            }
            if (eVar instanceof C12374g) {
                this.f32581j.put(fVar, new C12362a("singleton"));
            } else {
                this.f32581j.put(fVar, new C12362a(""));
            }
            T a = eVar.mo23382a(this);
            if (!this.f32582k.containsKey(fVar)) {
                if (eVar instanceof C12374g) {
                    this.f32582k.put(fVar, a);
                }
                eVar.mo23384a(a, this);
                if (eVar instanceof C12374g) {
                    this.f32582k.remove(fVar);
                }
                this.f32581j.remove(fVar);
                return a;
            }
            throw new C12358b("Why duplicate key!!!");
        }
    }

    C12361b(C12361b bVar, Map<C12373f, C12372e<?>> map, Map<Class<? extends Object>, Object<?, ?>> map2, Map<Object, Map<?, C12372e<?>>> map3, Map<Object, List<C12372e<?>>> map4, Map<Object, Set<C12372e<?>>> map5) {
        this.f32578g = bVar;
        this.f32579h = Collections.unmodifiableMap(map);
        this.f32580i = Collections.unmodifiableMap(map2);
        this.f32572a = Collections.unmodifiableMap(map3);
        this.f32573b = Collections.unmodifiableMap(map4);
        this.f32574c = Collections.unmodifiableMap(map5);
    }
}
