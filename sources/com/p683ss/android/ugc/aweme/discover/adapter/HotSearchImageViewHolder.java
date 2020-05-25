package com.p683ss.android.ugc.aweme.discover.adapter;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRouter;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26009d;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.discover.C27936b;
import com.p683ss.android.ugc.aweme.discover.abtest.EnableHotSearchAwemeBillboardExperiment;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchAdData;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28480ai;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28482ak;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28515aw;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotSearchImageViewHolder */
public class HotSearchImageViewHolder extends C1352v implements GenericLifecycleObserver {

    /* renamed from: a */
    public String f72855a;

    /* renamed from: b */
    public C28482ak f72856b;

    /* renamed from: c */
    boolean f72857c = true;

    /* renamed from: d */
    private C0184k f72858d;

    /* renamed from: e */
    private C27754a f72859e;

    /* renamed from: f */
    private List<HotSearchItem> f72860f;

    /* renamed from: g */
    private long f72861g;
    ImageView ivMore;
    View mHotSearchBoardView;
    RecyclerView mHotSearchCardView;
    DmtTextView mTitle;
    DmtTextView mViewMoreTextView;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotSearchImageViewHolder$a */
    class C27754a extends C1322a<C1352v> {

        /* renamed from: a */
        List<HotSearchItem> f72864a = new ArrayList();

        public final int getItemCount() {
            return 6;
        }

        C27754a() {
            for (int i = 0; i < 6; i++) {
                this.f72864a.add(HotSearchItem.Companion.createPlaceHolder());
            }
        }

        public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new HotSearchImageItemNewViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.btk, viewGroup, false), HotSearchImageViewHolder.this.f72855a, HotSearchImageViewHolder.this.f72856b);
        }

        public final void onBindViewHolder(C1352v vVar, int i) {
            boolean z;
            HotSearchImageItemNewViewHolder hotSearchImageItemNewViewHolder = (HotSearchImageItemNewViewHolder) vVar;
            HotSearchItem hotSearchItem = (HotSearchItem) this.f72864a.get(i);
            if (hotSearchItem != null && !hotSearchItem.isPlaceholder()) {
                hotSearchImageItemNewViewHolder.f72848a = hotSearchItem.getLogPb();
                UrlModel urlModel = hotSearchItem.getUrlModel();
                if (urlModel != null && urlModel.getUrlList() != null && !urlModel.getUrlList().isEmpty()) {
                    Iterator it = urlModel.getUrlList().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!TextUtils.isEmpty((String) it.next())) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    int b = (int) C9432q.m18687b(hotSearchImageItemNewViewHolder.mImageView.getContext(), 100.0f);
                    C23515d.m57670a(hotSearchImageItemNewViewHolder.mImageView, hotSearchItem.getUrlModel(), b, b);
                } else {
                    hotSearchImageItemNewViewHolder.mMaskView.setVisibility(8);
                    hotSearchImageItemNewViewHolder.mImageView.setImageDrawable(hotSearchImageItemNewViewHolder.itemView.getResources().getDrawable(R.color.c8));
                }
                hotSearchImageItemNewViewHolder.mTitleView.setHotSearchItem(hotSearchItem);
                try {
                    hotSearchItem.getHotValue();
                } catch (NumberFormatException unused) {
                }
                hotSearchImageItemNewViewHolder.itemView.setOnTouchListener(new C28515aw(hotSearchItem, i) {

                    /* renamed from: a */
                    final /* synthetic */ HotSearchItem f72851a;

                    /* renamed from: b */
                    final /* synthetic */ int f72852b;

                    /* renamed from: b */
                    public final void mo55272b(View view, MotionEvent motionEvent) {
                        String str;
                        String str2;
                        if (HotSearchImageItemNewViewHolder.this.f72850c != null) {
                            if (this.f72851a.getType() == 0) {
                                HotSearchImageItemNewViewHolder hotSearchImageItemNewViewHolder = HotSearchImageItemNewViewHolder.this;
                                HotSearchItem hotSearchItem = this.f72851a;
                                C26890h.m65011a("hot_search_keyword", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("key_word", hotSearchItem.getWord()).mo47829a("key_word_type", "general_word").mo47826a("order", this.f72852b + 1).mo47829a("enter_from", hotSearchImageItemNewViewHolder.f72849b).f61491a);
                                if (TextUtils.equals(hotSearchImageItemNewViewHolder.f72849b, "hot_search_section_search")) {
                                    str2 = "hot_search_keyword_click";
                                } else {
                                    str2 = "hot_search_keyword_click_detail";
                                }
                                if (hotSearchItem.isAd()) {
                                    HotSearchAdData adData = hotSearchItem.getAdData();
                                    C27936b.m66691a(adData.getClickTrackUrl(), adData.getCreativeId(), adData.getLogExtra());
                                    C26077e.m63190a().mo53582a("result_ad").mo53593b(str2).mo53602g(hotSearchImageItemNewViewHolder.f72849b).mo53604i(hotSearchItem.getAdData().getLogExtra()).mo53580a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo53586a(hotSearchImageItemNewViewHolder.itemView.getContext());
                                    C26077e.m63190a().mo53582a("result_ad").mo53593b("click").mo53604i(hotSearchItem.getAdData().getLogExtra()).mo53580a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo53586a(hotSearchImageItemNewViewHolder.itemView.getContext());
                                }
                                HotSearchImageItemNewViewHolder.this.f72850c.mo56499a(this.f72851a, this.f72852b, HotSearchImageItemNewViewHolder.this.f72849b);
                            } else if (this.f72851a.getType() == 1) {
                                HotSearchImageItemNewViewHolder hotSearchImageItemNewViewHolder2 = HotSearchImageItemNewViewHolder.this;
                                HotSearchItem hotSearchItem2 = this.f72851a;
                                int i = this.f72852b;
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("value", hotSearchItem2.getChallengeId());
                                } catch (JSONException unused) {
                                }
                                C26890h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("hot_search_board").setJsonObject(jSONObject));
                                int i2 = i + 1;
                                C26890h.m65011a("enter_tag_detail", C23089d.m56640a().mo47829a("tag_id", hotSearchItem2.getChallengeId()).mo47826a("order", i2).mo47829a("enter_from", hotSearchImageItemNewViewHolder2.f72849b).mo47829a("log_pb", new C17971f().mo34889b(hotSearchImageItemNewViewHolder2.f72848a)).f61491a);
                                C26890h.m65011a("hot_search_keyword", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("key_word", hotSearchItem2.getWord()).mo47829a("key_word_type", "tag").mo47826a("order", i2).mo47829a("enter_from", hotSearchImageItemNewViewHolder2.f72849b).f61491a);
                                if (hotSearchItem2.isAd()) {
                                    HotSearchAdData adData2 = hotSearchItem2.getAdData();
                                    C27936b.m66691a(adData2.getClickTrackUrl(), adData2.getCreativeId(), adData2.getLogExtra());
                                    if (TextUtils.equals(hotSearchImageItemNewViewHolder2.f72849b, "hot_search_section_search")) {
                                        str = "hot_search_keyword_click";
                                    } else {
                                        str = "hot_search_keyword_click_detail";
                                    }
                                    C26077e.m63190a().mo53582a("result_ad").mo53593b(str).mo53602g(hotSearchImageItemNewViewHolder2.f72849b).mo53604i(hotSearchItem2.getAdData().getLogExtra()).mo53580a(Long.valueOf(hotSearchItem2.getAdData().getCreativeId())).mo53586a(hotSearchImageItemNewViewHolder2.itemView.getContext());
                                    C26077e.m63190a().mo53582a("result_ad").mo53593b("click").mo53604i(hotSearchItem2.getAdData().getLogExtra()).mo53580a(Long.valueOf(hotSearchItem2.getAdData().getCreativeId())).mo53586a(hotSearchImageItemNewViewHolder2.itemView.getContext());
                                }
                                StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
                                sb.append(this.f72851a.getChallengeId());
                                C41302w.m91042a().mo83861a(sb.toString());
                            }
                        }
                    }

                    {
                        this.f72851a = r2;
                        this.f72852b = r3;
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final String mo56183a() {
        if (TextUtils.equals("hot_search_section_discovery", this.f72855a)) {
            return "discovery";
        }
        return this.f72855a;
    }

    /* renamed from: c */
    public final void mo56186c() {
        C26009d.f68671j.mo53461a(this.itemView.getContext());
        C26009d.m63042a(this.itemView, this.f72858d);
    }

    /* renamed from: b */
    public final void mo56185b() {
        boolean z;
        if (!C23718g.m58207b().mo49153d()) {
            C10691a.m21545b(C11010c.m22280a(), this.itemView.getResources().getString(R.string.cg1)).mo19066a();
        }
        SmartRouter.buildRoute(this.itemView.getContext(), "//search/trending").open();
        if (!((Boolean) SharePrefCache.inst().getIsShowRankingIndicator().mo47782d()).booleanValue() || !((Boolean) SharePrefCache.inst().getIsHotSearchAwemeBillboardEnable().mo47782d()).booleanValue() || !C10181b.m20511a().mo18172a(EnableHotSearchAwemeBillboardExperiment.class, true, "enable_hotsearch_aweme_billboard", 31744, false)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            SharePrefCache.inst().getIsShowRankingIndicator().mo47776a(Boolean.valueOf(false));
        }
    }

    /* renamed from: d */
    public final void mo56187d() {
        String str;
        if (System.currentTimeMillis() - this.f72861g >= 2000) {
            this.f72861g = System.currentTimeMillis();
            C26890h.m65011a("hot_search_icon", C23089d.m56640a().mo47829a("action_type", "show").mo47829a("enter_from", mo56183a()).f61491a);
            int i = 0;
            while (i < this.f72860f.size()) {
                HotSearchItem hotSearchItem = (HotSearchItem) this.f72860f.get(i);
                String str2 = "hot_search_keyword";
                C23089d a = C23089d.m56640a().mo47829a("action_type", "show").mo47829a("key_word", hotSearchItem.getWord());
                String str3 = "key_word_type";
                if (hotSearchItem.getType() == 1) {
                    str = "tag";
                } else {
                    str = "general_word";
                }
                i++;
                C26890h.m65011a(str2, a.mo47829a(str3, str).mo47826a("order", i).mo47829a("enter_from", this.f72855a).f61491a);
            }
        }
    }

    /* renamed from: a */
    private void m66433a(boolean z) {
        String str;
        if (TextUtils.equals(this.f72855a, "hot_search_section_search")) {
            str = "hot_search_keyword_show";
        } else {
            str = "hot_search_keyword_show_detail";
        }
        for (int i = 0; i < this.f72860f.size(); i++) {
            HotSearchItem hotSearchItem = (HotSearchItem) this.f72860f.get(i);
            if (hotSearchItem.isAd() && (!hotSearchItem.getHasSentMob() || z)) {
                hotSearchItem.setHasSentMob(true);
                HotSearchAdData adData = hotSearchItem.getAdData();
                C27936b.m66694b(adData.getTrackUrl(), adData.getCreativeId(), adData.getLogExtra());
                C26077e.m63190a().mo53582a("result_ad").mo53593b(str).mo53602g(this.f72855a).mo53604i(hotSearchItem.getAdData().getLogExtra()).mo53580a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo53586a(this.itemView.getContext());
                C26077e.m63190a().mo53582a("result_ad").mo53593b("show").mo53604i(hotSearchItem.getAdData().getLogExtra()).mo53580a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo53586a(this.itemView.getContext());
            }
        }
    }

    /* renamed from: a */
    public final void mo56184a(List<HotSearchItem> list) {
        if ("hot_search_section_discovery".equals(this.f72855a)) {
            mo56186c();
        }
        if (!C9376b.m18558a((Collection<T>) list) && !list.equals(C27923q.f73340a)) {
            ArrayList arrayList = new ArrayList(this.f72860f);
            this.f72860f.clear();
            boolean z = true;
            for (int i = 0; i < Math.min(list.size(), 6); i++) {
                HotSearchItem hotSearchItem = (HotSearchItem) list.get(i);
                if (arrayList.size() != 6 || hotSearchItem != arrayList.get(i)) {
                    z = false;
                }
                this.f72860f.add(hotSearchItem);
            }
            if (!z) {
                C27754a aVar = this.f72859e;
                List<HotSearchItem> list2 = this.f72860f;
                if (!C9376b.m18558a((Collection<T>) list2)) {
                    if (aVar.f72864a == null) {
                        aVar.f72864a = new ArrayList();
                    }
                    aVar.f72864a.clear();
                    aVar.f72864a.addAll(list2);
                }
                this.f72859e.notifyDataSetChanged();
                mo56187d();
                m66433a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        if (aVar.equals(C0177a.ON_RESUME)) {
            if (!this.f72857c && C1056u.m3018B(this.itemView)) {
                m66433a(true);
            }
            this.f72857c = false;
        }
    }

    /* renamed from: a */
    public static HotSearchImageViewHolder m66432a(ViewGroup viewGroup, String str, C28482ak akVar, C0184k kVar) {
        return new HotSearchImageViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.btj, viewGroup, false), str, akVar, kVar);
    }

    private HotSearchImageViewHolder(View view, String str, C28482ak akVar, C0184k kVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f72860f = new ArrayList();
        this.f72855a = str;
        this.f72856b = akVar;
        this.f72858d = kVar;
        if ("hot_search_section_search".equals(this.f72855a)) {
            this.mTitle.setTextSize(1, 17.0f);
            this.mTitle.setCompoundDrawablePadding(0);
            this.mTitle.setCompoundDrawables(null, null, null, null);
            this.mTitle.setTextColor(this.mTitle.getContext().getResources().getColor(R.color.jf));
            this.mViewMoreTextView.setTextColor(this.mViewMoreTextView.getContext().getResources().getColor(R.color.a1a));
            this.ivMore.setImageResource(R.drawable.duy);
            LayoutParams layoutParams = (LayoutParams) this.ivMore.getLayoutParams();
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(0);
            } else {
                layoutParams.leftMargin = 0;
            }
            this.ivMore.setLayoutParams(layoutParams);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mHotSearchBoardView.getLayoutParams();
            marginLayoutParams.topMargin = C23728o.m58241a(10.0d);
            marginLayoutParams.bottomMargin = C23728o.m58241a(16.0d);
            this.mHotSearchBoardView.setLayoutParams(marginLayoutParams);
        }
        this.mHotSearchCardView.setLayoutManager(new WrapGridLayoutManager(this.itemView.getContext(), 3) {
            /* renamed from: e */
            public final boolean mo4742e() {
                return false;
            }

            /* renamed from: f */
            public final boolean mo4745f() {
                return false;
            }
        });
        Context context = this.itemView.getContext();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RectShape());
        shapeDrawable.getPaint().setColor(context.getResources().getColor(R.color.c3));
        int b = (int) C9432q.m18687b(this.itemView.getContext(), 6.0f);
        shapeDrawable.setIntrinsicWidth(b);
        shapeDrawable.setIntrinsicHeight(b);
        this.mHotSearchCardView.mo4798a((C1331h) new C28480ai(shapeDrawable, shapeDrawable));
        this.f72859e = new C27754a();
        this.mHotSearchCardView.setAdapter(this.f72859e);
        this.mHotSearchBoardView.setOnTouchListener(new C28515aw() {
            /* renamed from: b */
            public final void mo55272b(View view, MotionEvent motionEvent) {
                C26890h.m65011a("hot_search_icon", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("enter_from", HotSearchImageViewHolder.this.mo56183a()).mo47829a("enter_method", "click_read_more").f61491a);
                HotSearchImageViewHolder.this.mo56185b();
            }
        });
        this.mTitle.setOnClickListener(new C27922p(this));
        this.f72858d.getLifecycle().mo324a(this);
    }
}
