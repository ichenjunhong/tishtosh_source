package com.bytedance.frameworks.core.apm.p578a.p579a;

import android.content.ContentValues;
import com.bytedance.apm.p485h.C9042d;
import com.bytedance.frameworks.core.apm.p578a.C9928a.C9931b;

/* renamed from: com.bytedance.frameworks.core.apm.a.a.c */
public final class C9934c extends C9932a<C9042d> {
    /* renamed from: d */
    public final String mo17884d() {
        return "local_monitor_log";
    }

    /* renamed from: e */
    public final String[] mo17885e() {
        return new String[]{"_id", "type", "version_id", "data", "delete_flag"};
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17886a(C9931b bVar) {
        C9042d dVar = new C9042d(bVar.mo17887a("_id"), bVar.mo17889c("type"), bVar.mo17887a("version_id"), bVar.mo17889c("data"));
        return dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ ContentValues mo17876a(Object obj) {
        C9042d dVar = (C9042d) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", dVar.f24682g);
        contentValues.put("type2", dVar.f24683h);
        contentValues.put("timestamp", Long.valueOf(dVar.f24686k));
        contentValues.put("version_id", Long.valueOf(dVar.f24685j));
        contentValues.put("data", dVar.f24684i.toString());
        contentValues.put("is_sampled", Integer.valueOf(dVar.f24687l ? 1 : 0));
        return contentValues;
    }
}
