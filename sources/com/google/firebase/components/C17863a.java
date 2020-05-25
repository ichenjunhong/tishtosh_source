package com.google.firebase.components;

import com.google.android.gms.common.internal.C15464q;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.a */
public final class C17863a<T> {

    /* renamed from: a */
    public final Set<Class<? super T>> f49649a;

    /* renamed from: b */
    public final Set<C17869e> f49650b;

    /* renamed from: c */
    public final C17867c<T> f49651c;

    /* renamed from: d */
    public final Set<Class<?>> f49652d;

    /* renamed from: e */
    private final int f49653e;

    /* renamed from: com.google.firebase.components.a$a */
    public static class C17865a<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f49656a;

        /* renamed from: b */
        private final Set<C17869e> f49657b;

        /* renamed from: c */
        private int f49658c;

        /* renamed from: d */
        private C17867c<T> f49659d;

        /* renamed from: e */
        private Set<Class<?>> f49660e;

        /* renamed from: a */
        public final C17863a<T> mo34698a() {
            boolean z;
            if (this.f49659d != null) {
                z = true;
            } else {
                z = false;
            }
            C15464q.m32130a(z, (Object) "Missing required property: factory.");
            C17863a aVar = new C17863a(new HashSet(this.f49656a), new HashSet(this.f49657b), this.f49658c, this.f49659d, this.f49660e, 0);
            return aVar;
        }

        /* renamed from: a */
        public C17865a<T> mo34695a(int i) {
            boolean z;
            if (this.f49658c == 0) {
                z = true;
            } else {
                z = false;
            }
            C15464q.m32130a(z, (Object) "Instantiation type has already been set.");
            this.f49658c = i;
            return this;
        }

        /* renamed from: a */
        public final C17865a<T> mo34696a(C17867c<T> cVar) {
            this.f49659d = (C17867c) C15464q.m32124a(cVar, (Object) "Null factory");
            return this;
        }

        /* renamed from: a */
        public final C17865a<T> mo34697a(C17869e eVar) {
            C15464q.m32124a(eVar, (Object) "Null dependency");
            C15464q.m32134b(!this.f49656a.contains(eVar.f49661a), "Components are not allowed to depend on interfaces they themselves provide.");
            this.f49657b.add(eVar);
            return this;
        }

        private C17865a(Class<T> cls, Class<? super T>... clsArr) {
            this.f49656a = new HashSet();
            this.f49657b = new HashSet();
            this.f49658c = 0;
            this.f49660e = new HashSet();
            C15464q.m32124a(cls, (Object) "Null interface");
            this.f49656a.add(cls);
            for (Class<? super T> a : clsArr) {
                C15464q.m32124a(a, (Object) "Null interface");
            }
            Collections.addAll(this.f49656a, clsArr);
        }

        /* synthetic */ C17865a(Class cls, Class[] clsArr, byte b) {
            this(cls, clsArr);
        }
    }

    /* renamed from: b */
    public final boolean mo34693b() {
        if (this.f49653e == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo34692a() {
        if (this.f49653e == 1) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.f49649a.toArray()));
        sb.append(">{");
        sb.append(this.f49653e);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.f49650b.toArray()));
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> C17865a<T> m43802a(Class<T> cls) {
        return new C17865a<>(cls, new Class[0], 0);
    }

    /* renamed from: a */
    private static <T> C17865a<T> m43803a(Class<T> cls, Class<? super T>... clsArr) {
        return new C17865a<>(cls, clsArr, 0);
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> C17863a<T> m43804a(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m43803a(cls, clsArr).mo34696a(C17874j.m43820a((Object) t)).mo34698a();
    }

    private C17863a(Set<Class<? super T>> set, Set<C17869e> set2, int i, C17867c<T> cVar, Set<Class<?>> set3) {
        this.f49649a = Collections.unmodifiableSet(set);
        this.f49650b = Collections.unmodifiableSet(set2);
        this.f49653e = i;
        this.f49651c = cVar;
        this.f49652d = Collections.unmodifiableSet(set3);
    }

    /* synthetic */ C17863a(Set set, Set set2, int i, C17867c cVar, Set set3, byte b) {
        this(set, set2, i, cVar, set3);
    }
}
