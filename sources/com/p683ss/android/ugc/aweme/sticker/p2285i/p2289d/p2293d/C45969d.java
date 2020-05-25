package com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2293d;

import com.p683ss.android.ugc.aweme.effectplatform.C29272u;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45873a;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45911i;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45913k;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48699d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.d */
public abstract class C45969d implements C45872c {

    /* renamed from: b */
    public ConcurrentHashMap<String, C45873a> f115997b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public final C45913k f115998c;

    /* renamed from: d */
    public final C45911i f115999d;

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.d$a */
    public static final class C45970a implements C48699d {

        /* renamed from: a */
        final /* synthetic */ C45969d f116000a;

        /* renamed from: b */
        final /* synthetic */ StickerWrapper f116001b;

        /* renamed from: c */
        final /* synthetic */ C45874b f116002c;

        /* renamed from: a */
        public final void mo8643a(Effect effect) {
            C52711k.m112240b(effect, "effect");
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            Effect effect = (Effect) obj;
            C52711k.m112240b(effect, "effect");
            if (!this.f116000a.mo92566a(effect)) {
                StringBuilder sb = new StringBuilder("Effect is not ready ");
                sb.append(effect.getName());
                C50203g.m108361b(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder("Effect is ready");
                sb2.append(effect.getName());
                C50203g.m108358a(sb2.toString());
            }
            this.f116001b.f115781c = 1;
            this.f116002c.mo92251a(effect);
            ConcurrentHashMap<String, C45873a> concurrentHashMap = this.f116000a.f115997b;
            Effect effect2 = this.f116001b.f115779a;
            C52711k.m112236a((Object) effect2, "stickerWrapper.effect");
            concurrentHashMap.remove(effect2.getEffectId());
        }

        /* renamed from: a */
        public final void mo8644a(Effect effect, C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            this.f116001b.f115781c = 3;
            this.f116002c.mo92253a(effect, dVar);
            ConcurrentHashMap<String, C45873a> concurrentHashMap = this.f116000a.f115997b;
            Effect effect2 = this.f116001b.f115779a;
            C52711k.m112236a((Object) effect2, "stickerWrapper.effect");
            concurrentHashMap.remove(effect2.getEffectId());
        }

        C45970a(C45969d dVar, StickerWrapper stickerWrapper, C45874b bVar) {
            this.f116000a = dVar;
            this.f116001b = stickerWrapper;
            this.f116002c = bVar;
        }

        /* renamed from: a */
        public final void mo59191a(Effect effect, int i, long j) {
            C52711k.m112240b(effect, "effect");
            this.f116001b.f115781c = 5;
            this.f116002c.mo92252a(effect, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.d$b */
    public static final class C45971b implements C48699d {

        /* renamed from: a */
        final /* synthetic */ C45969d f116003a;

        /* renamed from: b */
        final /* synthetic */ StickerWrapper f116004b;

        /* renamed from: a */
        public final void mo8643a(Effect effect) {
            C52711k.m112240b(effect, "effect");
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            Effect effect = (Effect) obj;
            C52711k.m112240b(effect, "effect");
            this.f116004b.f115781c = 1;
            ConcurrentHashMap<String, C45873a> concurrentHashMap = this.f116003a.f115997b;
            Effect effect2 = this.f116004b.f115779a;
            C52711k.m112236a((Object) effect2, "stickerWrapper.effect");
            C45873a aVar = (C45873a) concurrentHashMap.get(effect2.getEffectId());
            if (aVar != null) {
                aVar.mo92472a(effect);
            }
            ConcurrentHashMap<String, C45873a> concurrentHashMap2 = this.f116003a.f115997b;
            Effect effect3 = this.f116004b.f115779a;
            C52711k.m112236a((Object) effect3, "stickerWrapper.effect");
            concurrentHashMap2.remove(effect3.getEffectId());
        }

        C45971b(C45969d dVar, StickerWrapper stickerWrapper) {
            this.f116003a = dVar;
            this.f116004b = stickerWrapper;
        }

        /* renamed from: a */
        public final void mo8644a(Effect effect, C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            this.f116004b.f115781c = 3;
            ConcurrentHashMap<String, C45873a> concurrentHashMap = this.f116003a.f115997b;
            Effect effect2 = this.f116004b.f115779a;
            C52711k.m112236a((Object) effect2, "stickerWrapper.effect");
            C45873a aVar = (C45873a) concurrentHashMap.get(effect2.getEffectId());
            if (aVar != null) {
                if (effect == null) {
                    C52711k.m112234a();
                }
                aVar.mo92474a(effect, dVar);
            }
            ConcurrentHashMap<String, C45873a> concurrentHashMap2 = this.f116003a.f115997b;
            Effect effect3 = this.f116004b.f115779a;
            C52711k.m112236a((Object) effect3, "stickerWrapper.effect");
            concurrentHashMap2.remove(effect3.getEffectId());
        }

        /* renamed from: a */
        public final void mo59191a(Effect effect, int i, long j) {
            C52711k.m112240b(effect, "effect");
            ConcurrentHashMap<String, C45873a> concurrentHashMap = this.f116003a.f115997b;
            Effect effect2 = this.f116004b.f115779a;
            C52711k.m112236a((Object) effect2, "stickerWrapper.effect");
            C45873a aVar = (C45873a) concurrentHashMap.get(effect2.getEffectId());
            if (aVar != null) {
                aVar.mo92473a(effect, i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo92566a(Effect effect) {
        return this.f115999d.mo92511a(effect);
    }

    /* renamed from: a */
    public final void mo92468a(StickerWrapper stickerWrapper) {
        if (stickerWrapper != null) {
            ConcurrentHashMap<String, C45873a> concurrentHashMap = this.f115997b;
            Effect effect = stickerWrapper.f115779a;
            C52711k.m112236a((Object) effect, "stickerWrapper.effect");
            if (!concurrentHashMap.containsKey(effect.getEffectId())) {
                Map map = this.f115997b;
                Effect effect2 = stickerWrapper.f115779a;
                C52711k.m112236a((Object) effect2, "stickerWrapper.effect");
                String effectId = effect2.getEffectId();
                C52711k.m112236a((Object) effectId, "stickerWrapper.effect.effectId");
                map.put(effectId, new C45873a());
                if (mo92566a(stickerWrapper.f115779a)) {
                    stickerWrapper.f115781c = 1;
                    ConcurrentHashMap<String, C45873a> concurrentHashMap2 = this.f115997b;
                    Effect effect3 = stickerWrapper.f115779a;
                    C52711k.m112236a((Object) effect3, "stickerWrapper.effect");
                    C45873a aVar = (C45873a) concurrentHashMap2.get(effect3.getEffectId());
                    if (aVar != null) {
                        aVar.mo92472a(stickerWrapper.f115779a);
                    }
                    ConcurrentHashMap<String, C45873a> concurrentHashMap3 = this.f115997b;
                    Effect effect4 = stickerWrapper.f115779a;
                    C52711k.m112236a((Object) effect4, "stickerWrapper.effect");
                    concurrentHashMap3.remove(effect4.getEffectId());
                    return;
                }
                C29272u a = C29272u.m68985a((C48705j) new C45971b(this, stickerWrapper), "effect");
                C52711k.m112236a((Object) a, "MonitoredFetchEffectList…CE_RESOURCE_TYPE_STICKER)");
                mo92565a(stickerWrapper, (C48699d) a);
            }
        }
    }

    public C45969d(C45913k kVar, C45911i iVar) {
        C52711k.m112240b(kVar, "innerFetcher");
        C52711k.m112240b(iVar, "converter");
        this.f115998c = kVar;
        this.f115999d = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo92567b(StickerWrapper stickerWrapper, C48699d dVar) {
        C52711k.m112240b(stickerWrapper, "stickerWrapper");
        C52711k.m112240b(dVar, "iEffectDownloadProgressListener");
        C45913k kVar = this.f115998c;
        Effect effect = stickerWrapper.f115779a;
        C52711k.m112236a((Object) effect, "stickerWrapper.effect");
        kVar.mo92514a(effect, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo92565a(StickerWrapper stickerWrapper, C48699d dVar) {
        C52711k.m112240b(stickerWrapper, "stickerWrapper");
        C52711k.m112240b(dVar, "iFetchEffectListener");
        C45913k kVar = this.f115998c;
        Effect effect = stickerWrapper.f115779a;
        C52711k.m112236a((Object) effect, "stickerWrapper.effect");
        kVar.mo92514a(effect, C29272u.m68986a((C48705j) dVar, "effect", stickerWrapper.f115785g));
    }

    /* renamed from: a */
    public final void mo92469a(StickerWrapper stickerWrapper, C45874b bVar) {
        C52711k.m112240b(bVar, "onStickerDownloadListener");
        if (stickerWrapper != null) {
            ConcurrentHashMap<String, C45873a> concurrentHashMap = this.f115997b;
            Effect effect = stickerWrapper.f115779a;
            C52711k.m112236a((Object) effect, "stickerWrapper.effect");
            if (concurrentHashMap.get(effect.getEffectId()) != null) {
                bVar.mo92254b(stickerWrapper.f115779a);
                ConcurrentHashMap<String, C45873a> concurrentHashMap2 = this.f115997b;
                Effect effect2 = stickerWrapper.f115779a;
                C52711k.m112236a((Object) effect2, "stickerWrapper.effect");
                C45873a aVar = (C45873a) concurrentHashMap2.get(effect2.getEffectId());
                if (aVar != null) {
                    aVar.f115893a = bVar;
                }
            } else {
                bVar.mo92254b(stickerWrapper.f115779a);
                Map map = this.f115997b;
                Effect effect3 = stickerWrapper.f115779a;
                C52711k.m112236a((Object) effect3, "stickerWrapper.effect");
                String effectId = effect3.getEffectId();
                C52711k.m112236a((Object) effectId, "stickerWrapper.effect.effectId");
                map.put(effectId, new C45873a());
                C29272u a = C29272u.m68985a((C48705j) new C45970a(this, stickerWrapper, bVar), "effect");
                C52711k.m112236a((Object) a, "MonitoredFetchEffectList…CE_RESOURCE_TYPE_STICKER)");
                mo92567b(stickerWrapper, a);
            }
        }
    }
}
