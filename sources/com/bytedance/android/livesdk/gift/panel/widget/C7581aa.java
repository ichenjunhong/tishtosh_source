package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.aa */
final /* synthetic */ class C7581aa implements C0199s {

    /* renamed from: a */
    private final GiftPanelListWidget f20914a;

    C7581aa(GiftPanelListWidget giftPanelListWidget) {
        this.f20914a = giftPanelListWidget;
    }

    public final void onChanged(Object obj) {
        GiftPanelListWidget giftPanelListWidget = this.f20914a;
        String str = (String) obj;
        if (giftPanelListWidget.f20865n != null && !giftPanelListWidget.f20865n.isEmpty()) {
            int b = C4577ap.m10994b(giftPanelListWidget.context, (float) C4577ap.m10991a(giftPanelListWidget.context));
            C4104a a = ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10487a(C4704c.m11226a(giftPanelListWidget.f20865n).mo10510a(b).mo10514b((int) ((((float) b) / 375.0f) * 275.0f)).mo10521f(0).mo10511a(8, 8, 0, 0).mo10520e(80).mo10517c(false));
            giftPanelListWidget.f20852a.f20784q.postValue(Boolean.valueOf(true));
            if (giftPanelListWidget.context instanceof FragmentActivity) {
                C4104a.m10232a((FragmentActivity) giftPanelListWidget.context, a);
                GiftDialogViewModel giftDialogViewModel = giftPanelListWidget.f20852a;
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(giftDialogViewModel.f20772e.getId()));
                hashMap.put("anchor_id", String.valueOf(giftDialogViewModel.f20772e.getOwnerUserId()));
                hashMap.put("user_id", String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()));
                if ("grey_prop".equals(str)) {
                    C8049c.m15979a().mo14202a("grep_prop_click", hashMap, Room.class, new C8059j());
                } else if ("more_prop".equals(str)) {
                    C8049c.m15979a().mo14202a("more_prop_click", hashMap, Room.class, new C8059j());
                }
                hashMap.put("request_page", str);
                C8049c.m15979a().mo14202a("task_show", hashMap, Room.class, new C8059j());
            }
        }
    }
}
