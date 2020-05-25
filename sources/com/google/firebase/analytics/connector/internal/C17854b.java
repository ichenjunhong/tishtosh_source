package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.util.C15511b;
import com.google.android.gms.measurement.AppMeasurement.C16978a;
import com.p683ss.android.ugc.aweme.pendant.C38588b;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.analytics.connector.internal.b */
public final class C17854b {

    /* renamed from: a */
    public static final List<String> f49618a = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", C38588b.f98134h});

    /* renamed from: b */
    public static final List<String> f49619b = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: c */
    public static final List<String> f49620c = Arrays.asList((String[]) C15511b.m32267a(C16978a.f48058a, C16978a.f48059b));

    /* renamed from: d */
    public static final List<String> f49621d = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    /* renamed from: e */
    private static final Set<String> f49622e = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));

    /* renamed from: f */
    private static final List<String> f49623f = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: a */
    public static boolean m43782a(String str) {
        return !f49623f.contains(str);
    }
}
