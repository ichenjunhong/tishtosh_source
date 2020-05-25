package com.p683ss.android.ugc.aweme.share.improve;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.disableim.ImUnder16Manger;
import com.p683ss.android.ugc.aweme.p1807im.p1808a.C33171a;
import com.p683ss.android.ugc.aweme.p1807im.p1808a.C33178c;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35451f;
import com.p683ss.android.ugc.aweme.p1807im.service.share.C35475a;
import com.p683ss.android.ugc.aweme.p1807im.service.share.p1909b.C35479a;
import com.p683ss.android.ugc.aweme.share.improve.p2162b.C42138d;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42359h;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.b */
public class C42131b extends C42359h {

    /* renamed from: d */
    public C35475a f106592d;

    /* renamed from: g */
    private C42138d f106593g;

    /* renamed from: h */
    private final Activity f106594h;

    public C42131b(Activity activity, C42348d dVar) {
        this(activity, dVar, 0, 4, null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean c = ImUnder16Manger.m76250c();
        if (this.f106982f.f106954j) {
            IIMService d = C33194e.m76279d();
            if (d != null && !d.isImReduction() && !c) {
                Context context = this.f106594h;
                Dialog dialog = this;
                View findViewById = findViewById(R.id.cnf);
                if (findViewById == null) {
                    C52711k.m112234a();
                }
                ViewGroup viewGroup = (ViewGroup) findViewById;
                View findViewById2 = findViewById(R.id.evj);
                if (findViewById2 == null) {
                    C52711k.m112234a();
                }
                ViewGroup viewGroup2 = (ViewGroup) findViewById2;
                View findViewById3 = findViewById(R.id.cnc);
                if (findViewById3 == null) {
                    C52711k.m112234a();
                }
                C33178c cVar = new C33178c(context, dialog, viewGroup, viewGroup2, findViewById3, this.f106982f.f106953i, this.f106982f.f106957m);
                C33171a aVar = new C33171a(cVar);
                IIMService d2 = C33194e.m76279d();
                C52711k.m112236a((Object) d2, "IM.get()");
                C35451f shareService = d2.getShareService();
                Activity activity = this.f106594h;
                View findViewById4 = findViewById(R.id.cnl);
                if (findViewById4 == null) {
                    C52711k.m112234a();
                }
                ViewGroup viewGroup3 = (ViewGroup) findViewById4;
                View findViewById5 = findViewById(R.id.cnb);
                if (findViewById5 == null) {
                    C52711k.m112234a();
                }
                ViewGroup viewGroup4 = (ViewGroup) findViewById5;
                View findViewById6 = findViewById(R.id.cnd);
                if (findViewById6 == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) findViewById6, "findViewById<FrameLayout…panel_cancel_container)!!");
                FrameLayout frameLayout = (FrameLayout) findViewById6;
                SharePackage sharePackage = this.f106982f.f106953i;
                boolean z = this instanceof C42146c;
                View findViewById7 = findViewById(R.id.cnh);
                if (findViewById7 == null) {
                    C52711k.m112234a();
                }
                C35479a aVar2 = new C35479a(activity, sharePackage, viewGroup3, viewGroup4, frameLayout, z, (MeasureLinearLayout) findViewById7);
                this.f106592d = shareService.mo72376a(aVar2, aVar);
                C42138d dVar = this.f106593g;
                if (dVar != null) {
                    dVar.f106601a = this.f106592d;
                }
                return;
            }
        }
        C42138d dVar2 = this.f106593g;
        if (dVar2 != null) {
            dVar2.f106602b = false;
        }
    }

    public C42131b(Activity activity, C42348d dVar, int i) {
        boolean z;
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(dVar, "config");
        super(activity, i, dVar);
        this.f106594h = activity;
        Iterable iterable = dVar.f106945a;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((C42307b) next) instanceof C42138d) {
                arrayList.add(next);
            }
        }
        List list = (List) arrayList;
        if (list.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            list = null;
        }
        if (list != null) {
            Object obj = list.get(0);
            if (obj != null) {
                this.f106593g = (C42138d) obj;
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.channel.ImChannel");
            }
        }
        if (this.f106593g != null) {
            boolean c = ImUnder16Manger.m76250c();
            IIMService d = C33194e.m76279d();
            if ((d != null && d.isImReduction()) || c) {
                List<C42307b> list2 = dVar.f106945a;
                C42138d dVar2 = this.f106593g;
                if (dVar2 == null) {
                    C52711k.m112234a();
                }
                list2.remove(dVar2);
                this.f106593g = null;
            }
        }
    }

    public /* synthetic */ C42131b(Activity activity, C42348d dVar, int i, int i2, C52707g gVar) {
        this(activity, dVar, R.style.to);
    }
}
