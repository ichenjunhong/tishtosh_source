package com.bytedance.crash.p551k.p552a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.p551k.C9649f;

/* renamed from: com.bytedance.crash.k.a.d */
final class C9624d {

    /* renamed from: a */
    public int f26275a;

    /* renamed from: com.bytedance.crash.k.a.d$a */
    class C9626a extends BroadcastReceiver {
        private C9626a() {
        }

        public final void onReceive(Context context, Intent intent) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    C9624d.this.f26275a = (int) ((((float) intent.getIntExtra("level", 0)) * 100.0f) / ((float) intent.getIntExtra("scale", 100)));
                }
            } catch (Throwable unused) {
            }
        }
    }

    C9624d(final Context context) {
        C9649f.m19247b().mo17509a(new Runnable() {
            public final void run() {
                try {
                    context.registerReceiver(new C9626a(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                } catch (Throwable th) {
                    C9577e.m18999a().mo17384a("NPTH_CATCH", th);
                }
            }
        });
    }
}
