package com.p683ss.android.ugc.aweme.donation;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.donation.DonationVH$bind$$inlined$apply$lambda$1 */
public final class DonationVH$bind$$inlined$apply$lambda$1 extends ForegroundColorSpan {

    /* renamed from: a */
    final /* synthetic */ C29043h f75936a;

    /* renamed from: b */
    final /* synthetic */ String f75937b;

    /* renamed from: c */
    final /* synthetic */ String f75938c;

    public final void updateDrawState(TextPaint textPaint) {
        C52711k.m112240b(textPaint, "textPaint");
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    DonationVH$bind$$inlined$apply$lambda$1(int i, C29043h hVar, String str, String str2) {
        this.f75936a = hVar;
        this.f75937b = str;
        this.f75938c = str2;
        super(i);
    }
}
