package com.p683ss.android.ugc.aweme.commercialize;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.commercialize.api.CouponRedeemApi.C25640c;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.commercialize.r */
final /* synthetic */ class C26198r implements Runnable {

    /* renamed from: a */
    private final PoiCouponRedeemActivity f69179a;

    /* renamed from: b */
    private final View f69180b;

    /* renamed from: c */
    private final C17832m f69181c;

    C26198r(PoiCouponRedeemActivity poiCouponRedeemActivity, View view, C17832m mVar) {
        this.f69179a = poiCouponRedeemActivity;
        this.f69180b = view;
        this.f69181c = mVar;
    }

    public final void run() {
        PoiCouponRedeemActivity poiCouponRedeemActivity = this.f69179a;
        View view = this.f69180b;
        C17832m mVar = this.f69181c;
        view.setEnabled(true);
        try {
            C25640c cVar = (C25640c) mVar.get();
            if (cVar != null && !TextUtils.isEmpty(cVar.statusMsg)) {
                if (cVar.statusCode == 0) {
                    C10691a.m21537a(poiCouponRedeemActivity.getApplicationContext(), cVar.statusMsg).mo19066a();
                } else {
                    C10691a.m21545b(poiCouponRedeemActivity.getApplicationContext(), cVar.statusMsg).mo19066a();
                }
            }
        } catch (InterruptedException unused) {
        } catch (ExecutionException unused2) {
            C10691a.m21542b(poiCouponRedeemActivity.getApplicationContext(), (int) R.string.cfw).mo19066a();
        }
        poiCouponRedeemActivity.mo52726a();
    }
}
