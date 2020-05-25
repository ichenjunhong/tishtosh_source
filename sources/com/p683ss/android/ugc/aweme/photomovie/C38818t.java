package com.p683ss.android.ugc.aweme.photomovie;

import com.p683ss.android.ugc.aweme.shortvideo.view.C45546c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.photomovie.t */
final /* synthetic */ class C38818t implements C52670a {

    /* renamed from: a */
    private final C38805m f98784a;

    C38818t(C38805m mVar) {
        this.f98784a = mVar;
    }

    public final Object invoke() {
        C38805m mVar = this.f98784a;
        if (mVar.f98746b == null && mVar.getActivity() != null && !mVar.getActivity().isFinishing()) {
            mVar.f98746b = C45546c.m99207a(mVar.getActivity(), mVar.getString(R.string.d7z));
        }
        return null;
    }
}
