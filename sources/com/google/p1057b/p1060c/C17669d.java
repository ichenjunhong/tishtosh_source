package com.google.p1057b.p1060c;

import com.google.b.c.d$i.a;
import com.google.p1057b.p1058a.C17421k;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.b.c.d */
abstract class C17669d<K, V> extends C17689g<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: a */
    public transient Map<K, Collection<V>> f49360a;

    /* renamed from: b */
    public transient int f49361b;

    /* renamed from: com.google.b.c.d$a */
    class C17672a extends C17607e<K, Collection<V>> {

        /* renamed from: a */
        final transient Map<K, Collection<V>> f49364a;

        /* renamed from: com.google.b.c.d$a$a */
        class C17673a extends C17604b<K, Collection<V>> {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Map<K, Collection<V>> mo34157a() {
                return C17672a.this;
            }

            public final Iterator<Entry<K, Collection<V>>> iterator() {
                return new C17674b();
            }

            C17673a() {
            }

            public final boolean contains(Object obj) {
                return C17699l.m43483a((Collection) C17672a.this.f49364a.entrySet(), obj);
            }

            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                C17669d dVar = C17669d.this;
                Collection collection = (Collection) C17598as.m43288c(dVar.f49360a, entry.getKey());
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    dVar.f49361b -= size;
                }
                return true;
            }
        }

        /* renamed from: com.google.b.c.d$a$b */
        class C17674b implements Iterator<Entry<K, Collection<V>>> {

            /* renamed from: a */
            final Iterator<Entry<K, Collection<V>>> f49367a = C17672a.this.f49364a.entrySet().iterator();

            /* renamed from: b */
            Collection<V> f49368b;

            public final boolean hasNext() {
                return this.f49367a.hasNext();
            }

            public final /* synthetic */ Object next() {
                Entry entry = (Entry) this.f49367a.next();
                this.f49368b = (Collection) entry.getValue();
                return C17672a.this.mo34275a(entry);
            }

            public final void remove() {
                boolean z;
                if (this.f49368b != null) {
                    z = true;
                } else {
                    z = false;
                }
                C17698k.m43479a(z);
                this.f49367a.remove();
                C17669d.this.f49361b -= this.f49368b.size();
                this.f49368b.clear();
                this.f49368b = null;
            }

            C17674b() {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Set<Entry<K, Collection<V>>> mo34180a() {
            return new C17673a();
        }

        public int hashCode() {
            return this.f49364a.hashCode();
        }

        public Set<K> keySet() {
            return C17669d.this.keySet();
        }

        public int size() {
            return this.f49364a.size();
        }

        public String toString() {
            return this.f49364a.toString();
        }

        public void clear() {
            if (this.f49364a == C17669d.this.f49360a) {
                C17669d.this.clear();
            } else {
                C17586ap.m43270b(new C17674b());
            }
        }

        public boolean containsKey(Object obj) {
            return C17598as.m43287b(this.f49364a, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj || this.f49364a.equals(obj)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Entry<K, Collection<V>> mo34275a(Entry<K, Collection<V>> entry) {
            Object key = entry.getKey();
            return C17598as.m43284a(key, C17669d.this.mo34270a(key, (Collection) entry.getValue()));
        }

        public /* synthetic */ Object get(Object obj) {
            Collection collection = (Collection) C17598as.m43282a(this.f49364a, obj);
            if (collection == null) {
                return null;
            }
            return C17669d.this.mo34270a(obj, collection);
        }

        public /* synthetic */ Object remove(Object obj) {
            Collection collection = (Collection) this.f49364a.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection b = C17669d.this.mo34190b();
            b.addAll(collection);
            C17669d.this.f49361b -= collection.size();
            collection.clear();
            return b;
        }

        C17672a(Map<K, Collection<V>> map) {
            this.f49364a = map;
        }
    }

    /* renamed from: com.google.b.c.d$b */
    abstract class C17675b<T> implements Iterator<T> {

        /* renamed from: b */
        final Iterator<Entry<K, Collection<V>>> f49370b;

        /* renamed from: c */
        K f49371c = null;

        /* renamed from: d */
        Collection<V> f49372d = null;

        /* renamed from: e */
        Iterator<V> f49373e = C17591b.INSTANCE;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo34274a(K k, V v);

        public boolean hasNext() {
            if (this.f49370b.hasNext() || this.f49373e.hasNext()) {
                return true;
            }
            return false;
        }

        public void remove() {
            this.f49373e.remove();
            if (this.f49372d.isEmpty()) {
                this.f49370b.remove();
            }
            C17669d.this.f49361b--;
        }

        public T next() {
            if (!this.f49373e.hasNext()) {
                Entry entry = (Entry) this.f49370b.next();
                this.f49371c = entry.getKey();
                this.f49372d = (Collection) entry.getValue();
                this.f49373e = this.f49372d.iterator();
            }
            return mo34274a(this.f49371c, this.f49373e.next());
        }

        C17675b() {
            this.f49370b = C17669d.this.f49360a.entrySet().iterator();
        }
    }

    /* renamed from: com.google.b.c.d$c */
    class C17676c extends C17605c<K, Collection<V>> {
        public void clear() {
            C17586ap.m43270b(iterator());
        }

        public int hashCode() {
            return mo34165b().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            final Iterator it = mo34165b().entrySet().iterator();
            return new Iterator<K>() {

                /* renamed from: a */
                Entry<K, Collection<V>> f49376a;

                public final boolean hasNext() {
                    return it.hasNext();
                }

                public final K next() {
                    this.f49376a = (Entry) it.next();
                    return this.f49376a.getKey();
                }

                public final void remove() {
                    boolean z;
                    if (this.f49376a != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C17698k.m43479a(z);
                    Collection collection = (Collection) this.f49376a.getValue();
                    it.remove();
                    C17669d.this.f49361b -= collection.size();
                    collection.clear();
                    this.f49376a = null;
                }
            };
        }

        public boolean containsAll(Collection<?> collection) {
            return mo34165b().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            if (this == obj || mo34165b().keySet().equals(obj)) {
                return true;
            }
            return false;
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) mo34165b().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                C17669d.this.f49361b -= i;
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }

        C17676c(Map<K, Collection<V>> map) {
            super(map);
        }
    }

    /* renamed from: com.google.b.c.d$d */
    class C17678d extends C17681g implements NavigableMap<K, Collection<V>> {
        /* access modifiers changed from: private */
        /* renamed from: f */
        public NavigableMap<K, Collection<V>> mo34301d() {
            return (NavigableMap) super.mo34301d();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        public final NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public NavigableSet<K> mo34181e() {
            return new C17679e(mo34301d());
        }

        public final NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new C17678d(mo34301d().descendingMap());
        }

        public final Entry<K, Collection<V>> pollFirstEntry() {
            return m43442a(entrySet().iterator());
        }

        public final Entry<K, Collection<V>> firstEntry() {
            Entry firstEntry = mo34301d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return mo34275a(firstEntry);
        }

        public final Entry<K, Collection<V>> lastEntry() {
            Entry lastEntry = mo34301d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return mo34275a(lastEntry);
        }

        public final Entry<K, Collection<V>> pollLastEntry() {
            return m43442a(descendingMap().entrySet().iterator());
        }

        public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        public final K ceilingKey(K k) {
            return mo34301d().ceilingKey(k);
        }

        public final K floorKey(K k) {
            return mo34301d().floorKey(k);
        }

        public final K higherKey(K k) {
            return mo34301d().higherKey(k);
        }

        public final K lowerKey(K k) {
            return mo34301d().lowerKey(k);
        }

        public final Entry<K, Collection<V>> ceilingEntry(K k) {
            Entry ceilingEntry = mo34301d().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return mo34275a(ceilingEntry);
        }

        public final Entry<K, Collection<V>> floorEntry(K k) {
            Entry floorEntry = mo34301d().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return mo34275a(floorEntry);
        }

        public final Entry<K, Collection<V>> higherEntry(K k) {
            Entry higherEntry = mo34301d().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return mo34275a(higherEntry);
        }

        public final Entry<K, Collection<V>> lowerEntry(K k) {
            Entry lowerEntry = mo34301d().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return mo34275a(lowerEntry);
        }

        /* renamed from: a */
        private Entry<K, Collection<V>> m43442a(Iterator<Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Entry entry = (Entry) it.next();
            Collection b = C17669d.this.mo34190b();
            b.addAll((Collection) entry.getValue());
            it.remove();
            return C17598as.m43284a(entry.getKey(), C17669d.this.mo34271a(b));
        }

        C17678d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C17678d(mo34301d().headMap(k, z));
        }

        public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C17678d(mo34301d().tailMap(k, z));
        }

        public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C17678d(mo34301d().subMap(k, z, k2, z2));
        }
    }

    /* renamed from: com.google.b.c.d$e */
    class C17679e extends C17682h implements NavigableSet<K> {
        /* access modifiers changed from: private */
        /* renamed from: c */
        public NavigableMap<K, Collection<V>> mo34321a() {
            return (NavigableMap) super.mo34321a();
        }

        public final Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public final NavigableSet<K> descendingSet() {
            return new C17679e(mo34321a().descendingMap());
        }

        public final K pollFirst() {
            return C17586ap.m43265a(iterator());
        }

        public final K pollLast() {
            return C17586ap.m43265a(descendingIterator());
        }

        public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        public final K ceiling(K k) {
            return mo34321a().ceilingKey(k);
        }

        public final K floor(K k) {
            return mo34321a().floorKey(k);
        }

        public final K higher(K k) {
            return mo34321a().higherKey(k);
        }

        public final K lower(K k) {
            return mo34321a().lowerKey(k);
        }

        C17679e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        public final NavigableSet<K> headSet(K k, boolean z) {
            return new C17679e(mo34321a().headMap(k, z));
        }

        public final NavigableSet<K> tailSet(K k, boolean z) {
            return new C17679e(mo34321a().tailMap(k, z));
        }

        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C17679e(mo34321a().subMap(k, z, k2, z2));
        }
    }

    /* renamed from: com.google.b.c.d$f */
    class C17680f extends C17685j implements RandomAccess {
        C17680f(K k, List<V> list, C17683i iVar) {
            super(k, list, iVar);
        }
    }

    /* renamed from: com.google.b.c.d$g */
    class C17681g extends C17672a implements SortedMap<K, Collection<V>> {

        /* renamed from: d */
        SortedSet<K> f49382d;

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public SortedMap<K, Collection<V>> mo34301d() {
            return (SortedMap) this.f49364a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public SortedSet<K> mo34181e() {
            return new C17682h(mo34301d());
        }

        /* renamed from: c */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f49382d;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> b = mo34181e();
            this.f49382d = b;
            return b;
        }

        public Comparator<? super K> comparator() {
            return mo34301d().comparator();
        }

        public K firstKey() {
            return mo34301d().firstKey();
        }

        public K lastKey() {
            return mo34301d().lastKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C17681g(mo34301d().headMap(k));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C17681g(mo34301d().tailMap(k));
        }

        C17681g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C17681g(mo34301d().subMap(k, k2));
        }
    }

    /* renamed from: com.google.b.c.d$h */
    class C17682h extends C17676c implements SortedSet<K> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public SortedMap<K, Collection<V>> mo34321a() {
            return (SortedMap) super.mo34165b();
        }

        public Comparator<? super K> comparator() {
            return mo34321a().comparator();
        }

        public K first() {
            return mo34321a().firstKey();
        }

        public K last() {
            return mo34321a().lastKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C17682h(mo34321a().headMap(k));
        }

        public SortedSet<K> tailSet(K k) {
            return new C17682h(mo34321a().tailMap(k));
        }

        C17682h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C17682h(mo34321a().subMap(k, k2));
        }
    }

    /* renamed from: com.google.b.c.d$i */
    class C17683i extends AbstractCollection<V> {

        /* renamed from: b */
        public final K f49385b;

        /* renamed from: c */
        public Collection<V> f49386c;

        /* renamed from: d */
        public final C17683i f49387d;

        /* renamed from: e */
        final Collection<V> f49388e;

        /* renamed from: com.google.b.c.d$i$a */
        class C17684a implements Iterator<V> {

            /* renamed from: a */
            final Iterator<V> f49390a;

            /* renamed from: b */
            final Collection<V> f49391b = C17683i.this.f49386c;

            public boolean hasNext() {
                mo34358a();
                return this.f49390a.hasNext();
            }

            public V next() {
                mo34358a();
                return this.f49390a.next();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo34358a() {
                C17683i.this.mo34342a();
                if (C17683i.this.f49386c != this.f49391b) {
                    throw new ConcurrentModificationException();
                }
            }

            public void remove() {
                this.f49390a.remove();
                C17669d.this.f49361b--;
                C17683i.this.mo34345b();
            }

            C17684a() {
                Iterator<V> it;
                Collection<V> collection = C17683i.this.f49386c;
                if (collection instanceof List) {
                    it = ((List) collection).listIterator();
                } else {
                    it = collection.iterator();
                }
                this.f49390a = it;
            }

            C17684a(Iterator<V> it) {
                this.f49390a = it;
            }
        }

        public int hashCode() {
            mo34342a();
            return this.f49386c.hashCode();
        }

        public Iterator<V> iterator() {
            mo34342a();
            return new C17684a();
        }

        public int size() {
            mo34342a();
            return this.f49386c.size();
        }

        public String toString() {
            mo34342a();
            return this.f49386c.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo34345b() {
            if (this.f49387d != null) {
                this.f49387d.mo34345b();
                return;
            }
            if (this.f49386c.isEmpty()) {
                C17669d.this.f49360a.remove(this.f49385b);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo34346c() {
            if (this.f49387d != null) {
                this.f49387d.mo34346c();
            } else {
                C17669d.this.f49360a.put(this.f49385b, this.f49386c);
            }
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f49386c.clear();
                C17669d.this.f49361b -= size;
                mo34345b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo34342a() {
            if (this.f49387d != null) {
                this.f49387d.mo34342a();
                if (this.f49387d.f49386c != this.f49388e) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f49386c.isEmpty()) {
                Collection<V> collection = (Collection) C17669d.this.f49360a.get(this.f49385b);
                if (collection != null) {
                    this.f49386c = collection;
                }
            }
        }

        public boolean contains(Object obj) {
            mo34342a();
            return this.f49386c.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            mo34342a();
            return this.f49386c.containsAll(collection);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            mo34342a();
            return this.f49386c.equals(obj);
        }

        public boolean add(V v) {
            mo34342a();
            boolean isEmpty = this.f49386c.isEmpty();
            boolean add = this.f49386c.add(v);
            if (add) {
                C17669d.this.f49361b++;
                if (isEmpty) {
                    mo34346c();
                }
            }
            return add;
        }

        public boolean remove(Object obj) {
            mo34342a();
            boolean remove = this.f49386c.remove(obj);
            if (remove) {
                C17669d.this.f49361b--;
                mo34345b();
            }
            return remove;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f49386c.addAll(collection);
            if (addAll) {
                int size2 = this.f49386c.size();
                C17669d.this.f49361b += size2 - size;
                if (size == 0) {
                    mo34346c();
                }
            }
            return addAll;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f49386c.removeAll(collection);
            if (removeAll) {
                int size2 = this.f49386c.size();
                C17669d.this.f49361b += size2 - size;
                mo34345b();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            C17421k.m42653a(collection);
            int size = size();
            boolean retainAll = this.f49386c.retainAll(collection);
            if (retainAll) {
                int size2 = this.f49386c.size();
                C17669d.this.f49361b += size2 - size;
                mo34345b();
            }
            return retainAll;
        }

        C17683i(K k, Collection<V> collection, C17683i iVar) {
            Collection<V> collection2;
            this.f49385b = k;
            this.f49386c = collection;
            this.f49387d = iVar;
            if (iVar == null) {
                collection2 = null;
            } else {
                collection2 = iVar.f49386c;
            }
            this.f49388e = collection2;
        }
    }

    /* renamed from: com.google.b.c.d$j */
    class C17685j extends C17683i implements List<V> {

        /* renamed from: com.google.b.c.d$j$a */
        class C17686a extends a implements ListIterator<V> {
            /* JADX WARNING: type inference failed for: r1v0, types: [com.google.b.c.d$i$a, com.google.b.c.d$j$a] */
            /* renamed from: b */
            private ListIterator<V> m43462b() {
                mo34358a();
                return (ListIterator) this.f49390a;
            }

            public final boolean hasPrevious() {
                return m43462b().hasPrevious();
            }

            public final int nextIndex() {
                return m43462b().nextIndex();
            }

            public final V previous() {
                return m43462b().previous();
            }

            public final int previousIndex() {
                return m43462b().previousIndex();
            }

            C17686a() {
                super();
            }

            public final void set(V v) {
                m43462b().set(v);
            }

            public final void add(V v) {
                boolean isEmpty = C17685j.this.isEmpty();
                m43462b().add(v);
                C17669d.this.f49361b++;
                if (isEmpty) {
                    C17685j.this.mo34346c();
                }
            }

            public C17686a(int i) {
                super(C17685j.this.mo34364d().listIterator(i));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final List<V> mo34364d() {
            return (List) this.f49386c;
        }

        public ListIterator<V> listIterator() {
            mo34342a();
            return new C17686a();
        }

        public V get(int i) {
            mo34342a();
            return mo34364d().get(i);
        }

        public int indexOf(Object obj) {
            mo34342a();
            return mo34364d().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            mo34342a();
            return mo34364d().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator(int i) {
            mo34342a();
            return new C17686a(i);
        }

        public V remove(int i) {
            mo34342a();
            V remove = mo34364d().remove(i);
            C17669d.this.f49361b--;
            mo34345b();
            return remove;
        }

        public V set(int i, V v) {
            mo34342a();
            return mo34364d().set(i, v);
        }

        public void add(int i, V v) {
            mo34342a();
            boolean isEmpty = this.f49386c.isEmpty();
            mo34364d().add(i, v);
            C17669d.this.f49361b++;
            if (isEmpty) {
                mo34346c();
            }
        }

        public List<V> subList(int i, int i2) {
            C17683i iVar;
            mo34342a();
            C17669d dVar = C17669d.this;
            K k = this.f49385b;
            List subList = mo34364d().subList(i, i2);
            if (this.f49387d == null) {
                iVar = this;
            } else {
                iVar = this.f49387d;
            }
            return dVar.mo34273a(k, subList, iVar);
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = mo34364d().addAll(i, collection);
            if (addAll) {
                int size2 = this.f49386c.size();
                C17669d.this.f49361b += size2 - size;
                if (size == 0) {
                    mo34346c();
                }
            }
            return addAll;
        }

        C17685j(K k, List<V> list, C17683i iVar) {
            super(k, list, iVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract Collection<V> mo34190b();

    public int size() {
        return this.f49361b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Set<K> mo34048d() {
        return new C17676c(this.f49360a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Collection<V> mo34049e() {
        return new C17692c();
    }

    public Collection<Entry<K, V>> entries() {
        return super.entries();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final Iterator<V> mo34052f() {
        return new C17675b<V>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final V mo34274a(K k, V v) {
                return v;
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final C17624aw<K> mo34053g() {
        return new C17621c(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final Iterator<Entry<K, V>> mo34056i() {
        return new C17675b<Entry<K, V>>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo34274a(Object obj, Object obj2) {
                return C17598as.m43284a(obj, obj2);
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public Map<K, Collection<V>> mo34058j() {
        return new C17672a(this.f49360a);
    }

    public Collection<V> values() {
        return super.values();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Collection<V> mo34272c() {
        return mo34271a(mo34190b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final Collection<Entry<K, V>> mo34054h() {
        if (this instanceof C17657bl) {
            return new C17691b();
        }
        return new C17690a();
    }

    public void clear() {
        for (Collection clear : this.f49360a.values()) {
            clear.clear();
        }
        this.f49360a.clear();
        this.f49361b = 0;
    }

    /* renamed from: a */
    private Collection<V> m43423a(K k) {
        return mo34190b();
    }

    public boolean containsKey(Object obj) {
        return this.f49360a.containsKey(obj);
    }

    protected C17669d(Map<K, Collection<V>> map) {
        C17421k.m42659a(map.isEmpty());
        this.f49360a = map;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <E> Collection<E> mo34271a(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public Collection<V> get(K k) {
        Collection collection = (Collection) this.f49360a.get(k);
        if (collection == null) {
            collection = m43423a(k);
        }
        return mo34270a(k, collection);
    }

    public Collection<V> removeAll(Object obj) {
        Collection collection = (Collection) this.f49360a.remove(obj);
        if (collection == null) {
            return mo34272c();
        }
        Collection b = mo34190b();
        b.addAll(collection);
        this.f49361b -= collection.size();
        collection.clear();
        return mo34271a(b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Collection<V> mo34270a(K k, Collection<V> collection) {
        return new C17683i(k, collection, null);
    }

    public boolean put(K k, V v) {
        Collection collection = (Collection) this.f49360a.get(k);
        if (collection == null) {
            Collection a = m43423a(k);
            if (a.add(v)) {
                this.f49361b++;
                this.f49360a.put(k, a);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f49361b++;
            return true;
        }
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k);
        }
        Collection collection = (Collection) this.f49360a.get(k);
        if (collection == null) {
            collection = m43423a(k);
            this.f49360a.put(k, collection);
        }
        Collection b = mo34190b();
        b.addAll(collection);
        this.f49361b -= collection.size();
        collection.clear();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                this.f49361b++;
            }
        }
        return mo34271a(b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final List<V> mo34273a(K k, List<V> list, C17683i iVar) {
        if (list instanceof RandomAccess) {
            return new C17680f(k, list, iVar);
        }
        return new C17685j(k, list, iVar);
    }
}
