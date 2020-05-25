package com.facebook.imagepipeline.common;

import android.graphics.Bitmap.Config;
import com.C2240a;
import com.facebook.imagepipeline.p967g.C14030c;
import com.facebook.imagepipeline.p978r.C14249a;

/* renamed from: com.facebook.imagepipeline.common.b */
public final class C13950b {

    /* renamed from: l */
    private static final C13950b f36385l = m28427b().mo26114a();

    /* renamed from: a */
    public final int f36386a;

    /* renamed from: b */
    public final boolean f36387b;

    /* renamed from: c */
    public final int f36388c;

    /* renamed from: d */
    public final boolean f36389d;

    /* renamed from: e */
    public final boolean f36390e;

    /* renamed from: f */
    public final boolean f36391f;

    /* renamed from: g */
    public final boolean f36392g;

    /* renamed from: h */
    public final Config f36393h;

    /* renamed from: i */
    public final C14030c f36394i;

    /* renamed from: j */
    public final C14249a f36395j;

    /* renamed from: k */
    public final Object f36396k;

    /* renamed from: a */
    public static C13950b m28426a() {
        return f36385l;
    }

    /* renamed from: b */
    public static ImageDecodeOptionsBuilder m28427b() {
        return new ImageDecodeOptionsBuilder();
    }

    public final int hashCode() {
        int i;
        int ordinal = ((((((((((((this.f36386a * 31) + (this.f36387b ? 1 : 0)) * 31) + (this.f36389d ? 1 : 0)) * 31) + (this.f36390e ? 1 : 0)) * 31) + (this.f36391f ? 1 : 0)) * 31) + (this.f36392g ? 1 : 0)) * 31) + this.f36393h.ordinal()) * 31;
        int i2 = 0;
        if (this.f36394i != null) {
            i = this.f36394i.hashCode();
        } else {
            i = 0;
        }
        int i3 = (ordinal + i) * 31;
        if (this.f36395j != null) {
            i2 = this.f36395j.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return C2240a.m6773a(null, "%d-%b-%b-%b-%b-%b-%s-%s-%s", new Object[]{Integer.valueOf(this.f36386a), Boolean.valueOf(this.f36387b), Boolean.valueOf(this.f36389d), Boolean.valueOf(this.f36390e), Boolean.valueOf(this.f36391f), Boolean.valueOf(this.f36392g), this.f36393h.name(), this.f36394i, this.f36395j});
    }

    public C13950b(ImageDecodeOptionsBuilder imageDecodeOptionsBuilder) {
        this.f36386a = imageDecodeOptionsBuilder.f36371a;
        this.f36387b = imageDecodeOptionsBuilder.f36372b;
        this.f36388c = imageDecodeOptionsBuilder.f36373c;
        this.f36389d = imageDecodeOptionsBuilder.f36374d;
        this.f36390e = imageDecodeOptionsBuilder.f36375e;
        this.f36391f = imageDecodeOptionsBuilder.f36376f;
        this.f36393h = imageDecodeOptionsBuilder.f36378h;
        this.f36394i = imageDecodeOptionsBuilder.f36379i;
        this.f36392g = imageDecodeOptionsBuilder.f36377g;
        this.f36395j = imageDecodeOptionsBuilder.f36380j;
        this.f36396k = imageDecodeOptionsBuilder.f36381k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13950b bVar = (C13950b) obj;
        if (this.f36387b == bVar.f36387b && this.f36389d == bVar.f36389d && this.f36390e == bVar.f36390e && this.f36391f == bVar.f36391f && this.f36392g == bVar.f36392g && this.f36393h == bVar.f36393h && this.f36394i == bVar.f36394i && this.f36395j == bVar.f36395j) {
            return true;
        }
        return false;
    }
}
