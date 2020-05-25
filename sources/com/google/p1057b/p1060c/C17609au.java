package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17432q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.b.c.au */
public abstract class C17609au<K0, V0> {

    /* renamed from: com.google.b.c.au$a */
    static final class C17612a<V> implements C17432q<List<V>>, Serializable {

        /* renamed from: a */
        private final int f49289a;

        public final /* synthetic */ Object get() {
            return new ArrayList(this.f49289a);
        }

        C17612a(int i) {
            this.f49289a = C17698k.m43477a(i, "expectedValuesPerKey");
        }
    }

    /* renamed from: com.google.b.c.au$b */
    enum C17613b implements C17432q<List<Object>> {
        INSTANCE
    }

    /* renamed from: com.google.b.c.au$c */
    public static abstract class C17614c<K0, V0> extends C17609au<K0, V0> {
        /* renamed from: c */
        public abstract <K extends K0, V extends V0> C17592aq<K, V> mo34186c();

        C17614c() {
            super();
        }
    }

    /* renamed from: com.google.b.c.au$d */
    public static abstract class C17615d<K0> {
        C17615d() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo34185a();

        /* renamed from: c */
        public final C17614c<K0, Object> mo34188c() {
            return new C17614c<K0, Object>() {
                /* renamed from: c */
                public final <K extends K0, V> C17592aq<K, V> mo34186c() {
                    return C17618av.m43308a(C17615d.this.mo34185a(), C17613b.INSTANCE);
                }
            };
        }

        /* renamed from: b */
        public final C17614c<K0, Object> mo34187b() {
            C17698k.m43477a(2, "expectedValuesPerKey");
            return new C17614c<K0, Object>(2) {
                /* renamed from: c */
                public final <K extends K0, V> C17592aq<K, V> mo34186c() {
                    return C17618av.m43308a(C17615d.this.mo34185a(), new C17612a(2));
                }
            };
        }
    }

    private C17609au() {
    }

    /* renamed from: a */
    public static C17615d<Object> m43298a() {
        C17698k.m43477a(8, "expectedKeys");
        return new C17615d<Object>(8) {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> Map<K, Collection<V>> mo34185a() {
                return new C17702m(8);
            }
        };
    }

    /* renamed from: b */
    public static C17615d<Object> m43299b() {
        C17698k.m43477a(8, "expectedKeys");
        return new C17615d<Object>(8) {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> Map<K, Collection<V>> mo34185a() {
                return new C17713o(8);
            }
        };
    }
}
