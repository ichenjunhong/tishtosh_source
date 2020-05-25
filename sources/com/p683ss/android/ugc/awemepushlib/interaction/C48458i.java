package com.p683ss.android.ugc.awemepushlib.interaction;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.message.C19481h;
import com.p683ss.android.message.C19482i;
import com.p683ss.android.newmedia.redbadge.C19592b;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.i */
final /* synthetic */ class C48458i implements Runnable {

    /* renamed from: a */
    private final Activity f121832a;

    C48458i(Activity activity) {
        this.f121832a = activity;
    }

    public final void run() {
        Activity activity = this.f121832a;
        try {
            Intent b = C19481h.m47693b(activity);
            b.putExtra("do_schedule_pause", true);
            C19482i.m47696a(activity, b);
        } catch (Exception unused) {
        }
        if (C48445d.f121813b == 0) {
            C19592b.m47911a((Context) activity).mo40831b();
        }
    }
}
