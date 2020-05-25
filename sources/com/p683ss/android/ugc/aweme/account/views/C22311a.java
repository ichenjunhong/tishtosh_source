package com.p683ss.android.ugc.aweme.account.views;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.account.views.a */
public final class C22311a extends LinkMovementMethod {

    /* renamed from: b */
    private static C22311a f60102b;

    /* renamed from: a */
    private C22313c f60103a;

    /* renamed from: a */
    public static MovementMethod m55214a() {
        if (f60102b == null) {
            f60102b = new C22311a();
        }
        return f60102b;
    }

    /* renamed from: a */
    private static boolean m55216a(int i, Spannable spannable, Object obj) {
        if (i < spannable.getSpanStart(obj) || i > spannable.getSpanEnd(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private C22313c m55215a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
        C22313c[] cVarArr = (C22313c[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C22313c.class);
        if (cVarArr.length <= 0 || !m55216a(offsetForHorizontal, spannable, (Object) cVarArr[0])) {
            return null;
        }
        return cVarArr[0];
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f60103a = m55215a(textView, spannable, motionEvent);
            if (this.f60103a != null) {
                this.f60103a.f60109d = true;
                Selection.setSelection(spannable, spannable.getSpanStart(this.f60103a), spannable.getSpanEnd(this.f60103a));
            }
        } else if (motionEvent.getAction() == 2) {
            C22313c a = m55215a(textView, spannable, motionEvent);
            if (!(this.f60103a == null || a == this.f60103a)) {
                this.f60103a.f60109d = false;
                this.f60103a = null;
                Selection.removeSelection(spannable);
            }
        } else {
            if (this.f60103a != null) {
                this.f60103a.f60109d = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f60103a = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
