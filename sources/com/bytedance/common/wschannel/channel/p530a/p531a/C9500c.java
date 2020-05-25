package com.bytedance.common.wschannel.channel.p530a.p531a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.wschannel.channel.p530a.p531a.p532a.C9465c;
import java.util.ArrayList;
import java.util.List;
import okhttp3.C53504ad;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.c */
final class C9500c {

    /* renamed from: a */
    private final List<String> f25880a = new ArrayList();

    /* renamed from: b */
    private C9465c f25881b;

    /* renamed from: c */
    private int f25882c;

    /* renamed from: d */
    private String f25883d;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo17228a() {
        this.f25881b.mo17152c();
        this.f25883d = null;
        this.f25882c = 0;
    }

    /* renamed from: c */
    private synchronized String m18857c() {
        int i = this.f25882c + 1;
        this.f25882c = i;
        if (this.f25880a.size() > i) {
            this.f25883d = (String) this.f25880a.get(i);
            return this.f25883d;
        }
        return "";
    }

    /* renamed from: b */
    public final synchronized String mo17229b() {
        if (C9431p.m18664a(this.f25883d) && this.f25880a.size() > this.f25882c) {
            this.f25883d = (String) this.f25880a.get(this.f25882c);
        }
        return this.f25883d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized Pair<String, Long> mo17227a(C53504ad adVar) {
        String b;
        long a;
        b = mo17229b();
        a = this.f25881b.mo17150a(adVar);
        if (a == -1) {
            this.f25881b.mo17152c();
            b = m18857c();
            if (!TextUtils.isEmpty(b)) {
                a = this.f25881b.mo17151b();
            }
        }
        return new Pair<>(b, Long.valueOf(a));
    }

    C9500c(List<String> list, C9465c cVar) {
        if (list != null) {
            this.f25880a.addAll(list);
        }
        this.f25881b = cVar;
        mo17228a();
    }
}
