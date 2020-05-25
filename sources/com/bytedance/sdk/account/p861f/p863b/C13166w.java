package com.bytedance.sdk.account.p861f.p863b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.C12997b.C12998a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12996h;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13073a.C13074a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13143t;
import com.bytedance.sdk.account.p876k.C13193a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.w */
public final class C13166w extends C13090h<C12996h> {

    /* renamed from: e */
    private C13167a f34365e;

    /* renamed from: com.bytedance.sdk.account.f.b.w$a */
    public static class C13167a extends C13193a {

        /* renamed from: a */
        String f34366a;

        /* renamed from: b */
        public String f34367b;

        /* renamed from: c */
        public boolean f34368c;

        /* renamed from: d */
        public int f34369d;

        /* renamed from: e */
        public int f34370e;

        /* renamed from: f */
        public String f34371f;

        public C13167a(String str, boolean z, int i) {
            this.f34367b = str;
            this.f34368c = z;
            this.f34369d = i;
        }

        public C13167a(String str, boolean z, int i, int i2, String str2) {
            this.f34367b = str;
            this.f34368c = z;
            this.f34369d = i;
            this.f34370e = i2;
            this.f34371f = str2;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
    }

    /* renamed from: a */
    private static Map<String, String> m26522a(C13167a aVar) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("code", Uri.encode(aVar.f34367b));
        hashMap.put("type", String.valueOf(aVar.f34369d));
        String str2 = "need_ticket";
        if (aVar.f34368c) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(str2, str);
        if (aVar.f34370e > 0) {
            hashMap.put("scene", String.valueOf(aVar.f34370e));
        }
        if (!TextUtils.isEmpty(aVar.f34371f)) {
            hashMap.put("shark_ticket", aVar.f34371f);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26264a(this.f34365e, jSONObject, jSONObject2);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        if (jSONObject2 != null) {
            this.f34365e.f34366a = jSONObject2.optString("ticket", "");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C12996h hVar = new C12996h(z, 1015);
        if (z) {
            hVar.f34021h = this.f34365e.f34366a;
        } else {
            hVar.f34000c = this.f34365e.f34442g;
            hVar.f34001d = this.f34365e.f34443h;
        }
        return hVar;
    }

    private C13166w(Context context, C13073a aVar, C13167a aVar2, C13143t tVar) {
        super(context, aVar, tVar);
        this.f34365e = aVar2;
    }

    /* renamed from: a */
    public static C13166w m26521a(Context context, String str, int i, boolean z, C13143t tVar) {
        C13167a aVar = new C13167a(str, z, i);
        return new C13166w(context, new C13074a().mo24752a(C12998a.m26129l()).mo24754a(m26522a(aVar)).mo24757c(), aVar, tVar);
    }

    /* renamed from: a */
    public static C13166w m26520a(Context context, String str, int i, boolean z, int i2, String str2, C13143t tVar) {
        C13167a aVar = new C13167a(str, z, i, i2, str2);
        return new C13166w(context, new C13074a().mo24752a(C12998a.m26129l()).mo24754a(m26522a(aVar)).mo24757c(), aVar, tVar);
    }
}
