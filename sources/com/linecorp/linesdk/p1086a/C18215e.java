package com.linecorp.linesdk.p1086a;

import java.util.Collections;
import java.util.List;

/* renamed from: com.linecorp.linesdk.a.e */
public final class C18215e {

    /* renamed from: a */
    public final C18214d f50275a;

    /* renamed from: b */
    public final List<String> f50276b;

    public final int hashCode() {
        return (this.f50275a.hashCode() * 31) + this.f50276b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IssueAccessTokenResult{accessToken=");
        sb.append("#####");
        sb.append(", permissions=");
        sb.append(this.f50276b);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18215e eVar = (C18215e) obj;
        if (!this.f50275a.equals(eVar.f50275a)) {
            return false;
        }
        return this.f50276b.equals(eVar.f50276b);
    }

    public C18215e(C18214d dVar, List<String> list) {
        this.f50275a = dVar;
        this.f50276b = Collections.unmodifiableList(list);
    }
}
