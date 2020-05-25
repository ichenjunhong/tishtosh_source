package com.bytedance.android.live.broadcast.effect;

import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.p195b.C3040c;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3044a;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3045b;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p230g.C3914u;
import com.bytedance.android.live.core.rxutils.autodispose.C4005af;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C1681ae;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.broadcast.effect.v */
public final class C3366v {

    /* renamed from: c */
    public static final C3367a f9664c = new C3367a(null);

    /* renamed from: a */
    public final ArrayList<C8688c> f9665a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<C3368b> f9666b = new ArrayList<>();

    /* renamed from: com.bytedance.android.live.broadcast.effect.v$a */
    public static final class C3367a {
        private C3367a() {
        }

        public /* synthetic */ C3367a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static float m9122a(C8688c cVar, int i) {
            int i2;
            C52711k.m112240b(cVar, "sticker");
            if (i == 0) {
                return 0.0f;
            }
            int i3 = 100;
            boolean z = false;
            if (cVar.f23749j != null) {
                i3 = cVar.f23749j.f23765c;
                i2 = cVar.f23749j.f23766d;
            } else {
                i2 = 0;
            }
            if (i2 < 0) {
                z = true;
            }
            if (!z) {
                double d = (double) (i3 - i2);
                Double.isNaN(d);
                double d2 = (d * 1.0d) / 10000.0d;
                double d3 = (double) i;
                Double.isNaN(d3);
                return (float) (d2 * d3);
            } else if (i > 0) {
                double d4 = (double) i3;
                Double.isNaN(d4);
                double d5 = (d4 * 1.0d) / 5000.0d;
                double d6 = (double) i;
                Double.isNaN(d6);
                return (float) (d5 * d6 * 2.0d);
            } else {
                double d7 = (double) i2;
                Double.isNaN(d7);
                double d8 = (d7 * 1.0d) / -5000.0d;
                double d9 = (double) i;
                Double.isNaN(d9);
                return (float) (d8 * d9 * 2.0d);
            }
        }

        /* renamed from: a */
        public static int m9123a(C8688c cVar, float f) {
            int i;
            C52711k.m112240b(cVar, "sticker");
            boolean z = false;
            if (f == 0.0f) {
                return 0;
            }
            int i2 = 100;
            if (cVar.f23749j != null) {
                i2 = cVar.f23749j.f23765c;
                i = cVar.f23749j.f23766d;
            } else {
                i = 0;
            }
            if (i < 0) {
                z = true;
            }
            if (!z) {
                return (int) ((f * 10000.0f) / ((float) (i2 - i)));
            }
            if (f > 0.0f) {
                return (int) ((f * ((float) (5000 / i2))) / 2.0f);
            }
            return (int) ((f * ((float) (-5000 / i))) / 2.0f);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.v$b */
    public interface C3368b {
        /* renamed from: a */
        void mo8557a(C8688c cVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.v$c */
    public interface C3369c {
        /* renamed from: a */
        void mo8566a();

        /* renamed from: a */
        void mo8567a(List<? extends C8688c> list);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.v$d */
    public static final class C3370d implements C3045b {

        /* renamed from: a */
        final /* synthetic */ C3366v f9667a;

        /* renamed from: b */
        final /* synthetic */ C3369c f9668b;

        /* renamed from: c */
        final /* synthetic */ Fragment f9669c;

        /* renamed from: com.bytedance.android.live.broadcast.effect.v$d$a */
        static final class C3371a<T, R> implements C1711f<T, R> {

            /* renamed from: a */
            final /* synthetic */ C3370d f9670a;

            C3371a(C3370d dVar) {
                this.f9670a = dVar;
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.bytedance.android.livesdkapi.depend.model.C8688c apply(com.p683ss.android.ugc.effectmanager.effect.model.Effect r11) {
                /*
                    r10 = this;
                    java.lang.String r0 = "it"
                    p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
                    int r0 = r11.getEffectType()
                    r1 = 0
                    r2 = 1
                    if (r0 != r2) goto L_0x001b
                    java.util.List r0 = r11.getChildEffects()
                    java.util.Collection r0 = (java.util.Collection) r0
                    boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
                    if (r0 != 0) goto L_0x001b
                    r0 = 1
                    goto L_0x001c
                L_0x001b:
                    r0 = 0
                L_0x001c:
                    com.bytedance.android.live.broadcast.effect.v$d r3 = r10.f9670a
                    com.bytedance.android.live.broadcast.effect.v r3 = r3.f9667a
                    r4 = r0 ^ 1
                    com.bytedance.android.livesdkapi.depend.model.c r3 = r3.mo8732a(r11, r4)
                    com.google.gson.q r4 = new com.google.gson.q     // Catch:{ Throwable -> 0x006d }
                    r4.<init>()     // Catch:{ Throwable -> 0x006d }
                    java.lang.String r5 = r11.getExtra()     // Catch:{ Throwable -> 0x006d }
                    com.google.gson.l r4 = r4.mo35029a(r5)     // Catch:{ Throwable -> 0x006d }
                    java.lang.String r5 = "JsonParser().parse(it.extra)"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ Throwable -> 0x006d }
                    com.google.gson.o r4 = r4.mo35009m()     // Catch:{ Throwable -> 0x006d }
                    java.lang.String r5 = "ab_group"
                    boolean r5 = r4.mo35021a(r5)     // Catch:{ Throwable -> 0x006d }
                    if (r5 == 0) goto L_0x0074
                    com.bytedance.android.live.core.setting.p<java.lang.Integer> r6 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP     // Catch:{ Throwable -> 0x006b }
                    java.lang.String r7 = "LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)     // Catch:{ Throwable -> 0x006b }
                    java.lang.Object r6 = r6.mo9431a()     // Catch:{ Throwable -> 0x006b }
                    java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Throwable -> 0x006b }
                    java.lang.String r7 = "ab_group"
                    com.google.gson.l r4 = r4.mo35022b(r7)     // Catch:{ Throwable -> 0x006b }
                    java.lang.String r7 = "jsonObject.get(AB_GROUP)"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r4, r7)     // Catch:{ Throwable -> 0x006b }
                    int r4 = r4.mo34910g()     // Catch:{ Throwable -> 0x006b }
                    if (r6 != 0) goto L_0x0063
                    goto L_0x0074
                L_0x0063:
                    int r6 = r6.intValue()     // Catch:{ Throwable -> 0x006b }
                    if (r6 != r4) goto L_0x0074
                    r4 = 1
                    goto L_0x0075
                L_0x006b:
                    r4 = move-exception
                    goto L_0x006f
                L_0x006d:
                    r4 = move-exception
                    r5 = 0
                L_0x006f:
                    java.lang.String r6 = "LiveSmallItemBeautyDialogFragment"
                    com.bytedance.android.live.core.p224c.C3831a.m9714b(r6, r4)
                L_0x0074:
                    r4 = 0
                L_0x0075:
                    if (r0 == 0) goto L_0x00dd
                    if (r5 == 0) goto L_0x007b
                    if (r4 == 0) goto L_0x00dd
                L_0x007b:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.List r0 = (java.util.List) r0
                    java.util.List r4 = r11.getChildEffects()
                    if (r4 != 0) goto L_0x008b
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x008b:
                    int r4 = r4.size()
                    r5 = 0
                L_0x0090:
                    if (r5 >= r4) goto L_0x00db
                    com.bytedance.android.live.broadcast.f.c r6 = com.bytedance.android.live.broadcast.p211f.C3395f.m9156f()
                    com.bytedance.android.live.broadcast.api.b.c r6 = r6.mo8740a()
                    java.util.List r7 = r11.getChildEffects()
                    if (r7 != 0) goto L_0x00a3
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x00a3:
                    java.lang.Object r7 = r7.get(r5)
                    com.ss.android.ugc.effectmanager.effect.model.Effect r7 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r7
                    java.lang.Integer r6 = r6.mo8259a(r7)
                    com.bytedance.android.live.broadcast.effect.v$d r7 = r10.f9670a
                    com.bytedance.android.live.broadcast.effect.v r7 = r7.f9667a
                    java.util.List r8 = r11.getChildEffects()
                    if (r8 != 0) goto L_0x00ba
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x00ba:
                    java.lang.Object r8 = r8.get(r5)
                    java.lang.String r9 = "it.childEffects!![index]"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
                    com.ss.android.ugc.effectmanager.effect.model.Effect r8 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r8
                    if (r6 != 0) goto L_0x00c8
                    goto L_0x00d0
                L_0x00c8:
                    int r6 = r6.intValue()
                    if (r5 != r6) goto L_0x00d0
                    r6 = 1
                    goto L_0x00d1
                L_0x00d0:
                    r6 = 0
                L_0x00d1:
                    com.bytedance.android.livesdkapi.depend.model.c r6 = r7.mo8732a(r8, r6)
                    r0.add(r6)
                    int r5 = r5 + 1
                    goto L_0x0090
                L_0x00db:
                    r3.f23750k = r0
                L_0x00dd:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.effect.C3366v.C3370d.C3371a.apply(com.ss.android.ugc.effectmanager.effect.model.Effect):com.bytedance.android.livesdkapi.depend.model.c");
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.effect.v$d$b */
        static final class C3372b<T> implements C1715j<C8688c> {

            /* renamed from: a */
            public static final C3372b f9671a = new C3372b();

            C3372b() {
            }

            /* renamed from: a */
            public final /* synthetic */ boolean mo6207a(Object obj) {
                C8688c cVar = (C8688c) obj;
                C52711k.m112240b(cVar, "it");
                if (cVar.f23749j != null || !C9376b.m18558a((Collection<T>) cVar.f23750k)) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.effect.v$d$c */
        static final class C3373c<T> implements C1710e<List<C8688c>> {

            /* renamed from: a */
            final /* synthetic */ C3370d f9672a;

            C3373c(C3370d dVar) {
                this.f9672a = dVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                List list = (List) obj;
                if (C9414h.m18630a(list)) {
                    C3369c cVar = this.f9672a.f9668b;
                    if (cVar != null) {
                        cVar.mo8566a();
                    }
                } else {
                    C3369c cVar2 = this.f9672a.f9668b;
                    if (cVar2 != null) {
                        C52711k.m112236a((Object) list, "it");
                        cVar2.mo8567a(list);
                    }
                }
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.effect.v$d$d */
        static final class C3374d<T> implements C1710e<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C3370d f9673a;

            C3374d(C3370d dVar) {
                this.f9673a = dVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                C3369c cVar = this.f9673a.f9668b;
                if (cVar != null) {
                    cVar.mo8566a();
                }
            }
        }

        /* renamed from: a */
        public final void mo8286a() {
            C3369c cVar = this.f9668b;
            if (cVar != null) {
                cVar.mo8566a();
            }
        }

        /* renamed from: a */
        public final void mo8287a(EffectChannelResponse effectChannelResponse) {
            if (effectChannelResponse == null || C3914u.m9892a(effectChannelResponse.getAllCategoryEffects())) {
                C3369c cVar = this.f9668b;
                if (cVar != null) {
                    cVar.mo8566a();
                    return;
                }
                return;
            }
            this.f9667a.f9665a.clear();
            ((C4005af) C2201v.m6613b((Iterable<? extends T>) effectChannelResponse.getAllCategoryEffects()).mo6541d((C1711f<? super T, ? extends R>) new C3371a<Object,Object>(this)).mo6522a((C1715j<? super T>) C3372b.f9671a).mo6552k().mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6153a((C1681ae<T, ? extends R>) C4021e.m10137a(this.f9669c))).mo9410a(new C3373c(this), new C3374d(this));
        }

        C3370d(C3366v vVar, C3369c cVar, Fragment fragment) {
            this.f9667a = vVar;
            this.f9668b = cVar;
            this.f9669c = fragment;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.v$e */
    public static final class C3375e implements C3045b {

        /* renamed from: a */
        final /* synthetic */ C3366v f9674a;

        /* renamed from: b */
        final /* synthetic */ C3369c f9675b;

        /* renamed from: c */
        final /* synthetic */ FragmentActivity f9676c;

        /* renamed from: com.bytedance.android.live.broadcast.effect.v$e$a */
        static final class C3376a<T, R> implements C1711f<T, R> {

            /* renamed from: a */
            final /* synthetic */ C3375e f9677a;

            C3376a(C3375e eVar) {
                this.f9677a = eVar;
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.bytedance.android.livesdkapi.depend.model.C8688c apply(com.p683ss.android.ugc.effectmanager.effect.model.Effect r11) {
                /*
                    r10 = this;
                    java.lang.String r0 = "it"
                    p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
                    int r0 = r11.getEffectType()
                    r1 = 0
                    r2 = 1
                    if (r0 != r2) goto L_0x001b
                    java.util.List r0 = r11.getChildEffects()
                    java.util.Collection r0 = (java.util.Collection) r0
                    boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
                    if (r0 != 0) goto L_0x001b
                    r0 = 1
                    goto L_0x001c
                L_0x001b:
                    r0 = 0
                L_0x001c:
                    com.bytedance.android.live.broadcast.effect.v$e r3 = r10.f9677a
                    com.bytedance.android.live.broadcast.effect.v r3 = r3.f9674a
                    r4 = r0 ^ 1
                    com.bytedance.android.livesdkapi.depend.model.c r3 = r3.mo8732a(r11, r4)
                    com.google.gson.q r4 = new com.google.gson.q     // Catch:{ Throwable -> 0x006d }
                    r4.<init>()     // Catch:{ Throwable -> 0x006d }
                    java.lang.String r5 = r11.getExtra()     // Catch:{ Throwable -> 0x006d }
                    com.google.gson.l r4 = r4.mo35029a(r5)     // Catch:{ Throwable -> 0x006d }
                    java.lang.String r5 = "JsonParser().parse(it.extra)"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ Throwable -> 0x006d }
                    com.google.gson.o r4 = r4.mo35009m()     // Catch:{ Throwable -> 0x006d }
                    java.lang.String r5 = "ab_group"
                    boolean r5 = r4.mo35021a(r5)     // Catch:{ Throwable -> 0x006d }
                    if (r5 == 0) goto L_0x0074
                    com.bytedance.android.live.core.setting.p<java.lang.Integer> r6 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP     // Catch:{ Throwable -> 0x006b }
                    java.lang.String r7 = "LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)     // Catch:{ Throwable -> 0x006b }
                    java.lang.Object r6 = r6.mo9431a()     // Catch:{ Throwable -> 0x006b }
                    java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Throwable -> 0x006b }
                    java.lang.String r7 = "ab_group"
                    com.google.gson.l r4 = r4.mo35022b(r7)     // Catch:{ Throwable -> 0x006b }
                    java.lang.String r7 = "jsonObject.get(AB_GROUP)"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r4, r7)     // Catch:{ Throwable -> 0x006b }
                    int r4 = r4.mo34910g()     // Catch:{ Throwable -> 0x006b }
                    if (r6 != 0) goto L_0x0063
                    goto L_0x0074
                L_0x0063:
                    int r6 = r6.intValue()     // Catch:{ Throwable -> 0x006b }
                    if (r6 != r4) goto L_0x0074
                    r4 = 1
                    goto L_0x0075
                L_0x006b:
                    r4 = move-exception
                    goto L_0x006f
                L_0x006d:
                    r4 = move-exception
                    r5 = 0
                L_0x006f:
                    java.lang.String r6 = "LiveSmallItemBeautyDialogFragment"
                    com.bytedance.android.live.core.p224c.C3831a.m9714b(r6, r4)
                L_0x0074:
                    r4 = 0
                L_0x0075:
                    if (r0 == 0) goto L_0x00dd
                    if (r5 == 0) goto L_0x007b
                    if (r4 == 0) goto L_0x00dd
                L_0x007b:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.List r0 = (java.util.List) r0
                    java.util.List r4 = r11.getChildEffects()
                    if (r4 != 0) goto L_0x008b
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x008b:
                    int r4 = r4.size()
                    r5 = 0
                L_0x0090:
                    if (r5 >= r4) goto L_0x00db
                    com.bytedance.android.live.broadcast.f.c r6 = com.bytedance.android.live.broadcast.p211f.C3395f.m9156f()
                    com.bytedance.android.live.broadcast.api.b.c r6 = r6.mo8740a()
                    java.util.List r7 = r11.getChildEffects()
                    if (r7 != 0) goto L_0x00a3
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x00a3:
                    java.lang.Object r7 = r7.get(r5)
                    com.ss.android.ugc.effectmanager.effect.model.Effect r7 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r7
                    java.lang.Integer r6 = r6.mo8259a(r7)
                    com.bytedance.android.live.broadcast.effect.v$e r7 = r10.f9677a
                    com.bytedance.android.live.broadcast.effect.v r7 = r7.f9674a
                    java.util.List r8 = r11.getChildEffects()
                    if (r8 != 0) goto L_0x00ba
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x00ba:
                    java.lang.Object r8 = r8.get(r5)
                    java.lang.String r9 = "it.childEffects!![index]"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
                    com.ss.android.ugc.effectmanager.effect.model.Effect r8 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r8
                    if (r6 != 0) goto L_0x00c8
                    goto L_0x00d0
                L_0x00c8:
                    int r6 = r6.intValue()
                    if (r5 != r6) goto L_0x00d0
                    r6 = 1
                    goto L_0x00d1
                L_0x00d0:
                    r6 = 0
                L_0x00d1:
                    com.bytedance.android.livesdkapi.depend.model.c r6 = r7.mo8732a(r8, r6)
                    r0.add(r6)
                    int r5 = r5 + 1
                    goto L_0x0090
                L_0x00db:
                    r3.f23750k = r0
                L_0x00dd:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.effect.C3366v.C3375e.C3376a.apply(com.ss.android.ugc.effectmanager.effect.model.Effect):com.bytedance.android.livesdkapi.depend.model.c");
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.effect.v$e$b */
        static final class C3377b<T> implements C1715j<C8688c> {

            /* renamed from: a */
            public static final C3377b f9678a = new C3377b();

            C3377b() {
            }

            /* renamed from: a */
            public final /* synthetic */ boolean mo6207a(Object obj) {
                C8688c cVar = (C8688c) obj;
                C52711k.m112240b(cVar, "it");
                if (cVar.f23749j != null || !C9376b.m18558a((Collection<T>) cVar.f23750k)) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.effect.v$e$c */
        static final class C3378c<T> implements C1710e<List<C8688c>> {

            /* renamed from: a */
            final /* synthetic */ C3375e f9679a;

            C3378c(C3375e eVar) {
                this.f9679a = eVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                List list = (List) obj;
                if (C9414h.m18630a(list)) {
                    C3369c cVar = this.f9679a.f9675b;
                    if (cVar != null) {
                        cVar.mo8566a();
                    }
                } else {
                    C3369c cVar2 = this.f9679a.f9675b;
                    if (cVar2 != null) {
                        C52711k.m112236a((Object) list, "it");
                        cVar2.mo8567a(list);
                    }
                }
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.effect.v$e$d */
        static final class C3379d<T> implements C1710e<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C3375e f9680a;

            C3379d(C3375e eVar) {
                this.f9680a = eVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                C3369c cVar = this.f9680a.f9675b;
                if (cVar != null) {
                    cVar.mo8566a();
                }
            }
        }

        /* renamed from: a */
        public final void mo8286a() {
            C3369c cVar = this.f9675b;
            if (cVar != null) {
                cVar.mo8566a();
            }
        }

        /* renamed from: a */
        public final void mo8287a(EffectChannelResponse effectChannelResponse) {
            if (effectChannelResponse == null || C3914u.m9892a(effectChannelResponse.getAllCategoryEffects())) {
                C3369c cVar = this.f9675b;
                if (cVar != null) {
                    cVar.mo8566a();
                    return;
                }
                return;
            }
            this.f9674a.f9665a.clear();
            ((C4005af) C2201v.m6613b((Iterable<? extends T>) effectChannelResponse.getAllCategoryEffects()).mo6541d((C1711f<? super T, ? extends R>) new C3376a<Object,Object>(this)).mo6522a((C1715j<? super T>) C3377b.f9678a).mo6552k().mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6153a((C1681ae<T, ? extends R>) C4021e.m10138a(this.f9676c))).mo9410a(new C3378c(this), new C3379d(this));
        }

        C3375e(C3366v vVar, C3369c cVar, FragmentActivity fragmentActivity) {
            this.f9674a = vVar;
            this.f9675b = cVar;
            this.f9676c = fragmentActivity;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.v$f */
    public static final class C3380f implements C3044a {

        /* renamed from: a */
        final /* synthetic */ C3366v f9681a;

        /* renamed from: b */
        final /* synthetic */ C3368b f9682b;

        /* renamed from: c */
        final /* synthetic */ boolean f9683c;

        /* renamed from: a */
        public final void mo8283a(String str, C8688c cVar) {
        }

        /* renamed from: b */
        public final void mo8284b(String str, C8688c cVar) {
            if (C52711k.m112239a((Object) C3037b.f8916d, (Object) str)) {
                Iterator it = this.f9681a.f9666b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }

        /* renamed from: c */
        public final void mo8285c(String str, C8688c cVar) {
            if (C52711k.m112239a((Object) C3037b.f8916d, (Object) str)) {
                if (cVar == null) {
                    Iterator it = this.f9681a.f9666b.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    return;
                }
                if (this.f9683c) {
                    this.f9681a.mo8735a(cVar);
                }
                C3368b bVar = this.f9682b;
                if (bVar != null) {
                    bVar.mo8557a(cVar);
                }
                for (C3368b a : this.f9681a.f9666b) {
                    a.mo8557a(cVar);
                }
            }
        }

        C3380f(C3366v vVar, C3368b bVar, boolean z) {
            this.f9681a = vVar;
            this.f9682b = bVar;
            this.f9683c = z;
        }
    }

    /* renamed from: a */
    public static final float m9114a(C8688c cVar, int i) {
        return C3367a.m9122a(cVar, i);
    }

    /* renamed from: a */
    public final void mo8734a(FragmentActivity fragmentActivity) {
        m9115a(this, fragmentActivity, null, 2, null);
    }

    /* renamed from: a */
    public final void mo8735a(C8688c cVar) {
        C52711k.m112240b(cVar, "sticker");
        C3040c a = C3395f.m9156f().mo8740a();
        Iterable iterable = this.f9665a;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (C9431p.m18665a(((C8688c) next).f23759t, cVar.f23759t)) {
                arrayList.add(next);
            }
        }
        for (C8688c cVar2 : (List) arrayList) {
            Float c = a.mo8275c(cVar2.f23749j.f23764b);
            if (c == null) {
                a.mo8268a(C3037b.f8916d, cVar2);
                a.mo8267a(cVar2.f23749j.f23764b, C3367a.m9122a(cVar2, cVar2.f23749j.f23763a));
            } else {
                a.mo8265a(cVar2, cVar2.f23749j.f23764b, c.floatValue(), true);
            }
        }
    }

    /* renamed from: a */
    public final void mo8733a(Fragment fragment, C3369c cVar) {
        C52711k.m112240b(fragment, "fragment");
        C3203b b = C3395f.m9156f().mo8741b();
        C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
        b.mo8551a().mo8280a(C3037b.f8916d, new C3370d(this, cVar, fragment));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        if (r1.intValue() != r2) goto L_0x004c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.livesdkapi.depend.model.C8688c mo8732a(com.p683ss.android.ugc.effectmanager.effect.model.Effect r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "effect"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            com.bytedance.android.livesdkapi.depend.model.c r0 = com.bytedance.android.live.broadcast.effect.sticker.C3287f.m9010a(r8)
            com.google.gson.q r1 = new com.google.gson.q     // Catch:{ Throwable -> 0x00dd }
            r1.<init>()     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r8 = r8.getExtra()     // Catch:{ Throwable -> 0x00dd }
            com.google.gson.l r8 = r1.mo35029a(r8)     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r1 = "JsonParser().parse(effect.extra)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r1)     // Catch:{ Throwable -> 0x00dd }
            com.google.gson.o r8 = r8.mo35009m()     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r1 = "ab_group"
            boolean r1 = r8.mo35021a(r1)     // Catch:{ Throwable -> 0x00dd }
            if (r1 == 0) goto L_0x0052
            com.bytedance.android.live.core.setting.p<java.lang.Integer> r1 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r2 = "LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Throwable -> 0x00dd }
            java.lang.Object r1 = r1.mo9431a()     // Catch:{ Throwable -> 0x00dd }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r2 = "ab_group"
            com.google.gson.l r2 = r8.mo35022b(r2)     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r3 = "jsonObject.get(AB_GROUP)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Throwable -> 0x00dd }
            int r2 = r2.mo34910g()     // Catch:{ Throwable -> 0x00dd }
            if (r1 != 0) goto L_0x0046
            goto L_0x004c
        L_0x0046:
            int r1 = r1.intValue()     // Catch:{ Throwable -> 0x00dd }
            if (r1 == r2) goto L_0x0052
        L_0x004c:
            java.lang.String r8 = "stickerBean"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r8)     // Catch:{ Throwable -> 0x00dd }
            return r0
        L_0x0052:
            java.lang.String r1 = "beautyConfig"
            com.google.gson.l r8 = r8.mo35022b(r1)     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r1 = "jsonObject.get(BEAUTY_CONFIG)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r1)     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r8 = r8.mo34905c()     // Catch:{ Throwable -> 0x00dd }
            com.google.gson.q r1 = new com.google.gson.q     // Catch:{ Throwable -> 0x00dd }
            r1.<init>()     // Catch:{ Throwable -> 0x00dd }
            com.google.gson.l r8 = r1.mo35029a(r8)     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r1 = "JsonParser().parse(beautyConfig)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r1)     // Catch:{ Throwable -> 0x00dd }
            com.google.gson.o r8 = r8.mo35009m()     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r1 = "items"
            com.google.gson.i r8 = r8.mo35024d(r1)     // Catch:{ Throwable -> 0x00dd }
            r1 = 0
            com.google.gson.l r8 = r8.mo34902a(r1)     // Catch:{ Throwable -> 0x00dd }
            com.google.gson.f r1 = com.bytedance.android.live.C2942b.m8369a()     // Catch:{ Throwable -> 0x00dd }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.c$a> r2 = com.bytedance.android.livesdkapi.depend.model.C8688c.C8689a.class
            java.lang.Object r8 = r1.mo34881a(r8, r2)     // Catch:{ Throwable -> 0x00dd }
            com.bytedance.android.livesdkapi.depend.model.c$a r8 = (com.bytedance.android.livesdkapi.depend.model.C8688c.C8689a) r8     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r1 = "stickerBean"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)     // Catch:{ Throwable -> 0x00dd }
            r0.f23749j = r8     // Catch:{ Throwable -> 0x00dd }
            java.util.List<java.lang.String> r1 = r0.f23751l     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r8 = r8.f23764b     // Catch:{ Throwable -> 0x00dd }
            r1.add(r8)     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r8 = "beautyTag"
            java.util.List<java.lang.String> r1 = r0.f23747h     // Catch:{ Throwable -> 0x00dd }
            boolean r1 = com.bytedance.common.utility.C9414h.m18630a(r1)     // Catch:{ Throwable -> 0x00dd }
            if (r1 != 0) goto L_0x00a9
            java.util.List<java.lang.String> r1 = r0.f23747h     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r8 = com.bytedance.android.live.broadcast.effect.sticker.C3287f.m9015b(r8, r1)     // Catch:{ Throwable -> 0x00dd }
            goto L_0x00aa
        L_0x00a9:
            r8 = 0
        L_0x00aa:
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r8)     // Catch:{ Throwable -> 0x00dd }
            if (r1 != 0) goto L_0x00ce
            com.bytedance.android.live.broadcast.f.c r1 = com.bytedance.android.live.broadcast.p211f.C3395f.m9156f()     // Catch:{ Throwable -> 0x00dd }
            com.bytedance.android.live.broadcast.effect.b r1 = r1.mo8741b()     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r2 = "LiveInternalService.inst().liveEffectService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Throwable -> 0x00dd }
            com.bytedance.android.live.broadcast.effect.sticker.a.b r1 = r1.mo8551a()     // Catch:{ Throwable -> 0x00dd }
            java.util.Map<java.lang.String, com.bytedance.android.livesdkapi.depend.model.c> r2 = r1.f9463f     // Catch:{ Throwable -> 0x00dd }
            boolean r2 = r2.containsKey(r8)     // Catch:{ Throwable -> 0x00dd }
            if (r2 != 0) goto L_0x00ce
            java.util.Map<java.lang.String, com.bytedance.android.livesdkapi.depend.model.c> r1 = r1.f9463f     // Catch:{ Throwable -> 0x00dd }
            r1.put(r8, r0)     // Catch:{ Throwable -> 0x00dd }
        L_0x00ce:
            java.util.ArrayList<com.bytedance.android.livesdkapi.depend.model.c> r8 = r7.f9665a     // Catch:{ Throwable -> 0x00dd }
            r8.add(r0)     // Catch:{ Throwable -> 0x00dd }
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            r2 = r0
            r3 = r9
            r1.mo8736a(r2, r3, null)     // Catch:{ Throwable -> 0x00dd }
            goto L_0x00e3
        L_0x00dd:
            r8 = move-exception
            java.lang.String r9 = "LiveSmallItemBeautyDialogFragment"
            com.bytedance.android.live.core.p224c.C3831a.m9714b(r9, r8)
        L_0x00e3:
            java.lang.String r8 = "stickerBean"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.effect.C3366v.mo8732a(com.ss.android.ugc.effectmanager.effect.model.Effect, boolean):com.bytedance.android.livesdkapi.depend.model.c");
    }

    /* renamed from: a */
    public final void mo8736a(C8688c cVar, boolean z, C3368b bVar) {
        C52711k.m112240b(cVar, "sticker");
        C3203b b = C3395f.m9156f().mo8741b();
        C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
        if (b.mo8551a().mo8282a(cVar)) {
            if (z) {
                mo8735a(cVar);
            }
            if (bVar != null) {
                bVar.mo8557a(cVar);
            }
            for (C3368b a : this.f9666b) {
                a.mo8557a(cVar);
            }
            return;
        }
        C3203b b2 = C3395f.m9156f().mo8741b();
        C52711k.m112236a((Object) b2, "LiveInternalService.inst().liveEffectService()");
        b2.mo8551a().mo8281a(C3037b.f8916d, cVar, (C3044a) new C3380f(this, bVar, z));
    }

    /* renamed from: a */
    public static /* synthetic */ void m9115a(C3366v vVar, FragmentActivity fragmentActivity, C3369c cVar, int i, Object obj) {
        C52711k.m112240b(fragmentActivity, "activity");
        C3203b b = C3395f.m9156f().mo8741b();
        C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
        b.mo8551a().mo8280a(C3037b.f8916d, new C3375e(vVar, null, fragmentActivity));
    }
}
