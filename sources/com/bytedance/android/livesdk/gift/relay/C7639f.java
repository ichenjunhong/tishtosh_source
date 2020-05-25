package com.bytedance.android.livesdk.gift.relay;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.gift.C7519o;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.message.model.C7804aj;
import com.bytedance.android.livesdkapi.message.C8845b;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.android.livesdkapi.message.C8853i;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.Collection;
import java.util.Iterator;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.relay.f */
final /* synthetic */ class C7639f implements C1710e {

    /* renamed from: a */
    private final C7634b f21034a;

    /* renamed from: b */
    private final long f21035b;

    /* renamed from: c */
    private final long f21036c;

    C7639f(C7634b bVar, long j, long j2) {
        this.f21034a = bVar;
        this.f21035b = j;
        this.f21036c = j2;
    }

    public final void accept(Object obj) {
        Iterator it;
        C7634b bVar = this.f21034a;
        long j = this.f21035b;
        long j2 = this.f21036c;
        C7514m mVar = (C7514m) ((C4177d) obj).data;
        if (mVar != null) {
            bVar.f21015l.setVisibility(8);
            bVar.f21017n.setVisibility(0);
            if (bVar.f21018o != null && bVar.f21018o.isRunning()) {
                bVar.f21018o.cancel();
            }
            bVar.f21018o = ObjectAnimator.ofFloat(bVar.f21017n, "progress", new float[]{360.0f, 0.0f}).setDuration(((long) bVar.f21020q) * 1000);
            bVar.f21018o.start();
            User user = null;
            bVar.f21017n.startScaleAnim(((long) bVar.f21020q) * 1000, null);
            if (bVar.f21019p.hasMessages(0)) {
                bVar.f21019p.removeMessages(0);
            }
            bVar.f21019p.sendEmptyMessageDelayed(0, ((long) bVar.f21020q) * 1000);
            bVar.f21021r = mVar;
            ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10091a(mVar.f20611c);
            if (bVar.f21007c != null) {
                IMessageManager iMessageManager = (IMessageManager) bVar.f21007c.get("data_message_manager", null);
                if (iMessageManager != null) {
                    User user2 = (User) bVar.f21007c.get("data_user_in_room", null);
                    long id = bVar.f21008d.getId();
                    User owner = bVar.f21008d.getOwner();
                    C7804aj ajVar = new C7804aj();
                    C8845b bVar2 = new C8845b();
                    bVar2.f24132c = id;
                    bVar2.f24133d = mVar.f20619k;
                    bVar2.f24136g = true;
                    bVar2.f24135f = mVar.f20612d;
                    bVar2.f24139j = mVar.f20609a;
                    ajVar.baseMessage = bVar2;
                    C8851g gVar = mVar.f20609a;
                    if (gVar != null && !C9376b.m18558a((Collection<T>) gVar.f24158d)) {
                        Iterator it2 = gVar.f24158d.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C8853i iVar = (C8853i) it2.next();
                            if (iVar.f24165d == null || iVar.f24165d.f24174a == null) {
                                it = it2;
                            } else {
                                it = it2;
                                if (C7519o.m15514a(iVar.f24165d.f24174a, ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b())) {
                                    user = iVar.f24165d.f24174a;
                                    break;
                                }
                            }
                            it2 = it;
                        }
                    }
                    if (user != null) {
                        ajVar.f21469f = user;
                    } else if (user2 != null) {
                        ajVar.f21469f = user2;
                    } else {
                        ajVar.f21469f = User.from(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a());
                    }
                    ajVar.f21467d = (long) mVar.f20616h;
                    ajVar.f21465b = (long) mVar.f20610b;
                    ajVar.f21464a = mVar.f20613e;
                    ajVar.f21470g = owner;
                    ajVar.f21468e = (long) mVar.f20618j;
                    ajVar.f21466c = (long) mVar.f20614f;
                    ajVar.f21471h = mVar.f20624p;
                    ajVar.f21472i = true;
                    ajVar.isLocalInsertMsg = true;
                    iMessageManager.insertMessage(ajVar);
                    if (mVar.f20624p != null) {
                        bVar.mo13996a(mVar.f20624p.f20981m, mVar.f20624p.f20980l);
                    }
                    bVar.f21007c.lambda$put$1$DataCenter("data_gift_relay_recent_sent_index", Integer.valueOf(bVar.f21014k.mo13991a(bVar.f21014k.f20964b)));
                }
            }
        }
        C7647s.m15648a(j, bVar.f21008d.getId(), SystemClock.uptimeMillis() - j2);
    }
}
