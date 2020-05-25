package com.bytedance.android.live.broadcast.preview;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.ViewGroup;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p230g.C3914u;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.browser.p289c.C4697b;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4702d;
import com.bytedance.android.livesdk.chatroom.model.C5743c.C5744a;
import com.bytedance.common.utility.C9431p;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.preview.ac */
final /* synthetic */ class C3505ac implements C0199s {

    /* renamed from: a */
    private final C3589i f9995a;

    C3505ac(C3589i iVar) {
        this.f9995a = iVar;
    }

    public final void onChanged(Object obj) {
        C3589i iVar = this.f9995a;
        C5744a aVar = (C5744a) obj;
        iVar.f10261s = aVar;
        if (iVar.getActivity() != null && aVar != null && !C9431p.m18664a(aVar.f15101a) && !C3914u.m9892a(aVar.f15102b)) {
            C4697b webViewManager = ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager();
            if (iVar.f10260r == null) {
                iVar.f10260r = webViewManager.mo10489a((Activity) iVar.getActivity(), (C4702d) new C3611u(iVar));
                if (VERSION.SDK_INT <= 19) {
                    iVar.f10260r.f12813a.setLayerType(1, null);
                }
                iVar.f10260r.f12813a.setBackgroundColor(0);
                iVar.f10260r.f12813a.setLayoutParams(iVar.f10245c.findViewById(R.id.duf).getLayoutParams());
                ((ViewGroup) iVar.f10245c.findViewById(R.id.ajl)).addView(iVar.f10260r.f12813a);
                iVar.f10260r.f12813a.setVisibility(4);
                webViewManager.mo10495a(iVar.f10260r, Uri.parse(aVar.f15101a).buildUpon().appendQueryParameter("request_page", "topleft").appendQueryParameter("event_page", "live_take_entrance").appendQueryParameter("is_anchor", "true").appendQueryParameter("mode", "live_create").appendQueryParameter("user_id", String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b())).toString());
                return;
            }
            webViewManager.mo10495a(iVar.f10260r, Uri.parse(aVar.f15101a).buildUpon().appendQueryParameter("request_page", "topleft").appendQueryParameter("event_page", "live_take_entrance").appendQueryParameter("is_anchor", "true").appendQueryParameter("mode", "live_create").appendQueryParameter("user_id", String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b())).toString());
        }
    }
}
