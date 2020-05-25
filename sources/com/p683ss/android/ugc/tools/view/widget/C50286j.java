package com.p683ss.android.ugc.tools.view.widget;

/* renamed from: com.ss.android.ugc.tools.view.widget.j */
public final /* synthetic */ class C50286j implements Runnable {

    /* renamed from: a */
    private final CheckableImageView f126166a;

    /* renamed from: b */
    private final int f126167b;

    public C50286j(CheckableImageView checkableImageView, int i) {
        this.f126166a = checkableImageView;
        this.f126167b = i;
    }

    public final void run() {
        CheckableImageView checkableImageView = this.f126166a;
        int i = this.f126167b;
        if (checkableImageView.f125964a != null) {
            checkableImageView.f125964a.mo92236a(1);
        }
        checkableImageView.postDelayed(new C50287k(checkableImageView), (long) (i / 2));
    }
}
