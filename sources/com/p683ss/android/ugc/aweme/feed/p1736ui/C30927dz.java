package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.view.View;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.p1420ui.FeedTagLayout2;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dz */
public final class C30927dz extends C31009h implements C0199s<C23274a> {

    /* renamed from: a */
    FeedTagLayout2 f81004a;

    /* renamed from: a */
    public final void mo49781a() {
    }

    public C30927dz(View view) {
        super(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63687a(C30332aw awVar) {
        if (this.f81197q != null) {
            this.f81197q.mo48228a("feed_internal_event", (Object) awVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49783a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.layout_video_tag);
        this.f81004a = (FeedTagLayout2) view2.findViewById(R.id.aep);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo48226a("show_poi_info", (C0199s<C23274a>) this).mo48226a("hide_poi_info", (C0199s<C23274a>) this).mo48226a("on_page_selected", (C0199s<C23274a>) this).mo48226a("show_poi_info_with_expend", (C0199s<C23274a>) this);
            if (this.f81004a != null) {
                this.f81004a.setDataCenter(dataCenter);
            }
        }
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        super.mo58323a(videoItemParams);
        this.f81004a.mo48995a(videoItemParams.curPoiLat, videoItemParams.curPoiLng, videoItemParams.curPoiId);
        this.f81004a.setOnIntervalEventListener(new C30929ea(this));
        this.f81004a.mo48992a(this.f81192l, (Activity) this.f81198r, this.f81193m, this.f81194n);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -2102809467) {
                if (hashCode != -1212389408) {
                    if (hashCode != -1173726595) {
                        if (hashCode == 350216171 && str.equals("on_page_selected")) {
                            c = 3;
                        }
                    } else if (str.equals("show_poi_info_with_expend")) {
                        c = 1;
                    }
                } else if (str.equals("hide_poi_info")) {
                    c = 2;
                }
            } else if (str.equals("show_poi_info")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    if (((Integer) aVar.mo48246a()).intValue() == 1) {
                        this.f81004a.mo48998c();
                        return;
                    }
                    break;
                case 1:
                    this.f81004a.mo48998c();
                    return;
                case 2:
                    if (this.f81004a != null) {
                        this.f81004a.mo48999d();
                        return;
                    }
                    break;
                case 3:
                    if (!(this.f81192l == null || this.f81004a == null)) {
                        this.f81004a.mo48997b();
                        break;
                    }
            }
        }
    }
}
