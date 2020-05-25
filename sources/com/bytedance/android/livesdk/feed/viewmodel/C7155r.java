package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.livesdk.feed.feed.C6945f;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.feed.viewmodel.r */
final /* synthetic */ class C7155r implements C1711f {

    /* renamed from: a */
    static final C1711f f19432a = new C7155r();

    private C7155r() {
    }

    public final Object apply(Object obj) {
        List<C6945f> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (C6945f fVar : list) {
            if (fVar != null && fVar.mo13133b()) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }
}
