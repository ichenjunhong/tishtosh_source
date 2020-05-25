package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.content.Context;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.EPlatformSpanInterceptNoTextView */
public class EPlatformSpanInterceptNoTextView extends SpanInterceptNoTextView {

    /* renamed from: b */
    public int f90789b;

    /* renamed from: d */
    private View f90790d;

    /* access modifiers changed from: 0000 */
    public CharacterStyle getCharStyle() {
        return new ForegroundColorSpan(this.f90789b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1037a() {
        super.mo1037a();
        if (this.f90790d != null) {
            this.f90790d.performLongClick();
        }
    }

    public EPlatformSpanInterceptNoTextView(Context context) {
        super(context);
    }

    public void setContentArea(View view) {
        this.f90790d = view;
    }

    public EPlatformSpanInterceptNoTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EPlatformSpanInterceptNoTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
