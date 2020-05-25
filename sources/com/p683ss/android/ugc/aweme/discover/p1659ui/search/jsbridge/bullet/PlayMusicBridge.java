package com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.bullet;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10276j;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10327c;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.p683ss.android.ugc.aweme.utils.GsonProvider;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge */
public final class PlayMusicBridge extends BaseBridgeMethod {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f75284b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PlayMusicBridge.class), "mContextProvider", "getMContextProvider()Lcom/bytedance/ies/bullet/core/model/context/IContextProvider;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PlayMusicBridge.class), "mCurWebInstanceProvider", "getMCurWebInstanceProvider()Lcom/bytedance/ies/bullet/core/model/context/IContextProvider;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PlayMusicBridge.class), "mPlayHelper", "getMPlayHelper()Lcom/ss/android/ugc/aweme/discover/helper/MusicPlayHelper;"))};

    /* renamed from: c */
    public static final C28685a f75285c = new C28685a(null);

    /* renamed from: d */
    private final C52668f f75286d;

    /* renamed from: e */
    private final C52668f f75287e;

    /* renamed from: f */
    private final C52668f f75288f = C52732g.m112285a(new C28692f(this));

    /* renamed from: g */
    private final String f75289g = "playMusic";

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$a */
    public static final class C28685a {
        private C28685a() {
        }

        public /* synthetic */ C28685a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$b */
    public final class C28686b implements C0199s<C52847n<? extends Integer, ? extends Long>> {

        /* renamed from: a */
        public final JSONObject f75290a;

        /* renamed from: b */
        final /* synthetic */ PlayMusicBridge f75291b;

        /* renamed from: c */
        private final Music f75292c;

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$b$a */
        public static final class C28687a implements C10276j {

            /* renamed from: a */
            final /* synthetic */ C28686b f75293a;

            /* renamed from: b */
            private final String f75294b = "playMusicStart";

            /* renamed from: c */
            private final Object f75295c;

            /* renamed from: a */
            public final String mo18285a() {
                return this.f75294b;
            }

            /* renamed from: b */
            public final Object mo18286b() {
                return this.f75295c;
            }

            C28687a(C28686b bVar) {
                this.f75293a = bVar;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("music_extra", this.f75293a.f75290a);
                this.f75295c = jSONObject;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$b$b */
        public static final class C28688b implements C10276j {

            /* renamed from: a */
            final /* synthetic */ C28686b f75296a;

            /* renamed from: b */
            private final String f75297b = "playMusicEnd";

            /* renamed from: c */
            private final Object f75298c;

            /* renamed from: a */
            public final String mo18285a() {
                return this.f75297b;
            }

            /* renamed from: b */
            public final Object mo18286b() {
                return this.f75298c;
            }

            C28688b(C28686b bVar) {
                this.f75296a = bVar;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("music_extra", this.f75296a.f75290a);
                this.f75298c = jSONObject;
            }
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52847n nVar = (C52847n) obj;
            if (nVar != null) {
                if (((Number) nVar.getSecond()).longValue() != this.f75292c.getId()) {
                    C10327c k = this.f75291b.mo58347k();
                    if (k != null) {
                        C10290i iVar = (C10290i) k.mo18392b();
                        if (iVar != null) {
                            iVar.onEvent(new C28688b(this));
                        }
                    }
                    MusicPlayHelper l = this.f75291b.mo58348l();
                    if (l != null) {
                        l.mo56587a((C0199s<C52847n<Integer, Long>>) this);
                    }
                } else if (((Number) nVar.getFirst()).intValue() == 2) {
                    C10327c k2 = this.f75291b.mo58347k();
                    if (k2 != null) {
                        C10290i iVar2 = (C10290i) k2.mo18392b();
                        if (iVar2 != null) {
                            iVar2.onEvent(new C28687a(this));
                        }
                    }
                }
            }
        }

        public C28686b(PlayMusicBridge playMusicBridge, Music music, JSONObject jSONObject) {
            C52711k.m112240b(music, "mMusic");
            C52711k.m112240b(jSONObject, "mMusicExtra");
            this.f75291b = playMusicBridge;
            this.f75292c = music;
            this.f75290a = jSONObject;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$c */
    public static final class C28689c extends C17956a<Music> {
        C28689c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$d */
    static final class C28690d extends C52712l implements C52670a<C10327c<? extends Context>> {

        /* renamed from: a */
        final /* synthetic */ C10326b f75299a;

        C28690d(C10326b bVar) {
            this.f75299a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f75299a.mo18399b(Context.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$e */
    static final class C28691e extends C52712l implements C52670a<C10327c<? extends C10290i>> {

        /* renamed from: a */
        final /* synthetic */ C10326b f75300a;

        C28691e(C10326b bVar) {
            this.f75300a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f75300a.mo18399b(C10290i.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$f */
    static final class C28692f extends C52712l implements C52670a<MusicPlayHelper> {

        /* renamed from: a */
        final /* synthetic */ PlayMusicBridge f75301a;

        C28692f(PlayMusicBridge playMusicBridge) {
            this.f75301a = playMusicBridge;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context;
            C10327c j = this.f75301a.mo58346j();
            if (j != null) {
                context = (Context) j.mo18392b();
            } else {
                context = null;
            }
            if (!(context instanceof FragmentActivity)) {
                context = null;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            if (fragmentActivity != null) {
                return (MusicPlayHelper) C0214z.m440a(fragmentActivity).mo359a(MusicPlayHelper.class);
            }
            return null;
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f75289g;
    }

    /* renamed from: j */
    public final C10327c<Context> mo58346j() {
        return (C10327c) this.f75286d.getValue();
    }

    /* renamed from: k */
    public final C10327c<C10290i> mo58347k() {
        return (C10327c) this.f75287e.getValue();
    }

    /* renamed from: l */
    public final MusicPlayHelper mo58348l() {
        return (MusicPlayHelper) this.f75288f.getValue();
    }

    public PlayMusicBridge(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
        this.f75286d = C52732g.m112285a(new C28690d(bVar));
        this.f75287e = C52732g.m112285a(new C28691e(bVar));
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        Context context;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        try {
            String optString = jSONObject.optString("music");
            JSONObject optJSONObject = jSONObject.optJSONObject("music_extra");
            if (!(optString == null || optJSONObject == null)) {
                Type type = new C28689c().f49843c;
                GsonProvider a = C47759cc.m103382a();
                C52711k.m112236a((Object) a, "GsonProvider.get()");
                Object a2 = a.getGson().mo34885a(optString, type);
                C52711k.m112236a(a2, "GsonProvider.get().gson.fromJson(result, type)");
                Music music = (Music) a2;
                music.setId(optJSONObject.optLong("id"));
                MusicPlayHelper l = mo58348l();
                if (l != null) {
                    if (!l.mo56589a(music.getId())) {
                        if (!l.mo56590b(music.getId())) {
                            C10327c j = mo58346j();
                            if (j != null) {
                                context = (Context) j.mo18392b();
                            } else {
                                context = null;
                            }
                            if (!(context instanceof FragmentActivity)) {
                                context = null;
                            }
                            FragmentActivity fragmentActivity = (FragmentActivity) context;
                            if (fragmentActivity != null) {
                                l.mo56586a((C0184k) fragmentActivity, (C0199s<C52847n<Integer, Long>>) new C28686b<C52847n<Integer, Long>>(this, music, optJSONObject));
                                l.mo56588a(fragmentActivity, music, "", 0, true);
                            }
                        }
                    }
                    l.mo56585a();
                }
            }
            aVar.mo49911a((Object) new JSONArray());
        } catch (Exception e) {
            C28668d.m67931a(e, "ShowEasterEggMethod");
            aVar.mo49910a(0, e.getMessage());
        }
    }
}
