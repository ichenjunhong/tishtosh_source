package com.p683ss.android.ugc.aweme.detail;

import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26990b.C26991a;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.C26988b;
import com.p683ss.android.ugc.aweme.detail.p1619a.C27313b;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.detail.a */
public abstract class C27311a extends C23526a implements C0997e, C26988b {

    /* renamed from: s */
    protected static final String f72034s;

    /* renamed from: A */
    protected ImageView f72035A;

    /* renamed from: B */
    public C0677p f72036B;

    /* renamed from: C */
    protected int f72037C;

    /* renamed from: D */
    protected boolean f72038D = true;

    /* renamed from: E */
    protected List<C27336g> f72039E;

    /* renamed from: F */
    protected List<C23526a> f72040F;

    /* renamed from: G */
    protected String f72041G;

    /* renamed from: H */
    public C27365i f72042H;

    /* renamed from: I */
    protected long f72043I = -1;

    /* renamed from: a */
    private int f72044a;

    /* renamed from: t */
    protected DetailViewModel f72045t;

    /* renamed from: u */
    public ScrollableLayout f72046u;

    /* renamed from: v */
    protected TextView f72047v;

    /* renamed from: w */
    protected View f72048w;

    /* renamed from: x */
    protected ViewPager f72049x;

    /* renamed from: y */
    protected DmtTabLayout f72050y;

    /* renamed from: z */
    ImageView f72051z;

    /* renamed from: Y_ */
    public boolean mo45396Y_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo50606a(int i);

    /* renamed from: a */
    public void mo50608a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo55747a(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo50609a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55748a(View view) {
    }

    public final boolean ap_() {
        return false;
    }

    /* renamed from: c */
    public void mo55749c(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract int mo50618n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract String mo50619o();

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract C0677p mo50625r();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo55750t() {
        return true;
    }

    static {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.ds2);
        sb.append(":");
        f72034s = sb.toString();
    }

    public void onPause() {
        super.onPause();
        if (mo55750t()) {
            mo55751u();
        }
        if (this.f72042H != null) {
            this.f72042H.mo55753a();
        }
    }

    public void onResume() {
        super.onResume();
        this.f72043I = System.currentTimeMillis();
        if (this.f72042H != null) {
            new Handler().postDelayed(new C27319b(this), 500);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo55751u() {
        if (this.f72043I != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f72043I;
            String a = mo50606a(this.f72037C);
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis);
            C26890h.m65007a(getContext(), "stay_time", a, sb.toString(), mo50619o());
            this.f72043I = -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo50624q() {
        if (this.f72046u != null) {
            this.f72046u.setOnScrollListener(this);
        }
        this.f72036B = mo50625r();
        this.f72049x.setAdapter(this.f72036B);
        if (this.f72050y != null) {
            this.f72050y.setVisibility(0);
            this.f72050y.setCustomTabViewResId(R.layout.b8h);
            this.f72050y.setBackgroundColor(getResources().getColor(R.color.a3j));
            this.f72050y.mo19347a(C23728o.m58241a(16.0d), 0, C23728o.m58241a(16.0d), 0);
            DmtTabLayout dmtTabLayout = this.f72050y;
            LinearLayout linearLayout = (LinearLayout) dmtTabLayout.getChildAt(0);
            linearLayout.setShowDividers(2);
            linearLayout.setDividerDrawable(C0726c.m2091a(dmtTabLayout.getContext(), (int) R.drawable.cu0));
            linearLayout.setDividerPadding(C23728o.m58241a(16.0d));
            this.f72050y.setupWithViewPager(this.f72049x);
            this.f72050y.setOnTabClickListener(new C27325c(this));
            this.f72050y.setVisibility(8);
        }
        this.f72049x.addOnPageChangeListener(this);
        this.f72049x.setCurrentItem(this.f72037C);
        onPageSelected(this.f72037C);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo55752v() {
        if (isViewValid()) {
            RecyclerView recyclerView = null;
            if (!(this.f72039E == null || this.f72039E.get(this.f72037C) == null)) {
                recyclerView = (RecyclerView) ((C27336g) this.f72039E.get(this.f72037C)).mo50471l();
            }
            if (recyclerView != null) {
                int childCount = recyclerView.getChildCount();
                if (this.f72046u != null) {
                    if (childCount == 0) {
                        this.f72046u.mo55117a();
                        ((C27336g) this.f72039E.get((this.f72037C + 1) % this.f72039E.size())).mo50470k();
                        this.f72046u.setMaxScrollHeight(0);
                        return;
                    }
                    View g = recyclerView.getLayoutManager().mo5050g(childCount - 1);
                    int childCount2 = this.f72046u.getChildCount();
                    if (childCount2 >= 2 && g != null) {
                        int bottom = (g.getBottom() + this.f72046u.getChildAt(childCount2 - 1).getTop()) - this.f72046u.getCurScrollY();
                        this.f72046u.setMaxScrollHeight(((bottom + this.f72046u.getCurScrollY()) + C9432q.m18695e(getContext())) - C9432q.m18688b(getContext()));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C27365i mo55746a(ViewGroup viewGroup) {
        return new C27313b(getContext(), viewGroup);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("cur_pos", this.f72037C);
        super.onSaveInstanceState(bundle);
    }

    public void onPageSelected(int i) {
        boolean z;
        if (i < 0 || !(this.f72049x == null || this.f72049x.getAdapter() == null || i < this.f72049x.getAdapter().getCount())) {
            i = 0;
        }
        if (!(this.f72043I == -1 || this.f72037C == i)) {
            long currentTimeMillis = System.currentTimeMillis() - this.f72043I;
            String a = mo50606a(this.f72037C);
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis);
            C26890h.m65007a(getContext(), "stay_time", a, sb.toString(), mo50619o());
            this.f72043I = System.currentTimeMillis();
        }
        if (i != this.f72044a) {
            z = true;
        } else {
            z = false;
        }
        mo55747a(i, z);
        this.f72044a = i;
        this.f72037C = i;
        if (this.f72049x.getCurrentItem() != this.f72037C) {
            this.f72049x.setCurrentItem(this.f72037C);
        }
        if (!(this.f72046u == null || this.f72046u.getHelper() == null || this.f72039E == null)) {
            this.f72046u.getHelper().f71219b = (C26991a) this.f72039E.get(this.f72037C);
        }
        if (this.f72042H != null) {
            this.f72042H.mo55754a(i);
        }
        if (!(this.f72036B == null || this.f72049x == null)) {
            int count = this.f72036B.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                Fragment a2 = this.f72036B.mo2309a(i2);
                if (!(a2 == null || a2.getFragmentManager() == null)) {
                    if (i2 == i) {
                        a2.setUserVisibleHint(true);
                        mo50608a(i, a2.hashCode());
                    } else {
                        a2.setUserVisibleHint(false);
                    }
                    ((C27336g) a2).mo50472m();
                }
            }
        }
        mo55752v();
    }

    /* renamed from: b */
    public void mo50613b(int i, int i2) {
        this.f72045t.mo55745a();
    }

    /* renamed from: a */
    public void mo50607a(float f, float f2) {
        mo55752v();
        if (Math.abs(f) < Math.abs(f2) && this.f72038D) {
            if (f2 > 30.0f) {
                if (this.f72042H != null) {
                    this.f72042H.mo55758d();
                }
            } else if (f2 < -30.0f && this.f72042H != null) {
                this.f72042H.mo55757c();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f72046u = (ScrollableLayout) view.findViewById(R.id.chv);
        this.f72047v = (TextView) view.findViewById(R.id.title);
        this.f72048w = view.findViewById(R.id.d16);
        this.f72049x = (ViewPager) view.findViewById(R.id.ds2);
        this.f72050y = (DmtTabLayout) view.findViewById(R.id.cwz);
        this.f72051z = (ImageView) view.findViewById(R.id.cmr);
        this.f72035A = (ImageView) view.findViewById(R.id.ik);
        if (this.f72042H == null) {
            this.f72042H = mo55746a((ViewGroup) view);
        }
        if (bundle != null) {
            this.f72037C = bundle.getInt("cur_pos", 0);
        }
        this.f72045t = (DetailViewModel) C0214z.m440a(getActivity()).mo359a(DetailViewModel.class);
        mo50624q();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mo50609a(getArguments());
        View inflate = layoutInflater.inflate(mo50618n(), viewGroup, false);
        mo55748a(inflate);
        return inflate;
    }
}
