package com.google.p997a.p998a.p1020g;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

/* renamed from: com.google.a.a.g.g */
final class C14800g extends AbstractMap<String, Object> {

    /* renamed from: a */
    final Object f38336a;

    /* renamed from: b */
    final C14795d f38337b;

    /* renamed from: com.google.a.a.g.g$a */
    final class C14801a implements Entry<String, Object> {

        /* renamed from: b */
        private Object f38339b;

        /* renamed from: c */
        private final C14805i f38340c;

        public final Object getValue() {
            return this.f38339b;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String getKey() {
            String str = this.f38340c.f38357c;
            if (C14800g.this.f38337b.f38318b) {
                return str.toLowerCase();
            }
            return str;
        }

        public final int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        public final Object setValue(Object obj) {
            Object obj2 = this.f38339b;
            this.f38339b = C14814o.m30287a(obj);
            this.f38340c.mo27145a(C14800g.this.f38336a, obj);
            return obj2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!getKey().equals(entry.getKey()) || !getValue().equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        C14801a(C14805i iVar, Object obj) {
            this.f38340c = iVar;
            this.f38339b = C14814o.m30287a(obj);
        }
    }

    /* renamed from: com.google.a.a.g.g$b */
    final class C14802b implements Iterator<Entry<String, Object>> {

        /* renamed from: b */
        private int f38342b = -1;

        /* renamed from: c */
        private C14805i f38343c;

        /* renamed from: d */
        private Object f38344d;

        /* renamed from: e */
        private boolean f38345e;

        /* renamed from: f */
        private boolean f38346f;

        /* renamed from: g */
        private C14805i f38347g;

        public final /* synthetic */ Object next() {
            if (hasNext()) {
                this.f38347g = this.f38343c;
                Object obj = this.f38344d;
                this.f38346f = false;
                this.f38345e = false;
                this.f38343c = null;
                this.f38344d = null;
                return new C14801a(this.f38347g, obj);
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            boolean z;
            if (this.f38347g == null || this.f38345e) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f38345e = true;
                this.f38347g.mo27145a(C14800g.this.f38336a, (Object) null);
                return;
            }
            throw new IllegalStateException();
        }

        public final boolean hasNext() {
            if (!this.f38346f) {
                this.f38346f = true;
                this.f38344d = null;
                while (this.f38344d == null) {
                    int i = this.f38342b + 1;
                    this.f38342b = i;
                    if (i >= C14800g.this.f38337b.f38319c.size()) {
                        break;
                    }
                    this.f38343c = C14800g.this.f38337b.mo27115a((String) C14800g.this.f38337b.f38319c.get(this.f38342b));
                    this.f38344d = this.f38343c.mo27144a(C14800g.this.f38336a);
                }
            }
            if (this.f38344d != null) {
                return true;
            }
            return false;
        }

        C14802b() {
        }
    }

    /* renamed from: com.google.a.a.g.g$c */
    final class C14803c extends AbstractSet<Entry<String, Object>> {
        /* renamed from: a */
        public final C14802b iterator() {
            return new C14802b();
        }

        public final void clear() {
            for (String a : C14800g.this.f38337b.f38319c) {
                C14800g.this.f38337b.mo27115a(a).mo27145a(C14800g.this.f38336a, (Object) null);
            }
        }

        public final boolean isEmpty() {
            for (String a : C14800g.this.f38337b.f38319c) {
                if (C14800g.this.f38337b.mo27115a(a).mo27144a(C14800g.this.f38336a) != null) {
                    return false;
                }
            }
            return true;
        }

        public final int size() {
            int i = 0;
            for (String a : C14800g.this.f38337b.f38319c) {
                if (C14800g.this.f38337b.mo27115a(a).mo27144a(C14800g.this.f38336a) != null) {
                    i++;
                }
            }
            return i;
        }

        C14803c() {
        }
    }

    /* renamed from: a */
    public final C14803c entrySet() {
        return new C14803c();
    }

    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        C14805i a = this.f38337b.mo27115a((String) obj);
        if (a == null) {
            return null;
        }
        return a.mo27144a(this.f38336a);
    }

    C14800g(Object obj, boolean z) {
        this.f38336a = obj;
        this.f38337b = C14795d.m30257a(obj.getClass(), z);
        C14814o.m30289a(!this.f38337b.f38317a.isEnum());
    }

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        String str;
        String str2 = (String) obj;
        C14805i a = this.f38337b.mo27115a(str2);
        String str3 = "no field of key ";
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = str3.concat(valueOf);
        } else {
            str = new String(str3);
        }
        C14814o.m30288a(a, (Object) str);
        Object a2 = a.mo27144a(this.f38336a);
        a.mo27145a(this.f38336a, C14814o.m30287a(obj2));
        return a2;
    }
}
