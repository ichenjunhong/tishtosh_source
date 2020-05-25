package com.bytedance.android.live.broadcast;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.C0679r;
import com.bytedance.android.live.broadcast.preview.C3550bm;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdkapi.p456j.C8828a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.x */
final /* synthetic */ class C3802x implements C0199s {

    /* renamed from: a */
    private final StartLiveActivityProxy f10753a;

    C3802x(StartLiveActivityProxy startLiveActivityProxy) {
        this.f10753a = startLiveActivityProxy;
    }

    public final void onChanged(Object obj) {
        StartLiveActivityProxy startLiveActivityProxy = this.f10753a;
        Boolean bool = (Boolean) obj;
        C8828a.LiveResource.preload();
        if (bool != null && bool.booleanValue()) {
            if (startLiveActivityProxy.f8898a != null && startLiveActivityProxy.f8898a.isShowing()) {
                startLiveActivityProxy.f8898a.dismiss();
            }
            C0679r a = startLiveActivityProxy.f23571d.getSupportFragmentManager().mo2225a();
            a.mo2191b(R.id.ajf, new C3550bm());
            a.mo2195c();
        } else if (startLiveActivityProxy.f8899b > 3) {
            C4575an.m10981a((int) R.string.esy);
            if (startLiveActivityProxy.f8898a != null && startLiveActivityProxy.f8898a.isShowing()) {
                startLiveActivityProxy.f8898a.dismiss();
            }
            startLiveActivityProxy.f23571d.finish();
        } else {
            C3617q.INST.loadResources();
            startLiveActivityProxy.f8899b++;
        }
    }
}
