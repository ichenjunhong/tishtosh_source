package com.p683ss.android.ugc.aweme.shortvideo.publish;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39566ar;
import com.p683ss.android.ugc.aweme.port.p2082in.C39596bf;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.f */
public final class C44372f {

    /* renamed from: b */
    public static final C44373a f112281b = new C44373a(null);

    /* renamed from: a */
    public C44374b f112282a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.f$a */
    public static final class C44373a {
        private C44373a() {
        }

        /* renamed from: a */
        public static boolean m97168a() {
            C42482c b = C43214dh.m94817a().mo50201b();
            if (b != null && b.isPreventDownload()) {
                C39566ar arVar = C39618d.f101167h;
                C52711k.m112236a((Object) arVar, "AVEnv.LOCATION_SERVICE");
                if (C52830p.m112406a("JP", arVar.mo74214a(), true) && C39618d.f101143G != null) {
                    C39596bf bfVar = C39618d.f101143G;
                    C52711k.m112236a((Object) bfVar, "AVEnv.SHARE_SERVICE");
                    if (bfVar.mo74247a()) {
                        return true;
                    }
                }
            }
            return false;
        }

        public /* synthetic */ C44373a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.f$b */
    public interface C44374b {
        /* renamed from: a */
        void mo90234a();

        /* renamed from: b */
        void mo90235b();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.f$c */
    public static final class C44375c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44372f f112283a;

        public C44375c(C44372f fVar) {
            this.f112283a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C44374b bVar = this.f112283a.f112282a;
            if (bVar != null) {
                bVar.mo90234a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.f$d */
    public static final class C44376d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44372f f112284a;

        public C44376d(C44372f fVar) {
            this.f112284a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C44374b bVar = this.f112284a.f112282a;
            if (bVar != null) {
                bVar.mo90235b();
            }
        }
    }

    /* renamed from: a */
    public static final boolean m97167a() {
        return C44373a.m97168a();
    }

    /* renamed from: a */
    public static final void m97166a(String str, String str2, String str3, String str4, String str5) {
        C26890h.m65011a("download_alert", C23089d.m56640a().mo47829a("group_id", str).mo47829a("author_id", str2).mo47829a("enter_from", str3).mo47829a("download_method", str4).mo47829a("action_type", str5).f61491a);
    }
}
