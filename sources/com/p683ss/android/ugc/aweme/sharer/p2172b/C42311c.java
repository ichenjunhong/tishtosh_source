package com.p683ss.android.ugc.aweme.sharer.p2172b;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri.Builder;
import java.util.List;
import org.json.JSONArray;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.b.c */
public final class C42311c {

    /* renamed from: b */
    public static final String f106858b = f106858b;

    /* renamed from: c */
    public static final String f106859c = f106859c;

    /* renamed from: d */
    public static final String f106860d = f106860d;

    /* renamed from: e */
    public static final String f106861e = f106861e;

    /* renamed from: f */
    public static final String f106862f = f106862f;

    /* renamed from: g */
    public static final String f106863g = f106863g;

    /* renamed from: h */
    public static final String f106864h = "title";

    /* renamed from: i */
    public static final String f106865i = f106865i;

    /* renamed from: j */
    public static final String f106866j = f106866j;

    /* renamed from: k */
    public static final String f106867k = f106867k;

    /* renamed from: l */
    public static final String f106868l = f106868l;

    /* renamed from: m */
    public static final String f106869m = f106869m;

    /* renamed from: n */
    public static final C42313b f106870n = new C42313b(null);

    /* renamed from: a */
    public final Context f106871a;

    /* renamed from: com.ss.android.ugc.aweme.sharer.b.c$a */
    public static final class C42312a {

        /* renamed from: a */
        public static final C42312a f106872a = new C42312a();

        private C42312a() {
        }

        /* renamed from: a */
        public static void m92912a(Builder builder, String str, List<String> list) {
            if (list != null) {
                builder.appendQueryParameter(str, new JSONArray(list).toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.b.c$b */
    public static final class C42313b {
        private C42313b() {
        }

        public /* synthetic */ C42313b(C52707g gVar) {
            this();
        }
    }

    public C42311c(Context context) {
        C52711k.m112240b(context, "context");
        this.f106871a = context;
    }

    /* renamed from: a */
    public final boolean mo86231a(String str) {
        try {
            if (this.f106871a.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }
}
