package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p924h.C13718c;
import com.facebook.imageutils.C14250a;

/* renamed from: com.facebook.imagepipeline.memory.b */
public final class C14070b {

    /* renamed from: a */
    public final C13718c<Bitmap> f36779a;

    /* renamed from: b */
    private int f36780b;

    /* renamed from: c */
    private long f36781c;

    /* renamed from: d */
    private final int f36782d;

    /* renamed from: e */
    private final int f36783e;

    /* renamed from: a */
    public final synchronized int mo26326a() {
        return this.f36780b;
    }

    /* renamed from: b */
    public final synchronized long mo26328b() {
        return this.f36781c;
    }

    /* renamed from: c */
    public final synchronized int mo26330c() {
        return this.f36782d;
    }

    /* renamed from: d */
    public final synchronized int mo26331d() {
        return this.f36783e;
    }

    /* renamed from: a */
    public final synchronized boolean mo26327a(Bitmap bitmap) {
        int a = C14250a.m29204a(bitmap);
        if (this.f36780b < this.f36782d) {
            long j = (long) a;
            if (this.f36781c + j <= ((long) this.f36783e)) {
                this.f36780b++;
                this.f36781c += j;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized void mo26329b(Bitmap bitmap) {
        boolean z;
        boolean z2;
        int a = C14250a.m29204a(bitmap);
        if (this.f36780b > 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27656a(z, (Object) "No bitmaps registered.");
        long j = (long) a;
        if (j <= this.f36781c) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str = "Bitmap size bigger than the total registered size: %d, %d";
        Object[] objArr = {Integer.valueOf(a), Long.valueOf(this.f36781c)};
        if (z2) {
            this.f36781c -= j;
            this.f36780b--;
        } else {
            throw new IllegalArgumentException(C13689i.m27654a(str, objArr));
        }
    }

    public C14070b(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        if (i2 > 0) {
            z2 = true;
        }
        C13689i.m27655a(z2);
        this.f36782d = i;
        this.f36783e = i2;
        this.f36779a = new C13718c<Bitmap>() {
            /* renamed from: a */
            public final /* synthetic */ void mo25600a(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                try {
                    C14070b.this.mo26329b(bitmap);
                } finally {
                    bitmap.recycle();
                }
            }
        };
    }
}
