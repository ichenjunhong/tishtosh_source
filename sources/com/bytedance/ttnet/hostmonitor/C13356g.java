package com.bytedance.ttnet.hostmonitor;

/* renamed from: com.bytedance.ttnet.hostmonitor.g */
public final class C13356g {

    /* renamed from: a */
    public boolean f34839a;

    /* renamed from: b */
    public C13346a f34840b;

    public C13356g() {
        this.f34839a = true;
        this.f34840b = C13346a.NONE;
    }

    public final int hashCode() {
        return ((this.f34839a ? 1 : 0) * true) + this.f34840b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13356g gVar = (C13356g) obj;
        if (this.f34839a == gVar.f34839a && this.f34840b == gVar.f34840b) {
            return true;
        }
        return false;
    }

    public C13356g(boolean z, C13346a aVar) {
        this.f34839a = z;
        this.f34840b = aVar;
    }
}
