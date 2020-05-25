package com.bytedance.android.livesdk.gift.panel.widget;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.core.p230g.C3865ac;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.gift.model.GiftOperation;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.schema.interfaces.C8260a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.h */
final /* synthetic */ class C7602h implements OnClickListener {

    /* renamed from: a */
    private final GiftConfigurablePanelTabWidget f20937a;

    /* renamed from: b */
    private final String f20938b;

    /* renamed from: c */
    private final GiftOperation f20939c;

    C7602h(GiftConfigurablePanelTabWidget giftConfigurablePanelTabWidget, String str, GiftOperation giftOperation) {
        this.f20937a = giftConfigurablePanelTabWidget;
        this.f20938b = str;
        this.f20939c = giftOperation;
    }

    public final void onClick(View view) {
        GiftConfigurablePanelTabWidget giftConfigurablePanelTabWidget = this.f20937a;
        String str = this.f20938b;
        String str2 = this.f20939c.eventName;
        if (!TextUtils.isEmpty(str)) {
            ((C8260a) C4116c.m10249a(C8260a.class)).handle(giftConfigurablePanelTabWidget.context, Uri.parse(str).buildUpon().appendQueryParameter("status_bar_height", String.valueOf((int) C3922z.m9914e(C3865ac.m9795a(giftConfigurablePanelTabWidget.context)))).build());
            if (!TextUtils.isEmpty(str2)) {
                String valueOf = ((C4282a) C4116c.m10249a(C4282a.class)).user() != null ? String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()) : "";
                HashMap hashMap = new HashMap();
                hashMap.put("user_id", valueOf);
                hashMap.put("type", "gift");
                C8049c.m15979a().mo14202a(str2, hashMap, new C8059j(), Room.class);
            }
        }
    }
}
