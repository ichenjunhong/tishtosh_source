package com.p683ss.android.ugc.aweme.challenge.p1500ui.header;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.e */
public final class C24681e implements OnTouchListener {

    /* renamed from: a */
    private static C24681e f65326a;

    /* renamed from: a */
    public static C24681e m60183a() {
        if (f65326a == null) {
            f65326a = new C24681e();
        }
        return f65326a;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        TextView textView = (TextView) view;
        Spannable newSpannable = Factory.getInstance().newSpannable(textView.getText());
        int action = motionEvent.getAction();
        if (action != 1 && action != 0) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) totalPaddingLeft);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) newSpannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length == 0) {
            return false;
        }
        if (action == 1) {
            clickableSpanArr[0].onClick(textView);
        }
        return true;
    }
}
