package com.facebook.imagepipeline.p963c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p924h.C13715a;

/* renamed from: com.facebook.imagepipeline.c.f */
public abstract class C13946f {

    /* renamed from: com.facebook.imagepipeline.c.f$1 */
    static /* synthetic */ class C139471 {

        /* renamed from: a */
        static final /* synthetic */ int[] f36369a = new int[Config.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36369a = r0
                int[] r0 = f36369a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f36369a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f36369a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f36369a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p963c.C13946f.C139471.<clinit>():void");
        }
    }

    /* renamed from: a */
    public abstract C13715a<Bitmap> mo26106a(int i, int i2, Config config);

    /* renamed from: a */
    public final C13715a<Bitmap> mo26110a(Bitmap bitmap, int i, int i2, int i3, int i4, Object obj) {
        return m28406a(bitmap, i, i2, i3, i4, null, false, obj);
    }

    /* renamed from: b */
    private static Config m28411b(Bitmap bitmap) {
        Config config = Config.ARGB_8888;
        Config config2 = bitmap.getConfig();
        if (config2 == null) {
            return config;
        }
        switch (C139471.f36369a[config2.ordinal()]) {
            case 1:
                return Config.RGB_565;
            case 2:
                return Config.ALPHA_8;
            default:
                return Config.ARGB_8888;
        }
    }

    /* renamed from: a */
    public final C13715a<Bitmap> mo26109a(Bitmap bitmap) {
        return m28407a(bitmap, (Object) null);
    }

    /* renamed from: a */
    private C13715a<Bitmap> m28407a(Bitmap bitmap, Object obj) {
        return mo26110a(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), (Object) null);
    }

    /* renamed from: b */
    private static void m28412b(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27656a(z, (Object) "width must be > 0");
        if (i2 > 0) {
            z2 = true;
        }
        C13689i.m27656a(z2, (Object) "height must be > 0");
    }

    /* renamed from: c */
    private static void m28413c(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27656a(z, (Object) "x must be >= 0");
        if (i2 >= 0) {
            z2 = true;
        }
        C13689i.m27656a(z2, (Object) "y must be >= 0");
    }

    /* renamed from: a */
    private static void m28410a(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setDensity(bitmap.getDensity());
        if (VERSION.SDK_INT >= 12) {
            bitmap2.setHasAlpha(bitmap.hasAlpha());
        }
        if (VERSION.SDK_INT >= 19) {
            bitmap2.setPremultiplied(bitmap.isPremultiplied());
        }
    }

    /* renamed from: a */
    public final C13715a<Bitmap> mo26108a(int i, int i2) {
        return mo26111b(i, i2, Config.ARGB_8888);
    }

    /* renamed from: b */
    public final C13715a<Bitmap> mo26111b(int i, int i2, Config config) {
        return m28404a(i, i2, config, null);
    }

    /* renamed from: a */
    private C13715a<Bitmap> m28404a(int i, int i2, Config config, Object obj) {
        return mo26106a(i, i2, config);
    }

    /* renamed from: a */
    private C13715a<Bitmap> m28405a(int i, int i2, Config config, boolean z, Object obj) {
        return m28408a((DisplayMetrics) null, i, i2, config, z, obj);
    }

    /* renamed from: a */
    private static void m28409a(Bitmap bitmap, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2 = false;
        if (i + i3 <= bitmap.getWidth()) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27656a(z, (Object) "x + width must be <= bitmap.width()");
        if (i2 + i4 <= bitmap.getHeight()) {
            z2 = true;
        }
        C13689i.m27656a(z2, (Object) "y + height must be <= bitmap.height()");
    }

    /* renamed from: a */
    private C13715a<Bitmap> m28408a(DisplayMetrics displayMetrics, int i, int i2, Config config, boolean z, Object obj) {
        m28412b(i, i2);
        C13715a<Bitmap> a = mo26106a(i, i2, config);
        Bitmap bitmap = (Bitmap) a.mo25630a();
        if (VERSION.SDK_INT >= 12) {
            bitmap.setHasAlpha(z);
        }
        if (config == Config.ARGB_8888 && !z) {
            bitmap.eraseColor(-16777216);
        }
        return a;
    }

    /* renamed from: a */
    private C13715a<Bitmap> m28406a(Bitmap bitmap, int i, int i2, int i3, int i4, Matrix matrix, boolean z, Object obj) {
        C13689i.m27653a(bitmap, (Object) "Source bitmap cannot be null");
        m28413c(i, i2);
        m28412b(i3, i4);
        m28409a(bitmap, i, i2, i3, i4);
        Rect rect = new Rect(i, i2, i + i3, i2 + i4);
        RectF rectF = new RectF(0.0f, 0.0f, (float) i3, (float) i4);
        C13715a<Bitmap> a = m28405a(i3, i4, m28411b(bitmap), bitmap.hasAlpha(), obj);
        m28410a(bitmap, (Bitmap) a.mo25630a());
        Canvas canvas = new Canvas((Bitmap) a.mo25630a());
        canvas.drawBitmap(bitmap, rect, rectF, null);
        canvas.setBitmap(null);
        return a;
    }
}
