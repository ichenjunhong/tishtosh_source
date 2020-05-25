package com.bytedance.android.livesdk.chatroom.p310f;

import com.bytedance.android.live.core.rxutils.C4075p;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p401b.C8045n;
import com.bytedance.android.livesdk.viewmodel.ILotteryState;
import com.bytedance.android.livesdk.viewmodel.LotteryWaiting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.f.g */
public final class C5219g extends C4075p<ILotteryState> {
    /* renamed from: b */
    private static C8045n m11838b() {
        C8038g a = C8049c.m15979a().mo14201a(Room.class);
        if (!(a instanceof C8045n)) {
            a = null;
        }
        return (C8045n) a;
    }

    /* renamed from: a */
    public final void mo11058a() {
        C8045n b = m11838b();
        if (b != null) {
            b.mo14193a("lottery_id");
        }
        C8064d.m16005b();
        C8064d.m9720b("ttlive_lottery", "logInjector cleared");
    }

    public final /* synthetic */ void onNext(Object obj) {
        ILotteryState iLotteryState = (ILotteryState) obj;
        C52711k.m112240b(iLotteryState, "t");
        if (iLotteryState instanceof LotteryWaiting) {
            C8045n b = m11838b();
            if (b != null) {
                b.mo14194a("lottery_id", String.valueOf(((LotteryWaiting) iLotteryState).getLotteryId()));
            }
            C8064d.m16005b();
            C8064d.m9720b("ttlive_lottery", "logInjector updated");
            return;
        }
        mo11058a();
    }
}
