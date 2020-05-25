package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.widget.ae */
final /* synthetic */ class C3747ae implements C1710e {

    /* renamed from: a */
    private final C3796v f10615a;

    C3747ae(C3796v vVar) {
        this.f10615a = vVar;
    }

    public final void accept(Object obj) {
        C3796v vVar = this.f10615a;
        if (((Boolean) obj).booleanValue()) {
            C4104a a = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).liveCommerceService().mo9606a(vVar.f10734f.getActivity(), null);
            a.getLifecycle().mo324a(new StartLiveSetController$5(vVar, a));
            a.show(vVar.f10734f.getFragmentManager(), "LIVE_SHOP_EDIT");
            return;
        }
        C4204a.m10421a((Context) vVar.f10734f.getActivity(), (int) R.string.esn);
    }
}
