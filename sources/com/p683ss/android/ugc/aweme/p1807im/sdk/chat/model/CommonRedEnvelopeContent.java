package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35468e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35469f;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.CommonRedEnvelopeContent */
public final class CommonRedEnvelopeContent extends BaseRedEnvelopeContent {
    public CommonRedEnvelopeContent() {
        String string = C11010c.m22280a().getString(R.string.bpk);
        C52711k.m112236a((Object) string, "AppContextManager.getApp…plan_common_red_envelope)");
        setRedEnvelopeTitle(string);
    }

    public final void tryInit() {
        String str;
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        C35460j f = a.mo71949f();
        C52711k.m112236a((Object) f, "AwemeImManager.instance().proxy");
        C35468e iMSetting = f.getIMSetting();
        C52711k.m112236a((Object) iMSetting, "AwemeImManager.instance().proxy.imSetting");
        C35469f fVar = iMSetting.f91147e;
        if (fVar == null || TextUtils.isEmpty(fVar.f91183w)) {
            str = C11010c.m22280a().getString(R.string.bqe);
        } else {
            str = fVar.f91183w;
        }
        this.msgHint = str;
    }
}
