package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35423b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bs */
final /* synthetic */ class C35261bs implements OnClickListener {

    /* renamed from: a */
    private final int f90592a;

    /* renamed from: b */
    private final C35423b f90593b;

    /* renamed from: c */
    private final Runnable f90594c;

    C35261bs(int i, C35423b bVar, Runnable runnable) {
        this.f90592a = i;
        this.f90593b = bVar;
        this.f90594c = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f90592a;
        C35423b bVar = this.f90593b;
        Runnable runnable = this.f90594c;
        C35284t.m79782a().mo73401b(i2);
        if (bVar != null) {
            bVar.mo70618a(dialogInterface, i);
        }
        if (runnable != null && i == -1) {
            runnable.run();
        }
    }
}
