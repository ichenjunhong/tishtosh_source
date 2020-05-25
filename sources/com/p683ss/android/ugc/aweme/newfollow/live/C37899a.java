package com.p683ss.android.ugc.aweme.newfollow.live;

import android.graphics.Bitmap;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p963c.C13946f;
import com.facebook.imagepipeline.p975o.C14234d;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p914c.p915a.C13624h;
import com.p683ss.android.p1147d.C18940c;

/* renamed from: com.ss.android.ugc.aweme.newfollow.live.a */
public final class C37899a implements C14234d {

    /* renamed from: a */
    private int f96485a;

    /* renamed from: b */
    private float f96486b;

    /* renamed from: c */
    private C37900a f96487c;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.live.a$a */
    public interface C37900a {
    }

    public final String getName() {
        return "blurProcessor";
    }

    public final C13619c getPostprocessorCacheKey() {
        return new C13624h("blur_bitmap_processor");
    }

    public final C13715a<Bitmap> process(Bitmap bitmap, C13946f fVar) {
        float f;
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
        if (this.f96486b != 0.0f) {
            float f2 = (float) round;
            float f3 = (float) round2;
            if (Math.abs((f2 / f3) - ((float) this.f96485a)) > 0.2f) {
                int i3 = (int) (f2 / this.f96486b);
                if (i3 > round2) {
                    i2 = (int) (f3 * this.f96486b);
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
        C18940c.m46109a(createScaledBitmap, (Bitmap) a.mo25630a(), this.f96485a);
        createScaledBitmap.recycle();
        return a;
    }

    public C37899a(int i, float f, C37900a aVar) {
        this.f96486b = f;
        this.f96485a = i;
        this.f96487c = aVar;
    }
}
