package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44264p.C44266b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene$onActivityCreated$3 */
public final class PreviewVideoScene$onActivityCreated$3 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C44264p f111973a;

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        if (this.f111973a.f112070p == C44266b.FILE_DELETED) {
            C10691a.m21548c((Context) this.f111973a.mo24477v(), (int) R.string.bex).mo19066a();
            return;
        }
        if (this.f111973a.f112070p == C44266b.DISABLE_4K) {
            C10691a.m21548c((Context) this.f111973a.mo24477v(), (int) R.string.f7u).mo19066a();
        }
    }

    PreviewVideoScene$onActivityCreated$3(C44264p pVar) {
        this.f111973a = pVar;
    }
}
