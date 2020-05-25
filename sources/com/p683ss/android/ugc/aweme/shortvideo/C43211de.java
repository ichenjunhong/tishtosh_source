package com.p683ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.google.p1057b.p1065h.p1066a.C17803b;
import com.google.p1057b.p1065h.p1066a.C17821f;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.de */
public class C43211de<V> extends C17803b<V> {

    /* renamed from: a */
    private String f109273a;

    /* renamed from: b */
    private boolean f109274b;

    /* renamed from: c */
    private AtomicInteger f109275c = new AtomicInteger();

    /* renamed from: i */
    private LinkedHashMap<Runnable, Executor> f109276i = new LinkedHashMap<>();

    /* renamed from: d */
    public final int mo87844d() {
        return this.f109275c.get();
    }

    public C43211de() {
    }

    public C43211de(String str) {
        this.f109273a = str;
        this.f109274b = !TextUtils.isEmpty(str);
    }

    /* renamed from: a */
    public final void mo87842a(int i) {
        if (this.f109274b) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f109273a);
            sb.append(" ProgressiveFuture.setProgress:");
            sb.append(i);
            C50203g.m108363d(sb.toString());
        }
        this.f109275c.getAndSet(i);
        C17821f fVar = new C17821f();
        synchronized (this) {
            for (Entry entry : this.f109276i.entrySet()) {
                fVar.mo34646a((Runnable) entry.getKey(), (Executor) entry.getValue());
            }
        }
        fVar.mo34645a();
    }

    /* renamed from: b */
    public final synchronized void mo87843b(Runnable runnable, Executor executor) {
        this.f109276i.put(runnable, executor);
        if (this.f109275c.get() > 0) {
            executor.execute(runnable);
        }
    }
}
