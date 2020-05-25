package com.p683ss.android.ugc.aweme.feed.p1736ui;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dh */
final /* synthetic */ class C30903dh implements Runnable {

    /* renamed from: a */
    private final C308911 f80938a;

    /* renamed from: b */
    private final int f80939b;

    /* renamed from: c */
    private final Aweme f80940c;

    C30903dh(C308911 r1, int i, Aweme aweme) {
        this.f80938a = r1;
        this.f80939b = i;
        this.f80940c = aweme;
    }

    public final void run() {
        C308911 r0 = this.f80938a;
        int i = this.f80939b;
        Aweme aweme = this.f80940c;
        C30890cy.this.f80914z = C30890cy.this.f80904p.getHeight();
        C30890cy.this.f80912x = (C30890cy.this.f80914z * i) / C30890cy.m72340a(aweme);
        C30890cy.this.mo63649a(true);
    }
}
