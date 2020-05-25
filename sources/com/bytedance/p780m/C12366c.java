package com.bytedance.p780m;

import com.bytedance.p780m.p781a.C12359c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.m.c */
public final class C12366c {

    /* renamed from: a */
    public final Map<Object, Map<?, C12372e<?>>> f32587a;

    /* renamed from: b */
    public final Map<Object, Set<C12372e<?>>> f32588b;

    /* renamed from: c */
    public final Map<Object, List<C12372e<?>>> f32589c;

    /* renamed from: d */
    private final C12361b f32590d;

    /* renamed from: e */
    private final Map<C12373f, C12372e<?>> f32591e;

    /* renamed from: f */
    private final Map<Class<? extends Object>, Object<?, ?>> f32592f;

    /* renamed from: com.bytedance.m.c$a */
    public final class C12369a<CHILD> extends C12370b<CHILD> {

        /* renamed from: a */
        C12371d<CHILD> f32598a;

        C12369a(Class<CHILD> cls, String str, C12371d<CHILD> dVar) {
            super(cls, str);
            this.f32598a = dVar;
        }
    }

    /* renamed from: com.bytedance.m.c$b */
    public class C12370b<CHILD> {

        /* renamed from: c */
        Class<CHILD> f32600c;

        /* renamed from: d */
        String f32601d;

        @SafeVarargs
        /* renamed from: a */
        public final C12370b<CHILD> mo23383a(Class<? super CHILD>... clsArr) {
            for (int i = 0; i <= 0; i++) {
                Class<? super CHILD> cls = clsArr[0];
                C12366c cVar = C12366c.this;
                cVar.mo23381b(cls, this.f32601d, new C12372e<T>(this.f32600c, this.f32601d) {

                    /* renamed from: a */
                    final /* synthetic */ Class f32595a;

                    /* renamed from: b */
                    final /* synthetic */ String f32596b;

                    /* renamed from: a */
                    public final T mo23382a(C12361b bVar) {
                        return bVar.mo23373a(this.f32595a, this.f32596b);
                    }

                    {
                        this.f32595a = r2;
                        this.f32596b = r3;
                    }
                });
            }
            return this;
        }

        C12370b(Class<CHILD> cls, String str) {
            this.f32600c = cls;
            this.f32601d = str;
        }
    }

    public C12366c() {
        this(null);
    }

    /* renamed from: a */
    public final C12361b mo23376a() {
        C12361b bVar = new C12361b(this.f32590d, new LinkedHashMap(this.f32591e), new LinkedHashMap(this.f32592f), new LinkedHashMap(this.f32587a), new LinkedHashMap(this.f32589c), new LinkedHashMap(this.f32588b));
        return bVar;
    }

    public C12366c(C12361b bVar) {
        this.f32591e = new LinkedHashMap();
        this.f32592f = new LinkedHashMap();
        this.f32587a = new LinkedHashMap();
        this.f32588b = new LinkedHashMap();
        this.f32589c = new LinkedHashMap();
        this.f32590d = bVar;
    }

    /* renamed from: a */
    public final <T> C12369a<T> mo23377a(Class<T> cls, C12372e<T> eVar) {
        return mo23378a(cls, (String) null, eVar);
    }

    /* renamed from: a */
    public final <T> C12370b<T> mo23379a(Class<T> cls, T t) {
        return mo23380a(cls, (String) null, t);
    }

    /* renamed from: a */
    public final <T> C12369a<T> mo23378a(Class<T> cls, String str, C12372e<T> eVar) {
        return mo23381b(cls, null, new C12374g(eVar));
    }

    /* renamed from: b */
    public final <T> C12369a<T> mo23381b(Class<T> cls, String str, C12372e<T> eVar) {
        C12373f a = C12373f.m24914a(cls, str);
        if (!this.f32591e.containsKey(a)) {
            this.f32591e.put(a, eVar);
            return new C12369a<>(cls, str, eVar.f32603d);
        }
        StringBuilder sb = new StringBuilder("duplicate already contain ");
        sb.append(cls.toString());
        sb.append(" ");
        sb.append(this.f32591e.get(a));
        throw new C12359c(sb.toString());
    }

    /* renamed from: a */
    public final <T> C12370b<T> mo23380a(Class<T> cls, String str, final T t) {
        return mo23381b(cls, str, new C12374g(new C12372e<T>() {
            /* renamed from: a */
            public final T mo23382a(C12361b bVar) {
                return t;
            }
        }));
    }
}
