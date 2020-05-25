package com.google.p1057b.p1059b;

import com.google.p1057b.p1058a.C17406d;
import com.google.p1057b.p1058a.C17406d.C17407a;
import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1058a.C17413h;
import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1058a.C17429o;
import com.google.p1057b.p1058a.C17438t;
import com.google.p1057b.p1059b.C17440a.C17442b;
import com.google.p1057b.p1059b.C17450d.C17451a;
import com.google.p1057b.p1060c.C17570ak;
import com.google.p1057b.p1060c.C17586ap;
import com.google.p1057b.p1060c.C17696i;
import com.google.p1057b.p1063f.C17743a;
import com.google.p1057b.p1065h.p1066a.C17817c.C17818a;
import com.google.p1057b.p1065h.p1066a.C17820e;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.google.p1057b.p1065h.p1066a.C17833n;
import com.google.p1057b.p1065h.p1066a.C17837o;
import com.google.p1057b.p1065h.p1066a.C17838p;
import com.google.p1057b.p1065h.p1066a.C17839q;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.b.b.g */
class C17454g<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: a */
    static final Logger f49017a = Logger.getLogger(C17454g.class.getName());

    /* renamed from: u */
    static final C17505w<Object, Object> f49018u = new C17505w<Object, Object>() {
        /* renamed from: a */
        public final int mo33822a() {
            return 0;
        }

        /* renamed from: a */
        public final C17505w<Object, Object> mo33823a(ReferenceQueue<Object> referenceQueue, Object obj, C17515k<Object, Object> kVar) {
            return this;
        }

        /* renamed from: a */
        public final void mo33824a(Object obj) {
        }

        /* renamed from: b */
        public final C17515k<Object, Object> mo33825b() {
            return null;
        }

        /* renamed from: c */
        public final boolean mo33826c() {
            return false;
        }

        /* renamed from: d */
        public final boolean mo33827d() {
            return false;
        }

        /* renamed from: e */
        public final Object mo33828e() {
            return null;
        }

        public final Object get() {
            return null;
        }
    };

    /* renamed from: v */
    static final Queue<?> f49019v = new AbstractQueue<Object>() {
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
            return C17570ak.m43180of().iterator();
        }
    };

    /* renamed from: b */
    final int f49020b;

    /* renamed from: c */
    final int f49021c;

    /* renamed from: d */
    final C17492n<K, V>[] f49022d;

    /* renamed from: e */
    final int f49023e;

    /* renamed from: f */
    final C17406d<Object> f49024f;

    /* renamed from: g */
    final C17406d<Object> f49025g;

    /* renamed from: h */
    final C17495p f49026h;

    /* renamed from: i */
    final C17495p f49027i;

    /* renamed from: j */
    final long f49028j;

    /* renamed from: k */
    final C17527p<K, V> f49029k;

    /* renamed from: l */
    final long f49030l;

    /* renamed from: m */
    final long f49031m;

    /* renamed from: n */
    final long f49032n;

    /* renamed from: o */
    final Queue<C17523n<K, V>> f49033o;

    /* renamed from: p */
    final C17522m<K, V> f49034p;

    /* renamed from: q */
    final C17438t f49035q;

    /* renamed from: r */
    final C17472d f49036r;

    /* renamed from: s */
    final C17442b f49037s;

    /* renamed from: t */
    final C17450d<? super K, V> f49038t;

    /* renamed from: w */
    Set<K> f49039w;

    /* renamed from: x */
    Collection<V> f49040x;

    /* renamed from: y */
    Set<Entry<K, V>> f49041y;

    /* renamed from: com.google.b.b.g$a */
    abstract class C17457a<T> extends AbstractSet<T> {

        /* renamed from: a */
        final ConcurrentMap<?, ?> f49042a;

        public void clear() {
            this.f49042a.clear();
        }

        public boolean isEmpty() {
            return this.f49042a.isEmpty();
        }

        public int size() {
            return this.f49042a.size();
        }

        public Object[] toArray() {
            return C17454g.m42730a((Collection<E>) this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return C17454g.m42730a((Collection<E>) this).toArray(eArr);
        }

        C17457a(ConcurrentMap<?, ?> concurrentMap) {
            this.f49042a = concurrentMap;
        }
    }

    /* renamed from: com.google.b.b.g$aa */
    static class C17458aa<K, V> extends WeakReference<K> implements C17515k<K, V> {

        /* renamed from: g */
        final int f49044g;

        /* renamed from: h */
        final C17515k<K, V> f49045h;

        /* renamed from: i */
        volatile C17505w<K, V> f49046i = C17454g.m42735j();

        /* renamed from: a */
        public final C17505w<K, V> mo33840a() {
            return this.f49046i;
        }

        /* renamed from: b */
        public final C17515k<K, V> mo33844b() {
            return this.f49045h;
        }

        /* renamed from: c */
        public final int mo33847c() {
            return this.f49044g;
        }

        /* renamed from: d */
        public final K mo33849d() {
            return get();
        }

        /* renamed from: e */
        public long mo33851e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public C17515k<K, V> mo33852f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public C17515k<K, V> mo33853g() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: h */
        public long mo33854h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public C17515k<K, V> mo33855i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C17515k<K, V> mo33856j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo33841a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo33845b(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo33848c(C17515k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public final void mo33842a(C17505w<K, V> wVar) {
            this.f49046i = wVar;
        }

        /* renamed from: b */
        public void mo33846b(C17515k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo33850d(C17515k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo33843a(C17515k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        C17458aa(ReferenceQueue<K> referenceQueue, K k, int i, C17515k<K, V> kVar) {
            super(k, referenceQueue);
            this.f49044g = i;
            this.f49045h = kVar;
        }
    }

    /* renamed from: com.google.b.b.g$ab */
    static class C17459ab<K, V> extends WeakReference<V> implements C17505w<K, V> {

        /* renamed from: a */
        final C17515k<K, V> f49047a;

        /* renamed from: a */
        public int mo33822a() {
            return 1;
        }

        /* renamed from: a */
        public final void mo33824a(V v) {
        }

        /* renamed from: b */
        public final C17515k<K, V> mo33825b() {
            return this.f49047a;
        }

        /* renamed from: c */
        public final boolean mo33826c() {
            return false;
        }

        /* renamed from: d */
        public final boolean mo33827d() {
            return true;
        }

        /* renamed from: e */
        public final V mo33828e() {
            return get();
        }

        C17459ab(ReferenceQueue<V> referenceQueue, V v, C17515k<K, V> kVar) {
            super(v, referenceQueue);
            this.f49047a = kVar;
        }

        /* renamed from: a */
        public C17505w<K, V> mo33823a(ReferenceQueue<V> referenceQueue, V v, C17515k<K, V> kVar) {
            return new C17459ab(referenceQueue, v, kVar);
        }
    }

    /* renamed from: com.google.b.b.g$ac */
    static final class C17460ac<K, V> extends C17458aa<K, V> {

        /* renamed from: a */
        volatile long f49048a = Long.MAX_VALUE;

        /* renamed from: b */
        C17515k<K, V> f49049b = C17454g.m42736k();

        /* renamed from: c */
        C17515k<K, V> f49050c = C17454g.m42736k();

        /* renamed from: h */
        public final long mo33854h() {
            return this.f49048a;
        }

        /* renamed from: i */
        public final C17515k<K, V> mo33855i() {
            return this.f49049b;
        }

        /* renamed from: j */
        public final C17515k<K, V> mo33856j() {
            return this.f49050c;
        }

        /* renamed from: b */
        public final void mo33845b(long j) {
            this.f49048a = j;
        }

        /* renamed from: c */
        public final void mo33848c(C17515k<K, V> kVar) {
            this.f49049b = kVar;
        }

        /* renamed from: d */
        public final void mo33850d(C17515k<K, V> kVar) {
            this.f49050c = kVar;
        }

        C17460ac(ReferenceQueue<K> referenceQueue, K k, int i, C17515k<K, V> kVar) {
            super(referenceQueue, k, i, kVar);
        }
    }

    /* renamed from: com.google.b.b.g$ad */
    static final class C17461ad<K, V> extends C17494o<K, V> {

        /* renamed from: b */
        final int f49051b;

        /* renamed from: a */
        public final int mo33822a() {
            return this.f49051b;
        }

        /* renamed from: a */
        public final C17505w<K, V> mo33823a(ReferenceQueue<V> referenceQueue, V v, C17515k<K, V> kVar) {
            return new C17461ad(referenceQueue, v, kVar, this.f49051b);
        }

        C17461ad(ReferenceQueue<V> referenceQueue, V v, C17515k<K, V> kVar, int i) {
            super(referenceQueue, v, kVar);
            this.f49051b = i;
        }
    }

    /* renamed from: com.google.b.b.g$ae */
    static final class C17462ae<K, V> extends C17502t<K, V> {

        /* renamed from: b */
        final int f49052b;

        /* renamed from: a */
        public final int mo33822a() {
            return this.f49052b;
        }

        C17462ae(V v, int i) {
            super(v);
            this.f49052b = i;
        }
    }

    /* renamed from: com.google.b.b.g$af */
    static final class C17463af<K, V> extends C17459ab<K, V> {

        /* renamed from: b */
        final int f49053b;

        /* renamed from: a */
        public final int mo33822a() {
            return this.f49053b;
        }

        /* renamed from: a */
        public final C17505w<K, V> mo33823a(ReferenceQueue<V> referenceQueue, V v, C17515k<K, V> kVar) {
            return new C17463af(referenceQueue, v, kVar, this.f49053b);
        }

        C17463af(ReferenceQueue<V> referenceQueue, V v, C17515k<K, V> kVar, int i) {
            super(referenceQueue, v, kVar);
            this.f49053b = i;
        }
    }

    /* renamed from: com.google.b.b.g$ag */
    static final class C17464ag<K, V> extends AbstractQueue<C17515k<K, V>> {

        /* renamed from: a */
        final C17515k<K, V> f49054a = new C17468b<K, V>() {

            /* renamed from: a */
            C17515k<K, V> f49055a = this;

            /* renamed from: b */
            C17515k<K, V> f49056b = this;

            /* renamed from: b */
            public final void mo33845b(long j) {
            }

            /* renamed from: h */
            public final long mo33854h() {
                return Long.MAX_VALUE;
            }

            /* renamed from: i */
            public final C17515k<K, V> mo33855i() {
                return this.f49055a;
            }

            /* renamed from: j */
            public final C17515k<K, V> mo33856j() {
                return this.f49056b;
            }

            /* renamed from: c */
            public final void mo33848c(C17515k<K, V> kVar) {
                this.f49055a = kVar;
            }

            /* renamed from: d */
            public final void mo33850d(C17515k<K, V> kVar) {
                this.f49056b = kVar;
            }
        };

        C17464ag() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C17515k<K, V> peek() {
            C17515k<K, V> i = this.f49054a.mo33855i();
            if (i == this.f49054a) {
                return null;
            }
            return i;
        }

        public final boolean isEmpty() {
            if (this.f49054a.mo33855i() == this.f49054a) {
                return true;
            }
            return false;
        }

        public final Iterator<C17515k<K, V>> iterator() {
            return new C17696i<C17515k<K, V>>(peek()) {
                /* renamed from: a */
                public final /* synthetic */ Object mo33866a(Object obj) {
                    C17515k<K, V> i = ((C17515k) obj).mo33855i();
                    if (i == C17464ag.this.f49054a) {
                        return null;
                    }
                    return i;
                }
            };
        }

        public final /* synthetic */ Object poll() {
            C17515k<K, V> i = this.f49054a.mo33855i();
            if (i == this.f49054a) {
                return null;
            }
            remove(i);
            return i;
        }

        public final int size() {
            int i = 0;
            for (C17515k<K, V> i2 = this.f49054a.mo33855i(); i2 != this.f49054a; i2 = i2.mo33855i()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            C17515k<K, V> i = this.f49054a.mo33855i();
            while (i != this.f49054a) {
                C17515k i2 = i.mo33855i();
                C17454g.m42734c(i);
                i = i2;
            }
            this.f49054a.mo33848c(this.f49054a);
            this.f49054a.mo33850d(this.f49054a);
        }

        public final boolean contains(Object obj) {
            if (((C17515k) obj).mo33855i() != C17491m.INSTANCE) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ boolean offer(Object obj) {
            C17515k kVar = (C17515k) obj;
            C17454g.m42733b(kVar.mo33856j(), kVar.mo33855i());
            C17454g.m42733b(this.f49054a.mo33856j(), kVar);
            C17454g.m42733b(kVar, this.f49054a);
            return true;
        }

        public final boolean remove(Object obj) {
            C17515k kVar = (C17515k) obj;
            C17515k j = kVar.mo33856j();
            C17515k i = kVar.mo33855i();
            C17454g.m42733b(j, i);
            C17454g.m42734c(kVar);
            if (i != C17491m.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.b.b.g$ah */
    final class C17467ah implements Entry<K, V> {

        /* renamed from: a */
        final K f49059a;

        /* renamed from: b */
        V f49060b;

        public final K getKey() {
            return this.f49059a;
        }

        public final V getValue() {
            return this.f49060b;
        }

        public final int hashCode() {
            return this.f49059a.hashCode() ^ this.f49060b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }

        public final V setValue(V v) {
            V put = C17454g.this.put(this.f49059a, v);
            this.f49060b = v;
            return put;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.f49059a.equals(entry.getKey()) || !this.f49060b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        C17467ah(K k, V v) {
            this.f49059a = k;
            this.f49060b = v;
        }
    }

    /* renamed from: com.google.b.b.g$b */
    static abstract class C17468b<K, V> implements C17515k<K, V> {
        C17468b() {
        }

        /* renamed from: a */
        public C17505w<K, V> mo33840a() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public C17515k<K, V> mo33844b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public int mo33847c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public K mo33849d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public long mo33851e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public C17515k<K, V> mo33852f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public C17515k<K, V> mo33853g() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: h */
        public long mo33854h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public C17515k<K, V> mo33855i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C17515k<K, V> mo33856j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo33841a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo33845b(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo33848c(C17515k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo33850d(C17515k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo33842a(C17505w<K, V> wVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo33846b(C17515k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo33843a(C17515k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.b.b.g$c */
    static final class C17469c<K, V> extends AbstractQueue<C17515k<K, V>> {

        /* renamed from: a */
        final C17515k<K, V> f49062a = new C17468b<K, V>() {

            /* renamed from: a */
            C17515k<K, V> f49063a = this;

            /* renamed from: b */
            C17515k<K, V> f49064b = this;

            /* renamed from: a */
            public final void mo33841a(long j) {
            }

            /* renamed from: e */
            public final long mo33851e() {
                return Long.MAX_VALUE;
            }

            /* renamed from: f */
            public final C17515k<K, V> mo33852f() {
                return this.f49063a;
            }

            /* renamed from: g */
            public final C17515k<K, V> mo33853g() {
                return this.f49064b;
            }

            /* renamed from: b */
            public final void mo33846b(C17515k<K, V> kVar) {
                this.f49064b = kVar;
            }

            /* renamed from: a */
            public final void mo33843a(C17515k<K, V> kVar) {
                this.f49063a = kVar;
            }
        };

        C17469c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C17515k<K, V> peek() {
            C17515k<K, V> f = this.f49062a.mo33852f();
            if (f == this.f49062a) {
                return null;
            }
            return f;
        }

        public final boolean isEmpty() {
            if (this.f49062a.mo33852f() == this.f49062a) {
                return true;
            }
            return false;
        }

        public final Iterator<C17515k<K, V>> iterator() {
            return new C17696i<C17515k<K, V>>(peek()) {
                /* renamed from: a */
                public final /* synthetic */ Object mo33866a(Object obj) {
                    C17515k<K, V> f = ((C17515k) obj).mo33852f();
                    if (f == C17469c.this.f49062a) {
                        return null;
                    }
                    return f;
                }
            };
        }

        public final /* synthetic */ Object poll() {
            C17515k<K, V> f = this.f49062a.mo33852f();
            if (f == this.f49062a) {
                return null;
            }
            remove(f);
            return f;
        }

        public final int size() {
            int i = 0;
            for (C17515k<K, V> f = this.f49062a.mo33852f(); f != this.f49062a; f = f.mo33852f()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            C17515k<K, V> f = this.f49062a.mo33852f();
            while (f != this.f49062a) {
                C17515k f2 = f.mo33852f();
                C17454g.m42732b(f);
                f = f2;
            }
            this.f49062a.mo33843a(this.f49062a);
            this.f49062a.mo33846b(this.f49062a);
        }

        public final boolean contains(Object obj) {
            if (((C17515k) obj).mo33852f() != C17491m.INSTANCE) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ boolean offer(Object obj) {
            C17515k kVar = (C17515k) obj;
            C17454g.m42731a(kVar.mo33853g(), kVar.mo33852f());
            C17454g.m42731a(this.f49062a.mo33853g(), kVar);
            C17454g.m42731a(kVar, this.f49062a);
            return true;
        }

        public final boolean remove(Object obj) {
            C17515k kVar = (C17515k) obj;
            C17515k g = kVar.mo33853g();
            C17515k f = kVar.mo33852f();
            C17454g.m42731a(g, f);
            C17454g.m42732b(kVar);
            if (f != C17491m.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.b.b.g$d */
    enum C17472d {
        STRONG {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17515k<K, V> mo33883a(C17492n<K, V> nVar, K k, int i, C17515k<K, V> kVar) {
                return new C17501s(k, i, kVar);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17515k<K, V> mo33882a(C17492n<K, V> nVar, C17515k<K, V> kVar, C17515k<K, V> kVar2) {
                C17515k<K, V> a = super.mo33882a(nVar, kVar, kVar2);
                m42830a(kVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17515k<K, V> mo33883a(C17492n<K, V> nVar, K k, int i, C17515k<K, V> kVar) {
                return new C17499q(k, i, kVar);
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17515k<K, V> mo33882a(C17492n<K, V> nVar, C17515k<K, V> kVar, C17515k<K, V> kVar2) {
                C17515k<K, V> a = super.mo33882a(nVar, kVar, kVar2);
                m42831b(kVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17515k<K, V> mo33883a(C17492n<K, V> nVar, K k, int i, C17515k<K, V> kVar) {
                return new C17503u(k, i, kVar);
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17515k<K, V> mo33882a(C17492n<K, V> nVar, C17515k<K, V> kVar, C17515k<K, V> kVar2) {
                C17515k<K, V> a = super.mo33882a(nVar, kVar, kVar2);
                m42830a(kVar, a);
                m42831b(kVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17515k<K, V> mo33883a(C17492n<K, V> nVar, K k, int i, C17515k<K, V> kVar) {
                return new C17500r(k, i, kVar);
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17515k<K, V> mo33883a(C17492n<K, V> nVar, K k, int i, C17515k<K, V> kVar) {
                return new C17458aa(nVar.f49118h, k, i, kVar);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17515k<K, V> mo33882a(C17492n<K, V> nVar, C17515k<K, V> kVar, C17515k<K, V> kVar2) {
                C17515k<K, V> a = super.mo33882a(nVar, kVar, kVar2);
                m42830a(kVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17515k<K, V> mo33883a(C17492n<K, V> nVar, K k, int i, C17515k<K, V> kVar) {
                return new C17507y(nVar.f49118h, k, i, kVar);
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17515k<K, V> mo33882a(C17492n<K, V> nVar, C17515k<K, V> kVar, C17515k<K, V> kVar2) {
                C17515k<K, V> a = super.mo33882a(nVar, kVar, kVar2);
                m42831b(kVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17515k<K, V> mo33883a(C17492n<K, V> nVar, K k, int i, C17515k<K, V> kVar) {
                return new C17460ac(nVar.f49118h, k, i, kVar);
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17515k<K, V> mo33882a(C17492n<K, V> nVar, C17515k<K, V> kVar, C17515k<K, V> kVar2) {
                C17515k<K, V> a = super.mo33882a(nVar, kVar, kVar2);
                m42830a(kVar, a);
                m42831b(kVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17515k<K, V> mo33883a(C17492n<K, V> nVar, K k, int i, C17515k<K, V> kVar) {
                return new C17508z(nVar.f49118h, k, i, kVar);
            }
        };
        

        /* renamed from: i */
        static final C17472d[] f49075i = null;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <K, V> C17515k<K, V> mo33883a(C17492n<K, V> nVar, K k, int i, C17515k<K, V> kVar);

        static {
            f49075i = new C17472d[]{STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE};
        }

        /* renamed from: a */
        static <K, V> void m42830a(C17515k<K, V> kVar, C17515k<K, V> kVar2) {
            kVar2.mo33841a(kVar.mo33851e());
            C17454g.m42731a(kVar.mo33853g(), kVar2);
            C17454g.m42731a(kVar2, kVar.mo33852f());
            C17454g.m42732b(kVar);
        }

        /* renamed from: b */
        static <K, V> void m42831b(C17515k<K, V> kVar, C17515k<K, V> kVar2) {
            kVar2.mo33845b(kVar.mo33854h());
            C17454g.m42733b(kVar.mo33856j(), kVar2);
            C17454g.m42733b(kVar2, kVar.mo33855i());
            C17454g.m42734c(kVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <K, V> C17515k<K, V> mo33882a(C17492n<K, V> nVar, C17515k<K, V> kVar, C17515k<K, V> kVar2) {
            return mo33883a(nVar, kVar.mo33849d(), kVar.mo33847c(), kVar2);
        }
    }

    /* renamed from: com.google.b.b.g$e */
    final class C17481e extends C17483g<Entry<K, V>> {
        public final /* synthetic */ Object next() {
            return mo33888a();
        }

        C17481e() {
            super();
        }
    }

    /* renamed from: com.google.b.b.g$f */
    final class C17482f extends C17457a<Entry<K, V>> {
        public final Iterator<Entry<K, V>> iterator() {
            return new C17481e();
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null || !C17454g.this.remove(key, entry.getValue())) {
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
            Object obj2 = C17454g.this.get(key);
            if (obj2 == null || !C17454g.this.f49025g.equivalent(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        C17482f(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    /* renamed from: com.google.b.b.g$g */
    abstract class C17483g<T> implements Iterator<T> {

        /* renamed from: b */
        int f49079b;

        /* renamed from: c */
        int f49080c = -1;

        /* renamed from: d */
        C17492n<K, V> f49081d;

        /* renamed from: e */
        AtomicReferenceArray<C17515k<K, V>> f49082e;

        /* renamed from: f */
        C17515k<K, V> f49083f;

        /* renamed from: g */
        C17467ah f49084g;

        /* renamed from: h */
        C17467ah f49085h;

        public boolean hasNext() {
            if (this.f49084g != null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private boolean m42850c() {
            if (this.f49083f != null) {
                do {
                    this.f49083f = this.f49083f.mo33844b();
                    if (this.f49083f != null) {
                    }
                } while (!m42848a(this.f49083f));
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17467ah mo33888a() {
            if (this.f49084g != null) {
                this.f49085h = this.f49084g;
                m42849b();
                return this.f49085h;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            if (this.f49085h != null) {
                z = true;
            } else {
                z = false;
            }
            C17421k.m42667b(z);
            C17454g.this.remove(this.f49085h.getKey());
            this.f49085h = null;
        }

        /* renamed from: d */
        private boolean m42851d() {
            while (this.f49080c >= 0) {
                AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = this.f49082e;
                int i = this.f49080c;
                this.f49080c = i - 1;
                C17515k<K, V> kVar = (C17515k) atomicReferenceArray.get(i);
                this.f49083f = kVar;
                if (kVar != null && (m42848a(this.f49083f) || m42850c())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private void m42849b() {
            this.f49084g = null;
            if (!m42850c() && !m42851d()) {
                while (this.f49079b >= 0) {
                    C17492n<K, V>[] nVarArr = C17454g.this.f49022d;
                    int i = this.f49079b;
                    this.f49079b = i - 1;
                    this.f49081d = nVarArr[i];
                    if (this.f49081d.f49112b != 0) {
                        this.f49082e = this.f49081d.f49116f;
                        this.f49080c = this.f49082e.length() - 1;
                        if (m42851d()) {
                            return;
                        }
                    }
                }
            }
        }

        C17483g() {
            this.f49079b = C17454g.this.f49022d.length - 1;
            m42849b();
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private boolean m42848a(C17515k<K, V> kVar) {
            try {
                long a = C17454g.this.f49035q.mo33765a();
                Object d = kVar.mo33849d();
                C17454g gVar = C17454g.this;
                Object obj = null;
                if (kVar.mo33849d() != null) {
                    Object obj2 = kVar.mo33840a().get();
                    if (obj2 != null) {
                        if (!gVar.mo33795a(kVar, a)) {
                            obj = obj2;
                        }
                    }
                }
                if (obj != null) {
                    this.f49084g = new C17467ah<>(d, obj);
                    this.f49081d.mo33906a();
                    return true;
                }
                this.f49081d.mo33906a();
                return false;
            } catch (Throwable th) {
                this.f49081d.mo33906a();
                throw th;
            }
        }
    }

    /* renamed from: com.google.b.b.g$h */
    final class C17484h extends C17483g<K> {
        public final K next() {
            return mo33888a().getKey();
        }

        C17484h() {
            super();
        }
    }

    /* renamed from: com.google.b.b.g$i */
    final class C17485i extends C17457a<K> {
        public final Iterator<K> iterator() {
            return new C17484h();
        }

        public final boolean contains(Object obj) {
            return this.f49042a.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (this.f49042a.remove(obj) != null) {
                return true;
            }
            return false;
        }

        C17485i(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    /* renamed from: com.google.b.b.g$j */
    static class C17486j<K, V> implements C17505w<K, V> {

        /* renamed from: a */
        public volatile C17505w<K, V> f49089a;

        /* renamed from: b */
        final C17837o<V> f49090b;

        /* renamed from: c */
        final C17429o f49091c;

        /* renamed from: a */
        public final C17505w<K, V> mo33823a(ReferenceQueue<V> referenceQueue, V v, C17515k<K, V> kVar) {
            return this;
        }

        /* renamed from: b */
        public final C17515k<K, V> mo33825b() {
            return null;
        }

        /* renamed from: c */
        public final boolean mo33826c() {
            return true;
        }

        public C17486j() {
            this(C17454g.m42735j());
        }

        /* renamed from: a */
        public final int mo33822a() {
            return this.f49089a.mo33822a();
        }

        /* renamed from: d */
        public final boolean mo33827d() {
            return this.f49089a.mo33827d();
        }

        /* renamed from: e */
        public final V mo33828e() throws ExecutionException {
            return C17839q.m43748a(this.f49090b);
        }

        public final V get() {
            return this.f49089a.get();
        }

        /* renamed from: f */
        public final long mo33898f() {
            return this.f49091c.mo33754a(TimeUnit.NANOSECONDS);
        }

        /* renamed from: b */
        public final boolean mo33897b(V v) {
            return this.f49090b.mo34624b(v);
        }

        /* renamed from: a */
        public final void mo33824a(V v) {
            if (v != null) {
                mo33897b(v);
            } else {
                this.f49089a = C17454g.m42735j();
            }
        }

        public C17486j(C17505w<K, V> wVar) {
            this.f49090b = new C17837o<>();
            this.f49091c = C17429o.m42673a();
            this.f49089a = wVar;
        }

        /* renamed from: a */
        public final boolean mo33896a(Throwable th) {
            return this.f49090b.mo34623a(th);
        }

        /* renamed from: a */
        public final C17832m<V> mo33895a(K k, C17450d<? super K, V> dVar) {
            C17832m<V> mVar;
            try {
                this.f49091c.mo33755c();
                Object obj = this.f49089a.get();
                if (obj == null) {
                    Object a = dVar.mo33784a(k);
                    if (mo33897b(a)) {
                        return this.f49090b;
                    }
                    return C17825i.m43736a(a);
                }
                C17421k.m42653a(k);
                C17421k.m42653a(obj);
                C17832m a2 = C17825i.m43736a(dVar.mo33784a(k));
                if (a2 == null) {
                    return C17825i.m43736a(null);
                }
                C174871 r4 = new C17410f<V, V>() {
                    /* renamed from: a */
                    public final V mo33734a(V v) {
                        C17486j.this.mo33897b(v);
                        return v;
                    }
                };
                Executor a3 = C17833n.m43743a();
                C17421k.m42653a(r4);
                C17818a aVar = new C17818a(a2, r4);
                a2.mo6039a(aVar, C17833n.m43744a(a3, aVar));
                return aVar;
            } catch (Throwable th) {
                if (mo33896a(th)) {
                    mVar = this.f49090b;
                } else {
                    mVar = C17825i.m43737a(th);
                }
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return mVar;
            }
        }
    }

    /* renamed from: com.google.b.b.g$k */
    static class C17488k<K, V> implements C17443b<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        final C17454g<K, V> f49093a;

        /* renamed from: a */
        public final ConcurrentMap<K, V> mo33773a() {
            return this.f49093a;
        }

        /* access modifiers changed from: 0000 */
        public final Object writeReplace() {
            return new C17490l(this.f49093a);
        }

        private C17488k(C17454g<K, V> gVar) {
            this.f49093a = gVar;
        }

        C17488k(C17444c<? super K, ? super V> cVar) {
            this(new C17454g<>(cVar, null));
        }

        /* renamed from: b */
        public final void mo33775b(Object obj) {
            C17421k.m42653a(obj);
            this.f49093a.remove(obj);
        }

        /* renamed from: a */
        public final V mo33771a(Object obj) {
            C17454g<K, V> gVar = this.f49093a;
            int a = gVar.mo33790a(C17421k.m42653a(obj));
            V a2 = gVar.mo33791a(a).mo33901a(obj, a);
            if (a2 == null) {
                gVar.f49037s.mo33769b(1);
            } else {
                gVar.f49037s.mo33767a(1);
            }
            return a2;
        }

        /* renamed from: a */
        public final void mo33774a(K k, V v) {
            this.f49093a.put(k, v);
        }

        /* renamed from: a */
        public final V mo33772a(K k, final Callable<? extends V> callable) throws ExecutionException {
            C17421k.m42653a(callable);
            C17454g<K, V> gVar = this.f49093a;
            C174891 r1 = new C17450d<Object, V>() {
                /* renamed from: a */
                public final V mo33784a(Object obj) throws Exception {
                    return callable.call();
                }
            };
            int a = gVar.mo33790a(C17421k.m42653a(k));
            return gVar.mo33791a(a).mo33902a(k, a, (C17450d<? super K, V>) r1);
        }
    }

    /* renamed from: com.google.b.b.g$l */
    static class C17490l<K, V> extends C17453f<K, V> implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        final C17495p f49096a;

        /* renamed from: b */
        final C17495p f49097b;

        /* renamed from: c */
        final C17406d<Object> f49098c;

        /* renamed from: d */
        final C17406d<Object> f49099d;

        /* renamed from: e */
        final long f49100e;

        /* renamed from: f */
        final long f49101f;

        /* renamed from: g */
        final long f49102g;

        /* renamed from: h */
        final C17527p<K, V> f49103h;

        /* renamed from: i */
        final int f49104i;

        /* renamed from: j */
        final C17522m<? super K, ? super V> f49105j;

        /* renamed from: k */
        final C17438t f49106k;

        /* renamed from: l */
        final C17450d<? super K, V> f49107l;

        /* renamed from: m */
        transient C17443b<K, V> f49108m;

        private Object readResolve() {
            return this.f49108m;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final C17443b<K, V> delegate() {
            return this.f49108m;
        }

        C17490l(C17454g<K, V> gVar) {
            C17454g<K, V> gVar2 = gVar;
            C17495p pVar = gVar2.f49026h;
            C17495p pVar2 = gVar2.f49027i;
            C17406d<Object> dVar = gVar2.f49024f;
            C17406d<Object> dVar2 = gVar2.f49025g;
            long j = gVar2.f49031m;
            long j2 = gVar2.f49030l;
            long j3 = gVar2.f49028j;
            C17527p<K, V> pVar3 = gVar2.f49029k;
            int i = gVar2.f49023e;
            C17522m<K, V> mVar = gVar2.f49034p;
            C17438t tVar = gVar2.f49035q;
            C17450d<? super K, V> dVar3 = gVar2.f49038t;
            this(pVar, pVar2, dVar, dVar2, j, j2, j3, pVar3, i, mVar, tVar, dVar3);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            objectInputStream.defaultReadObject();
            C17444c a = C17444c.m42708a();
            C17495p pVar = this.f49096a;
            boolean z15 = true;
            if (a.f48997k == null) {
                z = true;
            } else {
                z = false;
            }
            C17421k.m42669b(z, "Key strength was already set to %s", a.f48997k);
            a.f48997k = (C17495p) C17421k.m42653a(pVar);
            C17444c a2 = a.mo33777a(this.f49097b);
            C17406d<Object> dVar = this.f49098c;
            if (a2.f49002p == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C17421k.m42669b(z2, "key equivalence was already set to %s", a2.f49002p);
            a2.f49002p = (C17406d) C17421k.m42653a(dVar);
            C17406d<Object> dVar2 = this.f49099d;
            if (a2.f49003q == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            C17421k.m42669b(z3, "value equivalence was already set to %s", a2.f49003q);
            a2.f49003q = (C17406d) C17421k.m42653a(dVar2);
            int i = this.f49104i;
            if (a2.f48993g == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i2 = a2.f48993g;
            if (z4) {
                if (i > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                C17421k.m42659a(z5);
                a2.f48993g = i;
                C17444c a3 = a2.mo33778a(this.f49105j);
                a3.f48991e = false;
                if (this.f49100e > 0) {
                    long j = this.f49100e;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (a3.f48999m == -1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    C17421k.m42662a(z13, "expireAfterWrite was already set to %s ns", a3.f48999m);
                    if (j >= 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    C17421k.m42663a(z14, "duration cannot be negative: %s %s", j, (Object) timeUnit);
                    a3.f48999m = timeUnit.toNanos(j);
                }
                if (this.f49101f > 0) {
                    long j2 = this.f49101f;
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    if (a3.f49000n == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    C17421k.m42662a(z11, "expireAfterAccess was already set to %s ns", a3.f49000n);
                    if (j2 >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    C17421k.m42663a(z12, "duration cannot be negative: %s %s", j2, (Object) timeUnit2);
                    a3.f49000n = timeUnit2.toNanos(j2);
                }
                if (this.f49103h != C17449b.INSTANCE) {
                    C17527p<K, V> pVar2 = this.f49103h;
                    if (a3.f48996j == null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    C17421k.m42667b(z6);
                    if (a3.f48991e) {
                        if (a3.f48994h == -1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        C17421k.m42662a(z10, "weigher can not be combined with maximum size", a3.f48994h);
                    }
                    a3.f48996j = (C17527p) C17421k.m42653a(pVar2);
                    if (this.f49102g != -1) {
                        long j3 = this.f49102g;
                        if (a3.f48995i == -1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        C17421k.m42662a(z7, "maximum weight was already set to %s", a3.f48995i);
                        if (a3.f48994h == -1) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        C17421k.m42662a(z8, "maximum size was already set to %s", a3.f48994h);
                        a3.f48995i = j3;
                        if (j3 >= 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        C17421k.m42660a(z9, (Object) "maximum weight must not be negative");
                    }
                } else if (this.f49102g != -1) {
                    a3.mo33776a(this.f49102g);
                }
                if (this.f49106k != null) {
                    C17438t tVar = this.f49106k;
                    if (a3.f49005s != null) {
                        z15 = false;
                    }
                    C17421k.m42667b(z15);
                    a3.f49005s = (C17438t) C17421k.m42653a(tVar);
                }
                this.f49108m = a3.mo33781d();
                return;
            }
            throw new IllegalStateException(C17421k.m42657a("concurrency level was already set to %s", Integer.valueOf(i2)));
        }

        private C17490l(C17495p pVar, C17495p pVar2, C17406d<Object> dVar, C17406d<Object> dVar2, long j, long j2, long j3, C17527p<K, V> pVar3, int i, C17522m<? super K, ? super V> mVar, C17438t tVar, C17450d<? super K, V> dVar3) {
            this.f49096a = pVar;
            this.f49097b = pVar2;
            this.f49098c = dVar;
            this.f49099d = dVar2;
            this.f49100e = j;
            this.f49101f = j2;
            this.f49102g = j3;
            this.f49103h = pVar3;
            this.f49104i = i;
            this.f49105j = mVar;
            if (tVar == C17438t.m42690b() || tVar == C17444c.f48989d) {
                tVar = null;
            }
            this.f49106k = tVar;
            this.f49107l = dVar3;
        }
    }

    /* renamed from: com.google.b.b.g$m */
    enum C17491m implements C17515k<Object, Object> {
        INSTANCE;

        /* renamed from: a */
        public final C17505w<Object, Object> mo33840a() {
            return null;
        }

        /* renamed from: a */
        public final void mo33841a(long j) {
        }

        /* renamed from: a */
        public final void mo33842a(C17505w<Object, Object> wVar) {
        }

        /* renamed from: a */
        public final void mo33843a(C17515k<Object, Object> kVar) {
        }

        /* renamed from: b */
        public final C17515k<Object, Object> mo33844b() {
            return null;
        }

        /* renamed from: b */
        public final void mo33845b(long j) {
        }

        /* renamed from: b */
        public final void mo33846b(C17515k<Object, Object> kVar) {
        }

        /* renamed from: c */
        public final int mo33847c() {
            return 0;
        }

        /* renamed from: c */
        public final void mo33848c(C17515k<Object, Object> kVar) {
        }

        /* renamed from: d */
        public final Object mo33849d() {
            return null;
        }

        /* renamed from: d */
        public final void mo33850d(C17515k<Object, Object> kVar) {
        }

        /* renamed from: e */
        public final long mo33851e() {
            return 0;
        }

        /* renamed from: f */
        public final C17515k<Object, Object> mo33852f() {
            return this;
        }

        /* renamed from: g */
        public final C17515k<Object, Object> mo33853g() {
            return this;
        }

        /* renamed from: h */
        public final long mo33854h() {
            return 0;
        }

        /* renamed from: i */
        public final C17515k<Object, Object> mo33855i() {
            return this;
        }

        /* renamed from: j */
        public final C17515k<Object, Object> mo33856j() {
            return this;
        }
    }

    /* renamed from: com.google.b.b.g$n */
    static class C17492n<K, V> extends ReentrantLock {

        /* renamed from: a */
        final C17454g<K, V> f49111a;

        /* renamed from: b */
        volatile int f49112b;

        /* renamed from: c */
        long f49113c;

        /* renamed from: d */
        int f49114d;

        /* renamed from: e */
        int f49115e;

        /* renamed from: f */
        volatile AtomicReferenceArray<C17515k<K, V>> f49116f;

        /* renamed from: g */
        final long f49117g;

        /* renamed from: h */
        final ReferenceQueue<K> f49118h;

        /* renamed from: i */
        final ReferenceQueue<V> f49119i;

        /* renamed from: j */
        final Queue<C17515k<K, V>> f49120j;

        /* renamed from: k */
        final AtomicInteger f49121k = new AtomicInteger();

        /* renamed from: l */
        final Queue<C17515k<K, V>> f49122l;

        /* renamed from: m */
        final Queue<C17515k<K, V>> f49123m;

        /* renamed from: n */
        final C17442b f49124n;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo33912b() {
            m42921k();
        }

        /* renamed from: a */
        private void m42899a(C17515k<K, V> kVar, K k, V v, long j) {
            C17505w a = kVar.mo33840a();
            C17421k.m42668b(true, (Object) "Weights must be non-negative");
            kVar.mo33842a(this.f49111a.f49027i.mo33918a(this, kVar, v, 1));
            m42917g();
            this.f49113c += (long) 1;
            if (this.f49111a.mo33805g()) {
                kVar.mo33841a(j);
            }
            if (this.f49111a.mo33804f()) {
                kVar.mo33845b(j);
            }
            this.f49123m.add(kVar);
            this.f49122l.add(kVar);
            a.mo33824a(v);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo33902a(K k, int i, C17450d<? super K, V> dVar) throws ExecutionException {
            C17421k.m42653a(k);
            C17421k.m42653a(dVar);
            try {
                if (this.f49112b != 0) {
                    C17515k d = m42912d(k, i);
                    if (d != null) {
                        long a = this.f49111a.f49035q.mo33765a();
                        Object a2 = mo33900a(d, a);
                        if (a2 != null) {
                            m42908b(d, a);
                            this.f49124n.mo33767a(1);
                            V a3 = m42894a(d, k, i, a2, a, dVar);
                            mo33906a();
                            return a3;
                        }
                        C17505w a4 = d.mo33840a();
                        if (a4.mo33826c()) {
                            V a5 = m42895a(d, k, a4);
                            mo33906a();
                            return a5;
                        }
                    }
                }
                V b = m42905b(k, i, dVar);
                mo33906a();
                return b;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Error) {
                    throw new C17820e((Error) cause);
                } else if (cause instanceof RuntimeException) {
                    throw new C17838p(cause);
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                mo33906a();
                throw th;
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final V mo33903a(K r4, int r5, com.google.p1057b.p1059b.C17454g.C17486j<K, V> r6, com.google.p1057b.p1065h.p1066a.C17832m<V> r7) throws java.util.concurrent.ExecutionException {
            /*
                r3 = this;
                java.lang.Object r7 = com.google.p1057b.p1065h.p1066a.C17839q.m43748a(r7)     // Catch:{ all -> 0x003c }
                if (r7 == 0) goto L_0x0021
                com.google.b.b.a$b r0 = r3.f49124n     // Catch:{ all -> 0x003a }
                long r1 = r6.mo33898f()     // Catch:{ all -> 0x003a }
                r0.mo33768a(r1)     // Catch:{ all -> 0x003a }
                r3.m42902a((K) r4, r5, r6, (V) r7)     // Catch:{ all -> 0x003a }
                if (r7 != 0) goto L_0x0020
                com.google.b.b.a$b r0 = r3.f49124n
                long r1 = r6.mo33898f()
                r0.mo33770b(r1)
                r3.m42901a((K) r4, r5, r6)
            L_0x0020:
                return r7
            L_0x0021:
                com.google.b.b.d$a r0 = new com.google.b.b.d$a     // Catch:{ all -> 0x003a }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
                java.lang.String r2 = "CacheLoader returned null for key "
                r1.<init>(r2)     // Catch:{ all -> 0x003a }
                r1.append(r4)     // Catch:{ all -> 0x003a }
                java.lang.String r2 = "."
                r1.append(r2)     // Catch:{ all -> 0x003a }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003a }
                r0.<init>(r1)     // Catch:{ all -> 0x003a }
                throw r0     // Catch:{ all -> 0x003a }
            L_0x003a:
                r0 = move-exception
                goto L_0x003e
            L_0x003c:
                r0 = move-exception
                r7 = 0
            L_0x003e:
                if (r7 != 0) goto L_0x004c
                com.google.b.b.a$b r7 = r3.f49124n
                long r1 = r6.mo33898f()
                r7.mo33770b(r1)
                r3.m42901a((K) r4, r5, r6)
            L_0x004c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p1057b.p1059b.C17454g.C17492n.mo33903a(java.lang.Object, int, com.google.b.b.g$j, com.google.b.h.a.m):java.lang.Object");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo33908a(K k, int i, V v, int i2, C17516l lVar) {
            this.f49113c -= (long) i2;
            if (lVar.mo33935a()) {
                this.f49124n.mo33766a();
            }
            if (this.f49111a.f49033o != C17454g.f49019v) {
                this.f49111a.f49033o.offer(C17523n.create(k, v, lVar));
            }
        }

        /* renamed from: a */
        private void m42898a(C17515k<K, V> kVar) {
            if (this.f49111a.mo33794a()) {
                m42917g();
                if (((long) kVar.mo33840a().mo33822a()) <= this.f49117g || m42900a(kVar, kVar.mo33847c(), C17516l.SIZE)) {
                    while (this.f49113c > this.f49117g) {
                        C17515k h = m42918h();
                        if (!m42900a(h, h.mo33847c(), C17516l.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo33900a(C17515k<K, V> kVar, long j) {
            if (kVar.mo33849d() == null) {
                m42909c();
                return null;
            }
            V v = kVar.mo33840a().get();
            if (v == null) {
                m42909c();
                return null;
            } else if (!this.f49111a.mo33795a(kVar, j)) {
                return v;
            } else {
                m42906b(j);
                return null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo33901a(Object obj, int i) {
            try {
                if (this.f49112b != 0) {
                    long a = this.f49111a.f49035q.mo33765a();
                    C17515k a2 = m42892a(obj, i, a);
                    if (a2 == null) {
                        return null;
                    }
                    Object obj2 = a2.mo33840a().get();
                    if (obj2 != null) {
                        m42908b(a2, a);
                        V a3 = m42894a(a2, a2.mo33849d(), i, obj2, a, this.f49111a.f49038t);
                        mo33906a();
                        return a3;
                    }
                    m42909c();
                }
                mo33906a();
                return null;
            } finally {
                mo33906a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo33905a(K k, int i, V v, boolean z) {
            int i2;
            K k2 = k;
            int i3 = i;
            lock();
            try {
                long a = this.f49111a.f49035q.mo33765a();
                mo33907a(a);
                if (this.f49112b + 1 > this.f49115e) {
                    m42919i();
                    int i4 = this.f49112b;
                }
                AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = this.f49116f;
                int length = i3 & (atomicReferenceArray.length() - 1);
                C17515k kVar = (C17515k) atomicReferenceArray.get(length);
                C17515k kVar2 = kVar;
                while (kVar2 != null) {
                    Object d = kVar2.mo33849d();
                    if (kVar2.mo33847c() != i3 || d == null || !this.f49111a.f49024f.equivalent(k, d)) {
                        kVar2 = kVar2.mo33844b();
                    } else {
                        C17505w a2 = kVar2.mo33840a();
                        V v2 = a2.get();
                        if (v2 == null) {
                            this.f49114d++;
                            if (a2.mo33827d()) {
                                mo33908a(k, i, v2, a2.mo33822a(), C17516l.COLLECTED);
                                m42899a(kVar2, k, v, a);
                                i2 = this.f49112b;
                            } else {
                                m42899a(kVar2, k, v, a);
                                i2 = this.f49112b + 1;
                            }
                            this.f49112b = i2;
                            m42898a(kVar2);
                            return null;
                        } else if (z) {
                            m42911c(kVar2, a);
                            unlock();
                            mo33912b();
                            return v2;
                        } else {
                            this.f49114d++;
                            mo33908a(k, i, v2, a2.mo33822a(), C17516l.REPLACED);
                            m42899a(kVar2, k, v, a);
                            m42898a(kVar2);
                            unlock();
                            mo33912b();
                            return v2;
                        }
                    }
                }
                this.f49114d++;
                C17515k a3 = m42893a(k, i3, kVar);
                m42899a(a3, k, v, a);
                atomicReferenceArray.set(length, a3);
                this.f49112b++;
                m42898a(a3);
                unlock();
                mo33912b();
                return null;
            } finally {
                unlock();
                mo33912b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33911a(K k, int i, V v, V v2) {
            int i2 = i;
            lock();
            try {
                long a = this.f49111a.f49035q.mo33765a();
                mo33907a(a);
                AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = this.f49116f;
                int length = i2 & (atomicReferenceArray.length() - 1);
                C17515k kVar = (C17515k) atomicReferenceArray.get(length);
                for (C17515k kVar2 = kVar; kVar2 != null; kVar2 = kVar2.mo33844b()) {
                    Object d = kVar2.mo33849d();
                    if (kVar2.mo33847c() != i2 || d == null) {
                        K k2 = k;
                    } else if (this.f49111a.f49024f.equivalent(k, d)) {
                        C17505w a2 = kVar2.mo33840a();
                        Object obj = a2.get();
                        if (obj == null) {
                            if (a2.mo33827d()) {
                                int i3 = this.f49112b;
                                this.f49114d++;
                                C17515k a3 = m42891a(kVar, kVar2, d, i, obj, a2, C17516l.COLLECTED);
                                int i4 = this.f49112b - 1;
                                atomicReferenceArray.set(length, a3);
                                this.f49112b = i4;
                            }
                            return false;
                        } else if (this.f49111a.f49025g.equivalent(v, obj)) {
                            this.f49114d++;
                            mo33908a(k, i, obj, a2.mo33822a(), C17516l.REPLACED);
                            m42899a(kVar2, k, v2, a);
                            m42898a(kVar2);
                            unlock();
                            mo33912b();
                            return true;
                        } else {
                            m42911c(kVar2, a);
                            unlock();
                            mo33912b();
                            return false;
                        }
                    }
                    V v3 = v;
                }
                unlock();
                mo33912b();
                return false;
            } finally {
                unlock();
                mo33912b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo33904a(K k, int i, V v) {
            int i2 = i;
            lock();
            try {
                long a = this.f49111a.f49035q.mo33765a();
                mo33907a(a);
                AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = this.f49116f;
                int length = i2 & (atomicReferenceArray.length() - 1);
                C17515k kVar = (C17515k) atomicReferenceArray.get(length);
                for (C17515k kVar2 = kVar; kVar2 != null; kVar2 = kVar2.mo33844b()) {
                    Object d = kVar2.mo33849d();
                    if (kVar2.mo33847c() != i2 || d == null) {
                        K k2 = k;
                    } else if (this.f49111a.f49024f.equivalent(k, d)) {
                        C17505w a2 = kVar2.mo33840a();
                        V v2 = a2.get();
                        if (v2 == null) {
                            if (a2.mo33827d()) {
                                int i3 = this.f49112b;
                                this.f49114d++;
                                C17515k a3 = m42891a(kVar, kVar2, d, i, v2, a2, C17516l.COLLECTED);
                                int i4 = this.f49112b - 1;
                                atomicReferenceArray.set(length, a3);
                                this.f49112b = i4;
                            }
                            return null;
                        }
                        this.f49114d++;
                        mo33908a(k, i, v2, a2.mo33822a(), C17516l.REPLACED);
                        m42899a(kVar2, k, v, a);
                        m42898a(kVar2);
                        unlock();
                        mo33912b();
                        return v2;
                    }
                }
                unlock();
                mo33912b();
                return null;
            } finally {
                unlock();
                mo33912b();
            }
        }

        /* renamed from: a */
        private boolean m42902a(K k, int i, C17486j<K, V> jVar, V v) {
            K k2 = k;
            int i2 = i;
            lock();
            try {
                long a = this.f49111a.f49035q.mo33765a();
                mo33907a(a);
                int i3 = this.f49112b + 1;
                if (i3 > this.f49115e) {
                    m42919i();
                    i3 = this.f49112b + 1;
                }
                int i4 = i3;
                AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = this.f49116f;
                int length = i2 & (atomicReferenceArray.length() - 1);
                C17515k kVar = (C17515k) atomicReferenceArray.get(length);
                C17515k kVar2 = kVar;
                while (kVar2 != null) {
                    Object d = kVar2.mo33849d();
                    if (kVar2.mo33847c() != i2 || d == null || !this.f49111a.f49024f.equivalent(k2, d)) {
                        C17486j<K, V> jVar2 = jVar;
                        kVar2 = kVar2.mo33844b();
                    } else {
                        C17505w<Object, Object> a2 = kVar2.mo33840a();
                        Object obj = a2.get();
                        if (jVar != a2) {
                            if (obj != null || a2 == C17454g.f49018u) {
                                mo33908a(k, i, v, 0, C17516l.REPLACED);
                                unlock();
                                mo33912b();
                                return false;
                            }
                        }
                        this.f49114d++;
                        if (jVar.mo33827d()) {
                            mo33908a(k, i, obj, jVar.mo33822a(), obj == null ? C17516l.COLLECTED : C17516l.REPLACED);
                            i4--;
                        }
                        m42899a(kVar2, k, v, a);
                        this.f49112b = i4;
                        m42898a(kVar2);
                        return true;
                    }
                }
                this.f49114d++;
                C17515k a3 = m42893a(k2, i2, kVar);
                m42899a(a3, k, v, a);
                atomicReferenceArray.set(length, a3);
                this.f49112b = i4;
                m42898a(a3);
                unlock();
                mo33912b();
                return true;
            } finally {
                unlock();
                mo33912b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33909a(C17515k<K, V> kVar, int i) {
            lock();
            try {
                int i2 = this.f49112b;
                AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = this.f49116f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17515k<K, V> kVar2 = (C17515k) atomicReferenceArray.get(length);
                for (C17515k<K, V> kVar3 = kVar2; kVar3 != null; kVar3 = kVar3.mo33844b()) {
                    if (kVar3 == kVar) {
                        this.f49114d++;
                        int i3 = this.f49112b - 1;
                        atomicReferenceArray.set(length, m42891a(kVar2, kVar3, kVar3.mo33849d(), i, kVar3.mo33840a().get(), kVar3.mo33840a(), C17516l.COLLECTED));
                        this.f49112b = i3;
                        return true;
                    }
                }
                unlock();
                mo33912b();
                return false;
            } finally {
                unlock();
                mo33912b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33910a(K k, int i, C17505w<K, V> wVar) {
            lock();
            try {
                int i2 = this.f49112b;
                AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = this.f49116f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17515k kVar = (C17515k) atomicReferenceArray.get(length);
                C17515k kVar2 = kVar;
                while (kVar2 != null) {
                    Object d = kVar2.mo33849d();
                    if (kVar2.mo33847c() != i || d == null || !this.f49111a.f49024f.equivalent(k, d)) {
                        kVar2 = kVar2.mo33844b();
                    } else if (kVar2.mo33840a() == wVar) {
                        this.f49114d++;
                        int i3 = this.f49112b - 1;
                        atomicReferenceArray.set(length, m42891a(kVar, kVar2, d, i, wVar.get(), wVar, C17516l.COLLECTED));
                        this.f49112b = i3;
                        return true;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            mo33912b();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    mo33912b();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    mo33912b();
                }
            }
        }

        /* renamed from: a */
        private boolean m42901a(K k, int i, C17486j<K, V> jVar) {
            lock();
            try {
                AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = this.f49116f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17515k kVar = (C17515k) atomicReferenceArray.get(length);
                C17515k kVar2 = kVar;
                while (kVar2 != null) {
                    Object d = kVar2.mo33849d();
                    if (kVar2.mo33847c() != i || d == null || !this.f49111a.f49024f.equivalent(k, d)) {
                        kVar2 = kVar2.mo33844b();
                    } else if (kVar2.mo33840a() == jVar) {
                        if (jVar.mo33827d()) {
                            kVar2.mo33842a(jVar.f49089a);
                        } else {
                            atomicReferenceArray.set(length, m42904b(kVar, kVar2));
                        }
                        return true;
                    } else {
                        unlock();
                        mo33912b();
                        return false;
                    }
                }
                unlock();
                mo33912b();
                return false;
            } finally {
                unlock();
                mo33912b();
            }
        }

        /* renamed from: a */
        private boolean m42900a(C17515k<K, V> kVar, int i, C17516l lVar) {
            int i2 = this.f49112b;
            AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = this.f49116f;
            int length = (atomicReferenceArray.length() - 1) & i;
            C17515k<K, V> kVar2 = (C17515k) atomicReferenceArray.get(length);
            for (C17515k<K, V> kVar3 = kVar2; kVar3 != null; kVar3 = kVar3.mo33844b()) {
                if (kVar3 == kVar) {
                    this.f49114d++;
                    int i3 = this.f49112b - 1;
                    atomicReferenceArray.set(length, m42891a(kVar2, kVar3, kVar3.mo33849d(), i, kVar3.mo33840a().get(), kVar3.mo33840a(), lVar));
                    this.f49112b = i3;
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo33906a() {
            if ((this.f49121k.incrementAndGet() & 63) == 0) {
                m42920j();
            }
        }

        /* renamed from: j */
        private void m42920j() {
            m42914d(this.f49111a.f49035q.mo33765a());
            m42921k();
        }

        /* renamed from: k */
        private void m42921k() {
            if (!isHeldByCurrentThread()) {
                this.f49111a.mo33812m();
            }
        }

        /* renamed from: c */
        private void m42909c() {
            if (tryLock()) {
                try {
                    m42913d();
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: d */
        private void m42913d() {
            if (this.f49111a.mo33808h()) {
                m42915e();
            }
            if (this.f49111a.mo33809i()) {
                m42916f();
            }
        }

        /* renamed from: e */
        private void m42915e() {
            int i = 0;
            do {
                Reference poll = this.f49118h.poll();
                if (poll != null) {
                    this.f49111a.mo33793a((C17515k) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: f */
        private void m42916f() {
            int i = 0;
            do {
                Reference poll = this.f49119i.poll();
                if (poll != null) {
                    this.f49111a.mo33792a((C17505w) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: g */
        private void m42917g() {
            while (true) {
                C17515k kVar = (C17515k) this.f49120j.poll();
                if (kVar == null) {
                    return;
                }
                if (this.f49123m.contains(kVar)) {
                    this.f49123m.add(kVar);
                }
            }
        }

        /* renamed from: h */
        private C17515k<K, V> m42918h() {
            for (C17515k<K, V> kVar : this.f49123m) {
                if (kVar.mo33840a().mo33822a() > 0) {
                    return kVar;
                }
            }
            throw new AssertionError();
        }

        /* renamed from: i */
        private void m42919i() {
            AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = this.f49116f;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.f49112b;
                AtomicReferenceArray<C17515k<K, V>> a = m42897a(length << 1);
                this.f49115e = (a.length() * 3) / 4;
                int length2 = a.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    C17515k kVar = (C17515k) atomicReferenceArray.get(i2);
                    if (kVar != null) {
                        C17515k b = kVar.mo33844b();
                        int c = kVar.mo33847c() & length2;
                        if (b == null) {
                            a.set(c, kVar);
                        } else {
                            C17515k kVar2 = kVar;
                            while (b != null) {
                                int c2 = b.mo33847c() & length2;
                                if (c2 != c) {
                                    kVar2 = b;
                                    c = c2;
                                }
                                b = b.mo33844b();
                            }
                            a.set(c, kVar2);
                            while (kVar != kVar2) {
                                int c3 = kVar.mo33847c() & length2;
                                C17515k a2 = m42890a(kVar, (C17515k) a.get(c3));
                                if (a2 != null) {
                                    a.set(c3, a2);
                                } else {
                                    m42907b(kVar);
                                    i--;
                                }
                                kVar = kVar.mo33844b();
                            }
                        }
                    }
                }
                this.f49116f = a;
                this.f49112b = i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo33907a(long j) {
            m42914d(j);
        }

        /* renamed from: a */
        private static AtomicReferenceArray<C17515k<K, V>> m42897a(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* renamed from: b */
        private C17515k<K, V> m42903b(int i) {
            AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = this.f49116f;
            return (C17515k) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* renamed from: b */
        private void m42906b(long j) {
            if (tryLock()) {
                try {
                    m42910c(j);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: b */
        private void m42907b(C17515k<K, V> kVar) {
            mo33908a(kVar.mo33849d(), kVar.mo33847c(), kVar.mo33840a().get(), kVar.mo33840a().mo33822a(), C17516l.COLLECTED);
            this.f49122l.remove(kVar);
            this.f49123m.remove(kVar);
        }

        /* renamed from: c */
        private void m42910c(long j) {
            C17515k kVar;
            C17515k kVar2;
            m42917g();
            do {
                kVar = (C17515k) this.f49122l.peek();
                if (kVar == null || !this.f49111a.mo33795a(kVar, j)) {
                    do {
                        kVar2 = (C17515k) this.f49123m.peek();
                        if (kVar2 == null || !this.f49111a.mo33795a(kVar2, j)) {
                            return;
                        }
                    } while (m42900a(kVar2, kVar2.mo33847c(), C17516l.EXPIRED));
                    throw new AssertionError();
                }
            } while (m42900a(kVar, kVar.mo33847c(), C17516l.EXPIRED));
            throw new AssertionError();
        }

        /* renamed from: d */
        private void m42914d(long j) {
            if (tryLock()) {
                try {
                    m42913d();
                    m42910c(j);
                    this.f49121k.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: b */
        private C17515k<K, V> m42904b(C17515k<K, V> kVar, C17515k<K, V> kVar2) {
            int i = this.f49112b;
            C17515k<K, V> b = kVar2.mo33844b();
            while (kVar != kVar2) {
                C17515k<K, V> a = m42890a(kVar, b);
                if (a != null) {
                    b = a;
                } else {
                    m42907b(kVar);
                    i--;
                }
                kVar = kVar.mo33844b();
            }
            this.f49112b = i;
            return b;
        }

        /* renamed from: a */
        private C17515k<K, V> m42890a(C17515k<K, V> kVar, C17515k<K, V> kVar2) {
            if (kVar.mo33849d() == null) {
                return null;
            }
            C17505w a = kVar.mo33840a();
            Object obj = a.get();
            if (obj == null && a.mo33827d()) {
                return null;
            }
            C17515k<K, V> a2 = this.f49111a.f49036r.mo33882a(this, kVar, kVar2);
            a2.mo33842a(a.mo33823a(this.f49119i, obj, a2));
            return a2;
        }

        /* renamed from: c */
        private void m42911c(C17515k<K, V> kVar, long j) {
            if (this.f49111a.mo33805g()) {
                kVar.mo33841a(j);
            }
            this.f49123m.add(kVar);
        }

        /* renamed from: d */
        private C17515k<K, V> m42912d(Object obj, int i) {
            for (C17515k<K, V> b = m42903b(i); b != null; b = b.mo33844b()) {
                if (b.mo33847c() == i) {
                    Object d = b.mo33849d();
                    if (d == null) {
                        m42909c();
                    } else if (this.f49111a.f49024f.equivalent(obj, d)) {
                        return b;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final V mo33915c(Object obj, int i) {
            C17516l lVar;
            lock();
            try {
                mo33907a(this.f49111a.f49035q.mo33765a());
                int i2 = this.f49112b;
                AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = this.f49116f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17515k kVar = (C17515k) atomicReferenceArray.get(length);
                C17515k kVar2 = kVar;
                while (kVar2 != null) {
                    Object d = kVar2.mo33849d();
                    if (kVar2.mo33847c() != i || d == null || !this.f49111a.f49024f.equivalent(obj, d)) {
                        kVar2 = kVar2.mo33844b();
                    } else {
                        C17505w a = kVar2.mo33840a();
                        V v = a.get();
                        if (v != null) {
                            lVar = C17516l.EXPLICIT;
                        } else if (a.mo33827d()) {
                            lVar = C17516l.COLLECTED;
                        } else {
                            unlock();
                            mo33912b();
                            return null;
                        }
                        C17516l lVar2 = lVar;
                        this.f49114d++;
                        int i3 = this.f49112b - 1;
                        atomicReferenceArray.set(length, m42891a(kVar, kVar2, d, i, v, a, lVar2));
                        this.f49112b = i3;
                        return v;
                    }
                }
                unlock();
                mo33912b();
                return null;
            } finally {
                unlock();
                mo33912b();
            }
        }

        /* renamed from: b */
        private void m42908b(C17515k<K, V> kVar, long j) {
            if (this.f49111a.mo33805g()) {
                kVar.mo33841a(j);
            }
            this.f49120j.add(kVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo33913b(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f49112b != 0) {
                    C17515k a = m42892a(obj, i, this.f49111a.f49035q.mo33765a());
                    if (a == null) {
                        return false;
                    }
                    if (a.mo33840a().get() != null) {
                        z = true;
                    }
                    mo33906a();
                    return z;
                }
                mo33906a();
                return false;
            } finally {
                mo33906a();
            }
        }

        /* renamed from: a */
        private C17515k<K, V> m42893a(K k, int i, C17515k<K, V> kVar) {
            return this.f49111a.f49036r.mo33883a(this, C17421k.m42653a(k), i, kVar);
        }

        /* renamed from: a */
        private C17515k<K, V> m42892a(Object obj, int i, long j) {
            C17515k<K, V> d = m42912d(obj, i);
            if (d == null) {
                return null;
            }
            if (!this.f49111a.mo33795a(d, j)) {
                return d;
            }
            m42906b(j);
            return null;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private C17486j<K, V> m42889a(K k, int i, boolean z) {
            lock();
            try {
                long a = this.f49111a.f49035q.mo33765a();
                mo33907a(a);
                AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = this.f49116f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17515k kVar = (C17515k) atomicReferenceArray.get(length);
                C17515k kVar2 = kVar;
                while (kVar2 != null) {
                    Object d = kVar2.mo33849d();
                    if (kVar2.mo33847c() != i || d == null || !this.f49111a.f49024f.equivalent(k, d)) {
                        kVar2 = kVar2.mo33844b();
                    } else {
                        C17505w a2 = kVar2.mo33840a();
                        if (!a2.mo33826c()) {
                            if (!z || a - kVar2.mo33854h() >= this.f49111a.f49032n) {
                                this.f49114d++;
                                C17486j<K, V> jVar = new C17486j<>(a2);
                                kVar2.mo33842a((C17505w<K, V>) jVar);
                                unlock();
                                mo33912b();
                                return jVar;
                            }
                        }
                        unlock();
                        mo33912b();
                        return null;
                    }
                }
                this.f49114d++;
                C17486j<K, V> jVar2 = new C17486j<>();
                C17515k a3 = m42893a(k, i, kVar);
                a3.mo33842a((C17505w<K, V>) jVar2);
                atomicReferenceArray.set(length, a3);
                unlock();
                mo33912b();
                return jVar2;
            } catch (Throwable th) {
                unlock();
                mo33912b();
                throw th;
            }
        }

        /* renamed from: b */
        private V m42905b(K k, int i, C17450d<? super K, V> dVar) throws ExecutionException {
            C17486j jVar;
            C17505w wVar;
            boolean z;
            V a;
            K k2 = k;
            int i2 = i;
            lock();
            try {
                long a2 = this.f49111a.f49035q.mo33765a();
                mo33907a(a2);
                int i3 = this.f49112b - 1;
                AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = this.f49116f;
                int length = i2 & (atomicReferenceArray.length() - 1);
                C17515k kVar = (C17515k) atomicReferenceArray.get(length);
                C17515k kVar2 = kVar;
                while (true) {
                    jVar = null;
                    if (kVar2 == null) {
                        wVar = null;
                        break;
                    }
                    Object d = kVar2.mo33849d();
                    if (kVar2.mo33847c() != i2 || d == null || !this.f49111a.f49024f.equivalent(k2, d)) {
                        kVar2 = kVar2.mo33844b();
                    } else {
                        C17505w a3 = kVar2.mo33840a();
                        if (a3.mo33826c()) {
                            z = false;
                            wVar = a3;
                        } else {
                            V v = a3.get();
                            if (v == null) {
                                mo33908a(d, i, v, a3.mo33822a(), C17516l.COLLECTED);
                            } else if (this.f49111a.mo33795a(kVar2, a2)) {
                                mo33908a(d, i, v, a3.mo33822a(), C17516l.EXPIRED);
                            } else {
                                m42911c(kVar2, a2);
                                this.f49124n.mo33767a(1);
                                unlock();
                                mo33912b();
                                return v;
                            }
                            this.f49122l.remove(kVar2);
                            this.f49123m.remove(kVar2);
                            this.f49112b = i3;
                            wVar = a3;
                        }
                    }
                }
                z = true;
                if (z) {
                    jVar = new C17486j();
                    if (kVar2 == null) {
                        kVar2 = m42893a(k2, i2, kVar);
                        kVar2.mo33842a((C17505w<K, V>) jVar);
                        atomicReferenceArray.set(length, kVar2);
                    } else {
                        kVar2.mo33842a((C17505w<K, V>) jVar);
                    }
                }
                if (!z) {
                    return m42895a(kVar2, k2, wVar);
                }
                try {
                    synchronized (kVar2) {
                        a = mo33903a(k2, i2, jVar, jVar.mo33895a(k2, dVar));
                    }
                    this.f49124n.mo33769b(1);
                    return a;
                } catch (Throwable th) {
                    this.f49124n.mo33769b(1);
                    throw th;
                }
            } finally {
                unlock();
                mo33912b();
            }
        }

        /* renamed from: a */
        private V m42895a(C17515k<K, V> kVar, K k, C17505w<K, V> wVar) throws ExecutionException {
            if (wVar.mo33826c()) {
                C17421k.m42669b(!Thread.holdsLock(kVar), "Recursive load of: %s", k);
                try {
                    V e = wVar.mo33828e();
                    if (e != null) {
                        m42908b(kVar, this.f49111a.f49035q.mo33765a());
                        return e;
                    }
                    StringBuilder sb = new StringBuilder("CacheLoader returned null for key ");
                    sb.append(k);
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    throw new C17451a(sb.toString());
                } finally {
                    this.f49124n.mo33769b(1);
                }
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo33914b(Object obj, int i, Object obj2) {
            C17516l lVar;
            lock();
            try {
                mo33907a(this.f49111a.f49035q.mo33765a());
                int i2 = this.f49112b;
                AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = this.f49116f;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17515k kVar = (C17515k) atomicReferenceArray.get(length);
                C17515k kVar2 = kVar;
                while (kVar2 != null) {
                    Object d = kVar2.mo33849d();
                    if (kVar2.mo33847c() != i || d == null || !this.f49111a.f49024f.equivalent(obj, d)) {
                        kVar2 = kVar2.mo33844b();
                    } else {
                        C17505w a = kVar2.mo33840a();
                        Object obj3 = a.get();
                        if (this.f49111a.f49025g.equivalent(obj2, obj3)) {
                            lVar = C17516l.EXPLICIT;
                        } else if (obj3 != null || !a.mo33827d()) {
                            unlock();
                            mo33912b();
                            return false;
                        } else {
                            lVar = C17516l.COLLECTED;
                        }
                        this.f49114d++;
                        int i3 = this.f49112b - 1;
                        atomicReferenceArray.set(length, m42891a(kVar, kVar2, d, i, obj3, a, lVar));
                        this.f49112b = i3;
                        if (lVar != C17516l.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                mo33912b();
                return false;
            } finally {
                unlock();
                mo33912b();
            }
        }

        C17492n(C17454g<K, V> gVar, int i, long j, C17442b bVar) {
            ReferenceQueue<K> referenceQueue;
            Queue<C17515k<K, V>> queue;
            Queue<C17515k<K, V>> queue2;
            Queue<C17515k<K, V>> queue3;
            this.f49111a = gVar;
            this.f49117g = j;
            this.f49124n = (C17442b) C17421k.m42653a(bVar);
            AtomicReferenceArray<C17515k<K, V>> a = m42897a(i);
            this.f49115e = (a.length() * 3) / 4;
            if (!this.f49111a.mo33796b() && ((long) this.f49115e) == this.f49117g) {
                this.f49115e++;
            }
            this.f49116f = a;
            ReferenceQueue<V> referenceQueue2 = null;
            if (gVar.mo33808h()) {
                referenceQueue = new ReferenceQueue<>();
            } else {
                referenceQueue = null;
            }
            this.f49118h = referenceQueue;
            if (gVar.mo33809i()) {
                referenceQueue2 = new ReferenceQueue<>();
            }
            this.f49119i = referenceQueue2;
            if (gVar.mo33801d()) {
                queue = new ConcurrentLinkedQueue<>();
            } else {
                queue = C17454g.m42737l();
            }
            this.f49120j = queue;
            if (gVar.mo33802e()) {
                queue2 = new C17464ag<>();
            } else {
                queue2 = C17454g.m42737l();
            }
            this.f49122l = queue2;
            if (gVar.mo33801d()) {
                queue3 = new C17469c<>();
            } else {
                queue3 = C17454g.m42737l();
            }
            this.f49123m = queue3;
        }

        /* renamed from: a */
        private V m42896a(K k, int i, C17450d<? super K, V> dVar, boolean z) {
            final C17486j a = m42889a(k, i, true);
            if (a == null) {
                return null;
            }
            C17832m a2 = a.mo33895a(k, dVar);
            final K k2 = k;
            final int i2 = i;
            final C17832m mVar = a2;
            C174931 r0 = new Runnable() {
                public final void run() {
                    try {
                        C17492n.this.mo33903a(k2, i2, a, mVar);
                    } catch (Throwable th) {
                        C17454g.f49017a.log(Level.WARNING, "Exception thrown during refresh", th);
                        a.mo33896a(th);
                    }
                }
            };
            a2.mo6039a(r0, C17833n.m43743a());
            if (a2.isDone()) {
                try {
                    return C17839q.m43748a(a2);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* renamed from: a */
        private V m42894a(C17515k<K, V> kVar, K k, int i, V v, long j, C17450d<? super K, V> dVar) {
            if (this.f49111a.mo33797c() && j - kVar.mo33854h() > this.f49111a.f49032n && !kVar.mo33840a().mo33826c()) {
                V a = m42896a(k, i, dVar, true);
                if (a != null) {
                    return a;
                }
            }
            return v;
        }

        /* renamed from: a */
        private C17515k<K, V> m42891a(C17515k<K, V> kVar, C17515k<K, V> kVar2, K k, int i, V v, C17505w<K, V> wVar, C17516l lVar) {
            mo33908a(k, i, v, wVar.mo33822a(), lVar);
            this.f49122l.remove(kVar2);
            this.f49123m.remove(kVar2);
            if (!wVar.mo33826c()) {
                return m42904b(kVar, kVar2);
            }
            wVar.mo33824a(null);
            return kVar;
        }
    }

    /* renamed from: com.google.b.b.g$o */
    static class C17494o<K, V> extends SoftReference<V> implements C17505w<K, V> {

        /* renamed from: a */
        final C17515k<K, V> f49130a;

        /* renamed from: a */
        public int mo33822a() {
            return 1;
        }

        /* renamed from: a */
        public final void mo33824a(V v) {
        }

        /* renamed from: b */
        public final C17515k<K, V> mo33825b() {
            return this.f49130a;
        }

        /* renamed from: c */
        public final boolean mo33826c() {
            return false;
        }

        /* renamed from: d */
        public final boolean mo33827d() {
            return true;
        }

        /* renamed from: e */
        public final V mo33828e() {
            return get();
        }

        C17494o(ReferenceQueue<V> referenceQueue, V v, C17515k<K, V> kVar) {
            super(v, referenceQueue);
            this.f49130a = kVar;
        }

        /* renamed from: a */
        public C17505w<K, V> mo33823a(ReferenceQueue<V> referenceQueue, V v, C17515k<K, V> kVar) {
            return new C17494o(referenceQueue, v, kVar);
        }
    }

    /* renamed from: com.google.b.b.g$p */
    public enum C17495p {
        STRONG {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final C17406d<Object> mo33917a() {
                return C17407a.INSTANCE;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17505w<K, V> mo33918a(C17492n<K, V> nVar, C17515k<K, V> kVar, V v, int i) {
                if (i == 1) {
                    return new C17502t(v);
                }
                return new C17462ae(v, i);
            }
        },
        SOFT {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final C17406d<Object> mo33917a() {
                return C17406d.identity();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17505w<K, V> mo33918a(C17492n<K, V> nVar, C17515k<K, V> kVar, V v, int i) {
                if (i == 1) {
                    return new C17494o(nVar.f49119i, v, kVar);
                }
                return new C17461ad(nVar.f49119i, v, kVar, i);
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final C17406d<Object> mo33917a() {
                return C17406d.identity();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17505w<K, V> mo33918a(C17492n<K, V> nVar, C17515k<K, V> kVar, V v, int i) {
                if (i == 1) {
                    return new C17459ab(nVar.f49119i, v, kVar);
                }
                return new C17463af(nVar.f49119i, v, kVar, i);
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C17406d<Object> mo33917a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <K, V> C17505w<K, V> mo33918a(C17492n<K, V> nVar, C17515k<K, V> kVar, V v, int i);
    }

    /* renamed from: com.google.b.b.g$q */
    static final class C17499q<K, V> extends C17501s<K, V> {

        /* renamed from: a */
        volatile long f49132a = Long.MAX_VALUE;

        /* renamed from: b */
        C17515k<K, V> f49133b = C17454g.m42736k();

        /* renamed from: c */
        C17515k<K, V> f49134c = C17454g.m42736k();

        /* renamed from: e */
        public final long mo33851e() {
            return this.f49132a;
        }

        /* renamed from: f */
        public final C17515k<K, V> mo33852f() {
            return this.f49133b;
        }

        /* renamed from: g */
        public final C17515k<K, V> mo33853g() {
            return this.f49134c;
        }

        /* renamed from: a */
        public final void mo33841a(long j) {
            this.f49132a = j;
        }

        /* renamed from: b */
        public final void mo33846b(C17515k<K, V> kVar) {
            this.f49134c = kVar;
        }

        /* renamed from: a */
        public final void mo33843a(C17515k<K, V> kVar) {
            this.f49133b = kVar;
        }

        C17499q(K k, int i, C17515k<K, V> kVar) {
            super(k, i, kVar);
        }
    }

    /* renamed from: com.google.b.b.g$r */
    static final class C17500r<K, V> extends C17501s<K, V> {

        /* renamed from: a */
        volatile long f49135a = Long.MAX_VALUE;

        /* renamed from: b */
        C17515k<K, V> f49136b = C17454g.m42736k();

        /* renamed from: c */
        C17515k<K, V> f49137c = C17454g.m42736k();

        /* renamed from: d */
        volatile long f49138d = Long.MAX_VALUE;

        /* renamed from: e */
        C17515k<K, V> f49139e = C17454g.m42736k();

        /* renamed from: f */
        C17515k<K, V> f49140f = C17454g.m42736k();

        /* renamed from: e */
        public final long mo33851e() {
            return this.f49135a;
        }

        /* renamed from: f */
        public final C17515k<K, V> mo33852f() {
            return this.f49136b;
        }

        /* renamed from: g */
        public final C17515k<K, V> mo33853g() {
            return this.f49137c;
        }

        /* renamed from: h */
        public final long mo33854h() {
            return this.f49138d;
        }

        /* renamed from: i */
        public final C17515k<K, V> mo33855i() {
            return this.f49139e;
        }

        /* renamed from: j */
        public final C17515k<K, V> mo33856j() {
            return this.f49140f;
        }

        /* renamed from: a */
        public final void mo33841a(long j) {
            this.f49135a = j;
        }

        /* renamed from: b */
        public final void mo33845b(long j) {
            this.f49138d = j;
        }

        /* renamed from: c */
        public final void mo33848c(C17515k<K, V> kVar) {
            this.f49139e = kVar;
        }

        /* renamed from: d */
        public final void mo33850d(C17515k<K, V> kVar) {
            this.f49140f = kVar;
        }

        /* renamed from: a */
        public final void mo33843a(C17515k<K, V> kVar) {
            this.f49136b = kVar;
        }

        /* renamed from: b */
        public final void mo33846b(C17515k<K, V> kVar) {
            this.f49137c = kVar;
        }

        C17500r(K k, int i, C17515k<K, V> kVar) {
            super(k, i, kVar);
        }
    }

    /* renamed from: com.google.b.b.g$s */
    static class C17501s<K, V> extends C17468b<K, V> {

        /* renamed from: g */
        final K f49141g;

        /* renamed from: h */
        final int f49142h;

        /* renamed from: i */
        final C17515k<K, V> f49143i;

        /* renamed from: j */
        volatile C17505w<K, V> f49144j = C17454g.m42735j();

        /* renamed from: a */
        public final C17505w<K, V> mo33840a() {
            return this.f49144j;
        }

        /* renamed from: b */
        public final C17515k<K, V> mo33844b() {
            return this.f49143i;
        }

        /* renamed from: c */
        public final int mo33847c() {
            return this.f49142h;
        }

        /* renamed from: d */
        public final K mo33849d() {
            return this.f49141g;
        }

        /* renamed from: a */
        public final void mo33842a(C17505w<K, V> wVar) {
            this.f49144j = wVar;
        }

        C17501s(K k, int i, C17515k<K, V> kVar) {
            this.f49141g = k;
            this.f49142h = i;
            this.f49143i = kVar;
        }
    }

    /* renamed from: com.google.b.b.g$t */
    static class C17502t<K, V> implements C17505w<K, V> {

        /* renamed from: a */
        final V f49145a;

        /* renamed from: a */
        public int mo33822a() {
            return 1;
        }

        /* renamed from: a */
        public final C17505w<K, V> mo33823a(ReferenceQueue<V> referenceQueue, V v, C17515k<K, V> kVar) {
            return this;
        }

        /* renamed from: a */
        public final void mo33824a(V v) {
        }

        /* renamed from: b */
        public final C17515k<K, V> mo33825b() {
            return null;
        }

        /* renamed from: c */
        public final boolean mo33826c() {
            return false;
        }

        /* renamed from: d */
        public final boolean mo33827d() {
            return true;
        }

        public V get() {
            return this.f49145a;
        }

        /* renamed from: e */
        public final V mo33828e() {
            return get();
        }

        C17502t(V v) {
            this.f49145a = v;
        }
    }

    /* renamed from: com.google.b.b.g$u */
    static final class C17503u<K, V> extends C17501s<K, V> {

        /* renamed from: a */
        volatile long f49146a = Long.MAX_VALUE;

        /* renamed from: b */
        C17515k<K, V> f49147b = C17454g.m42736k();

        /* renamed from: c */
        C17515k<K, V> f49148c = C17454g.m42736k();

        /* renamed from: h */
        public final long mo33854h() {
            return this.f49146a;
        }

        /* renamed from: i */
        public final C17515k<K, V> mo33855i() {
            return this.f49147b;
        }

        /* renamed from: j */
        public final C17515k<K, V> mo33856j() {
            return this.f49148c;
        }

        /* renamed from: b */
        public final void mo33845b(long j) {
            this.f49146a = j;
        }

        /* renamed from: c */
        public final void mo33848c(C17515k<K, V> kVar) {
            this.f49147b = kVar;
        }

        /* renamed from: d */
        public final void mo33850d(C17515k<K, V> kVar) {
            this.f49148c = kVar;
        }

        C17503u(K k, int i, C17515k<K, V> kVar) {
            super(k, i, kVar);
        }
    }

    /* renamed from: com.google.b.b.g$v */
    final class C17504v extends C17483g<V> {
        public final V next() {
            return mo33888a().getValue();
        }

        C17504v() {
            super();
        }
    }

    /* renamed from: com.google.b.b.g$w */
    interface C17505w<K, V> {
        /* renamed from: a */
        int mo33822a();

        /* renamed from: a */
        C17505w<K, V> mo33823a(ReferenceQueue<V> referenceQueue, V v, C17515k<K, V> kVar);

        /* renamed from: a */
        void mo33824a(V v);

        /* renamed from: b */
        C17515k<K, V> mo33825b();

        /* renamed from: c */
        boolean mo33826c();

        /* renamed from: d */
        boolean mo33827d();

        /* renamed from: e */
        V mo33828e() throws ExecutionException;

        V get();
    }

    /* renamed from: com.google.b.b.g$x */
    final class C17506x extends AbstractCollection<V> {

        /* renamed from: b */
        private final ConcurrentMap<?, ?> f49151b;

        public final void clear() {
            this.f49151b.clear();
        }

        public final boolean isEmpty() {
            return this.f49151b.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new C17504v();
        }

        public final int size() {
            return this.f49151b.size();
        }

        public final Object[] toArray() {
            return C17454g.m42730a((Collection<E>) this).toArray();
        }

        public final boolean contains(Object obj) {
            return this.f49151b.containsValue(obj);
        }

        public final <E> E[] toArray(E[] eArr) {
            return C17454g.m42730a((Collection<E>) this).toArray(eArr);
        }

        C17506x(ConcurrentMap<?, ?> concurrentMap) {
            this.f49151b = concurrentMap;
        }
    }

    /* renamed from: com.google.b.b.g$y */
    static final class C17507y<K, V> extends C17458aa<K, V> {

        /* renamed from: a */
        volatile long f49152a = Long.MAX_VALUE;

        /* renamed from: b */
        C17515k<K, V> f49153b = C17454g.m42736k();

        /* renamed from: c */
        C17515k<K, V> f49154c = C17454g.m42736k();

        /* renamed from: e */
        public final long mo33851e() {
            return this.f49152a;
        }

        /* renamed from: f */
        public final C17515k<K, V> mo33852f() {
            return this.f49153b;
        }

        /* renamed from: g */
        public final C17515k<K, V> mo33853g() {
            return this.f49154c;
        }

        /* renamed from: a */
        public final void mo33841a(long j) {
            this.f49152a = j;
        }

        /* renamed from: b */
        public final void mo33846b(C17515k<K, V> kVar) {
            this.f49154c = kVar;
        }

        /* renamed from: a */
        public final void mo33843a(C17515k<K, V> kVar) {
            this.f49153b = kVar;
        }

        C17507y(ReferenceQueue<K> referenceQueue, K k, int i, C17515k<K, V> kVar) {
            super(referenceQueue, k, i, kVar);
        }
    }

    /* renamed from: com.google.b.b.g$z */
    static final class C17508z<K, V> extends C17458aa<K, V> {

        /* renamed from: a */
        volatile long f49155a = Long.MAX_VALUE;

        /* renamed from: b */
        C17515k<K, V> f49156b = C17454g.m42736k();

        /* renamed from: c */
        C17515k<K, V> f49157c = C17454g.m42736k();

        /* renamed from: d */
        volatile long f49158d = Long.MAX_VALUE;

        /* renamed from: e */
        C17515k<K, V> f49159e = C17454g.m42736k();

        /* renamed from: f */
        C17515k<K, V> f49160f = C17454g.m42736k();

        /* renamed from: e */
        public final long mo33851e() {
            return this.f49155a;
        }

        /* renamed from: f */
        public final C17515k<K, V> mo33852f() {
            return this.f49156b;
        }

        /* renamed from: g */
        public final C17515k<K, V> mo33853g() {
            return this.f49157c;
        }

        /* renamed from: h */
        public final long mo33854h() {
            return this.f49158d;
        }

        /* renamed from: i */
        public final C17515k<K, V> mo33855i() {
            return this.f49159e;
        }

        /* renamed from: j */
        public final C17515k<K, V> mo33856j() {
            return this.f49160f;
        }

        /* renamed from: a */
        public final void mo33841a(long j) {
            this.f49155a = j;
        }

        /* renamed from: b */
        public final void mo33845b(long j) {
            this.f49158d = j;
        }

        /* renamed from: c */
        public final void mo33848c(C17515k<K, V> kVar) {
            this.f49159e = kVar;
        }

        /* renamed from: d */
        public final void mo33850d(C17515k<K, V> kVar) {
            this.f49160f = kVar;
        }

        /* renamed from: a */
        public final void mo33843a(C17515k<K, V> kVar) {
            this.f49156b = kVar;
        }

        /* renamed from: b */
        public final void mo33846b(C17515k<K, V> kVar) {
            this.f49157c = kVar;
        }

        C17508z(ReferenceQueue<K> referenceQueue, K k, int i, C17515k<K, V> kVar) {
            super(referenceQueue, k, i, kVar);
        }
    }

    /* renamed from: j */
    static <K, V> C17505w<K, V> m42735j() {
        return f49018u;
    }

    /* renamed from: k */
    static <K, V> C17515k<K, V> m42736k() {
        return C17491m.INSTANCE;
    }

    /* renamed from: l */
    static <E> Queue<E> m42737l() {
        return f49019v;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo33802e() {
        return m42738n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo33805g() {
        return m42739o();
    }

    /* renamed from: n */
    private boolean m42738n() {
        if (this.f49031m > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private boolean m42739o() {
        if (this.f49030l > 0) {
            return true;
        }
        return false;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f49041y;
        if (set != null) {
            return set;
        }
        C17482f fVar = new C17482f(this);
        this.f49041y = fVar;
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo33808h() {
        if (this.f49026h != C17495p.STRONG) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo33809i() {
        if (this.f49027i != C17495p.STRONG) {
            return true;
        }
        return false;
    }

    public Set<K> keySet() {
        Set<K> set = this.f49039w;
        if (set != null) {
            return set;
        }
        C17485i iVar = new C17485i(this);
        this.f49039w = iVar;
        return iVar;
    }

    public Collection<V> values() {
        Collection<V> collection = this.f49040x;
        if (collection != null) {
            return collection;
        }
        C17506x xVar = new C17506x(this);
        this.f49040x = xVar;
        return xVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo33796b() {
        if (this.f49029k != C17449b.INSTANCE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo33797c() {
        if (this.f49032n > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo33801d() {
        if (m42739o() || mo33794a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo33804f() {
        if (m42738n() || mo33797c()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final void mo33812m() {
        while (true) {
            C17523n nVar = (C17523n) this.f49033o.poll();
            if (nVar != null) {
                try {
                    this.f49034p.mo33783a(nVar);
                } catch (Throwable th) {
                    f49017a.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            } else {
                return;
            }
        }
    }

    public int size() {
        long j = 0;
        for (C17492n<K, V> nVar : this.f49022d) {
            j += (long) Math.max(0, nVar.f49112b);
        }
        return C17743a.m43560a(j);
    }

    public boolean isEmpty() {
        C17492n<K, V>[] nVarArr = this.f49022d;
        long j = 0;
        for (int i = 0; i < nVarArr.length; i++) {
            if (nVarArr[i].f49112b != 0) {
                return false;
            }
            j += (long) nVarArr[i].f49114d;
        }
        if (j != 0) {
            for (int i2 = 0; i2 < nVarArr.length; i2++) {
                if (nVarArr[i2].f49112b != 0) {
                    return false;
                }
                j -= (long) nVarArr[i2].f49114d;
            }
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        C17516l lVar;
        C17492n<K, V>[] nVarArr = this.f49022d;
        int length = nVarArr.length;
        for (int i = 0; i < length; i++) {
            C17492n<K, V> nVar = nVarArr[i];
            if (nVar.f49112b != 0) {
                nVar.lock();
                try {
                    nVar.mo33907a(nVar.f49111a.f49035q.mo33765a());
                    AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = nVar.f49116f;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (C17515k kVar = (C17515k) atomicReferenceArray.get(i2); kVar != null; kVar = kVar.mo33844b()) {
                            if (kVar.mo33840a().mo33827d()) {
                                Object d = kVar.mo33849d();
                                Object obj = kVar.mo33840a().get();
                                if (d != null) {
                                    if (obj != null) {
                                        lVar = C17516l.EXPLICIT;
                                        C17516l lVar2 = lVar;
                                        nVar.mo33908a(d, kVar.mo33847c(), obj, kVar.mo33840a().mo33822a(), lVar2);
                                    }
                                }
                                lVar = C17516l.COLLECTED;
                                C17516l lVar22 = lVar;
                                nVar.mo33908a(d, kVar.mo33847c(), obj, kVar.mo33840a().mo33822a(), lVar22);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    if (nVar.f49111a.mo33808h()) {
                        do {
                        } while (nVar.f49118h.poll() != null);
                    }
                    if (nVar.f49111a.mo33809i()) {
                        do {
                        } while (nVar.f49119i.poll() != null);
                    }
                    nVar.f49122l.clear();
                    nVar.f49123m.clear();
                    nVar.f49121k.set(0);
                    nVar.f49114d++;
                    nVar.f49112b = 0;
                } finally {
                    nVar.unlock();
                    nVar.mo33912b();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33794a() {
        if (this.f49028j >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    static <K, V> void m42732b(C17515k<K, V> kVar) {
        C17515k k = m42736k();
        kVar.mo33843a(k);
        kVar.mo33846b(k);
    }

    /* renamed from: c */
    static <K, V> void m42734c(C17515k<K, V> kVar) {
        C17515k k = m42736k();
        kVar.mo33848c(k);
        kVar.mo33850d(k);
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m42730a(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C17586ap.m43268a((Collection<T>) arrayList, collection.iterator());
        return arrayList;
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int a = mo33790a(obj);
        return mo33791a(a).mo33913b(obj, a);
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = mo33790a(obj);
        return mo33791a(a).mo33901a(obj, a);
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = mo33790a(obj);
        return mo33791a(a).mo33915c(obj, a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo33790a(Object obj) {
        int hash = this.f49024f.hash(obj);
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
    public final C17492n<K, V> mo33791a(int i) {
        return this.f49022d[(i >>> this.f49021c) & this.f49020b];
    }

    public boolean containsValue(Object obj) {
        long j;
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        long a = this.f49035q.mo33765a();
        C17492n<K, V>[] nVarArr = this.f49022d;
        long j2 = -1;
        int i = 0;
        while (i < 3) {
            int length = nVarArr.length;
            long j3 = 0;
            int i2 = 0;
            while (i2 < length) {
                C17492n<K, V> nVar = nVarArr[i2];
                int i3 = nVar.f49112b;
                AtomicReferenceArray<C17515k<K, V>> atomicReferenceArray = nVar.f49116f;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    C17515k kVar = (C17515k) atomicReferenceArray.get(i4);
                    while (kVar != null) {
                        C17492n<K, V>[] nVarArr2 = nVarArr;
                        Object a2 = nVar.mo33900a(kVar, a);
                        if (a2 != null) {
                            j = a;
                            if (this.f49025g.equivalent(obj2, a2)) {
                                return true;
                            }
                        } else {
                            j = a;
                        }
                        kVar = kVar.mo33844b();
                        nVarArr = nVarArr2;
                        a = j;
                    }
                    long j4 = a;
                    C17492n<K, V>[] nVarArr3 = nVarArr;
                }
                C17492n<K, V>[] nVarArr4 = nVarArr;
                j3 += (long) nVar.f49114d;
                i2++;
                a = a;
            }
            long j5 = a;
            C17492n<K, V>[] nVarArr5 = nVarArr;
            if (j3 == j2) {
                break;
            }
            i++;
            j2 = j3;
            nVarArr = nVarArr5;
            a = j5;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33792a(C17505w<K, V> wVar) {
        C17515k b = wVar.mo33825b();
        int c = b.mo33847c();
        mo33791a(c).mo33910a(b.mo33849d(), c, wVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33793a(C17515k<K, V> kVar) {
        int c = kVar.mo33847c();
        mo33791a(c).mo33909a(kVar, c);
    }

    /* renamed from: a */
    static <K, V> void m42731a(C17515k<K, V> kVar, C17515k<K, V> kVar2) {
        kVar.mo33843a(kVar2);
        kVar2.mo33846b(kVar);
    }

    /* renamed from: b */
    static <K, V> void m42733b(C17515k<K, V> kVar, C17515k<K, V> kVar2) {
        kVar.mo33848c(kVar2);
        kVar2.mo33850d(kVar);
    }

    public V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    public V put(K k, V v) {
        C17421k.m42653a(k);
        C17421k.m42653a(v);
        int a = mo33790a((Object) k);
        return mo33791a(a).mo33905a(k, a, v, false);
    }

    public V putIfAbsent(K k, V v) {
        C17421k.m42653a(k);
        C17421k.m42653a(v);
        int a = mo33790a((Object) k);
        return mo33791a(a).mo33905a(k, a, v, true);
    }

    public V replace(K k, V v) {
        C17421k.m42653a(k);
        C17421k.m42653a(v);
        int a = mo33790a((Object) k);
        return mo33791a(a).mo33904a(k, a, v);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int a = mo33790a(obj);
        return mo33791a(a).mo33914b(obj, a, obj2);
    }

    C17454g(C17444c<? super K, ? super V> cVar, C17450d<? super K, V> dVar) {
        int i;
        long j;
        long j2;
        long j3;
        Queue<C17523n<K, V>> queue;
        boolean z;
        C17438t tVar;
        char c;
        boolean z2;
        char c2;
        int i2;
        char c3 = 4;
        if (cVar.f48993g == -1) {
            i = 4;
        } else {
            i = cVar.f48993g;
        }
        this.f49023e = Math.min(i, 65536);
        this.f49026h = cVar.mo33779b();
        this.f49027i = cVar.mo33780c();
        this.f49024f = (C17406d) C17413h.m42638a(cVar.f49002p, cVar.mo33779b().mo33917a());
        this.f49025g = (C17406d) C17413h.m42638a(cVar.f49003q, cVar.mo33780c().mo33917a());
        long j4 = 0;
        if (cVar.f48999m == 0 || cVar.f49000n == 0) {
            j = 0;
        } else if (cVar.f48996j == null) {
            j = cVar.f48994h;
        } else {
            j = cVar.f48995i;
        }
        this.f49028j = j;
        this.f49029k = (C17527p) C17413h.m42638a(cVar.f48996j, C17449b.INSTANCE);
        if (cVar.f49000n == -1) {
            j2 = 0;
        } else {
            j2 = cVar.f49000n;
        }
        this.f49030l = j2;
        if (cVar.f48999m == -1) {
            j3 = 0;
        } else {
            j3 = cVar.f48999m;
        }
        this.f49031m = j3;
        if (cVar.f49001o != -1) {
            j4 = cVar.f49001o;
        }
        this.f49032n = j4;
        this.f49034p = (C17522m) C17413h.m42638a(cVar.f49004r, C17448a.INSTANCE);
        if (this.f49034p == C17448a.INSTANCE) {
            queue = m42737l();
        } else {
            queue = new ConcurrentLinkedQueue<>();
        }
        this.f49033o = queue;
        int i3 = 0;
        int i4 = 1;
        if (mo33804f() || mo33805g()) {
            z = true;
        } else {
            z = false;
        }
        if (cVar.f49005s != null) {
            tVar = cVar.f49005s;
        } else if (z) {
            tVar = C17438t.m42690b();
        } else {
            tVar = C17444c.f48989d;
        }
        this.f49035q = tVar;
        C17495p pVar = this.f49026h;
        if (mo33801d() || mo33805g()) {
            c = 1;
        } else {
            c = 0;
        }
        if (mo33802e() || mo33804f()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (pVar != C17495p.WEAK) {
            c3 = 0;
        }
        char c4 = c3 | c;
        if (z2) {
            c2 = 2;
        } else {
            c2 = 0;
        }
        this.f49036r = C17472d.f49075i[c4 | c2];
        this.f49037s = (C17442b) cVar.f49006t.get();
        this.f49038t = null;
        if (cVar.f48992f == -1) {
            i2 = 16;
        } else {
            i2 = cVar.f48992f;
        }
        int min = Math.min(i2, 1073741824);
        if (mo33794a() && !mo33796b()) {
            min = Math.min(min, (int) this.f49028j);
        }
        int i5 = 1;
        int i6 = 0;
        while (i5 < this.f49023e && (!mo33794a() || ((long) (i5 * 20)) <= this.f49028j)) {
            i6++;
            i5 <<= 1;
        }
        this.f49021c = 32 - i6;
        this.f49020b = i5 - 1;
        this.f49022d = new C17492n[i5];
        int i7 = min / i5;
        if (i7 * i5 < min) {
            i7++;
        }
        while (i4 < i7) {
            i4 <<= 1;
        }
        if (mo33794a()) {
            long j5 = (long) i5;
            long j6 = (this.f49028j / j5) + 1;
            long j7 = this.f49028j % j5;
            while (i3 < this.f49022d.length) {
                if (((long) i3) == j7) {
                    j6--;
                }
                this.f49022d[i3] = m42729a(i4, j6, (C17442b) cVar.f49006t.get());
                i3++;
            }
            return;
        }
        while (i3 < this.f49022d.length) {
            this.f49022d[i3] = m42729a(i4, -1, (C17442b) cVar.f49006t.get());
            i3++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33795a(C17515k<K, V> kVar, long j) {
        C17421k.m42653a(kVar);
        if (m42739o() && j - kVar.mo33851e() >= this.f49030l) {
            return true;
        }
        if (!m42738n() || j - kVar.mo33854h() < this.f49031m) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private C17492n<K, V> m42729a(int i, long j, C17442b bVar) {
        C17492n nVar = new C17492n(this, i, j, bVar);
        return nVar;
    }

    public boolean replace(K k, V v, V v2) {
        C17421k.m42653a(k);
        C17421k.m42653a(v2);
        if (v == null) {
            return false;
        }
        int a = mo33790a((Object) k);
        return mo33791a(a).mo33911a(k, a, v, v2);
    }
}
