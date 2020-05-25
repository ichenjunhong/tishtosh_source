package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.services.apm.api.C13218a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.p1420ui.FeedTagLayout2;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30256p;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dw */
public final class C30924dw extends C30241a implements C0199s<C23274a> {

    /* renamed from: p */
    FeedTagLayout2 f80999p;

    /* renamed from: e */
    public final void mo60599e() {
    }

    /* renamed from: a */
    public final void mo60587a(VideoItemParams videoItemParams) {
        super.mo60587a(videoItemParams);
    }

    public C30924dw(View view) {
        super(view, C10181b.m20511a().mo18172a(WidgetAsyncAB.class, true, "widget_open", 31744, false));
    }

    /* renamed from: e */
    public final void mo60600e(C23274a aVar) {
        if (aVar != null) {
            C30255o.f79039a.mo60617a(new C30256p(false, new C30926dy(this, aVar.f62242a, aVar)));
        }
    }

    /* renamed from: a */
    public final void mo60585a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f79017j, R.layout.layout_video_tag);
        this.f80999p = (FeedTagLayout2) view2.findViewById(R.id.aep);
        if (this.f80999p != null) {
            this.f80999p.setDataCenter(this.f79016i);
        }
        this.f79019l = view2;
    }

    /* renamed from: a */
    public final void mo60586a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo48226a("show_poi_info", (C0199s<C23274a>) this.f79009b).mo48226a("hide_poi_info", (C0199s<C23274a>) this.f79009b).mo48226a("on_page_selected", (C0199s<C23274a>) this.f79009b).mo48226a("show_poi_info_with_expend", (C0199s<C23274a>) this.f79009b);
            if (this.f80999p != null) {
                this.f80999p.setDataCenter(dataCenter);
            }
        }
    }

    /* renamed from: b */
    public final C23274a mo60590b(C23274a aVar) {
        if (aVar == null) {
            return null;
        }
        super.mo60590b(aVar);
        if (!TextUtils.equals(aVar.f62242a, "video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        C23274a aVar2 = new C23274a("ui_state", hashMap);
        if (this.f79012e == null) {
            C13218a.m26605a("widget event type null ");
            C32458a.m75141a(6, "VideoFeedTagView", "mEventType null");
        }
        int a = this.f80999p.mo48990a(this.f79011d, this.f79012e);
        VideoItemParams videoItemParams = (VideoItemParams) aVar.mo48246a();
        this.f80999p.mo48994a(this.f79011d, this.f79012e, this.f79013f);
        this.f80999p.mo48995a(videoItemParams.curPoiLat, videoItemParams.curPoiLng, videoItemParams.curPoiId);
        this.f80999p.setOnIntervalEventListener(new C30925dx(this));
        hashMap.put("aweme_type_state", Integer.valueOf(a));
        if (a == 0) {
            return aVar2;
        }
        Aweme aweme = this.f79011d;
        String str = this.f79012e;
        JSONObject jSONObject = this.f79013f;
        hashMap.put("aweme_state", aweme);
        hashMap.put("event_type_state", str);
        hashMap.put("req_id_state", jSONObject);
        return aVar2;
    }

    /* renamed from: a */
    public final void mo60584a(int i, C23274a aVar) {
        if (!this.f79010c) {
            this.f79010c = true;
            if (this.f79018k instanceof FrameLayout) {
                ((FrameLayout) this.f79018k).addView(this.f79019l);
            }
        }
        if (aVar != null) {
            HashMap hashMap = (HashMap) aVar.mo48246a();
            int intValue = ((Integer) hashMap.get("aweme_type_state")).intValue();
            if (intValue == 0) {
                FeedTagLayout2 feedTagLayout2 = this.f80999p;
                if (intValue == 0) {
                    feedTagLayout2.mo48996a(false);
                    feedTagLayout2.setVisibility(8);
                    feedTagLayout2.f62863k = false;
                    feedTagLayout2.f62932o = null;
                }
                return;
            }
            this.f80999p.mo48993a((Aweme) hashMap.get("aweme_state"), (Activity) this.f79017j, (String) hashMap.get("event_type_state"), (JSONObject) hashMap.get("req_id_state"), intValue);
        }
    }
}
