package com.p683ss.android.ugc.aweme.protection.antiaddiction;

import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.p2095b.C40842a;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.p2095b.C40845b;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.p2095b.C40846c;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.protection.antiaddiction.d */
public final class C40850d implements C9382a, C27979p {

    /* renamed from: b */
    private static Integer f104008b;

    /* renamed from: c */
    private static Integer f104009c;

    /* renamed from: a */
    public ArrayList<C40852e> f104010a = new ArrayList<>();

    /* renamed from: d */
    private C17429o f104011d = C17429o.m42673a();

    /* renamed from: e */
    private C9381g f104012e = new C9381g(this);

    /* renamed from: f */
    private boolean f104013f;

    /* renamed from: d */
    public static int m90340d() {
        if (f104009c == null) {
            f104009c = Integer.valueOf(60000);
        }
        return f104009c.intValue();
    }

    /* renamed from: b */
    public final void mo47072b() {
        C9381g gVar = this.f104012e;
        if (f104008b == null) {
            f104008b = Integer.valueOf(VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT);
        }
        gVar.sendEmptyMessageDelayed(100004, (long) f104008b.intValue());
    }

    /* renamed from: c */
    public final void mo47074c() {
        if (!this.f104013f) {
            this.f104013f = true;
            m90338a(this.f104011d.mo33754a(TimeUnit.MILLISECONDS));
        }
    }

    public C40850d() {
        this.f104010a.clear();
        m90339a((C40852e) new C40842a());
        m90339a((C40852e) new C40845b());
        m90339a((C40852e) new C40846c());
    }

    /* renamed from: a */
    public final void mo47070a() {
        this.f104012e.removeMessages(100004);
        if (!this.f104012e.hasMessages(100003)) {
            this.f104012e.sendEmptyMessageDelayed(100003, (long) m90340d());
        }
        if (!this.f104011d.f48964a) {
            this.f104011d.mo33755c();
        }
    }

    /* renamed from: a */
    private void m90338a(final long j) {
        C18842a.m45932a(new Runnable() {
            public final void run() {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = C40850d.this.f104010a.iterator();
                while (it.hasNext()) {
                    ((C40852e) it.next()).mo83168a(currentTimeMillis, j);
                }
            }
        });
    }

    /* renamed from: a */
    private void m90339a(C40852e eVar) {
        if (!this.f104010a.contains(eVar)) {
            this.f104010a.add(eVar);
        }
    }

    public final void handleMsg(Message message) {
        switch (message.what) {
            case 100003:
                this.f104012e.sendEmptyMessageDelayed(100003, (long) m90340d());
                m90338a(this.f104011d.mo33754a(TimeUnit.MILLISECONDS));
                return;
            case 100004:
                this.f104012e.removeMessages(100003);
                this.f104011d.mo33757e();
                C40849c.m90331a().f104003b = "";
                C40849c.m90331a().f104002a = false;
                Iterator it = this.f104010a.iterator();
                while (it.hasNext()) {
                    C40852e eVar = (C40852e) it.next();
                    if (eVar instanceof C40845b) {
                        ((C40845b) eVar).f103998a.f103990c = 0;
                        return;
                    }
                }
                break;
        }
    }
}
