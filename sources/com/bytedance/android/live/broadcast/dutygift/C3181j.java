package com.bytedance.android.live.broadcast.dutygift;

import android.text.TextUtils;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import java.util.HashMap;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.dutygift.j */
final /* synthetic */ class C3181j implements C1710e {

    /* renamed from: a */
    private final DutyGiftControlWidget f9229a;

    C3181j(DutyGiftControlWidget dutyGiftControlWidget) {
        this.f9229a = dutyGiftControlWidget;
    }

    public final void accept(Object obj) {
        C3184m mVar;
        DutyGiftControlWidget dutyGiftControlWidget = this.f9229a;
        dutyGiftControlWidget.f9204f = (String) obj;
        StringBuilder sb = new StringBuilder("startGame mSticker: ");
        sb.append(dutyGiftControlWidget.f9200b);
        sb.append(", mDutyGiftInfo: ");
        sb.append(dutyGiftControlWidget.f9202d);
        sb.append(", mGiftPath: ");
        sb.append(dutyGiftControlWidget.f9204f);
        C3831a.m9716d("DutyGiftControlWidget", sb.toString());
        if (dutyGiftControlWidget.f9200b != null && dutyGiftControlWidget.f9202d != null && !TextUtils.isEmpty(dutyGiftControlWidget.f9204f)) {
            if (dutyGiftControlWidget.f9201c != null) {
                dutyGiftControlWidget.f9201c.mo8527a("gift_icon", dutyGiftControlWidget.f9204f, false);
                C3185n nVar = dutyGiftControlWidget.f9201c;
                if (dutyGiftControlWidget.f9202d != null) {
                    mVar = new C3184m();
                    mVar.f9232a = 4097;
                    mVar.f9233b = ((Integer) C4525b.f12414bl.mo10345a()).intValue();
                    mVar.f9234c = (int) dutyGiftControlWidget.f9202d.getStageCount();
                } else {
                    mVar = null;
                }
                nVar.mo8525a(mVar);
            }
            dutyGiftControlWidget.mo8499a(DutyGiftControlWidget.m8764a((int) dutyGiftControlWidget.f9202d.getTargetScore(), 0));
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(dutyGiftControlWidget.f9203e.getId()));
            hashMap.put("anchor_id", String.valueOf(dutyGiftControlWidget.f9203e.getOwner().getId()));
            if (dutyGiftControlWidget.f9202d != null) {
                hashMap.put("effectgame_id", String.valueOf(dutyGiftControlWidget.f9202d.getDutyId()));
                hashMap.put("effectgame_gift_id", String.valueOf(dutyGiftControlWidget.f9202d.getGiftId()));
            }
            C8049c.m15979a().mo14202a("effect_game_start", hashMap, new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_detail"));
            dutyGiftControlWidget.f9205g = System.currentTimeMillis();
            dutyGiftControlWidget.f9206h = 0;
        }
    }
}
