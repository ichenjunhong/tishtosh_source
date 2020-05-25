package com.bytedance.sdk.account.p871j.p874c;

import android.database.sqlite.SQLiteDatabase;
import com.p683ss.android.account.C18495c;

/* renamed from: com.bytedance.sdk.account.j.c.b */
public final class C13188b {

    /* renamed from: a */
    public SQLiteDatabase f34419a;

    /* renamed from: b */
    private C13187a f34420b;

    /* renamed from: com.bytedance.sdk.account.j.c.b$a */
    static class C13190a {

        /* renamed from: a */
        static final C13188b f34421a = new C13188b();
    }

    /* renamed from: a */
    public static C13188b m26567a() {
        return C13190a.f34421a;
    }

    private C13188b() {
        this.f34420b = new C13187a(C18495c.m44742a().mo38462b());
        this.f34419a = null;
    }

    /* renamed from: b */
    public final boolean mo24800b() {
        try {
            if (this.f34419a != null && this.f34419a.isOpen()) {
                return true;
            }
            if (this.f34420b != null) {
                this.f34419a = this.f34420b.getWritableDatabase();
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }
}
