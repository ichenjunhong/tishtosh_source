package com.p683ss.ugc.live.barrage.p2602a;

import android.graphics.Bitmap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.ugc.live.barrage.a.b */
public class C51604b extends C51596a {

    /* renamed from: a */
    private final Bitmap f128888a;

    /* renamed from: b */
    public final Bitmap mo105541b() {
        return this.f128888a;
    }

    public C51604b(Bitmap bitmap) {
        C52711k.m112240b(bitmap, "bitmap");
        this.f128888a = bitmap;
        this.f128881k.right = this.f128881k.left + ((float) this.f128888a.getWidth());
        this.f128881k.bottom = this.f128881k.top + ((float) this.f128888a.getHeight());
        mo105544e();
    }
}
