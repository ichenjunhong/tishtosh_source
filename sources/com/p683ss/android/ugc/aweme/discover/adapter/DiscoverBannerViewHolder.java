package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.discover.C27936b;
import com.p683ss.android.ugc.aweme.discover.helper.C28209q;
import com.p683ss.android.ugc.aweme.discover.mob.C28419x;
import com.p683ss.android.ugc.aweme.discover.model.Banner;
import com.p683ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.p683ss.android.ugc.aweme.search.C41429i;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45206o;
import com.p683ss.android.ugc.aweme.utils.C47664ae;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder */
public class DiscoverBannerViewHolder extends C1352v {

    /* renamed from: a */
    public static final List<Banner> f72839a = Arrays.asList(new Banner[]{new Banner()});

    /* renamed from: b */
    boolean f72840b = true;

    /* renamed from: c */
    private C27888d f72841c;

    /* renamed from: d */
    private final C28209q f72842d;

    /* renamed from: e */
    private List<Banner> f72843e;

    /* renamed from: f */
    private Context f72844f;

    /* renamed from: g */
    private boolean f72845g = true;
    protected RelativeLayout mBannerLayout;
    IndicatorView mIndicator;
    View mStatusBar;
    TextView mTitle;
    ViewPager mViewPager;

    /* renamed from: a */
    public final void mo56181a(boolean z) {
        if (!z || !this.f72840b) {
            this.f72842d.mo56625b();
            this.mViewPager.setOnTouchListener(null);
            return;
        }
        this.f72842d.mo56624a();
    }

    /* renamed from: b */
    public final void mo56182b(boolean z) {
        if (z && this.mViewPager != null && this.mViewPager.getChildCount() > 0) {
            mo56179a(this.mViewPager.getCurrentItem());
        }
    }

    public DiscoverBannerViewHolder(View view) {
        int i;
        super(view);
        this.f72844f = view.getContext();
        ButterKnife.bind((Object) this, view);
        Context context = this.f72844f;
        TextView textView = this.mTitle;
        RelativeLayout relativeLayout = this.mBannerLayout;
        int a = C9432q.m18670a(context);
        if (C41429i.m91245e()) {
            textView.setVisibility(8);
            i = (int) (((float) a) * 0.34985423f);
        } else {
            textView.setVisibility(8);
            i = (int) (((float) a) * 0.48104957f);
        }
        LayoutParams layoutParams = (LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.height = i;
        relativeLayout.setLayoutParams(layoutParams);
        this.f72842d = new C28209q(this.mViewPager);
        if (VERSION.SDK_INT >= 19) {
            this.mStatusBar.getLayoutParams().height = C9432q.m18695e(view.getContext());
        }
        this.mViewPager.addOnPageChangeListener(new C0997e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                DiscoverBannerViewHolder.this.mo56179a(i);
            }
        });
        C1056u.m3049c((View) this.mIndicator, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo56179a(int i) {
        if (this.f72843e != null && this.f72843e.size() != 0) {
            List<Banner> list = this.f72843e;
            Banner banner = (Banner) list.get(i % list.size());
            int size = (i % this.f72843e.size()) + 1;
            List<Banner> list2 = this.f72843e;
            C0013i.m18a((Callable<TResult>) new C27917n<TResult>(size, banner, C47664ae.m103172a(((Banner) list2.get(i % list2.size())).getSchema())), (Executor) C26890h.m65003a());
            if (banner.isAd()) {
                C27936b.m66689a(this.f72844f, banner, (i % this.f72843e.size()) + 1);
                if (C47915gg.m103651b()) {
                    C23131p.m56692a("ftc_show_banner_ad", "", null);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo56180a(List<Banner> list, boolean z) {
        int i;
        Context context = this.itemView.getContext();
        if (!f72839a.equals(list)) {
            if (this.f72841c == null) {
                this.f72841c = new C27888d(context, LayoutInflater.from(context));
                this.mViewPager.setAdapter(new C45206o(this.f72841c));
            }
            boolean a = C47918gj.m103682a(context);
            if (a) {
                Collections.reverse(list);
            }
            this.f72842d.f74055b = list.size();
            this.f72841c.mo56303a(list);
            this.mIndicator.mo58544a(this.mViewPager);
            IndicatorView indicatorView = this.mIndicator;
            if (list.size() < 2) {
                i = 8;
            } else {
                i = 0;
            }
            indicatorView.setVisibility(i);
            this.f72843e = list;
            if (a) {
                this.mViewPager.setCurrentItem(list.size() - 1);
            }
            if (this.f72845g) {
                if (this.f72843e.size() != 0) {
                    mo56179a(this.mViewPager.getCurrentItem());
                }
                this.f72845g = false;
            }
            mo56181a(true);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m66426a(int i, Banner banner, String str) throws Exception {
        C26890h.onEvent(MobClick.obtain().setEventName("banner_show").setLabelName("discovery").setExtValueLong((long) i).setValue(Long.toString(banner.getCreativeId())));
        C26890h.m65011a("banner_show", (Map<String, String>) new C28419x().setBannerId(banner.getBid()).setTagId(str).setClientOrder(i).buildParams());
        return null;
    }
}
