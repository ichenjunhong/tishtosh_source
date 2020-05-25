package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.widget.DmtCheckedTextView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.DrawableTopLeftTextView */
public final class DrawableTopLeftTextView extends DmtCheckedTextView {
    public DrawableTopLeftTextView(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        if (!TextUtils.isEmpty(getText())) {
            m71997a(getCompoundDrawables());
            if (VERSION.SDK_INT >= 17) {
                m71997a(getCompoundDrawablesRelative());
            }
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private final void m71997a(Drawable[] drawableArr) {
        if (drawableArr != null) {
            Drawable drawable = drawableArr[0];
            if (drawable != null) {
                TextPaint paint = getPaint();
                C52711k.m112236a((Object) paint, "paint");
                FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                Rect rect = new Rect();
                getPaint().getTextBounds(getText().toString(), 0, length(), rect);
                int height = (((getHeight() - drawable.getIntrinsicHeight()) / 2) - (rect.top - fontMetricsInt.top)) - (getPaddingTop() / 2);
                drawable.setBounds(0, -height, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() - height);
            }
        }
    }

    public DrawableTopLeftTextView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public DrawableTopLeftTextView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet, i);
    }
}
