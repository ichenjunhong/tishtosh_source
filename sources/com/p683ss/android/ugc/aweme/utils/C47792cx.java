package com.p683ss.android.ugc.aweme.utils;

import com.bytedance.keva.Keva;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.cx */
public final class C47792cx {

    /* renamed from: a */
    public static final C47792cx f120339a = new C47792cx();

    private C47792cx() {
    }

    /* renamed from: a */
    public static String m103422a() {
        try {
            Keva repo = Keva.getRepo("user_logout_log");
            C52711k.m112236a((Object) repo, "Keva.getRepo(\"user_logout_log\")");
            Map all = repo.getAll();
            if (all.isEmpty()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            C52711k.m112236a((Object) all, "repo");
            for (Entry entry : all.entrySet()) {
                if (!C52711k.m112239a((Object) (String) entry.getKey(), (Object) "last_time")) {
                    sb.append((String) entry.getKey());
                    sb.append(":");
                    sb.append(entry.getValue());
                    sb.append(" ");
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return "error";
        }
    }
}
