package com.google.android.gms.tagmanager;

import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.bb */
final class C17191bb implements C17205b {

    /* renamed from: a */
    private final /* synthetic */ C17207d f48612a;

    C17191bb(C17207d dVar) {
        this.f48612a = dVar;
    }

    /* renamed from: a */
    public final void mo33441a(Map<String, Object> map) {
        Object obj = map.get("event");
        if (obj != null) {
            C17207d dVar = this.f48612a;
            String obj2 = obj.toString();
            for (C17200bk bkVar : dVar.f48647c.values()) {
                if (!bkVar.f48628c) {
                    bkVar.f48626a.f48563b.mo33437a(obj2);
                }
            }
        }
    }
}
