package com.facebook.p909a;

import com.facebook.AccessToken;
import com.facebook.C14533n;
import com.facebook.internal.C14277aa;
import java.io.Serializable;

/* renamed from: com.facebook.a.a */
final class C13509a implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    final String f35258a;

    /* renamed from: b */
    private final String f35259b;

    /* renamed from: com.facebook.a.a$a */
    static class C13511a implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: a */
        private final String f35260a;

        /* renamed from: b */
        private final String f35261b;

        private Object readResolve() {
            return new C13509a(this.f35260a, this.f35261b);
        }

        private C13511a(String str, String str2) {
            this.f35260a = str;
            this.f35261b = str2;
        }
    }

    /* renamed from: a */
    public final String mo25337a() {
        return this.f35259b;
    }

    private Object writeReplace() {
        return new C13511a(this.f35258a, this.f35259b);
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f35258a == null) {
            i = 0;
        } else {
            i = this.f35258a.hashCode();
        }
        if (this.f35259b != null) {
            i2 = this.f35259b.hashCode();
        }
        return i ^ i2;
    }

    public C13509a(AccessToken accessToken) {
        this(accessToken.f35176e, C14533n.m29777k());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13509a)) {
            return false;
        }
        C13509a aVar = (C13509a) obj;
        if (!C14277aa.m29275a(aVar.f35258a, this.f35258a) || !C14277aa.m29275a(aVar.f35259b, this.f35259b)) {
            return false;
        }
        return true;
    }

    public C13509a(String str, String str2) {
        if (C14277aa.m29276a(str)) {
            str = null;
        }
        this.f35258a = str;
        this.f35259b = str2;
    }
}
