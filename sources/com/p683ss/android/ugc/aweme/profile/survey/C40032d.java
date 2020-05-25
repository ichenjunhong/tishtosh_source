package com.p683ss.android.ugc.aweme.profile.survey;

import com.p683ss.android.ugc.aweme.p1465bs.C24047a;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.survey.d */
public class C40032d {

    /* renamed from: a */
    static final boolean f101974a = false;

    /* renamed from: c */
    private static volatile C40032d f101975c;

    /* renamed from: b */
    public C40033a f101976b;

    /* renamed from: com.ss.android.ugc.aweme.profile.survey.d$a */
    public interface C40033a {
        /* renamed from: a */
        void mo82063a(C24047a aVar);

        /* renamed from: a */
        void mo82064a(Exception exc);
    }

    private C40032d() {
        if (f101975c != null) {
            throw new RuntimeException("Illegal access.");
        }
    }

    /* renamed from: a */
    public static C40032d m89003a() {
        if (f101975c == null) {
            synchronized (C40032d.class) {
                if (f101975c == null) {
                    f101975c = new C40032d();
                }
            }
        }
        return f101975c;
    }

    /* renamed from: a */
    public static void m89004a(C40030b bVar) {
        C0013i a = SurveyApi.m88998a(bVar);
        if (a != null) {
            a.mo19a(C40035f.f101978a);
        }
    }
}
