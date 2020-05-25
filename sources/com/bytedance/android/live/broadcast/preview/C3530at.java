package com.bytedance.android.live.broadcast.preview;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.broadcast.C3617q;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.preview.at */
final /* synthetic */ class C3530at implements C0199s {

    /* renamed from: a */
    private final C3514al f10087a;

    C3530at(C3514al alVar) {
        this.f10087a = alVar;
    }

    public final void onChanged(Object obj) {
        C3514al alVar = this.f10087a;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            if (alVar.f10060o > 3) {
                if (alVar.mo8452l()) {
                    C4575an.m10981a((int) R.string.esy);
                }
                if (alVar.f10050e != null && alVar.f10050e.isShowing()) {
                    alVar.f10050e.dismiss();
                }
            } else {
                C3617q.INST.loadResources();
                alVar.f10060o++;
            }
        } else if (alVar.f10050e != null && alVar.f10050e.isShowing()) {
            alVar.f10050e.dismiss();
        }
    }
}
