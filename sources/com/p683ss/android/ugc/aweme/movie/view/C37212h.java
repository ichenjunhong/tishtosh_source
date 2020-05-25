package com.p683ss.android.ugc.aweme.movie.view;

import android.support.p030v4.app.Fragment;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.feed.service.IMovieRecordService;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.share.C42250w;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.movie.view.h */
public final class C37212h implements IMovieRecordService {
    public final void startRecordMovie(Fragment fragment, String str) {
        C52711k.m112240b(fragment, "fragment");
        if (str != null) {
            if (TimeLockRuler.isTeenModeON()) {
                C10691a.m21551c(fragment.getContext(), fragment.getString(R.string.dw2)).mo19066a();
            } else if (AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().checkIsAlreadyPublished(fragment.getContext())) {
                C42250w wVar = new C42250w(fragment.getContext());
                wVar.f106814c = "mv_page";
                wVar.f106815d = "mv_page";
                wVar.mo86228b(str, 1);
            }
        }
    }

    public final void startRecordMovie(Fragment fragment, String str, int i) {
        C52711k.m112240b(fragment, "fragment");
        startRecordMovie(fragment, str);
    }
}
