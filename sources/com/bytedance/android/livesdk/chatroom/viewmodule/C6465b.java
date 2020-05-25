package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.graphics.Bitmap;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5746e;
import com.bytedance.android.livesdk.chatroom.model.C5746e.C5747a;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.common.utility.C9414h;
import java.util.List;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.b */
final /* synthetic */ class C6465b implements C1710e {

    /* renamed from: a */
    private final BarrageWidget f17766a;

    C6465b(BarrageWidget barrageWidget) {
        this.f17766a = barrageWidget;
    }

    public final void accept(Object obj) {
        BarrageWidget barrageWidget = this.f17766a;
        C4177d dVar = (C4177d) obj;
        if (C9414h.m18630a(((C5746e) dVar.data).f15107a)) {
            barrageWidget.f16779f = false;
            return;
        }
        barrageWidget.f16779f = true;
        for (C5747a aVar : ((C5746e) dVar.data).f15107a) {
            C2201v a = C5213c.m11812a(aVar.f15109b).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6513a((C1673aa<? super T, ? extends R>) barrageWidget.getAutoUnbindTransformer());
            List<Bitmap> list = barrageWidget.f16774a;
            list.getClass();
            a.mo6505a((C1710e<? super T>) new C6519d<Object>(list), (C1710e<? super Throwable>) new C6546e<Object>(barrageWidget));
        }
    }
}
