package com.p683ss.android.ugc.aweme.p1462bq;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1462bq.C23957c.C23958a;

/* renamed from: com.ss.android.ugc.aweme.bq.f */
public final class C23965f {

    /* renamed from: a */
    public final int f63634a;

    /* renamed from: b */
    public final Aweme f63635b;

    /* renamed from: c */
    String f63636c;

    /* renamed from: d */
    public final C23958a f63637d;

    /* renamed from: e */
    public volatile int f63638e;

    /* renamed from: a */
    public final void mo49552a() {
        switch (this.f63638e) {
            case 0:
            case 1:
                mo49553a(2);
                break;
            case 3:
                mo49553a(6);
                return;
            case 4:
                mo49553a(5);
                return;
            case 5:
                return;
        }
    }

    /* renamed from: a */
    public final void mo49553a(int i) {
        if (i > this.f63638e && this.f63638e != 2 && this.f63638e != 5 && this.f63638e != 6) {
            this.f63638e = i;
        }
    }

    public C23965f(Aweme aweme, int i, String str, C23958a aVar) {
        this.f63635b = aweme;
        this.f63634a = i;
        this.f63637d = aVar;
        this.f63636c = str;
    }
}
