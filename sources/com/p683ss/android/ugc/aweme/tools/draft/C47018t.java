package com.p683ss.android.ugc.aweme.tools.draft;

import android.text.TextUtils;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1451a.C23893a;
import com.p683ss.android.ugc.aweme.tools.draft.p2357c.C46981a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.t */
final class C47018t {
    /* renamed from: a */
    static void m102109a(List<C29059c> list) {
        if (!C9414h.m18630a(list)) {
            C23893a aVar = new C23893a();
            for (C29059c cVar : list) {
                if (cVar != null) {
                    aVar.mo49499a(cVar);
                    cVar.f76123A = aVar.mo49498a();
                }
            }
        }
    }

    /* renamed from: a */
    static List<C29059c> m102108a(List<C46981a<Object>> list, boolean z) {
        if (C9376b.m18558a((Collection<T>) list)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C46981a aVar = (C46981a) list.get(i);
            if (!(aVar == null || aVar.f118686b == null)) {
                ArrayList<C29059c> arrayList2 = aVar.f118686b;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    C29059c cVar = (C29059c) arrayList2.get(i2);
                    if (cVar != null) {
                        if (i2 == 0 && !z && cVar.f76147e != null && !TextUtils.isEmpty(cVar.f76147e.getName())) {
                            C29059c cVar2 = new C29059c();
                            cVar2.f76147e = cVar.f76147e;
                            cVar2.f76164v = 1;
                            arrayList.add(cVar2);
                        }
                        if (i2 != arrayList2.size() - 1 || z) {
                            cVar.f76166x = false;
                        } else {
                            cVar.f76166x = true;
                        }
                        arrayList.add(cVar);
                    }
                }
            }
        }
        return arrayList;
    }
}
