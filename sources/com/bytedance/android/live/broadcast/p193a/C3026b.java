package com.bytedance.android.live.broadcast.p193a;

import com.bytedance.android.live.broadcast.api.BroadcastRoomApi;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.model.C3056b;
import com.bytedance.android.live.broadcast.effect.C3261l;
import com.bytedance.android.live.broadcast.p211f.C3388d.C3391b;
import com.bytedance.android.live.broadcast.p211f.C3388d.C3391b.C3392a;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.common.utility.C9431p;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.broadcast.a.b */
public final class C3026b implements C3025a {

    /* renamed from: a */
    public static final C3027a f8908a = new C3027a(null);

    /* renamed from: b */
    private C1690c f8909b;

    /* renamed from: c */
    private Boolean f8910c;

    /* renamed from: com.bytedance.android.live.broadcast.a.b$a */
    public static final class C3027a {
        private C3027a() {
        }

        public /* synthetic */ C3027a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.a.b$b */
    public static final class C3028b implements C3391b<C3025a> {
        /* renamed from: a */
        public final C3392a<C3025a> mo8221a(C3392a<C3025a> aVar) {
            C52711k.m112240b(aVar, "config");
            C3392a<C3025a> a = aVar.mo8748a(new C3026b()).mo8747a();
            C52711k.m112236a((Object) a, "config.provideWith(LiveC…tService()).asSingleton()");
            return a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.a.b$c */
    static final class C3029c<T> implements C1710e<C4177d<Void>> {

        /* renamed from: a */
        public static final C3029c f8911a = new C3029c();

        C3029c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.a.b$d */
    static final class C3030d<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C3030d f8912a = new C3030d();

        C3030d() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112236a((Object) th, "throwable");
            C3831a.m9706a(6, "LiveCommerceEffectService", th.getStackTrace());
        }
    }

    /* renamed from: b */
    public final void mo8220b() {
        C1690c cVar = this.f8909b;
        if (cVar != null && !cVar.isDisposed()) {
            C1690c cVar2 = this.f8909b;
            if (cVar2 != null) {
                cVar2.dispose();
            }
        }
        this.f8910c = null;
    }

    /* renamed from: a */
    public final boolean mo8219a() {
        C4097p<Boolean> pVar = LiveConfigSettingKeys.LIVE_ENABLE_SHOW_UNUSED_EFFECT_LABEL;
        C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.LI…_SHOW_UNUSED_EFFECT_LABEL");
        if (!((Boolean) pVar.mo9431a()).booleanValue()) {
            return false;
        }
        C3261l c = C3395f.m9156f().mo8741b().mo8554c();
        C52711k.m112236a((Object) c, "LiveInternalService.inst…vice().liveFilterHelper()");
        boolean z = !C9431p.m18664a(c.mo8587a());
        List a = C3395f.m9156f().mo8740a().mo8260a(C3037b.f8914b);
        C52711k.m112236a((Object) a, "LiveInternalService.inst…ker(StickerPanel.STICKER)");
        boolean z2 = !a.isEmpty();
        List<C8688c> a2 = C3395f.m9156f().mo8740a().mo8260a("beauty");
        C52711k.m112236a((Object) a2, "LiveInternalService.inst…cker(StickerPanel.BEAUTY)");
        boolean z3 = false;
        for (C8688c cVar : a2) {
            C52711k.m112236a((Object) cVar, "it");
            List<String> list = cVar.f23751l;
            C52711k.m112236a((Object) list, "it.updateKeys");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!C52711k.m112238a(C3395f.m9156f().mo8740a().mo8275c((String) it.next()), 0.0f)) {
                    z3 = true;
                    break;
                }
            }
        }
        List<C8688c> a3 = C3395f.m9156f().mo8740a().mo8260a(C3037b.f8916d);
        C52711k.m112236a((Object) a3, "LiveInternalService.inst…rPanel.SMALL_ITEM_BEAUTY)");
        boolean z4 = false;
        for (C8688c cVar2 : a3) {
            C52711k.m112236a((Object) cVar2, "it");
            List<String> list2 = cVar2.f23751l;
            C52711k.m112236a((Object) list2, "it.updateKeys");
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!C52711k.m112238a(C3395f.m9156f().mo8740a().mo8275c((String) it2.next()), 0.0f)) {
                    z4 = true;
                    break;
                }
            }
        }
        if (z || z2 || z3 || z4) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo8218a(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f8910c == null) {
            this.f8910c = Boolean.valueOf(mo8219a());
            z = true;
        } else {
            z = !C52711k.m112239a((Object) this.f8910c, (Object) Boolean.valueOf(mo8219a()));
        }
        if (z) {
            this.f8910c = Boolean.valueOf(mo8219a());
            BroadcastRoomApi c = C3395f.m9156f().mo8742c().mo9020c();
            C3261l c2 = C3395f.m9156f().mo8741b().mo8554c();
            C52711k.m112236a((Object) c2, "LiveInternalService.inst…vice().liveFilterHelper()");
            String d = c2.mo8596d();
            C4526c<Float> cVar = C4525b.f12318N;
            C52711k.m112236a((Object) cVar, "LivePluginProperties.WHITENING_PARAM_V2");
            int floatValue = (int) (((Number) cVar.mo10345a()).floatValue() * 100.0f);
            C4526c<Float> cVar2 = C4525b.f12319O;
            C52711k.m112236a((Object) cVar2, "LivePluginProperties.BEAUTY_SKIN_PARAM_V2");
            int floatValue2 = (int) (((Number) cVar2.mo10345a()).floatValue() * 100.0f);
            C4526c<Float> cVar3 = C4525b.f12320P;
            C52711k.m112236a((Object) cVar3, "LivePluginProperties.BIG_EYES_PARAM");
            int floatValue3 = (int) (((Number) cVar3.mo10345a()).floatValue() * 100.0f);
            C4526c<Float> cVar4 = C4525b.f12321Q;
            C52711k.m112236a((Object) cVar4, "LivePluginProperties.FACE_LIFT_PARAM");
            int floatValue4 = (int) (((Number) cVar4.mo10345a()).floatValue() * 100.0f);
            Boolean bool = this.f8910c;
            if (bool != null) {
                z2 = bool.booleanValue();
            } else {
                z2 = true;
            }
            this.f8909b = c.uploadBeautyParams(j, d, floatValue, floatValue2, floatValue3, floatValue4, z2).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) C3029c.f8911a, (C1710e<? super Throwable>) C3030d.f8912a);
            C4495a a = C4495a.m10823a();
            Boolean bool2 = this.f8910c;
            if (bool2 != null) {
                z3 = bool2.booleanValue();
            } else {
                z3 = false;
            }
            a.mo10301a((Object) new C3056b(z3));
        }
    }
}
