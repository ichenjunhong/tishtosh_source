package com.bytedance.android.live.base.p192sp;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.concurrent.Callable;
import p064c.p065a.C2201v;
import p064c.p065a.p093k.C2168a;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.live.base.sp.TTLiveSettingUtil */
public class TTLiveSettingUtil {
    public static C2180b<Boolean> update = C2180b.m6534l();

    public static void setLocalTest(boolean z) {
    }

    public static void updateSettings(Context context, C18085o oVar) {
        if (context != null && oVar != null) {
            SharedPreferences a = C35807d.m80935a(context, "ttlive_sdk_shared_pref_cache", 4);
            if (a != null) {
                C2201v.m6607a((Callable<? extends T>) new C3019b<Object>(a, oVar)).mo6529b(C2168a.m6521b()).mo6514a(C2168a.m6521b()).mo6545f(C3020c.f8896a);
            }
        }
    }
}
