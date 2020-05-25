package com.twitter.sdk.android.core.internal.scribe;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.e */
public final class C52158e {
    @C17952c(mo34828a = "client")

    /* renamed from: a */
    public final String f129825a;
    @C17952c(mo34828a = "page")

    /* renamed from: b */
    public final String f129826b;
    @C17952c(mo34828a = "section")

    /* renamed from: c */
    public final String f129827c;
    @C17952c(mo34828a = "component")

    /* renamed from: d */
    public final String f129828d;
    @C17952c(mo34828a = "element")

    /* renamed from: e */
    public final String f129829e;
    @C17952c(mo34828a = "action")

    /* renamed from: f */
    public final String f129830f;

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.e$a */
    public static class C52159a {

        /* renamed from: a */
        private String f129831a;

        /* renamed from: b */
        private String f129832b;

        /* renamed from: c */
        private String f129833c;

        /* renamed from: d */
        private String f129834d;

        /* renamed from: e */
        private String f129835e;

        /* renamed from: f */
        private String f129836f;

        /* renamed from: a */
        public final C52158e mo108874a() {
            C52158e eVar = new C52158e(this.f129831a, this.f129832b, this.f129833c, this.f129834d, this.f129835e, this.f129836f);
            return eVar;
        }

        /* renamed from: a */
        public final C52159a mo108873a(String str) {
            this.f129831a = str;
            return this;
        }

        /* renamed from: b */
        public final C52159a mo108875b(String str) {
            this.f129832b = str;
            return this;
        }

        /* renamed from: c */
        public final C52159a mo108876c(String str) {
            this.f129833c = str;
            return this;
        }

        /* renamed from: d */
        public final C52159a mo108877d(String str) {
            this.f129834d = str;
            return this;
        }

        /* renamed from: e */
        public final C52159a mo108878e(String str) {
            this.f129835e = str;
            return this;
        }

        /* renamed from: f */
        public final C52159a mo108879f(String str) {
            this.f129836f = str;
            return this;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (this.f129825a != null) {
            i = this.f129825a.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        if (this.f129826b != null) {
            i2 = this.f129826b.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        if (this.f129827c != null) {
            i3 = this.f129827c.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        if (this.f129828d != null) {
            i4 = this.f129828d.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        if (this.f129829e != null) {
            i5 = this.f129829e.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        if (this.f129830f != null) {
            i6 = this.f129830f.hashCode();
        }
        return i11 + i6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("client=");
        sb.append(this.f129825a);
        sb.append(", page=");
        sb.append(this.f129826b);
        sb.append(", section=");
        sb.append(this.f129827c);
        sb.append(", component=");
        sb.append(this.f129828d);
        sb.append(", element=");
        sb.append(this.f129829e);
        sb.append(", action=");
        sb.append(this.f129830f);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C52158e eVar = (C52158e) obj;
        if (this.f129830f == null ? eVar.f129830f != null : !this.f129830f.equals(eVar.f129830f)) {
            return false;
        }
        if (this.f129825a == null ? eVar.f129825a != null : !this.f129825a.equals(eVar.f129825a)) {
            return false;
        }
        if (this.f129828d == null ? eVar.f129828d != null : !this.f129828d.equals(eVar.f129828d)) {
            return false;
        }
        if (this.f129829e == null ? eVar.f129829e != null : !this.f129829e.equals(eVar.f129829e)) {
            return false;
        }
        if (this.f129826b == null ? eVar.f129826b != null : !this.f129826b.equals(eVar.f129826b)) {
            return false;
        }
        if (this.f129827c == null ? eVar.f129827c == null : this.f129827c.equals(eVar.f129827c)) {
            return true;
        }
        return false;
    }

    public C52158e(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f129825a = str;
        this.f129826b = str2;
        this.f129827c = str3;
        this.f129828d = str4;
        this.f129829e = str5;
        this.f129830f = str6;
    }
}
