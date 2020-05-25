package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzpn.zza;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class boo {

    /* renamed from: c */
    private static final bqq f43198c = new bop();

    /* renamed from: d */
    private static final Pattern f43199d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f43200a = -1;

    /* renamed from: b */
    public int f43201b = -1;

    /* renamed from: a */
    private final boolean m36335a(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = f43199d.matcher(str2);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f43200a = parseInt;
                    this.f43201b = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo30513a() {
        return (this.f43200a == -1 || this.f43201b == -1) ? false : true;
    }

    /* renamed from: a */
    public final boolean mo30514a(zzpn zzpn) {
        for (zza zza : zzpn.f46285a) {
            if (zza instanceof zzpr) {
                zzpr zzpr = (zzpr) zza;
                if (m36335a(zzpr.f46290a, zzpr.f46291b)) {
                    return true;
                }
            }
        }
        return false;
    }
}
