package dmt.p2652av.video.superentrance;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.superentrance.b */
public final class C53006b {

    /* renamed from: b */
    public static final C53007a f131447b = new C53007a(null);

    /* renamed from: a */
    public final Keva f131448a;

    /* renamed from: dmt.av.video.superentrance.b$a */
    public static final class C53007a {
        private C53007a() {
        }

        public /* synthetic */ C53007a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final boolean mo110560b() {
        return this.f131448a.getBoolean("clicked_plus_entracne", false);
    }

    public C53006b() {
        Keva repo = Keva.getRepo("super_entrance_keva");
        C52711k.m112236a((Object) repo, "Keva.getRepo(REPO_NAME)");
        this.f131448a = repo;
    }

    /* renamed from: a */
    public final Effect mo110558a() {
        String string = this.f131448a.getString("super_entrance_effect", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (Effect) C39618d.f101161b.mo34884a(string, Effect.class);
    }

    /* renamed from: a */
    public final void mo110559a(boolean z) {
        this.f131448a.storeBoolean("clicked_plus_entracne", z);
    }
}
