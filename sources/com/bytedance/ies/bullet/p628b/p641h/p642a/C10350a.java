package com.bytedance.ies.bullet.p628b.p641h.p642a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.bytedance.ies.bullet.b.h.a.a */
public final class C10350a {

    /* renamed from: com.bytedance.ies.bullet.b.h.a.a$a */
    public static class C10351a {

        /* renamed from: a */
        public int f27786a;

        /* renamed from: b */
        public int f27787b;

        /* renamed from: c */
        public Config f27788c;
    }

    /* renamed from: a */
    public static boolean m20923a(View view) {
        if (m20924b(view).f27786a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static C10351a m20924b(View view) {
        int i;
        View view2 = view;
        C10351a aVar = new C10351a();
        if (view2 == null || Looper.myLooper() != Looper.getMainLooper()) {
            aVar.f27786a = 3;
            return aVar;
        }
        boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
        boolean z = true;
        if (!isDrawingCacheEnabled) {
            try {
                view2.setDrawingCacheEnabled(true);
            } catch (Throwable unused) {
                aVar.f27786a = 3;
                if (!isDrawingCacheEnabled) {
                    view2.setDrawingCacheEnabled(false);
                }
                return aVar;
            }
        }
        SystemClock.uptimeMillis();
        Bitmap drawingCache = view.getDrawingCache();
        SystemClock.uptimeMillis();
        int i2 = 2;
        if (drawingCache != null) {
            int width = drawingCache.getWidth();
            int height = drawingCache.getHeight();
            aVar.f27788c = drawingCache.getConfig();
            if (width > 0 && height > 0) {
                int pixel = drawingCache.getPixel(0, 0);
                aVar.f27787b = pixel;
                C10352b bVar = new C10352b(pixel);
                if (drawingCache != null) {
                    int width2 = drawingCache.getWidth();
                    int height2 = drawingCache.getHeight();
                    if (width2 > 0 && height2 > 0) {
                        if (bVar.f27789a == 0) {
                            i = drawingCache.getPixel(0, 0);
                        } else {
                            i = bVar.f27789a;
                        }
                        int[] iArr = new int[width2];
                        Arrays.fill(iArr, i);
                        int[] iArr2 = new int[width2];
                        int i3 = 0;
                        while (i3 < height2) {
                            int i4 = i3;
                            int[] iArr3 = iArr2;
                            int[] iArr4 = iArr;
                            int i5 = height2;
                            int i6 = width2;
                            drawingCache.getPixels(iArr2, 0, width2, 0, i4, width2, 1);
                            if (Arrays.equals(iArr4, iArr3)) {
                                i3 = i4 + 1;
                                iArr = iArr4;
                                iArr2 = iArr3;
                                height2 = i5;
                                width2 = i6;
                            }
                        }
                        z = true;
                    }
                    z = false;
                    break;
                }
                if (z) {
                    i2 = 1;
                }
                aVar.f27786a = i2;
                if (!isDrawingCacheEnabled) {
                    view2.setDrawingCacheEnabled(false);
                }
                return aVar;
            }
        }
        if (!isDrawingCacheEnabled) {
            view2.setDrawingCacheEnabled(false);
        }
        aVar.f27786a = 2;
        return aVar;
    }
}
