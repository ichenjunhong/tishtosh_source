package com.p683ss.android.ugc.tools.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import com.p683ss.android.ugc.aweme.shortvideo.p2209l.C43952a;

/* renamed from: com.ss.android.ugc.tools.utils.b */
public final class C50198b {
    /* renamed from: a */
    public static Bitmap m108328a(Bitmap bitmap, float f) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* renamed from: a */
    private static int m108327a(Options options, int i, int i2) {
        int i3 = 1;
        if (i == 0 || i2 == 0) {
            return 1;
        }
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        if (i4 > i || i5 > i2) {
            int i6 = i4 >> 1;
            int i7 = i5 >> 1;
            while (i6 / i3 > i && i7 / i3 > i2) {
                i3 <<= 1;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static BitmapDrawable m108330a(Resources resources, int i, Options options) {
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(resources.openRawResource(i), null, options);
            if (decodeStream != null) {
                return new BitmapDrawable(resources, decodeStream);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static BitmapDrawable m108332a(Resources resources, String str, Options options) {
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            if (decodeFile != null) {
                return new BitmapDrawable(resources, decodeFile);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static BitmapDrawable m108329a(Resources resources, int i, int i2, int i3, float f, int i4, C43952a aVar) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(resources.openRawResource(i), null, options);
        options.inSampleSize = m108327a(options, i2, i3);
        if (f > 0.0f && i4 > 0) {
            options.inScaled = true;
            options.inDensity = (int) (((float) i4) / f);
            options.inTargetDensity = i4;
        }
        String resourceName = resources.getResourceName(i);
        BitmapDrawable a = aVar.mo89518a(resourceName);
        if (a != null) {
            return a;
        }
        BitmapDrawable a2 = m108330a(resources, i, options);
        if (a2 != null) {
            aVar.mo89519a(resourceName, a2);
        }
        return a2;
    }

    /* renamed from: a */
    public static BitmapDrawable m108331a(Resources resources, String str, int i, int i2, float f, int i3, C43952a aVar) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = m108327a(options, i, i2);
        if (f > 0.0f && i3 > 0) {
            options.inScaled = true;
            options.inDensity = (int) (((float) i3) / f);
            options.inTargetDensity = i3;
        }
        BitmapDrawable a = aVar.mo89518a(str);
        if (a != null) {
            return a;
        }
        BitmapDrawable a2 = m108332a(resources, str, options);
        if (a2 != null) {
            aVar.mo89519a(str, a2);
        }
        return a2;
    }
}
