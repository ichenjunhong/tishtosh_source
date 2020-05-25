package com.p683ss.android.ugc.aweme.comment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.comment.m */
final /* synthetic */ class C25270m implements OnClickListener {

    /* renamed from: a */
    private final C25156f f66856a;

    C25270m(C25156f fVar) {
        this.f66856a = fVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        C25156f fVar = this.f66856a;
        if (i == 0) {
            Aweme h = fVar.f66586b.mo51787h();
            FragmentActivity activity = fVar.f66585a.getActivity();
            if (activity != null) {
                String str2 = null;
                if (h != null) {
                    str2 = h.getAid();
                    str = h.getAuthorUid();
                } else {
                    str = null;
                }
                C25282a.m61494a().report(activity, h, str2, str);
                C10691a.m21551c(fVar.f66596l.getContext(), "举报了").mo19066a();
            }
        }
    }
}
