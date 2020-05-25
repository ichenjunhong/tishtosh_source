package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.media.AudioManager;
import android.support.p043v7.app.AppCompatActivity;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager */
public final class AudioFocusManager implements C0183j {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f113622a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AudioFocusManager.class), "audioManager", "getAudioManager()Landroid/media/AudioManager;"))};

    /* renamed from: c */
    public static final C44896a f113623c = new C44896a(null);

    /* renamed from: b */
    public final AppCompatActivity f113624b;

    /* renamed from: d */
    private final C52668f f113625d;

    /* renamed from: e */
    private final C44983ap f113626e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager$a */
    public static final class C44896a {
        private C44896a() {
        }

        public /* synthetic */ C44896a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static AudioFocusManager m98134a(AppCompatActivity appCompatActivity) {
            C52711k.m112240b(appCompatActivity, "host");
            return new AudioFocusManager(appCompatActivity, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager$b */
    static final class C44897b extends C52712l implements C52670a<AudioManager> {

        /* renamed from: a */
        final /* synthetic */ AudioFocusManager f113627a;

        C44897b(AudioFocusManager audioFocusManager) {
            this.f113627a = audioFocusManager;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object systemService = this.f113627a.f113624b.getApplicationContext().getSystemService("audio");
            if (systemService != null) {
                return (AudioManager) systemService;
            }
            throw new C52857u("null cannot be cast to non-null type android.media.AudioManager");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager$c */
    static final class C44898c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ AudioFocusManager f113628a;

        C44898c(AudioFocusManager audioFocusManager) {
            this.f113628a = audioFocusManager;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            try {
                this.f113628a.mo91041a().requestAudioFocus(null, 3, 1);
            } catch (Throwable unused) {
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager$d */
    static final class C44899d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ AudioFocusManager f113629a;

        C44899d(AudioFocusManager audioFocusManager) {
            this.f113629a = audioFocusManager;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            try {
                this.f113629a.mo91041a().abandonAudioFocus(null);
            } catch (Throwable unused) {
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public static final AudioFocusManager m98132a(AppCompatActivity appCompatActivity) {
        return C44896a.m98134a(appCompatActivity);
    }

    /* renamed from: a */
    public final AudioManager mo91041a() {
        return (AudioManager) this.f113625d.getValue();
    }

    @C0200t(mo345a = C0177a.ON_START)
    public final void onStart() {
        C44983ap apVar = this.f113626e;
        int i = C44983ap.f113923c + 1;
        C44983ap.f113923c = i;
        if (i == 1) {
            C52670a<C52860x> aVar = apVar.f113925a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public final void onStop() {
        C44983ap apVar = this.f113626e;
        int i = C44983ap.f113923c - 1;
        C44983ap.f113923c = i;
        if (i == 0) {
            C52670a<C52860x> aVar = apVar.f113926b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    private AudioFocusManager(AppCompatActivity appCompatActivity) {
        this.f113624b = appCompatActivity;
        this.f113624b.getLifecycle().mo324a(this);
        this.f113625d = C52732g.m112285a(new C44897b(this));
        this.f113626e = new C44983ap(new C44898c(this), new C44899d(this));
    }

    public /* synthetic */ AudioFocusManager(AppCompatActivity appCompatActivity, C52707g gVar) {
        this(appCompatActivity);
    }
}
