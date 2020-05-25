package com.google.android.gms.internal.ads;

import android.location.Location;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.wx */
public final class C16360wx {
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0875 A[Catch:{ JSONException -> 0x09b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0878 A[Catch:{ JSONException -> 0x09b2 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m38980a(android.content.Context r22, com.google.android.gms.internal.ads.C16352wp r23) {
        /*
            r1 = r23
            com.google.android.gms.internal.ads.zzaxe r2 = r1.f45818i
            android.location.Location r3 = r1.f45813d
            com.google.android.gms.internal.ads.xb r4 = r1.f45819j
            android.os.Bundle r5 = r1.f45810a
            org.json.JSONObject r6 = r1.f45820k
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ JSONException -> 0x09b2 }
            r8.<init>()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r9 = "extra_caps"
            com.google.android.gms.internal.ads.bl<java.lang.String> r10 = com.google.android.gms.internal.ads.C15740bx.f44274bH     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.bu r11 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Object r10 = r11.mo30717a(r10)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x09b2 }
            java.util.List<java.lang.String> r9 = r1.f45812c     // Catch:{ JSONException -> 0x09b2 }
            int r9 = r9.size()     // Catch:{ JSONException -> 0x09b2 }
            if (r9 <= 0) goto L_0x0035
            java.lang.String r9 = "eid"
            java.lang.String r10 = ","
            java.util.List<java.lang.String> r11 = r1.f45812c     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = android.text.TextUtils.join(r10, r11)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0035:
            android.os.Bundle r9 = r2.f46131b     // Catch:{ JSONException -> 0x09b2 }
            if (r9 == 0) goto L_0x0040
            java.lang.String r9 = "ad_pos"
            android.os.Bundle r10 = r2.f46131b     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0040:
            com.google.android.gms.internal.ads.zzyv r9 = r2.f46132c     // Catch:{ JSONException -> 0x09b2 }
            java.text.SimpleDateFormat r10 = new java.text.SimpleDateFormat     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r11 = "yyyyMMdd"
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ JSONException -> 0x09b2 }
            r10.<init>(r11, r12)     // Catch:{ JSONException -> 0x09b2 }
            long r11 = r9.f46318b     // Catch:{ JSONException -> 0x09b2 }
            r13 = -1
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x0063
            java.lang.String r11 = "cust_age"
            java.util.Date r12 = new java.util.Date     // Catch:{ JSONException -> 0x09b2 }
            long r13 = r9.f46318b     // Catch:{ JSONException -> 0x09b2 }
            r12.<init>(r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = r10.format(r12)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0063:
            android.os.Bundle r10 = r9.f46319c     // Catch:{ JSONException -> 0x09b2 }
            if (r10 == 0) goto L_0x006e
            java.lang.String r10 = "extras"
            android.os.Bundle r11 = r9.f46319c     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r10, r11)     // Catch:{ JSONException -> 0x09b2 }
        L_0x006e:
            int r10 = r9.f46320d     // Catch:{ JSONException -> 0x09b2 }
            r11 = -1
            if (r10 == r11) goto L_0x007e
            java.lang.String r10 = "cust_gender"
            int r12 = r9.f46320d     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x09b2 }
        L_0x007e:
            java.util.List<java.lang.String> r10 = r9.f46321e     // Catch:{ JSONException -> 0x09b2 }
            if (r10 == 0) goto L_0x0089
            java.lang.String r10 = "kw"
            java.util.List<java.lang.String> r12 = r9.f46321e     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0089:
            int r10 = r9.f46323g     // Catch:{ JSONException -> 0x09b2 }
            if (r10 == r11) goto L_0x0098
            java.lang.String r10 = "tag_for_child_directed_treatment"
            int r12 = r9.f46323g     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0098:
            boolean r10 = r9.f46322f     // Catch:{ JSONException -> 0x09b2 }
            r12 = 1
            if (r10 == 0) goto L_0x00a6
            java.lang.String r10 = "test_request"
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r12)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r10, r13)     // Catch:{ JSONException -> 0x09b2 }
        L_0x00a6:
            int r10 = r9.f46317a     // Catch:{ JSONException -> 0x09b2 }
            r13 = 2
            if (r10 < r13) goto L_0x00c7
            boolean r10 = r9.f46324h     // Catch:{ JSONException -> 0x09b2 }
            if (r10 == 0) goto L_0x00b8
            java.lang.String r10 = "d_imp_hdr"
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r10, r14)     // Catch:{ JSONException -> 0x09b2 }
        L_0x00b8:
            java.lang.String r10 = r9.f46325i     // Catch:{ JSONException -> 0x09b2 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ JSONException -> 0x09b2 }
            if (r10 != 0) goto L_0x00c7
            java.lang.String r10 = "ppid"
            java.lang.String r14 = r9.f46325i     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r10, r14)     // Catch:{ JSONException -> 0x09b2 }
        L_0x00c7:
            int r10 = r9.f46317a     // Catch:{ JSONException -> 0x09b2 }
            r14 = 3
            if (r10 < r14) goto L_0x00d7
            java.lang.String r10 = r9.f46328l     // Catch:{ JSONException -> 0x09b2 }
            if (r10 == 0) goto L_0x00d7
            java.lang.String r10 = "url"
            java.lang.String r15 = r9.f46328l     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r10, r15)     // Catch:{ JSONException -> 0x09b2 }
        L_0x00d7:
            int r10 = r9.f46317a     // Catch:{ JSONException -> 0x09b2 }
            r15 = 5
            if (r10 < r15) goto L_0x00fd
            android.os.Bundle r10 = r9.f46330n     // Catch:{ JSONException -> 0x09b2 }
            if (r10 == 0) goto L_0x00e7
            java.lang.String r10 = "custom_targeting"
            android.os.Bundle r7 = r9.f46330n     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r10, r7)     // Catch:{ JSONException -> 0x09b2 }
        L_0x00e7:
            java.util.List<java.lang.String> r7 = r9.f46331o     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == 0) goto L_0x00f2
            java.lang.String r7 = "category_exclusions"
            java.util.List<java.lang.String> r10 = r9.f46331o     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x00f2:
            java.lang.String r7 = r9.f46332p     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == 0) goto L_0x00fd
            java.lang.String r7 = "request_agent"
            java.lang.String r10 = r9.f46332p     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x00fd:
            int r7 = r9.f46317a     // Catch:{ JSONException -> 0x09b2 }
            r10 = 6
            if (r7 < r10) goto L_0x010d
            java.lang.String r7 = r9.f46333q     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == 0) goto L_0x010d
            java.lang.String r7 = "request_pkg"
            java.lang.String r10 = r9.f46333q     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x010d:
            int r7 = r9.f46317a     // Catch:{ JSONException -> 0x09b2 }
            r10 = 7
            if (r7 < r10) goto L_0x011d
            java.lang.String r7 = "is_designed_for_families"
            boolean r10 = r9.f46334r     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x011d:
            int r7 = r9.f46317a     // Catch:{ JSONException -> 0x09b2 }
            r10 = 8
            if (r7 < r10) goto L_0x013d
            int r7 = r9.f46336t     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == r11) goto L_0x0132
            java.lang.String r7 = "tag_for_under_age_of_consent"
            int r10 = r9.f46336t     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0132:
            java.lang.String r7 = r9.f46337u     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == 0) goto L_0x013d
            java.lang.String r7 = "max_ad_content_rating"
            java.lang.String r9 = r9.f46337u     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r9)     // Catch:{ JSONException -> 0x09b2 }
        L_0x013d:
            com.google.android.gms.internal.ads.zzyz r7 = r2.f46133d     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.zzyz[] r7 = r7.f46344g     // Catch:{ JSONException -> 0x09b2 }
            if (r7 != 0) goto L_0x015a
            java.lang.String r7 = "format"
            com.google.android.gms.internal.ads.zzyz r10 = r2.f46133d     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = r10.f46338a     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.zzyz r7 = r2.f46133d     // Catch:{ JSONException -> 0x09b2 }
            boolean r7 = r7.f46346i     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == 0) goto L_0x0190
            java.lang.String r7 = "fluid"
            java.lang.String r10 = "height"
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x0190
        L_0x015a:
            com.google.android.gms.internal.ads.zzyz r7 = r2.f46133d     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.zzyz[] r7 = r7.f46344g     // Catch:{ JSONException -> 0x09b2 }
            int r10 = r7.length     // Catch:{ JSONException -> 0x09b2 }
            r15 = 0
            r17 = 0
            r18 = 0
        L_0x0164:
            if (r15 >= r10) goto L_0x0190
            r13 = r7[r15]     // Catch:{ JSONException -> 0x09b2 }
            boolean r12 = r13.f46346i     // Catch:{ JSONException -> 0x09b2 }
            if (r12 != 0) goto L_0x0177
            if (r17 != 0) goto L_0x0177
            java.lang.String r12 = "format"
            java.lang.String r14 = r13.f46338a     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r12, r14)     // Catch:{ JSONException -> 0x09b2 }
            r17 = 1
        L_0x0177:
            boolean r12 = r13.f46346i     // Catch:{ JSONException -> 0x09b2 }
            if (r12 == 0) goto L_0x0186
            if (r18 != 0) goto L_0x0186
            java.lang.String r12 = "fluid"
            java.lang.String r13 = "height"
            r8.put(r12, r13)     // Catch:{ JSONException -> 0x09b2 }
            r18 = 1
        L_0x0186:
            if (r17 == 0) goto L_0x018a
            if (r18 != 0) goto L_0x0190
        L_0x018a:
            int r15 = r15 + 1
            r12 = 1
            r13 = 2
            r14 = 3
            goto L_0x0164
        L_0x0190:
            com.google.android.gms.internal.ads.zzyz r7 = r2.f46133d     // Catch:{ JSONException -> 0x09b2 }
            int r7 = r7.f46342e     // Catch:{ JSONException -> 0x09b2 }
            if (r7 != r11) goto L_0x019d
            java.lang.String r7 = "smart_w"
            java.lang.String r10 = "full"
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x019d:
            com.google.android.gms.internal.ads.zzyz r7 = r2.f46133d     // Catch:{ JSONException -> 0x09b2 }
            int r7 = r7.f46339b     // Catch:{ JSONException -> 0x09b2 }
            r10 = -2
            if (r7 != r10) goto L_0x01ab
            java.lang.String r7 = "smart_h"
            java.lang.String r12 = "auto"
            r8.put(r7, r12)     // Catch:{ JSONException -> 0x09b2 }
        L_0x01ab:
            com.google.android.gms.internal.ads.zzyz r7 = r2.f46133d     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.zzyz[] r7 = r7.f46344g     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == 0) goto L_0x0219
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x09b2 }
            r7.<init>()     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.zzyz r12 = r2.f46133d     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.zzyz[] r12 = r12.f46344g     // Catch:{ JSONException -> 0x09b2 }
            int r13 = r12.length     // Catch:{ JSONException -> 0x09b2 }
            r14 = 0
            r15 = 0
        L_0x01bd:
            if (r14 >= r13) goto L_0x01ff
            r9 = r12[r14]     // Catch:{ JSONException -> 0x09b2 }
            boolean r10 = r9.f46346i     // Catch:{ JSONException -> 0x09b2 }
            if (r10 == 0) goto L_0x01c7
            r15 = 1
            goto L_0x01fa
        L_0x01c7:
            int r10 = r7.length()     // Catch:{ JSONException -> 0x09b2 }
            if (r10 == 0) goto L_0x01d2
            java.lang.String r10 = "|"
            r7.append(r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x01d2:
            int r10 = r9.f46342e     // Catch:{ JSONException -> 0x09b2 }
            if (r10 != r11) goto L_0x01de
            int r10 = r9.f46343f     // Catch:{ JSONException -> 0x09b2 }
            float r10 = (float) r10     // Catch:{ JSONException -> 0x09b2 }
            float r11 = r4.f45918t     // Catch:{ JSONException -> 0x09b2 }
            float r10 = r10 / r11
            int r10 = (int) r10     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x01e0
        L_0x01de:
            int r10 = r9.f46342e     // Catch:{ JSONException -> 0x09b2 }
        L_0x01e0:
            r7.append(r10)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = "x"
            r7.append(r10)     // Catch:{ JSONException -> 0x09b2 }
            int r10 = r9.f46339b     // Catch:{ JSONException -> 0x09b2 }
            r11 = -2
            if (r10 != r11) goto L_0x01f5
            int r9 = r9.f46340c     // Catch:{ JSONException -> 0x09b2 }
            float r9 = (float) r9     // Catch:{ JSONException -> 0x09b2 }
            float r10 = r4.f45918t     // Catch:{ JSONException -> 0x09b2 }
            float r9 = r9 / r10
            int r9 = (int) r9     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x01f7
        L_0x01f5:
            int r9 = r9.f46339b     // Catch:{ JSONException -> 0x09b2 }
        L_0x01f7:
            r7.append(r9)     // Catch:{ JSONException -> 0x09b2 }
        L_0x01fa:
            int r14 = r14 + 1
            r10 = -2
            r11 = -1
            goto L_0x01bd
        L_0x01ff:
            if (r15 == 0) goto L_0x0214
            int r9 = r7.length()     // Catch:{ JSONException -> 0x09b2 }
            if (r9 == 0) goto L_0x020e
            java.lang.String r9 = "|"
            r10 = 0
            r7.insert(r10, r9)     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x020f
        L_0x020e:
            r10 = 0
        L_0x020f:
            java.lang.String r9 = "320x50"
            r7.insert(r10, r9)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0214:
            java.lang.String r9 = "sz"
            r8.put(r9, r7)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0219:
            int r7 = r2.f46142m     // Catch:{ JSONException -> 0x09b2 }
            r9 = 24
            if (r7 == 0) goto L_0x02d8
            java.lang.String r7 = "native_version"
            int r10 = r2.f46142m     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r7 = "native_templates"
            java.util.List<java.lang.String> r10 = r2.f46143n     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.zzafl r7 = r2.f46154y     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == 0) goto L_0x028a
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r7 = com.google.android.gms.internal.ads.C15740bx.f44282bP     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.bu r10 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Object r7 = r10.mo30717a(r7)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ JSONException -> 0x09b2 }
            boolean r7 = r7.booleanValue()     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == 0) goto L_0x026b
            com.google.android.gms.internal.ads.zzafl r7 = r2.f46154y     // Catch:{ JSONException -> 0x09b2 }
            int r7 = r7.f46065a     // Catch:{ JSONException -> 0x09b2 }
            r10 = 3
            if (r7 <= r10) goto L_0x026b
            java.lang.String r7 = "enable_native_media_orientation"
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.zzafl r7 = r2.f46154y     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r7 = r7.mo31570a()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = "unknown"
            boolean r10 = r10.equals(r7)     // Catch:{ JSONException -> 0x09b2 }
            if (r10 != 0) goto L_0x026b
            java.lang.String r10 = "native_media_orientation"
            r8.put(r10, r7)     // Catch:{ JSONException -> 0x09b2 }
        L_0x026b:
            com.google.android.gms.internal.ads.zzafl r7 = r2.f46154y     // Catch:{ JSONException -> 0x09b2 }
            int r7 = r7.f46067c     // Catch:{ JSONException -> 0x09b2 }
            switch(r7) {
                case 0: goto L_0x027b;
                case 1: goto L_0x0278;
                case 2: goto L_0x0275;
                default: goto L_0x0272;
            }     // Catch:{ JSONException -> 0x09b2 }
        L_0x0272:
            java.lang.String r7 = "unknown"
            goto L_0x027d
        L_0x0275:
            java.lang.String r7 = "landscape"
            goto L_0x027d
        L_0x0278:
            java.lang.String r7 = "portrait"
            goto L_0x027d
        L_0x027b:
            java.lang.String r7 = "any"
        L_0x027d:
            java.lang.String r10 = "unknown"
            boolean r10 = r10.equals(r7)     // Catch:{ JSONException -> 0x09b2 }
            if (r10 != 0) goto L_0x028a
            java.lang.String r10 = "native_image_orientation"
            r8.put(r10, r7)     // Catch:{ JSONException -> 0x09b2 }
        L_0x028a:
            java.lang.String r7 = "native_multiple_images"
            com.google.android.gms.internal.ads.zzafl r10 = r2.f46154y     // Catch:{ JSONException -> 0x09b2 }
            if (r10 == 0) goto L_0x0296
            boolean r10 = r10.f46068d     // Catch:{ JSONException -> 0x09b2 }
            if (r10 == 0) goto L_0x0296
            r10 = 1
            goto L_0x0297
        L_0x0296:
            r10 = 0
        L_0x0297:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
            java.util.List<java.lang.String> r7 = r2.f46155z     // Catch:{ JSONException -> 0x09b2 }
            boolean r7 = r7.isEmpty()     // Catch:{ JSONException -> 0x09b2 }
            if (r7 != 0) goto L_0x02ad
            java.lang.String r7 = "native_custom_templates"
            java.util.List<java.lang.String> r10 = r2.f46155z     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x02ad:
            int r7 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            if (r7 < r9) goto L_0x02bc
            java.lang.String r7 = "max_num_ads"
            int r10 = r2.f46121Y     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x02bc:
            java.lang.String r7 = r2.f46119W     // Catch:{ JSONException -> 0x09b2 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x09b2 }
            if (r7 != 0) goto L_0x02d8
            java.lang.String r7 = "native_advanced_settings"
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x02d1 }
            java.lang.String r11 = r2.f46119W     // Catch:{ JSONException -> 0x02d1 }
            r10.<init>(r11)     // Catch:{ JSONException -> 0x02d1 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x02d1 }
            goto L_0x02d8
        L_0x02d1:
            r0 = move-exception
            r7 = r0
            java.lang.String r10 = "Problem creating json from native advanced settings"
            com.google.android.gms.internal.ads.abv.m32795c(r10, r7)     // Catch:{ JSONException -> 0x09b2 }
        L_0x02d8:
            java.util.List<java.lang.Integer> r7 = r2.f46118V     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == 0) goto L_0x0319
            java.util.List<java.lang.Integer> r7 = r2.f46118V     // Catch:{ JSONException -> 0x09b2 }
            int r7 = r7.size()     // Catch:{ JSONException -> 0x09b2 }
            if (r7 <= 0) goto L_0x0319
            java.util.List<java.lang.Integer> r7 = r2.f46118V     // Catch:{ JSONException -> 0x09b2 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ JSONException -> 0x09b2 }
        L_0x02ea:
            boolean r10 = r7.hasNext()     // Catch:{ JSONException -> 0x09b2 }
            if (r10 == 0) goto L_0x0319
            java.lang.Object r10 = r7.next()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ JSONException -> 0x09b2 }
            int r11 = r10.intValue()     // Catch:{ JSONException -> 0x09b2 }
            r12 = 2
            if (r11 != r12) goto L_0x0308
            java.lang.String r10 = "iba"
            r11 = 1
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x02ea
        L_0x0308:
            int r10 = r10.intValue()     // Catch:{ JSONException -> 0x09b2 }
            r11 = 1
            if (r10 != r11) goto L_0x02ea
            java.lang.String r10 = "ina"
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x02ea
        L_0x0319:
            com.google.android.gms.internal.ads.zzyz r7 = r2.f46133d     // Catch:{ JSONException -> 0x09b2 }
            boolean r7 = r7.f46347j     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == 0) goto L_0x0329
            java.lang.String r7 = "ene"
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0329:
            com.google.android.gms.internal.ads.zzabp r7 = r2.f46111O     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == 0) goto L_0x0344
            java.lang.String r7 = "is_icon_ad"
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r7 = "icon_ad_expansion_behavior"
            com.google.android.gms.internal.ads.zzabp r10 = r2.f46111O     // Catch:{ JSONException -> 0x09b2 }
            int r10 = r10.f46060a     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0344:
            com.google.android.gms.internal.ads.zzaks r7 = r2.f46128ae     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == 0) goto L_0x0384
            java.lang.String r7 = "ia_var"
            com.google.android.gms.internal.ads.zzaks r10 = r2.f46128ae     // Catch:{ JSONException -> 0x09b2 }
            int r11 = r10.f46090a     // Catch:{ JSONException -> 0x09b2 }
            switch(r11) {
                case 1: goto L_0x0357;
                case 2: goto L_0x0354;
                default: goto L_0x0351;
            }     // Catch:{ JSONException -> 0x09b2 }
        L_0x0351:
            int r10 = r10.f46090a     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x035a
        L_0x0354:
            java.lang.String r10 = "p"
            goto L_0x0377
        L_0x0357:
            java.lang.String r10 = "l"
            goto L_0x0377
        L_0x035a:
            r11 = 52
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x09b2 }
            r12.<init>(r11)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r11 = "Instream ad video aspect ratio "
            r12.append(r11)     // Catch:{ JSONException -> 0x09b2 }
            r12.append(r10)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = " is wrong."
            r12.append(r10)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = r12.toString()     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.afc.m32794c(r10)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = "l"
        L_0x0377:
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r7 = "instr"
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0384:
            java.lang.String r7 = "slotname"
            java.lang.String r10 = r2.f46134e     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r7 = "pn"
            android.content.pm.ApplicationInfo r10 = r2.f46135f     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = r10.packageName     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
            android.content.pm.PackageInfo r7 = r2.f46136g     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == 0) goto L_0x03a5
            java.lang.String r7 = "vc"
            android.content.pm.PackageInfo r10 = r2.f46136g     // Catch:{ JSONException -> 0x09b2 }
            int r10 = r10.versionCode     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x03a5:
            java.lang.String r7 = "ms"
            java.lang.String r10 = r1.f45816g     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r7 = "seq_num"
            java.lang.String r10 = r2.f46138i     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r7 = "session_id"
            java.lang.String r10 = r2.f46139j     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r7 = "js"
            com.google.android.gms.internal.ads.zzbgz r10 = r2.f46140k     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = r10.f46237a     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09b2 }
            android.os.Bundle r7 = r2.f46109M     // Catch:{ JSONException -> 0x09b2 }
            android.os.Bundle r10 = r1.f45811b     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r11 = "am"
            int r12 = r4.f45899a     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r11 = "cog"
            boolean r12 = r4.f45900b     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r12 = m38977a(r12)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r11 = "coh"
            boolean r12 = r4.f45901c     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r12 = m38977a(r12)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r11 = r4.f45902d     // Catch:{ JSONException -> 0x09b2 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ JSONException -> 0x09b2 }
            if (r11 != 0) goto L_0x03f7
            java.lang.String r11 = "carrier"
            java.lang.String r12 = r4.f45902d     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x09b2 }
        L_0x03f7:
            java.lang.String r11 = "gl"
            java.lang.String r12 = r4.f45903e     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x09b2 }
            boolean r11 = r4.f45904f     // Catch:{ JSONException -> 0x09b2 }
            if (r11 == 0) goto L_0x040c
            java.lang.String r11 = "simulator"
            r12 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09b2 }
        L_0x040c:
            java.lang.String r11 = "is_latchsky"
            boolean r12 = r4.f45905g     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x09b2 }
            boolean r11 = r4.f45906h     // Catch:{ JSONException -> 0x09b2 }
            if (r11 == 0) goto L_0x0426
            java.lang.String r11 = "is_sidewinder"
            r12 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x0427
        L_0x0426:
            r12 = 1
        L_0x0427:
            java.lang.String r11 = "ma"
            boolean r13 = r4.f45907i     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r13 = m38977a(r13)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r11 = "sp"
            boolean r13 = r4.f45908j     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r13 = m38977a(r13)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r11 = "hl"
            java.lang.String r13 = r4.f45909k     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r11 = r4.f45910l     // Catch:{ JSONException -> 0x09b2 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ JSONException -> 0x09b2 }
            if (r11 != 0) goto L_0x0453
            java.lang.String r11 = "mv"
            java.lang.String r13 = r4.f45910l     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0453:
            java.lang.String r11 = "muv"
            int r13 = r4.f45912n     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09b2 }
            int r11 = r4.f45913o     // Catch:{ JSONException -> 0x09b2 }
            r13 = -2
            if (r11 == r13) goto L_0x046e
            java.lang.String r11 = "cnt"
            int r13 = r4.f45913o     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09b2 }
        L_0x046e:
            java.lang.String r11 = "gnt"
            int r13 = r4.f45914p     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r11 = "pt"
            int r13 = r4.f45915q     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r11 = "rm"
            int r13 = r4.f45916r     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r11 = "riv"
            int r13 = r4.f45917s     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09b2 }
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ JSONException -> 0x09b2 }
            r11.<init>()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r13 = "build_build"
            java.lang.String r14 = r4.f45896A     // Catch:{ JSONException -> 0x09b2 }
            r11.putString(r13, r14)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r13 = "build_device"
            java.lang.String r14 = r4.f45897B     // Catch:{ JSONException -> 0x09b2 }
            r11.putString(r13, r14)     // Catch:{ JSONException -> 0x09b2 }
            android.os.Bundle r13 = new android.os.Bundle     // Catch:{ JSONException -> 0x09b2 }
            r13.<init>()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r14 = "is_charging"
            boolean r15 = r4.f45922x     // Catch:{ JSONException -> 0x09b2 }
            r13.putBoolean(r14, r15)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r14 = "battery_level"
            r19 = r10
            double r9 = r4.f45921w     // Catch:{ JSONException -> 0x09b2 }
            r13.putDouble(r14, r9)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r9 = "battery"
            r11.putBundle(r9, r13)     // Catch:{ JSONException -> 0x09b2 }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ JSONException -> 0x09b2 }
            r9.<init>()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = "active_network_state"
            int r13 = r4.f45924z     // Catch:{ JSONException -> 0x09b2 }
            r9.putInt(r10, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = "active_network_metered"
            boolean r13 = r4.f45923y     // Catch:{ JSONException -> 0x09b2 }
            r9.putBoolean(r10, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = "network"
            r11.putBundle(r10, r9)     // Catch:{ JSONException -> 0x09b2 }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ JSONException -> 0x09b2 }
            r9.<init>()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = "is_browser_custom_tabs_capable"
            boolean r13 = r4.f45898C     // Catch:{ JSONException -> 0x09b2 }
            r9.putBoolean(r10, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = "browser"
            r11.putBundle(r10, r9)     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == 0) goto L_0x05ad
            java.lang.String r9 = "android_mem_info"
            android.os.Bundle r10 = new android.os.Bundle     // Catch:{ JSONException -> 0x09b2 }
            r10.<init>()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r13 = "runtime_free"
            java.lang.String r14 = "runtime_free_memory"
            r21 = r13
            r12 = -1
            long r14 = r7.getLong(r14, r12)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r14 = java.lang.Long.toString(r14)     // Catch:{ JSONException -> 0x09b2 }
            r15 = r21
            r10.putString(r15, r14)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r14 = "runtime_max"
            java.lang.String r15 = "runtime_max_memory"
            long r15 = r7.getLong(r15, r12)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r15 = java.lang.Long.toString(r15)     // Catch:{ JSONException -> 0x09b2 }
            r10.putString(r14, r15)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r14 = "runtime_total"
            java.lang.String r15 = "runtime_total_memory"
            long r12 = r7.getLong(r15, r12)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r12 = java.lang.Long.toString(r12)     // Catch:{ JSONException -> 0x09b2 }
            r10.putString(r14, r12)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r12 = "web_view_count"
            java.lang.String r13 = "web_view_count"
            r14 = 0
            int r13 = r7.getInt(r13, r14)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09b2 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r12 = "debug_memory_info"
            android.os.Parcelable r7 = r7.getParcelable(r12)     // Catch:{ JSONException -> 0x09b2 }
            android.os.Debug$MemoryInfo r7 = (android.os.Debug.MemoryInfo) r7     // Catch:{ JSONException -> 0x09b2 }
            if (r7 == 0) goto L_0x05a9
            java.lang.String r12 = "debug_info_dalvik_private_dirty"
            int r13 = r7.dalvikPrivateDirty     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09b2 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r12 = "debug_info_dalvik_pss"
            int r13 = r7.dalvikPss     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09b2 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r12 = "debug_info_dalvik_shared_dirty"
            int r13 = r7.dalvikSharedDirty     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09b2 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r12 = "debug_info_native_private_dirty"
            int r13 = r7.nativePrivateDirty     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09b2 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r12 = "debug_info_native_pss"
            int r13 = r7.nativePss     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09b2 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r12 = "debug_info_native_shared_dirty"
            int r13 = r7.nativeSharedDirty     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09b2 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r12 = "debug_info_other_private_dirty"
            int r13 = r7.otherPrivateDirty     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09b2 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r12 = "debug_info_other_pss"
            int r13 = r7.otherPss     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09b2 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r12 = "debug_info_other_shared_dirty"
            int r7 = r7.otherSharedDirty     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ JSONException -> 0x09b2 }
            r10.putString(r12, r7)     // Catch:{ JSONException -> 0x09b2 }
        L_0x05a9:
            r11.putBundle(r9, r10)     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x05ae
        L_0x05ad:
            r14 = 0
        L_0x05ae:
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x09b2 }
            r7.<init>()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r9 = "parental_controls"
            r10 = r19
            r7.putBundle(r9, r10)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r9 = r4.f45911m     // Catch:{ JSONException -> 0x09b2 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x09b2 }
            if (r9 != 0) goto L_0x05c9
            java.lang.String r9 = "package_version"
            java.lang.String r10 = r4.f45911m     // Catch:{ JSONException -> 0x09b2 }
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x05c9:
            java.lang.String r9 = "play_store"
            r11.putBundle(r9, r7)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r7 = "device"
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x09b2 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x09b2 }
            r7.<init>()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r9 = "doritos"
            java.lang.String r10 = r1.f45814e     // Catch:{ JSONException -> 0x09b2 }
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r9 = "doritos_v2"
            java.lang.String r10 = r1.f45815f     // Catch:{ JSONException -> 0x09b2 }
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r9 = com.google.android.gms.internal.ads.C15740bx.f44218aE     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.bu r10 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Object r9 = r10.mo30717a(r9)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ JSONException -> 0x09b2 }
            boolean r9 = r9.booleanValue()     // Catch:{ JSONException -> 0x09b2 }
            if (r9 == 0) goto L_0x0639
            com.google.android.gms.ads.b.a$a r9 = r1.f45817h     // Catch:{ JSONException -> 0x09b2 }
            if (r9 == 0) goto L_0x0605
            com.google.android.gms.ads.b.a$a r9 = r1.f45817h     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r9 = r9.f38442a     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.ads.b.a$a r10 = r1.f45817h     // Catch:{ JSONException -> 0x09b2 }
            boolean r10 = r10.f38443b     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x0607
        L_0x0605:
            r9 = 0
            r10 = 0
        L_0x0607:
            boolean r11 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x09b2 }
            if (r11 != 0) goto L_0x061f
            java.lang.String r11 = "rdid"
            r7.putString(r11, r9)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r9 = "is_lat"
            r7.putBoolean(r9, r10)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r9 = "idtype"
            java.lang.String r10 = "adid"
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x0639
        L_0x061f:
            android.content.ContentResolver r9 = r22.getContentResolver()     // Catch:{ JSONException -> 0x09b2 }
            if (r9 != 0) goto L_0x0627
            r9 = 0
            goto L_0x062d
        L_0x0627:
            java.lang.String r10 = "android_id"
            java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x062d:
            java.lang.String r10 = "pdid"
            r7.putString(r10, r9)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r9 = "pdidtype"
            java.lang.String r10 = "ssaid"
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0639:
            java.lang.String r9 = "pii"
            r8.put(r9, r7)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r7 = "platform"
            java.lang.String r9 = android.os.Build.MANUFACTURER     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r9)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r7 = "submodel"
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r7, r9)     // Catch:{ JSONException -> 0x09b2 }
            if (r3 == 0) goto L_0x0652
            m38982a(r8, r3)     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x0666
        L_0x0652:
            com.google.android.gms.internal.ads.zzyv r3 = r2.f46132c     // Catch:{ JSONException -> 0x09b2 }
            int r3 = r3.f46317a     // Catch:{ JSONException -> 0x09b2 }
            r7 = 2
            if (r3 < r7) goto L_0x0666
            com.google.android.gms.internal.ads.zzyv r3 = r2.f46132c     // Catch:{ JSONException -> 0x09b2 }
            android.location.Location r3 = r3.f46327k     // Catch:{ JSONException -> 0x09b2 }
            if (r3 == 0) goto L_0x0666
            com.google.android.gms.internal.ads.zzyv r3 = r2.f46132c     // Catch:{ JSONException -> 0x09b2 }
            android.location.Location r3 = r3.f46327k     // Catch:{ JSONException -> 0x09b2 }
            m38982a(r8, r3)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0666:
            int r3 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            r7 = 2
            if (r3 < r7) goto L_0x0672
            java.lang.String r3 = "quality_signals"
            android.os.Bundle r7 = r2.f46141l     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r7)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0672:
            int r3 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            r7 = 4
            if (r3 < r7) goto L_0x0686
            boolean r3 = r2.f46145p     // Catch:{ JSONException -> 0x09b2 }
            if (r3 == 0) goto L_0x0686
            java.lang.String r3 = "forceHttps"
            boolean r7 = r2.f46145p     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r7)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0686:
            if (r5 == 0) goto L_0x068d
            java.lang.String r3 = "content_info"
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09b2 }
        L_0x068d:
            int r3 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            r5 = 5
            if (r3 < r5) goto L_0x06b4
            java.lang.String r3 = "u_sd"
            float r4 = r2.f46148s     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r3 = "sh"
            int r4 = r2.f46147r     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r3 = "sw"
            int r4 = r2.f46146q     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x06d5
        L_0x06b4:
            java.lang.String r3 = "u_sd"
            float r5 = r4.f45918t     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r3 = "sh"
            int r5 = r4.f45920v     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r3 = "sw"
            int r4 = r4.f45919u     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09b2 }
        L_0x06d5:
            int r3 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            r4 = 6
            if (r3 < r4) goto L_0x0701
            java.lang.String r3 = r2.f46149t     // Catch:{ JSONException -> 0x09b2 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x09b2 }
            if (r3 != 0) goto L_0x06f6
            java.lang.String r3 = "view_hierarchy"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x06ef }
            java.lang.String r5 = r2.f46149t     // Catch:{ JSONException -> 0x06ef }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x06ef }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x06ef }
            goto L_0x06f6
        L_0x06ef:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = "Problem serializing view hierarchy to JSON"
            com.google.android.gms.internal.ads.abv.m32795c(r4, r3)     // Catch:{ JSONException -> 0x09b2 }
        L_0x06f6:
            java.lang.String r3 = "correlation_id"
            long r4 = r2.f46150u     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0701:
            int r3 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            r4 = 7
            if (r3 < r4) goto L_0x070d
            java.lang.String r3 = "request_id"
            java.lang.String r4 = r2.f46151v     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09b2 }
        L_0x070d:
            int r3 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            r4 = 12
            if (r3 < r4) goto L_0x0722
            java.lang.String r3 = r2.f46098B     // Catch:{ JSONException -> 0x09b2 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x09b2 }
            if (r3 != 0) goto L_0x0722
            java.lang.String r3 = "anchor"
            java.lang.String r4 = r2.f46098B     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0722:
            int r3 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            r4 = 13
            if (r3 < r4) goto L_0x0733
            java.lang.String r3 = "android_app_volume"
            float r4 = r2.f46099C     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0733:
            int r3 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            r4 = 18
            if (r3 < r4) goto L_0x0744
            java.lang.String r3 = "android_app_muted"
            boolean r5 = r2.f46105I     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0744:
            int r3 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            r5 = 14
            if (r3 < r5) goto L_0x0759
            int r3 = r2.f46100D     // Catch:{ JSONException -> 0x09b2 }
            if (r3 <= 0) goto L_0x0759
            java.lang.String r3 = "target_api"
            int r5 = r2.f46100D     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0759:
            int r3 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            r5 = 15
            if (r3 < r5) goto L_0x0771
            java.lang.String r3 = "scroll_index"
            int r5 = r2.f46101E     // Catch:{ JSONException -> 0x09b2 }
            r7 = -1
            if (r5 != r7) goto L_0x0767
            goto L_0x076a
        L_0x0767:
            int r11 = r2.f46101E     // Catch:{ JSONException -> 0x09b2 }
            r7 = r11
        L_0x076a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0771:
            int r3 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            r5 = 16
            if (r3 < r5) goto L_0x0782
            java.lang.String r3 = "_activity_context"
            boolean r5 = r2.f46102F     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0782:
            int r3 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            if (r3 < r4) goto L_0x07ad
            java.lang.String r3 = r2.f46106J     // Catch:{ JSONException -> 0x09b2 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x09b2 }
            if (r3 != 0) goto L_0x07a2
            java.lang.String r3 = "app_settings"
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x079b }
            java.lang.String r7 = r2.f46106J     // Catch:{ JSONException -> 0x079b }
            r5.<init>(r7)     // Catch:{ JSONException -> 0x079b }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x079b }
            goto L_0x07a2
        L_0x079b:
            r0 = move-exception
            r3 = r0
            java.lang.String r5 = "Problem creating json from app settings"
            com.google.android.gms.internal.ads.abv.m32795c(r5, r3)     // Catch:{ JSONException -> 0x09b2 }
        L_0x07a2:
            java.lang.String r3 = "render_in_browser"
            boolean r5 = r2.f46107K     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09b2 }
        L_0x07ad:
            int r3 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            if (r3 < r4) goto L_0x07bc
            java.lang.String r3 = "android_num_video_cache_tasks"
            int r4 = r2.f46108L     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09b2 }
        L_0x07bc:
            com.google.android.gms.internal.ads.zzbgz r3 = r2.f46140k     // Catch:{ JSONException -> 0x09b2 }
            boolean r4 = r2.f46122Z     // Catch:{ JSONException -> 0x09b2 }
            boolean r1 = r1.f45821l     // Catch:{ JSONException -> 0x09b2 }
            boolean r5 = r2.f46125ab     // Catch:{ JSONException -> 0x09b2 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x09b2 }
            r7.<init>()     // Catch:{ JSONException -> 0x09b2 }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ JSONException -> 0x09b2 }
            r9.<init>()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = "cl"
            java.lang.String r11 = "235029740"
            r9.putString(r10, r11)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = "rapid_rc"
            java.lang.String r11 = "dev"
            r9.putString(r10, r11)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = "rapid_rollup"
            java.lang.String r11 = "HEAD"
            r9.putString(r10, r11)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = "build_meta"
            r7.putBundle(r10, r9)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r9 = "mf"
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r10 = com.google.android.gms.internal.ads.C15740bx.f44276bJ     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.bu r11 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Object r10 = r11.mo30717a(r10)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ JSONException -> 0x09b2 }
            boolean r10 = r10.booleanValue()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r10 = java.lang.Boolean.toString(r10)     // Catch:{ JSONException -> 0x09b2 }
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r9 = "instant_app"
            r7.putBoolean(r9, r4)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r4 = "lite"
            boolean r3 = r3.f46241e     // Catch:{ JSONException -> 0x09b2 }
            r7.putBoolean(r4, r3)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r3 = "local_service"
            r7.putBoolean(r3, r1)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r1 = "is_privileged_process"
            r7.putBoolean(r1, r5)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r1 = "container_version"
            r3 = 12451009(0xbdfcc1, float:1.744758E-38)
            r7.putInt(r1, r3)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r1 = "sdk_env"
            r8.put(r1, r7)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r1 = "cache_state"
            r8.put(r1, r6)     // Catch:{ JSONException -> 0x09b2 }
            int r1 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            r3 = 19
            if (r1 < r3) goto L_0x0836
            java.lang.String r1 = "gct"
            java.lang.String r3 = r2.f46110N     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0836:
            int r1 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            r3 = 21
            if (r1 < r3) goto L_0x0847
            boolean r1 = r2.f46112P     // Catch:{ JSONException -> 0x09b2 }
            if (r1 == 0) goto L_0x0847
            java.lang.String r1 = "de"
            java.lang.String r3 = "1"
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0847:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C15740bx.f44226aM     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.bu r3 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Object r1 = r3.mo30717a(r1)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ JSONException -> 0x09b2 }
            boolean r1 = r1.booleanValue()     // Catch:{ JSONException -> 0x09b2 }
            if (r1 == 0) goto L_0x088d
            com.google.android.gms.internal.ads.zzyz r1 = r2.f46133d     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r1 = r1.f46338a     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r3 = "interstitial_mb"
            boolean r3 = r1.equals(r3)     // Catch:{ JSONException -> 0x09b2 }
            if (r3 != 0) goto L_0x0870
            java.lang.String r3 = "reward_mb"
            boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x09b2 }
            if (r1 == 0) goto L_0x086e
            goto L_0x0870
        L_0x086e:
            r1 = 0
            goto L_0x0871
        L_0x0870:
            r1 = 1
        L_0x0871:
            android.os.Bundle r3 = r2.f46113Q     // Catch:{ JSONException -> 0x09b2 }
            if (r3 == 0) goto L_0x0878
            r20 = 1
            goto L_0x087a
        L_0x0878:
            r20 = 0
        L_0x087a:
            if (r1 == 0) goto L_0x088d
            if (r20 == 0) goto L_0x088d
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x09b2 }
            r1.<init>()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r4 = "interstitial_pool"
            r1.putBundle(r4, r3)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r3 = "counters"
            r8.put(r3, r1)     // Catch:{ JSONException -> 0x09b2 }
        L_0x088d:
            java.lang.String r1 = r2.f46114R     // Catch:{ JSONException -> 0x09b2 }
            if (r1 == 0) goto L_0x0898
            java.lang.String r1 = "gmp_app_id"
            java.lang.String r3 = r2.f46114R     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0898:
            java.lang.String r1 = r2.f46115S     // Catch:{ JSONException -> 0x09b2 }
            if (r1 == 0) goto L_0x08be
            java.lang.String r1 = "TIME_OUT"
            java.lang.String r3 = r2.f46115S     // Catch:{ JSONException -> 0x09b2 }
            boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x09b2 }
            if (r1 == 0) goto L_0x08b6
            java.lang.String r1 = "sai_timeout"
            com.google.android.gms.internal.ads.bl<java.lang.Long> r3 = com.google.android.gms.internal.ads.C15740bx.f44250ak     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.bu r4 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Object r3 = r4.mo30717a(r3)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x08c5
        L_0x08b6:
            java.lang.String r1 = "fbs_aiid"
            java.lang.String r3 = r2.f46115S     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x08c5
        L_0x08be:
            java.lang.String r1 = "fbs_aiid"
            java.lang.String r3 = ""
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09b2 }
        L_0x08c5:
            java.lang.String r1 = r2.f46116T     // Catch:{ JSONException -> 0x09b2 }
            if (r1 == 0) goto L_0x08d0
            java.lang.String r1 = "fbs_aeid"
            java.lang.String r3 = r2.f46116T     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09b2 }
        L_0x08d0:
            java.lang.String r1 = r2.f46129af     // Catch:{ JSONException -> 0x09b2 }
            if (r1 == 0) goto L_0x08db
            java.lang.String r1 = "apm_id_origin"
            java.lang.String r3 = r2.f46129af     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09b2 }
        L_0x08db:
            int r1 = r2.f46123a     // Catch:{ JSONException -> 0x09b2 }
            r3 = 24
            if (r1 < r3) goto L_0x08ec
            java.lang.String r1 = "disable_ml"
            boolean r3 = r2.f46124aa     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09b2 }
        L_0x08ec:
            com.google.android.gms.internal.ads.bl<java.lang.String> r1 = com.google.android.gms.internal.ads.C15740bx.f44193G     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.bu r3 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Object r1 = r3.mo30717a(r1)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x09b2 }
            if (r1 == 0) goto L_0x0933
            boolean r3 = r1.isEmpty()     // Catch:{ JSONException -> 0x09b2 }
            if (r3 != 0) goto L_0x0933
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.bl<java.lang.Integer> r4 = com.google.android.gms.internal.ads.C15740bx.f44194H     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.bu r5 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Object r4 = r5.mo30717a(r4)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ JSONException -> 0x09b2 }
            int r4 = r4.intValue()     // Catch:{ JSONException -> 0x09b2 }
            if (r3 < r4) goto L_0x0933
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ JSONException -> 0x09b2 }
            r3.<init>()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r4 = ","
            java.lang.String[] r1 = r1.split(r4)     // Catch:{ JSONException -> 0x09b2 }
            int r4 = r1.length     // Catch:{ JSONException -> 0x09b2 }
        L_0x0920:
            if (r14 >= r4) goto L_0x092e
            r5 = r1[r14]     // Catch:{ JSONException -> 0x09b2 }
            java.util.List r6 = com.google.android.gms.internal.ads.aeq.m32739a(r5)     // Catch:{ JSONException -> 0x09b2 }
            r3.put(r5, r6)     // Catch:{ JSONException -> 0x09b2 }
            int r14 = r14 + 1
            goto L_0x0920
        L_0x092e:
            java.lang.String r1 = "video_decoders"
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0933:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C15740bx.f44334cO     // Catch:{ JSONException -> 0x09b2 }
            com.google.android.gms.internal.ads.bu r3 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Object r1 = r3.mo30717a(r1)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ JSONException -> 0x09b2 }
            boolean r1 = r1.booleanValue()     // Catch:{ JSONException -> 0x09b2 }
            if (r1 == 0) goto L_0x0954
            java.lang.String r1 = "omid_v"
            com.google.android.gms.internal.ads.rr r3 = com.google.android.gms.ads.internal.C14963ax.m30845o()     // Catch:{ JSONException -> 0x09b2 }
            r4 = r22
            java.lang.String r3 = r3.mo31373b(r4)     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0954:
            java.util.ArrayList<java.lang.String> r1 = r2.f46126ac     // Catch:{ JSONException -> 0x09b2 }
            if (r1 == 0) goto L_0x0967
            java.util.ArrayList<java.lang.String> r1 = r2.f46126ac     // Catch:{ JSONException -> 0x09b2 }
            boolean r1 = r1.isEmpty()     // Catch:{ JSONException -> 0x09b2 }
            if (r1 != 0) goto L_0x0967
            java.lang.String r1 = "android_permissions"
            java.util.ArrayList<java.lang.String> r3 = r2.f46126ac     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0967:
            java.lang.String r1 = r2.f46127ad     // Catch:{ JSONException -> 0x09b2 }
            if (r1 == 0) goto L_0x0972
            java.lang.String r1 = "consent_string"
            java.lang.String r3 = r2.f46127ad     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09b2 }
        L_0x0972:
            java.lang.String r1 = r2.f46127ad     // Catch:{ JSONException -> 0x09b2 }
            if (r1 == 0) goto L_0x097d
            java.lang.String r1 = "iab_consent_info"
            android.os.Bundle r2 = r2.f46130ag     // Catch:{ JSONException -> 0x09b2 }
            r8.put(r1, r2)     // Catch:{ JSONException -> 0x09b2 }
        L_0x097d:
            r1 = 2
            boolean r2 = com.google.android.gms.internal.ads.abv.m32791a(r1)     // Catch:{ JSONException -> 0x09b2 }
            if (r2 == 0) goto L_0x09a9
            com.google.android.gms.internal.ads.acd r2 = com.google.android.gms.ads.internal.C14963ax.m30831a()     // Catch:{ JSONException -> 0x09b2 }
            org.json.JSONObject r2 = r2.mo28664a(r8)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r1 = r2.toString(r1)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r2 = "Ad Request JSON: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ JSONException -> 0x09b2 }
            int r3 = r1.length()     // Catch:{ JSONException -> 0x09b2 }
            if (r3 == 0) goto L_0x09a1
            java.lang.String r1 = r2.concat(r1)     // Catch:{ JSONException -> 0x09b2 }
            goto L_0x09a6
        L_0x09a1:
            java.lang.String r1 = new java.lang.String     // Catch:{ JSONException -> 0x09b2 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x09b2 }
        L_0x09a6:
            com.google.android.gms.internal.ads.abv.m32494a(r1)     // Catch:{ JSONException -> 0x09b2 }
        L_0x09a9:
            com.google.android.gms.internal.ads.acd r1 = com.google.android.gms.ads.internal.C14963ax.m30831a()     // Catch:{ JSONException -> 0x09b2 }
            org.json.JSONObject r1 = r1.mo28664a(r8)     // Catch:{ JSONException -> 0x09b2 }
            return r1
        L_0x09b2:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "Problem serializing ad request to JSON: "
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x09c9
            java.lang.String r1 = r2.concat(r1)
            goto L_0x09ce
        L_0x09c9:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x09ce:
            com.google.android.gms.internal.ads.abv.m32798e(r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16360wx.m38980a(android.content.Context, com.google.android.gms.internal.ads.wp):org.json.JSONObject");
    }

    /* renamed from: a */
    private static void m38982a(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }

    /* renamed from: a */
    private static Integer m38977a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0152 A[Catch:{ JSONException -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015b A[Catch:{ JSONException -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0236 A[Catch:{ JSONException -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x023f A[Catch:{ JSONException -> 0x028f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzaxi m38976a(android.content.Context r57, com.google.android.gms.internal.ads.zzaxe r58, java.lang.String r59) {
        /*
            r0 = r58
            r15 = 0
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x028f }
            r1 = r59
            r10.<init>(r1)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "ad_base_url"
            r11 = 0
            java.lang.String r1 = r10.optString(r1, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r2 = "ad_url"
            java.lang.String r4 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r2 = "ad_size"
            java.lang.String r13 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r2 = "ad_slot_size"
            java.lang.String r40 = r10.optString(r2, r13)     // Catch:{ JSONException -> 0x028f }
            r12 = 1
            if (r0 == 0) goto L_0x002d
            int r2 = r0.f46142m     // Catch:{ JSONException -> 0x028f }
            if (r2 == 0) goto L_0x002d
            r24 = 1
            goto L_0x002f
        L_0x002d:
            r24 = 0
        L_0x002f:
            java.lang.String r2 = "ad_json"
            java.lang.String r2 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x028f }
            if (r2 != 0) goto L_0x003d
            java.lang.String r2 = "ad_html"
            java.lang.String r2 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x028f }
        L_0x003d:
            if (r2 != 0) goto L_0x0045
            java.lang.String r2 = "body"
            java.lang.String r2 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x028f }
        L_0x0045:
            if (r2 != 0) goto L_0x0053
            java.lang.String r3 = "ads"
            boolean r3 = r10.has(r3)     // Catch:{ JSONException -> 0x028f }
            if (r3 == 0) goto L_0x0053
            java.lang.String r2 = r10.toString()     // Catch:{ JSONException -> 0x028f }
        L_0x0053:
            java.lang.String r3 = "debug_dialog"
            java.lang.String r19 = r10.optString(r3, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r3 = "debug_signals"
            java.lang.String r42 = r10.optString(r3, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r3 = "interstitial_timeout"
            boolean r3 = r10.has(r3)     // Catch:{ JSONException -> 0x028f }
            r8 = -1
            if (r3 == 0) goto L_0x007a
            java.lang.String r3 = "interstitial_timeout"
            double r5 = r10.getDouble(r3)     // Catch:{ JSONException -> 0x028f }
            r16 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r5 = r5 * r16
            long r5 = (long) r5     // Catch:{ JSONException -> 0x028f }
            r16 = r5
            goto L_0x007c
        L_0x007a:
            r16 = r8
        L_0x007c:
            java.lang.String r3 = "orientation"
            java.lang.String r3 = r10.optString(r3, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r5 = "portrait"
            boolean r5 = r5.equals(r3)     // Catch:{ JSONException -> 0x028f }
            r14 = -1
            if (r5 == 0) goto L_0x008f
            r3 = 7
            r18 = 7
            goto L_0x009d
        L_0x008f:
            java.lang.String r5 = "landscape"
            boolean r3 = r5.equals(r3)     // Catch:{ JSONException -> 0x028f }
            if (r3 == 0) goto L_0x009b
            r3 = 6
            r18 = 6
            goto L_0x009d
        L_0x009b:
            r18 = -1
        L_0x009d:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x028f }
            if (r3 == 0) goto L_0x00cb
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x028f }
            if (r3 != 0) goto L_0x00cb
            com.google.android.gms.internal.ads.zzbgz r1 = r0.f46140k     // Catch:{ JSONException -> 0x028f }
            java.lang.String r3 = r1.f46237a     // Catch:{ JSONException -> 0x028f }
            r5 = 0
            r6 = 0
            r7 = 0
            r20 = 0
            r21 = 0
            r1 = r58
            r2 = r57
            r8 = r20
            r9 = r21
            com.google.android.gms.internal.ads.zzaxi r1 = com.google.android.gms.internal.ads.C16354wr.m38965a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r2 = r1.f46182a     // Catch:{ JSONException -> 0x028f }
            java.lang.String r3 = r1.f46184b     // Catch:{ JSONException -> 0x028f }
            long r4 = r1.f46195m     // Catch:{ JSONException -> 0x028f }
            r20 = r4
            r4 = r3
            r3 = r2
            goto L_0x00d0
        L_0x00cb:
            r3 = r1
            r4 = r2
            r1 = r11
            r20 = -1
        L_0x00d0:
            if (r4 != 0) goto L_0x00d8
            com.google.android.gms.internal.ads.zzaxi r0 = new com.google.android.gms.internal.ads.zzaxi     // Catch:{ JSONException -> 0x028f }
            r0.<init>(r15)     // Catch:{ JSONException -> 0x028f }
            return r0
        L_0x00d8:
            java.lang.String r2 = "click_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x028f }
            if (r1 != 0) goto L_0x00e2
            r5 = r11
            goto L_0x00e4
        L_0x00e2:
            java.util.List<java.lang.String> r5 = r1.f46185c     // Catch:{ JSONException -> 0x028f }
        L_0x00e4:
            if (r2 == 0) goto L_0x00eb
            java.util.List r2 = m38978a(r2, r5)     // Catch:{ JSONException -> 0x028f }
            r5 = r2
        L_0x00eb:
            java.lang.String r2 = "impression_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x028f }
            if (r1 != 0) goto L_0x00f5
            r6 = r11
            goto L_0x00f7
        L_0x00f5:
            java.util.List<java.lang.String> r6 = r1.f46187e     // Catch:{ JSONException -> 0x028f }
        L_0x00f7:
            if (r2 == 0) goto L_0x00fe
            java.util.List r2 = m38978a(r2, r6)     // Catch:{ JSONException -> 0x028f }
            r6 = r2
        L_0x00fe:
            java.lang.String r2 = "downloaded_impression_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x028f }
            if (r1 != 0) goto L_0x0108
            r7 = r11
            goto L_0x010a
        L_0x0108:
            java.util.List<java.lang.String> r7 = r1.f46173R     // Catch:{ JSONException -> 0x028f }
        L_0x010a:
            if (r2 == 0) goto L_0x0113
            java.util.List r2 = m38978a(r2, r7)     // Catch:{ JSONException -> 0x028f }
            r48 = r2
            goto L_0x0115
        L_0x0113:
            r48 = r7
        L_0x0115:
            java.lang.String r2 = "manual_impression_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x028f }
            if (r1 != 0) goto L_0x011f
            r7 = r11
            goto L_0x0121
        L_0x011f:
            java.util.List<java.lang.String> r7 = r1.f46191i     // Catch:{ JSONException -> 0x028f }
        L_0x0121:
            if (r2 == 0) goto L_0x012a
            java.util.List r2 = m38978a(r2, r7)     // Catch:{ JSONException -> 0x028f }
            r22 = r2
            goto L_0x012c
        L_0x012a:
            r22 = r7
        L_0x012c:
            if (r1 == 0) goto L_0x0142
            int r2 = r1.f46193k     // Catch:{ JSONException -> 0x028f }
            if (r2 == r14) goto L_0x0136
            int r2 = r1.f46193k     // Catch:{ JSONException -> 0x028f }
            r18 = r2
        L_0x0136:
            long r7 = r1.f46188f     // Catch:{ JSONException -> 0x028f }
            r25 = 0
            int r2 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r2 <= 0) goto L_0x0142
            long r1 = r1.f46188f     // Catch:{ JSONException -> 0x028f }
            r7 = r1
            goto L_0x0144
        L_0x0142:
            r7 = r16
        L_0x0144:
            java.lang.String r1 = "active_view"
            java.lang.String r23 = r10.optString(r1)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "ad_is_javascript"
            boolean r25 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            if (r25 == 0) goto L_0x015b
            java.lang.String r1 = "ad_passback_url"
            java.lang.String r1 = r10.optString(r1, r11)     // Catch:{ JSONException -> 0x028f }
            r26 = r1
            goto L_0x015d
        L_0x015b:
            r26 = r11
        L_0x015d:
            java.lang.String r1 = "mediation"
            boolean r9 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "custom_render_allowed"
            boolean r27 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "content_url_opted_out"
            boolean r28 = r10.optBoolean(r1, r12)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "content_vertical_opted_out"
            boolean r43 = r10.optBoolean(r1, r12)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "prefetch"
            boolean r29 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "refresh_interval_milliseconds"
            r56 = r13
            r12 = -1
            long r16 = r10.optLong(r1, r12)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "mediation_config_cache_time_milliseconds"
            long r12 = r10.optLong(r1, r12)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "gws_query_id"
            java.lang.String r2 = ""
            java.lang.String r30 = r10.optString(r1, r2)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "height"
            java.lang.String r2 = "fluid"
            java.lang.String r14 = ""
            java.lang.String r2 = r10.optString(r2, r14)     // Catch:{ JSONException -> 0x028f }
            boolean r31 = r1.equals(r2)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "native_express"
            boolean r32 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "video_start_urls"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x028f }
            java.util.List r33 = m38978a(r1, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "video_complete_urls"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x028f }
            java.util.List r34 = m38978a(r1, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "rewards"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x028f }
            com.google.android.gms.internal.ads.zzbaz r35 = com.google.android.gms.internal.ads.zzbaz.m39276a(r1)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "use_displayed_impression"
            boolean r36 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "auto_protection_configuration"
            org.json.JSONObject r1 = r10.optJSONObject(r1)     // Catch:{ JSONException -> 0x028f }
            com.google.android.gms.internal.ads.zzaxk r37 = com.google.android.gms.internal.ads.zzaxk.m39271a(r1)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "set_cookie"
            java.lang.String r2 = ""
            java.lang.String r38 = r10.optString(r1, r2)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "remote_ping_urls"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x028f }
            java.util.List r39 = m38978a(r1, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "safe_browsing"
            org.json.JSONObject r1 = r10.optJSONObject(r1)     // Catch:{ JSONException -> 0x028f }
            com.google.android.gms.internal.ads.zzbbq r41 = com.google.android.gms.internal.ads.zzbbq.m39277a(r1)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "render_in_browser"
            boolean r2 = r0.f46107K     // Catch:{ JSONException -> 0x028f }
            boolean r44 = r10.optBoolean(r1, r2)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "custom_close_blocked"
            boolean r45 = r10.optBoolean(r1)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "enable_omid"
            boolean r47 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "omid_settings"
            java.lang.String r50 = r10.optString(r1, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "disable_closable_area"
            boolean r49 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            com.google.android.gms.internal.ads.zzyv r1 = r0.f46132c     // Catch:{ JSONException -> 0x028f }
            android.os.Bundle r1 = r1.f46329m     // Catch:{ JSONException -> 0x028f }
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r2 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r2 = r2.getName()     // Catch:{ JSONException -> 0x028f }
            android.os.Bundle r1 = r1.getBundle(r2)     // Catch:{ JSONException -> 0x028f }
            if (r1 == 0) goto L_0x022c
            java.lang.String r2 = "is_analytics_logging_enabled"
            boolean r1 = r1.getBoolean(r2, r15)     // Catch:{ JSONException -> 0x028f }
            if (r1 == 0) goto L_0x022c
            r52 = 1
            goto L_0x022e
        L_0x022c:
            r52 = 0
        L_0x022e:
            java.lang.String r1 = "creative_configuration"
            org.json.JSONObject r1 = r10.optJSONObject(r1)     // Catch:{ JSONException -> 0x028f }
            if (r1 == 0) goto L_0x023f
            java.lang.String r2 = "scroll_aware"
            boolean r1 = r1.optBoolean(r2, r15)     // Catch:{ JSONException -> 0x028f }
            r53 = r1
            goto L_0x0241
        L_0x023f:
            r53 = 0
        L_0x0241:
            com.google.android.gms.internal.ads.zzaxi r54 = new com.google.android.gms.internal.ads.zzaxi     // Catch:{ JSONException -> 0x028f }
            boolean r14 = r0.f46145p     // Catch:{ JSONException -> 0x028f }
            boolean r10 = r0.f46103G     // Catch:{ JSONException -> 0x028f }
            boolean r11 = r0.f46117U     // Catch:{ JSONException -> 0x028f }
            r46 = 0
            java.lang.String r51 = ""
            r1 = r54
            r2 = r58
            r0 = r10
            r55 = r11
            r10 = r12
            r12 = r22
            r22 = r56
            r56 = r14
            r13 = r16
            r15 = r18
            r16 = r22
            r17 = r20
            r20 = r25
            r21 = r26
            r22 = r23
            r23 = r27
            r25 = r56
            r26 = r28
            r27 = r29
            r28 = r30
            r29 = r31
            r30 = r32
            r31 = r35
            r32 = r33
            r33 = r34
            r34 = r36
            r35 = r37
            r36 = r0
            r37 = r38
            r38 = r39
            r39 = r44
            r44 = r55
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)     // Catch:{ JSONException -> 0x028f }
            return r54
        L_0x028f:
            r0 = move-exception
            java.lang.String r1 = "Could not parse the inline ad response: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x02a5
            java.lang.String r0 = r1.concat(r0)
            goto L_0x02aa
        L_0x02a5:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x02aa:
            com.google.android.gms.internal.ads.abv.m32798e(r0)
            com.google.android.gms.internal.ads.zzaxi r0 = new com.google.android.gms.internal.ads.zzaxi
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16360wx.m38976a(android.content.Context, com.google.android.gms.internal.ads.zzaxe, java.lang.String):com.google.android.gms.internal.ads.zzaxi");
    }

    /* renamed from: a */
    private static List<String> m38978a(JSONArray jSONArray, List<String> list) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    /* renamed from: a */
    public static JSONObject m38981a(zzaxi zzaxi) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (zzaxi.f46182a != null) {
            jSONObject.put("ad_base_url", zzaxi.f46182a);
        }
        if (zzaxi.f46194l != null) {
            jSONObject.put("ad_size", zzaxi.f46194l);
        }
        jSONObject.put("native", zzaxi.f46201s);
        if (zzaxi.f46201s) {
            jSONObject.put("ad_json", zzaxi.f46184b);
        } else {
            jSONObject.put("ad_html", zzaxi.f46184b);
        }
        if (zzaxi.f46196n != null) {
            jSONObject.put("debug_dialog", zzaxi.f46196n);
        }
        if (zzaxi.f46167L != null) {
            jSONObject.put("debug_signals", zzaxi.f46167L);
        }
        if (zzaxi.f46188f != -1) {
            double d = (double) zzaxi.f46188f;
            Double.isNaN(d);
            jSONObject.put("interstitial_timeout", d / 1000.0d);
        }
        if (zzaxi.f46193k == 7) {
            jSONObject.put("orientation", "portrait");
        } else if (zzaxi.f46193k == 6) {
            jSONObject.put("orientation", "landscape");
        }
        if (zzaxi.f46185c != null) {
            jSONObject.put("click_urls", m38979a(zzaxi.f46185c));
        }
        if (zzaxi.f46187e != null) {
            jSONObject.put("impression_urls", m38979a(zzaxi.f46187e));
        }
        if (zzaxi.f46173R != null) {
            jSONObject.put("downloaded_impression_urls", m38979a(zzaxi.f46173R));
        }
        if (zzaxi.f46191i != null) {
            jSONObject.put("manual_impression_urls", m38979a(zzaxi.f46191i));
        }
        if (zzaxi.f46199q != null) {
            jSONObject.put("active_view", zzaxi.f46199q);
        }
        jSONObject.put("ad_is_javascript", zzaxi.f46197o);
        if (zzaxi.f46198p != null) {
            jSONObject.put("ad_passback_url", zzaxi.f46198p);
        }
        jSONObject.put("mediation", zzaxi.f46189g);
        jSONObject.put("custom_render_allowed", zzaxi.f46200r);
        jSONObject.put("content_url_opted_out", zzaxi.f46203u);
        jSONObject.put("content_vertical_opted_out", zzaxi.f46168M);
        jSONObject.put("prefetch", zzaxi.f46204v);
        if (zzaxi.f46192j != -1) {
            jSONObject.put("refresh_interval_milliseconds", zzaxi.f46192j);
        }
        if (zzaxi.f46190h != -1) {
            jSONObject.put("mediation_config_cache_time_milliseconds", zzaxi.f46190h);
        }
        if (!TextUtils.isEmpty(zzaxi.f46206x)) {
            jSONObject.put("gws_query_id", zzaxi.f46206x);
        }
        jSONObject.put("fluid", zzaxi.f46207y ? "height" : "");
        jSONObject.put("native_express", zzaxi.f46208z);
        if (zzaxi.f46157B != null) {
            jSONObject.put("video_start_urls", m38979a(zzaxi.f46157B));
        }
        if (zzaxi.f46158C != null) {
            jSONObject.put("video_complete_urls", m38979a(zzaxi.f46158C));
        }
        if (zzaxi.f46156A != null) {
            zzbaz zzbaz = zzaxi.f46156A;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("rb_type", zzbaz.f46226a);
            jSONObject2.put("rb_amount", zzbaz.f46227b);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("rewards", jSONArray);
        }
        jSONObject.put("use_displayed_impression", zzaxi.f46159D);
        jSONObject.put("auto_protection_configuration", zzaxi.f46160E);
        jSONObject.put("render_in_browser", zzaxi.f46164I);
        jSONObject.put("disable_closable_area", zzaxi.f46174S);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("scroll_aware", zzaxi.f46178W);
        jSONObject.put("creative_configuration", jSONObject3);
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONArray m38979a(List<String> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        return jSONArray;
    }
}
