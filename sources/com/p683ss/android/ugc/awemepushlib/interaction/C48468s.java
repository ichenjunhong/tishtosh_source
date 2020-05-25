package com.p683ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.s */
final /* synthetic */ class C48468s implements Runnable {

    /* renamed from: a */
    private final JSONObject f121847a;

    /* renamed from: b */
    private final Context f121848b;

    C48468s(JSONObject jSONObject, Context context) {
        this.f121847a = jSONObject;
        this.f121848b = context;
    }

    public final void run() {
        C484472.m104861a(this.f121847a, this.f121848b);
    }
}
