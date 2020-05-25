package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.ah */
public final class C24635ah extends ImageSpan {

    /* renamed from: b */
    private static int f65198b;

    /* renamed from: a */
    private Context f65199a;

    /* renamed from: c */
    private WeakReference<Drawable> f65200c;

    /* renamed from: a */
    private Drawable m60136a() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f65200c;
        if (weakReference != null) {
            drawable = (Drawable) weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.f65200c = new WeakReference<>(drawable2);
        return drawable2;
    }

    public C24635ah(Context context, int i) {
        super(context, R.drawable.cr5);
        this.f65199a = context;
        f65198b = (int) C9432q.m18687b(this.f65199a, 2.0f);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        Rect bounds = m60136a().getBounds();
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt();
            fontMetricsInt.ascent = (-bounds.bottom) - ((paint.getFontMetricsInt().ascent - paint.getFontMetricsInt().top) + f65198b);
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable a = m60136a();
        canvas.save();
        canvas.translate(f, (float) (((i3 + paint.getFontMetricsInt().ascent) - paint.getFontMetricsInt().top) + f65198b));
        a.draw(canvas);
        canvas.restore();
    }
}
