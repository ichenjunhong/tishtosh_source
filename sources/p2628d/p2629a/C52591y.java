package p2628d.p2629a;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.a.y */
final class C52591y implements C52695a, Serializable, Map {

    /* renamed from: a */
    public static final C52591y f130883a = new C52591y();
    private static final long serialVersionUID = 8246714829545688274L;

    private C52591y() {
    }

    private final Object readResolve() {
        return f130883a;
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ Object get(Object obj) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    public final /* bridge */ Set<Entry> entrySet() {
        return C52592z.INSTANCE;
    }

    public final /* bridge */ Set<Object> keySet() {
        return C52592z.INSTANCE;
    }

    public final /* bridge */ Collection values() {
        return C52590x.INSTANCE;
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        C52711k.m112240b((Void) obj, "value");
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map) || !((Map) obj).isEmpty()) {
            return false;
        }
        return true;
    }
}
