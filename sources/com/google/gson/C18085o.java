package com.google.gson;

import com.google.gson.internal.C18061g;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.gson.o */
public final class C18085o extends C18082l {

    /* renamed from: a */
    private final C18061g<String, C18082l> f50145a = new C18061g<>();

    /* renamed from: a */
    public final Set<Entry<String, C18082l>> mo35016a() {
        return this.f50145a.entrySet();
    }

    public final int hashCode() {
        return this.f50145a.hashCode();
    }

    /* renamed from: q */
    public final int mo35028q() {
        return this.f50145a.size();
    }

    /* renamed from: a */
    private static C18082l m44292a(Object obj) {
        if (obj == null) {
            return C18084n.f50144a;
        }
        return new C18088r(obj);
    }

    /* renamed from: b */
    public final C18082l mo35022b(String str) {
        return (C18082l) this.f50145a.get(str);
    }

    /* renamed from: c */
    public final C18088r mo35023c(String str) {
        return (C18088r) this.f50145a.get(str);
    }

    /* renamed from: d */
    public final C17980i mo35024d(String str) {
        return (C17980i) this.f50145a.get(str);
    }

    /* renamed from: e */
    public final C18085o mo35025e(String str) {
        return (C18085o) this.f50145a.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof C18085o) && ((C18085o) obj).f50145a.equals(this.f50145a))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo35021a(String str) {
        return this.f50145a.containsKey(str);
    }

    /* renamed from: a */
    public final void mo35017a(String str, C18082l lVar) {
        if (lVar == null) {
            lVar = C18084n.f50144a;
        }
        this.f50145a.put(str, lVar);
    }

    /* renamed from: a */
    public final void mo35018a(String str, Boolean bool) {
        mo35017a(str, m44292a((Object) bool));
    }

    /* renamed from: a */
    public final void mo35019a(String str, Number number) {
        mo35017a(str, m44292a((Object) number));
    }

    /* renamed from: a */
    public final void mo35020a(String str, String str2) {
        mo35017a(str, m44292a((Object) str2));
    }
}
