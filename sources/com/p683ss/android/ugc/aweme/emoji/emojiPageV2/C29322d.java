package com.p683ss.android.ugc.aweme.emoji.emojiPageV2;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29361p;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.d */
public final class C29322d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f76733a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29322d.class), "contentView", "getContentView()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29322d.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/emoji/emojiPageV2/BaseEmojiGridAdapter;"))};

    /* renamed from: b */
    public final RecyclerView f76734b;

    /* renamed from: c */
    public final ImageView f76735c;

    /* renamed from: d */
    public final C29326e f76736d;

    /* renamed from: e */
    public final C0184k f76737e;

    /* renamed from: f */
    public final ViewGroup f76738f;

    /* renamed from: g */
    public final SwipeControlledViewPager f76739g;

    /* renamed from: h */
    public final int f76740h;

    /* renamed from: i */
    public final C29361p f76741i;

    /* renamed from: j */
    private final C52668f f76742j = C52732g.m112285a(new C29323a(this));

    /* renamed from: k */
    private final C52668f f76743k;

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.d$a */
    static final class C29323a extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ C29322d f76744a;

        C29323a(C29322d dVar) {
            this.f76744a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return LayoutInflater.from(this.f76744a.f76738f.getContext()).inflate(R.layout.bmb, this.f76744a.f76738f, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.d$b */
    public static final class C29324b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29322d f76745a;

        public C29324b(C29322d dVar) {
            this.f76745a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f76745a.f76741i.mo59290a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.d$c */
    static final class C29325c extends C52712l implements C52670a<C29317a<C29285a>> {

        /* renamed from: a */
        final /* synthetic */ C29322d f76746a;

        C29325c(C29322d dVar) {
            this.f76746a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C29322d dVar = this.f76746a;
            switch (dVar.f76740h) {
                case 1:
                    return new C29333i(dVar.f76737e);
                case 2:
                    return new C29332h(dVar.f76737e);
                case 3:
                    return new C29329f(dVar.f76737e);
                case 4:
                    return new C29330g(dVar.f76737e);
                default:
                    return null;
            }
        }
    }

    /* renamed from: a */
    public final View mo59266a() {
        return (View) this.f76742j.getValue();
    }

    /* renamed from: b */
    public final C29317a<C29285a> mo59267b() {
        return (C29317a) this.f76743k.getValue();
    }

    public C29322d(C0184k kVar, ViewGroup viewGroup, SwipeControlledViewPager swipeControlledViewPager, int i, C29361p pVar) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(viewGroup, "anchorView");
        C52711k.m112240b(swipeControlledViewPager, "viewPager");
        C52711k.m112240b(pVar, "inputBridge");
        this.f76737e = kVar;
        this.f76738f = viewGroup;
        this.f76739g = swipeControlledViewPager;
        this.f76740h = i;
        this.f76741i = pVar;
        View findViewById = mo59266a().findViewById(R.id.ca3);
        C52711k.m112236a((Object) findViewById, "contentView.findViewById(R.id.recyclerView)");
        this.f76734b = (RecyclerView) findViewById;
        View findViewById2 = mo59266a().findViewById(R.id.a44);
        C52711k.m112236a((Object) findViewById2, "contentView.findViewById(R.id.delete_btn)");
        this.f76735c = (ImageView) findViewById2;
        this.f76743k = C52732g.m112285a(new C29325c(this));
        this.f76736d = new C29326e();
    }
}
