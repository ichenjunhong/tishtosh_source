package com.bytedance.android.livesdk.chatroom.p325ui;

import android.os.SystemClock;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.do */
public final class C6113do extends LinkMovementMethod {

    /* renamed from: c */
    private static C6113do f16382c;

    /* renamed from: a */
    private final long f16383a = ((long) ViewConfiguration.getLongPressTimeout());

    /* renamed from: b */
    private long f16384b;

    private C6113do() {
    }

    /* renamed from: a */
    public static C6113do m13282a() {
        if (f16382c == null) {
            f16382c = new C6113do();
        }
        return f16382c;
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
            int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            try {
                int lineForVertical = layout.getLineForVertical(y);
                if (lineForVertical >= layout.getLineCount()) {
                    return false;
                }
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) x);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        if (!(clickableSpanArr[0] instanceof C6114dp)) {
                            clickableSpanArr[0].onClick(textView);
                        } else if (this.f16384b <= 0 || SystemClock.elapsedRealtime() - this.f16384b < this.f16383a) {
                            clickableSpanArr[0].onClick(textView);
                        } else {
                            ((C6114dp) clickableSpanArr[0]).mo12150a(textView);
                        }
                        this.f16384b = 0;
                    } else if (action == 0) {
                        Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                        this.f16384b = SystemClock.elapsedRealtime();
                    }
                    return true;
                }
                Selection.removeSelection(spannable);
            } catch (Exception unused) {
                return false;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
