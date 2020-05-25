package com.p683ss.android.ugc.aweme.main;

/* renamed from: com.ss.android.ugc.aweme.main.eg */
final /* synthetic */ class C36639eg implements Runnable {

    /* renamed from: a */
    private final TabChangeManager f93760a;

    /* renamed from: b */
    private final String f93761b;

    /* renamed from: c */
    private final boolean f93762c;

    /* renamed from: d */
    private final int f93763d;

    /* renamed from: e */
    private final boolean f93764e;

    C36639eg(TabChangeManager tabChangeManager, String str, boolean z, int i, boolean z2) {
        this.f93760a = tabChangeManager;
        this.f93761b = str;
        this.f93762c = z;
        this.f93763d = i;
        this.f93764e = z2;
    }

    public final void run() {
        this.f93760a.mo75616a(this.f93761b, this.f93762c, this.f93763d, this.f93764e);
    }
}
