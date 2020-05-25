package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17413h;
import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1060c.C17538ad.C17540a;
import com.google.p1057b.p1060c.C17555ah.C17558a;
import com.google.p1057b.p1060c.C17570ak.C17571a;
import com.google.p1057b.p1060c.C17579am.C17580a;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;

/* renamed from: com.google.b.c.al */
public class C17575al<K, V> extends C17555ah<K, V> implements C17657bl<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final transient C17570ak<V> f49250a;

    /* renamed from: d */
    private transient C17575al<V, K> f49251d;

    /* renamed from: e */
    private transient C17570ak<Entry<K, V>> f49252e;

    /* renamed from: com.google.b.c.al$a */
    public static final class C17576a<K, V> extends C17558a<K, V> {
        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final Collection<V> mo34072c() {
            return new C17711n();
        }

        /* renamed from: a */
        public final C17575al<K, V> mo33993b() {
            Collection entrySet = this.f49225a.entrySet();
            if (this.f49226b != null) {
                entrySet = C17638bb.m43358a(this.f49226b).mo34235c().mo34234b(entrySet);
            }
            return C17575al.m43205a(entrySet, this.f49227c);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C17558a mo33990a(Entry entry) {
            super.mo33990a(entry);
            return this;
        }

        /* renamed from: a */
        public final C17576a<K, V> mo33991b(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
            super.mo33991b(iterable);
            return this;
        }

        /* renamed from: a */
        public final C17576a<K, V> mo33992b(K k, V v) {
            super.mo33992b(k, v);
            return this;
        }
    }

    /* renamed from: com.google.b.c.al$b */
    static final class C17577b<K, V> extends C17570ak<Entry<K, V>> {

        /* renamed from: a */
        private final transient C17575al<K, V> f49253a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33977a() {
            return false;
        }

        public final C17666bt<Entry<K, V>> iterator() {
            return this.f49253a.mo34056i();
        }

        public final int size() {
            return this.f49253a.size();
        }

        C17577b(C17575al<K, V> alVar) {
            this.f49253a = alVar;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.f49253a.containsEntry(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: com.google.b.c.al$c */
    static final class C17578c {

        /* renamed from: a */
        static final C17656a<C17575al> f49254a = C17654bk.m43401a(C17575al.class, "emptySet");
    }

    /* renamed from: of */
    public static <K, V> C17575al<K, V> m43206of() {
        return C17716r.f49456a;
    }

    public static <K, V> C17576a<K, V> builder() {
        return new C17576a<>();
    }

    public C17570ak<Entry<K, V>> entries() {
        C17570ak<Entry<K, V>> akVar = this.f49252e;
        if (akVar != null) {
            return akVar;
        }
        C17577b bVar = new C17577b(this);
        this.f49252e = bVar;
        return bVar;
    }

    public C17575al<V, K> inverse() {
        C17575al<V, K> alVar = this.f49251d;
        if (alVar != null) {
            return alVar;
        }
        C17576a builder = builder();
        C17666bt it = entries().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            builder.mo33992b(entry.getValue(), entry.getKey());
        }
        C17575al<V, K> a = builder.mo33993b();
        a.f49251d = this;
        this.f49251d = a;
        return a;
    }

    public C17570ak<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private static <V> C17570ak<V> m43203a(Comparator<? super V> comparator) {
        if (comparator == null) {
            return C17570ak.m43180of();
        }
        return C17579am.m43222a(comparator);
    }

    public static <K, V> C17575al<K, V> copyOf(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
        return new C17576a().mo33991b(iterable).mo33993b();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Comparator comparator;
        objectOutputStream.defaultWriteObject();
        if (this.f49250a instanceof C17579am) {
            comparator = ((C17579am) this.f49250a).comparator();
        } else {
            comparator = null;
        }
        objectOutputStream.writeObject(comparator);
        C17654bk.m43402a((C17608at<K, V>) this, objectOutputStream);
    }

    public C17570ak<V> get(K k) {
        return (C17570ak) C17413h.m42638a((C17570ak) this.f49216b.get(k), this.f49250a);
    }

    public static <K, V> C17575al<K, V> copyOf(C17608at<? extends K, ? extends V> atVar) {
        C17421k.m42653a(atVar);
        if (atVar.isEmpty()) {
            return m43206of();
        }
        if (atVar instanceof C17575al) {
            C17575al<K, V> alVar = (C17575al) atVar;
            if (!alVar.mo34040a()) {
                return alVar;
            }
        }
        return m43205a((Collection<? extends Entry<? extends K, ? extends Collection<? extends V>>>) atVar.asMap().entrySet(), null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        C17571a aVar;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            C17540a builder = C17538ad.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    if (comparator == null) {
                        aVar = new C17571a();
                    } else {
                        aVar = new C17580a(comparator);
                    }
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        aVar.mo33975b(objectInputStream.readObject());
                    }
                    C17570ak a = aVar.mo34100a();
                    if (a.size() == readInt2) {
                        builder.mo34019a(readObject, a);
                        i2 += readInt2;
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder("Duplicate key-value pairs exist for key ");
                        sb.append(readObject);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Invalid value count ");
                    sb2.append(readInt2);
                    throw new InvalidObjectException(sb2.toString());
                }
            }
            try {
                C17560c.f49229a.mo34255a(this, (Object) builder.mo34020a());
                C17560c.f49230b.mo34254a(this, i2);
                C17578c.f49254a.mo34255a(this, (Object) m43203a(comparator));
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Invalid key count ");
            sb3.append(readInt);
            throw new InvalidObjectException(sb3.toString());
        }
    }

    public C17570ak<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> C17575al<K, V> m43207of(K k, V v) {
        C17576a builder = builder();
        builder.mo33992b(k, v);
        return builder.mo33993b();
    }

    /* renamed from: a */
    private static <V> C17570ak<V> m43204a(Comparator<? super V> comparator, Collection<? extends V> collection) {
        if (comparator == null) {
            return C17570ak.copyOf(collection);
        }
        return C17579am.copyOf(comparator, collection);
    }

    /* renamed from: a */
    static <K, V> C17575al<K, V> m43205a(Collection<? extends Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m43206of();
        }
        C17540a aVar = new C17540a(collection.size());
        int i = 0;
        for (Entry entry : collection) {
            Object key = entry.getKey();
            C17570ak a = m43204a(comparator, (Collection) entry.getValue());
            if (!a.isEmpty()) {
                aVar.mo34019a(key, a);
                i += a.size();
            }
        }
        return new C17575al<>(aVar.mo34020a(), i, comparator);
    }

    C17575al(C17538ad<K, C17570ak<V>> adVar, int i, Comparator<? super V> comparator) {
        super(adVar, i);
        this.f49250a = m43203a(comparator);
    }

    /* renamed from: of */
    public static <K, V> C17575al<K, V> m43208of(K k, V v, K k2, V v2) {
        C17576a builder = builder();
        builder.mo33992b(k, v);
        builder.mo33992b(k2, v2);
        return builder.mo33993b();
    }

    /* renamed from: of */
    public static <K, V> C17575al<K, V> m43209of(K k, V v, K k2, V v2, K k3, V v3) {
        C17576a builder = builder();
        builder.mo33992b(k, v);
        builder.mo33992b(k2, v2);
        builder.mo33992b(k3, v3);
        return builder.mo33993b();
    }

    /* renamed from: of */
    public static <K, V> C17575al<K, V> m43210of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C17576a builder = builder();
        builder.mo33992b(k, v);
        builder.mo33992b(k2, v2);
        builder.mo33992b(k3, v3);
        builder.mo33992b(k4, v4);
        return builder.mo33993b();
    }

    /* renamed from: of */
    public static <K, V> C17575al<K, V> m43211of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C17576a builder = builder();
        builder.mo33992b(k, v);
        builder.mo33992b(k2, v2);
        builder.mo33992b(k3, v3);
        builder.mo33992b(k4, v4);
        builder.mo33992b(k5, v5);
        return builder.mo33993b();
    }
}
