package com.p683ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39645w.C39646a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.j */
final /* synthetic */ class C47000j implements C39646a {

    /* renamed from: a */
    private final DraftBoxActivity f118710a;

    C47000j(DraftBoxActivity draftBoxActivity) {
        this.f118710a = draftBoxActivity;
    }

    /* renamed from: a */
    public final void mo80715a(String[] strArr, int[] iArr) {
        DraftBoxActivity draftBoxActivity = this.f118710a;
        if (strArr == null || iArr == null || strArr.length == 0 || iArr.length == 0) {
            C10691a.m21542b((Context) draftBoxActivity, (int) R.string.atu).mo19066a();
            draftBoxActivity.finish();
        } else if (iArr[0] == 0) {
            draftBoxActivity.mo94253a();
        } else {
            C10691a.m21542b((Context) draftBoxActivity, (int) R.string.atu).mo19066a();
            draftBoxActivity.finish();
        }
    }
}
