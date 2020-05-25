package com.facebook.imagepipeline.p963c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.memory.C14073d;
import com.facebook.imageutils.C14250a;

/* renamed from: com.facebook.imagepipeline.c.a */
public final class C13941a extends C13946f {

    /* renamed from: a */
    private final C14073d f36359a;

    public C13941a(C14073d dVar) {
        this.f36359a = dVar;
    }

    /* renamed from: a */
    public final C13715a<Bitmap> mo26106a(int i, int i2, Config config) {
        boolean z;
        Bitmap bitmap = (Bitmap) this.f36359a.mo25599a(C14250a.m29202a(i, i2, config));
        if (bitmap.getAllocationByteCount() >= i * i2 * C14250a.m29203a(config)) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        bitmap.reconfigure(i, i2, config);
        return C13715a.m27747a(bitmap, this.f36359a);
    }
}
