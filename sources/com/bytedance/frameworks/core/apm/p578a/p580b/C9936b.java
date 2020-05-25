package com.bytedance.frameworks.core.apm.p578a.p580b;

import android.content.ContentValues;
import com.bytedance.apm.p485h.C9043e;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.frameworks.core.apm.p578a.C9928a;
import com.bytedance.frameworks.core.apm.p578a.C9928a.C9930a;
import com.bytedance.frameworks.core.apm.p578a.C9928a.C9931b;
import java.util.List;

/* renamed from: com.bytedance.frameworks.core.apm.a.b.b */
public final class C9936b extends C9928a<C9043e> implements C9930a<C9043e> {

    /* renamed from: a */
    private static final String[] f27018a = {"_id", "version_code", "version_name", "manifest_version_code", "update_version_code", "app_version"};

    /* renamed from: c */
    public final boolean mo17883c() {
        return false;
    }

    /* renamed from: d */
    public final String mo17884d() {
        return "local_monitor_version";
    }

    /* renamed from: e */
    public final String[] mo17885e() {
        return f27018a;
    }

    /* renamed from: f */
    public final synchronized C9043e mo17897f() {
        List a = mo17878a(null, null, "_id DESC LIMIT 1", this);
        if (C9190h.m18253a(a)) {
            return null;
        }
        return (C9043e) a.get(0);
    }

    /* renamed from: a */
    public final /* synthetic */ ContentValues mo17876a(Object obj) {
        return m19963b((C9043e) obj);
    }

    /* renamed from: a */
    public final synchronized long mo17901a(C9043e eVar) {
        if (eVar == null) {
            return -1;
        }
        return mo17875a(m19963b(eVar));
    }

    /* renamed from: b */
    private static ContentValues m19963b(C9043e eVar) {
        if (eVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("version_code", eVar.f24689b);
        contentValues.put("version_name", eVar.f24690c);
        contentValues.put("manifest_version_code", eVar.f24691d);
        contentValues.put("update_version_code", eVar.f24692e);
        contentValues.put("app_version", eVar.f24693f);
        return contentValues;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17886a(C9931b bVar) {
        C9043e eVar = new C9043e(bVar.mo17887a("_id"), bVar.mo17889c("version_code"), bVar.mo17889c("version_name"), bVar.mo17889c("manifest_version_code"), bVar.mo17889c("update_version_code"), bVar.mo17889c("app_version"));
        return eVar;
    }

    /* renamed from: b */
    public final synchronized C9043e mo17902b(long j) {
        String str = "_id DESC";
        String str2 = " _id = ?";
        String[] strArr = {String.valueOf(j)};
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" LIMIT 1");
        List a = mo17878a(str2, strArr, sb.toString(), this);
        if (C9190h.m18253a(a)) {
            return null;
        }
        return (C9043e) a.get(0);
    }
}
