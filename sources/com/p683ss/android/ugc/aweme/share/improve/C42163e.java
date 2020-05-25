package com.p683ss.android.ugc.aweme.share.improve;

import com.p683ss.android.ugc.aweme.share.C41974am;
import com.p683ss.android.ugc.aweme.utils.C47891fl;
import kotlinx.coroutines.C53199ae;
import kotlinx.coroutines.C53219ap;
import kotlinx.coroutines.C53226aw;
import kotlinx.coroutines.C53228ay;
import kotlinx.coroutines.C53256be;
import kotlinx.coroutines.C53263bl;
import kotlinx.coroutines.C53295ck;
import kotlinx.coroutines.C53299e;
import kotlinx.coroutines.p2678a.C53192b;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52634f;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2631c.p2633b.p2634a.C52620h;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.share.improve.e */
public final class C42163e {

    /* renamed from: a */
    public static final C42163e f106630a = new C42163e();

    @C52618f(mo110254b = "UrlShorter.kt", mo110255c = {25}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.share.improve.UrlShorter$fetchShortenUrl$1")
    /* renamed from: com.ss.android.ugc.aweme.share.improve.e$a */
    static final class C42164a extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        Object f106631a;

        /* renamed from: b */
        int f106632b;

        /* renamed from: c */
        final /* synthetic */ C52727e f106633c;

        /* renamed from: d */
        final /* synthetic */ String f106634d;

        /* renamed from: e */
        final /* synthetic */ String f106635e;

        /* renamed from: f */
        final /* synthetic */ boolean f106636f;

        /* renamed from: g */
        private C53199ae f106637g;

        @C52618f(mo110254b = "UrlShorter.kt", mo110255c = {29}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.share.improve.UrlShorter$fetchShortenUrl$1$1")
        /* renamed from: com.ss.android.ugc.aweme.share.improve.e$a$1 */
        static final class C421651 extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

            /* renamed from: a */
            Object f106638a;

            /* renamed from: b */
            Object f106639b;

            /* renamed from: c */
            int f106640c;

            /* renamed from: d */
            final /* synthetic */ C42164a f106641d;

            /* renamed from: e */
            private C53199ae f106642e;

            @C52618f(mo110254b = "UrlShorter.kt", mo110255c = {}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.share.improve.UrlShorter$fetchShortenUrl$1$1$job$1")
            /* renamed from: com.ss.android.ugc.aweme.share.improve.e$a$1$a */
            static final class C42166a extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

                /* renamed from: a */
                int f106643a;

                /* renamed from: b */
                final /* synthetic */ C421651 f106644b;

                /* renamed from: c */
                private C53199ae f106645c;

                C42166a(C421651 r1, C52625c cVar) {
                    this.f106644b = r1;
                    super(2, cVar);
                }

                public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
                    C52711k.m112240b(cVar, "completion");
                    C42166a aVar = new C42166a(this.f106644b, cVar);
                    aVar.f106645c = (C53199ae) obj;
                    return aVar;
                }

                public final Object invoke(Object obj, Object obj2) {
                    return ((C42166a) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
                }

                public final Object invokeSuspend(Object obj) {
                    if (this.f106643a == 0) {
                        C52727e eVar = this.f106644b.f106641d.f106633c;
                        T a = C41974am.m91941a(this.f106644b.f106641d.f106634d, this.f106644b.f106641d.f106635e, this.f106644b.f106641d.f106636f);
                        C52711k.m112236a((Object) a, "ShareHelper.getGroupShar…rl, channel, boolPersist)");
                        eVar.element = a;
                        return C52860x.f131107a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            {
                this.f106641d = r1;
            }

            public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
                C52711k.m112240b(cVar, "completion");
                C421651 r0 = new C421651(this.f106641d, cVar);
                r0.f106642e = (C53199ae) obj;
                return r0;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C421651) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
            }

            public final Object invokeSuspend(Object obj) {
                Object a = C52601b.m112157a();
                switch (this.f106640c) {
                    case 0:
                        C53199ae aeVar = this.f106642e;
                        C53263bl b = C53301g.m113291a(C53256be.f131885a, null, null, new C42166a(this, null), 3, null);
                        this.f106638a = aeVar;
                        this.f106639b = b;
                        this.f106640c = 1;
                        if (b.mo110862b((C52625c<? super C52860x>) this) == a) {
                            return a;
                        }
                        break;
                    case 1:
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C52860x.f131107a;
            }
        }

        C42164a(C52727e eVar, String str, String str2, boolean z, C52625c cVar) {
            this.f106633c = eVar;
            this.f106634d = str;
            this.f106635e = str2;
            this.f106636f = z;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C42164a aVar = new C42164a(this.f106633c, this.f106634d, this.f106635e, this.f106636f, cVar);
            aVar.f106637g = (C53199ae) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C42164a) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            Object a = C52601b.m112157a();
            switch (this.f106632b) {
                case 0:
                    C53199ae aeVar = this.f106637g;
                    try {
                        C52682m r1 = new C421651(this, null);
                        this.f106631a = aeVar;
                        this.f106632b = 1;
                        C53295ck ckVar = new C53295ck(3000, this);
                        C53263bl blVar = ckVar;
                        C53226aw a2 = C53219ap.m113057a(ckVar.f131919e.getContext()).mo110773a(ckVar.f131918b, (Runnable) ckVar);
                        C52711k.m112240b(blVar, "receiver$0");
                        C52711k.m112240b(a2, "handle");
                        blVar.mo110859a((C52671b<? super Throwable, C52860x>) new C53228ay<Object,C52860x>(blVar, a2));
                        Object b = C53192b.m113018b(ckVar, ckVar, r1);
                        if (b == C52601b.m112157a()) {
                            C52620h.m112171b(this);
                        }
                        if (b == a) {
                            return a;
                        }
                    } catch (Exception unused) {
                        break;
                    }
                    break;
                case 1:
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C52860x.f131107a;
        }
    }

    private C42163e() {
    }

    /* renamed from: a */
    public static /* synthetic */ String m92531a(C42163e eVar, String str, String str2, boolean z, int i, Object obj) {
        boolean z2;
        C52711k.m112240b(str2, "channel");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (str == null) {
                str = "";
            }
            return str;
        }
        C52727e eVar2 = new C52727e();
        eVar2.element = "";
        C42164a aVar = new C42164a(eVar2, str, str2, true, null);
        C53299e.m113283a(C52634f.INSTANCE, aVar);
        String str3 = (String) eVar2.element;
        if (!C47891fl.m103593a(str3)) {
            str3 = null;
        }
        if (str3 == null) {
            str3 = str;
        }
        return str3;
    }
}
