package com.p683ss.android.ugc.aweme.poi.preview.p2068b.p2069a;

import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.b.a.b */
final /* synthetic */ class C39163b implements C23364b {

    /* renamed from: a */
    private final C39161a f99902a;

    /* renamed from: b */
    private final String f99903b;

    C39163b(C39161a aVar, String str) {
        this.f99902a = aVar;
        this.f99903b = str;
    }

    /* renamed from: a */
    public final void mo40906a(String[] strArr, int[] iArr) {
        C39161a aVar = this.f99902a;
        String str = this.f99903b;
        if (strArr.length <= 0 || iArr[0] != 0) {
            new C10643a(aVar.f99897b.getActivityContext()).mo18886a((int) R.string.ah4, (OnClickListener) new C39166e(aVar)).mo18900b((int) R.string.wf, C39167f.f99908a).mo18899b((int) R.string.kc).mo18897a().mo18882b();
            return;
        }
        aVar.f99898c.mo82721a();
        C0013i.m16a((Callable<TResult>) new C39164c<TResult>(aVar, str)).mo20a((C0011g<TResult, TContinuationResult>) new C39165d<TResult,TContinuationResult>(aVar), C0013i.f25b);
    }
}
