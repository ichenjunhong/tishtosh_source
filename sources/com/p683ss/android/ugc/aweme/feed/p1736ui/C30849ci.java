package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0199s;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.utils.C31186b;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ci */
public final class C30849ci extends C31009h implements C0199s<C23274a> {

    /* renamed from: a */
    private View f80796a;

    /* renamed from: a */
    public final void mo49781a() {
    }

    /* renamed from: d */
    private final boolean m72263d() {
        if (!C31186b.m72814b(this.f81192l) || C23794bh.m58381G().mo47241b() != 3) {
            return false;
        }
        return true;
    }

    public C30849ci(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        if (dataCenter != null) {
            C0199s sVar = this;
            DataCenter a = dataCenter.mo48226a("on_viewpager_page_selected", sVar);
            if (a != null) {
                a.mo48226a("startPlayAnimation", sVar);
            }
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        C23274a aVar = (C23274a) obj;
        if (C52711k.m112239a((Object) "homepage_hot", (Object) this.f81193m) && this.f81196p == 0 && this.f81202v == 1) {
            if (aVar != null) {
                str = aVar.f62242a;
            } else {
                str = null;
            }
            m72262a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49783a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b7k);
        C52711k.m112236a((Object) view2, "x2CItemFeed.getView(mCon…_feed_vpa_opted_out_mask)");
        ((DmtTextView) view2.findViewById(R.id.title)).setFontType(C10751d.f28903b);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        this.f80796a = view2;
        View view3 = this.f80796a;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        super.mo58323a(videoItemParams);
        if (C52711k.m112239a((Object) "homepage_hot", (Object) this.f81193m) && this.f81196p == 0 && this.f81202v == 1) {
            m72262a("on_viewpager_page_selected");
        }
    }

    /* renamed from: a */
    private final void m72262a(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1180796502) {
                if (hashCode == 307897710 && str.equals("startPlayAnimation")) {
                    View view = this.f80796a;
                    if (view != null && view.getVisibility() == 0) {
                        if (!C48121w.m104087I()) {
                            C48021h M = C48121w.m104249M();
                            C52711k.m112236a((Object) M, "PlayerManager.inst()");
                            if (M.mo95257o()) {
                                C48121w.m104249M().mo95293z();
                            }
                        } else {
                            C50130a a = C50130a.m108170a();
                            C52711k.m112236a((Object) a, "AppPlayingVideoViewProxy.INSTANCE()");
                            if (a.mo97926b()) {
                                C50130a.m108170a().mo60215af();
                            }
                        }
                    }
                }
            } else if (str.equals("on_viewpager_page_selected")) {
                if (m72263d()) {
                    View view2 = this.f80796a;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    Aweme aweme = this.f81192l;
                    C52711k.m112236a((Object) aweme, "aweme");
                    Aweme aweme2 = this.f81192l;
                    C52711k.m112236a((Object) aweme2, "aweme");
                    C26890h.m65011a("opt_out_layer_show", C23089d.m56640a().mo47829a("enter_from", this.f81193m).mo47829a("group_id", aweme.getAid()).mo47829a("author_id", aweme2.getAuthorUid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56847a(this.f81192l, this.f81196p))).f61491a);
                    return;
                }
                View view3 = this.f80796a;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
        }
    }
}
