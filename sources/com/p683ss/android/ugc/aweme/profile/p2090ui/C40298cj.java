package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.cj */
final /* synthetic */ class C40298cj implements C23364b {

    /* renamed from: a */
    private final ProfileCoverPreviewActivity f102895a;

    /* renamed from: b */
    private final String f102896b;

    C40298cj(ProfileCoverPreviewActivity profileCoverPreviewActivity, String str) {
        this.f102895a = profileCoverPreviewActivity;
        this.f102896b = str;
    }

    /* renamed from: a */
    public final void mo40906a(String[] strArr, int[] iArr) {
        ProfileCoverPreviewActivity profileCoverPreviewActivity = this.f102895a;
        String str = this.f102896b;
        if (strArr.length <= 0 || iArr[0] != 0) {
            new C10643a(profileCoverPreviewActivity).mo18886a((int) R.string.ah4, (OnClickListener) new C40301cm(profileCoverPreviewActivity)).mo18900b((int) R.string.wf, C40302cn.f102901a).mo18899b((int) R.string.kc).mo18897a().mo18882b();
            return;
        }
        profileCoverPreviewActivity.mDownloadBtn.mo82721a();
        C0013i.m16a((Callable<TResult>) new C40299ck<TResult>(profileCoverPreviewActivity, str)).mo20a((C0011g<TResult, TContinuationResult>) new C40300cl<TResult,TContinuationResult>(profileCoverPreviewActivity), C0013i.f25b);
    }
}
