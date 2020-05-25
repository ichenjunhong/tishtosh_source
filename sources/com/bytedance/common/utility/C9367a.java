package com.bytedance.common.utility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.common.utility.C9425l.C9426a;

/* renamed from: com.bytedance.common.utility.a */
public final class C9367a {

    /* renamed from: a */
    public final Context f25599a;

    /* renamed from: b */
    public boolean f25600b;

    /* renamed from: c */
    public BroadcastReceiver f25601c;

    /* renamed from: d */
    public C9426a f25602d = C9426a.MOBILE;

    public C9367a(Context context) {
        this.f25599a = context;
        if (!this.f25600b) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.f25601c = new BroadcastReceiver() {
                public final void onReceive(Context context, Intent intent) {
                    if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        try {
                            C9367a.this.f25602d = C9425l.m18652c(C9367a.this.f25599a);
                        } catch (Exception unused) {
                        }
                    }
                }
            };
            this.f25600b = true;
            try {
                this.f25599a.registerReceiver(this.f25601c, intentFilter);
            } catch (Throwable unused) {
            }
        }
        this.f25602d = C9425l.m18652c(this.f25599a);
    }
}
