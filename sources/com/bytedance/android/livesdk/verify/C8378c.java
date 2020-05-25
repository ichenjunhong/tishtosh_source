package com.bytedance.android.livesdk.verify;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.verify.model.ZhimaPollingResponse;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.verify.c */
final /* synthetic */ class C8378c implements C1710e {

    /* renamed from: a */
    private final C8377b f22800a;

    C8378c(C8377b bVar) {
        this.f22800a = bVar;
    }

    public final void accept(Object obj) {
        C8377b bVar = this.f22800a;
        if (((ZhimaPollingResponse) ((C4177d) obj).data).isVerified) {
            bVar.getActivity().setResult(-1);
            bVar.getActivity().finish();
            return;
        }
        bVar.f22796L.mo10601a();
    }
}
