package com.bytedance.android.livesdk.chatroom.p306bl;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.gift.model.C7512k;
import com.ss.android.ugc.trill.R;
import java.io.File;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.b */
public final class C5005b {
    /* renamed from: a */
    private static boolean m11492a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: a */
    public static String m11491a(C7512k kVar) {
        Typeface typeface;
        String str = kVar.f20606i;
        Bitmap createBitmap = Bitmap.createBitmap(kVar.f20599b, kVar.f20600c, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        if (m11492a(kVar.f20607j)) {
            typeface = Typeface.createFromFile(kVar.f20607j);
        } else {
            typeface = Typeface.DEFAULT;
        }
        textPaint.setTypeface(typeface);
        textPaint.setTextSize((float) kVar.f20602e);
        textPaint.setColor(Color.parseColor(kVar.f20603f));
        float f = 0.0f;
        if (kVar.mo13926a()) {
            int b = C3922z.m9909b((int) R.color.alt);
            textPaint.setShadowLayer(2.0f, 0.0f, 5.0f, Color.argb(153, Color.red(b), Color.green(b), Color.blue(b)));
        }
        String str2 = kVar.f20605h;
        if (TextUtils.equals(str2, "center")) {
            f = (((float) kVar.f20599b) - textPaint.measureText(kVar.f20601d)) / 2.0f;
        } else if (!TextUtils.equals(str2, "left") && TextUtils.equals(str2, "right")) {
            f = ((float) kVar.f20599b) - textPaint.measureText(kVar.f20601d);
        }
        textPaint.getTextBounds(kVar.f20601d, 0, kVar.f20601d.length(), new Rect());
        FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        canvas.drawText(kVar.f20601d, f, (float) ((((kVar.f20600c - fontMetricsInt.bottom) + fontMetricsInt.top) / 2) - fontMetricsInt.top), textPaint);
        m11493a(str, createBitmap);
        createBitmap.recycle();
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x001a A[SYNTHETIC, Splitter:B:16:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0020 A[SYNTHETIC, Splitter:B:22:0x0020] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m11493a(java.lang.String r2, android.graphics.Bitmap r3) {
        /*
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x001e, all -> 0x0017 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x001e, all -> 0x0017 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0015, all -> 0x0012 }
            r0 = 100
            r3.compress(r2, r0, r1)     // Catch:{ Exception -> 0x0015, all -> 0x0012 }
            r1.close()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            r2 = 1
            return r2
        L_0x0012:
            r2 = move-exception
            r0 = r1
            goto L_0x0018
        L_0x0015:
            r0 = r1
            goto L_0x001e
        L_0x0017:
            r2 = move-exception
        L_0x0018:
            if (r0 == 0) goto L_0x001d
            r0.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            throw r2
        L_0x001e:
            if (r0 == 0) goto L_0x0023
            r0.close()     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p306bl.C5005b.m11493a(java.lang.String, android.graphics.Bitmap):boolean");
    }
}
