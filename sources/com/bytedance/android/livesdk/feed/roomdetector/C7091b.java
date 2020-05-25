package com.bytedance.android.livesdk.feed.roomdetector;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.google.gson.C17971f;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.roomdetector.b */
public final class C7091b implements C9382a {

    /* renamed from: a */
    final Handler f19295a = new C9381g(this);

    /* renamed from: b */
    boolean f19296b = false;

    /* renamed from: c */
    private final long f19297c;

    /* renamed from: d */
    private final long f19298d;

    /* renamed from: e */
    private final String f19299e;

    /* renamed from: f */
    private final boolean f19300f;

    /* renamed from: g */
    private final C7092a f19301g;

    /* renamed from: h */
    private C17971f f19302h;

    /* renamed from: i */
    private long f19303i = ((long) ((Integer) LiveFeedSettings.AUDIENCE_PING_INTERVAL.mo9431a()).intValue());

    /* renamed from: com.bytedance.android.livesdk.feed.roomdetector.b$a */
    public interface C7092a {
        /* renamed from: a */
        void mo13226a(int i);

        /* renamed from: a */
        void mo13227a(long j, long j2);

        /* renamed from: c */
        boolean mo13228c();

        /* renamed from: d */
        void mo13229d();

        /* renamed from: e */
        void mo13230e();
    }

    /* renamed from: a */
    public final void mo13224a() {
        if (this.f19296b) {
            this.f19296b = false;
            this.f19295a.removeCallbacksAndMessages(null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo13225b() {
        if (!this.f19296b || !this.f19301g.mo13228c()) {
            mo13224a();
            return;
        }
        ((RoomRetrofitApi) C4157e.m10322a().mo9550a(RoomRetrofitApi.class)).sendPlayingPing(this.f19297c, 1).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C7093c<Object>(this), (C1710e<? super Throwable>) new C7094d<Object>(this));
        if (this.f19303i > 0 && this.f19303i >= ((long) ((Integer) LiveFeedSettings.AUDIENCE_PING_INTERVAL.mo9431a()).intValue())) {
            this.f19295a.sendMessageDelayed(this.f19295a.obtainMessage(8), this.f19303i * 1000);
        }
    }

    public final void handleMsg(Message message) {
        if (this.f19296b) {
            switch (message.what) {
                case 7:
                    Object obj = message.obj;
                    if (this.f19296b) {
                        if (!(obj instanceof C2949a)) {
                            if (obj instanceof PingResult) {
                                long currentTimeMillis = System.currentTimeMillis();
                                C3831a.m9710b(4, "pingresult", this.f19302h.mo34889b(obj));
                                C3831a.m9712b("pingresultCostTime", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                                PingResult pingResult = (PingResult) obj;
                                this.f19303i = pingResult.getNextPingInterval();
                                if (4 == pingResult.getRoomStatus() && pingResult.getRoomId() == this.f19297c) {
                                    this.f19301g.mo13229d();
                                    break;
                                } else if (pingResult.getMosaicStatus() != 0) {
                                    this.f19301g.mo13227a(pingResult.getRoomId(), (long) pingResult.getMosaicStatus());
                                }
                            }
                        } else {
                            int errorCode = ((C2949a) obj).getErrorCode();
                            if (30001 != errorCode && 30003 != errorCode && 30004 != errorCode) {
                                if (50002 == errorCode) {
                                    this.f19301g.mo13230e();
                                    break;
                                }
                            } else {
                                this.f19301g.mo13226a(errorCode);
                            }
                        }
                    }
                    return;
                case 8:
                    mo13225b();
                    break;
            }
        }
    }

    public C7091b(long j, long j2, String str, boolean z, C7092a aVar) {
        this.f19297c = j;
        this.f19298d = j2;
        this.f19299e = str;
        this.f19300f = z;
        this.f19301g = aVar;
        this.f19302h = C2942b.m8369a();
    }
}
