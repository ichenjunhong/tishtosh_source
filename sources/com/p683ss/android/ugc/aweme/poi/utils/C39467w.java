package com.p683ss.android.ugc.aweme.poi.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p963c.C13946f;
import com.facebook.imagepipeline.p975o.C14234d;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p914c.p915a.C13624h;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.w */
public final class C39467w implements C14234d {

    /* renamed from: a */
    private final String f100899a;

    /* renamed from: b */
    private final String f100900b;

    /* renamed from: c */
    private final int f100901c;

    public final String getName() {
        return "ResizeBitmapProcessor";
    }

    public final C13619c getPostprocessorCacheKey() {
        return new C13624h("ResizeBitmapProcessor");
    }

    public final C13715a<Bitmap> process(Bitmap bitmap, C13946f fVar) {
        C52711k.m112240b(bitmap, "sourceBitmap");
        C52711k.m112240b(fVar, "bitmapFactory");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= this.f100901c || height <= this.f100901c || this.f100901c == 0 || this.f100901c == 0) {
            C13715a<Bitmap> a = fVar.mo26109a(bitmap);
            C52711k.m112236a((Object) a, "bitmapFactory.createBitmap(sourceBitmap)");
            return a;
        }
        float min = Math.min(((float) width) / ((float) this.f100901c), ((float) height) / ((float) this.f100901c));
        Matrix matrix = new Matrix();
        float f = 1.0f / min;
        matrix.postScale(f, f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        C52711k.m112236a((Object) createBitmap, "Bitmap.createBitmap(sour…W, sourceH, matrix, true)");
        C13715a<Bitmap> a2 = fVar.mo26109a(createBitmap);
        C52711k.m112236a((Object) a2, "bitmapFactory.createBitmap(temp)");
        C23088c a3 = C23088c.m56631a();
        a3.mo47824a("item_id", this.f100899a);
        a3.mo47824a("url", this.f100900b);
        a3.mo47822a("width", Integer.valueOf(width));
        a3.mo47822a("height", Integer.valueOf(height));
        C23131p.m56692a("poi_log", "poi_preview", a3.mo47825b());
        return a2;
    }

    public C39467w(String str, String str2, int i) {
        this.f100899a = str;
        this.f100900b = str2;
        this.f100901c = i;
    }
}
