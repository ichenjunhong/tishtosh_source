package com.google.p997a.p998a.p1020g;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.a.a.g.j */
public class C14806j extends AbstractMap<String, Object> implements Cloneable {

    /* renamed from: h */
    public Map<String, Object> f38358h;

    /* renamed from: i */
    public final C14795d f38359i;

    /* renamed from: com.google.a.a.g.j$a */
    final class C14807a implements Iterator<Entry<String, Object>> {

        /* renamed from: b */
        private boolean f38361b;

        /* renamed from: c */
        private final Iterator<Entry<String, Object>> f38362c;

        /* renamed from: d */
        private final Iterator<Entry<String, Object>> f38363d;

        public final void remove() {
            if (this.f38361b) {
                this.f38363d.remove();
            }
            this.f38362c.remove();
        }

        public final boolean hasNext() {
            if (this.f38362c.hasNext() || this.f38363d.hasNext()) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ Object next() {
            if (!this.f38361b) {
                if (this.f38362c.hasNext()) {
                    return (Entry) this.f38362c.next();
                }
                this.f38361b = true;
            }
            return (Entry) this.f38363d.next();
        }

        C14807a(C14803c cVar) {
            this.f38362c = cVar.iterator();
            this.f38363d = C14806j.this.f38358h.entrySet().iterator();
        }
    }

    /* renamed from: com.google.a.a.g.j$b */
    final class C14808b extends AbstractSet<Entry<String, Object>> {

        /* renamed from: b */
        private final C14803c f38365b;

        public final void clear() {
            C14806j.this.f38358h.clear();
            this.f38365b.clear();
        }

        public final Iterator<Entry<String, Object>> iterator() {
            return new C14807a(this.f38365b);
        }

        public final int size() {
            return C14806j.this.f38358h.size() + this.f38365b.size();
        }

        C14808b() {
            this.f38365b = new C14800g(C14806j.this, C14806j.this.f38359i.f38318b).entrySet();
        }
    }

    /* renamed from: com.google.a.a.g.j$c */
    public enum C14809c {
        IGNORE_CASE
    }

    public Set<Entry<String, Object>> entrySet() {
        return new C14808b();
    }

    public C14806j() {
        this(EnumSet.noneOf(C14809c.class));
    }

    /* renamed from: b */
    public C14806j clone() {
        try {
            C14806j jVar = (C14806j) super.clone();
            C14799f.m30265a((Object) this, (Object) jVar);
            jVar.f38358h = (Map) C14799f.m30269c(this.f38358h);
            return jVar;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public C14806j(EnumSet<C14809c> enumSet) {
        this.f38358h = C14782a.m30235a();
        this.f38359i = C14795d.m30257a(getClass(), enumSet.contains(C14809c.IGNORE_CASE));
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        C14805i a = this.f38359i.mo27115a(str);
        if (a != null) {
            return a.mo27144a((Object) this);
        }
        if (this.f38359i.f38318b) {
            str = str.toLowerCase();
        }
        return this.f38358h.get(str);
    }

    public final void putAll(Map<? extends String, ?> map) {
        for (Entry entry : map.entrySet()) {
            mo27048b((String) entry.getKey(), entry.getValue());
        }
    }

    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.f38359i.mo27115a(str) == null) {
            if (this.f38359i.f38318b) {
                str = str.toLowerCase();
            }
            return this.f38358h.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object put(String str, Object obj) {
        C14805i a = this.f38359i.mo27115a(str);
        if (a != null) {
            Object a2 = a.mo27144a((Object) this);
            a.mo27145a((Object) this, obj);
            return a2;
        }
        if (this.f38359i.f38318b) {
            str = str.toLowerCase();
        }
        return this.f38358h.put(str, obj);
    }

    /* renamed from: b */
    public C14806j mo27048b(String str, Object obj) {
        C14805i a = this.f38359i.mo27115a(str);
        if (a != null) {
            a.mo27145a((Object) this, obj);
        } else {
            if (this.f38359i.f38318b) {
                str = str.toLowerCase();
            }
            this.f38358h.put(str, obj);
        }
        return this;
    }
}
