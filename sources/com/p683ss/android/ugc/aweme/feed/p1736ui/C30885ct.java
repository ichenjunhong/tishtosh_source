package com.p683ss.android.ugc.aweme.feed.p1736ui;

import com.p683ss.android.ugc.aweme.views.MentionTextView;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ct */
final /* synthetic */ class C30885ct implements Runnable {

    /* renamed from: a */
    private final C30879cr f80887a;

    /* renamed from: b */
    private final MentionTextView f80888b;

    /* renamed from: c */
    private final int f80889c;

    C30885ct(C30879cr crVar, MentionTextView mentionTextView, int i) {
        this.f80887a = crVar;
        this.f80888b = mentionTextView;
        this.f80889c = i;
    }

    public final void run() {
        C30879cr crVar = this.f80887a;
        MentionTextView mentionTextView = this.f80888b;
        int i = this.f80889c;
        crVar.f80869k = mentionTextView.getHeight();
        crVar.f80868j = (crVar.f80869k * i) / C30879cr.m72325a();
    }
}
