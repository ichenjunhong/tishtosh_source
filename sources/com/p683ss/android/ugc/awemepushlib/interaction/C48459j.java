package com.p683ss.android.ugc.awemepushlib.interaction;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.newmedia.redbadge.C19592b;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.j */
final /* synthetic */ class C48459j implements Runnable {

    /* renamed from: a */
    private final Activity f121833a;

    C48459j(Activity activity) {
        this.f121833a = activity;
    }

    public final void run() {
        Activity activity = this.f121833a;
        if (C48445d.f121813b == 0) {
            C19592b a = C19592b.m47911a((Context) activity);
            if (a.f53975a != null) {
                if (!a.f53979e) {
                    a.f53979e = true;
                    a.f53976b.sendEmptyMessage(0);
                } else if (a.f53978d) {
                    a.f53978d = false;
                    a.f53976b.sendEmptyMessage(3);
                }
                a.f53976b.removeCallbacks(a.f53980f);
            }
        }
    }
}
