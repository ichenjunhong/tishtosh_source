package com.p683ss.android.ugc.aweme.notification;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;

/* renamed from: com.ss.android.ugc.aweme.notification.NewsFragment$5 */
class NewsFragment$5 extends ForegroundColorSpan {

    /* renamed from: a */
    final /* synthetic */ C38171e f96966a;

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    NewsFragment$5(C38171e eVar, int i) {
        this.f96966a = eVar;
        super(i);
    }
}
