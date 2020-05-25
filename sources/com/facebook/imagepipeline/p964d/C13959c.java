package com.facebook.imagepipeline.p964d;

import android.net.Uri;
import com.C2240a;
import com.facebook.common.p920d.C13685h;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.common.C13953e;
import com.facebook.p914c.p915a.C13619c;

/* renamed from: com.facebook.imagepipeline.d.c */
public final class C13959c implements C13619c {

    /* renamed from: a */
    public final String f36408a;

    /* renamed from: b */
    public final Object f36409b;

    /* renamed from: c */
    public final long f36410c;

    /* renamed from: d */
    private final String f36411d;

    /* renamed from: e */
    private final C13952d f36412e;

    /* renamed from: f */
    private final C13953e f36413f;

    /* renamed from: g */
    private final C13950b f36414g;

    /* renamed from: h */
    private final C13619c f36415h;

    /* renamed from: i */
    private final int f36416i;

    /* renamed from: a */
    public final String mo25470a() {
        return this.f36411d;
    }

    public final int hashCode() {
        return this.f36416i;
    }

    public final String toString() {
        return C2240a.m6773a(null, "%s_%s_%s_%s_%s_%s_%d", new Object[]{this.f36411d, this.f36412e, this.f36413f, this.f36414g, this.f36415h, this.f36408a, Integer.valueOf(this.f36416i)});
    }

    /* renamed from: a */
    public final boolean mo25471a(Uri uri) {
        return mo25470a().contains(uri.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13959c)) {
            return false;
        }
        C13959c cVar = (C13959c) obj;
        if (this.f36416i != cVar.f36416i || !this.f36411d.equals(cVar.f36411d) || !C13685h.m27645a(this.f36412e, cVar.f36412e) || !C13685h.m27645a(this.f36413f, cVar.f36413f) || !C13685h.m27645a(this.f36414g, cVar.f36414g) || !C13685h.m27645a(this.f36415h, cVar.f36415h) || !C13685h.m27645a(this.f36408a, cVar.f36408a)) {
            return false;
        }
        return true;
    }

    public C13959c(String str, C13952d dVar, C13953e eVar, C13950b bVar, C13619c cVar, String str2, Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.f36411d = (String) C13689i.m27652a(str);
        this.f36412e = dVar;
        this.f36413f = eVar;
        this.f36414g = bVar;
        this.f36415h = cVar;
        this.f36408a = str2;
        Integer valueOf = Integer.valueOf(str.hashCode());
        int i7 = 0;
        if (dVar != null) {
            i = dVar.hashCode();
        } else {
            i = 0;
        }
        Integer valueOf2 = Integer.valueOf(i);
        Integer valueOf3 = Integer.valueOf(eVar.hashCode());
        C13950b bVar2 = this.f36414g;
        C13619c cVar2 = this.f36415h;
        if (valueOf == null) {
            i2 = 0;
        } else {
            i2 = valueOf.hashCode();
        }
        if (valueOf2 == null) {
            i3 = 0;
        } else {
            i3 = valueOf2.hashCode();
        }
        if (valueOf3 == null) {
            i4 = 0;
        } else {
            i4 = valueOf3.hashCode();
        }
        if (bVar2 == null) {
            i5 = 0;
        } else {
            i5 = bVar2.hashCode();
        }
        if (cVar2 == null) {
            i6 = 0;
        } else {
            i6 = cVar2.hashCode();
        }
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        this.f36416i = ((((((((((i2 + 31) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7;
        this.f36409b = obj;
        this.f36410c = RealtimeSinceBootClock.get().now();
    }
}
