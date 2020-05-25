package com.bytedance.apm.p484g;

import com.bytedance.apm.internal.ApmDelegate;
import java.util.LinkedList;

/* renamed from: com.bytedance.apm.g.a */
public final class C9032a {

    /* renamed from: a */
    public final LinkedList<C9038d> f24640a = new LinkedList<>();

    /* renamed from: b */
    private volatile boolean f24641b = false;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16364a() {
        if (!this.f24641b) {
            if (ApmDelegate.m17947a().f24748h) {
                this.f24641b = true;
            }
            ApmDelegate.m17947a().mo16430a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        if (ApmDelegate.m17947a().f24748h) {
                            LinkedList linkedList = new LinkedList();
                            synchronized (C9032a.this.f24640a) {
                                linkedList.addAll(C9032a.this.f24640a);
                                C9032a.this.f24640a.clear();
                            }
                            while (!linkedList.isEmpty()) {
                                C9038d dVar = (C9038d) linkedList.poll();
                                if (dVar != null) {
                                    C9034b.m17915a().mo16368a(dVar.f24655a, dVar.f24656b, null, false);
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16365a(String str, String str2) {
        if (!this.f24641b) {
            synchronized (this.f24640a) {
                if (this.f24640a.size() > 40) {
                    this.f24640a.poll();
                }
                this.f24640a.add(new C9038d(str, str2));
            }
        }
    }
}
