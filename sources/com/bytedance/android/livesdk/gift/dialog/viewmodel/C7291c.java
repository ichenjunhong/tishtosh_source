package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import com.bytedance.android.livesdk.gift.model.C7507f;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.c */
final class C7291c {
    C7291c() {
    }

    /* renamed from: a */
    static void m15109a(C7290b bVar, C7289a aVar) {
        Object obj = aVar.f19850b;
        int i = aVar.f19849a;
        if (i != 1) {
            if (i == 10) {
                bVar.f19851a = 2;
                if (obj instanceof C7507f) {
                    bVar.mo13542a((C7507f) obj);
                    return;
                }
            } else if (!(i == 12 || i == 14)) {
                switch (i) {
                    case 5:
                        bVar.f19851a = 1;
                        if (obj instanceof Integer) {
                            bVar.f19857g = ((Integer) obj).intValue();
                            bVar.mo13541a((C7491b) null);
                            bVar.f19861k = false;
                            return;
                        }
                        break;
                    case 6:
                        bVar.f19851a = 2;
                        if (obj instanceof C7491b) {
                            bVar.mo13541a((C7491b) obj);
                            return;
                        }
                        break;
                    case 7:
                        bVar.f19851a = 3;
                        return;
                }
            }
        }
        bVar.f19851a = 0;
    }
}
