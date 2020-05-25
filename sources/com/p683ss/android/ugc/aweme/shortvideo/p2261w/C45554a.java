package com.p683ss.android.ugc.aweme.shortvideo.p2261w;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.w.a */
public final class C45554a extends ReplacementSpan {

    /* renamed from: a */
    private int f115107a;

    /* renamed from: b */
    private final float f115108b = 22.0f;

    /* renamed from: c */
    private final float f115109c = 15.0f;

    /* renamed from: d */
    private final float f115110d = 17.0f;

    /* renamed from: e */
    private final float f115111e = 10.0f;

    /* renamed from: f */
    private final float f115112f = 5.0f;

    /* renamed from: g */
    private String f115113g = "";

    /* renamed from: h */
    private final Context f115114h;

    /* renamed from: i */
    private final View f115115i;

    public C45554a(Context context, View view) {
        C52711k.m112240b(context, "mContext");
        C52711k.m112240b(view, "mView");
        this.f115114h = context;
        this.f115115i = view;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        C52711k.m112240b(paint, "paint");
        C52711k.m112240b(charSequence, "text");
        int i3 = i + 1;
        if (i3 >= i2) {
            return 0;
        }
        paint.setTextSize(C9432q.m18687b(this.f115114h, this.f115109c - 2.0f));
        this.f115107a = (int) (paint.measureText(charSequence, i3, i2) + C9432q.m18687b(this.f115114h, this.f115108b));
        if ((this.f115115i instanceof C45555b) && this.f115107a >= ((C45555b) this.f115115i).getHookAtMaxWidth()) {
            int hookAtMaxWidth = ((C45555b) this.f115115i).getHookAtMaxWidth();
            float b = C9432q.m18687b(this.f115114h, this.f115108b + 2.0f);
            C52711k.m112240b(charSequence, "text");
            C52711k.m112240b(paint, "paint");
            String str = "…";
            String obj = charSequence.subSequence(i3, i2).toString();
            int measureText = (int) (paint.measureText(obj) + b);
            if (hookAtMaxWidth == 0 || measureText <= hookAtMaxWidth) {
                str = "";
            } else {
                while (true) {
                    if (obj.length() == 1) {
                        break;
                    }
                    int length = obj.length() - 1;
                    int length2 = obj.length();
                    if (obj != null) {
                        obj = C52830p.m112427a((CharSequence) obj, length, length2).toString();
                        StringBuilder sb = new StringBuilder();
                        sb.append(obj);
                        sb.append(str);
                        if (((int) (paint.measureText(sb.toString()) + b)) <= hookAtMaxWidth && !Character.isHighSurrogate(obj.charAt(obj.length() - 1))) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(obj);
                            sb2.append(str);
                            str = sb2.toString();
                            break;
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
            }
            this.f115113g = str;
            this.f115107a = (int) (paint.measureText(this.f115113g) + C9432q.m18687b(this.f115114h, this.f115108b));
        }
        return this.f115107a;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Canvas canvas2 = canvas;
        int i6 = i;
        float f2 = f;
        int i7 = i4;
        Paint paint2 = paint;
        C52711k.m112240b(canvas2, "canvas");
        C52711k.m112240b(charSequence, "text");
        C52711k.m112240b(paint2, "paint");
        int i8 = i6 + 1;
        if (i8 < i2) {
            if (((float) this.f115107a) + f2 > ((float) this.f115115i.getWidth())) {
                canvas2.drawText("…", f2, (float) i7, paint2);
            } else if (charSequence.length() <= i6 || charSequence.charAt(i) != 8230) {
                paint2.setAntiAlias(true);
                int color = paint.getColor();
                PathEffect pathEffect = paint.getPathEffect();
                paint2.setTextSize(C9432q.m18687b(this.f115114h, this.f115109c));
                paint2.setColor(Color.parseColor("#0B161823"));
                paint2.setPathEffect(new CornerPathEffect(C9432q.m18687b(this.f115114h, 2.0f)));
                FontMetrics fontMetrics = paint.getFontMetrics();
                float f3 = fontMetrics.top;
                float f4 = fontMetrics.bottom;
                float f5 = (float) i7;
                float f6 = f5 + f3;
                canvas2.drawRect(new RectF(f2, f6, ((float) this.f115107a) + f2, f5 + f4), paint2);
                paint2.setColor(color);
                float f7 = f4 - f3;
                float b = C9432q.m18687b(this.f115114h, this.f115111e);
                float f8 = (f7 - b) / 2.0f;
                float b2 = C9432q.m18687b(this.f115114h, this.f115112f);
                Path path = new Path();
                float f9 = b2 + f2;
                float f10 = f6 + f8;
                path.moveTo(f9, f10);
                path.lineTo(f9, f10 + b);
                path.lineTo(f9 + (0.86f * b), f10 + (b / 2.0f));
                path.close();
                canvas2.drawPath(path, paint2);
                paint2.setPathEffect(pathEffect);
                paint2.setFakeBoldText(true);
                paint2.setTextSize(C9432q.m18687b(this.f115114h, this.f115109c - 2.0f));
                if (TextUtils.isEmpty(this.f115113g)) {
                    canvas.drawText(charSequence, i8, i2, f2 + C9432q.m18687b(this.f115114h, this.f115110d), f5 - C9432q.m18687b(this.f115114h, 1.0f), paint);
                    return;
                }
                canvas2.drawText(this.f115113g, f2 + C9432q.m18687b(this.f115114h, this.f115110d), f5 - C9432q.m18687b(this.f115114h, 1.0f), paint2);
            } else {
                canvas2.drawText("…", f2, (float) i7, paint2);
            }
        }
    }
}
