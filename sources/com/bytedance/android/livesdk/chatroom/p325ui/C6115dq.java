package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6592p;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.live.model.C7758b;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.viewmodel.C8419c;
import com.bytedance.android.livesdk.viewmodel.ILotteryState;
import com.bytedance.android.livesdk.viewmodel.LotteryReviewPending;
import com.bytedance.android.livesdk.viewmodel.LotteryWaiting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dq */
public final class C6115dq implements C6601a {

    /* renamed from: a */
    public final Context f16385a;

    /* renamed from: b */
    public final DataCenter f16386b;

    /* renamed from: a */
    public final void mo8419a(View view, DataCenter dataCenter) {
    }

    /* renamed from: a */
    public final void mo8420a(C6597a aVar) {
    }

    /* renamed from: b */
    public final void mo8421b(View view, DataCenter dataCenter) {
    }

    public final void onClick(View view) {
        C8049c.m15979a().mo14203a("lottery_icon_click", Room.class);
        C8419c cVar = (C8419c) this.f16386b.get("data_lottery_data_model", null);
        if (cVar != null) {
            ILotteryState iLotteryState = (ILotteryState) cVar.mo14652a();
            if (iLotteryState instanceof LotteryReviewPending) {
                C4575an.m10981a((int) R.string.hr8);
            } else if (iLotteryState instanceof LotteryWaiting) {
                C4495a.m10823a().mo10301a((Object) new C6592p());
            } else {
                try {
                    C4097p<C7758b> pVar = LiveConfigSettingKeys.LOTTERY_CONFIG;
                    C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.LOTTERY_CONFIG");
                    C4514j.m10883j().mo10328i().handle(this.f16385a, Uri.parse(((C7758b) pVar.mo9431a()).f21325b));
                } catch (Throwable th) {
                    C8064d.m16005b();
                    C8064d.m9718a(5, th.getStackTrace());
                }
            }
        }
    }

    public C6115dq(Context context, DataCenter dataCenter) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(dataCenter, "dataCenter");
        this.f16385a = context;
        this.f16386b = dataCenter;
    }
}
