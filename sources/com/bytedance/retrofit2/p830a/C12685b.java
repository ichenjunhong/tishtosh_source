package com.bytedance.retrofit2.p830a;

/* renamed from: com.bytedance.retrofit2.a.b */
public final class C12685b {

    /* renamed from: a */
    public final String f33318a;

    /* renamed from: b */
    public final String f33319b;

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f33318a != null) {
            i = this.f33318a.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.f33319b != null) {
            i2 = this.f33319b.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.f33318a != null) {
            str = this.f33318a;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(": ");
        if (this.f33319b != null) {
            str2 = this.f33319b;
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12685b bVar = (C12685b) obj;
        if (this.f33318a == null ? bVar.f33318a != null : !this.f33318a.equals(bVar.f33318a)) {
            return false;
        }
        if (this.f33319b == null ? bVar.f33319b == null : this.f33319b.equals(bVar.f33319b)) {
            return true;
        }
        return false;
    }

    public C12685b(String str, String str2) {
        this.f33318a = str;
        this.f33319b = str2;
    }
}
