package com.p683ss.android.ugc.aweme.keva;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.keva.KevaBuilder;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.keva.a */
public final class C35804a {

    /* renamed from: a */
    static String f91963a = UUID.randomUUID().toString();

    /* renamed from: a */
    public static void m80934a(Context context) {
        String str;
        SharedPreferences sharedPreferences = context.getSharedPreferences("keva_switch_repo", 0);
        C35807d.f91965a = sharedPreferences.getBoolean("keva_switch", true);
        C35807d.f91966b.addAll(Arrays.asList(C35807d.f91967c));
        C35807d.f91966b.addAll(sharedPreferences.getStringSet("keva_blacklist", Collections.emptySet()));
        C35807d.f91968d.addAll(Arrays.asList(C35807d.f91969e));
        if (!C35807d.f91965a) {
            C35807d.m80936a(context);
        }
        KevaBuilder instance = KevaBuilder.getInstance();
        instance.setContext(context);
        instance.setMonitor(new C35806c());
        if (KevaPerfExperiment.INSTANCE.mo74472a(context, 2) || KevaPerfExperiment.INSTANCE.mo74472a(context, 3)) {
            str = "aweme_ported_sp_repo_perf_ab";
        } else {
            str = "aweme_ported_sp_repo";
        }
        instance.setPortedRepoName(str);
        instance.setExecutor(C24076h.m58902c());
        C24076h.m58902c().execute(new C35805b(context));
    }
}
