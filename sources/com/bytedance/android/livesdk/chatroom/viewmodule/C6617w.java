package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.livesdk.rank.C8127b;
import com.bytedance.android.livesdk.rank.p410c.C8143c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.w */
final /* synthetic */ class C6617w implements C1710e {

    /* renamed from: a */
    private final DailyRankWidget f17975a;

    C6617w(DailyRankWidget dailyRankWidget) {
        this.f17975a = dailyRankWidget;
    }

    public final void accept(Object obj) {
        DailyRankWidget dailyRankWidget = this.f17975a;
        C8143c cVar = (C8143c) obj;
        if (cVar != null) {
            if (cVar.f22228b) {
                int i = cVar.f22227a;
                if (dailyRankWidget.f16878i != null) {
                    dailyRankWidget.f16878i.dismiss();
                } else {
                    dailyRankWidget.f16878i = C8127b.m16198a(dailyRankWidget.f16881l, dailyRankWidget.f16882m, dailyRankWidget.f16883n, dailyRankWidget.dataCenter, i);
                }
                dailyRankWidget.f16878i.f22201h = i;
                dailyRankWidget.f16878i.show(((FragmentActivity) dailyRankWidget.context).getSupportFragmentManager(), C8127b.f22192a);
                if (dailyRankWidget.f16877h != null) {
                    dailyRankWidget.f16877h.mo14322a(true);
                }
            } else if (dailyRankWidget.f16877h != null) {
                dailyRankWidget.f16877h.mo14322a(false);
            }
        }
    }
}
