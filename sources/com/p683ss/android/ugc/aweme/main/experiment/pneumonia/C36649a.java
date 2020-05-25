package com.p683ss.android.ugc.aweme.main.experiment.pneumonia;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.keva.Keva;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.main.experiment.pneumonia.a */
public final class C36649a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f93789a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C36649a.class), "repo", "getRepo()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C36649a f93790b = new C36649a();

    /* renamed from: c */
    private static final String f93791c;

    /* renamed from: d */
    private static final String f93792d;

    /* renamed from: e */
    private static final String f93793e;

    /* renamed from: f */
    private static final int f93794f = C10181b.m20511a().mo18168a(DynamicTabYellowPointVersion.class, true, "special_topic_yellow_point_version", 31744, (int) DynamicTabYellowPointVersion.DEFAULT);

    /* renamed from: g */
    private static final String f93795g;

    /* renamed from: h */
    private static final String f93796h = f93796h;

    /* renamed from: i */
    private static final C52668f f93797i = C52732g.m112285a(C36650a.f93798a);

    /* renamed from: com.ss.android.ugc.aweme.main.experiment.pneumonia.a$a */
    static final class C36650a extends C52712l implements C52670a<Keva> {

        /* renamed from: a */
        public static final C36650a f93798a = new C36650a();

        C36650a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Keva.getRepo("dynamic_tab");
        }
    }

    private C36649a() {
    }

    /* renamed from: a */
    public static final String m82555a() {
        return f93792d;
    }

    static {
        String a = C10181b.m20511a().mo18171a(DynamicTabNameExperiment.class, true, "virus_tab_name", 31744, DynamicTabNameExperiment.DEFAULT);
        C52711k.m112236a((Object) a, "ABManager.getInstance().…meExperiment::class.java)");
        f93791c = a;
        String a2 = C10181b.m20511a().mo18171a(DynamicTabSpecialTopicType.class, true, "special_topic_type", 31744, DynamicTabSpecialTopicType.DEFAULT);
        C52711k.m112236a((Object) a2, "ABManager.getInstance().…ialTopicType::class.java)");
        f93792d = a2;
        String a3 = C10181b.m20511a().mo18171a(DynamicTabBubbleDescExperiment.class, true, "virus_tab_bubble_desc", 31744, DynamicTabBubbleDescExperiment.DEFAULT);
        C52711k.m112236a((Object) a3, "ABManager.getInstance().…scExperiment::class.java)");
        f93793e = a3;
        StringBuilder sb = new StringBuilder("dynamic_tab_bubble_");
        sb.append(f93793e.hashCode());
        f93795g = sb.toString();
    }
}
