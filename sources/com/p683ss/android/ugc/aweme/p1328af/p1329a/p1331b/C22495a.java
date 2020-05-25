package com.p683ss.android.ugc.aweme.p1328af.p1329a.p1331b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.af.a.b.a */
public final class C22495a {

    /* renamed from: com.ss.android.ugc.aweme.af.a.b.a$a */
    public static class C22496a {

        /* renamed from: a */
        public int f60612a;

        /* renamed from: b */
        public int f60613b;

        /* renamed from: c */
        public Config f60614c;
    }

    /* renamed from: a */
    public static boolean m55590a(View view) {
        if (m55591b(view).f60612a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static C22496a m55591b(View view) {
        int i;
        View view2 = view;
        C22496a aVar = new C22496a();
        if (view2 == null || Looper.myLooper() != Looper.getMainLooper()) {
            aVar.f60612a = 3;
            return aVar;
        }
        boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
        boolean z = true;
        if (!isDrawingCacheEnabled) {
            try {
                view2.setDrawingCacheEnabled(true);
            } catch (Throwable unused) {
                aVar.f60612a = 3;
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
            aVar.f60614c = drawingCache.getConfig();
            if (width > 0 && height > 0) {
                int pixel = drawingCache.getPixel(0, 0);
                aVar.f60613b = pixel;
                C22502g gVar = new C22502g(pixel);
                if (drawingCache != null) {
                    int width2 = drawingCache.getWidth();
                    int height2 = drawingCache.getHeight();
                    if (width2 > 0 && height2 > 0) {
                        if (gVar.f60629a == 0) {
                            i = drawingCache.getPixel(0, 0);
                        } else {
                            i = gVar.f60629a;
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
                aVar.f60612a = i2;
                if (!isDrawingCacheEnabled) {
                    view2.setDrawingCacheEnabled(false);
                }
                return aVar;
            }
        }
        if (!isDrawingCacheEnabled) {
            view2.setDrawingCacheEnabled(false);
        }
        aVar.f60612a = 2;
        return aVar;
    }
}
