package com.p683ss.android.p1147d;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.renderscript.Allocation;
import android.renderscript.Allocation.MipmapControl;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p963c.C13946f;
import com.facebook.imagepipeline.p975o.C14234d;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p914c.p915a.C13624h;

/* renamed from: com.ss.android.d.d */
public final class C18941d implements C14234d {

    /* renamed from: a */
    private Context f52184a;

    /* renamed from: b */
    private int f52185b;

    /* renamed from: c */
    private float f52186c;

    /* renamed from: com.ss.android.d.d$a */
    public interface C18942a {
    }

    public final String getName() {
        return "blurProcessor";
    }

    public final C13619c getPostprocessorCacheKey() {
        return new C13624h("blur_bitmap_processor");
    }

    public final C13715a<Bitmap> process(Bitmap bitmap, C13946f fVar) {
        float f;
        float f2;
        int i;
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < 100 || height < 100) {
            f = 0.6f;
        } else if (width < 200 || height < 200) {
            f = 0.3f;
        } else {
            f = 0.1f;
        }
        int round = Math.round(((float) width) * f);
        int round2 = Math.round(((float) height) * f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, false);
        if (this.f52186c != 0.0f) {
            float f3 = (float) round;
            float f4 = (float) round2;
            if (Math.abs((f3 / f4) - ((float) this.f52185b)) > 0.2f) {
                int i3 = (int) (f3 / this.f52186c);
                if (i3 > round2) {
                    i2 = (int) (f4 * this.f52186c);
                    i = round2;
                } else {
                    i = i3;
                    i2 = round;
                }
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (round - i2) >> 1, (round2 - i) >> 1, i2, i);
                createScaledBitmap.recycle();
                createScaledBitmap = createBitmap;
                round = i2;
                round2 = i;
            }
        }
        C13715a<Bitmap> a = fVar.mo26108a(round, round2);
        Bitmap bitmap2 = (Bitmap) a.mo25630a();
        Context context = this.f52184a;
        int i4 = this.f52185b;
        if (VERSION.SDK_INT > 17) {
            RenderScript create = RenderScript.create(context);
            Bitmap createBitmap2 = Bitmap.createBitmap(createScaledBitmap);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createBitmap2, MipmapControl.MIPMAP_NONE, 1);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            while (i4 > 0) {
                if (i4 - 10 > 0) {
                    f2 = 10.0f;
                } else {
                    f2 = (float) i4;
                }
                create2.setRadius(f2);
                create2.setInput(createFromBitmap);
                create2.forEach(createTyped);
                i4 -= 10;
                if (i4 <= 0) {
                    createTyped.copyTo(bitmap2);
                } else {
                    createFromBitmap.copyFrom(createTyped);
                }
            }
            createBitmap2.recycle();
        } else {
            C18940c.m46109a(createScaledBitmap, bitmap2, i4);
        }
        createScaledBitmap.recycle();
        return a;
    }
}
