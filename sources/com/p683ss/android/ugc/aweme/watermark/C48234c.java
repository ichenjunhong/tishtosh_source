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
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.ss.android.ugc.trill.R;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.watermark.c */
public final class C48234c {

    /* renamed from: a */
    public Bitmap f121380a;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0027 A[SYNTHETIC, Splitter:B:20:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x002d A[SYNTHETIC, Splitter:B:26:0x002d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo95726a(java.lang.String r5) {
        /*
            r4 = this;
            android.graphics.Bitmap r0 = r4.f121380a
            r1 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r5 = "mBitmap is null"
            com.p683ss.android.ugc.tools.utils.C50203g.m108361b(r5)
            return r1
        L_0x000b:
            r0 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002b, all -> 0x0023 }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x002b, all -> 0x0023 }
            android.graphics.Bitmap r5 = r4.f121380a     // Catch:{ FileNotFoundException -> 0x0021, all -> 0x001f }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x0021, all -> 0x001f }
            r3 = 100
            r5.compress(r0, r3, r2)     // Catch:{ FileNotFoundException -> 0x0021, all -> 0x001f }
            r2.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            r5 = 1
            return r5
        L_0x001f:
            r5 = move-exception
            goto L_0x0025
        L_0x0021:
            r0 = r2
            goto L_0x002b
        L_0x0023:
            r5 = move-exception
            r2 = r0
        L_0x0025:
            if (r2 == 0) goto L_0x002a
            r2.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            throw r5
        L_0x002b:
            if (r0 == 0) goto L_0x0030
            r0.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.watermark.C48234c.mo95726a(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final C48234c mo95723a(int i, int i2, String str, Bitmap bitmap, boolean z, boolean z2) {
        float f;
        int i3;
        float width;
        float f2;
        float f3;
        float width2;
        float f4;
        int i4 = i;
        int i5 = i2;
        String str2 = str;
        if (i4 == 0 || i5 == 0) {
            f = 1.0f;
        } else {
            f = Math.min(((float) i4) / 540.0f, ((float) i5) / 960.0f);
        }
        Resources resources = C39618d.f101160a.getResources();
        int i6 = (int) (145.0f * f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i6, (bitmap.getHeight() * i6) / bitmap.getWidth(), true);
        if (TextUtils.isEmpty(str)) {
            this.f121380a = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setColor(resources.getColor(R.color.a2c));
            textPaint.setTextSize(14.0f * f);
            float a = C20141b.m49696a((Context) C39618d.f101160a, 1.0f);
            textPaint.setShadowLayer(1.0f * a, 0.0f, a, resources.getColor(R.color.hc));
            int i7 = (int) (17.0f * f);
            int measureText = (int) (textPaint.measureText(str2) + (5.0f * f));
            int width3 = createScaledBitmap.getWidth();
            if (z) {
                i3 = ((int) Math.ceil((double) (f * 4.0f))) + i7;
            } else {
                i3 = 0;
            }
            int max = Math.max(width3, i3 + measureText);
            Bitmap createBitmap = Bitmap.createBitmap(max, (int) (((float) createScaledBitmap.getHeight()) + (26.0f * f)), Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            if (z) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, R.drawable.awc, null), i7, i7, true);
                if (z2) {
                    f3 = 0.0f;
                } else {
                    f3 = ((float) (max - measureText)) - (((float) i7) + (f * 4.0f));
                }
                canvas.drawBitmap(createScaledBitmap2, f3, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - (15.0f * f), paint);
                if (z2) {
                    width2 = 0.0f;
                } else {
                    width2 = (float) ((max - createScaledBitmap.getWidth()) + 3);
                }
                canvas.drawBitmap(createScaledBitmap, width2, 0.0f, paint);
                if (z2) {
                    f4 = ((float) i7) + (f * 4.0f);
                } else {
                    f4 = (float) (max - measureText);
                }
                canvas.drawText(str2, f4, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - (f * 2.0f), textPaint);
            } else {
                if (z2) {
                    width = 0.0f;
                } else {
                    width = (float) ((max - createScaledBitmap.getWidth()) + 3);
                }
                canvas.drawBitmap(createScaledBitmap, width, 0.0f, paint);
                if (z2) {
                    f2 = 0.0f;
                } else {
                    f2 = (float) (max - measureText);
                }
                canvas.drawText(str2, f2, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - (f * 2.0f), textPaint);
            }
            this.f121380a = createBitmap;
        }
        return this;
    }

    /* renamed from: a */
    public final C48234c mo95724a(int i, int i2, String str, Bitmap bitmap, boolean z, boolean z2, C48235d dVar) {
        float f;
        int i3;
        float width;
        float f2;
        float f3;
        float width2;
        float f4;
        int i4 = i;
        int i5 = i2;
        String str2 = str;
        if (i4 == 0 || i5 == 0) {
            f = 1.0f;
        } else {
            f = Math.min(((float) i4) / 540.0f, ((float) i5) / 960.0f);
        }
        Resources resources = C39618d.f101160a.getResources();
        int i6 = (int) (145.0f * f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i6, (bitmap.getHeight() * i6) / bitmap.getWidth(), true);
        if (TextUtils.isEmpty(str)) {
            this.f121380a = createScaledBitmap;
            return this;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setColor(resources.getColor(R.color.a2c));
        textPaint.setTextSize(26.0f * f);
        float a = C20141b.m49696a((Context) C39618d.f101160a, 1.0f);
        textPaint.setShadowLayer(1.0f * a, 0.0f, a, resources.getColor(R.color.hc));
        int i7 = (int) (28.0f * f);
        float f5 = 5.0f * f;
        int measureText = (int) (textPaint.measureText(str2) + f5);
        int width3 = createScaledBitmap.getWidth();
        if (z) {
            i3 = ((int) Math.ceil((double) (f * 4.0f))) + i7;
        } else {
            i3 = 0;
        }
        int max = Math.max(width3, i3 + measureText);
        Bitmap createBitmap = Bitmap.createBitmap(max, (int) (((float) createScaledBitmap.getHeight()) + (46.0f * f)), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (z) {
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, dVar.f121381a, null), i7, i7, true);
            if (z2) {
                f3 = 0.0f;
            } else {
                f3 = ((float) (max - measureText)) - (((float) i7) + (f * 4.0f));
            }
            canvas.drawBitmap(createScaledBitmap2, f3, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - (29.0f * f), paint);
            if (z2) {
                width2 = 0.0f;
            } else {
                width2 = (float) ((max - createScaledBitmap.getWidth()) + 3);
            }
            canvas.drawBitmap(createScaledBitmap, width2, 0.0f, paint);
            if (z2) {
                f4 = ((float) i7) + (f * 4.0f);
            } else {
                f4 = (float) (max - measureText);
            }
            canvas.drawText(str2, f4, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - f5, textPaint);
        } else {
            if (z2) {
                width = 0.0f;
            } else {
                width = (float) ((max - createScaledBitmap.getWidth()) + 3);
            }
            canvas.drawBitmap(createScaledBitmap, width, 0.0f, paint);
            if (z2) {
                f2 = 0.0f;
            } else {
                f2 = (float) (max - measureText);
            }
            canvas.drawText(str2, f2, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - f5, textPaint);
        }
        this.f121380a = createBitmap;
        return this;
    }

    /* renamed from: a */
    public final C48234c mo95725a(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, C48235d dVar) {
        String str3 = str2;
        Bitmap decodeFile = BitmapFactory.decodeFile(str2);
        if (decodeFile == null) {
            StringBuilder sb = new StringBuilder("I18nWaterMarkImage --> pic Path   => ");
            sb.append(str2);
            C47625i.m103103a(sb.toString());
            File file = new File(str2);
            StringBuilder sb2 = new StringBuilder("I18nWaterMarkImage --> pic exists => ");
            sb2.append(file.exists());
            C47625i.m103103a(sb2.toString());
            StringBuilder sb3 = new StringBuilder("I18nWaterMarkImage --> pic size   => ");
            sb3.append(file.length());
            C47625i.m103103a(sb3.toString());
            return this;
        } else if (!z2) {
            return mo95724a(i, i2, str, decodeFile, z, z3, dVar);
        } else {
            return mo95723a(i, i2, str, decodeFile, z, z3);
        }
    }
}
