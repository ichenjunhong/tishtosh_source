package com.p683ss.android.ugc.aweme.commercialize.p1545ad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.ad.d */
public final class C25594d extends ReplacementSpan {

    /* renamed from: a */
    public float f67758a;

    /* renamed from: b */
    public float f67759b;

    /* renamed from: c */
    public float f67760c;

    /* renamed from: d */
    public int f67761d;

    /* renamed from: e */
    private final TextExtraStruct f67762e;

    /* renamed from: f */
    private final int f67763f;

    /* renamed from: g */
    private final int f67764g = -1;

    /* renamed from: h */
    private float f67765h;

    /* renamed from: i */
    private final Context f67766i;

    /* renamed from: j */
    private String f67767j;

    /* renamed from: k */
    private float f67768k;

    public C25594d(Context context, float f, int i, int i2, TextExtraStruct textExtraStruct) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(textExtraStruct, "struct");
        this.f67762e = textExtraStruct;
        this.f67763f = i;
        this.f67765h = f;
        this.f67766i = context;
        this.f67758a = -1.0f;
        this.f67767j = "";
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        C52711k.m112240b(paint, "paint");
        if (i + 1 >= i2) {
            return 0;
        }
        if (this.f67758a != -1.0f) {
            paint.setTextSize(this.f67758a);
        }
        String valueOf = String.valueOf(charSequence);
        if (valueOf != null) {
            String substring = valueOf.substring(i, i2);
            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            float f = this.f67765h;
            float f2 = this.f67759b;
            String str = "…";
            int measureText = (int) (paint.measureText(substring) + f2);
            if (f != 0.0f && ((float) measureText) > f) {
                if (f > C9432q.m18687b(this.f67766i, 5.0f)) {
                    f -= C9432q.m18687b(this.f67766i, 5.0f);
                }
                while (true) {
                    int length = substring.length() - 1;
                    int length2 = substring.length();
                    if (substring != null) {
                        substring = C52830p.m112427a((CharSequence) substring, length, length2).toString();
                        StringBuilder sb = new StringBuilder();
                        sb.append(substring);
                        sb.append(str);
                        if (((float) ((int) (paint.measureText(sb.toString()) + f2))) <= f && !Character.isHighSurrogate(substring.charAt(substring.length() - 1))) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(substring);
                            sb2.append(str);
                            substring = sb2.toString();
                            break;
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
            }
            this.f67767j = substring;
            this.f67761d = (int) (paint.measureText(this.f67767j) + this.f67759b);
            return this.f67761d;
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z;
        Canvas canvas2 = canvas;
        int i6 = i;
        float f2 = f;
        int i7 = i4;
        Paint paint2 = paint;
        C52711k.m112240b(canvas2, "canvas");
        C52711k.m112240b(paint2, "paint");
        if (i6 + 1 < i2) {
            if (((float) this.f67761d) + f2 > this.f67765h) {
                this.f67762e.setClickable(false);
                canvas2.drawText("…", f2, (float) i7, paint2);
                return;
            }
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || charSequence.length() <= i6 || charSequence.charAt(i) != 8230) {
                this.f67762e.setClickable(true);
                Typeface a = C10749b.m21787a().mo19435a(C10751d.f28908g);
                if (a != null) {
                    try {
                        paint2.setTypeface(a);
                    } catch (Exception unused) {
                    }
                }
                if (this.f67758a != -1.0f) {
                    paint2.setTextSize(this.f67758a);
                }
                FontMetrics fontMetrics = paint.getFontMetrics();
                paint2.setColor(this.f67763f);
                float f3 = (float) i7;
                float f4 = fontMetrics.top + f3;
                float f5 = fontMetrics.bottom + f3;
                canvas2.drawRoundRect(new RectF(f2, f4, ((float) this.f67761d) + f2, f5), this.f67760c, this.f67760c, paint2);
                if (this.f67767j.charAt(0) == '@') {
                    this.f67768k = paint2.measureText(String.valueOf(this.f67767j.charAt(0)));
                    String str = this.f67767j;
                    int length = this.f67767j.length();
                    if (str != null) {
                        String substring = str.substring(1, length);
                        C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        this.f67767j = substring;
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                }
                paint2.setColor(this.f67764g);
                canvas2.drawText(this.f67767j, (this.f67759b / 2.0f) + f2 + this.f67768k, f3 - C9432q.m18687b(this.f67766i, 1.0f), paint2);
                if (2 == this.f67762e.getSubtype()) {
                    int i8 = (int) f4;
                    int i9 = (int) f5;
                    Bitmap decodeResource = BitmapFactory.decodeResource(this.f67766i.getResources(), R.drawable.d13);
                    C52711k.m112236a((Object) decodeResource, "sourceBitmap");
                    int height = decodeResource.getHeight();
                    float f6 = (((float) (i9 - i8)) * 3.0f) / 5.0f;
                    float f7 = f6 / ((float) height);
                    Matrix matrix = new Matrix();
                    matrix.postScale(f7, f7);
                    canvas2.drawBitmap(Bitmap.createBitmap(decodeResource, 0, 0, height, height, matrix, true), f2 + (f6 / 2.0f), ((float) i8) + (f6 / 3.0f), paint2);
                    return;
                }
                if (!TextUtils.isEmpty(this.f67762e.getAwemeId())) {
                    int i10 = (int) f4;
                    int i11 = (int) f5;
                    paint2.setColor(-1);
                    paint2.setPathEffect(new CornerPathEffect(C9432q.m18687b(this.f67766i, 2.0f)));
                    Path path = new Path();
                    float b = C9432q.m18687b(this.f67766i, 10.0f);
                    float f8 = ((float) (i11 + i10)) / 2.0f;
                    float sqrt = (float) Math.sqrt((Math.pow((double) b, 2.0d) * 3.0d) / 4.0d);
                    float f9 = b / 2.0f;
                    path.moveTo((this.f67759b / 2.0f) + f2, f8 + f9);
                    path.lineTo((this.f67759b / 2.0f) + f2 + sqrt, f8);
                    path.lineTo(f2 + (this.f67759b / 2.0f), f8 - f9);
                    path.close();
                    canvas2.drawPath(path, paint2);
                }
                return;
            }
            this.f67762e.setClickable(false);
            canvas2.drawText("…", f2, (float) i7, paint2);
        }
    }
}
