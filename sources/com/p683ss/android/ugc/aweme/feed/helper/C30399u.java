package com.p683ss.android.ugc.aweme.feed.helper;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.feed.experiment.InterctionShareButtonWhatsappStyleExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42301x;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42303y;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42309a;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.u */
public final class C30399u {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f79465a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30399u.class), "WHATSAPP_CHANNEL", "getWHATSAPP_CHANNEL()Lcom/ss/android/ugc/aweme/sharer/ext/WhatsappChannel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30399u.class), "WHATSAPP_STATUS_CHANNEL", "getWHATSAPP_STATUS_CHANNEL()Lcom/ss/android/ugc/aweme/sharer/ext/WhatsappStatusChannel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30399u.class), "KEVA", "getKEVA()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C30399u f79466b = new C30399u();

    /* renamed from: c */
    private static final C52668f f79467c = C52732g.m112285a(C30401b.f79472a);

    /* renamed from: d */
    private static final C52668f f79468d = C52732g.m112285a(C30402c.f79473a);

    /* renamed from: e */
    private static final C52668f f79469e = C52732g.m112285a(C30400a.f79471a);

    /* renamed from: f */
    private static final ArrayList<String> f79470f = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.u$a */
    static final class C30400a extends C52712l implements C52670a<Keva> {

        /* renamed from: a */
        public static final C30400a f79471a = new C30400a();

        C30400a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Keva.getRepo("SHARE_CHANNEL_RECORDER");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.u$b */
    static final class C30401b extends C52712l implements C52670a<C42301x> {

        /* renamed from: a */
        public static final C30401b f79472a = new C30401b();

        C30401b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C42301x();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.u$c */
    static final class C30402c extends C52712l implements C52670a<C42303y> {

        /* renamed from: a */
        public static final C30402c f79473a = new C30402c();

        C30402c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C42303y(R.drawable.aoo);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.u$d */
    public static final class C30403d implements C42309a {

        /* renamed from: a */
        final /* synthetic */ Activity f79474a;

        /* renamed from: a */
        public final Activity mo60818a() {
            if (this.f79474a != null) {
                return this.f79474a;
            }
            return C11016e.m22312g();
        }

        C30403d(Activity activity) {
            this.f79474a = activity;
        }
    }

    private C30399u() {
    }

    /* renamed from: b */
    private final C42301x m71326b() {
        return (C42301x) f79467c.getValue();
    }

    /* renamed from: a */
    public final Keva mo60816a() {
        return (Keva) f79469e.getValue();
    }

    /* renamed from: b */
    public final boolean mo60817b(Context context) {
        if (context != null) {
            return m71326b().mo86141a(context);
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m71324a(Context context) {
        if (C47915gg.m103651b() || C10181b.m20511a().mo18168a(InterctionShareButtonWhatsappStyleExperiment.class, true, "interction_share_button_whatsapp_style", 31744, 0) == 0 || !f79466b.mo60817b(context)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006d, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r6, (java.lang.Object) ((com.p683ss.android.ugc.aweme.sharer.p2171a.C42303y) f79468d.getValue()).mo86136b()) != false) goto L_0x006f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m71323a(android.app.Activity r11) {
        /*
            com.ss.android.ugc.aweme.feed.helper.u r0 = f79466b
            com.bytedance.keva.Keva r0 = r0.mo60816a()
            java.lang.String r1 = "KEVA"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.util.Map r0 = r0.getAll()
            if (r0 == 0) goto L_0x00c6
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x001c:
            boolean r4 = r0.hasNext()
            r5 = 1
            if (r4 == 0) goto L_0x00c0
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Object r8 = r4.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            long r6 = r6 - r8
            r8 = 604800000(0x240c8400, double:2.988109026E-315)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x001c
            java.lang.Object r6 = r4.getKey()
            java.lang.String r6 = (java.lang.String) r6
            com.ss.android.ugc.aweme.feed.helper.u r7 = f79466b
            com.ss.android.ugc.aweme.sharer.a.x r7 = r7.m71326b()
            java.lang.String r7 = r7.mo86136b()
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r7)
            if (r6 != 0) goto L_0x006f
            java.lang.Object r6 = r4.getKey()
            java.lang.String r6 = (java.lang.String) r6
            com.ss.android.ugc.aweme.feed.helper.u r7 = f79466b
            d.f r7 = f79468d
            java.lang.Object r7 = r7.getValue()
            com.ss.android.ugc.aweme.sharer.a.y r7 = (com.p683ss.android.ugc.aweme.sharer.p2171a.C42303y) r7
            java.lang.String r7 = r7.mo86136b()
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r7)
            if (r6 == 0) goto L_0x0070
        L_0x006f:
            r2 = 1
        L_0x0070:
            java.util.ArrayList<java.lang.String> r6 = f79470f
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00b1
            com.ss.android.ugc.aweme.feed.helper.u$d r6 = new com.ss.android.ugc.aweme.feed.helper.u$d
            r6.<init>(r11)
            java.util.ArrayList<java.lang.String> r7 = f79470f
            com.ss.android.ugc.aweme.sharer.a.i r8 = new com.ss.android.ugc.aweme.sharer.a.i
            r8.<init>()
            java.lang.String r8 = r8.mo86136b()
            r7.add(r8)
            com.ss.android.ugc.aweme.sharer.a.j r8 = new com.ss.android.ugc.aweme.sharer.a.j
            r8.<init>()
            java.lang.String r8 = r8.mo86136b()
            r7.add(r8)
            com.ss.android.ugc.aweme.sharer.a.d r8 = new com.ss.android.ugc.aweme.sharer.a.d
            com.ss.android.ugc.aweme.sharer.b.a r6 = (com.p683ss.android.ugc.aweme.sharer.p2172b.C42309a) r6
            r8.<init>(r6)
            java.lang.String r6 = r8.mo86136b()
            r7.add(r6)
            com.ss.android.ugc.aweme.sharer.a.e r6 = new com.ss.android.ugc.aweme.sharer.a.e
            r6.<init>()
            java.lang.String r6 = r6.mo86136b()
            r7.add(r6)
        L_0x00b1:
            java.util.ArrayList<java.lang.String> r6 = f79470f
            java.lang.Object r4 = r4.getKey()
            boolean r4 = r6.contains(r4)
            if (r4 == 0) goto L_0x001c
            r3 = 1
            goto L_0x001c
        L_0x00c0:
            if (r2 != 0) goto L_0x00c4
            if (r3 != 0) goto L_0x00c5
        L_0x00c4:
            r1 = 1
        L_0x00c5:
            return r1
        L_0x00c6:
            d.u r11 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Long>"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.helper.C30399u.m71323a(android.app.Activity):boolean");
    }

    /* renamed from: a */
    public static final boolean m71325a(Aweme aweme) {
        boolean z;
        boolean z2;
        boolean z3;
        C52711k.m112240b(aweme, "aweme");
        if (aweme.getAwemeType() == 56) {
            return true;
        }
        User author = aweme.getAuthor();
        C52711k.m112236a((Object) author, "aweme.author");
        long[] typeLabels = author.getTypeLabels();
        if (typeLabels != null) {
            C52711k.m112240b(typeLabels, "$this$contains");
            C52711k.m112240b(typeLabels, "$this$indexOf");
            int length = typeLabels.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (6737595547571456005L == typeLabels[i]) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                return true;
            }
        }
        List<TextExtraStruct> textExtra = aweme.getTextExtra();
        Collection collection = textExtra;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                C52711k.m112236a((Object) textExtraStruct, "textExtraStruct");
                CharSequence hashTagName = textExtraStruct.getHashTagName();
                if (hashTagName == null || C52830p.m112402a(hashTagName)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    String hashTagName2 = textExtraStruct.getHashTagName();
                    C52711k.m112236a((Object) hashTagName2, "textExtraStruct.hashTagName");
                    if (!C52830p.m112456b((CharSequence) hashTagName2, (CharSequence) "status", false, 2, (Object) null)) {
                        String hashTagName3 = textExtraStruct.getHashTagName();
                        C52711k.m112236a((Object) hashTagName3, "textExtraStruct.hashTagName");
                        if (C52830p.m112456b((CharSequence) hashTagName3, (CharSequence) "Status", false, 2, (Object) null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
