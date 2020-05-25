package com.tencent.wcdb.database;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.tencent.wcdb.database.g */
public final class C51764g {

    /* renamed from: a */
    public final String f129117a;

    /* renamed from: b */
    public final String f129118b;

    /* renamed from: c */
    public String f129119c;

    /* renamed from: d */
    public int f129120d;

    /* renamed from: e */
    public int f129121e;

    /* renamed from: f */
    public Locale f129122f;

    /* renamed from: g */
    public boolean f129123g;

    /* renamed from: h */
    public boolean f129124h;

    /* renamed from: i */
    public int f129125i;

    /* renamed from: j */
    public boolean f129126j;

    /* renamed from: k */
    public boolean f129127k;

    /* renamed from: l */
    public final ArrayList<SQLiteCustomFunction> f129128l = new ArrayList<>();

    /* renamed from: a */
    public final boolean mo107219a() {
        return this.f129117a.equalsIgnoreCase(":memory:");
    }

    public C51764g(C51764g gVar) {
        if (gVar != null) {
            this.f129117a = gVar.f129117a;
            this.f129118b = gVar.f129118b;
            mo107218a(gVar);
            return;
        }
        throw new IllegalArgumentException("other must not be null.");
    }

    /* renamed from: a */
    public final void mo107218a(C51764g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("other must not be null.");
        } else if (this.f129117a.equals(gVar.f129117a)) {
            this.f129120d = gVar.f129120d;
            this.f129121e = gVar.f129121e;
            this.f129122f = gVar.f129122f;
            this.f129123g = gVar.f129123g;
            this.f129124h = gVar.f129124h;
            this.f129126j = gVar.f129126j;
            this.f129127k = gVar.f129127k;
            this.f129125i = gVar.f129125i;
            this.f129119c = gVar.f129119c;
            this.f129128l.clear();
            this.f129128l.addAll(gVar.f129128l);
        } else {
            throw new IllegalArgumentException("other configuration must refer to the same database.");
        }
    }

    public C51764g(String str, int i) {
        String str2;
        if (str != null) {
            this.f129117a = str;
            this.f129118b = str;
            this.f129120d = i;
            this.f129125i = 2;
            this.f129121e = 25;
            this.f129122f = Locale.getDefault();
            if ((i & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
                str2 = "vfslog";
            } else {
                str2 = null;
            }
            this.f129119c = str2;
            return;
        }
        throw new IllegalArgumentException("path must not be null.");
    }
}
