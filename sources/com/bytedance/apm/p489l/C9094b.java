package com.bytedance.apm.p489l;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.apm.C8936b;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p497o.C9149b;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.l.b */
public final class C9094b extends C9081a {

    /* renamed from: a */
    private BroadcastReceiver f24838a;

    /* renamed from: b */
    private IntentFilter f24839b;

    /* renamed from: g */
    private boolean f24840g;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo16222c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo16223d() {
        return 0;
    }

    public C9094b() {
        this.f24812e = "battery";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16220b() {
        this.f24838a = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                final float intExtra = ((float) intent.getIntExtra("temperature", 0)) / 10.0f;
                if (C8976c.m17751g()) {
                    StringBuilder sb = new StringBuilder("BatteryTemperatureColle:  ");
                    sb.append(intExtra);
                    String[] strArr = {sb.toString()};
                }
                final String topActivityClassName = ActivityLifeObserver.getInstance().getTopActivityClassName();
                if (!TextUtils.isEmpty(topActivityClassName)) {
                    C9149b.m18170a().mo16524a((Runnable) new Runnable() {
                        public final void run() {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("battery_temperature", (double) intExtra);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("scene", topActivityClassName);
                                C8936b.m17660b("temperature", jSONObject, jSONObject2, null);
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        };
        this.f24839b = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    /* renamed from: a */
    public final void mo16218a(Activity activity) {
        super.mo16218a(activity);
        if (this.f24840g) {
            try {
                C8976c.m17736a().unregisterReceiver(this.f24838a);
                this.f24840g = false;
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16219a(JSONObject jSONObject) {
        super.mo16219a(jSONObject);
        boolean z = true;
        if (jSONObject.optInt("temperature_enable_upload", 0) != 1) {
            z = false;
        }
        this.f24813f = z;
    }

    /* renamed from: b */
    public final void mo16221b(Activity activity) {
        super.mo16221b(activity);
        if (!this.f24840g) {
            try {
                C8976c.m17736a().registerReceiver(this.f24838a, this.f24839b);
                this.f24840g = true;
            } catch (Exception unused) {
            }
        }
    }
}
