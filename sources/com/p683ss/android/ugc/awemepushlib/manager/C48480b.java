package com.p683ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import com.p683ss.android.pushmanager.client.MessageAppManager;
import java.util.Map;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.b */
public final /* synthetic */ class C48480b implements Runnable {

    /* renamed from: a */
    private final Context f121894a;

    /* renamed from: b */
    private final Map f121895b;

    public C48480b(Context context, Map map) {
        this.f121894a = context;
        this.f121895b = map;
    }

    public final void run() {
        MessageAppManager.inst().handleAppLogUpdate(this.f121894a, this.f121895b);
    }
}
