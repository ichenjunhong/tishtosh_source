package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48159c;

/* renamed from: com.ss.android.ugc.aweme.views.ClickSpanWorkaroundTextView */
public class ClickSpanWorkaroundTextView extends DmtTextView {

    /* renamed from: b */
    private C48159c f121033b;

    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e) {
            C32458a.m75143a(e);
            return null;
        }
    }

    public ClickSpanWorkaroundTextView(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
        switch (motionEvent.getAction()) {
            case 0:
                C48159c cVar = (C48159c) m104349a(motionEvent, C48159c.class);
                if (cVar != null) {
                    cVar.mo95561a(true);
                    this.f121033b = cVar;
                    return true;
                } else if (m104349a(motionEvent, ClickableSpan.class) != null) {
                    return true;
                } else {
                    return false;
                }
            case 1:
                if (this.f121033b == null || this.f121033b != m104349a(motionEvent, C48159c.class)) {
                    return false;
                }
                this.f121033b.mo95561a(false);
                this.f121033b = null;
                return true;
            case 2:
                if (!(this.f121033b == null || this.f121033b == m104349a(motionEvent, C48159c.class))) {
                    this.f121033b.mo95561a(false);
                    this.f121033b = null;
                }
                return false;
            case 3:
                if (this.f121033b != null) {
                    this.f121033b.mo95561a(false);
                    this.f121033b = null;
                }
                return false;
            default:
                return false;
        }
    }

    public ClickSpanWorkaroundTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private <T extends ClickableSpan> T m104349a(MotionEvent motionEvent, Class<T> cls) {
        boolean z;
        T t = null;
        if (!(getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) getText();
        int x = (((int) motionEvent.getX()) - getTotalPaddingLeft()) + getScrollX();
        int y = (((int) motionEvent.getY()) - getTotalPaddingTop()) + getScrollY();
        Layout layout = getLayout();
        try {
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
            T[] tArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, cls);
            if (tArr.length > 0) {
                T t2 = tArr[0];
                if (offsetForHorizontal < spanned.getSpanStart(t2) || offsetForHorizontal > spanned.getSpanEnd(t2)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    t = tArr[0];
                }
            }
            return t;
        } catch (Exception unused) {
            return null;
        }
    }

    public ClickSpanWorkaroundTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
