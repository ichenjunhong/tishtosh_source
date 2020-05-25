package com.p683ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import com.p683ss.android.pushmanager.client.MessageAppManager;
import java.util.Map;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.c */
public final /* synthetic */ class C48481c implements Runnable {

    /* renamed from: a */
    private final Context f121896a;

    /* renamed from: b */
    private final Map f121897b;

    public C48481c(Context context, Map map) {
        this.f121896a = context;
        this.f121897b = map;
    }

    public final void run() {
        MessageAppManager.inst().handleAppLogUpdate(this.f121896a, this.f121897b);
    }
}
