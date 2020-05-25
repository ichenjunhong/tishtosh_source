package com.bytedance.ies.dmt.p664ui.widget;

import android.content.Context;
import android.support.p043v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtTextView */
public class DmtTextView extends AppCompatTextView {
    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Exception unused) {
            getText();
            return false;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", text: ");
        sb.append(getText());
        return sb.toString();
    }

    public DmtTextView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19032a(AttributeSet attributeSet) {
        C10749b.m21787a().mo19437a((TextView) this, attributeSet);
    }

    public void setFontType(String str) {
        C10749b.m21787a().mo19438a((TextView) this, str);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
        } catch (NullPointerException unused) {
        }
    }

    public DmtTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo19032a(attributeSet);
    }

    public DmtTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo19032a(attributeSet);
    }
}
