package com.bytedance.android.livesdk.kickout;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.kickout.api.BannedApiV2;
import com.bytedance.android.livesdk.kickout.p390b.C7723a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.kickout.a */
public final class C7715a implements C9382a {

    /* renamed from: a */
    public C7722b f21222a;

    /* renamed from: b */
    public C9381g f21223b = new C9381g(this);

    /* renamed from: c */
    private boolean f21224c = true;

    public final void handleMsg(Message message) {
        switch (message.what) {
            case 1:
                if (message.obj instanceof Exception) {
                    this.f21222a.mo14066a(true, (Exception) message.obj);
                    return;
                } else {
                    this.f21222a.mo14068b(true);
                    return;
                }
            case 2:
                if (message.obj instanceof Exception) {
                    this.f21222a.mo14066a(false, (Exception) message.obj);
                    return;
                } else {
                    this.f21222a.mo14068b(false);
                    return;
                }
            case 3:
                if (this.f21222a != null) {
                    this.f21222a.mo14067b();
                }
                if (!(message.obj instanceof Exception)) {
                    C7723a aVar = (C7723a) message.obj;
                    if (aVar != null) {
                        if (this.f21222a != null) {
                            this.f21222a.mo14065a(aVar, (Exception) null);
                        }
                        this.f21224c = aVar.f11366c.hasMore;
                        break;
                    }
                } else {
                    Exception exc = (Exception) message.obj;
                    if (this.f21222a != null) {
                        this.f21222a.mo14065a((C7723a) null, exc);
                    }
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public final void mo14059a(boolean z, long j, long j2) {
        C2201v vVar;
        final int i;
        if (z) {
            vVar = ((BannedApiV2) C4514j.m10883j().mo10321b().mo9550a(BannedApiV2.class)).kickOut(j, j2);
        } else {
            vVar = ((BannedApiV2) C4514j.m10883j().mo10321b().mo9550a(BannedApiV2.class)).unKickOut(j, j2);
        }
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        vVar.mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C1710e<C4177d<Void>>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                C4177d dVar = (C4177d) obj;
                if (C7715a.this.f21223b != null) {
                    C7715a.this.f21223b.sendMessage(C7715a.this.f21223b.obtainMessage(i));
                }
            }
        }, (C1710e<? super Throwable>) new C1710e<Throwable>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                Throwable th = (Throwable) obj;
                if ((th instanceof Exception) && C7715a.this.f21223b != null) {
                    Message obtainMessage = C7715a.this.f21223b.obtainMessage(i);
                    obtainMessage.obj = th;
                    C7715a.this.f21223b.sendMessage(obtainMessage);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo14058a(long j, String str, int i, int i2) {
        C2201v vVar;
        if (this.f21224c) {
            if (this.f21222a != null) {
                this.f21222a.mo14064a();
            }
            if (TextUtils.equals("activity_kick_out", str)) {
                vVar = ((BannedApiV2) C4514j.m10883j().mo10321b().mo9550a(BannedApiV2.class)).getKickedOutList(j, 20, i, TTLiveSDKContext.getHostService().mo10315h().mo14521a().getSecUid());
            } else {
                vVar = ((BannedApiV2) C4514j.m10883j().mo10321b().mo9550a(BannedApiV2.class)).getBannedTalkList(j, 20, i, TTLiveSDKContext.getHostService().mo10315h().mo14521a().getSecUid());
            }
            vVar.mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C1710e<C7723a>() {
                public final /* synthetic */ void accept(Object obj) throws Exception {
                    C7723a aVar = (C7723a) obj;
                    if (C7715a.this.f21223b != null) {
                        Message obtainMessage = C7715a.this.f21223b.obtainMessage(3);
                        obtainMessage.obj = aVar;
                        C7715a.this.f21223b.sendMessage(obtainMessage);
                    }
                }
            }, (C1710e<? super Throwable>) new C1710e<Throwable>() {
                public final /* synthetic */ void accept(Object obj) throws Exception {
                    Throwable th = (Throwable) obj;
                    if ((th instanceof Exception) && C7715a.this.f21223b != null) {
                        Message obtainMessage = C7715a.this.f21223b.obtainMessage(3);
                        obtainMessage.obj = th;
                        C7715a.this.f21223b.sendMessage(obtainMessage);
                    }
                }
            });
        }
    }
}
