package com.bytedance.android.livesdk.chatroom.interact.p321j;

import android.text.TextUtils;
import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.C5631a;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.j.j */
final /* synthetic */ class C5641j implements C1710e {

    /* renamed from: a */
    private final C5630a f14777a;

    /* renamed from: b */
    private final boolean f14778b;

    C5641j(C5630a aVar, boolean z) {
        this.f14777a = aVar;
        this.f14778b = z;
    }

    public final void accept(Object obj) {
        boolean z;
        C5630a aVar = this.f14777a;
        boolean z2 = this.f14778b;
        C4176c cVar = (C4176c) obj;
        aVar.f14754b = false;
        List list = cVar.f11365b;
        if (!list.isEmpty()) {
            if (z2) {
                aVar.mo11518a(list);
            }
            int size = aVar.f14760h.size();
            for (int i = 0; i < size; i++) {
                C5696e eVar = (C5696e) aVar.f14760h.get(i);
                eVar.f14963n = true;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C5696e eVar2 = (C5696e) it.next();
                    if (eVar == null || eVar.f14953d == null || eVar2 == null || eVar2.f14953d == null || (!TextUtils.equals(eVar.mo11637a(), eVar2.mo11637a()) && (eVar.f14953d.getId() <= 0 || eVar.f14953d.getId() != eVar2.f14953d.getId()))) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        aVar.f14760h.set(i, eVar2);
                        it.remove();
                        break;
                    }
                }
            }
            Iterator it2 = aVar.f14760h.iterator();
            while (it2.hasNext()) {
                C5696e eVar3 = (C5696e) it2.next();
                if (eVar3.f14963n) {
                    it2.remove();
                    aVar.mo11516a(eVar3);
                }
            }
            aVar.f14760h.addAll(list);
            for (C5696e eVar4 : aVar.f14760h) {
                if (eVar4.f14957h == 1) {
                    C4638d.m11114a().mo10418a(eVar4.f14962m, eVar4.f14952c);
                }
            }
            for (C5696e eVar5 : aVar.f14760h) {
                aVar.f14762j.put(eVar5.mo11637a(), Boolean.valueOf(eVar5.f14950a == 0));
            }
            for (C5631a a : aVar.f14758f) {
                a.mo11092a(aVar.f14760h);
            }
        }
    }
}
