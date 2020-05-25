package com.p683ss.android.ugc.aweme.poi.p2074ui.detail;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.p683ss.android.ugc.aweme.app.p1372c.C23059a;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31846h;
import com.p683ss.android.ugc.aweme.music.p1975c.C37355h;
import com.p683ss.android.ugc.aweme.poi.adapter.C38973e.C38974a;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39042b;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39049i;
import com.p683ss.android.ugc.aweme.poi.p2074ui.AbsSlidablePoiAwemeFeedFragment;
import com.p683ss.android.ugc.aweme.poi.p2074ui.PoiOptimizedRoutePresenter;
import com.p683ss.android.ugc.aweme.poi.p2074ui.PoiRouteActivity;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.p2076a.C39320a;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.p2076a.C39321b;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.AppBarLayout;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.AppBarLayout.C39361a;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.C39370a;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.C39367d;
import com.p683ss.android.ugc.aweme.poi.utils.C39462r;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.PoiDetailWithoutMapFragment */
public class PoiDetailWithoutMapFragment extends AbsSlidablePoiAwemeFeedFragment implements C31846h, C38974a, C39319a {

    /* renamed from: C */
    public C39370a f100503C;

    /* renamed from: D */
    public View f100504D;

    /* renamed from: E */
    public int f100505E;

    /* renamed from: F */
    public int f100506F;

    /* renamed from: G */
    public int f100507G;

    /* renamed from: H */
    public int f100508H;

    /* renamed from: I */
    public int f100509I;

    /* renamed from: J */
    int f100510J;

    /* renamed from: K */
    private boolean f100511K;

    /* renamed from: L */
    private String f100512L;

    /* renamed from: M */
    private C39320a f100513M;

    /* renamed from: O */
    private int f100514O;
    AppBarLayout mAppBarLayout;
    public RecyclerView mRecyclerView;
    RelativeLayout mRootLayout;
    protected View mTopbar;
    protected View mTopbarDivider;

    /* renamed from: C */
    public final C38974a mo80011C() {
        return this;
    }

    /* renamed from: D */
    public final C31846h mo80012D() {
        return this;
    }

    /* renamed from: J */
    public final void mo80049J() {
        super.mo80049J();
    }

    /* renamed from: L */
    public final boolean mo80051L() {
        return false;
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo64956a(RecyclerView recyclerView, int i) {
    }

    /* renamed from: b */
    public final void mo64957b(RecyclerView recyclerView, int i) {
    }

    /* renamed from: h */
    public final int mo80029h() {
        return R.layout.bmt;
    }

    /* renamed from: M */
    public static void m87382M() {
        C39321b.m87415a().mo80160b();
    }

    /* renamed from: N */
    public static void m87383N() {
        C39321b.m87415a().mo80161c();
    }

    /* renamed from: a */
    public final int mo64955a() {
        return this.f100505E + this.f100506F;
    }

    public void onDestroy() {
        super.onDestroy();
        C39321b.m87415a().mo80159a(m87384O());
    }

    public void onPause() {
        super.onPause();
        this.f100511K = false;
        m87383N();
    }

    /* renamed from: K */
    public final void mo80050K() {
        int i;
        if (this.f100283m != null) {
            i = this.f100283m.aroundHotPoiCount;
        } else {
            i = 0;
        }
        PoiRouteActivity.m87292a(getContext(), this.f100284n, "poi_page", mo80010A(), true, i);
    }

    public void onResume() {
        super.onResume();
        this.f100511K = true;
        C39321b a = C39321b.m87415a();
        a.f100523b = (C39320a) a.f100522a.get(m87384O());
        m87382M();
    }

    /* renamed from: O */
    private String m87384O() {
        if (TextUtils.isEmpty(this.f100512L)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f100278d.poiId);
            sb.append("-");
            sb.append(System.currentTimeMillis());
            this.f100512L = sb.toString();
        }
        return this.f100512L;
    }

    @C53771m
    public void setInitLocation(C39049i iVar) {
        this.f100507G = iVar.f99547a;
        this.f100508H = iVar.f99548b;
    }

    /* renamed from: a */
    public final boolean mo80023a(PoiDetail poiDetail) {
        boolean a = super.mo80023a(poiDetail);
        if (poiDetail.isCollected()) {
            C39321b.m87415a().mo80159a(m87384O());
        }
        return a;
    }

    /* renamed from: f_ */
    public final void mo80142f_(int i) {
        this.mAppBarLayout.mo80193a(-this.f100505E);
        this.f100304A.postDelayed(new C39353d(this, false, i), 0);
    }

    @C53771m
    public void onAntiCrawlerEvent(C23481a aVar) {
        String str = aVar.f62554a;
        if (str != null && str.contains("/aweme/v1/poi/aweme/?")) {
            C47718bf.m103293f(aVar);
            this.f100275a.mo64889e();
        }
    }

    /* renamed from: c */
    public final void mo80139c(int i) {
        if (isViewValid() && this.f100505E > 0) {
            int i2 = -this.f100505E;
            if (i <= i2) {
                this.mPoiMap.setTranslationY((float) ((-i2) / 2));
                return;
            }
            float f = (float) i2;
            this.mPoiMap.setTranslationY(((-Math.abs((((float) i) * 1.0f) / f)) * f) / 2.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo80141e(int i) {
        C39367d dVar = (C39367d) this.mAppBarLayout.getLayoutParams();
        int height = this.f100504D.getHeight() - i;
        dVar.height = height;
        this.f100505E = height;
        this.mAppBarLayout.setLayoutParams(dVar);
        this.mAppBarLayout.setAnchorHeight(height - this.f100510J);
        this.mAppBarLayout.mo80193a(this.f100510J - height);
    }

    @C53771m
    public void onCollectedPoi(C37355h hVar) {
        if (hVar == null || 1 != hVar.f95316a) {
            C39321b.m87415a().mo80159a(m87384O());
        } else {
            C39321b.m87415a().mo80162d();
        }
        if (this.f100503C != null) {
            this.f100276b.mo80349a(this.mRootLayout, (View) this.f100503C);
        }
    }

    @C53771m
    public void onFeedFinish(C39042b bVar) {
        if (this.f100513M != null && this.f100513M.mo80152c() == 2 && this.f100283m != null && TextUtils.equals(this.f100283m.getPoiId(), bVar.f99537a)) {
            this.f100513M.mo80148a(true);
        }
    }

    /* renamed from: d */
    public final void mo80140d(int i) {
        if (isViewValid() && this.f100505E > 0) {
            boolean a = C39462r.m87772a();
            float height = 1.0f - ((((float) (((this.f100505E + i) - this.mTopbarStatus.getHeight()) - this.f100514O)) * 1.0f) / ((float) ((this.f100510J - this.mTopbarStatus.getHeight()) - this.f100514O)));
            this.mTopbarBg.setAlpha(height);
            this.mTopbarStatus.setAlpha(height);
            PoiOptimizedRoutePresenter poiOptimizedRoutePresenter = this.f100315y;
            if (poiOptimizedRoutePresenter.mTitle != null) {
                poiOptimizedRoutePresenter.mTitle.setAlpha(height);
            }
            if (height > 0.0f) {
                this.mTopbarBg.setVisibility(0);
                this.f100315y.mo80078a(0);
                if (a) {
                    this.mTopCollectImg.setAlpha(height);
                    this.mTopCollectImg.setVisibility(0);
                }
                this.mTopbarDivider.setVisibility(0);
                this.mTopbarDivider.setAlpha(height);
                double d = (double) height;
                if (d > 0.5d) {
                    this.mBackBtn.setImageResource(R.drawable.dfj);
                    this.mBackBtn.setBackgroundResource(R.drawable.dhm);
                    Double.isNaN(d);
                    float f = (float) ((d - 0.5d) * 2.0d);
                    if (f <= 0.2f) {
                        f = 0.2f;
                    }
                    this.mBackBtn.setAlpha(f);
                    return;
                }
                this.mBackBtn.setImageResource(R.drawable.dl_);
                this.mBackBtn.setBackgroundResource(R.drawable.dk0);
                this.mBackBtn.setAlpha(1.0f - (height * 2.0f));
                return;
            }
            this.mBackBtn.setAlpha(1.0f);
            this.mBackBtn.setImageResource(R.drawable.dl_);
            this.mBackBtn.setBackgroundResource(R.drawable.dk0);
            this.mTopbarBg.setVisibility(8);
            this.mTopbarDivider.setVisibility(8);
            this.f100315y.mo80078a(8);
            this.mTopCollectImg.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo79153a(int i, float f) {
        StringBuilder sb = new StringBuilder("PoiDetailWithoutMapFragment/updatePanelHeight...height:");
        sb.append(i);
        sb.append("/panelHeight:");
        sb.append(f);
        if (i > 0) {
            mo80141e(i);
        } else {
            this.mAppBarLayout.post(new C39336c(this));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f100504D = view;
        this.f100514O = getResources().getDimensionPixelSize(R.dimen.vn);
        Resources resources = getResources();
        if (C23059a.m56592a(getContext())) {
            i = R.dimen.lk;
        } else {
            i = R.dimen.lj;
        }
        this.f100505E = resources.getDimensionPixelSize(i);
        this.f100510J = this.f100505E;
        this.mHeader.getLayoutParams().height = this.f100505E;
        AppBarLayout appBarLayout = this.mAppBarLayout;
        C393161 r3 = new C39361a() {
            /* renamed from: a */
            public final void mo80147a(AppBarLayout appBarLayout, int i) {
                if (PoiDetailWithoutMapFragment.this.isViewValid() && PoiDetailWithoutMapFragment.this.mAppBarLayout != null) {
                    StringBuilder sb = new StringBuilder("PoiDetailWithoutMapFragment////");
                    sb.append(i);
                    sb.append("/");
                    sb.append(appBarLayout.getHeight());
                    sb.append("/");
                    sb.append(PoiDetailWithoutMapFragment.this.f100504D.getHeight());
                    sb.append("/");
                    sb.append(PoiDetailWithoutMapFragment.this.mTopbarStatus.getHeight());
                    PoiDetailWithoutMapFragment.this.f100506F = i;
                    PoiDetailWithoutMapFragment.this.mo80036o();
                    PoiDetailWithoutMapFragment.this.mo80139c(i);
                    PoiDetailWithoutMapFragment.this.mo80140d(i);
                    PoiDetailWithoutMapFragment poiDetailWithoutMapFragment = PoiDetailWithoutMapFragment.this;
                    if (poiDetailWithoutMapFragment.isViewValid() && poiDetailWithoutMapFragment.f100505E > 0) {
                        poiDetailWithoutMapFragment.mo80017a(i);
                    }
                    if (!(PoiDetailWithoutMapFragment.this.f100503C == null || PoiDetailWithoutMapFragment.this.f100503C.getParent() == null)) {
                        int[] iArr = new int[2];
                        PoiDetailWithoutMapFragment.this.mTopCollectImg.getLocationOnScreen(iArr);
                        if ((-i) >= appBarLayout.getHeight()) {
                            PoiDetailWithoutMapFragment.this.f100503C.setTranslationX((float) (PoiDetailWithoutMapFragment.this.f100507G - (PoiDetailWithoutMapFragment.this.f100509I / 2)));
                            PoiDetailWithoutMapFragment.this.f100503C.setTranslationY((float) (iArr[1] + PoiDetailWithoutMapFragment.this.mTopCollectImg.getHeight()));
                        } else {
                            PoiDetailWithoutMapFragment.this.f100503C.setTranslationX((float) (PoiDetailWithoutMapFragment.this.f100507G - (PoiDetailWithoutMapFragment.this.f100509I / 2)));
                            PoiDetailWithoutMapFragment.this.f100503C.setTranslationY((float) (PoiDetailWithoutMapFragment.this.f100508H + i));
                        }
                    }
                    LayoutParams layoutParams = PoiDetailWithoutMapFragment.this.mHeader.getLayoutParams();
                    layoutParams.height = PoiDetailWithoutMapFragment.this.f100505E + i;
                    PoiDetailWithoutMapFragment.this.mHeader.setLayoutParams(layoutParams);
                }
            }
        };
        if (appBarLayout.f100602d == null) {
            appBarLayout.f100602d = new ArrayList();
        }
        if (!appBarLayout.f100602d.contains(r3)) {
            appBarLayout.f100602d.add(r3);
        }
        mo80019a((C1340m) new C1340m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (PoiDetailWithoutMapFragment.this.isViewValid() && PoiDetailWithoutMapFragment.this.mAppBarLayout != null) {
                    PoiDetailWithoutMapFragment.this.mo80036o();
                    PoiDetailWithoutMapFragment.this.mo80017a(i2);
                }
            }
        });
        this.mAppBarLayout.f100605g = false;
        C39321b.m87415a();
        m87384O();
        this.f100513M = null;
        if (this.f100513M != null && this.f100513M.mo80149a()) {
            this.f100513M.mo80151b();
        }
        this.mTopbar.setOnLongClickListener(new C39322b(this));
    }
}
