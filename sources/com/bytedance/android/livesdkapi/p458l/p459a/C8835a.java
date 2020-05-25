package com.bytedance.android.livesdkapi.p458l.p459a;

import com.bytedance.android.livesdkapi.p458l.C8840b;

/* renamed from: com.bytedance.android.livesdkapi.l.a.a */
public final class C8835a implements C8837c, Cloneable {

    /* renamed from: a */
    private final String f24119a;

    /* renamed from: b */
    private final String f24120b;

    /* renamed from: a */
    public final String mo15816a() {
        return this.f24119a;
    }

    /* renamed from: b */
    public final String mo15817b() {
        return this.f24120b;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final int hashCode() {
        return C8840b.m17357a(C8840b.m17357a(17, this.f24119a), this.f24120b);
    }

    public final String toString() {
        int length = this.f24119a.length();
        if (this.f24120b != null) {
            length += this.f24120b.length() + 1;
        }
        C8836b bVar = new C8836b(length);
        bVar.mo15822a(this.f24119a);
        if (this.f24120b != null) {
            bVar.mo15822a("=");
            bVar.mo15822a(this.f24120b);
        }
        return bVar.toString();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8837c)) {
            return false;
        }
        C8835a aVar = (C8835a) obj;
        if (this.f24119a.equals(aVar.f24119a)) {
            String str = this.f24120b;
            String str2 = aVar.f24120b;
            if (str != null) {
                z = str.equals(str2);
            } else if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public C8835a(String str, String str2) {
        if (str != null) {
            this.f24119a = str;
            this.f24120b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
