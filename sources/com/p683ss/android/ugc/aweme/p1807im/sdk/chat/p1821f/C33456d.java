package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.IMMessageBgStyleExperiment;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.f.d */
public final class C33456d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f86706a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33456d.class), "selfConfig", "getSelfConfig()Lcom/ss/android/ugc/aweme/im/sdk/chat/utils/StyleConfig;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33456d.class), "othersConfig", "getOthersConfig()Lcom/ss/android/ugc/aweme/im/sdk/chat/utils/StyleConfig;"))};

    /* renamed from: b */
    public static final C52668f f86707b = C52732g.m112285a(C33458b.f86711a);

    /* renamed from: c */
    public static final C52668f f86708c = C52732g.m112285a(C33457a.f86710a);

    /* renamed from: d */
    public static final C33456d f86709d = new C33456d();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.f.d$a */
    static final class C33457a extends C52712l implements C52670a<C33463g> {

        /* renamed from: a */
        public static final C33457a f86710a = new C33457a();

        C33457a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (!C35279p.m79763a()) {
                switch (C10181b.m20511a().mo18168a(IMMessageBgStyleExperiment.class, true, "im_message_bubble_bg_strategy", 31744, 0)) {
                    case 1:
                        C33463g gVar = new C33463g(R.drawable.d5t, R.color.ayu, R.color.ayv, R.drawable.d5t, R.color.azh, R.color.azj, R.color.azf, R.color.az9, R.color.ayq, R.drawable.d_1, R.drawable.d5o);
                        return gVar;
                    case 2:
                        C33463g gVar2 = new C33463g(R.drawable.d5t, R.color.ayu, R.color.ayv, R.drawable.d5t, R.color.azh, R.color.azj, R.color.azf, R.color.az9, R.color.ayq, R.drawable.d_1, R.drawable.d5o);
                        return gVar2;
                    case 3:
                        C33463g gVar3 = new C33463g(R.drawable.d5t, R.color.ayu, R.color.ayv, R.drawable.d5t, R.color.azh, R.color.azj, R.color.azf, R.color.az9, R.color.ayq, R.drawable.d_1, R.drawable.d5o);
                        return gVar3;
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.f.d$b */
    static final class C33458b extends C52712l implements C52670a<C33463g> {

        /* renamed from: a */
        public static final C33458b f86711a = new C33458b();

        C33458b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (!C35279p.m79763a()) {
                switch (C10181b.m20511a().mo18168a(IMMessageBgStyleExperiment.class, true, "im_message_bubble_bg_strategy", 31744, 0)) {
                    case 1:
                        C33463g gVar = new C33463g(R.drawable.d5u, R.color.ays, R.color.ayt, R.drawable.d5u, R.color.azg, R.color.azi, R.color.aze, R.color.az8, R.color.ayq, R.drawable.d9y, R.drawable.d5n);
                        return gVar;
                    case 2:
                        C33463g gVar2 = new C33463g(R.drawable.d5v, R.color.ays, R.color.ayt, R.drawable.d5t, R.color.azh, R.color.azj, R.color.azf, R.color.az9, R.color.ayq, R.drawable.d9y, R.drawable.d5n);
                        return gVar2;
                    case 3:
                        C33463g gVar3 = new C33463g(R.drawable.d5s, R.color.ayu, R.color.ayv, R.drawable.d5t, R.color.azh, R.color.azj, R.color.azf, R.color.az9, R.color.ayr, R.drawable.d_1, R.drawable.d5o);
                        return gVar3;
                }
            }
            return null;
        }
    }

    private C33456d() {
    }
}
