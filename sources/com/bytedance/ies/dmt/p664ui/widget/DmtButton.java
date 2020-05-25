package com.bytedance.ies.dmt.p664ui.widget;

import android.content.Context;
import android.support.p043v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtButton */
public class DmtButton extends AppCompatButton {
    public DmtButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m21632a(AttributeSet attributeSet) {
        C10749b.m21787a().mo19437a((TextView) this, attributeSet);
    }

    public void setFontType(String str) {
        C10749b.m21787a().mo19438a((TextView) this, str);
    }

    public DmtButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m21632a(attributeSet);
    }

    public DmtButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m21632a(attributeSet);
    }
}
