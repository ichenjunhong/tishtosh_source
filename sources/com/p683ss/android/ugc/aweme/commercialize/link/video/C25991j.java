package com.p683ss.android.ugc.aweme.commercialize.link.video;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.j */
final /* synthetic */ class C25991j implements Runnable {

    /* renamed from: a */
    private final CommerceTagLayout f68614a;

    /* renamed from: b */
    private final C25993l f68615b;

    C25991j(CommerceTagLayout commerceTagLayout, C25993l lVar) {
        this.f68614a = commerceTagLayout;
        this.f68615b = lVar;
    }

    public final void run() {
        CommerceTagLayout commerceTagLayout = this.f68614a;
        C25993l lVar = this.f68615b;
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        lVar.mo53094c();
    }
}
