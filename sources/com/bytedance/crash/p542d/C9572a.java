package com.bytedance.crash.p542d;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p542d.p543a.C9573a;
import com.bytedance.crash.p542d.p544b.C9576b;

/* renamed from: com.bytedance.crash.d.a */
public class C9572a {

    /* renamed from: a */
    private static volatile C9572a f26110a;

    /* renamed from: b */
    private C9576b f26111b;

    /* renamed from: c */
    private SQLiteDatabase f26112c;

    private C9572a() {
    }

    /* renamed from: b */
    private void m18985b() {
        if (this.f26111b == null) {
            mo17368a(C9616k.m19154f());
        }
    }

    /* renamed from: a */
    public static C9572a m18984a() {
        if (f26110a == null) {
            synchronized (C9572a.class) {
                if (f26110a == null) {
                    f26110a = new C9572a();
                }
            }
        }
        return f26110a;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17368a(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.bytedance.crash.d.b r0 = new com.bytedance.crash.d.b     // Catch:{ Throwable -> 0x000f }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x000f }
            android.database.sqlite.SQLiteDatabase r2 = r0.getWritableDatabase()     // Catch:{ Throwable -> 0x000f }
            r1.f26112c = r2     // Catch:{ Throwable -> 0x000f }
            goto L_0x000f
        L_0x000d:
            r2 = move-exception
            goto L_0x0018
        L_0x000f:
            com.bytedance.crash.d.b.b r2 = new com.bytedance.crash.d.b.b     // Catch:{ all -> 0x000d }
            r2.<init>()     // Catch:{ all -> 0x000d }
            r1.f26111b = r2     // Catch:{ all -> 0x000d }
            monitor-exit(r1)
            return
        L_0x0018:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p542d.C9572a.mo17368a(android.content.Context):void");
    }

    /* renamed from: a */
    public final synchronized void mo17369a(C9573a aVar) {
        m18985b();
        if (this.f26111b != null) {
            this.f26111b.mo17376a(this.f26112c, aVar);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo17370a(String str) {
        m18985b();
        if (this.f26111b == null) {
            return false;
        }
        return this.f26111b.mo17378a(this.f26112c, str);
    }
}
