package com.p683ss.android.ugc.aweme.watermark;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.watermark.p */
public final class C48256p {

    /* renamed from: a */
    public Bitmap f121454a;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[SYNTHETIC, Splitter:B:16:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002c A[SYNTHETIC, Splitter:B:23:0x002c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo95757a(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002a, all -> 0x001d }
            r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x002a, all -> 0x001d }
            android.graphics.Bitmap r4 = r3.f121454a     // Catch:{ FileNotFoundException -> 0x001b, all -> 0x0019 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x001b, all -> 0x0019 }
            r2 = 100
            r4.compress(r0, r2, r1)     // Catch:{ FileNotFoundException -> 0x001b, all -> 0x0019 }
            r1.close()     // Catch:{ IOException -> 0x0012 }
        L_0x0012:
            android.graphics.Bitmap r4 = r3.f121454a
            com.p683ss.android.ugc.aweme.utils.C47954t.m103763a(r4)
            r4 = 1
            return r4
        L_0x0019:
            r4 = move-exception
            goto L_0x001f
        L_0x001b:
            r0 = r1
            goto L_0x002a
        L_0x001d:
            r4 = move-exception
            r1 = r0
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            r1.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            android.graphics.Bitmap r0 = r3.f121454a
            com.p683ss.android.ugc.aweme.utils.C47954t.m103763a(r0)
            throw r4
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            android.graphics.Bitmap r4 = r3.f121454a
            com.p683ss.android.ugc.aweme.utils.C47954t.m103763a(r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.watermark.C48256p.mo95757a(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final C48256p mo95756a(String str, String str2, boolean z) {
        return mo95755a(str, BitmapFactory.decodeFile(str2), z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C48256p mo95755a(String str, Bitmap bitmap, boolean z) {
        float f;
        Resources resources = C39618d.f101160a.getResources();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 168, 67, true);
        if (TextUtils.isEmpty(str)) {
            this.f121454a = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setColor(resources.getColor(R.color.a2c));
            textPaint.setTextSize(30.0f);
            float a = C20141b.m49696a((Context) C39618d.f101160a, 1.0f);
            textPaint.setShadowLayer(2.0f * a, 0.0f, a, resources.getColor(R.color.k5));
            int measureText = (int) (textPaint.measureText(str) + 5.0f);
            int max = Math.max(createScaledBitmap.getWidth(), measureText) + 15;
            Bitmap createBitmap = Bitmap.createBitmap(max, createScaledBitmap.getHeight() + 44 + 2, Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            if (z) {
                f = 4.0f;
            } else {
                f = (float) (max - createScaledBitmap.getWidth());
            }
            canvas.drawBitmap(createScaledBitmap, f, 0.0f, paint);
            canvas.drawText(str, (float) ((max - measureText) - 4), ((float) (createScaledBitmap.getHeight() + 2)) - textPaint.ascent(), textPaint);
            this.f121454a = createBitmap;
        }
        return this;
    }

    /* renamed from: a */
    public final C48256p mo95754a(int i, int i2, String str, int i3, boolean z) {
        Bitmap bitmap;
        float f;
        float f2;
        Resources resources = C39618d.f101160a.getResources();
        float f3 = ((float) i) / 720.0f;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, R.drawable.bcx, null), (int) (208.0f * f3), (int) (56.0f * f3), true);
        if (TextUtils.isEmpty(str)) {
            this.f121454a = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setColor(resources.getColor(R.color.a7y));
            textPaint.setTextSize(22.0f * f3);
            float f4 = 4.0f * f3;
            textPaint.setShadowLayer(f4, 0.0f, 0.0f, resources.getColor(R.color.k5));
            int measureText = (int) textPaint.measureText(str);
            float f5 = 6.0f * f3;
            int i4 = ((int) f5) + measureText;
            if (i4 >= createScaledBitmap.getWidth()) {
                bitmap = Bitmap.createBitmap(i4, (int) (((float) createScaledBitmap.getHeight()) + (f3 * 32.0f)), Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = (float) (i4 - createScaledBitmap.getWidth());
                }
                canvas.drawBitmap(createScaledBitmap, f2, 0.0f, paint);
                canvas.drawText(str, 0.0f, (((float) createScaledBitmap.getHeight()) + f4) - textPaint.ascent(), textPaint);
            } else {
                int width = createScaledBitmap.getWidth();
                bitmap = Bitmap.createBitmap(width, (int) (((float) createScaledBitmap.getHeight()) + (f3 * 32.0f)), Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmap);
                Paint paint2 = new Paint();
                paint2.setAntiAlias(true);
                if (z) {
                    f = 0.0f;
                } else {
                    f = (float) (width - createScaledBitmap.getWidth());
                }
                canvas2.drawBitmap(createScaledBitmap, f, 0.0f, paint2);
                canvas2.drawText(str, ((float) (width - measureText)) - f5, (((float) createScaledBitmap.getHeight()) + f4) - textPaint.ascent(), textPaint);
            }
            this.f121454a = bitmap;
        }
        return this;
    }
}
