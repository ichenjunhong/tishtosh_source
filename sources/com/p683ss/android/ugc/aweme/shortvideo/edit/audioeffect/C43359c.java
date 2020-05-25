package com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.app.Application;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c */
public final class C43359c {

    /* renamed from: b */
    public static final C52668f f109624b = C52732g.m112285a(C43361b.f109630a);

    /* renamed from: c */
    public static C29252f f109625c;

    /* renamed from: d */
    public static final C52668f f109626d = C52732g.m112285a(C43362c.f109631a);

    /* renamed from: e */
    public static final C43360a f109627e = new C43360a(null);

    /* renamed from: a */
    public CategoryPageModel f109628a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$a */
    public static final class C43360a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f109629a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C43360a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C43360a.class), "mCache", "getMCache()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioPreprocessCache;"))};

        private C43360a() {
        }

        /* renamed from: a */
        public static C43359c m95089a() {
            return (C43359c) C43359c.f109624b.getValue();
        }

        /* renamed from: c */
        public static C43380h m95091c() {
            return (C43380h) C43359c.f109626d.getValue();
        }

        /* renamed from: b */
        public static C29252f m95090b() {
            if (C43359c.f109625c == null) {
                Application b = C39629l.m88233b();
                C52711k.m112236a((Object) b, "CameraClient.getApplication()");
                C29252f a = C29242c.m68869a(b, null);
                C39629l.m88232a().mo58587r();
                C43359c.f109625c = a;
            }
            return C43359c.f109625c;
        }

        public /* synthetic */ C43360a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$b */
    static final class C43361b extends C52712l implements C52670a<C43359c> {

        /* renamed from: a */
        public static final C43361b f109630a = new C43361b();

        C43361b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C43359c(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$c */
    static final class C43362c extends C52712l implements C52670a<C43380h> {

        /* renamed from: a */
        public static final C43362c f109631a = new C43362c();

        C43362c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C43380h(0, 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$d */
    public interface C43363d {
        /* renamed from: a */
        void mo88295a(Effect effect);

        /* renamed from: a */
        void mo88296a(Effect effect, C48649d dVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$e */
    public interface C43364e {
        /* renamed from: a */
        void mo88297a(int i, String str);

        /* renamed from: a */
        void mo88298a(CategoryPageModel categoryPageModel);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$f */
    public static final class C43365f implements C48705j {

        /* renamed from: a */
        final /* synthetic */ C43363d f109632a;

        /* renamed from: a */
        public final void mo8643a(Effect effect) {
        }

        C43365f(C43363d dVar) {
            this.f109632a = dVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
            Effect effect = (Effect) obj;
            C43363d dVar = this.f109632a;
            if (dVar != null) {
                dVar.mo88295a(effect);
            }
        }

        /* renamed from: a */
        public final void mo8644a(Effect effect, C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            C43363d dVar2 = this.f109632a;
            if (dVar2 != null) {
                dVar2.mo88296a(effect, dVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$g */
    public static final class C43366g implements C48701f {

        /* renamed from: a */
        final /* synthetic */ C43359c f109633a;

        /* renamed from: b */
        final /* synthetic */ C43364e f109634b;

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
            CategoryPageModel categoryPageModel = (CategoryPageModel) obj;
            this.f109633a.f109628a = categoryPageModel;
            C43364e eVar = this.f109634b;
            if (eVar != null) {
                eVar.mo88298a(categoryPageModel);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
            if (r3 == null) goto L_0x0010;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo59186a(com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d r3) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$e r0 = r2.f109634b
                if (r0 == 0) goto L_0x0016
                if (r3 == 0) goto L_0x0009
                int r1 = r3.f122279a
                goto L_0x000a
            L_0x0009:
                r1 = 0
            L_0x000a:
                if (r3 == 0) goto L_0x0010
                java.lang.String r3 = r3.f122280b
                if (r3 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r3 = ""
            L_0x0012:
                r0.mo88297a(r1, r3)
                return
            L_0x0016:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43359c.C43366g.mo59186a(com.ss.android.ugc.effectmanager.common.g.d):void");
        }

        C43366g(C43359c cVar, C43364e eVar) {
            this.f109633a = cVar;
            this.f109634b = eVar;
        }
    }

    private C43359c() {
    }

    /* renamed from: a */
    public static final C43359c m95084a() {
        return C43360a.m95089a();
    }

    public /* synthetic */ C43359c(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public static byte[] m95087a(String str) {
        if (str == null) {
            return null;
        }
        C43380h c = C43360a.m95091c();
        if (str == null) {
            return null;
        }
        return (byte[]) c.f109666a.mo2501a(str);
    }

    /* renamed from: a */
    public static boolean m95086a(Effect effect) {
        boolean z;
        if (C43347a.m95069a(effect)) {
            return true;
        }
        if (effect != null) {
            C29252f b = C43360a.m95090b();
            if (b != null) {
                z = b.mo59142a(effect);
            } else {
                z = false;
            }
            if (z || effect.getEffectType() != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo88294a(C43364e eVar) {
        List list;
        if (this.f109628a != null) {
            CategoryPageModel categoryPageModel = this.f109628a;
            if (categoryPageModel != null) {
                list = categoryPageModel.getUrl_prefix();
            } else {
                list = null;
            }
            if (!C9376b.m18558a((Collection<T>) list)) {
                eVar.mo88298a(this.f109628a);
                return;
            }
        }
        C29252f b = C43360a.m95090b();
        if (b != null) {
            b.mo59134a("voicechanger", "all", false, 0, 0, 0, "", new C43366g(this, eVar));
        }
    }

    /* renamed from: a */
    public static void m95085a(String str, byte[] bArr) {
        C43380h c = C43360a.m95091c();
        if (str != null && bArr != null) {
            c.f109666a.mo2502a(str, bArr);
        }
    }
}
