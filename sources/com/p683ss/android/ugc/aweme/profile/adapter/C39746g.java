package com.p683ss.android.ugc.aweme.profile.adapter;

import android.graphics.Bitmap;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.g */
final /* synthetic */ class C39746g implements Runnable {

    /* renamed from: a */
    private final C39744e f101474a;

    /* renamed from: b */
    private final C29059c f101475b;

    /* renamed from: c */
    private final int f101476c;

    C39746g(C39744e eVar, C29059c cVar, int i) {
        this.f101474a = eVar;
        this.f101475b = cVar;
        this.f101476c = i;
    }

    public final void run() {
        C39744e eVar = this.f101474a;
        C29059c cVar = this.f101475b;
        int i = this.f101476c;
        if (cVar.f76137O == 2) {
            if (cVar.f76145c == null) {
                eVar.f101470b.setImageURI("");
            } else {
                AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().infoService().videoCover(cVar.f76145c, (IGetInfoCallback<Bitmap>) new C39750k<Bitmap>(eVar));
            }
        } else if (cVar.mo58743T()) {
            String W = cVar.mo58746W();
            if (C48016e.m103944b(W)) {
                C12203q.m24644a(new File(W)).mo23116a((C12197k) eVar.f101470b).mo23118a("DraftBoxViewHolder").mo23121a();
            }
        } else if (cVar.mo58744U()) {
            String X = cVar.mo58747X();
            if (C48016e.m103944b(X)) {
                C12203q.m24644a(new File(X)).mo23116a((C12197k) eVar.f101470b).mo23118a("DraftBoxViewHolder").mo23121a();
            }
        } else if (cVar.mo58745V()) {
            String Y = cVar.mo58748Y();
            if (C48016e.m103944b(Y)) {
                C12203q.m24644a(new File(Y)).mo23116a((C12197k) eVar.f101470b).mo23118a("DraftBoxViewHolder").mo23121a();
            }
        } else if (cVar != null) {
            AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().infoService().videoCover(cVar, (IGetInfoCallback<Bitmap>) new C39751l<Bitmap>(eVar));
        }
        eVar.f101470b.setContentDescription(eVar.f101469a.getString(R.string.cyt, new Object[]{Integer.valueOf(i + 1)}));
        if (eVar.f101471c != null) {
            C0013i.m16a((Callable<TResult>) new C39747h<TResult>(eVar)).mo20a((C0011g<TResult, TContinuationResult>) new C39748i<TResult,TContinuationResult>(eVar), C0013i.f25b);
        }
        if (eVar.f101472d != null) {
            eVar.f101472d.setTypeface(C10749b.m21787a().mo19435a(C10751d.f28908g));
        }
    }
}
