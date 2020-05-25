package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.main.p1938b.C36513a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23238h;
import com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42310b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.eg */
public final class C30938eg extends C30241a {

    /* renamed from: p */
    private final View f81019p;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.eg$a */
    static final class C30939a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30938eg f81020a;

        C30939a(C30938eg egVar) {
            this.f81020a = egVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C42310b.m92909a(view, 1200)) {
                this.f81020a.f79016i.mo48228a("video_more_click", (Object) null);
                this.f81020a.mo63698j();
            }
        }
    }

    /* renamed from: a */
    public final void mo60586a(DataCenter dataCenter) {
        C52711k.m112240b(dataCenter, "dataCenter");
    }

    /* renamed from: e */
    public final void mo60599e() {
    }

    /* renamed from: j */
    public final void mo63698j() {
        String str;
        String str2;
        String str3;
        if (this.f79012e == null) {
            this.f79012e = "";
        }
        String str4 = this.f79012e;
        if (str4 != null) {
            int hashCode = str4.hashCode();
            if (hashCode != -1271119582) {
                if (hashCode == 1691937916 && str4.equals("homepage_hot")) {
                    C23238h hVar = (C23238h) ((C23238h) new C23238h().mo48086d("homepage_hot").mo47954f(this.f79011d).mo48085c((String) this.f79016i.mo48230b("playlist_id", "")).mo48084b((String) this.f79016i.mo48230b("playlist_id_key", "")).mo48083a((String) this.f79016i.mo48230b("playlist_type", "")).mo48100j((String) this.f79016i.mo48230b("tab_name", ""))).mo48101k(C23198ae.m56854b(this.f79011d, this.f79015h));
                    Aweme aweme = this.f79011d;
                    C52711k.m112236a((Object) aweme, "mAweme");
                    if (aweme.getAuthor() == null) {
                        str3 = "";
                    } else {
                        Aweme aweme2 = this.f79011d;
                        C52711k.m112236a((Object) aweme2, "mAweme");
                        User author = aweme2.getAuthor();
                        C52711k.m112236a((Object) author, "mAweme.author");
                        str3 = author.getUid();
                    }
                    hVar.mo48091h(str3).mo48076e();
                    C47718bf.m103288a(new C36513a());
                }
            } else if (str4.equals("homepage_follow")) {
                C23238h hVar2 = (C23238h) ((C23238h) new C23238h().mo48086d("homepage_follow").mo47954f(this.f79011d).mo48085c((String) this.f79016i.mo48230b("playlist_id", "")).mo48084b((String) this.f79016i.mo48230b("playlist_id_key", "")).mo48083a((String) this.f79016i.mo48230b("playlist_type", "")).mo48100j((String) this.f79016i.mo48230b("tab_name", ""))).mo48101k(C23198ae.m56854b(this.f79011d, this.f79015h));
                Aweme aweme3 = this.f79011d;
                C52711k.m112236a((Object) aweme3, "mAweme");
                if (aweme3.getAuthor() == null) {
                    str2 = "";
                } else {
                    Aweme aweme4 = this.f79011d;
                    C52711k.m112236a((Object) aweme4, "mAweme");
                    User author2 = aweme4.getAuthor();
                    C52711k.m112236a((Object) author2, "mAweme.author");
                    str2 = author2.getUid();
                }
                hVar2.mo48091h(str2).mo48076e();
                C47718bf.m103288a(new C36513a());
            }
        }
        if (this.f79022o == 2) {
            C23238h hVar3 = (C23238h) ((C23238h) new C23238h().mo48086d(this.f79012e).mo47954f(this.f79011d).mo48085c((String) this.f79016i.mo48230b("playlist_id", "")).mo48084b((String) this.f79016i.mo48230b("playlist_id_key", "")).mo48083a((String) this.f79016i.mo48230b("playlist_type", "")).mo48100j((String) this.f79016i.mo48230b("tab_name", ""))).mo48101k(C23198ae.m56854b(this.f79011d, this.f79015h));
            Aweme aweme5 = this.f79011d;
            C52711k.m112236a((Object) aweme5, "mAweme");
            if (aweme5.getAuthor() == null) {
                str = "";
            } else {
                Aweme aweme6 = this.f79011d;
                C52711k.m112236a((Object) aweme6, "mAweme");
                User author3 = aweme6.getAuthor();
                C52711k.m112236a((Object) author3, "mAweme.author");
                str = author3.getUid();
            }
            hVar3.mo48091h(str).mo48076e();
        }
        C47718bf.m103288a(new C36513a());
    }

    public C30938eg(View view) {
        C52711k.m112240b(view, "root");
        super(view, C10181b.m20511a().mo18172a(WidgetAsyncAB.class, true, "widget_open", 31744, false));
        this.f81019p = view;
    }

    /* renamed from: a */
    public final void mo60585a(View view) {
        C52711k.m112240b(view, "view");
        this.f79019l = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f79017j, R.layout.b6u);
        this.f79019l.setOnClickListener(new C30939a(this));
    }

    /* renamed from: a */
    public final void mo60584a(int i, C23274a aVar) {
        if (!this.f79010c) {
            this.f79010c = true;
            if (this.f79018k instanceof FrameLayout) {
                ((FrameLayout) this.f79018k).addView(this.f79019l);
            }
            if (!RefineShareInSiteExperiment.INSTANCE.mo73737b()) {
                View view = this.f79018k;
                C52711k.m112236a((Object) view, "mRootView");
                view.setVisibility(8);
            }
        }
        if (aVar != null) {
        }
    }
}
