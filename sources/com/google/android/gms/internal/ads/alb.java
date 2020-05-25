package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

final class alb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40831a;

    /* renamed from: b */
    private final /* synthetic */ String f40832b;

    /* renamed from: c */
    private final /* synthetic */ String f40833c;

    /* renamed from: d */
    private final /* synthetic */ String f40834d;

    /* renamed from: e */
    private final /* synthetic */ akt f40835e;

    alb(akt akt, String str, String str2, String str3, String str4) {
        this.f40835e = akt;
        this.f40831a = str;
        this.f40832b = str2;
        this.f40833c = str3;
        this.f40834d = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f40831a);
        if (!TextUtils.isEmpty(this.f40832b)) {
            hashMap.put("cachedSrc", this.f40832b);
        }
        String str = "type";
        akt akt = this.f40835e;
        String str2 = this.f40833c;
        String str3 = "internal";
        char c = 65535;
        switch (str2.hashCode()) {
            case -1947652542:
                if (str2.equals("interrupted")) {
                    c = 3;
                    break;
                }
                break;
            case -1396664534:
                if (str2.equals("badUrl")) {
                    c = 8;
                    break;
                }
                break;
            case -1347010958:
                if (str2.equals("inProgress")) {
                    c = 2;
                    break;
                }
                break;
            case -918817863:
                if (str2.equals("downloadTimeout")) {
                    c = 9;
                    break;
                }
                break;
            case -659376217:
                if (str2.equals("contentLengthMissing")) {
                    c = 0;
                    break;
                }
                break;
            case -642208130:
                if (str2.equals("playerFailed")) {
                    c = 5;
                    break;
                }
                break;
            case -354048396:
                if (str2.equals("sizeExceeded")) {
                    c = 11;
                    break;
                }
                break;
            case -32082395:
                if (str2.equals("externalAbort")) {
                    c = 10;
                    break;
                }
                break;
            case 3387234:
                if (str2.equals("noop")) {
                    c = 4;
                    break;
                }
                break;
            case 96784904:
                if (str2.equals("error")) {
                    c = 1;
                    break;
                }
                break;
            case 580119100:
                if (str2.equals("expireFailed")) {
                    c = 6;
                    break;
                }
                break;
            case 725497484:
                if (str2.equals("noCacheDir")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                str3 = "internal";
                break;
            case 6:
            case 7:
                str3 = "io";
                break;
            case 8:
            case 9:
                str3 = "network";
                break;
            case 10:
            case 11:
                str3 = "policy";
                break;
        }
        hashMap.put(str, str3);
        hashMap.put("reason", this.f40833c);
        if (!TextUtils.isEmpty(this.f40834d)) {
            hashMap.put("message", this.f40834d);
        }
        akt.m33179a(this.f40835e, "onPrecacheEvent", (Map) hashMap);
    }
}
