package com.p683ss.android.ugc.aweme.commercialize.link.video;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.d */
final /* synthetic */ class C25985d implements Runnable {

    /* renamed from: a */
    private final CommerceTagLayout f68604a;

    /* renamed from: b */
    private final C25993l f68605b;

    C25985d(CommerceTagLayout commerceTagLayout, C25993l lVar) {
        this.f68604a = commerceTagLayout;
        this.f68605b = lVar;
    }

    public final void run() {
        CommerceTagLayout commerceTagLayout = this.f68604a;
        C25993l lVar = this.f68605b;
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        lVar.mo53094c();
    }
}
