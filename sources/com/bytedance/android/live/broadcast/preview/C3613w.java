package com.bytedance.android.live.broadcast.preview;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.broadcast.C3617q;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.preview.w */
final /* synthetic */ class C3613w implements C0199s {

    /* renamed from: a */
    private final C3589i f10292a;

    C3613w(C3589i iVar) {
        this.f10292a = iVar;
    }

    public final void onChanged(Object obj) {
        C3589i iVar = this.f10292a;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            if (iVar.f10258p > 3) {
                if (iVar.mo8452l()) {
                    C4575an.m10981a((int) R.string.esy);
                }
                if (iVar.f10252j != null && iVar.f10252j.isShowing()) {
                    iVar.f10252j.dismiss();
                    return;
                }
            } else {
                C3617q.INST.loadResources();
                iVar.f10258p++;
            }
            return;
        }
        if (iVar.f10252j != null && iVar.f10252j.isShowing()) {
            iVar.f10252j.dismiss();
        }
        iVar.mo8967o();
    }
}
