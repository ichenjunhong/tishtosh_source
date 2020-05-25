package com.p683ss.android.ugc.aweme.discover.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25592b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.C27936b;
import com.p683ss.android.ugc.aweme.discover.mob.C28419x;
import com.p683ss.android.ugc.aweme.discover.model.Banner;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import com.p683ss.android.ugc.aweme.feed.C30686s;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41312z;
import com.p683ss.android.ugc.aweme.utils.C47664ae;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.BannerViewHolder */
public class BannerViewHolder extends C1352v implements C9382a {

    /* renamed from: a */
    protected Banner f72818a;

    /* renamed from: b */
    private int f72819b;

    /* renamed from: c */
    private C9381g f72820c;

    /* renamed from: d */
    private String f72821d = "";
    protected SmartImageView mSdCover;

    /* renamed from: a */
    private static String m66412a() {
        if (!NewDiscoverV4Experiment.m69617a() || NewDiscoverV4Experiment.m69621e()) {
            return "discovery";
        }
        return "discovery_tab";
    }

    public void clickCover() {
        if (!C47915gg.m103651b() && this.f72818a != null && !TextUtils.isEmpty(this.f72818a.getSchema())) {
            StringBuilder sb = new StringBuilder();
            String schema = this.f72818a.getSchema();
            IMiniAppService a = C36983a.m83185b().mo76294a();
            if (C23794bh.m58408v().mo49242a(this.itemView.getContext(), schema, "discover")) {
                C23794bh.m58408v().mo49239a(schema);
                m66413a(schema);
                return;
            }
            if (schema.startsWith("https://") || schema.startsWith("http://")) {
                try {
                    sb.append("aweme://ame/webview/?url=");
                    sb.append(URLEncoder.encode(schema, "ISO-8859-1"));
                    sb.append("&title=");
                    sb.append(URLEncoder.encode(this.f72818a.getTitle(), "UTF-8"));
                } catch (Exception unused) {
                }
                Context context = this.itemView.getContext();
                Intent a2 = C23794bh.m58407u().mo46881a(context, Uri.parse(sb.toString()));
                a2.putExtra("hide_more", false);
                a2.putExtra("enter_from", "banner");
                a2.putExtra("commerce_enter_from", "discover_banner");
                context.startActivity(a2);
            } else if (schema.startsWith("sslocal://studio/task/create") || schema.startsWith("sslocal://studio/create")) {
                if (this.itemView.getContext() instanceof Activity) {
                    C23794bh.m58407u().mo46883a((Activity) this.itemView.getContext(), Uri.parse(schema));
                }
            } else if (schema.startsWith("sslocal://live")) {
                Uri parse = Uri.parse(schema);
                C40733z.f103767a.queryProfileResponseWithDoubleId(this.f72820c, parse.getQueryParameter("user_id"), parse.getQueryParameter("sec_user_id"), "", 0);
            } else if (schema.startsWith("sslocal://showcaseh5")) {
                C25945k.m62914e().mo53189a(this.itemView.getContext(), schema);
            } else if (C36949e.m83168d(schema)) {
                a.openMiniApp(this.itemView.getContext(), schema, new C36961a().mo76222b("banner").mo76221a());
            } else if (schema.startsWith("sslocal://challenge/detail")) {
                sb.append(schema);
                C25945k.m62914e().mo53193a(this.itemView.getContext(), schema, true);
            } else {
                sb.append(schema);
                SmartRoute withParam = SmartRouter.buildRoute(this.itemView.getContext(), sb.toString()).withParam("enter_from", "banner");
                if (C41312z.m91071a("aweme://challenge/detail/:id", sb.toString())) {
                    this.f72821d = UUID.randomUUID().toString();
                    withParam.withParam("process_id", this.f72821d);
                }
                withParam.open();
            }
            m66413a(sb.toString());
        }
    }

    public BannerViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f72820c = new C9381g(Looper.getMainLooper(), this);
    }

    public void handleMsg(Message message) {
        Context context = this.itemView.getContext();
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof ExecutionException) {
            obj = ((ExecutionException) obj).getCause();
        }
        if (obj instanceof C23459a) {
            C10691a.m21545b(context, ((C23459a) obj).getErrorMsg()).mo19066a();
        } else if (obj instanceof Exception) {
            C10691a.m21542b(context, (int) R.string.cg2).mo19066a();
        } else {
            if (i == C40733z.f103767a.getMessageProfile() && (obj instanceof User)) {
                User user = (User) message.obj;
                Bundle bundle = new Bundle();
                bundle.putString("live.intent.extra.REQUEST_ID", this.f72818a.getRequestId());
                C30686s.m71965a(context, user, null, "discovery", bundle);
            }
        }
    }

    /* renamed from: a */
    private void m66413a(String str) {
        C26890h.m65005a((Context) null, "banner_click", "click", Long.toString(this.f72818a.getCreativeId()), (long) (this.f72819b + 1));
        C26890h.m65011a("banner_click", (Map<String, String>) new C28419x().setBannerId(this.f72818a.getBid()).setClientOrder(this.f72819b + 1).setTagId(C47664ae.m103172a(str)).setEnterFrom(m66412a()).buildParams());
        if (this.f72818a.isAd()) {
            C27936b.m66692b(this.itemView.getContext(), this.f72818a, this.f72819b + 1);
        }
        if (C41312z.m91071a("aweme://challenge/detail/:id", str) || str.startsWith("sslocal://challenge/detail")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", "banner");
                jSONObject.put("enter_method", "click_banner");
                jSONObject.put("process_id", this.f72821d);
                jSONObject.put("tag_id", str.substring(str.lastIndexOf(47) + 1));
                jSONObject.put("scene_id", "1008");
                Banner banner = this.f72818a;
                if (banner != null) {
                    String bid = banner.getBid();
                    if (bid != null) {
                        jSONObject.put("banner_id", bid);
                    }
                }
                C26890h.m65012a("enter_tag_detail", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo56171a(Banner banner, int i) {
        if (banner != null && banner != this.f72818a) {
            this.f72818a = banner;
            String schema = this.f72818a.getSchema();
            if (!TextUtils.isEmpty(schema)) {
                C36983a.m83185b().mo76294a().preloadMiniApp(schema);
            }
            this.f72819b = i;
            if (this.f72818a.getBannerUrl() != null && !C9376b.m18558a((Collection<T>) this.f72818a.getBannerUrl().getUrlList())) {
                C12203q.m24645a((Object) C23608p.m57874a(this.f72818a.getBannerUrl())).mo23125b(C47788ct.m103417a(600)).mo23120a(C47788ct.m103417a(600)).mo23119a(true).mo23118a("BannerViewHolder").mo23116a((C12197k) this.mSdCover).mo23121a();
            }
            C25592b bVar = new C25592b((float) C23728o.m58241a(4.0d), this.itemView.getContext().getResources().getColor(R.color.a3a));
            bVar.setAlpha(76);
            DmtTextView dmtTextView = (DmtTextView) this.itemView.findViewById(R.id.xp);
            if (dmtTextView != null) {
                dmtTextView.setBackgroundDrawable(bVar);
                if (this.f72818a.getAdData() == null || this.f72818a.getAdData().getAdLabel() == null) {
                    dmtTextView.setVisibility(8);
                } else {
                    dmtTextView.setText(this.f72818a.getAdData().getAdLabel().text);
                    dmtTextView.setVisibility(0);
                }
            }
        }
    }
}
