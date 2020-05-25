package com.bytedance.jedi.p725a.p734g.p736b;

import com.bytedance.jedi.p725a.p734g.p735a.C11598a;
import com.bytedance.jedi.p725a.p734g.p735a.C11598a.C11599a;
import com.bytedance.jedi.p725a.p734g.p735a.C11601b;
import com.bytedance.jedi.p725a.p734g.p735a.C11605c;
import com.bytedance.jedi.p725a.p734g.p735a.C11607e;
import com.bytedance.jedi.p725a.p734g.p737c.C11674a;
import com.bytedance.jedi.p725a.p734g.p737c.C11675b;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/* renamed from: com.bytedance.jedi.a.g.b.c */
class C11614c<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: a */
    static final Logger f31011a = Logger.getLogger(C11614c.class.getName());

    /* renamed from: s */
    static final C11658u<Object, Object> f31012s = new C11658u<Object, Object>() {
        /* renamed from: a */
        public final int mo22370a() {
            return 0;
        }

        /* renamed from: a */
        public final C11658u<Object, Object> mo22371a(ReferenceQueue<Object> referenceQueue, Object obj, C11664d<Object, Object> dVar) {
            return this;
        }

        /* renamed from: b */
        public final C11664d<Object, Object> mo22372b() {
            return null;
        }

        /* renamed from: c */
        public final boolean mo22373c() {
            return false;
        }

        public final Object get() {
            return null;
        }
    };

    /* renamed from: t */
    static final Queue<?> f31013t = new AbstractQueue<Object>() {
        public final boolean offer(Object obj) {
            return true;
        }

        public final Object peek() {
            return null;
        }

        public final Object poll() {
            return null;
        }

        public final int size() {
            return 0;
        }

        public final Iterator<Object> iterator() {
            return new HashSet().iterator();
        }
    };

    /* renamed from: b */
    final int f31014b;

    /* renamed from: c */
    final int f31015c;

    /* renamed from: d */
    final C11646l<K, V>[] f31016d;

    /* renamed from: e */
    final int f31017e;

    /* renamed from: f */
    final C11598a<Object> f31018f;

    /* renamed from: g */
    final C11598a<Object> f31019g;

    /* renamed from: h */
    final C11648n f31020h;

    /* renamed from: i */
    final C11648n f31021i;

    /* renamed from: j */
    final long f31022j;

    /* renamed from: k */
    final C11673h<K, V> f31023k;

    /* renamed from: l */
    final long f31024l;

    /* renamed from: m */
    final long f31025m;

    /* renamed from: n */
    final long f31026n;

    /* renamed from: o */
    final Queue<C11672g<K, V>> f31027o;

    /* renamed from: p */
    final C11671f<K, V> f31028p;

    /* renamed from: q */
    final C11607e f31029q;

    /* renamed from: r */
    final C11630d f31030r;

    /* renamed from: u */
    Set<K> f31031u;

    /* renamed from: v */
    Collection<V> f31032v;

    /* renamed from: w */
    Set<Entry<K, V>> f31033w;

    /* renamed from: com.bytedance.jedi.a.g.b.c$a */
    abstract class C11617a<T> extends AbstractSet<T> {

        /* renamed from: a */
        final ConcurrentMap<?, ?> f31034a;

        public void clear() {
            this.f31034a.clear();
        }

        public boolean isEmpty() {
            return this.f31034a.isEmpty();
        }

        public int size() {
            return this.f31034a.size();
        }

        public Object[] toArray() {
            return C11614c.m23751a((Collection<E>) this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return C11614c.m23751a((Collection<E>) this).toArray(eArr);
        }

        C11617a(ConcurrentMap<?, ?> concurrentMap) {
            this.f31034a = concurrentMap;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$aa */
    static final class C11618aa<K, V> extends C11662y<K, V> {

        /* renamed from: a */
        volatile long f31036a = Long.MAX_VALUE;

        /* renamed from: b */
        C11664d<K, V> f31037b = C11614c.m23757j();

        /* renamed from: c */
        C11664d<K, V> f31038c = C11614c.m23757j();

        /* renamed from: h */
        public final long mo22388h() {
            return this.f31036a;
        }

        /* renamed from: i */
        public final C11664d<K, V> mo22389i() {
            return this.f31037b;
        }

        /* renamed from: j */
        public final C11664d<K, V> mo22390j() {
            return this.f31038c;
        }

        /* renamed from: b */
        public final void mo22385b(long j) {
            this.f31036a = j;
        }

        /* renamed from: c */
        public final void mo22386c(C11664d<K, V> dVar) {
            this.f31037b = dVar;
        }

        /* renamed from: d */
        public final void mo22387d(C11664d<K, V> dVar) {
            this.f31038c = dVar;
        }

        C11618aa(ReferenceQueue<K> referenceQueue, K k, int i, C11664d<K, V> dVar) {
            super(referenceQueue, k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$ab */
    static final class C11619ab<K, V> extends C11647m<K, V> {

        /* renamed from: b */
        final int f31039b;

        /* renamed from: a */
        public final int mo22370a() {
            return this.f31039b;
        }

        /* renamed from: a */
        public final C11658u<K, V> mo22371a(ReferenceQueue<V> referenceQueue, V v, C11664d<K, V> dVar) {
            return new C11619ab(referenceQueue, v, dVar, this.f31039b);
        }

        C11619ab(ReferenceQueue<V> referenceQueue, V v, C11664d<K, V> dVar, int i) {
            super(referenceQueue, v, dVar);
            this.f31039b = i;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$ac */
    static final class C11620ac<K, V> extends C11655r<K, V> {

        /* renamed from: b */
        final int f31040b;

        /* renamed from: a */
        public final int mo22370a() {
            return this.f31040b;
        }

        C11620ac(V v, int i) {
            super(v);
            this.f31040b = i;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$ad */
    static final class C11621ad<K, V> extends C11663z<K, V> {

        /* renamed from: b */
        final int f31041b;

        /* renamed from: a */
        public final int mo22370a() {
            return this.f31041b;
        }

        /* renamed from: a */
        public final C11658u<K, V> mo22371a(ReferenceQueue<V> referenceQueue, V v, C11664d<K, V> dVar) {
            return new C11621ad(referenceQueue, v, dVar, this.f31041b);
        }

        C11621ad(ReferenceQueue<V> referenceQueue, V v, C11664d<K, V> dVar, int i) {
            super(referenceQueue, v, dVar);
            this.f31041b = i;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$ae */
    static final class C11622ae<K, V> extends AbstractQueue<C11664d<K, V>> {

        /* renamed from: a */
        final C11664d<K, V> f31042a = new C11626b<K, V>() {

            /* renamed from: a */
            C11664d<K, V> f31043a = this;

            /* renamed from: b */
            C11664d<K, V> f31044b = this;

            /* renamed from: b */
            public final void mo22385b(long j) {
            }

            /* renamed from: h */
            public final long mo22388h() {
                return Long.MAX_VALUE;
            }

            /* renamed from: i */
            public final C11664d<K, V> mo22389i() {
                return this.f31043a;
            }

            /* renamed from: j */
            public final C11664d<K, V> mo22390j() {
                return this.f31044b;
            }

            /* renamed from: c */
            public final void mo22386c(C11664d<K, V> dVar) {
                this.f31043a = dVar;
            }

            /* renamed from: d */
            public final void mo22387d(C11664d<K, V> dVar) {
                this.f31044b = dVar;
            }
        };

        C11622ae() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C11664d<K, V> peek() {
            C11664d<K, V> i = this.f31042a.mo22389i();
            if (i == this.f31042a) {
                return null;
            }
            return i;
        }

        public final boolean isEmpty() {
            if (this.f31042a.mo22389i() == this.f31042a) {
                return true;
            }
            return false;
        }

        public final Iterator<C11664d<K, V>> iterator() {
            return new C11674a<C11664d<K, V>>(peek()) {
                /* renamed from: a */
                public final /* synthetic */ Object mo22400a(Object obj) {
                    C11664d<K, V> i = ((C11664d) obj).mo22389i();
                    if (i == C11622ae.this.f31042a) {
                        return null;
                    }
                    return i;
                }
            };
        }

        public final /* synthetic */ Object poll() {
            C11664d<K, V> i = this.f31042a.mo22389i();
            if (i == this.f31042a) {
                return null;
            }
            remove(i);
            return i;
        }

        public final int size() {
            int i = 0;
            for (C11664d<K, V> i2 = this.f31042a.mo22389i(); i2 != this.f31042a; i2 = i2.mo22389i()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            C11664d<K, V> i = this.f31042a.mo22389i();
            while (i != this.f31042a) {
                C11664d i2 = i.mo22389i();
                C11614c.m23755c(i);
                i = i2;
            }
            this.f31042a.mo22386c(this.f31042a);
            this.f31042a.mo22387d(this.f31042a);
        }

        public final boolean contains(Object obj) {
            if (((C11664d) obj).mo22389i() != C11645k.INSTANCE) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ boolean offer(Object obj) {
            C11664d dVar = (C11664d) obj;
            C11614c.m23754b(dVar.mo22390j(), dVar.mo22389i());
            C11614c.m23754b(this.f31042a.mo22390j(), dVar);
            C11614c.m23754b(dVar, this.f31042a);
            return true;
        }

        public final boolean remove(Object obj) {
            C11664d dVar = (C11664d) obj;
            C11664d j = dVar.mo22390j();
            C11664d i = dVar.mo22389i();
            C11614c.m23754b(j, i);
            C11614c.m23755c(dVar);
            if (i != C11645k.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$af */
    final class C11625af implements Entry<K, V> {

        /* renamed from: a */
        final K f31047a;

        /* renamed from: b */
        V f31048b;

        public final K getKey() {
            return this.f31047a;
        }

        public final V getValue() {
            return this.f31048b;
        }

        public final int hashCode() {
            return this.f31047a.hashCode() ^ this.f31048b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }

        public final V setValue(V v) {
            V put = C11614c.this.put(this.f31047a, v);
            this.f31048b = v;
            return put;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.f31047a.equals(entry.getKey()) || !this.f31048b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        C11625af(K k, V v) {
            this.f31047a = k;
            this.f31048b = v;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$b */
    static abstract class C11626b<K, V> implements C11664d<K, V> {
        C11626b() {
        }

        /* renamed from: a */
        public C11658u<K, V> mo22407a() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public C11664d<K, V> mo22411b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public int mo22413c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public K mo22414d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public long mo22415e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public C11664d<K, V> mo22416f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public C11664d<K, V> mo22417g() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: h */
        public long mo22388h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public C11664d<K, V> mo22389i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C11664d<K, V> mo22390j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo22408a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo22385b(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo22386c(C11664d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo22387d(C11664d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo22409a(C11658u<K, V> uVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo22412b(C11664d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo22410a(C11664d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$c */
    static final class C11627c<K, V> extends AbstractQueue<C11664d<K, V>> {

        /* renamed from: a */
        final C11664d<K, V> f31050a = new C11626b<K, V>() {

            /* renamed from: a */
            C11664d<K, V> f31051a = this;

            /* renamed from: b */
            C11664d<K, V> f31052b = this;

            /* renamed from: a */
            public final void mo22408a(long j) {
            }

            /* renamed from: e */
            public final long mo22415e() {
                return Long.MAX_VALUE;
            }

            /* renamed from: f */
            public final C11664d<K, V> mo22416f() {
                return this.f31051a;
            }

            /* renamed from: g */
            public final C11664d<K, V> mo22417g() {
                return this.f31052b;
            }

            /* renamed from: b */
            public final void mo22412b(C11664d<K, V> dVar) {
                this.f31052b = dVar;
            }

            /* renamed from: a */
            public final void mo22410a(C11664d<K, V> dVar) {
                this.f31051a = dVar;
            }
        };

        C11627c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C11664d<K, V> peek() {
            C11664d<K, V> f = this.f31050a.mo22416f();
            if (f == this.f31050a) {
                return null;
            }
            return f;
        }

        public final boolean isEmpty() {
            if (this.f31050a.mo22416f() == this.f31050a) {
                return true;
            }
            return false;
        }

        public final Iterator<C11664d<K, V>> iterator() {
            return new C11674a<C11664d<K, V>>(peek()) {
                /* renamed from: a */
                public final /* synthetic */ Object mo22400a(Object obj) {
                    C11664d<K, V> f = ((C11664d) obj).mo22416f();
                    if (f == C11627c.this.f31050a) {
                        return null;
                    }
                    return f;
                }
            };
        }

        public final /* synthetic */ Object poll() {
            C11664d<K, V> f = this.f31050a.mo22416f();
            if (f == this.f31050a) {
                return null;
            }
            remove(f);
            return f;
        }

        public final int size() {
            int i = 0;
            for (C11664d<K, V> f = this.f31050a.mo22416f(); f != this.f31050a; f = f.mo22416f()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            C11664d<K, V> f = this.f31050a.mo22416f();
            while (f != this.f31050a) {
                C11664d f2 = f.mo22416f();
                C11614c.m23753b(f);
                f = f2;
            }
            this.f31050a.mo22410a(this.f31050a);
            this.f31050a.mo22412b(this.f31050a);
        }

        public final boolean contains(Object obj) {
            if (((C11664d) obj).mo22416f() != C11645k.INSTANCE) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ boolean offer(Object obj) {
            C11664d dVar = (C11664d) obj;
            C11614c.m23752a(dVar.mo22417g(), dVar.mo22416f());
            C11614c.m23752a(this.f31050a.mo22417g(), dVar);
            C11614c.m23752a(dVar, this.f31050a);
            return true;
        }

        public final boolean remove(Object obj) {
            C11664d dVar = (C11664d) obj;
            C11664d g = dVar.mo22417g();
            C11664d f = dVar.mo22416f();
            C11614c.m23752a(g, f);
            C11614c.m23753b(dVar);
            if (f != C11645k.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$d */
    enum C11630d {
        STRONG {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11664d<K, V> mo22428a(C11646l<K, V> lVar, K k, int i, C11664d<K, V> dVar) {
                return new C11654q(k, i, dVar);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11664d<K, V> mo22427a(C11646l<K, V> lVar, C11664d<K, V> dVar, C11664d<K, V> dVar2) {
                C11664d<K, V> a = super.mo22427a(lVar, dVar, dVar2);
                m23824a(dVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11664d<K, V> mo22428a(C11646l<K, V> lVar, K k, int i, C11664d<K, V> dVar) {
                return new C11652o(k, i, dVar);
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11664d<K, V> mo22427a(C11646l<K, V> lVar, C11664d<K, V> dVar, C11664d<K, V> dVar2) {
                C11664d<K, V> a = super.mo22427a(lVar, dVar, dVar2);
                m23825b(dVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11664d<K, V> mo22428a(C11646l<K, V> lVar, K k, int i, C11664d<K, V> dVar) {
                return new C11656s(k, i, dVar);
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11664d<K, V> mo22427a(C11646l<K, V> lVar, C11664d<K, V> dVar, C11664d<K, V> dVar2) {
                C11664d<K, V> a = super.mo22427a(lVar, dVar, dVar2);
                m23824a(dVar, a);
                m23825b(dVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11664d<K, V> mo22428a(C11646l<K, V> lVar, K k, int i, C11664d<K, V> dVar) {
                return new C11653p(k, i, dVar);
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11664d<K, V> mo22428a(C11646l<K, V> lVar, K k, int i, C11664d<K, V> dVar) {
                return new C11662y(lVar.f31087h, k, i, dVar);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11664d<K, V> mo22427a(C11646l<K, V> lVar, C11664d<K, V> dVar, C11664d<K, V> dVar2) {
                C11664d<K, V> a = super.mo22427a(lVar, dVar, dVar2);
                m23824a(dVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11664d<K, V> mo22428a(C11646l<K, V> lVar, K k, int i, C11664d<K, V> dVar) {
                return new C11660w(lVar.f31087h, k, i, dVar);
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11664d<K, V> mo22427a(C11646l<K, V> lVar, C11664d<K, V> dVar, C11664d<K, V> dVar2) {
                C11664d<K, V> a = super.mo22427a(lVar, dVar, dVar2);
                m23825b(dVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11664d<K, V> mo22428a(C11646l<K, V> lVar, K k, int i, C11664d<K, V> dVar) {
                return new C11618aa(lVar.f31087h, k, i, dVar);
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11664d<K, V> mo22427a(C11646l<K, V> lVar, C11664d<K, V> dVar, C11664d<K, V> dVar2) {
                C11664d<K, V> a = super.mo22427a(lVar, dVar, dVar2);
                m23824a(dVar, a);
                m23825b(dVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11664d<K, V> mo22428a(C11646l<K, V> lVar, K k, int i, C11664d<K, V> dVar) {
                return new C11661x(lVar.f31087h, k, i, dVar);
            }
        };
        

        /* renamed from: i */
        static final C11630d[] f31063i = null;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <K, V> C11664d<K, V> mo22428a(C11646l<K, V> lVar, K k, int i, C11664d<K, V> dVar);

        static {
            f31063i = new C11630d[]{STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE};
        }

        /* renamed from: a */
        static <K, V> void m23824a(C11664d<K, V> dVar, C11664d<K, V> dVar2) {
            dVar2.mo22408a(dVar.mo22415e());
            C11614c.m23752a(dVar.mo22417g(), dVar2);
            C11614c.m23752a(dVar2, dVar.mo22416f());
            C11614c.m23753b(dVar);
        }

        /* renamed from: b */
        static <K, V> void m23825b(C11664d<K, V> dVar, C11664d<K, V> dVar2) {
            dVar2.mo22385b(dVar.mo22388h());
            C11614c.m23754b(dVar.mo22390j(), dVar2);
            C11614c.m23754b(dVar2, dVar.mo22389i());
            C11614c.m23755c(dVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <K, V> C11664d<K, V> mo22427a(C11646l<K, V> lVar, C11664d<K, V> dVar, C11664d<K, V> dVar2) {
            return mo22428a(lVar, dVar.mo22414d(), dVar.mo22413c(), dVar2);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$e */
    final class C11639e extends C11641g<Entry<K, V>> {
        public final /* synthetic */ Object next() {
            return mo22433a();
        }

        C11639e() {
            super();
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$f */
    final class C11640f extends C11617a<Entry<K, V>> {
        public final Iterator<Entry<K, V>> iterator() {
            return new C11639e();
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null || !C11614c.this.remove(key, entry.getValue())) {
                return false;
            }
            return true;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null) {
                return false;
            }
            Object obj2 = C11614c.this.get(key);
            if (obj2 == null || !C11614c.this.f31019g.equivalent(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        C11640f(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$g */
    abstract class C11641g<T> implements Iterator<T> {

        /* renamed from: b */
        int f31067b;

        /* renamed from: c */
        int f31068c = -1;

        /* renamed from: d */
        C11646l<K, V> f31069d;

        /* renamed from: e */
        AtomicReferenceArray<C11664d<K, V>> f31070e;

        /* renamed from: f */
        C11664d<K, V> f31071f;

        /* renamed from: g */
        C11625af f31072g;

        /* renamed from: h */
        C11625af f31073h;

        public boolean hasNext() {
            if (this.f31072g != null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private boolean m23844c() {
            if (this.f31071f != null) {
                do {
                    this.f31071f = this.f31071f.mo22411b();
                    if (this.f31071f != null) {
                    }
                } while (!m23842a(this.f31071f));
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C11625af mo22433a() {
            if (this.f31072g != null) {
                this.f31073h = this.f31072g;
                m23843b();
                return this.f31073h;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            if (this.f31073h != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C11614c.this.remove(this.f31073h.getKey());
                this.f31073h = null;
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: d */
        private boolean m23845d() {
            while (this.f31068c >= 0) {
                AtomicReferenceArray<C11664d<K, V>> atomicReferenceArray = this.f31070e;
                int i = this.f31068c;
                this.f31068c = i - 1;
                C11664d<K, V> dVar = (C11664d) atomicReferenceArray.get(i);
                this.f31071f = dVar;
                if (dVar != null && (m23842a(this.f31071f) || m23844c())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private void m23843b() {
            this.f31072g = null;
            if (!m23844c() && !m23845d()) {
                while (this.f31067b >= 0) {
                    C11646l<K, V>[] lVarArr = C11614c.this.f31016d;
                    int i = this.f31067b;
                    this.f31067b = i - 1;
                    this.f31069d = lVarArr[i];
                    if (this.f31069d.f31081b != 0) {
                        this.f31070e = this.f31069d.f31085f;
                        this.f31068c = this.f31070e.length() - 1;
                        if (m23845d()) {
                            return;
                        }
                    }
                }
            }
        }

        C11641g() {
            this.f31067b = C11614c.this.f31016d.length - 1;
            m23843b();
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private boolean m23842a(C11664d<K, V> dVar) {
            try {
                long a = C11614c.this.f31029q.mo22328a();
                Object d = dVar.mo22414d();
                C11614c cVar = C11614c.this;
                Object obj = null;
                if (dVar.mo22414d() != null) {
                    Object obj2 = dVar.mo22407a().get();
                    if (obj2 != null) {
                        if (!cVar.mo22344a(dVar, a)) {
                            obj = obj2;
                        }
                    }
                }
                if (obj != null) {
                    this.f31072g = new C11625af<>(d, obj);
                    this.f31069d.mo22449b();
                    return true;
                }
                this.f31069d.mo22449b();
                return false;
            } catch (Throwable th) {
                this.f31069d.mo22449b();
                throw th;
            }
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$h */
    final class C11642h extends C11641g<K> {
        public final K next() {
            return mo22433a().getKey();
        }

        C11642h() {
            super();
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$i */
    final class C11643i extends C11617a<K> {
        public final Iterator<K> iterator() {
            return new C11642h();
        }

        public final boolean contains(Object obj) {
            return this.f31034a.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (this.f31034a.remove(obj) != null) {
                return true;
            }
            return false;
        }

        C11643i(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$j */
    static class C11644j<K, V> implements C11609a<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        final C11614c<K, V> f31077a;

        /* renamed from: b */
        public final ConcurrentMap<K, V> mo22332b() {
            return this.f31077a;
        }

        /* renamed from: a */
        public final void mo22330a() {
            this.f31077a.clear();
        }

        private C11644j(C11614c<K, V> cVar) {
            this.f31077a = cVar;
        }

        C11644j(C11610b<? super K, ? super V> bVar) {
            this(new C11614c<>(bVar));
        }

        /* renamed from: b */
        public final void mo22333b(Object obj) {
            C11605c.m23732a(obj);
            this.f31077a.remove(obj);
        }

        /* renamed from: a */
        public final V mo22329a(Object obj) {
            C11614c<K, V> cVar = this.f31077a;
            int a = cVar.mo22339a(C11605c.m23732a(obj));
            return cVar.mo22340a(a).mo22440a(obj, a);
        }

        /* renamed from: a */
        public final void mo22331a(K k, V v) {
            this.f31077a.put(k, v);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$k */
    enum C11645k implements C11664d<Object, Object> {
        INSTANCE;

        /* renamed from: a */
        public final C11658u<Object, Object> mo22407a() {
            return null;
        }

        /* renamed from: a */
        public final void mo22408a(long j) {
        }

        /* renamed from: a */
        public final void mo22409a(C11658u<Object, Object> uVar) {
        }

        /* renamed from: a */
        public final void mo22410a(C11664d<Object, Object> dVar) {
        }

        /* renamed from: b */
        public final C11664d<Object, Object> mo22411b() {
            return null;
        }

        /* renamed from: b */
        public final void mo22385b(long j) {
        }

        /* renamed from: b */
        public final void mo22412b(C11664d<Object, Object> dVar) {
        }

        /* renamed from: c */
        public final int mo22413c() {
            return 0;
        }

        /* renamed from: c */
        public final void mo22386c(C11664d<Object, Object> dVar) {
        }

        /* renamed from: d */
        public final Object mo22414d() {
            return null;
        }

        /* renamed from: d */
        public final void mo22387d(C11664d<Object, Object> dVar) {
        }

        /* renamed from: e */
        public final long mo22415e() {
            return 0;
        }

        /* renamed from: f */
        public final C11664d<Object, Object> mo22416f() {
            return this;
        }

        /* renamed from: g */
        public final C11664d<Object, Object> mo22417g() {
            return this;
        }

        /* renamed from: h */
        public final long mo22388h() {
            return 0;
        }

        /* renamed from: i */
        public final C11664d<Object, Object> mo22389i() {
            return this;
        }

        /* renamed from: j */
        public final C11664d<Object, Object> mo22390j() {
            return this;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$l */
    static class C11646l<K, V> extends ReentrantLock {

        /* renamed from: a */
        final C11614c<K, V> f31080a;

        /* renamed from: b */
        volatile int f31081b;

        /* renamed from: c */
        long f31082c;

        /* renamed from: d */
        int f31083d;

        /* renamed from: e */
        int f31084e;

        /* renamed from: f */
        volatile AtomicReferenceArray<C11664d<K, V>> f31085f;

        /* renamed from: g */
        final long f31086g;

        /* renamed from: h */
        final ReferenceQueue<K> f31087h;

        /* renamed from: i */
        final ReferenceQueue<V> f31088i;

        /* renamed from: j */
        final Queue<C11664d<K, V>> f31089j;

        /* renamed from: k */
        final AtomicInteger f31090k = new AtomicInteger();

        /* renamed from: l */
        final Queue<C11664d<K, V>> f31091l;

        /* renamed from: m */
        final Queue<C11664d<K, V>> f31092m;

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo22454c() {
            m23888j();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo22440a(Object obj, int i) {
            try {
                if (this.f31081b != 0) {
                    long a = this.f31080a.f31029q.mo22328a();
                    C11664d a2 = m23871a(obj, i, a);
                    if (a2 == null) {
                        return null;
                    }
                    V v = a2.mo22407a().get();
                    if (v != null) {
                        if (this.f31080a.mo22353f()) {
                            a2.mo22408a(a);
                        }
                        this.f31089j.add(a2);
                        mo22449b();
                        return v;
                    }
                    mo22443a();
                }
                mo22449b();
                return null;
            } finally {
                mo22449b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo22443a() {
            if (tryLock()) {
                try {
                    m23881d();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo22444a(long j) {
            if (tryLock()) {
                try {
                    m23879c(j);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo22445a(K k, int i, V v, int i2, C11665e eVar) {
            this.f31082c -= (long) i2;
            if (this.f31080a.f31027o != C11614c.f31013t) {
                this.f31080a.f31027o.offer(C11672g.create(k, v, eVar));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo22442a(K k, int i, V v, boolean z) {
            int i2;
            int i3 = i;
            lock();
            try {
                long a = this.f31080a.f31029q.mo22328a();
                mo22450b(a);
                if (this.f31081b + 1 > this.f31084e) {
                    AtomicReferenceArray<C11664d<K, V>> atomicReferenceArray = this.f31085f;
                    int length = atomicReferenceArray.length();
                    if (length < 1073741824) {
                        int i4 = this.f31081b;
                        AtomicReferenceArray<C11664d<K, V>> a2 = m23872a(length << 1);
                        this.f31084e = (a2.length() * 3) / 4;
                        int length2 = a2.length() - 1;
                        for (int i5 = 0; i5 < length; i5++) {
                            C11664d dVar = (C11664d) atomicReferenceArray.get(i5);
                            if (dVar != null) {
                                C11664d b = dVar.mo22411b();
                                int c = dVar.mo22413c() & length2;
                                if (b == null) {
                                    a2.set(c, dVar);
                                } else {
                                    C11664d dVar2 = dVar;
                                    while (b != null) {
                                        int c2 = b.mo22413c() & length2;
                                        if (c2 != c) {
                                            dVar2 = b;
                                            c = c2;
                                        }
                                        b = b.mo22411b();
                                    }
                                    a2.set(c, dVar2);
                                    while (dVar != dVar2) {
                                        int c3 = dVar.mo22413c() & length2;
                                        C11664d a3 = m23869a(dVar, (C11664d) a2.get(c3));
                                        if (a3 != null) {
                                            a2.set(c3, a3);
                                        } else {
                                            m23878b(dVar);
                                            i4--;
                                        }
                                        dVar = dVar.mo22411b();
                                    }
                                }
                            }
                        }
                        this.f31085f = a2;
                        this.f31081b = i4;
                    }
                    int i6 = this.f31081b;
                }
                AtomicReferenceArray<C11664d<K, V>> atomicReferenceArray2 = this.f31085f;
                int length3 = i3 & (atomicReferenceArray2.length() - 1);
                C11664d dVar3 = (C11664d) atomicReferenceArray2.get(length3);
                for (C11664d dVar4 = dVar3; dVar4 != null; dVar4 = dVar4.mo22411b()) {
                    Object d = dVar4.mo22414d();
                    if (dVar4.mo22413c() != i3 || d == null) {
                        K k2 = k;
                    } else if (this.f31080a.f31018f.equivalent(k, d)) {
                        C11658u a4 = dVar4.mo22407a();
                        V v2 = a4.get();
                        if (v2 == null) {
                            this.f31083d++;
                            if (a4.mo22373c()) {
                                mo22445a(k, i, v2, a4.mo22370a(), C11665e.COLLECTED);
                                m23875a(dVar4, k, v, a);
                                i2 = this.f31081b;
                            } else {
                                m23875a(dVar4, k, v, a);
                                i2 = this.f31081b + 1;
                            }
                            this.f31081b = i2;
                            m23873a(dVar4);
                            return null;
                        } else if (z) {
                            m23874a(dVar4, a);
                            unlock();
                            mo22454c();
                            return v2;
                        } else {
                            this.f31083d++;
                            mo22445a(k, i, v2, a4.mo22370a(), C11665e.REPLACED);
                            m23875a(dVar4, k, v, a);
                            m23873a(dVar4);
                            unlock();
                            mo22454c();
                            return v2;
                        }
                    }
                }
                K k3 = k;
                this.f31083d++;
                C11664d a5 = this.f31080a.f31030r.mo22428a(this, C11605c.m23732a(k), i3, dVar3);
                m23875a(a5, k, v, a);
                atomicReferenceArray2.set(length3, a5);
                this.f31081b++;
                m23873a(a5);
                unlock();
                mo22454c();
                return null;
            } finally {
                unlock();
                mo22454c();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo22448a(K k, int i, V v, V v2) {
            int i2 = i;
            lock();
            try {
                long a = this.f31080a.f31029q.mo22328a();
                mo22450b(a);
                AtomicReferenceArray<C11664d<K, V>> atomicReferenceArray = this.f31085f;
                int length = i2 & (atomicReferenceArray.length() - 1);
                C11664d dVar = (C11664d) atomicReferenceArray.get(length);
                for (C11664d dVar2 = dVar; dVar2 != null; dVar2 = dVar2.mo22411b()) {
                    Object d = dVar2.mo22414d();
                    if (dVar2.mo22413c() != i2 || d == null) {
                        K k2 = k;
                    } else if (this.f31080a.f31018f.equivalent(k, d)) {
                        C11658u a2 = dVar2.mo22407a();
                        Object obj = a2.get();
                        if (obj == null) {
                            if (a2.mo22373c()) {
                                int i3 = this.f31081b;
                                this.f31083d++;
                                C11664d a3 = m23870a(dVar, dVar2, d, i, obj, a2, C11665e.COLLECTED);
                                int i4 = this.f31081b - 1;
                                atomicReferenceArray.set(length, a3);
                                this.f31081b = i4;
                            }
                            return false;
                        } else if (this.f31080a.f31019g.equivalent(v, obj)) {
                            this.f31083d++;
                            mo22445a(k, i, obj, a2.mo22370a(), C11665e.REPLACED);
                            m23875a(dVar2, k, v2, a);
                            m23873a(dVar2);
                            unlock();
                            mo22454c();
                            return true;
                        } else {
                            m23874a(dVar2, a);
                            unlock();
                            mo22454c();
                            return false;
                        }
                    }
                    V v3 = v;
                }
                unlock();
                mo22454c();
                return false;
            } finally {
                unlock();
                mo22454c();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo22441a(K k, int i, V v) {
            int i2 = i;
            lock();
            try {
                long a = this.f31080a.f31029q.mo22328a();
                mo22450b(a);
                AtomicReferenceArray<C11664d<K, V>> atomicReferenceArray = this.f31085f;
                int length = i2 & (atomicReferenceArray.length() - 1);
                C11664d dVar = (C11664d) atomicReferenceArray.get(length);
                for (C11664d dVar2 = dVar; dVar2 != null; dVar2 = dVar2.mo22411b()) {
                    Object d = dVar2.mo22414d();
                    if (dVar2.mo22413c() != i2 || d == null) {
                        K k2 = k;
                    } else if (this.f31080a.f31018f.equivalent(k, d)) {
                        C11658u a2 = dVar2.mo22407a();
                        V v2 = a2.get();
                        if (v2 == null) {
                            if (a2.mo22373c()) {
                                int i3 = this.f31081b;
                                this.f31083d++;
                                C11664d a3 = m23870a(dVar, dVar2, d, i, v2, a2, C11665e.COLLECTED);
                                int i4 = this.f31081b - 1;
                                atomicReferenceArray.set(length, a3);
                                this.f31081b = i4;
                            }
                            return null;
                        }
                        this.f31083d++;
                        mo22445a(k, i, v2, a2.mo22370a(), C11665e.REPLACED);
                        m23875a(dVar2, k, v, a);
                        m23873a(dVar2);
                        unlock();
                        mo22454c();
                        return v2;
                    }
                }
                unlock();
                mo22454c();
                return null;
            } finally {
                unlock();
                mo22454c();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo22446a(C11664d<K, V> dVar, int i) {
            lock();
            try {
                int i2 = this.f31081b;
                AtomicReferenceArray<C11664d<K, V>> atomicReferenceArray = this.f31085f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C11664d<K, V> dVar2 = (C11664d) atomicReferenceArray.get(length);
                for (C11664d<K, V> dVar3 = dVar2; dVar3 != null; dVar3 = dVar3.mo22411b()) {
                    if (dVar3 == dVar) {
                        this.f31083d++;
                        int i3 = this.f31081b - 1;
                        atomicReferenceArray.set(length, m23870a(dVar2, dVar3, dVar3.mo22414d(), i, dVar3.mo22407a().get(), dVar3.mo22407a(), C11665e.COLLECTED));
                        this.f31081b = i3;
                        return true;
                    }
                }
                unlock();
                mo22454c();
                return false;
            } finally {
                unlock();
                mo22454c();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo22447a(K k, int i, C11658u<K, V> uVar) {
            lock();
            try {
                int i2 = this.f31081b;
                AtomicReferenceArray<C11664d<K, V>> atomicReferenceArray = this.f31085f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C11664d dVar = (C11664d) atomicReferenceArray.get(length);
                C11664d dVar2 = dVar;
                while (dVar2 != null) {
                    Object d = dVar2.mo22414d();
                    if (dVar2.mo22413c() != i || d == null || !this.f31080a.f31018f.equivalent(k, d)) {
                        dVar2 = dVar2.mo22411b();
                    } else if (dVar2.mo22407a() == uVar) {
                        this.f31083d++;
                        int i3 = this.f31081b - 1;
                        atomicReferenceArray.set(length, m23870a(dVar, dVar2, d, i, uVar.get(), uVar, C11665e.COLLECTED));
                        this.f31081b = i3;
                        return true;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            mo22454c();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    mo22454c();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    mo22454c();
                }
            }
        }

        /* renamed from: i */
        private void m23887i() {
            m23882d(this.f31080a.f31029q.mo22328a());
            m23888j();
        }

        /* renamed from: j */
        private void m23888j() {
            if (!isHeldByCurrentThread()) {
                this.f31080a.mo22360l();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo22449b() {
            if ((this.f31090k.incrementAndGet() & 63) == 0) {
                m23887i();
            }
        }

        /* renamed from: d */
        private void m23881d() {
            if (this.f31080a.mo22354g()) {
                m23883e();
            }
            if (this.f31080a.mo22357h()) {
                m23884f();
            }
        }

        /* renamed from: e */
        private void m23883e() {
            int i = 0;
            do {
                Reference poll = this.f31087h.poll();
                if (poll != null) {
                    this.f31080a.mo22342a((C11664d) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: f */
        private void m23884f() {
            int i = 0;
            do {
                Reference poll = this.f31088i.poll();
                if (poll != null) {
                    this.f31080a.mo22341a((C11658u) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: g */
        private void m23885g() {
            while (true) {
                C11664d dVar = (C11664d) this.f31089j.poll();
                if (dVar == null) {
                    return;
                }
                if (this.f31092m.contains(dVar)) {
                    this.f31092m.add(dVar);
                }
            }
        }

        /* renamed from: h */
        private C11664d<K, V> m23886h() {
            for (C11664d<K, V> dVar : this.f31092m) {
                if (dVar.mo22407a().mo22370a() > 0) {
                    return dVar;
                }
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo22450b(long j) {
            m23882d(j);
        }

        /* renamed from: a */
        private static AtomicReferenceArray<C11664d<K, V>> m23872a(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* renamed from: b */
        private void m23878b(C11664d<K, V> dVar) {
            mo22445a(dVar.mo22414d(), dVar.mo22413c(), dVar.mo22407a().get(), dVar.mo22407a().mo22370a(), C11665e.COLLECTED);
            this.f31091l.remove(dVar);
            this.f31092m.remove(dVar);
        }

        /* renamed from: c */
        private void m23879c(long j) {
            C11664d dVar;
            C11664d dVar2;
            m23885g();
            do {
                dVar = (C11664d) this.f31091l.peek();
                if (dVar == null || !this.f31080a.mo22344a(dVar, j)) {
                    do {
                        dVar2 = (C11664d) this.f31092m.peek();
                        if (dVar2 == null || !this.f31080a.mo22344a(dVar2, j)) {
                            return;
                        }
                    } while (m23876a(dVar2, dVar2.mo22413c(), C11665e.EXPIRED));
                    throw new AssertionError();
                }
            } while (m23876a(dVar, dVar.mo22413c(), C11665e.EXPIRED));
            throw new AssertionError();
        }

        /* renamed from: d */
        private void m23882d(long j) {
            if (tryLock()) {
                try {
                    m23881d();
                    m23879c(j);
                    this.f31090k.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: a */
        private void m23873a(C11664d<K, V> dVar) {
            if (this.f31080a.mo22343a()) {
                m23885g();
                if (((long) dVar.mo22407a().mo22370a()) <= this.f31086g || m23876a(dVar, dVar.mo22413c(), C11665e.SIZE)) {
                    while (this.f31082c > this.f31086g) {
                        C11664d h = m23886h();
                        if (!m23876a(h, h.mo22413c(), C11665e.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        /* renamed from: b */
        private C11664d<K, V> m23877b(C11664d<K, V> dVar, C11664d<K, V> dVar2) {
            int i = this.f31081b;
            C11664d<K, V> b = dVar2.mo22411b();
            while (dVar != dVar2) {
                C11664d<K, V> a = m23869a(dVar, b);
                if (a != null) {
                    b = a;
                } else {
                    m23878b(dVar);
                    i--;
                }
                dVar = dVar.mo22411b();
            }
            this.f31081b = i;
            return b;
        }

        /* renamed from: a */
        private C11664d<K, V> m23869a(C11664d<K, V> dVar, C11664d<K, V> dVar2) {
            if (dVar.mo22414d() == null) {
                return null;
            }
            C11658u a = dVar.mo22407a();
            Object obj = a.get();
            if (obj == null && a.mo22373c()) {
                return null;
            }
            C11664d<K, V> a2 = this.f31080a.f31030r.mo22427a(this, dVar, dVar2);
            a2.mo22409a(a.mo22371a(this.f31088i, obj, a2));
            return a2;
        }

        /* renamed from: d */
        private C11664d<K, V> m23880d(Object obj, int i) {
            AtomicReferenceArray<C11664d<K, V>> atomicReferenceArray = this.f31085f;
            for (C11664d<K, V> dVar = (C11664d) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); dVar != null; dVar = dVar.mo22411b()) {
                if (dVar.mo22413c() == i) {
                    Object d = dVar.mo22414d();
                    if (d == null) {
                        mo22443a();
                    } else if (this.f31080a.f31018f.equivalent(obj, d)) {
                        return dVar;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo22451b(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f31081b != 0) {
                    C11664d a = m23871a(obj, i, this.f31080a.f31029q.mo22328a());
                    if (a == null) {
                        return false;
                    }
                    if (a.mo22407a().get() != null) {
                        z = true;
                    }
                    mo22449b();
                    return z;
                }
                mo22449b();
                return false;
            } finally {
                mo22449b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final V mo22453c(Object obj, int i) {
            C11665e eVar;
            lock();
            try {
                mo22450b(this.f31080a.f31029q.mo22328a());
                int i2 = this.f31081b;
                AtomicReferenceArray<C11664d<K, V>> atomicReferenceArray = this.f31085f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C11664d dVar = (C11664d) atomicReferenceArray.get(length);
                C11664d dVar2 = dVar;
                while (dVar2 != null) {
                    Object d = dVar2.mo22414d();
                    if (dVar2.mo22413c() != i || d == null || !this.f31080a.f31018f.equivalent(obj, d)) {
                        dVar2 = dVar2.mo22411b();
                    } else {
                        C11658u a = dVar2.mo22407a();
                        V v = a.get();
                        if (v != null) {
                            eVar = C11665e.EXPLICIT;
                        } else if (a.mo22373c()) {
                            eVar = C11665e.COLLECTED;
                        } else {
                            unlock();
                            mo22454c();
                            return null;
                        }
                        C11665e eVar2 = eVar;
                        this.f31083d++;
                        int i3 = this.f31081b - 1;
                        atomicReferenceArray.set(length, m23870a(dVar, dVar2, d, i, v, a, eVar2));
                        this.f31081b = i3;
                        return v;
                    }
                }
                unlock();
                mo22454c();
                return null;
            } finally {
                unlock();
                mo22454c();
            }
        }

        /* renamed from: a */
        private void m23874a(C11664d<K, V> dVar, long j) {
            if (this.f31080a.mo22353f()) {
                dVar.mo22408a(j);
            }
            this.f31092m.add(dVar);
        }

        /* renamed from: a */
        private C11664d<K, V> m23871a(Object obj, int i, long j) {
            C11664d<K, V> d = m23880d(obj, i);
            if (d == null) {
                return null;
            }
            if (!this.f31080a.mo22344a(d, j)) {
                return d;
            }
            mo22444a(j);
            return null;
        }

        C11646l(C11614c<K, V> cVar, int i, long j) {
            ReferenceQueue<K> referenceQueue;
            Queue<C11664d<K, V>> queue;
            Queue<C11664d<K, V>> queue2;
            Queue<C11664d<K, V>> queue3;
            this.f31080a = cVar;
            this.f31086g = j;
            AtomicReferenceArray<C11664d<K, V>> a = m23872a(i);
            this.f31084e = (a.length() * 3) / 4;
            if (!this.f31080a.mo22345b() && ((long) this.f31084e) == this.f31086g) {
                this.f31084e++;
            }
            this.f31085f = a;
            ReferenceQueue<V> referenceQueue2 = null;
            if (cVar.mo22354g()) {
                referenceQueue = new ReferenceQueue<>();
            } else {
                referenceQueue = null;
            }
            this.f31087h = referenceQueue;
            if (cVar.mo22357h()) {
                referenceQueue2 = new ReferenceQueue<>();
            }
            this.f31088i = referenceQueue2;
            if (cVar.mo22346c()) {
                queue = new ConcurrentLinkedQueue<>();
            } else {
                queue = C11614c.m23758k();
            }
            this.f31089j = queue;
            if (cVar.mo22350d()) {
                queue2 = new C11622ae<>();
            } else {
                queue2 = C11614c.m23758k();
            }
            this.f31091l = queue2;
            if (cVar.mo22346c()) {
                queue3 = new C11627c<>();
            } else {
                queue3 = C11614c.m23758k();
            }
            this.f31092m = queue3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo22452b(Object obj, int i, Object obj2) {
            C11665e eVar;
            lock();
            try {
                mo22450b(this.f31080a.f31029q.mo22328a());
                int i2 = this.f31081b;
                AtomicReferenceArray<C11664d<K, V>> atomicReferenceArray = this.f31085f;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                C11664d dVar = (C11664d) atomicReferenceArray.get(length);
                C11664d dVar2 = dVar;
                while (dVar2 != null) {
                    Object d = dVar2.mo22414d();
                    if (dVar2.mo22413c() != i || d == null || !this.f31080a.f31018f.equivalent(obj, d)) {
                        dVar2 = dVar2.mo22411b();
                    } else {
                        C11658u a = dVar2.mo22407a();
                        Object obj3 = a.get();
                        if (this.f31080a.f31019g.equivalent(obj2, obj3)) {
                            eVar = C11665e.EXPLICIT;
                        } else if (obj3 != null || !a.mo22373c()) {
                            unlock();
                            mo22454c();
                            return false;
                        } else {
                            eVar = C11665e.COLLECTED;
                        }
                        this.f31083d++;
                        int i3 = this.f31081b - 1;
                        atomicReferenceArray.set(length, m23870a(dVar, dVar2, d, i, obj3, a, eVar));
                        this.f31081b = i3;
                        if (eVar != C11665e.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                mo22454c();
                return false;
            } finally {
                unlock();
                mo22454c();
            }
        }

        /* renamed from: a */
        private boolean m23876a(C11664d<K, V> dVar, int i, C11665e eVar) {
            int i2 = this.f31081b;
            AtomicReferenceArray<C11664d<K, V>> atomicReferenceArray = this.f31085f;
            int length = (atomicReferenceArray.length() - 1) & i;
            C11664d<K, V> dVar2 = (C11664d) atomicReferenceArray.get(length);
            for (C11664d<K, V> dVar3 = dVar2; dVar3 != null; dVar3 = dVar3.mo22411b()) {
                if (dVar3 == dVar) {
                    this.f31083d++;
                    int i3 = this.f31081b - 1;
                    atomicReferenceArray.set(length, m23870a(dVar2, dVar3, dVar3.mo22414d(), i, dVar3.mo22407a().get(), dVar3.mo22407a(), eVar));
                    this.f31081b = i3;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        private void m23875a(C11664d<K, V> dVar, K k, V v, long j) {
            dVar.mo22407a();
            C11605c.m23733a(true, "Weights must be non-negative");
            dVar.mo22409a(this.f31080a.f31021i.mo22456a(this, dVar, v, 1));
            m23885g();
            this.f31082c += (long) 1;
            if (this.f31080a.mo22353f()) {
                dVar.mo22408a(j);
            }
            if (this.f31080a.mo22351e()) {
                dVar.mo22385b(j);
            }
            this.f31092m.add(dVar);
            this.f31091l.add(dVar);
        }

        /* renamed from: a */
        private C11664d<K, V> m23870a(C11664d<K, V> dVar, C11664d<K, V> dVar2, K k, int i, V v, C11658u<K, V> uVar, C11665e eVar) {
            mo22445a(k, i, v, uVar.mo22370a(), eVar);
            this.f31091l.remove(dVar2);
            this.f31092m.remove(dVar2);
            return m23877b(dVar, dVar2);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$m */
    static class C11647m<K, V> extends SoftReference<V> implements C11658u<K, V> {

        /* renamed from: a */
        final C11664d<K, V> f31093a;

        /* renamed from: a */
        public int mo22370a() {
            return 1;
        }

        /* renamed from: b */
        public final C11664d<K, V> mo22372b() {
            return this.f31093a;
        }

        /* renamed from: c */
        public final boolean mo22373c() {
            return true;
        }

        C11647m(ReferenceQueue<V> referenceQueue, V v, C11664d<K, V> dVar) {
            super(v, referenceQueue);
            this.f31093a = dVar;
        }

        /* renamed from: a */
        public C11658u<K, V> mo22371a(ReferenceQueue<V> referenceQueue, V v, C11664d<K, V> dVar) {
            return new C11647m(referenceQueue, v, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$n */
    enum C11648n {
        STRONG {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final C11598a<Object> mo22455a() {
                return C11599a.INSTANCE;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11658u<K, V> mo22456a(C11646l<K, V> lVar, C11664d<K, V> dVar, V v, int i) {
                if (i == 1) {
                    return new C11655r(v);
                }
                return new C11620ac(v, i);
            }
        },
        SOFT {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final C11598a<Object> mo22455a() {
                return C11598a.identity();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11658u<K, V> mo22456a(C11646l<K, V> lVar, C11664d<K, V> dVar, V v, int i) {
                if (i == 1) {
                    return new C11647m(lVar.f31088i, v, dVar);
                }
                return new C11619ab(lVar.f31088i, v, dVar, i);
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final C11598a<Object> mo22455a() {
                return C11598a.identity();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11658u<K, V> mo22456a(C11646l<K, V> lVar, C11664d<K, V> dVar, V v, int i) {
                if (i == 1) {
                    return new C11663z(lVar.f31088i, v, dVar);
                }
                return new C11621ad(lVar.f31088i, v, dVar, i);
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C11598a<Object> mo22455a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <K, V> C11658u<K, V> mo22456a(C11646l<K, V> lVar, C11664d<K, V> dVar, V v, int i);
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$o */
    static final class C11652o<K, V> extends C11654q<K, V> {

        /* renamed from: a */
        volatile long f31098a = Long.MAX_VALUE;

        /* renamed from: b */
        C11664d<K, V> f31099b = C11614c.m23757j();

        /* renamed from: c */
        C11664d<K, V> f31100c = C11614c.m23757j();

        /* renamed from: e */
        public final long mo22415e() {
            return this.f31098a;
        }

        /* renamed from: f */
        public final C11664d<K, V> mo22416f() {
            return this.f31099b;
        }

        /* renamed from: g */
        public final C11664d<K, V> mo22417g() {
            return this.f31100c;
        }

        /* renamed from: a */
        public final void mo22408a(long j) {
            this.f31098a = j;
        }

        /* renamed from: b */
        public final void mo22412b(C11664d<K, V> dVar) {
            this.f31100c = dVar;
        }

        /* renamed from: a */
        public final void mo22410a(C11664d<K, V> dVar) {
            this.f31099b = dVar;
        }

        C11652o(K k, int i, C11664d<K, V> dVar) {
            super(k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$p */
    static final class C11653p<K, V> extends C11654q<K, V> {

        /* renamed from: a */
        volatile long f31101a = Long.MAX_VALUE;

        /* renamed from: b */
        C11664d<K, V> f31102b = C11614c.m23757j();

        /* renamed from: c */
        C11664d<K, V> f31103c = C11614c.m23757j();

        /* renamed from: d */
        volatile long f31104d = Long.MAX_VALUE;

        /* renamed from: e */
        C11664d<K, V> f31105e = C11614c.m23757j();

        /* renamed from: f */
        C11664d<K, V> f31106f = C11614c.m23757j();

        /* renamed from: e */
        public final long mo22415e() {
            return this.f31101a;
        }

        /* renamed from: f */
        public final C11664d<K, V> mo22416f() {
            return this.f31102b;
        }

        /* renamed from: g */
        public final C11664d<K, V> mo22417g() {
            return this.f31103c;
        }

        /* renamed from: h */
        public final long mo22388h() {
            return this.f31104d;
        }

        /* renamed from: i */
        public final C11664d<K, V> mo22389i() {
            return this.f31105e;
        }

        /* renamed from: j */
        public final C11664d<K, V> mo22390j() {
            return this.f31106f;
        }

        /* renamed from: a */
        public final void mo22408a(long j) {
            this.f31101a = j;
        }

        /* renamed from: b */
        public final void mo22385b(long j) {
            this.f31104d = j;
        }

        /* renamed from: c */
        public final void mo22386c(C11664d<K, V> dVar) {
            this.f31105e = dVar;
        }

        /* renamed from: d */
        public final void mo22387d(C11664d<K, V> dVar) {
            this.f31106f = dVar;
        }

        /* renamed from: a */
        public final void mo22410a(C11664d<K, V> dVar) {
            this.f31102b = dVar;
        }

        /* renamed from: b */
        public final void mo22412b(C11664d<K, V> dVar) {
            this.f31103c = dVar;
        }

        C11653p(K k, int i, C11664d<K, V> dVar) {
            super(k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$q */
    static class C11654q<K, V> extends C11626b<K, V> {

        /* renamed from: g */
        final K f31107g;

        /* renamed from: h */
        final int f31108h;

        /* renamed from: i */
        final C11664d<K, V> f31109i;

        /* renamed from: j */
        volatile C11658u<K, V> f31110j = C11614c.m23756i();

        /* renamed from: a */
        public final C11658u<K, V> mo22407a() {
            return this.f31110j;
        }

        /* renamed from: b */
        public final C11664d<K, V> mo22411b() {
            return this.f31109i;
        }

        /* renamed from: c */
        public final int mo22413c() {
            return this.f31108h;
        }

        /* renamed from: d */
        public final K mo22414d() {
            return this.f31107g;
        }

        /* renamed from: a */
        public final void mo22409a(C11658u<K, V> uVar) {
            this.f31110j = uVar;
        }

        C11654q(K k, int i, C11664d<K, V> dVar) {
            this.f31107g = k;
            this.f31108h = i;
            this.f31109i = dVar;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$r */
    static class C11655r<K, V> implements C11658u<K, V> {

        /* renamed from: a */
        final V f31111a;

        /* renamed from: a */
        public int mo22370a() {
            return 1;
        }

        /* renamed from: a */
        public final C11658u<K, V> mo22371a(ReferenceQueue<V> referenceQueue, V v, C11664d<K, V> dVar) {
            return this;
        }

        /* renamed from: b */
        public final C11664d<K, V> mo22372b() {
            return null;
        }

        /* renamed from: c */
        public final boolean mo22373c() {
            return true;
        }

        public V get() {
            return this.f31111a;
        }

        C11655r(V v) {
            this.f31111a = v;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$s */
    static final class C11656s<K, V> extends C11654q<K, V> {

        /* renamed from: a */
        volatile long f31112a = Long.MAX_VALUE;

        /* renamed from: b */
        C11664d<K, V> f31113b = C11614c.m23757j();

        /* renamed from: c */
        C11664d<K, V> f31114c = C11614c.m23757j();

        /* renamed from: h */
        public final long mo22388h() {
            return this.f31112a;
        }

        /* renamed from: i */
        public final C11664d<K, V> mo22389i() {
            return this.f31113b;
        }

        /* renamed from: j */
        public final C11664d<K, V> mo22390j() {
            return this.f31114c;
        }

        /* renamed from: b */
        public final void mo22385b(long j) {
            this.f31112a = j;
        }

        /* renamed from: c */
        public final void mo22386c(C11664d<K, V> dVar) {
            this.f31113b = dVar;
        }

        /* renamed from: d */
        public final void mo22387d(C11664d<K, V> dVar) {
            this.f31114c = dVar;
        }

        C11656s(K k, int i, C11664d<K, V> dVar) {
            super(k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$t */
    final class C11657t extends C11641g<V> {
        public final V next() {
            return mo22433a().getValue();
        }

        C11657t() {
            super();
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$u */
    interface C11658u<K, V> {
        /* renamed from: a */
        int mo22370a();

        /* renamed from: a */
        C11658u<K, V> mo22371a(ReferenceQueue<V> referenceQueue, V v, C11664d<K, V> dVar);

        /* renamed from: b */
        C11664d<K, V> mo22372b();

        /* renamed from: c */
        boolean mo22373c();

        V get();
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$v */
    final class C11659v extends AbstractCollection<V> {

        /* renamed from: b */
        private final ConcurrentMap<?, ?> f31117b;

        public final void clear() {
            this.f31117b.clear();
        }

        public final boolean isEmpty() {
            return this.f31117b.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new C11657t();
        }

        public final int size() {
            return this.f31117b.size();
        }

        public final Object[] toArray() {
            return C11614c.m23751a((Collection<E>) this).toArray();
        }

        public final boolean contains(Object obj) {
            return this.f31117b.containsValue(obj);
        }

        public final <E> E[] toArray(E[] eArr) {
            return C11614c.m23751a((Collection<E>) this).toArray(eArr);
        }

        C11659v(ConcurrentMap<?, ?> concurrentMap) {
            this.f31117b = concurrentMap;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$w */
    static final class C11660w<K, V> extends C11662y<K, V> {

        /* renamed from: a */
        volatile long f31118a = Long.MAX_VALUE;

        /* renamed from: b */
        C11664d<K, V> f31119b = C11614c.m23757j();

        /* renamed from: c */
        C11664d<K, V> f31120c = C11614c.m23757j();

        /* renamed from: e */
        public final long mo22415e() {
            return this.f31118a;
        }

        /* renamed from: f */
        public final C11664d<K, V> mo22416f() {
            return this.f31119b;
        }

        /* renamed from: g */
        public final C11664d<K, V> mo22417g() {
            return this.f31120c;
        }

        /* renamed from: a */
        public final void mo22408a(long j) {
            this.f31118a = j;
        }

        /* renamed from: b */
        public final void mo22412b(C11664d<K, V> dVar) {
            this.f31120c = dVar;
        }

        /* renamed from: a */
        public final void mo22410a(C11664d<K, V> dVar) {
            this.f31119b = dVar;
        }

        C11660w(ReferenceQueue<K> referenceQueue, K k, int i, C11664d<K, V> dVar) {
            super(referenceQueue, k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$x */
    static final class C11661x<K, V> extends C11662y<K, V> {

        /* renamed from: a */
        volatile long f31121a = Long.MAX_VALUE;

        /* renamed from: b */
        C11664d<K, V> f31122b = C11614c.m23757j();

        /* renamed from: c */
        C11664d<K, V> f31123c = C11614c.m23757j();

        /* renamed from: d */
        volatile long f31124d = Long.MAX_VALUE;

        /* renamed from: e */
        C11664d<K, V> f31125e = C11614c.m23757j();

        /* renamed from: f */
        C11664d<K, V> f31126f = C11614c.m23757j();

        /* renamed from: e */
        public final long mo22415e() {
            return this.f31121a;
        }

        /* renamed from: f */
        public final C11664d<K, V> mo22416f() {
            return this.f31122b;
        }

        /* renamed from: g */
        public final C11664d<K, V> mo22417g() {
            return this.f31123c;
        }

        /* renamed from: h */
        public final long mo22388h() {
            return this.f31124d;
        }

        /* renamed from: i */
        public final C11664d<K, V> mo22389i() {
            return this.f31125e;
        }

        /* renamed from: j */
        public final C11664d<K, V> mo22390j() {
            return this.f31126f;
        }

        /* renamed from: a */
        public final void mo22408a(long j) {
            this.f31121a = j;
        }

        /* renamed from: b */
        public final void mo22385b(long j) {
            this.f31124d = j;
        }

        /* renamed from: c */
        public final void mo22386c(C11664d<K, V> dVar) {
            this.f31125e = dVar;
        }

        /* renamed from: d */
        public final void mo22387d(C11664d<K, V> dVar) {
            this.f31126f = dVar;
        }

        /* renamed from: a */
        public final void mo22410a(C11664d<K, V> dVar) {
            this.f31122b = dVar;
        }

        /* renamed from: b */
        public final void mo22412b(C11664d<K, V> dVar) {
            this.f31123c = dVar;
        }

        C11661x(ReferenceQueue<K> referenceQueue, K k, int i, C11664d<K, V> dVar) {
            super(referenceQueue, k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$y */
    static class C11662y<K, V> extends WeakReference<K> implements C11664d<K, V> {

        /* renamed from: g */
        final int f31127g;

        /* renamed from: h */
        final C11664d<K, V> f31128h;

        /* renamed from: i */
        volatile C11658u<K, V> f31129i = C11614c.m23756i();

        /* renamed from: a */
        public final C11658u<K, V> mo22407a() {
            return this.f31129i;
        }

        /* renamed from: b */
        public final C11664d<K, V> mo22411b() {
            return this.f31128h;
        }

        /* renamed from: c */
        public final int mo22413c() {
            return this.f31127g;
        }

        /* renamed from: d */
        public final K mo22414d() {
            return get();
        }

        /* renamed from: e */
        public long mo22415e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public C11664d<K, V> mo22416f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public C11664d<K, V> mo22417g() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: h */
        public long mo22388h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public C11664d<K, V> mo22389i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C11664d<K, V> mo22390j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo22408a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo22385b(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo22386c(C11664d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public final void mo22409a(C11658u<K, V> uVar) {
            this.f31129i = uVar;
        }

        /* renamed from: b */
        public void mo22412b(C11664d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo22387d(C11664d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo22410a(C11664d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        C11662y(ReferenceQueue<K> referenceQueue, K k, int i, C11664d<K, V> dVar) {
            super(k, referenceQueue);
            this.f31127g = i;
            this.f31128h = dVar;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$z */
    static class C11663z<K, V> extends WeakReference<V> implements C11658u<K, V> {

        /* renamed from: a */
        final C11664d<K, V> f31130a;

        /* renamed from: a */
        public int mo22370a() {
            return 1;
        }

        /* renamed from: b */
        public final C11664d<K, V> mo22372b() {
            return this.f31130a;
        }

        /* renamed from: c */
        public final boolean mo22373c() {
            return true;
        }

        C11663z(ReferenceQueue<V> referenceQueue, V v, C11664d<K, V> dVar) {
            super(v, referenceQueue);
            this.f31130a = dVar;
        }

        /* renamed from: a */
        public C11658u<K, V> mo22371a(ReferenceQueue<V> referenceQueue, V v, C11664d<K, V> dVar) {
            return new C11663z(referenceQueue, v, dVar);
        }
    }

    /* renamed from: i */
    static <K, V> C11658u<K, V> m23756i() {
        return f31012s;
    }

    /* renamed from: j */
    static <K, V> C11664d<K, V> m23757j() {
        return C11645k.INSTANCE;
    }

    /* renamed from: k */
    static <E> Queue<E> m23758k() {
        return f31013t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo22350d() {
        return m23759m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo22353f() {
        return m23760n();
    }

    /* renamed from: m */
    private boolean m23759m() {
        if (this.f31025m > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private boolean m23760n() {
        if (this.f31024l > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private boolean m23761o() {
        if (this.f31026n > 0) {
            return true;
        }
        return false;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f31033w;
        if (set != null) {
            return set;
        }
        C11640f fVar = new C11640f(this);
        this.f31033w = fVar;
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo22354g() {
        if (this.f31020h != C11648n.STRONG) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo22357h() {
        if (this.f31021i != C11648n.STRONG) {
            return true;
        }
        return false;
    }

    public Set<K> keySet() {
        Set<K> set = this.f31031u;
        if (set != null) {
            return set;
        }
        C11643i iVar = new C11643i(this);
        this.f31031u = iVar;
        return iVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo22360l() {
        do {
        } while (((C11672g) this.f31027o.poll()) != null);
    }

    public Collection<V> values() {
        Collection<V> collection = this.f31032v;
        if (collection != null) {
            return collection;
        }
        C11659v vVar = new C11659v(this);
        this.f31032v = vVar;
        return vVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo22345b() {
        if (this.f31023k != C11613b.INSTANCE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo22346c() {
        if (m23760n() || mo22343a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo22351e() {
        if (m23759m() || m23761o()) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        C11646l<K, V>[] lVarArr = this.f31016d;
        long j = 0;
        for (int i = 0; i < lVarArr.length; i++) {
            if (lVarArr[i].f31081b != 0) {
                return false;
            }
            j += (long) lVarArr[i].f31083d;
        }
        if (j != 0) {
            for (int i2 = 0; i2 < lVarArr.length; i2++) {
                if (lVarArr[i2].f31081b != 0) {
                    return false;
                }
                j -= (long) lVarArr[i2].f31083d;
            }
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        long j = 0;
        for (C11646l<K, V> lVar : this.f31016d) {
            j += (long) Math.max(0, lVar.f31081b);
        }
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return DynamicTabYellowPointVersion.DEFAULT;
        }
        return (int) j;
    }

    public void clear() {
        C11665e eVar;
        C11646l<K, V>[] lVarArr = this.f31016d;
        int length = lVarArr.length;
        for (int i = 0; i < length; i++) {
            C11646l<K, V> lVar = lVarArr[i];
            if (lVar.f31081b != 0) {
                lVar.lock();
                try {
                    lVar.mo22450b(lVar.f31080a.f31029q.mo22328a());
                    AtomicReferenceArray<C11664d<K, V>> atomicReferenceArray = lVar.f31085f;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (C11664d dVar = (C11664d) atomicReferenceArray.get(i2); dVar != null; dVar = dVar.mo22411b()) {
                            if (dVar.mo22407a().mo22373c()) {
                                Object d = dVar.mo22414d();
                                Object obj = dVar.mo22407a().get();
                                if (d != null) {
                                    if (obj != null) {
                                        eVar = C11665e.EXPLICIT;
                                        C11665e eVar2 = eVar;
                                        lVar.mo22445a(d, dVar.mo22413c(), obj, dVar.mo22407a().mo22370a(), eVar2);
                                    }
                                }
                                eVar = C11665e.COLLECTED;
                                C11665e eVar22 = eVar;
                                lVar.mo22445a(d, dVar.mo22413c(), obj, dVar.mo22407a().mo22370a(), eVar22);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    if (lVar.f31080a.mo22354g()) {
                        do {
                        } while (lVar.f31087h.poll() != null);
                    }
                    if (lVar.f31080a.mo22357h()) {
                        do {
                        } while (lVar.f31088i.poll() != null);
                    }
                    lVar.f31091l.clear();
                    lVar.f31092m.clear();
                    lVar.f31090k.set(0);
                    lVar.f31083d++;
                    lVar.f31081b = 0;
                } finally {
                    lVar.unlock();
                    lVar.mo22454c();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo22343a() {
        if (this.f31022j >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    static <K, V> void m23753b(C11664d<K, V> dVar) {
        C11664d j = m23757j();
        dVar.mo22410a(j);
        dVar.mo22412b(j);
    }

    /* renamed from: c */
    static <K, V> void m23755c(C11664d<K, V> dVar) {
        C11664d j = m23757j();
        dVar.mo22386c(j);
        dVar.mo22387d(j);
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m23751a(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C11675b.m24016a(arrayList, collection.iterator());
        return arrayList;
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int a = mo22339a(obj);
        return mo22340a(a).mo22451b(obj, a);
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = mo22339a(obj);
        return mo22340a(a).mo22440a(obj, a);
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = mo22339a(obj);
        return mo22340a(a).mo22453c(obj, a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo22339a(Object obj) {
        int hash = this.f31018f.hash(obj);
        int i = hash + ((hash << 15) ^ -12931);
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C11646l<K, V> mo22340a(int i) {
        return this.f31016d[(i >>> this.f31015c) & this.f31014b];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo22341a(C11658u<K, V> uVar) {
        C11664d b = uVar.mo22372b();
        int c = b.mo22413c();
        mo22340a(c).mo22447a(b.mo22414d(), c, uVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean containsValue(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            com.bytedance.jedi.a.g.a.e r3 = r0.f31029q
            long r3 = r3.mo22328a()
            com.bytedance.jedi.a.g.b.c$l<K, V>[] r5 = r0.f31016d
            r6 = -1
            r7 = r6
            r6 = 0
        L_0x0014:
            r9 = 3
            if (r6 >= r9) goto L_0x00a1
            r9 = 0
            int r11 = r5.length
            r12 = r9
            r9 = 0
        L_0x001c:
            if (r9 >= r11) goto L_0x008f
            r10 = r5[r9]
            int r14 = r10.f31081b
            java.util.concurrent.atomic.AtomicReferenceArray<com.bytedance.jedi.a.g.b.d<K, V>> r14 = r10.f31085f
            r15 = 0
        L_0x0025:
            int r2 = r14.length()
            if (r15 >= r2) goto L_0x0081
            java.lang.Object r2 = r14.get(r15)
            com.bytedance.jedi.a.g.b.d r2 = (com.bytedance.jedi.p725a.p734g.p736b.C11664d) r2
        L_0x0031:
            if (r2 == 0) goto L_0x007a
            java.lang.Object r16 = r2.mo22414d()
            r17 = 0
            if (r16 != 0) goto L_0x0043
            r10.mo22443a()
        L_0x003e:
            r18 = r5
        L_0x0040:
            r5 = r17
            goto L_0x0061
        L_0x0043:
            com.bytedance.jedi.a.g.b.c$u r16 = r2.mo22407a()
            java.lang.Object r16 = r16.get()
            if (r16 != 0) goto L_0x0051
            r10.mo22443a()
            goto L_0x003e
        L_0x0051:
            r18 = r5
            com.bytedance.jedi.a.g.b.c<K, V> r5 = r10.f31080a
            boolean r5 = r5.mo22344a(r2, r3)
            if (r5 == 0) goto L_0x005f
            r10.mo22444a(r3)
            goto L_0x0040
        L_0x005f:
            r5 = r16
        L_0x0061:
            if (r5 == 0) goto L_0x006f
            r19 = r3
            com.bytedance.jedi.a.g.a.a<java.lang.Object> r3 = r0.f31019g
            boolean r3 = r3.equivalent(r1, r5)
            if (r3 == 0) goto L_0x0071
            r1 = 1
            return r1
        L_0x006f:
            r19 = r3
        L_0x0071:
            com.bytedance.jedi.a.g.b.d r2 = r2.mo22411b()
            r5 = r18
            r3 = r19
            goto L_0x0031
        L_0x007a:
            r19 = r3
            r18 = r5
            int r15 = r15 + 1
            goto L_0x0025
        L_0x0081:
            r19 = r3
            r18 = r5
            int r2 = r10.f31083d
            long r2 = (long) r2
            long r12 = r12 + r2
            int r9 = r9 + 1
            r3 = r19
            r2 = 0
            goto L_0x001c
        L_0x008f:
            r19 = r3
            r18 = r5
            int r2 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00a1
            int r6 = r6 + 1
            r7 = r12
            r5 = r18
            r3 = r19
            r2 = 0
            goto L_0x0014
        L_0x00a1:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.p725a.p734g.p736b.C11614c.containsValue(java.lang.Object):boolean");
    }

    C11614c(C11610b<? super K, ? super V> bVar) {
        int i;
        long j;
        long j2;
        long j3;
        Queue<C11672g<K, V>> queue;
        boolean z;
        C11607e eVar;
        char c;
        boolean z2;
        char c2;
        int i2;
        char c3 = 4;
        if (bVar.f30994d == -1) {
            i = 4;
        } else {
            i = bVar.f30994d;
        }
        this.f31017e = Math.min(i, 65536);
        this.f31020h = bVar.mo22335b();
        this.f31021i = bVar.mo22336c();
        this.f31018f = (C11598a) C11601b.m23725a(bVar.f31003m, bVar.mo22335b().mo22455a());
        this.f31019g = (C11598a) C11601b.m23725a(bVar.f31004n, bVar.mo22336c().mo22455a());
        long j4 = 0;
        if (bVar.f31000j == 0 || bVar.f31001k == 0) {
            j = 0;
        } else if (bVar.f30997g == null) {
            j = bVar.f30995e;
        } else {
            j = bVar.f30996f;
        }
        this.f31022j = j;
        this.f31023k = (C11673h) C11601b.m23725a(bVar.f30997g, C11613b.INSTANCE);
        if (bVar.f31001k == -1) {
            j2 = 0;
        } else {
            j2 = bVar.f31001k;
        }
        this.f31024l = j2;
        if (bVar.f31000j == -1) {
            j3 = 0;
        } else {
            j3 = bVar.f31000j;
        }
        this.f31025m = j3;
        if (bVar.f31002l != -1) {
            j4 = bVar.f31002l;
        }
        this.f31026n = j4;
        this.f31028p = (C11671f) C11601b.m23725a(bVar.f31005o, C11612a.INSTANCE);
        if (this.f31028p == C11612a.INSTANCE) {
            queue = m23758k();
        } else {
            queue = new ConcurrentLinkedQueue<>();
        }
        this.f31027o = queue;
        int i3 = 0;
        int i4 = 1;
        if (mo22351e() || mo22353f()) {
            z = true;
        } else {
            z = false;
        }
        if (bVar.f31006p != null) {
            eVar = bVar.f31006p;
        } else if (z) {
            eVar = C11607e.f30989a;
        } else {
            eVar = C11610b.f30990a;
        }
        this.f31029q = eVar;
        C11648n nVar = this.f31020h;
        if (mo22346c() || mo22353f()) {
            c = 1;
        } else {
            c = 0;
        }
        if (mo22350d() || mo22351e()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (nVar != C11648n.WEAK) {
            c3 = 0;
        }
        char c4 = c3 | c;
        if (z2) {
            c2 = 2;
        } else {
            c2 = 0;
        }
        this.f31030r = C11630d.f31063i[c4 | c2];
        if (bVar.f30993c == -1) {
            i2 = 16;
        } else {
            i2 = bVar.f30993c;
        }
        int min = Math.min(i2, 1073741824);
        if (mo22343a() && !mo22345b()) {
            min = (int) Math.min((long) min, this.f31022j);
        }
        int i5 = 1;
        int i6 = 0;
        while (i5 < this.f31017e && (!mo22343a() || ((long) (i5 * 20)) <= this.f31022j)) {
            i6++;
            i5 <<= 1;
        }
        this.f31015c = 32 - i6;
        this.f31014b = i5 - 1;
        this.f31016d = new C11646l[i5];
        int i7 = min / i5;
        if (i7 * i5 < min) {
            i7++;
        }
        while (i4 < i7) {
            i4 <<= 1;
        }
        if (mo22343a()) {
            long j5 = (long) i5;
            long j6 = (this.f31022j / j5) + 1;
            long j7 = this.f31022j % j5;
            while (i3 < this.f31016d.length) {
                if (((long) i3) == j7) {
                    j6--;
                }
                this.f31016d[i3] = m23750a(i4, j6);
                i3++;
            }
            return;
        }
        while (i3 < this.f31016d.length) {
            this.f31016d[i3] = m23750a(i4, -1);
            i3++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo22342a(C11664d<K, V> dVar) {
        int c = dVar.mo22413c();
        mo22340a(c).mo22446a(dVar, c);
    }

    /* renamed from: a */
    private C11646l<K, V> m23750a(int i, long j) {
        return new C11646l<>(this, i, j);
    }

    /* renamed from: b */
    static <K, V> void m23754b(C11664d<K, V> dVar, C11664d<K, V> dVar2) {
        dVar.mo22386c(dVar2);
        dVar2.mo22387d(dVar);
    }

    public V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    /* renamed from: a */
    static <K, V> void m23752a(C11664d<K, V> dVar, C11664d<K, V> dVar2) {
        dVar.mo22410a(dVar2);
        dVar2.mo22412b(dVar);
    }

    public V put(K k, V v) {
        C11605c.m23732a(k);
        C11605c.m23732a(v);
        int a = mo22339a((Object) k);
        return mo22340a(a).mo22442a(k, a, v, false);
    }

    public V putIfAbsent(K k, V v) {
        C11605c.m23732a(k);
        C11605c.m23732a(v);
        int a = mo22339a((Object) k);
        return mo22340a(a).mo22442a(k, a, v, true);
    }

    public V replace(K k, V v) {
        C11605c.m23732a(k);
        C11605c.m23732a(v);
        int a = mo22339a((Object) k);
        return mo22340a(a).mo22441a(k, a, v);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int a = mo22339a(obj);
        return mo22340a(a).mo22452b(obj, a, obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo22344a(C11664d<K, V> dVar, long j) {
        C11605c.m23732a(dVar);
        if (m23760n() && j - dVar.mo22415e() >= this.f31024l) {
            return true;
        }
        if (!m23759m() || j - dVar.mo22388h() < this.f31025m) {
            return false;
        }
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        C11605c.m23732a(k);
        C11605c.m23732a(v2);
        if (v == null) {
            return false;
        }
        int a = mo22339a((Object) k);
        return mo22340a(a).mo22448a(k, a, v, v2);
    }
}
