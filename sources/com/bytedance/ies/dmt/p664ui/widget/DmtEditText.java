package com.bytedance.ies.dmt.p664ui.widget;

import android.content.Context;
import android.support.p043v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtEditText */
public class DmtEditText extends AppCompatEditText {
    public DmtEditText(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m21649a(AttributeSet attributeSet) {
        C10749b.m21787a().mo19437a((TextView) this, attributeSet);
    }

    public void setFontType(String str) {
        C10749b.m21787a().mo19438a((TextView) this, str);
    }

    public DmtEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m21649a(attributeSet);
    }

    public DmtEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m21649a(attributeSet);
    }
}
