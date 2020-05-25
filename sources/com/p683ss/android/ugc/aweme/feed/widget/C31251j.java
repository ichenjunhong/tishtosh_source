package com.p683ss.android.ugc.aweme.feed.widget;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.j */
public final class C31251j extends BaseMovementMethod {

    /* renamed from: a */
    private static C31251j f81852a;

    /* renamed from: a */
    public static C31251j m72964a() {
        if (f81852a == null) {
            f81852a = new C31251j();
        }
        return f81852a;
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
            int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            int lineForVertical = layout.getLineForVertical(y);
            float f = (float) totalPaddingLeft;
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && action == 1) {
                if (f >= ((float) textView.getWidth()) - textView.getPaint().measureText(textView.getText().subSequence(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical)).toString())) {
                    clickableSpanArr[0].onClick(textView);
                }
            }
            return true;
        }
        return true;
    }
}
