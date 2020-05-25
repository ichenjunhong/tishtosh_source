package com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1888b;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.C35010e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.share.C35478b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import com.ss.android.ugc.trill.R;
import java.util.Set;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b.a */
public class C35122a extends C35010e {

    /* renamed from: u */
    static final /* synthetic */ C52767h[] f90328u = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35122a.class), "imChannelContainer", "getImChannelContainer()Landroid/widget/RelativeLayout;"))};

    /* renamed from: w */
    public static final C35123a f90329w = new C35123a(null);

    /* renamed from: v */
    public final C42348d f90330v;

    /* renamed from: x */
    private final C52668f f90331x = C52732g.m112285a(new C35124b(this));

    /* renamed from: y */
    private final C35478b f90332y;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b.a$a */
    public static final class C35123a {
        private C35123a() {
        }

        public /* synthetic */ C35123a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b.a$b */
    static final class C35124b extends C52712l implements C52670a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ C35122a f90333a;

        C35124b(C35122a aVar) {
            this.f90333a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RelativeLayout) this.f90333a.findViewById(R.id.ebn);
        }
    }

    public void onCreate(Bundle bundle) {
        View view;
        super.onCreate(bundle);
        C35478b bVar = this.f90332y;
        if (bVar != null) {
            view = bVar.f91193a;
        } else {
            view = null;
        }
        if (view != null) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f90331x.getValue();
            if (relativeLayout != null) {
                relativeLayout.addView(this.f90332y.f91193a);
            }
        }
    }

    public C35122a(Activity activity, C42348d dVar, C35478b bVar, Set<IMContact> set, int i) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(dVar, "config");
        super(activity, dVar.f106953i, set, i);
        this.f90330v = dVar;
        this.f90332y = bVar;
    }
}
