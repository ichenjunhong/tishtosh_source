package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4700b;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.event.C5174at;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8705k;
import com.bytedance.android.livesdkapi.depend.model.live.C8719s;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ag */
final /* synthetic */ class C6445ag implements C1710e {

    /* renamed from: a */
    private final DecorationWrapperWidget f17745a;

    /* renamed from: b */
    private final C5174at f17746b;

    C6445ag(DecorationWrapperWidget decorationWrapperWidget, C5174at atVar) {
        this.f17745a = decorationWrapperWidget;
        this.f17746b = atVar;
    }

    public final void accept(Object obj) {
        DecorationWrapperWidget decorationWrapperWidget = this.f17745a;
        C5174at atVar = this.f17746b;
        C4177d dVar = (C4177d) obj;
        String str = atVar.f13866a;
        C8705k kVar = dVar != null ? (C8705k) dVar.data : null;
        String str2 = (kVar == null || TextUtils.isEmpty(kVar.f23847a)) ? "" : kVar.f23847a;
        Uri parse = Uri.parse(str);
        Builder buildUpon = parse.buildUpon();
        String encodedQuery = parse.getEncodedQuery();
        if (TextUtils.isEmpty(encodedQuery)) {
            buildUpon.encodedQuery(str2);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(encodedQuery);
            sb.append("&");
            sb.append(str2);
            buildUpon.encodedQuery(sb.toString());
        }
        buildUpon.appendQueryParameter("ttScenario", "streaming");
        Context context = decorationWrapperWidget.getContext();
        C4700b f = C4704c.m11226a(buildUpon.build().toString()).mo10511a(0, 0, 0, 0).mo10521f(-1);
        double b = (double) C3922z.m9908b();
        Double.isNaN(b);
        C4104a a = ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10488a(f.mo10514b((int) C3922z.m9914e((int) (b * 0.7d))).mo10510a((int) C3922z.m9914e(C3922z.m9910c())).mo10520e(80), (C8719s) null);
        if (a != null && (context instanceof FragmentActivity)) {
            C4104a.m10232a((FragmentActivity) context, a);
        }
        if (atVar.f13867b) {
            C8049c.m15979a().mo14203a("livesdk_donation_stick_audience_click", Room.class, C8059j.class);
        }
    }
}
