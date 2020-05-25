package com.facebook.imagepipeline.p972l;

import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.support.p030v4.p038f.C0795l.C0798c;
import com.facebook.imagepipeline.memory.C14073d;
import com.facebook.imageutils.C14250a;

/* renamed from: com.facebook.imagepipeline.l.e */
public final class C14055e extends C14052b {
    public C14055e(C14073d dVar, int i, C0798c cVar) {
        super(dVar, i, cVar);
    }

    /* renamed from: a */
    public final int mo26284a(int i, int i2, Options options) {
        boolean z;
        if (options.outColorSpace == null || !options.outColorSpace.isWideGamut() || options.inPreferredConfig == Config.RGBA_F16) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return i * i2 * 8;
        }
        return C14250a.m29202a(i, i2, options.inPreferredConfig);
    }
}
