package com.bytedance.ttnet.hostmonitor;

/* renamed from: com.bytedance.ttnet.hostmonitor.c */
public final class C13348c {

    /* renamed from: a */
    public final String f34826a;

    /* renamed from: b */
    public final int f34827b;

    public final int hashCode() {
        return (this.f34826a.hashCode() * 31) + this.f34827b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13348c cVar = (C13348c) obj;
        if (this.f34827b != cVar.f34827b || !this.f34826a.equals(cVar.f34826a)) {
            return false;
        }
        return true;
    }

    public C13348c(String str, int i) {
        this.f34826a = str;
        this.f34827b = i;
    }
}
