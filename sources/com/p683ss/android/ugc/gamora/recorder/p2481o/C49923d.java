package com.p683ss.android.ugc.gamora.recorder.p2481o;

import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.o.d */
public final class C49923d {

    /* renamed from: c */
    public static final C49924a f125094c = new C49924a(null);

    /* renamed from: a */
    public String f125095a;

    /* renamed from: b */
    public Effect f125096b;

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.d$a */
    public static final class C49924a {
        private C49924a() {
        }

        public /* synthetic */ C49924a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final UrlModel mo97728a() {
        Effect effect = this.f125096b;
        if (effect != null) {
            return effect.getIconUrl();
        }
        return null;
    }

    public C49923d(Effect effect) {
        C52711k.m112240b(effect, "effect");
        this.f125096b = effect;
    }

    public C49923d(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        this.f125095a = str;
    }
}
