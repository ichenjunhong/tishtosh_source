package com.facebook.internal;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.C14533n;
import com.facebook.internal.C14332n.C14335a;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;

/* renamed from: com.facebook.internal.m */
public final class C14327m {

    /* renamed from: com.facebook.internal.m$a */
    public interface C14330a {
        /* renamed from: a */
        void mo25363a(boolean z);
    }

    /* renamed from: com.facebook.internal.m$b */
    public enum C14331b {
        Unknown(-1),
        Core(0),
        AppEvents(UnReadVideoExperiment.BROWSE_RECORD_LIST),
        CodelessEvents(257),
        RestrictiveDataFiltering(258),
        Instrument(UnReadVideoExperiment.LIKE_USER_LIST),
        CrashReport(513),
        ErrorReport(514),
        Login(65536),
        Share(131072),
        Places(196608);
        

        /* renamed from: a */
        private final int f37279a;

        public final C14331b getParent() {
            if ((this.f37279a & NormalGiftView.ALPHA_255) > 0) {
                return m29387a(this.f37279a & 16776960);
            }
            if ((this.f37279a & 65280) > 0) {
                return m29387a(this.f37279a & 16711680);
            }
            return m29387a(0);
        }

        public final String toString() {
            String str = "unknown";
            switch (this) {
                case RestrictiveDataFiltering:
                    return "RestrictiveDataFiltering";
                case Instrument:
                    return "Instrument";
                case CrashReport:
                    return "CrashReport";
                case ErrorReport:
                    return "ErrorReport";
                case Core:
                    return "CoreKit";
                case AppEvents:
                    return "AppEvents";
                case CodelessEvents:
                    return "CodelessEvents";
                case Login:
                    return "LoginKit";
                case Share:
                    return "ShareKit";
                case Places:
                    return "PlacesKit";
                default:
                    return str;
            }
        }

        /* renamed from: a */
        private static C14331b m29387a(int i) {
            C14331b[] values;
            for (C14331b bVar : values()) {
                if (bVar.f37279a == i) {
                    return bVar;
                }
            }
            return Unknown;
        }

        private C14331b(int i) {
            this.f37279a = i;
        }
    }

    /* renamed from: b */
    private static boolean m29383b(C14331b bVar) {
        StringBuilder sb = new StringBuilder("FBSDKFeature");
        sb.append(bVar.toString());
        return C14332n.m29392a(sb.toString(), C14533n.m29777k(), m29384c(bVar));
    }

    /* renamed from: c */
    private static boolean m29384c(C14331b bVar) {
        switch (bVar) {
            case RestrictiveDataFiltering:
            case Instrument:
            case CrashReport:
            case ErrorReport:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: a */
    public static boolean m29382a(C14331b bVar) {
        if (C14331b.Unknown == bVar) {
            return false;
        }
        if (C14331b.Core == bVar) {
            return true;
        }
        C14331b parent = bVar.getParent();
        if (parent == bVar) {
            return m29383b(bVar);
        }
        if (!m29382a(parent) || !m29383b(bVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m29381a(final C14331b bVar, final C14330a aVar) {
        C14332n.m29391a((C14335a) new C14335a() {
            /* renamed from: a */
            public final void mo26537a() {
                aVar.mo25363a(C14327m.m29382a(bVar));
            }
        });
    }
}
