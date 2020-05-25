package com.p683ss.android.ugc.aweme.comment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.text.style.ReplacementSpan;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.q */
final class C25276q extends ReplacementSpan {

    /* renamed from: a */
    public static final C25277a f66868a = new C25277a(null);

    /* renamed from: b */
    private final Context f66869b = C11010c.m22280a();

    /* renamed from: c */
    private final Drawable f66870c;

    /* renamed from: d */
    private final String f66871d;

    /* renamed from: e */
    private final int f66872e;

    /* renamed from: f */
    private final float f66873f;

    /* renamed from: g */
    private final float f66874g;

    /* renamed from: com.ss.android.ugc.aweme.comment.q$a */
    static final class C25277a {
        private C25277a() {
        }

        public /* synthetic */ C25277a(C52707g gVar) {
            this();
        }
    }

    public C25276q() {
        Drawable a = C0726c.m2091a(this.f66869b, (int) R.drawable.cj9);
        if (a != null) {
            a.setBounds(new Rect(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight()));
        } else {
            a = null;
        }
        this.f66870c = a;
        this.f66871d = this.f66869b.getString(R.string.ax_);
        this.f66872e = C0726c.m2098c(this.f66869b, R.color.er);
        this.f66873f = C9432q.m18687b(this.f66869b, 2.0f);
        this.f66874g = C9432q.m18669a(this.f66869b, 13.0f);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        int i3;
        C52711k.m112240b(paint, "paint");
        Drawable drawable = this.f66870c;
        if (drawable != null) {
            i3 = drawable.getIntrinsicWidth();
        } else {
            i3 = 0;
        }
        return i3 + ((int) paint.measureText(this.f66871d)) + ((int) (this.f66873f * 2.0f));
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C52711k.m112240b(canvas, "canvas");
        C52711k.m112240b(paint, "paint");
        float textSize = ((float) i4) - ((paint.getTextSize() - this.f66874g) / 2.0f);
        Drawable drawable = this.f66870c;
        if (drawable != null) {
            canvas.save();
            canvas.translate(this.f66873f + f, ((float) i3) + (((float) ((i5 - i3) - drawable.getIntrinsicHeight())) / 2.0f));
            drawable.draw(canvas);
            f += ((float) drawable.getIntrinsicWidth()) + (this.f66873f * 2.0f);
            canvas.restore();
        }
        paint.setColor(this.f66872e);
        paint.setTextSize(this.f66874g);
        canvas.drawText(this.f66871d, f, textSize, paint);
    }
}
