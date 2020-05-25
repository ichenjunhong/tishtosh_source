package com.p683ss.android.ugc.aweme.lancet;

import android.app.Application;
import com.p683ss.android.ugc.aweme.app.host.HostApplication;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1632di.AppComponent;
import com.p683ss.android.ugc.aweme.p1632di.C27595ai;
import com.p683ss.android.ugc.aweme.p1632di.DaggerAppComponent;
import com.p683ss.android.ugc.p2416c.C48513e;
import com.p683ss.android.ugc.p2416c.C48514f;
import com.p683ss.android.ugc.p2416c.C48514f.C48517b;

/* renamed from: com.ss.android.ugc.aweme.lancet.m */
public final class C18992m {
    public static void setupGraph() {
        if (!C18991l.f52295b) {
            if (C18991l.m46167a() && C18991l.m46168b()) {
                C22574a.m55738f().mo46917a("krypton_init", false);
            }
            synchronized (C18991l.class) {
                if (!C18991l.f52295b) {
                    HostApplication hostApplication = C18991l.f52296c;
                    AppComponent a = DaggerAppComponent.builder().mo56054a((Application) hostApplication).mo56055a(new C27595ai(hostApplication)).mo56056a();
                    C48517b bVar = new C48517b();
                    bVar.f121960a = a;
                    bVar.f121961b = new C48513e();
                    C48514f fVar = new C48514f(bVar.f121960a, bVar.f121961b);
                    if (C48514f.f121957a == null) {
                        C48514f.f121957a = fVar;
                    }
                    C48514f fVar2 = C48514f.f121957a;
                    a.inject(C18991l.f52296c);
                    C18991l.f52295b = true;
                }
            }
            if (C18991l.m46167a() && C18991l.m46168b()) {
                C22574a.m55738f().mo46921b("krypton_init", false);
            }
        }
    }
}
