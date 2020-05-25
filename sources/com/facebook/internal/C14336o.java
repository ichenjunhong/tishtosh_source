package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.facebook.internal.o */
public final class C14336o {

    /* renamed from: a */
    public boolean f37289a;

    /* renamed from: b */
    public String f37290b;

    /* renamed from: c */
    public boolean f37291c;

    /* renamed from: d */
    public int f37292d;

    /* renamed from: e */
    public EnumSet<C14367z> f37293e;

    /* renamed from: f */
    public Map<String, Map<String, C14337a>> f37294f;

    /* renamed from: g */
    public boolean f37295g;

    /* renamed from: h */
    public C14320j f37296h;

    /* renamed from: i */
    public String f37297i;

    /* renamed from: j */
    public String f37298j;

    /* renamed from: k */
    public boolean f37299k;

    /* renamed from: l */
    public boolean f37300l;

    /* renamed from: m */
    public String f37301m;

    /* renamed from: n */
    public JSONArray f37302n;

    /* renamed from: o */
    public boolean f37303o;

    /* renamed from: com.facebook.internal.o$a */
    public static class C14337a {

        /* renamed from: a */
        public String f37304a;

        /* renamed from: b */
        public String f37305b;

        /* renamed from: c */
        public Uri f37306c;

        /* renamed from: d */
        public int[] f37307d;

        /* renamed from: a */
        static int[] m29396a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int optInt = jSONArray.optInt(i, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i);
                    if (!C14277aa.m29276a(optString)) {
                        try {
                            optInt = Integer.parseInt(optString);
                        } catch (NumberFormatException unused) {
                            optInt = -1;
                        }
                    }
                }
                iArr[i] = optInt;
            }
            return iArr;
        }

        C14337a(String str, String str2, Uri uri, int[] iArr) {
            this.f37304a = str;
            this.f37305b = str2;
            this.f37306c = uri;
            this.f37307d = iArr;
        }
    }

    /* renamed from: a */
    public static C14337a m29395a(String str, String str2, String str3) {
        if (C14277aa.m29276a(str2) || C14277aa.m29276a(str3)) {
            return null;
        }
        C14336o a = C14338p.m29397a(str);
        if (a != null) {
            Map map = (Map) a.f37294f.get(str2);
            if (map != null) {
                return (C14337a) map.get(str3);
            }
        }
        return null;
    }

    public C14336o(boolean z, String str, boolean z2, int i, EnumSet<C14367z> enumSet, Map<String, Map<String, C14337a>> map, boolean z3, C14320j jVar, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6) {
        this.f37289a = z;
        this.f37290b = str;
        this.f37291c = z2;
        this.f37294f = map;
        this.f37296h = jVar;
        this.f37292d = i;
        this.f37295g = z3;
        this.f37293e = enumSet;
        this.f37297i = str2;
        this.f37298j = str3;
        this.f37299k = z4;
        this.f37300l = z5;
        this.f37302n = jSONArray;
        this.f37301m = str4;
        this.f37303o = z6;
    }
}
