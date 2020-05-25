package com.google.p997a.p998a.p1020g;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.a.a.g.b */
public final class C14792b {

    /* renamed from: a */
    public final Map<Field, C14793a> f38308a = C14782a.m30235a();

    /* renamed from: b */
    private final Map<String, C14793a> f38309b = C14782a.m30235a();

    /* renamed from: c */
    private final Object f38310c;

    /* renamed from: com.google.a.a.g.b$a */
    public static class C14793a {

        /* renamed from: a */
        public final Class<?> f38311a;

        /* renamed from: b */
        public final ArrayList<Object> f38312b = new ArrayList<>();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Object mo27114a() {
            return C14816q.m30298a((Collection<?>) this.f38312b, this.f38311a);
        }

        public C14793a(Class<?> cls) {
            this.f38311a = cls;
        }
    }

    /* renamed from: a */
    public final void mo27113a() {
        for (Entry entry : this.f38309b.entrySet()) {
            ((Map) this.f38310c).put(entry.getKey(), ((C14793a) entry.getValue()).mo27114a());
        }
        for (Entry entry2 : this.f38308a.entrySet()) {
            C14805i.m30277a((Field) entry2.getKey(), this.f38310c, ((C14793a) entry2.getValue()).mo27114a());
        }
    }

    public C14792b(Object obj) {
        this.f38310c = obj;
    }
}
