package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p923g.C13705d;

/* renamed from: com.facebook.imagepipeline.memory.h */
public final class C14079h extends C14059a<Bitmap> implements C14073d {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo26307c(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo26309d(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo26303a(C14075f fVar) {
        Bitmap bitmap = (Bitmap) super.mo26303a(fVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ void mo26306b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C13689i.m27652a(bitmap);
        bitmap.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ int mo26308c(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C13689i.m27652a(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo26305b(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return Bitmap.createBitmap(1, (int) Math.ceil(d / 2.0d), Config.RGB_565);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ boolean mo26310d(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C13689i.m27652a(bitmap);
        if (bitmap.isRecycled() || !bitmap.isMutable()) {
            return false;
        }
        return true;
    }

    public C14079h(C13705d dVar, C14068ad adVar, C14069ae aeVar) {
        super(dVar, adVar, aeVar);
        mo26304a();
    }
}
