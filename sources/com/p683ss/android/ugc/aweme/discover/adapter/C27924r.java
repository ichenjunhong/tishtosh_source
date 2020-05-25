package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRouter;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.discover.abtest.EnableHotSearchAwemeBillboardExperiment;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchAdData;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28482ak;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28515aw;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.widget.flowlayout.C48393a;
import com.p683ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import com.ss.android.ugc.trill.R;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.r */
public final class C27924r extends C27901h<HotSearchItem> {

    /* renamed from: g */
    public String f73341g;

    /* renamed from: h */
    public C28482ak f73342h;

    /* renamed from: a */
    public final void mo56310a() {
        C26890h.m65011a("hot_search_icon", C23089d.m56640a().mo47829a("action_type", "show").f61491a);
        super.mo56310a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo56313b(List<HotSearchItem> list) {
        if (!list.equals(C27923q.f73340a)) {
            return false;
        }
        C23729p.m58257a(this.f73281b, 0);
        C23729p.m58257a((View) this.f73282c, 8);
        return true;
    }

    /* renamed from: c */
    public final void mo56314c(List<HotSearchItem> list) {
        C23729p.m58257a((View) this.f73282c, 0);
        C23729p.m58257a(this.f73281b, 8);
        this.f73285f = list;
        this.f73282c.setAdapter(new C48393a<HotSearchItem>(list) {
            /* renamed from: a */
            public final /* synthetic */ View mo56339a(FlowLayout flowLayout, final int i, Object obj) {
                final HotSearchItem hotSearchItem = (HotSearchItem) obj;
                View inflate = LayoutInflater.from(C27924r.this.itemView.getContext()).inflate(R.layout.bs3, flowLayout, false);
                TextView textView = (TextView) inflate.findViewById(R.id.dac);
                TextView textView2 = (TextView) inflate.findViewById(R.id.dh0);
                if (hotSearchItem.getType() == 0) {
                    Context context = C27924r.this.itemView.getContext();
                    hotSearchItem.getLabel();
                    C52711k.m112240b(context, "context");
                } else if (hotSearchItem.getType() == 1) {
                    textView2.setVisibility(8);
                    textView.setCompoundDrawablesWithIntrinsicBounds(C27924r.this.itemView.getResources().getDrawable(R.drawable.dth), null, null, null);
                }
                textView.setText(hotSearchItem.getWord());
                inflate.setOnTouchListener(new C28515aw() {
                    /* renamed from: b */
                    public final void mo55272b(View view, MotionEvent motionEvent) {
                        String str;
                        String str2;
                        if (C27924r.this.f73342h == null) {
                            return;
                        }
                        if (hotSearchItem.getType() == 0) {
                            C27924r rVar = C27924r.this;
                            HotSearchItem hotSearchItem = hotSearchItem;
                            C26890h.m65011a("hot_search_keyword", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("key_word", hotSearchItem.getWord()).mo47829a("key_word_type", "general_word").mo47826a("order", i + 1).mo47829a("enter_from", rVar.f73341g).f61491a);
                            if (TextUtils.equals(rVar.f73341g, "hot_search_section_search")) {
                                str2 = "hot_search_keyword_click";
                            } else {
                                str2 = "hot_search_keyword_click_detail";
                            }
                            if (hotSearchItem.isAd()) {
                                HotSearchAdData adData = hotSearchItem.getAdData();
                                C25945k.m62911b().mo53129a("click", adData.getClickTrackUrl(), Long.valueOf(adData.getCreativeId()), adData.getLogExtra(), C27929t.f73349a);
                                C26077e.m63190a().mo53582a("result_ad").mo53593b(str2).mo53602g(rVar.f73341g).mo53604i(hotSearchItem.getAdData().getLogExtra()).mo53580a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo53586a(rVar.itemView.getContext());
                                C26077e.m63190a().mo53582a("result_ad").mo53593b("click").mo53604i(hotSearchItem.getAdData().getLogExtra()).mo53580a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo53586a(rVar.itemView.getContext());
                            }
                            C27924r.this.f73342h.mo56499a(hotSearchItem, i, C27924r.this.f73341g);
                            return;
                        }
                        if (hotSearchItem.getType() == 1) {
                            C27924r rVar2 = C27924r.this;
                            HotSearchItem hotSearchItem2 = hotSearchItem;
                            int i = i;
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("value", hotSearchItem2.getChallengeId());
                            } catch (JSONException unused) {
                            }
                            C26890h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("hot_search_board").setJsonObject(jSONObject));
                            int i2 = i + 1;
                            C26890h.m65011a("enter_tag_detail", C23089d.m56640a().mo47829a("tag_id", hotSearchItem2.getChallengeId()).mo47826a("order", i2).mo47829a("enter_from", rVar2.f73341g).mo47829a("log_pb", new C17971f().mo34889b(hotSearchItem2.getLogPb())).f61491a);
                            C26890h.m65011a("hot_search_keyword", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("key_word", hotSearchItem2.getWord()).mo47829a("key_word_type", "tag").mo47826a("order", i2).mo47829a("enter_from", rVar2.f73341g).f61491a);
                            if (hotSearchItem2.isAd()) {
                                if (TextUtils.equals(rVar2.f73341g, "hot_search_section_search")) {
                                    str = "hot_search_keyword_click";
                                } else {
                                    str = "hot_search_keyword_click_detail";
                                }
                                HotSearchAdData adData2 = hotSearchItem2.getAdData();
                                C25945k.m62911b().mo53129a("click", adData2.getClickTrackUrl(), Long.valueOf(adData2.getCreativeId()), adData2.getLogExtra(), C27930u.f73350a);
                                C26077e.m63190a().mo53582a("result_ad").mo53593b(str).mo53602g(rVar2.f73341g).mo53604i(hotSearchItem2.getAdData().getLogExtra()).mo53580a(Long.valueOf(hotSearchItem2.getAdData().getCreativeId())).mo53586a(rVar2.itemView.getContext());
                                C26077e.m63190a().mo53582a("result_ad").mo53593b("click").mo53604i(hotSearchItem2.getAdData().getLogExtra()).mo53580a(Long.valueOf(hotSearchItem2.getAdData().getCreativeId())).mo53586a(rVar2.itemView.getContext());
                            }
                            StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
                            sb.append(hotSearchItem.getChallengeId());
                            C41302w.m91042a().mo83861a(sb.toString());
                        }
                    }
                });
                return inflate;
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo56311a(Object obj, int i) {
        String str;
        String str2;
        HotSearchItem hotSearchItem = (HotSearchItem) obj;
        if (!hotSearchItem.getHasSentMob()) {
            hotSearchItem.setHasSentMob(true);
            String str3 = "hot_search_keyword";
            C23089d a = C23089d.m56640a().mo47829a("action_type", "show").mo47829a("key_word", hotSearchItem.getWord());
            String str4 = "key_word_type";
            if (hotSearchItem.getType() == 1) {
                str = "tag";
            } else {
                str = "general_word";
            }
            C26890h.m65011a(str3, a.mo47829a(str4, str).mo47826a("order", i + 1).mo47829a("enter_from", this.f73341g).f61491a);
            if (TextUtils.equals(this.f73341g, "hot_search_section_search")) {
                str2 = "hot_search_keyword_show";
            } else {
                str2 = "hot_search_keyword_show_detail";
            }
            if (hotSearchItem.isAd()) {
                HotSearchAdData adData = hotSearchItem.getAdData();
                C25945k.m62911b().mo53129a("show", adData.getTrackUrl(), Long.valueOf(adData.getCreativeId()), adData.getLogExtra(), (C52682m<Object, Boolean, Object>) new C27928s<Object,Boolean,Object>(adData));
                C26077e.m63190a().mo53582a("result_ad").mo53593b(str2).mo53602g(this.f73341g).mo53604i(hotSearchItem.getAdData().getLogExtra()).mo53580a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo53586a(this.itemView.getContext());
                C26077e.m63190a().mo53582a("result_ad").mo53593b("show").mo53604i(hotSearchItem.getAdData().getLogExtra()).mo53580a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo53586a(this.itemView.getContext());
            }
        }
    }

    public C27924r(View view, String str, C28482ak akVar) {
        super(view);
        this.f73341g = str;
        this.f73342h = akVar;
        boolean z = true;
        this.f73280a.getPaint().setFakeBoldText(true);
        this.f73283d.setOnTouchListener(new C28515aw() {
            /* renamed from: b */
            public final void mo55272b(View view, MotionEvent motionEvent) {
                boolean z;
                C26890h.m65011a("hot_search_icon", C23089d.m56640a().mo47829a("action_type", "click").f61491a);
                if (!C23718g.m58207b().mo49153d()) {
                    C10691a.m21545b(C11010c.m22280a(), C27924r.this.itemView.getResources().getString(R.string.cg1)).mo19066a();
                }
                SmartRouter.buildRoute(C27924r.this.itemView.getContext(), "//search/trending").open();
                if (!((Boolean) SharePrefCache.inst().getIsShowRankingIndicator().mo47782d()).booleanValue() || !((Boolean) SharePrefCache.inst().getIsHotSearchAwemeBillboardEnable().mo47782d()).booleanValue() || !C10181b.m20511a().mo18172a(EnableHotSearchAwemeBillboardExperiment.class, true, "enable_hotsearch_aweme_billboard", 31744, false)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    SharePrefCache.inst().getIsShowRankingIndicator().mo47776a(Boolean.valueOf(false));
                }
            }
        });
        if (!TextUtils.equals(this.f73341g, "hot_search_general_search") && !TextUtils.equals(this.f73341g, "hot_search_video_search")) {
            z = false;
        }
        if (z) {
            this.f73280a.setText(R.string.bci);
            this.f73283d.setVisibility(8);
        } else {
            this.f73283d.setVisibility(0);
        }
        if (TextUtils.equals(this.f73341g, "hot_search_section_discovery")) {
            C23729p.m58257a(this.f73284e, 0);
        } else {
            C23729p.m58257a(this.f73284e, 8);
        }
    }
}
