package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44081b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.am */
final /* synthetic */ class C44104am implements C44080a {

    /* renamed from: a */
    private final MvImageChooseAdapter f111732a;

    /* renamed from: b */
    private final MyMediaModel f111733b;

    C44104am(MvImageChooseAdapter mvImageChooseAdapter, MyMediaModel myMediaModel) {
        this.f111732a = mvImageChooseAdapter;
        this.f111733b = myMediaModel;
    }

    /* renamed from: a */
    public final void mo89971a() {
        MvImageChooseAdapter mvImageChooseAdapter = this.f111732a;
        MyMediaModel myMediaModel = this.f111733b;
        if (mvImageChooseAdapter.f111636d.size() == mvImageChooseAdapter.f111633a) {
            mvImageChooseAdapter.notifyDataSetChanged();
            if (mvImageChooseAdapter.f111639g != null) {
                mvImageChooseAdapter.f111642j = mvImageChooseAdapter.f111639g.mo89944a(myMediaModel, true);
                mvImageChooseAdapter.f111639g.mo89946a(mvImageChooseAdapter.f111636d, C44081b.PREVIEW);
            }
        } else {
            mvImageChooseAdapter.f111636d.add(myMediaModel);
            mvImageChooseAdapter.f111637e.put(myMediaModel.f95383b, myMediaModel);
            if (mvImageChooseAdapter.f111639g != null) {
                mvImageChooseAdapter.f111642j = mvImageChooseAdapter.f111639g.mo89944a(myMediaModel, true);
                mvImageChooseAdapter.f111639g.mo89946a(mvImageChooseAdapter.f111636d, C44081b.PREVIEW);
            }
            myMediaModel.f111662r = mvImageChooseAdapter.f111642j;
            if (mvImageChooseAdapter.f111636d.size() == mvImageChooseAdapter.f111633a) {
                mvImageChooseAdapter.notifyDataSetChanged();
                return;
            }
            mvImageChooseAdapter.mo89967b();
        }
    }
}
