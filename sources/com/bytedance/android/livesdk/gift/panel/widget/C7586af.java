package com.bytedance.android.livesdk.gift.panel.widget;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.schema.interfaces.C8260a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.af */
final /* synthetic */ class C7586af implements OnClickListener {

    /* renamed from: a */
    private final GiftPanelTabWidget f20919a;

    C7586af(GiftPanelTabWidget giftPanelTabWidget) {
        this.f20919a = giftPanelTabWidget;
    }

    public final void onClick(View view) {
        GiftPanelTabWidget giftPanelTabWidget = this.f20919a;
        String findGameGiftRuleUrl = GiftManager.inst().findGameGiftRuleUrl(giftPanelTabWidget.f20892c);
        if (findGameGiftRuleUrl != null) {
            ((C8260a) C4116c.m10249a(C8260a.class)).handle(giftPanelTabWidget.context, Uri.parse(findGameGiftRuleUrl));
            GiftDialogViewModel giftDialogViewModel = giftPanelTabWidget.f20893d;
            HashMap hashMap = new HashMap();
            long j = 0;
            hashMap.put("room_id", String.valueOf(giftDialogViewModel.f20772e != null ? giftDialogViewModel.f20772e.getId() : 0));
            String str = "anchor_id";
            if (giftDialogViewModel.f20772e != null) {
                j = giftDialogViewModel.f20772e.getOwnerUserId();
            }
            hashMap.put(str, String.valueOf(j));
            C8049c.m15979a().mo14202a("monkey_game_rank_click", hashMap, Room.class, new C8059j());
        }
    }
}
