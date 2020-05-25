package com.bytedance.android.livesdk.chatroom.p309e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C7793a;
import com.bytedance.android.livesdkapi.message.C8848e;
import com.bytedance.android.livesdkapi.message.C8853i;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.c */
public final class C5087c extends C5084b<C7793a> {
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
        if (!(this.f13643a == null || ((C7793a) this.f13643a).baseMessage == null || ((C7793a) this.f13643a).baseMessage.f24139j == null)) {
            for (C8853i iVar : ((C7793a) this.f13643a).baseMessage.f24139j.f24158d) {
                if (iVar.f24162a == C8848e.USER.getPieceType() && iVar.f24165d != null) {
                    return iVar.f24165d.f24174a;
                }
            }
        }
        return null;
    }

    public C5087c(C7793a aVar) {
        super(aVar);
    }
}
