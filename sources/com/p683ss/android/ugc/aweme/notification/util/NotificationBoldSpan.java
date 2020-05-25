package com.p683ss.android.ugc.aweme.notification.util;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.util.NotificationBoldSpan */
public class NotificationBoldSpan extends ForegroundColorSpan {
    public NotificationBoldSpan() {
        super(C11010c.m22280a().getResources().getColor(R.color.a1k));
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }
}
