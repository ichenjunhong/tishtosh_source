package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene$onActivityCreated$1 */
public final class PreviewImageScene$onActivityCreated$1 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C44243k f111972a;

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        if (this.f111972a.mo90151d().getVisibility() == 0) {
            C10691a.m21548c((Context) this.f111972a.mo24477v(), (int) R.string.coz).mo19066a();
        }
    }

    PreviewImageScene$onActivityCreated$1(C44243k kVar) {
        this.f111972a = kVar;
    }
}
