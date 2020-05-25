package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.gson.internal.g */
public final class C18061g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: f */
    static final /* synthetic */ boolean f50109f = (!C18061g.class.desiredAssertionStatus());

    /* renamed from: g */
    private static final Comparator<Comparable> f50110g = new Comparator<Comparable>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    };

    /* renamed from: a */
    Comparator<? super K> f50111a;

    /* renamed from: b */
    C18068d<K, V> f50112b;

    /* renamed from: c */
    int f50113c;

    /* renamed from: d */
    int f50114d;

    /* renamed from: e */
    final C18068d<K, V> f50115e;

    /* renamed from: h */
    private C18063a f50116h;

    /* renamed from: i */
    private C18065b f50117i;

    /* renamed from: com.google.gson.internal.g$a */
    class C18063a extends AbstractSet<Entry<K, V>> {
        public final void clear() {
            C18061g.this.clear();
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new C18067c<Entry<K, V>>() {
                public final /* synthetic */ Object next() {
                    return mo34988a();
                }

                {
                    C18061g gVar = C18061g.this;
                }
            };
        }

        public final int size() {
            return C18061g.this.f50113c;
        }

        C18063a() {
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry) || C18061g.this.mo34965a((Entry) obj) == null) {
                return false;
            }
            return true;
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C18068d a = C18061g.this.mo34965a((Entry) obj);
            if (a == null) {
                return false;
            }
            C18061g.this.mo34966a(a, true);
            return true;
        }
    }

    /* renamed from: com.google.gson.internal.g$b */
    final class C18065b extends AbstractSet<K> {
        public final void clear() {
            C18061g.this.clear();
        }

        public final Iterator<K> iterator() {
            return new C18067c<K>() {
                public final K next() {
                    return mo34988a().f50131f;
                }

                {
                    C18061g gVar = C18061g.this;
                }
            };
        }

        public final int size() {
            return C18061g.this.f50113c;
        }

        C18065b() {
        }

        public final boolean contains(Object obj) {
            return C18061g.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (C18061g.this.mo34964a(obj) != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.gson.internal.g$c */
    abstract class C18067c<T> implements Iterator<T> {

        /* renamed from: b */
        C18068d<K, V> f50122b = C18061g.this.f50115e.f50129d;

        /* renamed from: c */
        C18068d<K, V> f50123c;

        /* renamed from: d */
        int f50124d = C18061g.this.f50114d;

        public final boolean hasNext() {
            if (this.f50122b != C18061g.this.f50115e) {
                return true;
            }
            return false;
        }

        public final void remove() {
            if (this.f50123c != null) {
                C18061g.this.mo34966a(this.f50123c, true);
                this.f50123c = null;
                this.f50124d = C18061g.this.f50114d;
                return;
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C18068d<K, V> mo34988a() {
            C18068d<K, V> dVar = this.f50122b;
            if (dVar == C18061g.this.f50115e) {
                throw new NoSuchElementException();
            } else if (C18061g.this.f50114d == this.f50124d) {
                this.f50122b = dVar.f50129d;
                this.f50123c = dVar;
                return dVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        C18067c() {
        }
    }

    /* renamed from: com.google.gson.internal.g$d */
    static final class C18068d<K, V> implements Entry<K, V> {

        /* renamed from: a */
        C18068d<K, V> f50126a;

        /* renamed from: b */
        C18068d<K, V> f50127b;

        /* renamed from: c */
        C18068d<K, V> f50128c;

        /* renamed from: d */
        C18068d<K, V> f50129d;

        /* renamed from: e */
        C18068d<K, V> f50130e;

        /* renamed from: f */
        final K f50131f;

        /* renamed from: g */
        V f50132g;

        /* renamed from: h */
        int f50133h;

        public final K getKey() {
            return this.f50131f;
        }

        public final V getValue() {
            return this.f50132g;
        }

        C18068d() {
            this.f50130e = this;
            this.f50129d = this;
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (this.f50131f == null) {
                i = 0;
            } else {
                i = this.f50131f.hashCode();
            }
            if (this.f50132g != null) {
                i2 = this.f50132g.hashCode();
            }
            return i ^ i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f50131f);
            sb.append("=");
            sb.append(this.f50132g);
            return sb.toString();
        }

        public final V setValue(V v) {
            V v2 = this.f50132g;
            this.f50132g = v;
            return v2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (this.f50131f != null ? this.f50131f.equals(entry.getKey()) : entry.getKey() == null) {
                if (this.f50132g != null ? this.f50132g.equals(entry.getValue()) : entry.getValue() == null) {
                    return true;
                }
            }
            return false;
        }

        C18068d(C18068d<K, V> dVar, K k, C18068d<K, V> dVar2, C18068d<K, V> dVar3) {
            this.f50126a = dVar;
            this.f50131f = k;
            this.f50133h = 1;
            this.f50129d = dVar2;
            this.f50130e = dVar3;
            dVar3.f50129d = this;
            dVar2.f50130e = this;
        }
    }

    public final int size() {
        return this.f50113c;
    }

    public C18061g() {
        this(f50110g);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final Set<Entry<K, V>> entrySet() {
        C18063a aVar = this.f50116h;
        if (aVar != null) {
            return aVar;
        }
        C18063a aVar2 = new C18063a<>();
        this.f50116h = aVar2;
        return aVar2;
    }

    public final Set<K> keySet() {
        C18065b bVar = this.f50117i;
        if (bVar != null) {
            return bVar;
        }
        C18065b bVar2 = new C18065b<>();
        this.f50117i = bVar2;
        return bVar2;
    }

    public final void clear() {
        this.f50112b = null;
        this.f50113c = 0;
        this.f50114d++;
        C18068d<K, V> dVar = this.f50115e;
        dVar.f50130e = dVar;
        dVar.f50129d = dVar;
    }

    /* renamed from: b */
    private C18068d<K, V> m44252b(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return m44249a((K) obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C18068d<K, V> mo34964a(Object obj) {
        C18068d<K, V> b = m44252b(obj);
        if (b != null) {
            mo34966a(b, true);
        }
        return b;
    }

    public final boolean containsKey(Object obj) {
        if (m44252b(obj) != null) {
            return true;
        }
        return false;
    }

    public final V get(Object obj) {
        C18068d b = m44252b(obj);
        if (b != null) {
            return b.f50132g;
        }
        return null;
    }

    public final V remove(Object obj) {
        C18068d a = mo34964a(obj);
        if (a != null) {
            return a.f50132g;
        }
        return null;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Comparator<? super K>, code=java.util.Comparator, for r2v0, types: [java.util.Comparator<? super K>, java.util.Comparator] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18061g(java.util.Comparator r2) {
        /*
            r1 = this;
            r1.<init>()
            com.google.gson.internal.g$d r0 = new com.google.gson.internal.g$d
            r0.<init>()
            r1.f50115e = r0
            if (r2 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            java.util.Comparator<java.lang.Comparable> r2 = f50110g
        L_0x000f:
            r1.f50111a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C18061g.<init>(java.util.Comparator):void");
    }

    /* renamed from: a */
    private void m44250a(C18068d<K, V> dVar) {
        int i;
        int i2;
        C18068d<K, V> dVar2 = dVar.f50127b;
        C18068d<K, V> dVar3 = dVar.f50128c;
        C18068d<K, V> dVar4 = dVar3.f50127b;
        C18068d<K, V> dVar5 = dVar3.f50128c;
        dVar.f50128c = dVar4;
        if (dVar4 != null) {
            dVar4.f50126a = dVar;
        }
        m44251a(dVar, dVar3);
        dVar3.f50127b = dVar;
        dVar.f50126a = dVar3;
        int i3 = 0;
        if (dVar2 != null) {
            i = dVar2.f50133h;
        } else {
            i = 0;
        }
        if (dVar4 != null) {
            i2 = dVar4.f50133h;
        } else {
            i2 = 0;
        }
        dVar.f50133h = Math.max(i, i2) + 1;
        int i4 = dVar.f50133h;
        if (dVar5 != null) {
            i3 = dVar5.f50133h;
        }
        dVar3.f50133h = Math.max(i4, i3) + 1;
    }

    /* renamed from: b */
    private void m44253b(C18068d<K, V> dVar) {
        int i;
        int i2;
        C18068d<K, V> dVar2 = dVar.f50127b;
        C18068d<K, V> dVar3 = dVar.f50128c;
        C18068d<K, V> dVar4 = dVar2.f50127b;
        C18068d<K, V> dVar5 = dVar2.f50128c;
        dVar.f50127b = dVar5;
        if (dVar5 != null) {
            dVar5.f50126a = dVar;
        }
        m44251a(dVar, dVar2);
        dVar2.f50128c = dVar;
        dVar.f50126a = dVar2;
        int i3 = 0;
        if (dVar3 != null) {
            i = dVar3.f50133h;
        } else {
            i = 0;
        }
        if (dVar5 != null) {
            i2 = dVar5.f50133h;
        } else {
            i2 = 0;
        }
        dVar.f50133h = Math.max(i, i2) + 1;
        int i4 = dVar.f50133h;
        if (dVar4 != null) {
            i3 = dVar4.f50133h;
        }
        dVar2.f50133h = Math.max(i4, i3) + 1;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r5 != false) goto L_0x0024;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.gson.internal.C18061g.C18068d<K, V> mo34965a(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.google.gson.internal.g$d r0 = r4.m44252b(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f50132g
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L_0x001f
            if (r3 == 0) goto L_0x001d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r5 = 0
            goto L_0x0020
        L_0x001f:
            r5 = 1
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            return r0
        L_0x0027:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C18061g.mo34965a(java.util.Map$Entry):com.google.gson.internal.g$d");
    }

    public final V put(K k, V v) {
        if (k != null) {
            C18068d a = m44249a(k, true);
            V v2 = a.f50132g;
            a.f50132g = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: a */
    private void m44251a(C18068d<K, V> dVar, C18068d<K, V> dVar2) {
        C18068d<K, V> dVar3 = dVar.f50126a;
        dVar.f50126a = null;
        if (dVar2 != null) {
            dVar2.f50126a = dVar3;
        }
        if (dVar3 == null) {
            this.f50112b = dVar2;
        } else if (dVar3.f50127b == dVar) {
            dVar3.f50127b = dVar2;
        } else if (f50109f || dVar3.f50128c == dVar) {
            dVar3.f50128c = dVar2;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private C18068d<K, V> m44249a(K k, boolean z) {
        int i;
        C18068d<K, V> dVar;
        Comparable comparable;
        C18068d<K, V> dVar2;
        Comparator<? super K> comparator = this.f50111a;
        C18068d<K, V> dVar3 = this.f50112b;
        if (dVar3 != null) {
            if (comparator == f50110g) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(dVar3.f50131f);
                } else {
                    i = comparator.compare(k, dVar3.f50131f);
                }
                if (i != 0) {
                    if (i < 0) {
                        dVar2 = dVar3.f50127b;
                    } else {
                        dVar2 = dVar3.f50128c;
                    }
                    if (dVar2 == null) {
                        break;
                    }
                    dVar3 = dVar2;
                } else {
                    return dVar3;
                }
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C18068d<K, V> dVar4 = this.f50115e;
        if (dVar3 != null) {
            dVar = new C18068d<>(dVar3, k, dVar4, dVar4.f50130e);
            if (i < 0) {
                dVar3.f50127b = dVar;
            } else {
                dVar3.f50128c = dVar;
            }
            m44254b(dVar3, true);
        } else if (comparator != f50110g || (k instanceof Comparable)) {
            dVar = new C18068d<>(dVar3, k, dVar4, dVar4.f50130e);
            this.f50112b = dVar;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(k.getClass().getName());
            sb.append(" is not Comparable");
            throw new ClassCastException(sb.toString());
        }
        this.f50113c++;
        this.f50114d++;
        return dVar;
    }

    /* renamed from: b */
    private void m44254b(C18068d<K, V> dVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (dVar != null) {
            C18068d<K, V> dVar2 = dVar.f50127b;
            C18068d<K, V> dVar3 = dVar.f50128c;
            int i5 = 0;
            if (dVar2 != null) {
                i = dVar2.f50133h;
            } else {
                i = 0;
            }
            if (dVar3 != null) {
                i2 = dVar3.f50133h;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C18068d<K, V> dVar4 = dVar3.f50127b;
                C18068d<K, V> dVar5 = dVar3.f50128c;
                if (dVar5 != null) {
                    i4 = dVar5.f50133h;
                } else {
                    i4 = 0;
                }
                if (dVar4 != null) {
                    i5 = dVar4.f50133h;
                }
                int i7 = i5 - i4;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    m44250a(dVar);
                } else if (f50109f || i7 == 1) {
                    m44253b(dVar3);
                    m44250a(dVar);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    break;
                }
            } else if (i6 == 2) {
                C18068d<K, V> dVar6 = dVar2.f50127b;
                C18068d<K, V> dVar7 = dVar2.f50128c;
                if (dVar7 != null) {
                    i3 = dVar7.f50133h;
                } else {
                    i3 = 0;
                }
                if (dVar6 != null) {
                    i5 = dVar6.f50133h;
                }
                int i8 = i5 - i3;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m44253b(dVar);
                } else if (f50109f || i8 == -1) {
                    m44250a(dVar2);
                    m44253b(dVar);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    break;
                }
            } else if (i6 == 0) {
                dVar.f50133h = i + 1;
                if (z) {
                    return;
                }
            } else if (f50109f || i6 == -1 || i6 == 1) {
                dVar.f50133h = Math.max(i, i2) + 1;
                if (!z) {
                    break;
                }
            } else {
                throw new AssertionError();
            }
            dVar = dVar.f50126a;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo34966a(C18068d<K, V> dVar, boolean z) {
        C18068d<K, V> dVar2;
        int i;
        C18068d<K, V> dVar3;
        if (z) {
            dVar.f50130e.f50129d = dVar.f50129d;
            dVar.f50129d.f50130e = dVar.f50130e;
        }
        C18068d<K, V> dVar4 = dVar.f50127b;
        C18068d<K, V> dVar5 = dVar.f50128c;
        C18068d<K, V> dVar6 = dVar.f50126a;
        int i2 = 0;
        if (dVar4 == null || dVar5 == null) {
            if (dVar4 != null) {
                m44251a(dVar, dVar4);
                dVar.f50127b = null;
            } else if (dVar5 != null) {
                m44251a(dVar, dVar5);
                dVar.f50128c = null;
            } else {
                m44251a(dVar, null);
            }
            m44254b(dVar6, false);
            this.f50113c--;
            this.f50114d++;
            return;
        }
        if (dVar4.f50133h <= dVar5.f50133h) {
            C18068d<K, V> dVar7 = dVar5.f50127b;
            while (true) {
                C18068d<K, V> dVar8 = dVar5;
                dVar5 = dVar7;
                dVar2 = dVar8;
                if (dVar5 == null) {
                    break;
                }
                dVar7 = dVar5.f50127b;
            }
        } else {
            C18068d<K, V> dVar9 = dVar4.f50128c;
            while (true) {
                C18068d<K, V> dVar10 = dVar9;
                dVar3 = dVar4;
                dVar4 = dVar10;
                if (dVar4 == null) {
                    break;
                }
                dVar9 = dVar4.f50128c;
            }
            dVar2 = dVar3;
        }
        mo34966a(dVar2, false);
        C18068d<K, V> dVar11 = dVar.f50127b;
        if (dVar11 != null) {
            i = dVar11.f50133h;
            dVar2.f50127b = dVar11;
            dVar11.f50126a = dVar2;
            dVar.f50127b = null;
        } else {
            i = 0;
        }
        C18068d<K, V> dVar12 = dVar.f50128c;
        if (dVar12 != null) {
            i2 = dVar12.f50133h;
            dVar2.f50128c = dVar12;
            dVar12.f50126a = dVar2;
            dVar.f50128c = null;
        }
        dVar2.f50133h = Math.max(i, i2) + 1;
        m44251a(dVar, dVar2);
    }
}
