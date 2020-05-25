package com.bytedance.ies.dmt.p664ui.titlebar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p664ui.common.C10682e;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;

/* renamed from: com.bytedance.ies.dmt.ui.titlebar.AbstractTitleBar */
public abstract class AbstractTitleBar extends FrameLayout implements C10682e {

    /* renamed from: a */
    protected DmtTextView f28545a;

    /* renamed from: b */
    protected int f28546b;

    /* renamed from: a */
    public abstract void mo19029a(int i);

    /* renamed from: a */
    public abstract void mo19128a(boolean z);

    public int getColorMode() {
        return this.f28546b;
    }

    public DmtTextView getTitleView() {
        return this.f28545a;
    }

    public abstract void setDividerLineBackground(int i);

    public AbstractTitleBar(Context context) {
        super(context);
    }

    public void setColorMode(int i) {
        if (this.f28546b != i) {
            this.f28546b = i;
            mo19029a(this.f28546b);
        }
        this.f28546b = i;
    }

    public void setTitle(int i) {
        if (this.f28545a != null) {
            this.f28545a.setText(i);
        }
    }

    public void setTitleColor(int i) {
        if (this.f28545a != null) {
            this.f28545a.setTextColor(i);
        }
    }

    public void setTitleSize(float f) {
        if (this.f28545a != null) {
            this.f28545a.setTextSize(f);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (this.f28545a != null) {
            this.f28545a.setText(charSequence);
        }
    }

    public AbstractTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
