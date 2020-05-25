package android.arch.p006a.p008b;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: android.arch.a.b.b */
public class C0046b<K, V> implements Iterable<Entry<K, V>> {

    /* renamed from: b */
    public C0050c<K, V> f113b;

    /* renamed from: c */
    public C0050c<K, V> f114c;

    /* renamed from: d */
    public WeakHashMap<C0053f<K, V>, Boolean> f115d = new WeakHashMap<>();

    /* renamed from: e */
    public int f116e = 0;

    /* renamed from: android.arch.a.b.b$a */
    static class C0048a<K, V> extends C0052e<K, V> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C0050c<K, V> mo70a(C0050c<K, V> cVar) {
            return cVar.f119c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C0050c<K, V> mo71b(C0050c<K, V> cVar) {
            return cVar.f120d;
        }

        C0048a(C0050c<K, V> cVar, C0050c<K, V> cVar2) {
            super(cVar, cVar2);
        }
    }

    /* renamed from: android.arch.a.b.b$b */
    public static class C0049b<K, V> extends C0052e<K, V> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C0050c<K, V> mo70a(C0050c<K, V> cVar) {
            return cVar.f120d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C0050c<K, V> mo71b(C0050c<K, V> cVar) {
            return cVar.f119c;
        }

        public C0049b(C0050c<K, V> cVar, C0050c<K, V> cVar2) {
            super(cVar, cVar2);
        }
    }

    /* renamed from: android.arch.a.b.b$c */
    public static class C0050c<K, V> implements Entry<K, V> {

        /* renamed from: a */
        final K f117a;

        /* renamed from: b */
        final V f118b;

        /* renamed from: c */
        C0050c<K, V> f119c;

        /* renamed from: d */
        public C0050c<K, V> f120d;

        public final K getKey() {
            return this.f117a;
        }

        public final V getValue() {
            return this.f118b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f117a);
            sb.append("=");
            sb.append(this.f118b);
            return sb.toString();
        }

        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0050c)) {
                return false;
            }
            C0050c cVar = (C0050c) obj;
            if (!this.f117a.equals(cVar.f117a) || !this.f118b.equals(cVar.f118b)) {
                return false;
            }
            return true;
        }

        C0050c(K k, V v) {
            this.f117a = k;
            this.f118b = v;
        }
    }

    /* renamed from: android.arch.a.b.b$d */
    public class C0051d implements C0053f<K, V>, Iterator<Entry<K, V>> {

        /* renamed from: b */
        private C0050c<K, V> f122b;

        /* renamed from: c */
        private boolean f123c;

        public final boolean hasNext() {
            if (this.f123c) {
                if (C0046b.this.f113b != null) {
                    return true;
                }
                return false;
            } else if (this.f122b == null || this.f122b.f119c == null) {
                return false;
            } else {
                return true;
            }
        }

        public final /* bridge */ /* synthetic */ Object next() {
            C0050c<K, V> cVar;
            if (this.f123c) {
                this.f123c = false;
                cVar = C0046b.this.f113b;
            } else if (this.f122b != null) {
                cVar = this.f122b.f119c;
            } else {
                cVar = null;
            }
            this.f122b = cVar;
            return this.f122b;
        }

        private C0051d() {
            this.f123c = true;
        }

        /* renamed from: a_ */
        public final void mo77a_(C0050c<K, V> cVar) {
            boolean z;
            if (cVar == this.f122b) {
                this.f122b = this.f122b.f120d;
                if (this.f122b == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f123c = z;
            }
        }
    }

    /* renamed from: android.arch.a.b.b$e */
    static abstract class C0052e<K, V> implements C0053f<K, V>, Iterator<Entry<K, V>> {

        /* renamed from: a */
        C0050c<K, V> f124a;

        /* renamed from: b */
        C0050c<K, V> f125b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C0050c<K, V> mo70a(C0050c<K, V> cVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract C0050c<K, V> mo71b(C0050c<K, V> cVar);

        public boolean hasNext() {
            if (this.f125b != null) {
                return true;
            }
            return false;
        }

        public /* synthetic */ Object next() {
            C0050c<K, V> cVar = this.f125b;
            this.f125b = m88a();
            return cVar;
        }

        /* renamed from: a */
        private C0050c<K, V> m88a() {
            if (this.f125b == this.f124a || this.f124a == null) {
                return null;
            }
            return mo70a(this.f125b);
        }

        /* renamed from: a_ */
        public final void mo77a_(C0050c<K, V> cVar) {
            if (this.f124a == cVar && cVar == this.f125b) {
                this.f125b = null;
                this.f124a = null;
            }
            if (this.f124a == cVar) {
                this.f124a = mo71b(this.f124a);
            }
            if (this.f125b == cVar) {
                this.f125b = m88a();
            }
        }

        C0052e(C0050c<K, V> cVar, C0050c<K, V> cVar2) {
            this.f124a = cVar2;
            this.f125b = cVar;
        }
    }

    /* renamed from: android.arch.a.b.b$f */
    interface C0053f<K, V> {
        /* renamed from: a_ */
        void mo77a_(C0050c<K, V> cVar);
    }

    /* renamed from: a */
    public final C0051d mo65a() {
        C0051d dVar = new C0051d<>();
        this.f115d.put(dVar, Boolean.valueOf(false));
        return dVar;
    }

    public Iterator<Entry<K, V>> iterator() {
        C0048a aVar = new C0048a(this.f113b, this.f114c);
        this.f115d.put(aVar, Boolean.valueOf(false));
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0050c<K, V> mo61a(K k) {
        C0050c<K, V> cVar = this.f113b;
        while (cVar != null && !cVar.f117a.equals(k)) {
            cVar = cVar.f119c;
        }
        return cVar;
    }

    /* renamed from: b */
    public V mo63b(K k) {
        C0050c a = mo61a(k);
        if (a == null) {
            return null;
        }
        this.f116e--;
        if (!this.f115d.isEmpty()) {
            for (C0053f a_ : this.f115d.keySet()) {
                a_.mo77a_(a);
            }
        }
        if (a.f120d != null) {
            a.f120d.f119c = a.f119c;
        } else {
            this.f113b = a.f119c;
        }
        if (a.f119c != null) {
            a.f119c.f120d = a.f120d;
        } else {
            this.f114c = a.f120d;
        }
        a.f119c = null;
        a.f120d = null;
        return a.f118b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0046b)) {
            return false;
        }
        C0046b bVar = (C0046b) obj;
        if (this.f116e != bVar.f116e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public V mo62a(K k, V v) {
        C0050c a = mo61a(k);
        if (a != null) {
            return a.f118b;
        }
        mo66b(k, v);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C0050c<K, V> mo66b(K k, V v) {
        C0050c<K, V> cVar = new C0050c<>(k, v);
        this.f116e++;
        if (this.f114c == null) {
            this.f113b = cVar;
            this.f114c = this.f113b;
            return cVar;
        }
        this.f114c.f119c = cVar;
        cVar.f120d = this.f114c;
        this.f114c = cVar;
        return cVar;
    }
}
