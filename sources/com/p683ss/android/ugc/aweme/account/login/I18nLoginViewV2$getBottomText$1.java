package com.p683ss.android.ugc.aweme.account.login;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.I18nLoginViewV2$getBottomText$1 */
public final class I18nLoginViewV2$getBottomText$1 extends ForegroundColorSpan {

    /* renamed from: a */
    final /* synthetic */ int f57170a;

    public final void updateDrawState(TextPaint textPaint) {
        C52711k.m112240b(textPaint, "textPaint");
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    I18nLoginViewV2$getBottomText$1(int i, int i2) {
        this.f57170a = i;
        super(i2);
    }
}
