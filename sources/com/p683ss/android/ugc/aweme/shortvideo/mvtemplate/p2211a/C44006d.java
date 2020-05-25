package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2211a;

import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.vesdk.C50711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.d */
final /* synthetic */ class C44006d implements C50711k {

    /* renamed from: a */
    private final C44002b f111453a;

    C44006d(C44002b bVar) {
        this.f111453a = bVar;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        C44002b bVar = this.f111453a;
        if (i == 4101) {
            if (bVar.f111436f >= bVar.f111433c) {
                bVar.f111440j.sendEmptyMessage(BaseNotice.COMMENT_REPLY_WITH_VIDEO);
            } else {
                bVar.f111436f++;
                bVar.f111438h.sendEmptyMessage(1001);
            }
        }
    }
}
