package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.c */
public class C33410c extends C33411d {

    /* renamed from: b */
    protected Map<String, C33392ab> f86617b = new HashMap();

    /* renamed from: c */
    protected Queue<C33392ab> f86618c = new LinkedBlockingQueue();

    /* renamed from: d */
    protected Thread f86619d = new C33391aa("upload_thread", this.f86618c, this.f86617b);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C33393ac mo70778a(C11207p pVar, BaseContent baseContent) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo70756d() {
        super.mo70756d();
    }

    public C33410c() {
        this.f86619d.start();
    }

    /* renamed from: a */
    public final void mo70816a(C11207p pVar) {
        BaseContent content = C33888y.content(pVar);
        if (content != null) {
            mo70817a(mo70778a(pVar, content));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo70817a(C33393ac acVar) {
        if (acVar != null) {
            this.f86618c.offer(acVar);
        }
        synchronized (this.f86618c) {
            this.f86618c.notify();
        }
    }
}
