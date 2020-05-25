package com.p683ss.android.ugc.aweme.tools.draft;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.w */
final /* synthetic */ class C47024w implements Runnable {

    /* renamed from: a */
    private final C47022a f118768a;

    /* renamed from: b */
    private final int f118769b;

    C47024w(C47022a aVar, int i) {
        this.f118768a = aVar;
        this.f118769b = i;
    }

    public final void run() {
        C47022a aVar = this.f118768a;
        int i = this.f118769b;
        if (aVar.f118765f != null) {
            aVar.f118765f.setProgress(i);
        }
    }
}
