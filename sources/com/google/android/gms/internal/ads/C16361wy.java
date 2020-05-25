package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.wy */
public final class C16361wy {

    /* renamed from: A */
    zzaxk f45842A;

    /* renamed from: B */
    boolean f45843B;

    /* renamed from: C */
    String f45844C;

    /* renamed from: D */
    List<String> f45845D;

    /* renamed from: E */
    boolean f45846E;

    /* renamed from: F */
    String f45847F;

    /* renamed from: G */
    zzbbq f45848G;

    /* renamed from: H */
    boolean f45849H;

    /* renamed from: I */
    boolean f45850I;

    /* renamed from: J */
    boolean f45851J;

    /* renamed from: K */
    boolean f45852K;

    /* renamed from: L */
    String f45853L;

    /* renamed from: M */
    boolean f45854M;

    /* renamed from: N */
    final zzaxe f45855N;

    /* renamed from: O */
    private final long f45856O = -1;

    /* renamed from: a */
    String f45857a;

    /* renamed from: b */
    String f45858b;

    /* renamed from: c */
    String f45859c;

    /* renamed from: d */
    List<String> f45860d;

    /* renamed from: e */
    String f45861e;

    /* renamed from: f */
    String f45862f;

    /* renamed from: g */
    String f45863g;

    /* renamed from: h */
    List<String> f45864h;

    /* renamed from: i */
    List<String> f45865i;

    /* renamed from: j */
    long f45866j = -1;

    /* renamed from: k */
    boolean f45867k;

    /* renamed from: l */
    List<String> f45868l;

    /* renamed from: m */
    long f45869m = -1;

    /* renamed from: n */
    int f45870n = -1;

    /* renamed from: o */
    boolean f45871o;

    /* renamed from: p */
    boolean f45872p;

    /* renamed from: q */
    boolean f45873q;

    /* renamed from: r */
    boolean f45874r = true;

    /* renamed from: s */
    boolean f45875s = true;

    /* renamed from: t */
    String f45876t = "";

    /* renamed from: u */
    boolean f45877u;

    /* renamed from: v */
    boolean f45878v;

    /* renamed from: w */
    zzbaz f45879w;

    /* renamed from: x */
    List<String> f45880x;

    /* renamed from: y */
    List<String> f45881y;

    /* renamed from: z */
    boolean f45882z;

    /* renamed from: a */
    private static String m38983a(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* renamed from: b */
    private static long m38984b(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length());
                sb.append("Could not parse float from ");
                sb.append(str);
                sb.append(" header: ");
                sb.append(str2);
                abv.m32798e(sb.toString());
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static List<String> m38985c(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m38986d(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return false;
        }
        return Boolean.parseBoolean((String) list.get(0));
    }

    public C16361wy(zzaxe zzaxe, String str) {
        this.f45858b = str;
        this.f45855N = zzaxe;
    }

    /* renamed from: a */
    public final void mo31463a(Map<String, List<String>> map) {
        this.f45857a = m38983a(map, "X-Afma-Ad-Size");
        this.f45847F = m38983a(map, "X-Afma-Ad-Slot-Size");
        List<String> c = m38985c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f45860d = c;
        }
        this.f45861e = m38983a(map, "X-Afma-Debug-Signals");
        List list = (List) map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f45862f = (String) list.get(0);
        }
        List<String> c2 = m38985c(map, "X-Afma-Tracking-Urls");
        if (c2 != null) {
            this.f45864h = c2;
        }
        List<String> c3 = m38985c(map, "X-Afma-Downloaded-Impression-Urls");
        if (c3 != null) {
            this.f45865i = c3;
        }
        long b = m38984b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f45866j = b;
        }
        this.f45867k |= m38986d(map, "X-Afma-Mediation");
        List<String> c4 = m38985c(map, "X-Afma-Manual-Tracking-Urls");
        if (c4 != null) {
            this.f45868l = c4;
        }
        long b2 = m38984b(map, "X-Afma-Refresh-Rate");
        if (b2 != -1) {
            this.f45869m = b2;
        }
        List list2 = (List) map.get("X-Afma-Orientation");
        if (list2 != null && !list2.isEmpty()) {
            String str = (String) list2.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.f45870n = 7;
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.f45870n = 6;
            }
        }
        this.f45863g = m38983a(map, "X-Afma-ActiveView");
        List list3 = (List) map.get("X-Afma-Use-HTTPS");
        if (list3 != null && !list3.isEmpty()) {
            this.f45873q = Boolean.parseBoolean((String) list3.get(0));
        }
        this.f45871o |= m38986d(map, "X-Afma-Custom-Rendering-Allowed");
        this.f45872p = "native".equals(m38983a(map, "X-Afma-Ad-Format"));
        List list4 = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (list4 != null && !list4.isEmpty()) {
            this.f45874r = Boolean.parseBoolean((String) list4.get(0));
        }
        List list5 = (List) map.get("X-Afma-Content-Vertical-Opted-Out");
        if (list5 != null && !list5.isEmpty()) {
            this.f45875s = Boolean.parseBoolean((String) list5.get(0));
        }
        List list6 = (List) map.get("X-Afma-Gws-Query-Id");
        if (list6 != null && !list6.isEmpty()) {
            this.f45876t = (String) list6.get(0);
        }
        String a = m38983a(map, "X-Afma-Fluid");
        if (a != null && a.equals("height")) {
            this.f45877u = true;
        }
        this.f45878v = "native_express".equals(m38983a(map, "X-Afma-Ad-Format"));
        this.f45879w = zzbaz.m39275a(m38983a(map, "X-Afma-Rewards"));
        if (this.f45880x == null) {
            this.f45880x = m38985c(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.f45881y == null) {
            this.f45881y = m38985c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.f45882z |= m38986d(map, "X-Afma-Use-Displayed-Impression");
        this.f45843B |= m38986d(map, "X-Afma-Auto-Collect-Location");
        this.f45844C = m38983a(map, "Set-Cookie");
        String a2 = m38983a(map, "X-Afma-Auto-Protection-Configuration");
        if (a2 == null || TextUtils.isEmpty(a2)) {
            Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.f45862f)) {
                buildUpon.appendQueryParameter("debugDialog", this.f45862f);
            }
            String valueOf = String.valueOf(buildUpon);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append(valueOf);
            sb.append("&navigationURL={NAVIGATION_URL}");
            this.f45842A = new zzaxk(true, Collections.singletonList(sb.toString()));
        } else {
            try {
                this.f45842A = zzaxk.m39271a(new JSONObject(a2));
            } catch (JSONException e) {
                abv.m32795c("Error parsing configuration JSON", e);
                this.f45842A = new zzaxk();
            }
        }
        List<String> c5 = m38985c(map, "X-Afma-Remote-Ping-Urls");
        if (c5 != null) {
            this.f45845D = c5;
        }
        String a3 = m38983a(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(a3)) {
            try {
                this.f45848G = zzbbq.m39277a(new JSONObject(a3));
            } catch (JSONException e2) {
                abv.m32795c("Error parsing safe browsing header", e2);
            }
        }
        this.f45846E |= m38986d(map, "X-Afma-Render-In-Browser");
        String a4 = m38983a(map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(a4)) {
            try {
                this.f45849H = new JSONObject(a4).getBoolean("never_pool");
            } catch (JSONException e3) {
                abv.m32795c("Error parsing interstitial pool header", e3);
            }
        }
        this.f45850I = m38986d(map, "X-Afma-Custom-Close-Blocked");
        this.f45851J = m38986d(map, "X-Afma-Enable-Omid");
        this.f45852K = m38986d(map, "X-Afma-Disable-Closable-Area");
        this.f45853L = m38983a(map, "X-Afma-Omid-Settings");
        String a5 = m38983a(map, "X-Afma-Creative-Configuration");
        if (!TextUtils.isEmpty(a5)) {
            try {
                this.f45854M = new JSONObject(a5).getBoolean("scroll_aware");
            } catch (JSONException e4) {
                abv.m32795c("Error parsing creative configuration header", e4);
            }
        }
    }
}
