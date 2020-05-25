package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.account.views.C22313c;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.ae */
public final class C24631ae extends LinkMovementMethod {

    /* renamed from: b */
    private static C24631ae f65185b;

    /* renamed from: a */
    private C22313c f65186a;

    /* renamed from: a */
    public static MovementMethod m60124a() {
        if (f65185b == null) {
            f65185b = new C24631ae();
        }
        return f65185b;
    }

    /* renamed from: a */
    private static boolean m60126a(int i, Spannable spannable, Object obj) {
        if (i < spannable.getSpanStart(obj) || i > spannable.getSpanEnd(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private C22313c m60125a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
        C22313c[] cVarArr = (C22313c[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C22313c.class);
        if (cVarArr.length <= 0 || !m60126a(offsetForHorizontal, spannable, (Object) cVarArr[0])) {
            return null;
        }
        return cVarArr[0];
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            try {
                this.f65186a = m60125a(textView, spannable, motionEvent);
                if (this.f65186a != null) {
                    this.f65186a.f60109d = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(this.f65186a), spannable.getSpanEnd(this.f65186a));
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                C22313c a = m60125a(textView, spannable, motionEvent);
                if (!(this.f65186a == null || a == this.f65186a)) {
                    this.f65186a.f60109d = false;
                    this.f65186a = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException unused2) {
                return false;
            }
        } else {
            if (this.f65186a != null) {
                this.f65186a.f60109d = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f65186a = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
