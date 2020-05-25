package com.p683ss.android.ugc.aweme.newfollow.p1998e;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.e.c */
public final class C37860c {

    /* renamed from: a */
    public List<C37859b> f96380a;

    /* renamed from: b */
    public long f96381b;

    /* renamed from: c */
    public long f96382c;

    /* renamed from: d */
    public int f96383d;

    /* renamed from: e */
    public int f96384e = 1;

    /* renamed from: f */
    public String f96385f;

    /* renamed from: g */
    public String f96386g;

    /* renamed from: h */
    public Exception f96387h;

    public C37860c() {
    }

    /* renamed from: a */
    public final C37860c clone() {
        try {
            C37860c cVar = (C37860c) super.clone();
            cVar.f96383d = this.f96383d;
            cVar.f96381b = this.f96381b;
            cVar.f96382c = this.f96382c;
            cVar.f96380a = (ArrayList) ((ArrayList) this.f96380a).clone();
            return cVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public C37860c(String str) {
        this.f96386g = str;
    }
}
