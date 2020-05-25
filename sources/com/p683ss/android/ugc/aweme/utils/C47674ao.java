package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23392f;
import com.p683ss.android.ugc.aweme.friends.C32502a;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32753b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.utils.permission.PermissionStateReporter;

/* renamed from: com.ss.android.ugc.aweme.utils.ao */
final /* synthetic */ class C47674ao implements C23364b {

    /* renamed from: a */
    private final C32753b f120154a;

    /* renamed from: b */
    private final Activity f120155b;

    C47674ao(C32753b bVar, Activity activity) {
        this.f120154a = bVar;
        this.f120155b = activity;
    }

    /* renamed from: a */
    public final void mo40906a(String[] strArr, int[] iArr) {
        C32753b bVar = this.f120154a;
        Activity activity = this.f120155b;
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                if (bVar != null) {
                    bVar.mo60072a();
                }
                PermissionStateReporter.m103713d().mo95108e();
                return;
            }
            if (bVar != null) {
                bVar.mo60073b();
            }
            ((C32502a) C23392f.m57473a(activity, C32502a.class)).mo48498b(true);
        }
    }
}
