package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TabItemView */
public class TabItemView extends ConstraintLayout {

    /* renamed from: h */
    private TextView f115302h;

    /* renamed from: i */
    private TextView f115303i;

    public TextView getTextView() {
        return this.f115302h;
    }

    public CharSequence getTagText() {
        return this.f115303i.getText();
    }

    /* renamed from: c */
    public final boolean mo91956c() {
        if (this.f115303i.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo91955b() {
        this.f115302h.setPadding(this.f115302h.getTotalPaddingLeft(), this.f115302h.getTotalPaddingTop(), this.f115302h.getTotalPaddingLeft(), this.f115302h.getTotalPaddingBottom());
        this.f115303i.setVisibility(8);
    }

    public TabItemView(Context context) {
        this(context, null);
    }

    public void setTextColor(int i) {
        this.f115302h.setTextColor(i);
    }

    public void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f115302h.setText(str);
        }
    }

    /* renamed from: a */
    public final void mo91954a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f115303i.setVisibility(0);
            this.f115303i.setText(str);
            this.f115302h.setPadding(this.f115302h.getTotalPaddingLeft(), this.f115302h.getTotalPaddingTop(), (int) C9432q.m18687b(getContext(), 28.0f), this.f115302h.getTotalPaddingBottom());
        }
    }

    public TabItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.bv0, this, true);
        this.f115302h = (TextView) inflate.findViewById(R.id.cwx);
        this.f115303i = (TextView) inflate.findViewById(R.id.ez7);
    }
}
