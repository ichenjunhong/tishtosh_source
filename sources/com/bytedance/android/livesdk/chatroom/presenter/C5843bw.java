package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.message.model.C7850bs;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bw */
public final class C5843bw extends C5868cl<C5844a> implements OnMessageListener {

    /* renamed from: a */
    public int f15307a;

    /* renamed from: b */
    public int f15308b;

    /* renamed from: c */
    private C5845b f15309c = C5845b.IDLE;

    /* renamed from: d */
    private long f15310d;

    /* renamed from: e */
    private int f15311e;

    /* renamed from: f */
    private int f15312f = 1;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bw$a */
    public interface C5844a extends C6463ay {
        /* renamed from: a */
        void mo11719a(int i, int i2);

        /* renamed from: a */
        void mo11720a(C5845b bVar, long j);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bw$b */
    public enum C5845b {
        IDLE,
        IN_PROGRESS,
        FINISHED
    }

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
        this.f15310d = 0;
        this.f15307a = 0;
        this.f15311e = 0;
        this.f15308b = 0;
    }

    public C5843bw(int i) {
    }

    /* renamed from: a */
    public final void mo8520a(C5844a aVar) {
        super.mo8520a(aVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.PROMOTION_CARD_MESSAGE.getIntType(), this);
        }
        this.f15310d = ((Long) this.f15366s.get("data_room_id")).longValue();
    }

    public final void onMessage(IMessage iMessage) {
        C5845b bVar;
        if (mo8518c() != null && (iMessage instanceof C7850bs)) {
            boolean z = true;
            if (!((Boolean) C6718b.f18328Y.mo9431a()).booleanValue() || this.f15312f != 1) {
                C7850bs bsVar = (C7850bs) iMessage;
                if (bsVar.f21695f == this.f15312f) {
                    String str = bsVar.f21690a;
                    char c = 65535;
                    if (str.hashCode() == -1422071172 && str.equals("card_progress")) {
                        c = 0;
                    }
                    if (c == 0) {
                        if (!bsVar.f21694e && bsVar.f21693d < bsVar.f21692c) {
                            z = false;
                        }
                        if (z) {
                            bVar = C5845b.FINISHED;
                        } else {
                            bVar = C5845b.IN_PROGRESS;
                        }
                        this.f15308b = bsVar.f21696g;
                        if (this.f15309c != bVar) {
                            this.f15309c = bVar;
                            ((C5844a) mo8518c()).mo11720a(bVar, this.f15310d);
                            this.f15307a = 0;
                            this.f15311e = 0;
                        }
                        if (this.f15309c == C5845b.IN_PROGRESS && (this.f15307a < bsVar.f21693d || this.f15311e != bsVar.f21692c)) {
                            if (this.f15311e != bsVar.f21692c) {
                                ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
                            }
                            this.f15307a = bsVar.f21693d;
                            this.f15311e = bsVar.f21692c;
                            ((C5844a) mo8518c()).mo11719a(this.f15307a, this.f15311e);
                        }
                    }
                }
            }
        }
    }
}
