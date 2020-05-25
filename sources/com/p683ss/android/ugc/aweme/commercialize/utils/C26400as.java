package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.as */
public final class C26400as extends BaseMovementMethod {

    /* renamed from: a */
    public static final C26400as f69645a = new C26400as();

    private C26400as() {
    }

    public final boolean canSelectArbitrarily() {
        return false;
    }

    public final void initialize(TextView textView, Spannable spannable) {
        C52711k.m112240b(textView, "widget");
        C52711k.m112240b(spannable, "text");
        Selection.removeSelection(spannable);
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        boolean z;
        C52711k.m112240b(textView, "widget");
        C52711k.m112240b(spannable, "buffer");
        C52711k.m112240b(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
            int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) totalPaddingLeft);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            C52711k.m112236a((Object) clickableSpanArr, "link");
            if (clickableSpanArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (actionMasked == 1) {
                    clickableSpanArr[0].onClick(textView);
                } else {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return false;
    }
}
