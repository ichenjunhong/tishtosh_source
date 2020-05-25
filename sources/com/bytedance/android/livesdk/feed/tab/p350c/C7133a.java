package com.bytedance.android.livesdk.feed.tab.p350c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.feed.tab.c.a */
public final class C7133a extends LinearLayout {

    /* renamed from: a */
    CheckedTextView f19360a = ((CheckedTextView) findViewById(R.id.d5c));

    /* renamed from: b */
    ImageView f19361b = ((ImageView) findViewById(R.id.d5b));

    public final void setText(String str) {
        this.f19360a.setText(str);
    }

    public final void setTextColor(ColorStateList colorStateList) {
        this.f19360a.setTextColor(colorStateList);
    }

    public final void setIndicatorWidth(int i) {
        LayoutParams layoutParams = this.f19361b.getLayoutParams();
        layoutParams.width = i;
        this.f19361b.setLayoutParams(layoutParams);
    }

    public C7133a(Context context) {
        super(context);
        inflate(context, R.layout.amz, this);
    }

    public final void setChecked(boolean z) {
        this.f19360a.setChecked(z);
        if (z) {
            this.f19360a.setTypeface(Typeface.DEFAULT_BOLD);
            this.f19361b.setVisibility(0);
            return;
        }
        this.f19360a.setTypeface(Typeface.DEFAULT);
        this.f19361b.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo13255a(int i, float f) {
        this.f19360a.setTextSize(1, 16.0f);
    }
}
