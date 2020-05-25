package com.p683ss.caijing.globaliap.p2563f;

import java.util.HashMap;

/* renamed from: com.ss.caijing.globaliap.f.b */
public final class C51283b {
    /* renamed from: a */
    public static void m110253a(String str, boolean z, boolean z2, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", str);
        hashMap.put("normalProcess", z ? "true" : "false");
        hashMap.put("result", z2 ? "success" : "fail");
        hashMap.put("time", Integer.toString(i));
        C51284c.m110260a("caijing_iap_google_confirm_result", hashMap);
    }

    /* renamed from: a */
    public static void m110254a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("result", z ? "success" : "fail");
        C51284c.m110260a("caijing_iap_consume_task_bind", hashMap);
    }

    /* renamed from: a */
    public static void m110244a() {
        C51284c.m110260a("caijing_iap_encrypt_failed", new HashMap());
    }

    /* renamed from: b */
    public static void m110255b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("exception", str);
        C51284c.m110260a("caijing_iap_consume_task_exception", hashMap);
    }

    /* renamed from: a */
    public static void m110245a(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("length", Integer.valueOf(i).toString());
        C51284c.m110260a("caijing_iap_consume_task_unconsumed_length", hashMap);
    }

    /* renamed from: a */
    public static void m110246a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("method", str);
        C51284c.m110260a("caijing_iap_google_without_host", hashMap);
    }

    /* renamed from: b */
    public static void m110256b(String str, boolean z) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", str);
        String str3 = "opened";
        if (z) {
            str2 = "success";
        } else {
            str2 = "failed";
        }
        hashMap.put(str3, str2);
        C51284c.m110260a("caijing_iap_google_open_page", hashMap);
    }

    /* renamed from: c */
    public static void m110258c(String str, boolean z) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", str);
        String str3 = "normalProcess";
        if (z) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        hashMap.put(str3, str2);
        C51284c.m110260a("caijing_iap_google_consume_start", hashMap);
    }

    /* renamed from: d */
    public static void m110259d(String str, boolean z) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", str);
        String str3 = "allowed";
        if (z) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        hashMap.put(str3, str2);
        C51284c.m110260a("caijing_iap_confirm_allowed_remove", hashMap);
    }

    /* renamed from: a */
    public static void m110247a(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", str);
        hashMap.put("resultCode", Integer.toString(i));
        C51284c.m110260a("caijing_iap_google_query_purchase", hashMap);
    }

    /* renamed from: a */
    public static void m110249a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("upload_host", str);
        hashMap.put("from", str2);
        C51284c.m110260a("caijing_iap_google_upload_host", hashMap);
    }

    /* renamed from: a */
    public static void m110250a(String str, boolean z) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", str);
        String str3 = "result";
        if (z) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        hashMap.put(str3, str2);
        C51284c.m110260a("caijing_iap_google_bind_service", hashMap);
    }

    /* renamed from: b */
    public static void m110257b(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", str);
        String str4 = "allow_remove";
        if (z) {
            str2 = "allow";
        } else {
            str2 = "deny";
        }
        hashMap.put(str4, str2);
        String str5 = "exception";
        if (z2) {
            str3 = "yes";
        } else {
            str3 = "no";
        }
        hashMap.put(str5, str3);
        C51284c.m110260a("caijing_iap_google_consume_task_confirm_result", hashMap);
    }

    /* renamed from: a */
    public static void m110248a(String str, int i, boolean z) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", str);
        hashMap.put("resultCode", Integer.toString(i));
        String str3 = "normalProcess";
        if (z) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        hashMap.put(str3, str2);
        C51284c.m110260a("caijing_iap_google_consume_result", hashMap);
    }

    /* renamed from: a */
    public static void m110251a(String str, boolean z, String str2) {
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", str);
        String str4 = "normalProcess";
        if (z) {
            str3 = "true";
        } else {
            str3 = "false";
        }
        hashMap.put(str4, str3);
        hashMap.put("channel", str2);
        C51284c.m110260a("caijing_iap_google_no_order_matched", hashMap);
    }

    /* renamed from: a */
    public static void m110252a(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", str);
        String str4 = "allow_remove";
        if (z) {
            str2 = "allow";
        } else {
            str2 = "deny";
        }
        hashMap.put(str4, str2);
        String str5 = "exception";
        if (z2) {
            str3 = "yes";
        } else {
            str3 = "no";
        }
        hashMap.put(str5, str3);
        C51284c.m110260a("caijing_iap_google_background_confirm_result", hashMap);
    }
}
