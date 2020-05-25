package com.p683ss.android.newmedia.redbadge;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p683ss.android.message.C19477e;
import com.p683ss.android.pushmanager.p1204a.C19664c;

/* renamed from: com.ss.android.newmedia.redbadge.j */
public final class C19613j implements C19477e {

    /* renamed from: a */
    private C19602d f54031a;

    /* renamed from: a */
    public final void mo40614a() {
    }

    /* renamed from: a */
    public final void mo40615a(Context context) {
        try {
            this.f54031a = C19602d.m47945a(C19664c.m48034b().mo41009a());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo40616a(Intent intent) {
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras.getBoolean("app_entrance")) {
                if (this.f54031a != null) {
                    C19602d dVar = this.f54031a;
                    if (dVar.f54003e) {
                        dVar.f54002d.sendEmptyMessage(1);
                    }
                }
                return;
            }
            if (extras.getBoolean("app_exit") && this.f54031a != null) {
                C19602d dVar2 = this.f54031a;
                if (dVar2.f54003e) {
                    dVar2.f54002d.sendEmptyMessage(2);
                }
            }
        }
    }
}
