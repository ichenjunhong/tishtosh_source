package com.p683ss.android.ugc.aweme.notification.p2031ui;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.account.views.C22313c;

/* renamed from: com.ss.android.ugc.aweme.notification.ui.a */
public final class C38425a extends LinkMovementMethod {

    /* renamed from: b */
    private static C38425a f97806b;

    /* renamed from: a */
    private C22313c f97807a;

    /* renamed from: a */
    public static MovementMethod m85737a() {
        if (f97806b == null) {
            f97806b = new C38425a();
        }
        return f97806b;
    }

    /* renamed from: a */
    private static boolean m85739a(int i, Spannable spannable, Object obj) {
        if (i < spannable.getSpanStart(obj) || i > spannable.getSpanEnd(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private C22313c m85738a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
        C22313c[] cVarArr = (C22313c[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C22313c.class);
        if (cVarArr.length <= 0 || !m85739a(offsetForHorizontal, spannable, (Object) cVarArr[0])) {
            return null;
        }
        return cVarArr[0];
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            try {
                this.f97807a = m85738a(textView, spannable, motionEvent);
                if (this.f97807a != null) {
                    this.f97807a.f60109d = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(this.f97807a), spannable.getSpanEnd(this.f97807a));
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                C22313c a = m85738a(textView, spannable, motionEvent);
                if (!(this.f97807a == null || a == this.f97807a)) {
                    this.f97807a.f60109d = false;
                    this.f97807a = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException unused2) {
                return false;
            }
        } else {
            if (this.f97807a != null) {
                this.f97807a.f60109d = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f97807a = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
