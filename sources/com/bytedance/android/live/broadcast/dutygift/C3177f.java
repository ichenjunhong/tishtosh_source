package com.bytedance.android.live.broadcast.dutygift;

import com.bytedance.android.live.broadcast.api.model.DutyGiftInfo;
import com.bytedance.android.live.broadcast.api.p194a.C3034a;
import com.bytedance.android.live.broadcast.api.p194a.C3034a.C3035a;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.livesdk.message.model.C7798ae;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.ies.p619a.C10176b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.dutygift.f */
public class C3177f extends C10176b<C3035a> implements C3034a, OnMessageListener {

    /* renamed from: a */
    protected Room f9222a;

    /* renamed from: b */
    private DataCenter f9223b;

    /* renamed from: c */
    private IMessageManager f9224c;

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
        if (this.f9224c != null) {
            this.f9224c.removeMessageListener(C8629a.DUTY_GIFT_MESSAGE.getIntType(), this);
        }
    }

    /* renamed from: a */
    public final void mo8520a(C3035a aVar) {
        super.mo8520a(aVar);
        this.f9224c = (IMessageManager) this.f9223b.get("data_message_manager");
        if (this.f9224c != null) {
            this.f9224c.addMessageListener(C8629a.DUTY_GIFT_MESSAGE.getIntType(), this);
        }
        if (this.f9222a != null && this.f9222a.getOwner() != null) {
            C3395f.m9156f().mo8742c().mo9023f().dutyGiftRequest(this.f9222a.getId(), this.f9222a.getOwner().getId(), 1, false).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C3178g<Object>(this), (C1710e<? super Throwable>) new C3179h<Object>(this));
        }
    }

    public void onMessage(IMessage iMessage) {
        if (mo8518c() != null && (iMessage instanceof C7798ae)) {
            C7798ae aeVar = (C7798ae) iMessage;
            C3035a aVar = (C3035a) mo8518c();
            DutyGiftInfo dutyGiftInfo = new DutyGiftInfo();
            dutyGiftInfo.setGiftId((long) aeVar.f21442a);
            dutyGiftInfo.setTargetScore((long) aeVar.f21443b);
            dutyGiftInfo.setStageCount((long) aeVar.f21444c);
            dutyGiftInfo.setStatus(aeVar.f21445d);
            dutyGiftInfo.setScore((long) aeVar.f21446e);
            dutyGiftInfo.setMvpUser(aeVar.f21447f);
            dutyGiftInfo.setDutyId(aeVar.f21448g);
            aVar.mo8249b(dutyGiftInfo);
            this.f9223b.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(5));
        }
    }

    public C3177f(Room room, DataCenter dataCenter) {
        this.f9222a = room;
        this.f9223b = dataCenter;
    }
}
