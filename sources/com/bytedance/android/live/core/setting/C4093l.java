package com.bytedance.android.live.core.setting;

/* renamed from: com.bytedance.android.live.core.setting.l */
final /* synthetic */ class C4093l implements Runnable {

    /* renamed from: a */
    private final C4090k f11260a;

    C4093l(C4090k kVar) {
        this.f11260a = kVar;
    }

    public final void run() {
        C4090k kVar = this.f11260a;
        String obj = kVar.f11249a.getText().toString();
        kVar.f11252d.clear();
        for (C4097p pVar : kVar.f11251c) {
            String str = pVar.f11267a;
            String replace = str.replace("_", "");
            String str2 = pVar.f11268b;
            if (str.contains(obj) || str2.contains(obj) || replace.contains(obj)) {
                kVar.f11252d.add(pVar);
            }
        }
        kVar.f11253e.notifyDataSetChanged();
    }
}
