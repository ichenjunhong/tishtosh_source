package com.bytedance.android.livesdk.viewmodel;

import com.bytedance.android.livesdk.p399o.C8064d;
import p064c.p065a.C2201v;
import p064c.p065a.p094l.C2178a;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.viewmodel.f */
public final class C8422f implements C8420d<ILotteryState, ILotteryAction, C52860x> {

    /* renamed from: a */
    public ILotteryState f22869a = new LotteryIdle();

    /* renamed from: b */
    private final C2178a<ILotteryState> f22870b;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14652a() {
        return this.f22869a;
    }

    /* renamed from: b */
    public final C2201v<ILotteryState> mo14654b() {
        return this.f22870b;
    }

    public C8422f() {
        C2178a<ILotteryState> a = C2178a.m6524a(this.f22869a);
        C52711k.m112236a((Object) a, "BehaviorSubject.createDefault(_state)");
        this.f22870b = a;
    }

    /* renamed from: a */
    private final void m16621a(ILotteryState iLotteryState) {
        this.f22869a = iLotteryState;
        this.f22870b.onNext(iLotteryState);
    }

    /* renamed from: a */
    public final void mo14653a(ILotteryAction iLotteryAction) {
        C52711k.m112240b(iLotteryAction, "action");
        ILotteryState iLotteryState = this.f22869a;
        m16622b(iLotteryAction);
        ILotteryState iLotteryState2 = this.f22869a;
        C8064d.m16005b();
        StringBuilder sb = new StringBuilder("state mutated from=");
        sb.append(iLotteryState);
        sb.append(" to=");
        sb.append(iLotteryState2);
        sb.append(" action=");
        sb.append(iLotteryAction);
        C8064d.m9719a("ttlive_lottery", sb.toString());
    }

    /* renamed from: b */
    private final void m16622b(ILotteryAction iLotteryAction) {
        if (iLotteryAction instanceof ResetLottery) {
            m16621a((ILotteryState) new LotteryIdle());
            return;
        }
        ILotteryState iLotteryState = this.f22869a;
        if (!(iLotteryState instanceof LotteryIdle)) {
            if (iLotteryState instanceof LotteryReviewPending) {
                if (iLotteryAction instanceof StartLottery) {
                    StartLottery startLottery = (StartLottery) iLotteryAction;
                    LotteryWaiting lotteryWaiting = new LotteryWaiting(startLottery.getLotteryId(), startLottery.getRoomId(), startLottery.getAnchorId(), startLottery.getUserId(), startLottery.getLocalDrawTime());
                    m16621a((ILotteryState) lotteryWaiting);
                }
            } else if ((iLotteryState instanceof LotteryWaiting) && (iLotteryAction instanceof FinishLottery)) {
                LotteryWaiting lotteryWaiting2 = (LotteryWaiting) iLotteryState;
                m16621a((ILotteryState) new LotteryFinishing(lotteryWaiting2.getRoomId(), lotteryWaiting2.getLotteryId()));
                m16621a((ILotteryState) new LotteryIdle());
            }
        } else if (iLotteryAction instanceof SubmitLottery) {
            m16621a((ILotteryState) new LotteryReviewPending());
        } else {
            if (iLotteryAction instanceof StartLottery) {
                StartLottery startLottery2 = (StartLottery) iLotteryAction;
                LotteryWaiting lotteryWaiting3 = new LotteryWaiting(startLottery2.getLotteryId(), startLottery2.getRoomId(), startLottery2.getAnchorId(), startLottery2.getUserId(), startLottery2.getLocalDrawTime());
                m16621a((ILotteryState) lotteryWaiting3);
            }
        }
    }
}
