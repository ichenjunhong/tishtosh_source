package com.p683ss.android.ugc.aweme.tutorial;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.tutorial.C47391g.C47392a;
import com.p683ss.android.ugc.aweme.tutorial.p2374a.C47373a;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.tutorial.e */
public final class C47388e extends C26840g<C47373a> {

    /* renamed from: a */
    public final FragmentActivity f119595a;

    /* renamed from: b */
    private final List<C47373a> f119596b = new ArrayList();

    /* renamed from: c */
    private final Map<Integer, List<C47373a>> f119597c = new LinkedHashMap();

    /* renamed from: d */
    private final Map<Integer, Integer> f119598d = new LinkedHashMap();

    /* renamed from: e */
    private int f119599e;

    /* renamed from: f */
    private final LayoutInflater f119600f;

    /* renamed from: g */
    private final C52671b<C47373a, C52860x> f119601g;

    /* renamed from: com.ss.android.ugc.aweme.tutorial.e$a */
    static final class C47389a extends C52712l implements C52671b<C47373a, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C47388e f119602a;

        C47389a(C47388e eVar) {
            this.f119602a = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            C47373a aVar = (C47373a) obj;
            C52711k.m112240b(aVar, "it");
            if (!C47390f.m102770a(this.f119602a.f119595a)) {
                C10691a.m21543b((Context) this.f119602a.f119595a, (int) R.string.cg1, 0).mo19066a();
            } else {
                C0209x a = C0214z.m440a(this.f119602a.f119595a).mo359a(ShortVideoContextViewModel.class);
                C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
                ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f107134a;
                if (shortVideoContext != null) {
                    str = shortVideoContext.f107131x;
                } else {
                    str = null;
                }
                C41302w.m91042a().mo83861a(C41311y.m91065a("aweme://aweme/detail/0").mo83870a("extra_previous_page", "video_shoot_page").mo83870a("enter_from", "video_tutorial_page").mo83870a("video_from", "from_tutorial_detail").mo83870a("extra_tutorial_id", aVar.f119549a).mo83870a("creation_id", str).mo83871a());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: c */
    public final int mo48636c() {
        return this.f119596b.size();
    }

    /* renamed from: f */
    public final void mo54785f() {
        this.f119596b.clear();
        this.f119598d.clear();
        this.f119597c.clear();
        this.f119599e = 0;
    }

    /* renamed from: e */
    public final void mo94683e(List<C47373a> list) {
        C52711k.m112240b(list, "list");
        this.f119598d.put(Integer.valueOf(this.f119599e), Integer.valueOf(this.f119596b.size()));
        this.f119596b.addAll(list);
        Map<Integer, List<C47373a>> map = this.f119597c;
        int i = this.f119599e;
        this.f119599e = i + 1;
        map.put(Integer.valueOf(i), list);
    }

    public C47388e(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        this.f119595a = fragmentActivity;
        LayoutInflater from = LayoutInflater.from(this.f119595a);
        C52711k.m112236a((Object) from, "LayoutInflater.from(activity)");
        this.f119600f = from;
        this.f119601g = new C47389a(this);
        this.f70683t = this.f119595a.getResources().getColor(R.color.ar7);
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        View inflate = this.f119600f.inflate(R.layout.b7w, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C47391g(inflate, this.f119601g);
    }

    /* renamed from: a */
    public final int mo94682a(int i, List<C47373a> list) {
        int i2;
        int i3;
        C52711k.m112240b(list, "newTutorialList");
        List list2 = (List) this.f119597c.get(Integer.valueOf(i));
        if (list2 != null) {
            this.f119596b.removeAll(list2);
            i2 = list2.size();
        } else {
            i2 = 0;
        }
        List<C47373a> list3 = this.f119596b;
        Integer num = (Integer) this.f119598d.get(Integer.valueOf(i));
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = this.f119596b.size();
        }
        list3.addAll(i3, list);
        this.f119597c.put(Integer.valueOf(i), list);
        return i2;
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        if (vVar != null) {
            C47391g gVar = (C47391g) vVar;
            C47373a aVar = (C47373a) this.f119596b.get(i);
            C52711k.m112240b(aVar, "tutorial");
            C50181a.m108287a(gVar.f119603a, aVar.f119550b);
            gVar.f119604b.setText(aVar.f119551c);
            gVar.f119603a.setOnClickListener(new C47392a(gVar, aVar));
            String str = ((C47373a) this.f119596b.get(i)).f119549a;
            C52711k.m112240b(str, "tutorialId");
            if (C47386c.f119590d.add(str)) {
                C26890h.m65011a("tutorial_show", C23089d.m56640a().mo47829a("creation_id", C47386c.f119587a).mo47829a("shoot_way", C47386c.f119588b).mo47829a("enter_from", "video_tutorial_page").mo47829a("tab_name", C47386c.f119589c).mo47829a("tutorial_id", str).f61491a);
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.tutorial.TutorialViewHolder");
    }
}
