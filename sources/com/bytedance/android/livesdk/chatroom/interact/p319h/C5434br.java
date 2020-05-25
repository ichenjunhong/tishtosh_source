package com.bytedance.android.livesdk.chatroom.interact.p319h;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.interact.C5278al;
import com.bytedance.android.livesdkapi.depend.model.live.C8722v;
import java.util.Iterator;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.br */
final /* synthetic */ class C5434br implements C1710e {

    /* renamed from: a */
    private final C5423bh f14421a;

    /* renamed from: b */
    private final long f14422b;

    /* renamed from: c */
    private final long f14423c;

    C5434br(C5423bh bhVar, long j, long j2) {
        this.f14421a = bhVar;
        this.f14422b = j;
        this.f14423c = j2;
    }

    public final void accept(Object obj) {
        C5423bh bhVar = this.f14421a;
        long j = this.f14422b;
        long j2 = this.f14423c;
        C4177d dVar = (C4177d) obj;
        C5278al.m11941c(SystemClock.uptimeMillis() - j);
        if (dVar != null && dVar.data != null && ((C8722v) dVar.data).f23957c != null) {
            bhVar.f14400a.f12607B = ((C8722v) dVar.data).f23957c.f23837i;
            bhVar.f14400a.f12628s = ((C8722v) dVar.data).f23957c.f23838j;
            Iterator it = ((C8722v) dVar.data).f23962h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                User user = (User) it.next();
                if (!TextUtils.equals(user.getIdStr(), bhVar.f14402c.getOwner().getIdStr())) {
                    bhVar.f14400a.f12606A = user;
                    break;
                }
            }
            ((C8722v) dVar.data).f23957c.f23829a = j2;
            if (bhVar.f14404e != null && !bhVar.f14404e.isDisposed()) {
                bhVar.f14404e.dispose();
            }
        }
    }
}
