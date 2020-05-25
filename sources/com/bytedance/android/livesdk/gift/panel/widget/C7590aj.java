package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;
import android.widget.TextView;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.aj */
final /* synthetic */ class C7590aj implements C0199s {

    /* renamed from: a */
    private final MtGiftPanelBottomWidget f20923a;

    C7590aj(MtGiftPanelBottomWidget mtGiftPanelBottomWidget) {
        this.f20923a = mtGiftPanelBottomWidget;
    }

    public final void onChanged(Object obj) {
        int i;
        TextView textView;
        MtGiftPanelBottomWidget mtGiftPanelBottomWidget = this.f20923a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i2 = 8;
        mtGiftPanelBottomWidget.f20911c.setVisibility(booleanValue ? 0 : 8);
        if (((Boolean) LiveSettingKeys.HIDE_CHARGE_ICON_FOR_USER.mo9431a()).booleanValue()) {
            textView = mtGiftPanelBottomWidget.f20910b;
            i = 4;
        } else {
            textView = mtGiftPanelBottomWidget.f20910b;
            i = booleanValue ? 8 : 0;
        }
        textView.setVisibility(i);
        TextView textView2 = mtGiftPanelBottomWidget.f20909a;
        if (!booleanValue) {
            i2 = 0;
        }
        textView2.setVisibility(i2);
        if (booleanValue) {
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()));
            C8049c.m15979a().mo14202a("knapsack_tab_click", hashMap, Room.class, new C8059j());
        }
    }
}
