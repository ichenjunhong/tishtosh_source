package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.widget.C13376b;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.p1598j.C26899a;
import com.p683ss.android.ugc.aweme.common.p1598j.C26899a.C26900a;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.C26988b;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.main.experiment.ReleaseWindowBackgroundExperiment;
import com.p683ss.android.ugc.aweme.p1402b.C23344b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39980n;
import com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel.C40607h;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.t */
public abstract class C40392t extends C40356dw implements C0997e, OnClickListener, C26988b, C39980n {

    /* renamed from: a */
    protected static final String f103057a;

    /* renamed from: A */
    protected ProfileViewModel f103058A;

    /* renamed from: B */
    protected C13376b f103059B;

    /* renamed from: C */
    private ViewGroup f103060C;

    /* renamed from: D */
    private ViewGroup f103061D;

    /* renamed from: E */
    private ViewGroup f103062E;

    /* renamed from: F */
    private boolean f103063F = C10181b.m20511a().mo18172a(ReleaseWindowBackgroundExperiment.class, true, "is_release_window_background", 31744, true);

    /* renamed from: b */
    public View f103064b;

    /* renamed from: c */
    public DampScrollableLayout f103065c;

    /* renamed from: d */
    public TextView f103066d;

    /* renamed from: e */
    public List<C40321dd> f103067e;

    /* renamed from: j */
    protected List<Integer> f103068j;

    /* renamed from: k */
    protected int f103069k;

    /* renamed from: l */
    protected int f103070l;

    /* renamed from: m */
    protected TextView f103071m;

    /* renamed from: n */
    protected TextView f103072n;

    /* renamed from: o */
    protected TextView f103073o;

    /* renamed from: p */
    protected TextView f103074p;

    /* renamed from: q */
    protected View f103075q;

    /* renamed from: r */
    public TextView f103076r;

    /* renamed from: s */
    protected String f103077s;

    /* renamed from: t */
    protected int f103078t;

    /* renamed from: u */
    protected int f103079u;

    /* renamed from: v */
    protected String f103080v;

    /* renamed from: w */
    public User f103081w;

    /* renamed from: x */
    protected boolean f103082x;

    /* renamed from: y */
    protected int f103083y;

    /* renamed from: z */
    protected DataCenter f103084z;

    /* renamed from: i */
    protected static int m89736i(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 5;
            case 2:
                return 1;
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
                return 7;
            case 7:
                return 10;
            case 8:
                return 13;
            case 9:
                return 12;
            case 10:
                return 14;
            default:
                return -1;
        }
    }

    /* renamed from: Y_ */
    public boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public void mo81892a(boolean z, boolean z2, boolean z3) {
    }

    /* renamed from: b */
    public void mo81897b(boolean z) {
    }

    /* renamed from: c */
    public void mo81898c() {
    }

    /* renamed from: d */
    public void mo81903d(User user) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo82450f(User user) {
    }

    /* renamed from: g */
    public void mo82164g(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo82165h(int i);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo82451h(User user);

    /* renamed from: h */
    public boolean mo82166h() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo82167i();

    /* renamed from: j */
    public abstract void mo82454j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo82168k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo82169l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo82170m();

    public void onPageScrollStateChanged(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo82620a(C40321dd ddVar, Integer num) {
        if (this.f103068j.contains(num)) {
            int indexOf = this.f103068j.indexOf(num);
            this.f103067e.remove(indexOf);
            this.f103068j.remove(indexOf);
        }
        this.f103067e.add(ddVar);
        this.f103068j.add(num);
    }

    /* renamed from: e */
    public final boolean mo81905e() {
        return isViewValid();
    }

    static {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.ci0);
        sb.append(":");
        f103057a = sb.toString();
    }

    /* renamed from: f */
    public final C13376b mo82622f() {
        if (this.f103059B == null && getView() != null) {
            this.f103059B = C13376b.f34879h.mo25076a(this, getView());
        }
        return this.f103059B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo82163g() {
        this.f103065c.setLayoutParams(new LayoutParams(-1, -2));
        mo82454j();
        mo82624n();
        mo81899c(0);
        mo81902d(0);
        mo81896b("");
    }

    /* renamed from: n */
    public final void mo82624n() {
        if (this.f103071m != null) {
            this.f103071m.setText("-");
        }
        if (this.f103072n != null) {
            this.f103072n.setText("-");
        }
        if (this.f103073o != null) {
            this.f103073o.setText("-");
        }
        this.f103080v = "0";
    }

    /* renamed from: c */
    public final void mo81900c(User user) {
        this.f103081w = user;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f103058A = ProfileViewModel.m90030a((Fragment) this);
    }

    /* renamed from: b */
    public void mo81893b(int i) {
        if (isViewValid()) {
            if (i < 0) {
                i = 0;
            }
            this.f103069k = i;
            this.f103071m.setText(C33095b.m76068a((long) i));
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("profile_cur_pos", this.f103078t);
        bundle.putInt("indicator_scroll_maxx", this.f103079u);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    private static List<Integer> mo50432a(String str) {
        if (TextUtils.equals(str, C20854a.m53167g().getCurUserId())) {
            return new ArrayList(C23183v.m56778a().mo47903N().mo47782d());
        }
        return new ArrayList(C23183v.m56778a().mo47904O().mo47782d());
    }

    /* renamed from: b */
    public void mo81895b(Exception exc) {
        if (exc instanceof C23459a) {
            C23459a aVar = (C23459a) exc;
            int errorCode = aVar.getErrorCode();
            if (!TextUtils.isEmpty(aVar.getErrorMsg()) && getContext() != null && errorCode != 3070 && errorCode != 3071 && errorCode != 3072) {
                C10691a.m21545b(getContext(), aVar.getErrorMsg()).mo19066a();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f103077s = arguments.getString("from");
            this.f103058A.mo22530c(new C40607h(this.f103077s));
        }
        this.f103084z = DataCenter.m57235a(C0214z.m438a((Fragment) this), (C0184k) this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f103067e != null && this.f103078t >= 0 && this.f103078t < this.f103067e.size()) {
            C40321dd ddVar = (C40321dd) this.f103067e.get(this.f103078t);
            if (ddVar != null) {
                ddVar.setUserVisibleHint(z);
            }
        }
    }

    /* renamed from: i */
    private static int mo82452i(User user) {
        int i;
        if (user == null || user.getTabSetting() == null || user.getTabSetting().getPrivateTab() == null) {
            i = 1;
        } else {
            i = user.getTabSetting().getPrivateTab().getPrivateTabStyle();
        }
        if (i <= 0 || i > 3) {
            return 1;
        }
        return i;
    }

    /* renamed from: a */
    public void mo81885a(int i) {
        if (isViewValid()) {
            if (i < 0) {
                i = 0;
            }
            this.f103070l = i;
            this.f103072n.setText(C33095b.m76068a((long) i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo82160b(View view) {
        this.f103071m = (TextView) view.findViewById(R.id.aip);
        this.f103072n = (TextView) view.findViewById(R.id.aik);
        this.f103062E = (ViewGroup) view.findViewById(R.id.a8q);
        this.f103073o = (TextView) view.findViewById(R.id.a55);
        this.f103074p = (TextView) view.findViewById(R.id.dns);
        this.f103061D = (ViewGroup) view.findViewById(R.id.aim);
        this.f103060C = (ViewGroup) view.findViewById(R.id.air);
        this.f103075q = view.findViewById(R.id.c5j);
        this.f103076r = (TextView) view.findViewById(R.id.dmq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo82621c(String str) {
        List<Integer> a = mo50432a(str);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            if (!m89735a(str, ((Integer) it.next()).intValue())) {
                it.remove();
            }
        }
        this.f103067e = new ArrayList(a.size());
        this.f103068j = new ArrayList(a.size());
        for (Integer intValue : a) {
            mo82165h(intValue.intValue());
        }
    }

    @C53771m
    public void onNeedScrollToTop(C40328dk dkVar) {
        boolean z;
        if (this.f103081w == null || !C20854a.m53167g().isLogin() || !C47915gg.m103664m(this.f103081w)) {
            z = false;
        } else {
            z = true;
        }
        if (this.f103065c != null && z == dkVar.f102934a) {
            DampScrollableLayout dampScrollableLayout = this.f103065c;
            C52847n nVar = new C52847n(Float.valueOf(1.0f), Float.valueOf(1.0f));
            C52847n nVar2 = new C52847n(Float.valueOf(1.0f), Float.valueOf(-3000.0f));
            C26900a aVar = C26899a.f70756a;
            C52711k.m112240b(dampScrollableLayout, "targetView");
            C52711k.m112240b(nVar, "fromPosition");
            C52711k.m112240b(nVar2, "toPosition");
            C26900a aVar2 = aVar;
            dampScrollableLayout.dispatchTouchEvent(C26900a.m65027a(0, ((Number) nVar.getFirst()).floatValue(), ((Number) nVar.getSecond()).floatValue()));
            dampScrollableLayout.dispatchTouchEvent(C26900a.m65027a(2, ((Number) nVar2.getFirst()).floatValue(), ((Number) nVar2.getSecond()).floatValue()));
            dampScrollableLayout.dispatchTouchEvent(C26900a.m65027a(1, ((Number) nVar2.getFirst()).floatValue(), ((Number) nVar2.getSecond()).floatValue()));
        }
    }

    /* renamed from: a */
    public void mo81888a(long j) {
        if (isViewValid()) {
            this.f103080v = C33095b.m76068a(j);
            this.f103073o.setText(this.f103080v);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo82156a(View view) {
        this.f103064b = view.findViewById(R.id.csm);
        this.f103065c = (DampScrollableLayout) view.findViewById(R.id.chv);
        this.f103066d = (TextView) view.findViewById(R.id.title);
        this.f103065c.setOnScrollListener(this);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        if (r6 != false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f4, code lost:
        if (r6 != false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0129, code lost:
        if (r6 != false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013e, code lost:
        if (r13.getTabSetting().isHideLikeTab() != false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014f, code lost:
        if (r13.isEffectArtist() == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0158, code lost:
        if (r13.getShowArtistPlaylist() == 1) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0167, code lost:
        if (mo82452i(r13) != 3) goto L_0x00f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0086 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0174  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82623g(com.p683ss.android.ugc.aweme.profile.model.User r13) {
        /*
            r12 = this;
            java.lang.String r0 = r13.getUid()
            java.util.List r0 = mo50432a(r0)
            r1 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r2 = r0.contains(r2)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0082
            com.ss.android.ugc.aweme.profile.service.f r2 = com.p683ss.android.ugc.aweme.profile.service.C40013f.f101954a
            boolean r2 = r2.mo82006b(r13)
            if (r2 == 0) goto L_0x0082
            boolean r2 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103664m(r13)
            if (r2 != 0) goto L_0x005a
            com.ss.android.ugc.aweme.profile.service.f r2 = com.p683ss.android.ugc.aweme.profile.service.C40013f.f101954a
            boolean r6 = r13.isWithCommerceEntry()
            boolean r7 = r13.isWithFusionShopEntry()
            boolean r2 = r2.mo82005a(r6, r7, r13)
            if (r2 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.profile.service.f r2 = com.p683ss.android.ugc.aweme.profile.service.C40013f.f101954a
            boolean r2 = r2.mo82004a(r13)
            if (r2 == 0) goto L_0x005a
            com.bytedance.ies.abmock.b r6 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.ab.ProfileEcommerceEntranceAB> r7 = com.p683ss.android.ugc.aweme.commerce.service.p1535ab.ProfileEcommerceEntranceAB.class
            r8 = 1
            java.lang.String r9 = "preferred_show_goods_tab"
            r10 = 31744(0x7c00, float:4.4483E-41)
            r11 = 1
            int r2 = r6.mo18168a(r7, r8, r9, r10, r11)
            if (r2 == r5) goto L_0x005a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            int r2 = r0.indexOf(r2)
            r0.remove(r2)
            goto L_0x0082
        L_0x005a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            int r2 = r0.indexOf(r2)
            r0.remove(r2)
            com.ss.android.ugc.aweme.profile.model.TabSetting r2 = r13.getTabSetting()
            com.ss.android.ugc.aweme.profile.model.EnterpriseTab r2 = r2.getEnterpriseTab()
            int r2 = r2.getTabType()
            if (r2 != r3) goto L_0x007b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.add(r2)
            goto L_0x0082
        L_0x007b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.add(r4, r2)
        L_0x0082:
            java.util.Iterator r2 = r0.iterator()
        L_0x0086:
            boolean r6 = r2.hasNext()
            r7 = 3
            r8 = 10
            if (r6 == 0) goto L_0x0179
            java.lang.Object r6 = r2.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != r1) goto L_0x00c6
            com.ss.android.ugc.aweme.profile.model.TabSetting r6 = r13.getTabSetting()
            if (r6 == 0) goto L_0x00ab
            com.ss.android.ugc.aweme.profile.model.TabSetting r6 = r13.getTabSetting()
            com.ss.android.ugc.aweme.profile.model.EnterpriseTab r6 = r6.getEnterpriseTab()
            if (r6 != 0) goto L_0x00b1
        L_0x00ab:
            boolean r6 = r13.isWithCommerceEnterpriseTabEntry()
            if (r6 == 0) goto L_0x00b3
        L_0x00b1:
            r6 = 1
            goto L_0x00b4
        L_0x00b3:
            r6 = 0
        L_0x00b4:
            com.bytedance.ies.dmt.ui.common.d r7 = com.bytedance.ies.dmt.p664ui.common.C10679d.m21506a()
            boolean r7 = r7.f28436a
            if (r7 != 0) goto L_0x00f7
            int r7 = r13.getCommerceUserLevel()
            if (r7 <= 0) goto L_0x00f7
            if (r6 == 0) goto L_0x00f7
            goto L_0x0140
        L_0x00c6:
            r9 = 7
            if (r6 != r9) goto L_0x00fa
            com.bytedance.ies.dmt.ui.common.d r6 = com.bytedance.ies.dmt.p664ui.common.C10679d.m21506a()
            boolean r6 = r6.f28436a
            if (r6 != 0) goto L_0x00f7
            if (r13 == 0) goto L_0x00f3
            com.ss.android.ugc.aweme.profile.model.TabSetting r6 = r13.getTabSetting()
            if (r6 == 0) goto L_0x00f3
            com.ss.android.ugc.aweme.profile.model.TabSetting r6 = r13.getTabSetting()
            com.ss.android.ugc.aweme.profile.model.BrandTab r6 = r6.getBrandTab()
            if (r6 == 0) goto L_0x00f3
            com.ss.android.ugc.aweme.profile.model.TabSetting r6 = r13.getTabSetting()
            com.ss.android.ugc.aweme.profile.model.BrandTab r6 = r6.getBrandTab()
            boolean r6 = r6.isShowBrandTab()
            if (r6 == 0) goto L_0x00f3
            r6 = 1
            goto L_0x00f4
        L_0x00f3:
            r6 = 0
        L_0x00f4:
            if (r6 == 0) goto L_0x00f7
            goto L_0x0140
        L_0x00f7:
            r6 = 0
            goto L_0x0172
        L_0x00fa:
            r9 = 9
            if (r6 != r9) goto L_0x012c
            com.bytedance.ies.dmt.ui.common.d r6 = com.bytedance.ies.dmt.p664ui.common.C10679d.m21506a()
            boolean r6 = r6.f28436a
            if (r6 != 0) goto L_0x00f7
            if (r13 == 0) goto L_0x0128
            com.ss.android.ugc.aweme.profile.model.TabSetting r6 = r13.getTabSetting()
            if (r6 == 0) goto L_0x0128
            com.ss.android.ugc.aweme.profile.model.TabSetting r6 = r13.getTabSetting()
            com.ss.android.ugc.aweme.profile.model.AggregationTab r6 = r6.getAggregationTab()
            if (r6 == 0) goto L_0x0128
            com.ss.android.ugc.aweme.profile.model.TabSetting r6 = r13.getTabSetting()
            com.ss.android.ugc.aweme.profile.model.AggregationTab r6 = r6.getAggregationTab()
            boolean r6 = r6.isShowTab()
            if (r6 == 0) goto L_0x0128
            r6 = 1
            goto L_0x0129
        L_0x0128:
            r6 = 0
        L_0x0129:
            if (r6 == 0) goto L_0x00f7
            goto L_0x0140
        L_0x012c:
            if (r6 != r3) goto L_0x0142
            if (r13 == 0) goto L_0x0140
            com.ss.android.ugc.aweme.profile.model.TabSetting r6 = r13.getTabSetting()
            if (r6 == 0) goto L_0x0140
            com.ss.android.ugc.aweme.profile.model.TabSetting r6 = r13.getTabSetting()
            boolean r6 = r6.isHideLikeTab()
            if (r6 != 0) goto L_0x00f7
        L_0x0140:
            r6 = 1
            goto L_0x0172
        L_0x0142:
            r9 = 4
            if (r6 != r9) goto L_0x0152
            int r6 = r13.getVerificationType()
            if (r6 == r7) goto L_0x0140
            boolean r6 = r13.isEffectArtist()
            if (r6 == 0) goto L_0x00f7
            goto L_0x0140
        L_0x0152:
            if (r6 != r7) goto L_0x015b
            int r6 = r13.getShowArtistPlaylist()
            if (r6 != r5) goto L_0x00f7
            goto L_0x0140
        L_0x015b:
            if (r6 != r8) goto L_0x016a
            int r6 = mo82452i(r13)
            if (r6 == r3) goto L_0x0140
            int r6 = mo82452i(r13)
            if (r6 != r7) goto L_0x00f7
            goto L_0x0140
        L_0x016a:
            java.lang.String r7 = r13.getUid()
            boolean r6 = m89735a(r7, r6)
        L_0x0172:
            if (r6 != 0) goto L_0x0086
            r2.remove()
            goto L_0x0086
        L_0x0179:
            boolean r1 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103664m(r13)
            if (r1 == 0) goto L_0x01b4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x01b2
            int r13 = mo82452i(r13)
            if (r13 != r7) goto L_0x01b2
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            int r13 = r0.lastIndexOf(r13)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            int r2 = r0.lastIndexOf(r2)
            r4 = -1
            if (r13 == r4) goto L_0x01b2
            if (r2 == r4) goto L_0x01b2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r0.set(r13, r4)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            r0.set(r2, r13)
        L_0x01b2:
            com.p683ss.android.ugc.aweme.profile.experiment.C39868b.f101719a = r1
        L_0x01b4:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.List<com.ss.android.ugc.aweme.profile.ui.dd> r1 = r12.f103067e
            if (r1 != 0) goto L_0x01c9
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            r12.f103067e = r1
            goto L_0x01d3
        L_0x01c9:
            java.util.List<com.ss.android.ugc.aweme.profile.ui.dd> r1 = r12.f103067e
            r13.addAll(r1)
            java.util.List<com.ss.android.ugc.aweme.profile.ui.dd> r1 = r12.f103067e
            r1.clear()
        L_0x01d3:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<java.lang.Integer> r2 = r12.f103068j
            if (r2 != 0) goto L_0x01e8
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.size()
            r2.<init>(r3)
            r12.f103068j = r2
            goto L_0x01f2
        L_0x01e8:
            java.util.List<java.lang.Integer> r2 = r12.f103068j
            r1.addAll(r2)
            java.util.List<java.lang.Integer> r2 = r12.f103068j
            r2.clear()
        L_0x01f2:
            java.util.Iterator r0 = r0.iterator()
        L_0x01f6:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x023c
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            int r3 = m89736i(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x0234
            int r2 = r2.intValue()
            int r2 = m89736i(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = r1.indexOf(r2)
            java.lang.Object r3 = r13.get(r2)
            com.ss.android.ugc.aweme.profile.ui.dd r3 = (com.p683ss.android.ugc.aweme.profile.p2090ui.C40321dd) r3
            java.lang.Object r2 = r1.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r12.mo82620a(r3, r2)
            goto L_0x01f6
        L_0x0234:
            int r2 = r2.intValue()
            r12.mo82165h(r2)
            goto L_0x01f6
        L_0x023c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.C40392t.mo82623g(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    /* renamed from: a */
    public void mo81890a(User user) {
        if (isViewValid()) {
            C47915gg.m103661j(user);
            this.f103065c.setMinY(0);
            this.f103081w = user;
            this.f103058A.mo82943a(user);
        }
    }

    /* renamed from: a */
    public void mo81886a(int i, int i2) {
        mo82164g(i);
    }

    /* renamed from: a */
    private static boolean m89735a(String str, int i) {
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return SharePrefCache.inst().isOpenForward();
        }
        if (i == 2) {
            return true;
        }
        return false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        if (getResources().getConfiguration() != null) {
            i = getResources().getConfiguration().screenWidthDp;
        } else {
            i = 0;
        }
        this.f103083y = i;
        if (this.f103063F) {
            view.setBackgroundColor(-1);
        }
        mo82156a(view);
        mo82160b(view);
        this.f103061D.setOnClickListener(this);
        this.f103060C.setOnClickListener(this);
        this.f103062E.setOnClickListener(this);
        if (bundle != null) {
            this.f103078t = bundle.getInt("profile_cur_pos", 0);
            this.f103079u = bundle.getInt("indicator_scroll_maxx", 0);
        }
        mo82163g();
    }

    /* renamed from: a */
    public void mo81887a(int i, String str) {
        if (isViewValid()) {
            if (TextUtils.isEmpty(str)) {
                this.f103074p.setText(R.string.dk1);
                return;
            }
            while (str.contains("\n\n")) {
                str = str.replaceAll("\n\n", "\n");
            }
            this.f103074p.setText(str);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f103059B = null;
        return C23344b.f62351a.mo48400a(getActivity(), mo82167i(), layoutInflater, viewGroup);
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (f != 0.0f) {
            this.f103079u = C9432q.m18670a(getContext()) / 3;
        }
    }
}
