package com.facebook.imagepipeline.p975o;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import com.facebook.imagepipeline.p963c.C13946f;
import com.facebook.p914c.p915a.C13619c;

/* renamed from: com.facebook.imagepipeline.o.a */
public abstract class C14228a implements C14234d {
    public static final Config FALLBACK_BITMAP_CONFIGURATION = Config.ARGB_8888;

    public String getName() {
        return "Unknown postprocessor";
    }

    public C13619c getPostprocessorCacheKey() {
        return null;
    }

    public void process(Bitmap bitmap) {
    }

    public void process(Bitmap bitmap, Bitmap bitmap2) {
        internalCopyBitmap(bitmap, bitmap2);
        process(bitmap);
    }

    private static void internalCopyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            Bitmaps.copyBitmap(bitmap, bitmap2);
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, null);
        }
    }

    public C13715a<Bitmap> process(Bitmap bitmap, C13946f fVar) {
        Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = FALLBACK_BITMAP_CONFIGURATION;
        }
        C13715a a = fVar.mo26106a(width, height, config);
        try {
            process((Bitmap) a.mo25630a(), bitmap);
            return C13715a.m27751b(a);
        } finally {
            C13715a.m27752c(a);
        }
    }
}
