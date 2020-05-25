package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.selectmsg.C33706a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.s */
final /* synthetic */ class C33704s implements C33706a {

    /* renamed from: a */
    private final C33689r f87415a;

    C33704s(C33689r rVar) {
        this.f87415a = rVar;
    }

    /* renamed from: a */
    public final void mo71730a(boolean z, int i) {
        C33689r rVar = this.f87415a;
        if (rVar.f87369n != null && i < rVar.f86483b.size() && i >= 0) {
            C11207p pVar = (C11207p) rVar.f86483b.get(i);
            if (pVar != null) {
                List list = (List) rVar.f87369n.getValue();
                if (list == null) {
                    list = new ArrayList();
                }
                boolean contains = list.contains(pVar);
                if (z && !contains) {
                    list.add(pVar);
                    rVar.f87369n.setValue(list);
                } else if (!z && contains) {
                    list.remove(pVar);
                    rVar.f87369n.setValue(list);
                }
            }
        }
    }
}
