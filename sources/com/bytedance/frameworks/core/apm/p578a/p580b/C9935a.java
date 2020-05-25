package com.bytedance.frameworks.core.apm.p578a.p580b;

import android.content.ContentValues;
import com.bytedance.apm.p485h.C9040b;
import com.bytedance.frameworks.core.apm.p578a.C9928a;
import com.bytedance.frameworks.core.apm.p578a.C9928a.C9930a;
import com.bytedance.frameworks.core.apm.p578a.C9928a.C9931b;
import java.util.List;

/* renamed from: com.bytedance.frameworks.core.apm.a.b.a */
public class C9935a extends C9928a<C9040b> implements C9930a<C9040b> {

    /* renamed from: a */
    private static volatile C9935a f27013a = null;

    /* renamed from: b */
    private static String f27014b = "_id <= ? ";

    /* renamed from: c */
    private static final String[] f27015c = {"_id", "front", "type", "timestamp", "accumulation", "version_id", "source", "status", "scene", "process", "main_process", "sid"};

    /* renamed from: d */
    private static String f27016d = "main_process = 1 AND delete_flag = 0";

    /* renamed from: e */
    private static String f27017e = "main_process = 0 AND delete_flag = 0 AND timestamp <= ? ";

    private C9935a() {
    }

    /* renamed from: d */
    public final String mo17884d() {
        return "t_battery";
    }

    /* renamed from: e */
    public final String[] mo17885e() {
        return f27015c;
    }

    /* renamed from: f */
    public static C9935a m19955f() {
        if (f27013a == null) {
            synchronized (C9935a.class) {
                if (f27013a == null) {
                    f27013a = new C9935a();
                }
            }
        }
        return f27013a;
    }

    /* renamed from: b */
    public final synchronized void mo17900b(long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("delete_flag", Integer.valueOf(1));
        mo17873a(contentValues, f27014b, new String[]{String.valueOf(j)});
    }

    /* renamed from: a */
    public final synchronized long mo17898a(C9040b bVar) {
        if (bVar == null) {
            return -1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("front", Integer.valueOf(bVar.f24663b ? 1 : 0));
            contentValues.put("source", bVar.f24669h);
            contentValues.put("type", bVar.f24665d);
            contentValues.put("timestamp", Long.valueOf(bVar.f24664c));
            contentValues.put("accumulation", Long.valueOf(bVar.f24668g));
            contentValues.put("version_id", Long.valueOf(bVar.f24670i));
            contentValues.put("status", Integer.valueOf(bVar.f24666e ? 1 : 0));
            contentValues.put("scene", bVar.f24667f);
            contentValues.put("main_process", Integer.valueOf(bVar.f24672k ? 1 : 0));
            contentValues.put("process", bVar.f24671j);
            contentValues.put("sid", bVar.f24673l);
            return mo17875a(contentValues);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ ContentValues mo17876a(Object obj) {
        C9040b bVar = (C9040b) obj;
        if (bVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("front", Integer.valueOf(bVar.f24663b ? 1 : 0));
        contentValues.put("source", bVar.f24669h);
        contentValues.put("type", bVar.f24665d);
        contentValues.put("timestamp", Long.valueOf(bVar.f24664c));
        contentValues.put("accumulation", Long.valueOf(bVar.f24668g));
        contentValues.put("version_id", Long.valueOf(bVar.f24670i));
        contentValues.put("status", Integer.valueOf(bVar.f24666e ? 1 : 0));
        contentValues.put("scene", bVar.f24667f);
        contentValues.put("main_process", Integer.valueOf(bVar.f24672k ? 1 : 0));
        contentValues.put("process", bVar.f24671j);
        contentValues.put("sid", bVar.f24673l);
        return contentValues;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17886a(C9931b bVar) {
        boolean z;
        boolean z2;
        C9931b bVar2 = bVar;
        long a = bVar2.mo17887a("_id");
        long a2 = bVar2.mo17887a("front");
        String c = bVar2.mo17889c("type");
        long a3 = bVar2.mo17887a("timestamp");
        long a4 = bVar2.mo17887a("accumulation");
        long a5 = bVar2.mo17887a("version_id");
        String c2 = bVar2.mo17889c("source");
        long a6 = bVar2.mo17887a("status");
        String c3 = bVar2.mo17889c("scene");
        int b = bVar2.mo17888b("main_process");
        String c4 = bVar2.mo17889c("process");
        long j = a;
        if (a2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (a6 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str = c4;
        int i = b;
        long j2 = a5;
        C9040b bVar3 = new C9040b(z, a3, c, z2, c3, a4, c2);
        bVar3.f24671j = str;
        bVar3.f24662a = j;
        bVar3.f24670i = j2;
        boolean z3 = true;
        if (i != 1) {
            z3 = false;
        }
        bVar3.f24672k = z3;
        C9040b bVar4 = bVar3;
        bVar4.f24673l = bVar.mo17889c("sid");
        return bVar4;
    }

    /* renamed from: a */
    public final synchronized List<C9040b> mo17899a(boolean z, long j) {
        List<C9040b> list;
        if (z) {
            try {
                list = mo17878a(f27016d, null, "_id", this);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            list = mo17878a(f27017e, new String[]{String.valueOf(j)}, "_id", this);
        }
        return list;
    }
}
