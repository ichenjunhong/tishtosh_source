package com.bytedance.android.live.broadcast.preview;

import android.support.p030v4.app.C0679r;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.effect.C3253g;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.broadcast.p213h.p214a.p215a.C3414a;
import com.bytedance.android.live.broadcast.p213h.p214a.p215a.C3417d;
import com.bytedance.android.live.p245d.C4116c;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.preview.bn */
final /* synthetic */ class C3556bn implements C1710e {

    /* renamed from: a */
    private final C35511 f10132a;

    C3556bn(C35511 r1) {
        this.f10132a = r1;
    }

    public final void accept(Object obj) {
        Integer num = (Integer) obj;
        C3550bm bmVar = C3550bm.this;
        if (!bmVar.f10115i) {
            bmVar.f10115i = true;
            bmVar.f10109c = C3395f.m9156f().mo8741b().mo8554c();
            bmVar.f10109c.mo8589a(bmVar.f10107a);
            bmVar.f10110d = new C3253g();
            bmVar.f10111e = new C3417d();
            if (bmVar.f10107a != null) {
                bmVar.f10107a.mo8758a((C3414a) bmVar.f10111e);
            }
            bmVar.f10113g = ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).createStartLiveFragment(null);
            bmVar.f10113g.mo8898a(bmVar.f10118l);
            bmVar.f10113g.mo8903b(10);
            C0679r a = bmVar.getActivity().getSupportFragmentManager().mo2225a();
            a.mo2191b(R.id.zn, bmVar.f10113g.mo8913n());
            a.mo2195c();
            ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).startLiveManager().mo8931a(bmVar);
            if (bmVar.f10116j) {
                bmVar.f10113g.mo8911k();
            }
        }
    }
}
