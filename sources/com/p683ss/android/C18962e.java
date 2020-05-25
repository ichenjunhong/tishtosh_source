package com.p683ss.android;

/* renamed from: com.ss.android.e */
public final class C18962e {

    /* renamed from: a */
    public final String f52255a;

    /* renamed from: b */
    public final String f52256b;

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f52255a != null) {
            i = this.f52255a.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.f52256b != null) {
            i2 = this.f52256b.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.f52255a != null) {
            str = this.f52255a;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(": ");
        if (this.f52256b != null) {
            str2 = this.f52256b;
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
        C18962e eVar = (C18962e) obj;
        if (this.f52255a == null ? eVar.f52255a != null : !this.f52255a.equals(eVar.f52255a)) {
            return false;
        }
        if (this.f52256b == null ? eVar.f52256b == null : this.f52256b.equals(eVar.f52256b)) {
            return true;
        }
        return false;
    }

    public C18962e(String str, String str2) {
        this.f52255a = str;
        this.f52256b = str2;
    }
}
