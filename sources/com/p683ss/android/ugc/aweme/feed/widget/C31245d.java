package com.p683ss.android.ugc.aweme.feed.widget;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.d */
public class C31245d extends BaseMovementMethod {

    /* renamed from: a */
    private static C31245d f81821a;

    private C31245d() {
    }

    /* renamed from: a */
    public static C31245d m72956a() {
        if (f81821a == null) {
            synchronized (C31245d.class) {
                if (f81821a == null) {
                    f81821a = new C31245d();
                }
            }
        }
        return f81821a;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
            int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) totalPaddingLeft);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && action == 1) {
                clickableSpanArr[0].onClick(textView);
            }
            return true;
        }
        return true;
    }
}
