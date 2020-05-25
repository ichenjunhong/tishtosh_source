package com.bytedance.android.livesdk.cov19;

import android.os.CountDownTimer;
import com.bytedance.android.livesdk.chatroom.presenter.C5868cl;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C7833bh;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedList;

/* renamed from: com.bytedance.android.livesdk.cov19.b */
public final class C6724b extends C5868cl<C6728c> implements C6735i, OnMessageListener {

    /* renamed from: a */
    public int f18387a;

    /* renamed from: b */
    public C6728c f18388b;

    /* renamed from: c */
    long f18389c;

    /* renamed from: d */
    LinkedList<C7833bh> f18390d = new LinkedList<>();

    /* renamed from: e */
    public C6722b f18391e;

    /* renamed from: f */
    public boolean f18392f;

    /* renamed from: g */
    public boolean f18393g;

    /* renamed from: h */
    C6726b f18394h;

    /* renamed from: i */
    public long f18395i;

    /* renamed from: com.bytedance.android.livesdk.cov19.b$a */
    enum C6725a {
        DISPLAY,
        EXPIRE
    }

    /* renamed from: com.bytedance.android.livesdk.cov19.b$b */
    class C6726b {

        /* renamed from: a */
        CountDownTimer f18399a;

        /* renamed from: b */
        int f18400b;

        /* renamed from: c */
        int f18401c;

        /* renamed from: d */
        C6725a f18402d;

        /* renamed from: e */
        boolean f18403e;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo12843a() {
            C67271 r0 = new CountDownTimer((long) (((this.f18400b * 60) + this.f18401c) * 3000), 1000) {
                public final void onFinish() {
                }

                public final void onTick(long j) {
                    String str;
                    C6726b bVar = C6726b.this;
                    if (bVar.f18401c > 0) {
                        bVar.f18401c--;
                    } else if (bVar.f18400b > 0) {
                        bVar.f18401c = 59;
                        bVar.f18400b--;
                    }
                    if (bVar.f18402d == C6725a.DISPLAY && C6724b.this.f18391e != C6722b.PENDING && (bVar.f18400b * 60) + bVar.f18401c <= ((Integer) LiveSettingKeys.LIVE_LUCKY_BOX_TO_SHOW.mo9431a()).intValue()) {
                        C6724b.this.f18391e = C6722b.PENDING;
                        C6724b.this.f18388b.mo12835c();
                    }
                    C6728c cVar = C6724b.this.f18388b;
                    if (bVar.f18401c < 10) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(bVar.f18400b);
                        sb.append(":0");
                        sb.append(bVar.f18401c);
                        str = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(bVar.f18400b);
                        sb2.append(":");
                        sb2.append(bVar.f18401c);
                        str = sb2.toString();
                    }
                    cVar.mo12834a(str);
                    C6724b.this.f18387a = (bVar.f18400b * 60) + bVar.f18401c;
                    if (bVar.f18401c <= 0 && bVar.f18400b <= 0) {
                        if (bVar.f18402d == C6725a.DISPLAY) {
                            if (!bVar.f18403e) {
                                bVar.f18403e = true;
                                bVar.f18399a.cancel();
                                C6724b.this.f18388b.mo12833a();
                            }
                        } else if (bVar.f18402d == C6725a.EXPIRE) {
                            if (C6724b.this.f18391e == C6722b.READY || (C6724b.this.f18391e == C6722b.GOT && !C6724b.this.f18393g)) {
                                C6724b.this.f18391e = C6722b.NOT_ACTIVE;
                            } else if (C6724b.this.f18391e == C6722b.GOT && C6724b.this.f18393g) {
                                C6724b.this.f18391e = C6722b.FINISHED;
                            }
                            bVar.f18399a.cancel();
                            C6724b.this.f18388b.mo12835c();
                            C6724b.this.f18392f = false;
                            C6724b.this.f18395i = 0;
                            C6724b.this.mo12840b();
                        }
                    }
                }
            };
            this.f18399a = r0;
            this.f18399a.start();
            if (this.f18402d == C6725a.DISPLAY) {
                C6724b.this.f18392f = true;
                C6724b.this.f18391e = C6722b.NOT_ACTIVE;
                C6724b.this.f18388b.mo12835c();
            }
        }

        C6726b(int i, int i2, C6725a aVar) {
            this.f18400b = i;
            this.f18401c = i2;
            this.f18402d = aVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.cov19.b$c */
    public interface C6728c extends C6463ay {
        /* renamed from: a */
        void mo12833a();

        /* renamed from: a */
        void mo12834a(String str);

        /* renamed from: c */
        void mo12835c();

        /* renamed from: d */
        void mo12836d();
    }

    C6724b() {
    }

    /* renamed from: d */
    public final void mo12841d() {
        this.f18391e = C6722b.GOT;
        this.f18388b.mo12835c();
    }

    /* renamed from: b */
    public final void mo12840b() {
        if (this.f18390d.size() > 0) {
            m14115a((C7833bh) this.f18390d.removeFirst());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int mo12842e() {
        if ((this.f18391e != C6722b.NOT_ACTIVE || this.f18387a <= 0) && this.f18391e != C6722b.PENDING) {
            return -1;
        }
        return this.f18387a;
    }

    public final void onMessage(IMessage iMessage) {
        this.f18390d.addLast((C7833bh) iMessage);
        if (!this.f18392f) {
            mo12840b();
        }
    }

    /* renamed from: a */
    public final void mo8520a(C6728c cVar) {
        super.mo8520a(cVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.LUCKY_BOX.getIntType(), this);
        }
    }

    /* renamed from: a */
    private void m14115a(C7833bh bhVar) {
        int a = (int) (bhVar.mo14146a() / 1000);
        if (a > 0) {
            this.f18395i = bhVar.f21607b;
            if (bhVar.f21625t < 10100 || bhVar.f21625t >= 10200) {
                this.f18393g = false;
            } else {
                this.f18393g = true;
            }
            mo12838a(a / 60, a % 60, C6725a.DISPLAY);
            return;
        }
        mo12840b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12838a(int i, int i2, C6725a aVar) {
        this.f18394h = new C6726b(i, i2, aVar);
        this.f18394h.mo12843a();
    }
}
