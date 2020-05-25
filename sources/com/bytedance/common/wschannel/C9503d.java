package com.bytedance.common.wschannel;

import android.content.Context;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.C9438a;

/* renamed from: com.bytedance.common.wschannel.d */
public class C9503d {

    /* renamed from: b */
    private static C9503d f25896b;

    /* renamed from: a */
    public final C9438a f25897a = WsChannelMultiProcessSharedProvider.m18702a(this.f25898c);

    /* renamed from: c */
    private final Context f25898c;

    /* renamed from: a */
    public final boolean mo17230a() {
        return this.f25897a.mo17080a("frontier_enabled", true);
    }

    /* renamed from: b */
    public final boolean mo17231b() {
        return this.f25897a.mo17080a("enableAppStateChangeReport", false);
    }

    private C9503d(Context context) {
        this.f25898c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C9503d m18870a(Context context) {
        if (f25896b == null) {
            synchronized (C9503d.class) {
                if (f25896b == null) {
                    f25896b = new C9503d(context);
                }
            }
        }
        return f25896b;
    }
}
