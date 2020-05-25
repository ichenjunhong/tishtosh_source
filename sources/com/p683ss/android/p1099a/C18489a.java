package com.p683ss.android.p1099a;

/* renamed from: com.ss.android.a.a */
public final class C18489a implements Comparable<C18489a> {

    /* renamed from: a */
    public long f50915a;

    /* renamed from: b */
    public String f50916b;

    /* renamed from: c */
    public long f50917c;

    /* renamed from: d */
    public String f50918d;

    /* renamed from: e */
    public int f50919e;

    /* renamed from: f */
    public int f50920f;

    public final int hashCode() {
        return Long.valueOf(this.f50915a).hashCode();
    }

    public C18489a(long j) {
        this.f50915a = j;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C18489a aVar = (C18489a) obj;
        if (this.f50917c > aVar.f50917c) {
            return -1;
        }
        if (this.f50917c < aVar.f50917c) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18489a) || obj == null || this.f50915a != ((C18489a) obj).f50915a) {
            return false;
        }
        return true;
    }
}
