package dmt.p2652av.video.p2654b;

import android.app.Application;
import android.content.Context;
import com.bytedance.p560f.C9751a;
import com.bytedance.p560f.C9754d;
import com.p683ss.android.ttve.nativePort.C20129b;
import com.p683ss.android.ttve.nativePort.C20129b.C20131b;
import com.p683ss.android.ttve.nativePort.C20129b.C20133d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.effectmanager.C48580c;
import com.p683ss.android.ugc.effectmanager.C48691e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: dmt.av.video.b.f */
public final class C52938f {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f131307a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C52938f.class), "teDecompressLibraryLoader", "getTeDecompressLibraryLoader()Lcom/ss/android/ttve/nativePort/TENativeLibsLoader$ILibraryLoader;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C52938f.class), "effectDecompressLibraryLoader", "getEffectDecompressLibraryLoader()Lcom/ss/android/ugc/effectmanager/DownloadableModelSupportLibraryLoader;"))};

    /* renamed from: b */
    public static final C52938f f131308b = new C52938f();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f131309c = C39629l.m88232a().mo58592w().mo74200b();

    /* renamed from: d */
    private static boolean f131310d;

    /* renamed from: e */
    private static final C52668f f131311e = C52732g.m112285a(C52941b.f131315a);

    /* renamed from: f */
    private static final C52668f f131312f = C52732g.m112285a(C52939a.f131313a);

    /* renamed from: dmt.av.video.b.f$a */
    static final class C52939a extends C52712l implements C52670a<C48691e> {

        /* renamed from: a */
        public static final C52939a f131313a = new C52939a();

        C52939a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (C52938f.f131309c) {
                return new C52935c();
            }
            return C529401.f131314a;
        }
    }

    /* renamed from: dmt.av.video.b.f$b */
    static final class C52941b extends C52712l implements C52670a<C20133d> {

        /* renamed from: a */
        public static final C52941b f131315a = new C52941b();

        C52941b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (C39618d.f101152P.mo83103a(C40790a.LoadLibraryFromExternal)) {
                Application application = C39618d.f101160a;
                C52711k.m112236a((Object) application, "AVEnv.application");
                Context context = application;
                C20133d bVar = new C20131b();
                C52711k.m112240b(context, "context");
                C52711k.m112240b(bVar, "delegate");
                return new C9751a(bVar, new C9754d(context));
            } else if (C52938f.f131309c) {
                C45407ay.m98968a("So decompress: TELibraryLoaderManager, using decompress library");
                return new C52937e();
            } else {
                C45407ay.m98968a("So decompress: TELibraryLoaderManager, using normal library");
                return new C52936d();
            }
        }
    }

    private C52938f() {
    }

    /* renamed from: c */
    private final C20133d m112629c() {
        return (C20133d) f131311e.getValue();
    }

    /* renamed from: d */
    private final C48691e m112630d() {
        return (C48691e) f131312f.getValue();
    }

    /* renamed from: a */
    public final void mo110535a() {
        C20129b.m49682a(m112629c());
        C48580c.m105106a(m112630d());
    }

    /* renamed from: b */
    public final void mo110536b() {
        if (!f131310d) {
            C20129b.m49682a(m112629c());
            C48580c.m105106a(m112630d());
            f131310d = true;
        }
    }
}
