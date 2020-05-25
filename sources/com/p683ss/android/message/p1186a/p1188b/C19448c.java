package com.p683ss.android.message.p1186a.p1188b;

/* renamed from: com.ss.android.message.a.b.c */
public final class C19448c {

    /* renamed from: a */
    public final C19447b f53766a;

    /* renamed from: b */
    public final C19447b f53767b;

    public final int hashCode() {
        return this.f53766a.hashCode() + this.f53767b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C19448c)) {
            return false;
        }
        C19448c cVar = (C19448c) obj;
        if (this.f53767b == cVar.f53767b && this.f53766a == cVar.f53766a) {
            return true;
        }
        return false;
    }

    public C19448c(C19447b bVar, C19447b bVar2) throws IllegalArgumentException {
        if (bVar != bVar2) {
            this.f53766a = bVar;
            this.f53767b = bVar2;
            return;
        }
        StringBuilder sb = new StringBuilder("Attempted to create an connection state update where both previous and current state are: ");
        sb.append(bVar2);
        throw new IllegalArgumentException(sb.toString());
    }
}
