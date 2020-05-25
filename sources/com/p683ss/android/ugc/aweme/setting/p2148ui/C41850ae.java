package com.p683ss.android.ugc.aweme.setting.p2148ui;

import com.p683ss.android.ugc.aweme.p1445bp.C23891e;
import com.p683ss.android.ugc.aweme.setting.p2148ui.DiskManagerActivity.C41736a;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ae */
final /* synthetic */ class C41850ae implements C2205y {

    /* renamed from: a */
    static final C2205y f105995a = new C41850ae();

    private C41850ae() {
    }

    public final void subscribe(C2204x xVar) {
        try {
            C41736a aVar = DiskManagerActivity.f105656b;
            long c = C41736a.m91666c();
            boolean z = false;
            if (C23891e.f63559a.mo49497a(false)) {
                if (c >= C41736a.m91665b()) {
                    C23891e eVar = C23891e.f63559a;
                    if (System.currentTimeMillis() - C23891e.m58604a().getLong("last_show_disk_manager_dot_time", 0) >= 2592000000L) {
                    }
                }
                xVar.mo6282a(Boolean.valueOf(z));
                xVar.mo6273a();
            }
            z = true;
            xVar.mo6282a(Boolean.valueOf(z));
            xVar.mo6273a();
        } catch (Exception e) {
            xVar.mo6274a((Throwable) e);
        }
    }
}
