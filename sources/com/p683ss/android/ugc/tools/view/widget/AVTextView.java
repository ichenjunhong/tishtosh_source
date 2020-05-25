package com.p683ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.support.p043v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.p683ss.android.ugc.tools.view.p2513f.C50238d;

/* renamed from: com.ss.android.ugc.tools.view.widget.AVTextView */
public class AVTextView extends AppCompatTextView {
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

    /* renamed from: a */
    private void m108478a(AttributeSet attributeSet) {
        C50238d.m108426a(this, attributeSet);
    }

    public AVTextView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
        } catch (NullPointerException unused) {
        }
    }

    public AVTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m108478a(attributeSet);
    }

    public AVTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m108478a(attributeSet);
    }
}
