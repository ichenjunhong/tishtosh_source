package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.utils.C47954t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.m */
public final class C43575m {
    /* renamed from: a */
    public static Bitmap m95718a(View view, int i, int i2, int i3, int i4) {
        Bitmap bitmap;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getHeight(), Config.ARGB_8888);
            createBitmap.setDensity(C23723j.m58217a().getDisplayMetrics().densityDpi);
            if (view.getDrawingCacheBackgroundColor() != 0) {
                createBitmap.eraseColor(view.getDrawingCacheBackgroundColor());
            }
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate((float) (-view.getScrollX()), (float) (-view.getScrollY()));
            view.draw(canvas);
            int width = createBitmap.getWidth();
            int height = createBitmap.getHeight();
            if (width == i && height == i2) {
                bitmap = createBitmap;
            } else if (i3 <= 0 || i4 <= 0 || (width <= i3 && height <= i4)) {
                float f = ((float) i) / ((float) width);
                float f2 = ((float) i2) / ((float) height);
                Matrix matrix = new Matrix();
                matrix.postScale(f, f2);
                bitmap = Bitmap.createBitmap(createBitmap, 0, 0, width, height, matrix, true);
            } else {
                float f3 = ((float) i) / ((float) i3);
                float f4 = ((float) i2) / ((float) i4);
                Matrix matrix2 = new Matrix();
                matrix2.setTranslate(((float) (width - i3)) * 0.5f, ((float) (height - i4)) * 0.5f);
                matrix2.postScale(f3, f4);
                bitmap = Bitmap.createBitmap(createBitmap, 0, 0, i3, i4, matrix2, true);
            }
            if (bitmap != createBitmap) {
                C47954t.m103763a(createBitmap);
            }
            return bitmap;
        } catch (OutOfMemoryError e) {
            C32458a.m75148a((Throwable) e);
            return null;
        }
    }
}
