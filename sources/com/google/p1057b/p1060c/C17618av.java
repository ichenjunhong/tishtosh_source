package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1058a.C17432q;
import com.google.p1057b.p1060c.C17624aw.C17625a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.b.c.av */
public final class C17618av {

    /* renamed from: com.google.b.c.av$a */
    static class C17619a<K, V> extends C17668c<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: c */
        transient C17432q<? extends List<V>> f49295c;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final List<V> mo34190b() {
            return (List) this.f49295c.get();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final Set<K> mo34048d() {
            if (this.f49360a instanceof NavigableMap) {
                return new C17679e((NavigableMap) this.f49360a);
            }
            if (this.f49360a instanceof SortedMap) {
                return new C17682h((SortedMap) this.f49360a);
            }
            return new C17676c(this.f49360a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public final Map<K, Collection<V>> mo34058j() {
            if (this.f49360a instanceof NavigableMap) {
                return new C17678d((NavigableMap) this.f49360a);
            }
            if (this.f49360a instanceof SortedMap) {
                return new C17681g((SortedMap) this.f49360a);
            }
            return new C17672a(this.f49360a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f49295c);
            objectOutputStream.writeObject(this.f49360a);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f49295c = (C17432q) objectInputStream.readObject();
            Map<K, Collection<V>> map = (Map) objectInputStream.readObject();
            this.f49360a = map;
            this.f49361b = 0;
            for (Collection collection : map.values()) {
                C17421k.m42659a(!collection.isEmpty());
                this.f49361b += collection.size();
            }
        }

        C17619a(Map<K, Collection<V>> map, C17432q<? extends List<V>> qVar) {
            super(map);
            this.f49295c = (C17432q) C17421k.m42653a(qVar);
        }
    }

    /* renamed from: com.google.b.c.av$b */
    static abstract class C17620b<K, V> extends AbstractCollection<Entry<K, V>> {
        C17620b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C17608at<K, V> mo34191a();

        public void clear() {
            mo34191a().clear();
        }

        public int size() {
            return mo34191a().size();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return mo34191a().containsEntry(entry.getKey(), entry.getValue());
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return mo34191a().remove(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: com.google.b.c.av$c */
    static class C17621c<K, V> extends C17693h<K> {

        /* renamed from: a */
        final C17608at<K, V> f49296a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Iterator<K> mo34196a() {
            throw new AssertionError("should never be called");
        }

        public final void clear() {
            this.f49296a.clear();
        }

        public final Set<K> elementSet() {
            return this.f49296a.keySet();
        }

        public final int size() {
            return this.f49296a.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final int mo34198c() {
            return this.f49296a.asMap().size();
        }

        public final Iterator<K> iterator() {
            return C17598as.m43283a(this.f49296a.entries().iterator());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Iterator<C17625a<K>> mo34197b() {
            return new C17663bq<Entry<K, Collection<V>>, C17625a<K>>(this.f49296a.asMap().entrySet().iterator()) {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ Object mo34141a(Object obj) {
                    final Entry entry = (Entry) obj;
                    return new C17627a<K>() {
                        /* renamed from: a */
                        public final K mo34201a() {
                            return entry.getKey();
                        }

                        /* renamed from: b */
                        public final int mo34202b() {
                            return ((Collection) entry.getValue()).size();
                        }
                    };
                }
            };
        }

        C17621c(C17608at<K, V> atVar) {
            this.f49296a = atVar;
        }

        public final boolean contains(Object obj) {
            return this.f49296a.containsKey(obj);
        }

        /* renamed from: a */
        public final int mo34074a(Object obj) {
            Collection collection = (Collection) C17598as.m43282a(this.f49296a.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public final int remove(Object obj, int i) {
            C17698k.m43477a(i, "occurrences");
            if (i == 0) {
                return mo34074a(obj);
            }
            Collection collection = (Collection) C17598as.m43282a(this.f49296a.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i2 = 0; i2 < i; i2++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }
    }

    /* renamed from: a */
    public static <K, V> C17592aq<K, V> m43308a(Map<K, Collection<V>> map, C17432q<? extends List<V>> qVar) {
        return new C17619a(map, qVar);
    }
}
