package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.p923g.C13703b;

/* renamed from: com.facebook.imagepipeline.memory.m */
public final class C14084m implements C14073d {
    /* renamed from: a */
    public final void mo25598a(C13703b bVar) {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25600a(Object obj) {
        ((Bitmap) obj).recycle();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo25599a(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return Bitmap.createBitmap(1, (int) Math.ceil(d / 2.0d), Config.RGB_565);
    }
}
