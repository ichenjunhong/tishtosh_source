package com.bytedance.android.live.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.live.wallet.api.C4303i;
import com.bytedance.android.live.wallet.api.C4303i.C4309f;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import java.util.HashMap;

public class LiveBillingActivityProxy extends LiveActivityProxy {

    /* renamed from: a */
    private static C4284a f11774a;

    /* renamed from: com.bytedance.android.live.wallet.LiveBillingActivityProxy$a */
    public interface C4284a {
        /* renamed from: a */
        void mo10030a(int i, int i2, String str);
    }

    public void onCreate() {
        super.onCreate();
        HashMap hashMap = new HashMap();
        if (mo15092b() != null) {
            Bundle extras = mo15092b().getExtras();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    String string = extras.getString(str);
                    if (string == null) {
                        string = "";
                    }
                    hashMap.put(str, string);
                }
            }
        }
        C4303i iVar = (C4303i) C4285a.m10552a(C4303i.class);
        if (iVar != null) {
            iVar.mo10075a(this.f23571d, "GOOGLE_PAY", hashMap, 111, new Bundle());
        }
    }

    public LiveBillingActivityProxy(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    /* renamed from: a */
    public static void m10549a(C4284a aVar) {
        f11774a = aVar;
    }

    /* renamed from: a */
    public final void mo10029a(int i, int i2, Intent intent) {
        super.mo10029a(i, i2, intent);
        if (i == 111) {
            int i3 = -1;
            if (i2 == -1 && f11774a != null) {
                int i4 = 1;
                String str = null;
                if (!(intent == null || intent.getExtras() == null)) {
                    i4 = intent.getExtras().getInt(C4309f.f11800a);
                    Bundle bundleExtra = intent.getBundleExtra(C4309f.f11801b);
                    int i5 = bundleExtra.getInt(C4309f.f11802c);
                    str = bundleExtra.getString(C4309f.f11803d);
                    i3 = i5;
                }
                f11774a.mo10030a(i4, i3, str);
            }
        }
    }
}
