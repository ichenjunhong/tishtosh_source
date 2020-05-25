package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44081b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aj */
final /* synthetic */ class C44101aj implements C44080a {

    /* renamed from: a */
    private final MvImageChooseAdapter f111725a;

    /* renamed from: b */
    private final C44085f f111726b;

    C44101aj(MvImageChooseAdapter mvImageChooseAdapter, C44085f fVar) {
        this.f111725a = mvImageChooseAdapter;
        this.f111726b = fVar;
    }

    /* renamed from: a */
    public final void mo89971a() {
        MvImageChooseAdapter mvImageChooseAdapter = this.f111725a;
        C44085f fVar = this.f111726b;
        if (mvImageChooseAdapter.f111636d.size() == mvImageChooseAdapter.f111633a) {
            mvImageChooseAdapter.mo89963a();
            if (mvImageChooseAdapter.f111639g != null) {
                mvImageChooseAdapter.f111642j = mvImageChooseAdapter.f111639g.mo89944a(fVar.f111672g, true);
                mvImageChooseAdapter.f111639g.mo89946a(mvImageChooseAdapter.f111636d, C44081b.THUMBNAIL);
            }
        } else {
            mvImageChooseAdapter.f111636d.add(fVar.f111672g);
            mvImageChooseAdapter.f111637e.put(fVar.f111672g.f95383b, fVar.f111672g);
            if (mvImageChooseAdapter.f111639g != null) {
                mvImageChooseAdapter.f111642j = mvImageChooseAdapter.f111639g.mo89944a(fVar.f111672g, true);
                mvImageChooseAdapter.f111639g.mo89946a(mvImageChooseAdapter.f111636d, C44081b.THUMBNAIL);
            }
            fVar.f111672g.f111662r = mvImageChooseAdapter.f111642j;
            if (mvImageChooseAdapter.f111636d.size() == mvImageChooseAdapter.f111633a) {
                mvImageChooseAdapter.mo89963a();
                mvImageChooseAdapter.notifyItemChanged(fVar.f111674i, new Object());
            } else {
                mvImageChooseAdapter.notifyItemChanged(fVar.f111674i, new Object());
            }
        }
        fVar.f111670e.setVisibility(0);
        fVar.f111670e.animate().alpha(1.0f).setDuration(300).start();
    }
}
