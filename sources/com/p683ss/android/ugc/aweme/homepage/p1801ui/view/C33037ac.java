package com.p683ss.android.ugc.aweme.homepage.p1801ui.view;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.ac */
final /* synthetic */ class C33037ac implements Runnable {

    /* renamed from: a */
    private final MainTabStrip f85828a;

    C33037ac(MainTabStrip mainTabStrip) {
        this.f85828a = mainTabStrip;
    }

    public final void run() {
        MainTabStrip mainTabStrip = this.f85828a;
        mainTabStrip.f85782f.setVisibility(8);
        mainTabStrip.f85780d.setVisibility(0);
        mainTabStrip.post(new C33079s(mainTabStrip));
    }
}
