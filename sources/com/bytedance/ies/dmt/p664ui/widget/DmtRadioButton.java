package com.bytedance.ies.dmt.p664ui.widget;

import android.content.Context;
import android.support.p043v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtRadioButton */
public class DmtRadioButton extends AppCompatRadioButton {
    public DmtRadioButton(Context context) {
        this(context, null, R.attr.xp);
    }

    public void setFontType(String str) {
        C10749b.m21787a().mo19438a((TextView) this, str);
    }

    public DmtRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.xp);
    }

    public DmtRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10749b.m21787a().mo19437a((TextView) this, attributeSet);
    }
}
