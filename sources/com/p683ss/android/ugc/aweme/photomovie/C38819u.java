package com.p683ss.android.ugc.aweme.photomovie;

import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.photomovie.u */
final /* synthetic */ class C38819u implements C52670a {

    /* renamed from: a */
    private final C38805m f98785a;

    C38819u(C38805m mVar) {
        this.f98785a = mVar;
    }

    public final Object invoke() {
        C38805m mVar = this.f98785a;
        if (mVar.f98746b != null && mVar.f98746b.isShowing() && mVar.getActivity() != null && !mVar.getActivity().isFinishing()) {
            mVar.f98746b.dismiss();
            mVar.f98746b = null;
        }
        return null;
    }
}
