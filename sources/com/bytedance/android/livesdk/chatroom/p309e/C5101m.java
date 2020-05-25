package com.bytedance.android.livesdk.chatroom.p309e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.LotteryEventMessage;
import com.bytedance.android.livesdkapi.message.C8845b;
import com.bytedance.android.livesdkapi.message.C8848e;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.android.livesdkapi.message.C8853i;
import com.bytedance.android.livesdkapi.message.C8857m;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.m */
public final class C5101m extends C5084b<LotteryEventMessage> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo10981f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo10984l() {
        return null;
    }

    /* renamed from: e */
    public final User mo10980e() {
        Object obj;
        boolean z;
        LotteryEventMessage lotteryEventMessage = (LotteryEventMessage) this.f13643a;
        if (lotteryEventMessage != null) {
            C8845b bVar = lotteryEventMessage.baseMessage;
            if (bVar != null) {
                C8851g gVar = bVar.f24139j;
                if (gVar != null) {
                    List<C8853i> list = gVar.f24158d;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            C8853i iVar = (C8853i) obj;
                            C52711k.m112236a((Object) iVar, "it");
                            if (iVar.f24162a != C8848e.USER.getPieceType() || iVar.f24165d == null) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        C8853i iVar2 = (C8853i) obj;
                        if (iVar2 != null) {
                            C8857m mVar = iVar2.f24165d;
                            if (mVar != null) {
                                return mVar.f24174a;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public C5101m(LotteryEventMessage lotteryEventMessage) {
        C52711k.m112240b(lotteryEventMessage, "message");
        super(lotteryEventMessage);
    }
}
