package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.choosemusic.adapter.C24827j;
import com.p683ss.android.ugc.aweme.discover.helper.C28209q;
import com.p683ss.android.ugc.aweme.discover.model.Banner;
import com.p683ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45206o;
import com.p683ss.android.ugc.aweme.utils.C47856en;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.BannerView */
public class BannerView {

    /* renamed from: a */
    public static final List<Banner> f66082a = Arrays.asList(new Banner[]{new Banner()});

    /* renamed from: b */
    private C24827j f66083b;

    /* renamed from: c */
    private final C28209q f66084c;

    /* renamed from: d */
    private Context f66085d;

    /* renamed from: e */
    private int f66086e;
    RelativeLayout mBannerLayout;
    IndicatorView mIndicator;
    ViewGroup mLlBannerContainer;
    View mStatusBar;
    ViewPager mViewPager;

    /* renamed from: a */
    public final void mo50930a(List<Banner> list, boolean z) {
        Context context = this.f66085d;
        if (!f66082a.equals(list)) {
            if (this.f66083b == null) {
                this.f66083b = new C24827j(context, LayoutInflater.from(context), this.f66086e);
                this.mViewPager.setAdapter(new C45206o(this.f66083b));
            }
            boolean a = C47918gj.m103682a(context);
            if (a) {
                Collections.reverse(list);
            }
            this.f66084c.f74055b = list.size();
            this.f66083b.mo50710a(list);
            this.mIndicator.mo58544a(this.mViewPager);
            if (a) {
                this.mViewPager.setCurrentItem(list.size() - 1);
            }
            this.f66084c.mo56624a();
        }
    }

    public BannerView(View view, int i) {
        this.f66085d = view.getContext();
        ButterKnife.bind((Object) this, view);
        this.f66086e = i;
        Context context = this.f66085d;
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mLlBannerContainer.getLayoutParams();
        marginLayoutParams.leftMargin = (int) C9432q.m18687b(this.mLlBannerContainer.getContext(), 16.0f);
        marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
        int a = (int) (((float) (C9432q.m18670a(context) - ((int) (C9432q.m18687b(context, 16.0f) * 2.0f)))) * 0.26239067f);
        LayoutParams layoutParams = this.mBannerLayout.getLayoutParams();
        layoutParams.height = a;
        this.mBannerLayout.setLayoutParams(layoutParams);
        if (VERSION.SDK_INT >= 21) {
            this.mBannerLayout.setOutlineProvider(new C47856en((int) C9432q.m18687b(this.f66085d, 2.0f)));
            this.mBannerLayout.setClipToOutline(true);
        }
        this.f66084c = new C28209q(this.mViewPager, 3000);
        if (VERSION.SDK_INT >= 19) {
            this.mStatusBar.getLayoutParams().height = C9432q.m18695e(view.getContext());
        }
        C1056u.m3049c((View) this.mIndicator, 0);
    }
}
