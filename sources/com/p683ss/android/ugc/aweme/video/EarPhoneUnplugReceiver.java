package com.p683ss.android.ugc.aweme.video;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel.C32964a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.video.EarPhoneUnplugReceiver */
public final class EarPhoneUnplugReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        Object obj;
        Activity g = C11016e.m22312g();
        String str = null;
        if (intent != null) {
            obj = intent.getAction();
        } else {
            obj = null;
        }
        if (!C52711k.m112239a(obj, (Object) "android.media.AUDIO_BECOMING_NOISY")) {
            if (intent != null) {
                str = intent.getAction();
            }
            if (C52711k.m112239a((Object) str, (Object) "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                if ((g instanceof FragmentActivity) && intExtra == 0) {
                    C32964a.m75869a((FragmentActivity) g).f85654h.postValue("on_ear_phone_unplug");
                    C32458a.m75150b("EarPhoneUnplugReceiver", "Bluetooth headset");
                }
            }
        } else if (g instanceof FragmentActivity) {
            C32964a.m75869a((FragmentActivity) g).f85654h.postValue("on_ear_phone_unplug");
            C32458a.m75150b("EarPhoneUnplugReceiver", "Wired headset");
        }
    }
}
