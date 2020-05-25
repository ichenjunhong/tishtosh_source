package com.google.p1057b.p1060c;

import com.google.p1057b.p1060c.C17530ab.C17531a;
import com.google.p1057b.p1060c.C17538ad.C17540a;
import com.google.p1057b.p1060c.C17555ah.C17558a;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;

/* renamed from: com.google.b.c.ac */
public class C17536ac<K, V> extends C17555ah<K, V> implements C17592aq<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private transient C17536ac<V, K> f49187a;

    /* renamed from: com.google.b.c.ac$a */
    public static final class C17537a<K, V> extends C17558a<K, V> {
        /* renamed from: a */
        public final C17536ac<K, V> mo33993b() {
            return (C17536ac) super.mo33993b();
        }

        /* renamed from: a */
        public final C17537a<K, V> mo33991b(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
            super.mo33991b(iterable);
            return this;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C17558a mo33990a(Entry entry) {
            super.mo33990a(entry);
            return this;
        }

        /* renamed from: a */
        public final C17537a<K, V> mo33992b(K k, V v) {
            super.mo33992b(k, v);
            return this;
        }
    }

    /* renamed from: of */
    public static <K, V> C17536ac<K, V> m43084of() {
        return C17715q.f49455a;
    }

    public static <K, V> C17537a<K, V> builder() {
        return new C17537a<>();
    }

    public C17536ac<V, K> inverse() {
        C17536ac<V, K> acVar = this.f49187a;
        if (acVar != null) {
            return acVar;
        }
        C17537a builder = builder();
        C17666bt it = entries().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            builder.mo33992b(entry.getValue(), entry.getKey());
        }
        C17536ac<V, K> a = builder.mo33993b();
        a.f49187a = this;
        this.f49187a = a;
        return a;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C17654bk.m43402a((C17608at<K, V>) this, objectOutputStream);
    }

    public C17530ab<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> C17536ac<K, V> copyOf(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
        return new C17537a().mo33991b(iterable).mo33993b();
    }

    public C17530ab<V> get(K k) {
        C17530ab<V> abVar = (C17530ab) this.f49216b.get(k);
        if (abVar == null) {
            return C17530ab.m43056of();
        }
        return abVar;
    }

    public static <K, V> C17536ac<K, V> copyOf(C17608at<? extends K, ? extends V> atVar) {
        if (atVar.isEmpty()) {
            return m43084of();
        }
        if (atVar instanceof C17536ac) {
            C17536ac<K, V> acVar = (C17536ac) atVar;
            if (!acVar.mo34040a()) {
                return acVar;
            }
        }
        return m43083a(atVar.asMap().entrySet(), null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            C17540a builder = C17538ad.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    C17531a builder2 = C17530ab.builder();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        builder2.mo33975b(objectInputStream.readObject());
                    }
                    builder.mo34019a(readObject, builder2.mo33969a());
                    i2 += readInt2;
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder("Invalid value count ");
                    sb.append(readInt2);
                    throw new InvalidObjectException(sb.toString());
                }
            }
            try {
                C17560c.f49229a.mo34255a(this, (Object) builder.mo34020a());
                C17560c.f49230b.mo34254a(this, i2);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Invalid key count ");
            sb2.append(readInt);
            throw new InvalidObjectException(sb2.toString());
        }
    }

    C17536ac(C17538ad<K, C17530ab<V>> adVar, int i) {
        super(adVar, i);
    }

    public C17530ab<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> C17536ac<K, V> m43085of(K k, V v) {
        C17537a builder = builder();
        builder.mo33992b(k, v);
        return builder.mo33993b();
    }

    /* renamed from: a */
    static <K, V> C17536ac<K, V> m43083a(Collection<? extends Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        C17530ab abVar;
        if (collection.isEmpty()) {
            return m43084of();
        }
        C17540a aVar = new C17540a(collection.size());
        int i = 0;
        for (Entry entry : collection) {
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                abVar = C17530ab.copyOf(collection2);
            } else {
                abVar = C17530ab.sortedCopyOf(comparator, collection2);
            }
            if (!abVar.isEmpty()) {
                aVar.mo34019a(key, abVar);
                i += abVar.size();
            }
        }
        return new C17536ac<>(aVar.mo34020a(), i);
    }

    /* renamed from: of */
    public static <K, V> C17536ac<K, V> m43086of(K k, V v, K k2, V v2) {
        C17537a builder = builder();
        builder.mo33992b(k, v);
        builder.mo33992b(k2, v2);
        return builder.mo33993b();
    }

    /* renamed from: of */
    public static <K, V> C17536ac<K, V> m43087of(K k, V v, K k2, V v2, K k3, V v3) {
        C17537a builder = builder();
        builder.mo33992b(k, v);
        builder.mo33992b(k2, v2);
        builder.mo33992b(k3, v3);
        return builder.mo33993b();
    }

    /* renamed from: of */
    public static <K, V> C17536ac<K, V> m43088of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C17537a builder = builder();
        builder.mo33992b(k, v);
        builder.mo33992b(k2, v2);
        builder.mo33992b(k3, v3);
        builder.mo33992b(k4, v4);
        return builder.mo33993b();
    }

    /* renamed from: of */
    public static <K, V> C17536ac<K, V> m43089of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C17537a builder = builder();
        builder.mo33992b(k, v);
        builder.mo33992b(k2, v2);
        builder.mo33992b(k3, v3);
        builder.mo33992b(k4, v4);
        builder.mo33992b(k5, v5);
        return builder.mo33993b();
    }
}
