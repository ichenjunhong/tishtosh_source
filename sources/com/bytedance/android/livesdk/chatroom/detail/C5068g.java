package com.bytedance.android.livesdk.chatroom.detail;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.chatroom.p306bl.C5014i;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.google.gson.C17971f;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.g */
public final class C5068g implements C9382a {

    /* renamed from: a */
    public boolean f13563a = false;

    /* renamed from: b */
    private final Handler f13564b = new C9381g(this);

    /* renamed from: c */
    private final long f13565c;

    /* renamed from: d */
    private final long f13566d;

    /* renamed from: e */
    private final String f13567e;

    /* renamed from: f */
    private final boolean f13568f;

    /* renamed from: g */
    private final C5069a f13569g;

    /* renamed from: h */
    private C17971f f13570h;

    /* renamed from: i */
    private long f13571i = ((long) ((Integer) LiveConfigSettingKeys.AUDIENCE_PING_INTERVAL.mo9431a()).intValue());

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.g$a */
    public interface C5069a {
        /* renamed from: a */
        void mo10946a(int i);

        /* renamed from: a */
        boolean mo10947a();

        /* renamed from: b */
        void mo10948b();

        /* renamed from: c */
        void mo10949c();
    }

    /* renamed from: a */
    public final void mo10944a() {
        if (this.f13563a) {
            this.f13563a = false;
            this.f13564b.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: b */
    public void mo10945b() {
        if (!this.f13563a || !this.f13569g.mo10947a()) {
            mo10944a();
            return;
        }
        C5014i.m11511a(this.f13564b, this.f13565c, this.f13566d, this.f13568f, 7);
        if (this.f13571i > 0 && this.f13571i >= ((long) ((Integer) LiveConfigSettingKeys.AUDIENCE_PING_INTERVAL.mo9431a()).intValue())) {
            this.f13564b.sendMessageDelayed(this.f13564b.obtainMessage(8), this.f13571i * 1000);
        }
    }

    public final void handleMsg(Message message) {
        if (this.f13563a) {
            switch (message.what) {
                case 7:
                    Object obj = message.obj;
                    if (this.f13563a) {
                        if (!(obj instanceof C2949a)) {
                            if (obj instanceof PingResult) {
                                long currentTimeMillis = System.currentTimeMillis();
                                C3831a.m9710b(2, "pingresult", this.f13570h.mo34889b(obj));
                                C3831a.m9704a(2, "pingresultCostTime", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                                PingResult pingResult = (PingResult) obj;
                                this.f13571i = pingResult.getNextPingInterval();
                                if (4 == pingResult.getRoomStatus() && pingResult.getRoomId() == this.f13565c) {
                                    this.f13569g.mo10948b();
                                    break;
                                } else if (pingResult.getMosaicStatus() != 0) {
                                    pingResult.getRoomId();
                                    pingResult.getMosaicStatus();
                                }
                            }
                        } else {
                            int errorCode = ((C2949a) obj).getErrorCode();
                            if (30001 != errorCode && 30003 != errorCode && 30004 != errorCode) {
                                if (50002 == errorCode) {
                                    this.f13569g.mo10949c();
                                    break;
                                }
                            } else {
                                this.f13569g.mo10946a(errorCode);
                            }
                        }
                    }
                    return;
                case 8:
                    mo10945b();
                    break;
            }
        }
    }

    public C5068g(long j, long j2, String str, boolean z, C5069a aVar) {
        this.f13565c = j;
        this.f13566d = j2;
        this.f13567e = str;
        this.f13568f = false;
        this.f13569g = aVar;
        this.f13570h = C2942b.m8369a();
    }
}
