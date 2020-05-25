package com.p683ss.android.ugc.aweme.base.model;

/* renamed from: com.ss.android.ugc.aweme.base.model.a */
public final class C23556a {

    /* renamed from: a */
    public C23557a f62678a;

    /* renamed from: b */
    private Object f62679b;

    /* renamed from: com.ss.android.ugc.aweme.base.model.a$a */
    public enum C23557a {
        RES_ID,
        URL,
        URL_MODEL
    }

    /* renamed from: b */
    public final String mo48743b() {
        return (String) this.f62679b;
    }

    /* renamed from: c */
    public final UrlModel mo48744c() {
        return (UrlModel) this.f62679b;
    }

    /* renamed from: a */
    public final int mo48742a() {
        if (this.f62679b == null) {
            return 0;
        }
        return ((Integer) this.f62679b).intValue();
    }

    /* renamed from: a */
    public static C23556a m57755a(int i) {
        return new C23556a(C23557a.RES_ID, Integer.valueOf(i));
    }

    public C23556a(C23557a aVar, Object obj) {
        this.f62678a = aVar;
        this.f62679b = obj;
    }
}
