package com.bytedance.android.live.broadcast.effect.sticker.p209a;

import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3045b;
import com.bytedance.android.live.broadcast.effect.sticker.C3284c;
import com.bytedance.android.live.broadcast.effect.sticker.C3285d;
import com.bytedance.android.live.broadcast.effect.sticker.C3286e;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48696a;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.a.b */
public final class C3279b extends C3277a {

    /* renamed from: d */
    public final List<C3045b> f9461d = new ArrayList();

    /* renamed from: e */
    public final Map<String, EffectChannelResponse> f9462e = new HashMap();

    /* renamed from: f */
    public final Map<String, C8688c> f9463f = new HashMap();

    /* renamed from: a */
    public final void mo8279a() {
        super.mo8279a();
        this.f9461d.clear();
        this.f9462e.clear();
    }

    /* renamed from: a */
    public final void mo8647a(String str) {
        mo8280a(str, null);
    }

    /* renamed from: b */
    public final C8688c mo8649b(String str) {
        if (this.f9463f.containsKey(str)) {
            return (C8688c) this.f9463f.get(str);
        }
        return null;
    }

    /* renamed from: c */
    private static C3286e m8978c(String str) {
        if (C3037b.f8913a.equals(str)) {
            return new C3284c();
        }
        if (C3037b.f8914b.equals(str)) {
            return new C3285d();
        }
        return new C3286e();
    }

    /* renamed from: a */
    public final void mo8280a(final String str, C3045b bVar) {
        if (this.f9462e.containsKey(str)) {
            for (C3045b bVar2 : this.f9461d) {
                if (bVar2 != null) {
                    bVar2.mo8287a((EffectChannelResponse) this.f9462e.get(str));
                }
            }
            if (bVar != null) {
                bVar.mo8287a((EffectChannelResponse) this.f9462e.get(str));
            }
        } else if (this.f9454a != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            C3286e c = m8978c(str);
            final String str2 = str;
            final AtomicBoolean atomicBoolean2 = atomicBoolean;
            final C3286e eVar = c;
            final C3045b bVar3 = bVar;
            final C32801 r1 = new C48702g() {
                /* renamed from: a */
                public final void mo8637a(C48649d dVar) {
                    if (atomicBoolean2.get()) {
                        eVar.mo8654a(dVar.f122279a, dVar.f122280b);
                    }
                    for (C3045b bVar : C3279b.this.f9461d) {
                        if (bVar != null) {
                            bVar.mo8286a();
                        }
                    }
                    if (bVar3 != null) {
                        bVar3.mo8286a();
                    }
                }

                /* renamed from: a */
                public final /* synthetic */ void mo8638a(Object obj) {
                    EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
                    if (effectChannelResponse != null && (!C9414h.m18630a(effectChannelResponse.getCategoryResponseList()) || !C9414h.m18630a(effectChannelResponse.getAllCategoryEffects()))) {
                        C3279b.this.f9462e.put(str2, effectChannelResponse);
                        if (atomicBoolean2.get()) {
                            eVar.mo8653a();
                        }
                        for (C3045b bVar : C3279b.this.f9461d) {
                            if (bVar != null) {
                                bVar.mo8287a((EffectChannelResponse) C3279b.this.f9462e.get(str2));
                            }
                        }
                        C3395f.m9156f().mo8740a().mo8266a(effectChannelResponse);
                        if (bVar3 != null) {
                            bVar3.mo8287a((EffectChannelResponse) C3279b.this.f9462e.get(str2));
                        }
                    }
                }
            };
            c.mo8657c();
            if (!C3282c.m8988a(C3922z.m9915e())) {
                mo8648a(atomicBoolean, str, r1, false);
            } else if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_USED_EFFECT_CHECK_CACHE.mo9431a()).booleanValue()) {
                this.f9454a.mo96668a(str, (C48696a) new C48696a() {
                    /* renamed from: a */
                    public final void mo8639a(C48649d dVar) {
                        C3279b.this.mo8648a(atomicBoolean, str, r1, true);
                    }

                    /* renamed from: a */
                    public final void mo8640a(boolean z) {
                        C3279b.this.mo8648a(atomicBoolean, str, r1, z);
                    }
                });
            } else {
                mo8648a(atomicBoolean, str, r1, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo8648a(AtomicBoolean atomicBoolean, String str, C48702g gVar, boolean z) {
        atomicBoolean.set(z);
        if (z) {
            this.f9454a.mo96681a(str, false, gVar);
            return;
        }
        atomicBoolean.set(false);
        this.f9454a.mo96669a(str, gVar);
    }
}
