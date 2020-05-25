package com.p683ss.android.ugc.aweme.shortvideo.lyric;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c */
public final class C43961c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f111324a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C43961c.class), "mEffectPlatform", "getMEffectPlatform()Lcom/ss/android/ugc/aweme/effectplatform/IEffectPlatform;"))};

    /* renamed from: b */
    public List<Effect> f111325b = new ArrayList();

    /* renamed from: c */
    public List<Effect> f111326c = new ArrayList();

    /* renamed from: d */
    public final LyricEffectViewModel f111327d;

    /* renamed from: e */
    public final FragmentActivity f111328e;

    /* renamed from: f */
    private final C52668f f111329f = C52732g.m112285a(new C43966e(this));

    /* renamed from: g */
    private Map<String, Effect> f111330g = new LinkedHashMap();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c$a */
    public static final class C43962a implements C48702g {

        /* renamed from: a */
        final /* synthetic */ C43961c f111331a;

        C43962a(C43961c cVar) {
            this.f111331a = cVar;
        }

        /* renamed from: a */
        public final void mo8637a(C48649d dVar) {
            C43961c cVar = this.f111331a;
            C29252f a = cVar.mo89525a();
            if (a != null) {
                a.mo59126a("lyricstyle", (C48702g) new C43964c(cVar, false));
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
            C52711k.m112240b(effectChannelResponse, "response");
            this.f111331a.mo89527a(effectChannelResponse);
            this.f111331a.f111327d.f111300a.setValue(C37721a.m84218a(C37722a.SUCCESS, effectChannelResponse.getAllCategoryEffects()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c$b */
    public static final class C43963b implements C48702g {

        /* renamed from: a */
        final /* synthetic */ C43961c f111332a;

        C43963b(C43961c cVar) {
            this.f111332a = cVar;
        }

        /* renamed from: a */
        public final void mo8637a(C48649d dVar) {
            C43961c cVar = this.f111332a;
            C29252f a = cVar.mo89525a();
            if (a != null) {
                a.mo59126a("lyricstylefont", (C48702g) new C43965d(cVar, false));
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
            C52711k.m112240b(effectChannelResponse, "response");
            this.f111332a.mo89529b(effectChannelResponse);
            this.f111332a.f111327d.f111301b.setValue(C37721a.m84218a(C37722a.SUCCESS, effectChannelResponse.getAllCategoryEffects()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c$c */
    public static final class C43964c implements C48702g {

        /* renamed from: a */
        final /* synthetic */ C43961c f111333a;

        /* renamed from: b */
        final /* synthetic */ boolean f111334b;

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
            C52711k.m112240b(effectChannelResponse, "response");
            this.f111333a.mo89527a(effectChannelResponse);
            this.f111333a.f111327d.f111300a.setValue(C37721a.m84218a(C37722a.SUCCESS, effectChannelResponse.getAllCategoryEffects()));
        }

        /* renamed from: a */
        public final void mo8637a(C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            if (this.f111334b) {
                this.f111333a.mo89528b();
            } else {
                this.f111333a.f111327d.f111300a.setValue(C37721a.m84220a(C37722a.ERROR, dVar.f122281c));
            }
        }

        C43964c(C43961c cVar, boolean z) {
            this.f111333a = cVar;
            this.f111334b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c$d */
    public static final class C43965d implements C48702g {

        /* renamed from: a */
        final /* synthetic */ C43961c f111335a;

        /* renamed from: b */
        final /* synthetic */ boolean f111336b;

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
            C52711k.m112240b(effectChannelResponse, "response");
            this.f111335a.mo89529b(effectChannelResponse);
            this.f111335a.f111327d.f111301b.setValue(C37721a.m84218a(C37722a.SUCCESS, effectChannelResponse.getAllCategoryEffects()));
        }

        /* renamed from: a */
        public final void mo8637a(C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            if (this.f111336b) {
                this.f111335a.mo89528b();
            } else {
                this.f111335a.f111327d.f111301b.setValue(C37721a.m84220a(C37722a.ERROR, dVar.f122281c));
            }
        }

        C43965d(C43961c cVar, boolean z) {
            this.f111335a = cVar;
            this.f111336b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c$e */
    static final class C43966e extends C52712l implements C52670a<C29252f> {

        /* renamed from: a */
        final /* synthetic */ C43961c f111337a;

        C43966e(C43961c cVar) {
            this.f111337a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C29252f a = C29242c.m68869a(this.f111337a.f111328e, null);
            a.mo59122a((C0184k) this.f111337a.f111328e);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c$f */
    public static final class C43967f implements C48702g {

        /* renamed from: a */
        final /* synthetic */ C43961c f111338a;

        /* renamed from: a */
        public final void mo8637a(C48649d dVar) {
        }

        C43967f(C43961c cVar) {
            this.f111338a = cVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
            C52711k.m112240b(effectChannelResponse, "response");
            this.f111338a.mo89527a(effectChannelResponse);
            if (this.f111338a.f111325b.size() != 0) {
                this.f111338a.f111327d.f111303d.setValue(null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c$g */
    public static final class C43968g implements C48702g {

        /* renamed from: a */
        final /* synthetic */ C43961c f111339a;

        /* renamed from: a */
        public final void mo8637a(C48649d dVar) {
        }

        C43968g(C43961c cVar) {
            this.f111339a = cVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
            C52711k.m112240b(effectChannelResponse, "response");
            this.f111339a.mo89529b(effectChannelResponse);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C29252f mo89525a() {
        return (C29252f) this.f111329f.getValue();
    }

    /* renamed from: b */
    public final void mo89528b() {
        mo89525a().mo59143b("lyricstyle", true, (C48702g) new C43962a(this));
        mo89525a().mo59143b("lyricstylefont", true, (C48702g) new C43963b(this));
    }

    /* renamed from: a */
    private static String m96503a(String str) {
        String str2;
        if (str == null) {
            return "";
        }
        try {
            str2 = new JSONObject(str).getString("LinkLyricsStyle");
            C52711k.m112236a((Object) str2, "json.getString(\"LinkLyricsStyle\")");
        } catch (JSONException unused) {
            str2 = "";
        }
        return str2;
    }

    /* renamed from: a */
    public final Effect mo89526a(Effect effect) {
        boolean z;
        C52711k.m112240b(effect, "lyricEffect");
        String a = m96503a(effect.getExtra());
        CharSequence charSequence = a;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return (Effect) this.f111330g.get(a);
        }
        if (this.f111326c.size() > 0) {
            return (Effect) this.f111326c.get(0);
        }
        return null;
    }

    public C43961c(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "context");
        this.f111328e = fragmentActivity;
        C0209x a = C0214z.m440a(this.f111328e).mo359a(LyricEffectViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(co…ectViewModel::class.java]");
        this.f111327d = (LyricEffectViewModel) a;
    }

    /* renamed from: a */
    public final void mo89527a(EffectChannelResponse effectChannelResponse) {
        Object obj;
        if (effectChannelResponse != null) {
            obj = effectChannelResponse.getAllCategoryEffects();
        } else {
            obj = null;
        }
        C52711k.m112236a(obj, "it");
        if (!(!((Collection) obj).isEmpty())) {
            obj = null;
        }
        if (obj != null) {
            this.f111325b = C52575l.m112139e((Collection) obj);
        }
    }

    /* renamed from: b */
    public final void mo89529b(EffectChannelResponse effectChannelResponse) {
        Object obj;
        if (effectChannelResponse != null) {
            obj = effectChannelResponse.getAllCategoryEffects();
        } else {
            obj = null;
        }
        C52711k.m112236a(obj, "it");
        if (!(!((Collection) obj).isEmpty())) {
            obj = null;
        }
        if (obj != null) {
            this.f111326c = C52575l.m112139e((Collection) obj);
            for (Effect effect : (Iterable) obj) {
                Map<String, Effect> map = this.f111330g;
                C52711k.m112236a((Object) effect, "it");
                map.put(m96503a(effect.getExtra()), effect);
            }
            this.f111327d.f111302c.setValue(null);
        }
    }
}
