package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0643c;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1339l;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.adapter.C24534a;
import com.p683ss.android.ugc.aweme.challenge.adapter.C24539d;
import com.p683ss.android.ugc.aweme.challenge.adapter.C24540e;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24529c;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26837d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26838e;
import com.p683ss.android.ugc.aweme.common.p1589a.C26843i;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1593e.C26866a;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26882h;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26990b.C26991a;
import com.p683ss.android.ugc.aweme.detail.C27336g;
import com.p683ss.android.ugc.aweme.detail.C27388l;
import com.p683ss.android.ugc.aweme.detail.experiment.CoverOptimizeExperiment;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30179b;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32464b;
import com.p683ss.android.ugc.aweme.movie.view.C37195c;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23212ar;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39797a;
import com.p683ss.android.ugc.aweme.setting.C41632l;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47729bp;
import com.p683ss.android.ugc.aweme.utils.C47843ee;
import com.p683ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment */
public class DetailAwemeListFragment extends C24626a implements C24579d, C26846a, C26872d<C26838e>, C26878d, C26991a, C27336g, C30462o {

    /* renamed from: A */
    private String f65137A;

    /* renamed from: B */
    private Challenge f65138B;

    /* renamed from: C */
    private SparseArray<C26876b> f65139C = new SparseArray<>();

    /* renamed from: a */
    public int f65140a;

    /* renamed from: b */
    public String f65141b;

    /* renamed from: c */
    public C26876b f65142c;

    /* renamed from: d */
    public String f65143d;

    /* renamed from: e */
    public boolean f65144e;

    /* renamed from: j */
    public float f65145j;

    /* renamed from: k */
    protected C24539d f65146k;

    /* renamed from: l */
    public C24621a f65147l;

    /* renamed from: m */
    public int f65148m;
    public RecyclerView mListView;
    DmtStatusView mStatusView;
    FrameLayout mStatusViewContainer;

    /* renamed from: n */
    public C27388l f65149n;

    /* renamed from: o */
    public boolean f65150o;

    /* renamed from: p */
    public boolean f65151p;

    /* renamed from: q */
    public SparseArray<C24539d> f65152q = new SparseArray<>();

    /* renamed from: r */
    public SparseBooleanArray f65153r = new SparseBooleanArray();

    /* renamed from: s */
    public SparseBooleanArray f65154s = new SparseBooleanArray();

    /* renamed from: t */
    public SparseArray<DmtStatusView> f65155t = new SparseArray<>();

    /* renamed from: u */
    public C24622b f65156u;

    /* renamed from: v */
    private int f65157v = 3;

    /* renamed from: w */
    private String f65158w;

    /* renamed from: x */
    private String f65159x;

    /* renamed from: y */
    private C24770z f65160y;

    /* renamed from: z */
    private C26866a f65161z;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment$a */
    public interface C24621a {
        /* renamed from: b */
        boolean mo50482b(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment$b */
    public interface C24622b extends Serializable {
        C24623c getJumpToVideoParam(C24623c cVar, Aweme aweme);

        C26876b getPresenter(int i, FragmentActivity fragmentActivity);

        C24540e onCreateDetailAwemeViewHolder(View view, String str, C24579d dVar);

        void onJumpToDetail(String str);

        boolean sendCustomRequest(C26876b bVar, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment$c */
    public static class C24623c {

        /* renamed from: a */
        public String f65166a = "";

        /* renamed from: b */
        public String f65167b = "";

        /* renamed from: c */
        public String f65168c = "";

        /* renamed from: d */
        public String f65169d = "";

        /* renamed from: e */
        public String f65170e = "";

        /* renamed from: f */
        public int f65171f;
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment$d */
    public static abstract class C24624d implements C24622b {
        public int getDetailAwemeViewType(int i, Aweme aweme) {
            return 0;
        }

        public abstract C24534a onCreateDetailAwemeViewHolder(ViewGroup viewGroup, int i, String str, C24579d dVar);

        public C24540e onCreateDetailAwemeViewHolder(View view, String str, C24579d dVar) {
            return null;
        }

        public void onJumpToDetail(String str) {
        }
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo50461a(List list, int i) {
    }

    /* renamed from: a */
    public final boolean mo50463a(C26882h hVar) {
        return false;
    }

    public final void aU_() {
        ar_();
    }

    /* renamed from: l */
    public final View mo50471l() {
        return this.mListView;
    }

    /* renamed from: a */
    public final void mo50460a(String str) {
        this.f65141b = str;
        this.f65144e = false;
    }

    /* renamed from: a */
    public final void mo50457a(View view, View view2) {
        view2.setOnClickListener(new C24627aa(this));
        this.mStatusView.setBuilder(C10719a.m21676a(getContext()).mo19231b(view).mo19234c(view2));
        this.mStatusView.mo19213g();
    }

    /* renamed from: a */
    public final void mo50462a(boolean z, boolean z2) {
        if (this.f65161z != null) {
            this.f65161z.mo54826a(z, z2);
        }
    }

    /* renamed from: a */
    public final void mo50347a(View view, Aweme aweme, String str) {
        if (!(C32800a.m75679a(view) || aweme == null || getActivity() == null)) {
            C24623c cVar = new C24623c();
            cVar.f65168c = str;
            if (!(!C23198ae.m56866g(mo50469j()) || aweme == null || this.f65146k == null || this.f65146k.f70670n == null)) {
                int indexOf = this.f65146k.f70670n.indexOf(aweme);
                if (indexOf >= 0) {
                    cVar.f65171f = indexOf;
                }
                cVar.f65170e = this.f65143d;
                cVar.f65169d = this.f65141b;
            }
            if (C23198ae.m56868h(mo50469j())) {
                cVar.f65170e = this.f65143d;
            }
            C24623c jumpToVideoParam = this.f65156u.getJumpToVideoParam(cVar, aweme);
            if (this.f65142c.mo54803n() != null) {
                List<Aweme> items = ((C26875a) this.f65142c.mo54803n()).getItems();
                if (items != null) {
                    for (Aweme aweme2 : items) {
                        if (aweme2 != null) {
                            aweme2.setFromRawChallenge(this.f65138B);
                        }
                    }
                    ((C26875a) this.f65142c.mo54803n()).setItems(items);
                }
                C31213v.m72896a((C26875a) this.f65142c.mo54803n());
            }
            SmartRoute a = mo50454a(aweme, jumpToVideoParam);
            boolean a2 = C10181b.m20511a().mo18172a(CoverOptimizeExperiment.class, true, "enable_reuse_external_image", 31744, false);
            if (view != null && a2) {
                a.withBundleAnimation(C0643c.m1729b(view, 0, 0, view.getWidth(), view.getHeight()).mo2171a());
            }
            this.f65156u.onJumpToDetail(aweme.getAid());
            a.open(10086);
            C30179b.m70792a(aweme);
        }
    }

    /* renamed from: a */
    public final void mo47019a(boolean z) {
        C24539d dVar = this.f65146k;
        if (!z) {
            dVar.mo54788a((C26846a) null);
            dVar.mo54798c(false);
        }
    }

    /* renamed from: t */
    private void m60080t() {
        this.f65148m = this.f65140a;
    }

    /* renamed from: s */
    private void m60079s() {
        if (this.f65161z != null) {
            this.f65161z.mo54825a();
        }
    }

    public final boolean aW_() {
        return this.f65154s.get(this.f65140a, true);
    }

    /* renamed from: o */
    public final boolean mo50474o() {
        return this.f65153r.get(this.f65140a, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f65142c != null) {
            this.f65142c.mo46991S_();
        }
        m60079s();
    }

    public void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            mo50462a(false, true);
        }
    }

    /* renamed from: p */
    public final List<Aweme> mo50480p() {
        if (this.f65146k != null) {
            return this.f65146k.f70670n;
        }
        return null;
    }

    /* renamed from: e */
    public final JSONObject mo50467e() {
        JSONObject jSONObject = new JSONObject();
        String str = "";
        try {
            C26832a n = this.f65142c.mo54803n();
            if (n instanceof C22982e) {
                str = ((C22982e) n).getRequestId();
            }
            jSONObject.put("request_id", str);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: f */
    public final String mo50468f() {
        String str = "";
        try {
            C26832a n = this.f65142c.mo54803n();
            if (n instanceof C22982e) {
                return ((C22982e) n).getRequestId();
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: k */
    public final void mo50470k() {
        if (isViewValid() && this.mListView.getChildCount() > 0) {
            this.mListView.mo4833d(0);
        }
    }

    /* renamed from: n */
    public final void mo50473n() {
        boolean z;
        if (isViewValid()) {
            if (!this.mStatusView.f28645b || mo50474o()) {
                z = true;
            } else {
                z = false;
            }
            m60075a(z, 0);
        }
    }

    public void onPause() {
        super.onPause();
        if (getUserVisibleHint()) {
            m60079s();
        }
        try {
            m60077q();
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
        }
    }

    public void onStop() {
        try {
            m60077q();
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
        }
        super.onStop();
        if (getUserVisibleHint()) {
            m60079s();
        }
    }

    /* renamed from: q */
    private void m60077q() throws Exception {
        if (this.mListView != null && isViewValid()) {
            int childCount = this.mListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.mListView.getChildAt(i);
                if (childAt != null) {
                    C1352v b = this.mListView.mo4812b(childAt);
                    if (b != null && b.mItemViewType == 0) {
                        ((C26843i) b).mo54782j();
                    }
                }
            }
        }
    }

    /* renamed from: r */
    private void m60078r() {
        DmtTextView b = m60076b((int) R.string.c0e);
        b.setOnClickListener(new C24628ab(this));
        this.mStatusView.setBuilder(C10719a.m21676a(getContext()).mo19231b((View) m60076b((int) R.string.ay_)).mo19234c((View) b));
    }

    /* renamed from: j */
    public final String mo50469j() {
        int i = this.f65140a;
        if (i == 15) {
            return "prop_page";
        }
        if (i == 20) {
            return "mv_page";
        }
        switch (i) {
            case 0:
            case 1:
                return "single_song";
            case 2:
            case 3:
                return "challenge";
            case 4:
                return "poi_page";
            default:
                return null;
        }
    }

    /* renamed from: m */
    public final void mo50472m() {
        if (isViewValid()) {
            if (!getUserVisibleHint() || !C41632l.m91511a(getContext()) || !C24629ac.m60123a(getActivity())) {
                m60079s();
            } else {
                mo50462a(false, false);
            }
        }
    }

    public final void ar_() {
        m60080t();
        if (this.f65142c != null && !TextUtils.isEmpty(this.f65141b) && (this.f65156u == null || !this.f65156u.sendCustomRequest(this.f65142c, 4))) {
            if (!this.f65144e || TextUtils.isEmpty(this.f65137A)) {
                this.f65142c.mo44934a_(Integer.valueOf(4), this.f65141b, Integer.valueOf(this.f65148m), Boolean.valueOf(false));
                return;
            }
            this.f65142c.mo44934a_(Integer.valueOf(4), this.f65137A, Integer.valueOf(this.f65148m), Boolean.valueOf(true));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo50456a(View view) {
        mo50473n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo50465b(View view) {
        mo50473n();
    }

    @C53771m
    public void onBlockUserEvent(C39797a aVar) {
        mo50473n();
    }

    /* renamed from: a_ */
    public final void mo50464a_(boolean z) {
        this.f65153r.put(this.f65140a, z);
    }

    /* renamed from: a */
    public final void mo50458a(C27388l lVar) {
        this.f65149n = lVar;
    }

    @C53771m
    public void onDynamicEvent(C24529c cVar) {
        if (cVar.f64950a == 0) {
            mo50462a(true, false);
        } else {
            m60079s();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putSerializable("provider", this.f65156u);
        }
    }

    /* renamed from: a */
    public final void mo50459a(Challenge challenge) {
        this.f65138B = challenge;
    }

    /* renamed from: c_ */
    public final void mo50466c_(int i) {
        if (isViewValid()) {
            this.f65146k.notifyItemRemoved(i);
            if (this.f65146k.mo48636c() == 0) {
                this.mStatusView.setVisibility(0);
                this.mStatusView.mo19213g();
            }
        }
    }

    @C53771m
    public void onAntiCrawlerEvent(C23481a aVar) {
        String str = aVar.f62554a;
        if (str == null) {
            return;
        }
        if (str.contains("/aweme/v1/challenge/aweme/?") || str.contains("/aweme/v1/music/fresh/aweme/?")) {
            C47718bf.m103293f(aVar);
            mo50473n();
        }
    }

    @C53771m
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (isViewValid() && this.f65146k != null) {
            this.f65146k.mo54773a(followStatus);
        }
    }

    @C53771m
    public void onVideoEvent(C30332aw awVar) {
        if (awVar.f79228a == 2) {
            this.f65142c.mo54839a((Object) C23324d.m57378a().getAwemeById((String) awVar.f79229b));
        }
    }

    /* renamed from: b */
    private DmtTextView m60076b(int i) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.tf));
        dmtTextView.setTextColor(getResources().getColor(R.color.a19));
        dmtTextView.setText(i);
        return dmtTextView;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            C24539d dVar = this.f65146k;
            if (isViewValid() && this.mListView != null && this.f65146k != null && !dVar.f64965e) {
                dVar.f64965e = true;
                int childCount = this.mListView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C1352v f = this.mListView.mo4847f(i);
                    if (f instanceof C24534a) {
                        C24534a aVar = (C24534a) f;
                        aVar.mo50301a();
                        mo50455a((C26838e) aVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static List<Aweme> m60073a(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        if (C9376b.m18558a((Collection<T>) list)) {
            return arrayList;
        }
        for (Aweme aweme : list) {
            if (aweme != null && !aweme.isAd()) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo50455a(C26838e eVar) {
        String j = mo50469j();
        C24534a aVar = (C24534a) eVar;
        if (aVar != null && aVar.mo54754d() != null) {
            if (C23198ae.m56866g(mo50469j()) || C9431p.m18665a(j, "poi_page")) {
                int i = this.f65140a;
                if (C9431p.m18665a(j, "poi_page")) {
                    i = 10;
                }
                if (!(aVar.mo54754d() == null || this.f65146k == null || this.f65146k.f70670n == null)) {
                    int indexOf = this.f65146k.f70670n.indexOf(aVar.mo54754d());
                    if (indexOf >= 0) {
                        new C23212ar().mo47997a(mo50469j()).mo48000c(String.valueOf(indexOf)).mo47998b(this.f65143d).mo48001d(this.f65141b).mo47999c(aVar.mo54754d(), i).mo48076e();
                    }
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        LayoutParams layoutParams = (LayoutParams) this.mStatusView.getLayoutParams();
        layoutParams.topMargin = C32464b.m75163a(getContext(), 80.0f);
        this.mStatusView.setLayoutParams(layoutParams);
        if (this.f65156u == null && bundle != null) {
            Serializable serializable = bundle.getSerializable("provider");
            if (serializable != null && (serializable instanceof C24622b)) {
                this.f65156u = (C24622b) serializable;
            }
        }
        m60078r();
        this.mListView.setLayoutManager(new WrapGridLayoutManager((Context) getActivity(), this.f65157v, 1, false));
        this.mListView.setOverScrollMode(2);
        this.mListView.mo4798a((C1331h) new C24630ad((int) C9432q.m18687b(getContext(), 1.0f), this.f65157v));
        this.mListView.mo4800a((C1339l) new C1339l() {
            /* renamed from: a */
            public final void mo5079a(boolean z) {
            }

            /* renamed from: b */
            public final void mo5081b(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            /* renamed from: a */
            public final boolean mo5080a(RecyclerView recyclerView, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        DetailAwemeListFragment.this.f65145j = motionEvent.getY();
                        break;
                    case 1:
                        DetailAwemeListFragment.this.f65145j = motionEvent.getY() - DetailAwemeListFragment.this.f65145j;
                        if (C23198ae.m56866g(DetailAwemeListFragment.this.mo50469j()) || C23198ae.m56868h(DetailAwemeListFragment.this.mo50469j())) {
                            String str = "";
                            String str2 = "";
                            String str3 = "";
                            if (C23198ae.m56868h(DetailAwemeListFragment.this.mo50469j())) {
                                str = "music_id";
                                str2 = "music_detail_slide_up";
                                str3 = "music_detail_slide_down";
                            }
                            if (C23198ae.m56866g(DetailAwemeListFragment.this.mo50469j())) {
                                str = "tag_id";
                                str2 = "tag_detail_slide_up";
                                str3 = "tag_detail_slide_down";
                            }
                            if (!TextUtils.isEmpty(str)) {
                                if (DetailAwemeListFragment.this.f65145j <= 10.0f) {
                                    if (DetailAwemeListFragment.this.f65145j < -10.0f) {
                                        C26890h.m65011a(str2, C23089d.m56640a().mo47829a("process_id", DetailAwemeListFragment.this.f65143d).mo47829a(str, DetailAwemeListFragment.this.f65141b).f61491a);
                                        break;
                                    }
                                } else {
                                    C26890h.m65011a(str3, C23089d.m56640a().mo47829a("process_id", DetailAwemeListFragment.this.f65143d).mo47829a(str, DetailAwemeListFragment.this.f65141b).f61491a);
                                    break;
                                }
                            }
                        }
                        break;
                }
                return false;
            }
        });
        C24633ag agVar = null;
        if (!C23337c.m57398a()) {
            agVar = new C24633ag();
            this.mListView.mo4801a((C1340m) agVar);
        }
        this.f65161z = new C26866a(this.mListView, agVar);
        this.mListView = C47843ee.m103486a(this.mListView, this);
        if (this.f65160y.f65574a) {
            int a = C23728o.m58241a(16.0d);
            RecyclerView recyclerView = this.mListView;
            recyclerView.setPadding(a, recyclerView.getPaddingTop(), a, this.mListView.getPaddingBottom());
        }
        if (this.mListView instanceof FpsRecyclerView) {
            ((FpsRecyclerView) this.mListView).setLabel("detail_list");
        }
        C47729bp.m103326a(this.f65158w).mo95020a(this.mListView);
        this.f65142c = (C26876b) this.f65139C.get(this.f65140a);
        if (this.f65142c == null) {
            this.f65142c = this.f65156u.getPresenter(this.f65140a, getActivity());
            if (this.f65142c != null) {
                this.f65142c.mo54800a(new C26877c<Aweme>() {

                    /* renamed from: a */
                    final int f65164a = DetailAwemeListFragment.this.f65140a;

                    public final void aS_() {
                    }

                    /* renamed from: a_ */
                    public final void mo47024a_(Exception exc) {
                    }

                    /* renamed from: c */
                    public final void mo47029c(List<Aweme> list, boolean z) {
                    }

                    /* renamed from: R_ */
                    public final void mo47017R_() {
                        DmtStatusView b = m60109b();
                        if (b != null && !b.f28645b) {
                            b.mo19212f();
                        }
                    }

                    /* renamed from: e */
                    public final void mo47031e() {
                        C26837d dVar = (C26837d) DetailAwemeListFragment.this.f65152q.get(this.f65164a);
                        if (dVar != null) {
                            dVar.am_();
                        }
                    }

                    /* renamed from: b */
                    private DmtStatusView m60109b() {
                        if (!DetailAwemeListFragment.this.isViewValid()) {
                            return null;
                        }
                        if (DetailAwemeListFragment.this.mStatusViewContainer == null) {
                            return DetailAwemeListFragment.this.mStatusView;
                        }
                        return (DmtStatusView) DetailAwemeListFragment.this.f65155t.get(this.f65164a);
                    }

                    public final void aJ_() {
                        if (DetailAwemeListFragment.this.isViewValid()) {
                            DmtStatusView b = m60109b();
                            if (DetailAwemeListFragment.this.f65147l != null) {
                                DetailAwemeListFragment.this.f65147l.mo50482b(DetailAwemeListFragment.this.f65140a);
                            } else if (b != null) {
                                b.mo19213g();
                            }
                            if (DetailAwemeListFragment.this.f65149n != null && DetailAwemeListFragment.this.f65140a == this.f65164a) {
                                DetailAwemeListFragment.this.f65149n.mo50629a(DetailAwemeListFragment.this.mo50474o(), 1);
                            }
                            DetailAwemeListFragment.this.f65153r.put(this.f65164a, false);
                        }
                    }

                    /* renamed from: c */
                    public final void mo47028c(Exception exc) {
                        C26837d dVar = (C26837d) DetailAwemeListFragment.this.f65152q.get(this.f65164a);
                        if (dVar != null) {
                            dVar.co_();
                        }
                    }

                    /* renamed from: b */
                    public final void mo47025b(Exception exc) {
                        boolean z;
                        if (DetailAwemeListFragment.this.isViewValid()) {
                            DmtStatusView b = m60109b();
                            if (b != null) {
                                C26832a n = DetailAwemeListFragment.this.f65142c.mo54803n();
                                if (!(n instanceof C26875a) || C9376b.m18558a((Collection<T>) ((C26875a) n).getItems())) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (!z) {
                                    b.mo19214h();
                                }
                            }
                            if (DetailAwemeListFragment.this.f65149n != null && DetailAwemeListFragment.this.f65140a == this.f65164a) {
                                DetailAwemeListFragment.this.f65149n.mo50629a(DetailAwemeListFragment.this.mo50474o(), 2);
                            }
                            DetailAwemeListFragment.this.f65153r.put(this.f65164a, false);
                        }
                    }

                    /* renamed from: a */
                    public final void mo47018a(List<Aweme> list, boolean z) {
                        if (DetailAwemeListFragment.this.isViewValid()) {
                            C26837d dVar = (C26837d) DetailAwemeListFragment.this.f65152q.get(this.f65164a);
                            DmtStatusView b = m60109b();
                            if (!(dVar == null || b == null)) {
                                dVar.ao_();
                                dVar.mo50303a(DetailAwemeListFragment.m60073a(list));
                                if (!C9376b.m18558a((Collection<T>) list)) {
                                    b.mo19220n();
                                }
                                b.setVisibility(4);
                                if (!z) {
                                    dVar.mo54798c(false);
                                    dVar.mo54788a((C26846a) null);
                                }
                            }
                            DetailAwemeListFragment.this.f65154s.put(this.f65164a, z);
                            if (DetailAwemeListFragment.this.f65149n != null && DetailAwemeListFragment.this.f65140a == this.f65164a) {
                                DetailAwemeListFragment.this.f65149n.mo50629a(DetailAwemeListFragment.this.mo50474o(), 0);
                            }
                            DetailAwemeListFragment.this.f65153r.put(this.f65164a, false);
                            if (DetailAwemeListFragment.this.getUserVisibleHint() && DetailAwemeListFragment.this.f65140a == this.f65164a) {
                                DetailAwemeListFragment.this.mo50462a(false, false);
                            }
                        }
                    }

                    /* renamed from: b */
                    public final void mo47026b(List<Aweme> list, boolean z) {
                        if (DetailAwemeListFragment.this.isViewValid()) {
                            if (list == null) {
                                list = new ArrayList<>();
                            }
                            C26837d dVar = (C26837d) DetailAwemeListFragment.this.f65152q.get(this.f65164a);
                            DmtStatusView b = m60109b();
                            if (!(dVar == null || b == null)) {
                                dVar.ao_();
                                if (!C9376b.m18558a((Collection<T>) list) || !z) {
                                    List list2 = dVar.f70670n;
                                    if (list2 == null || list2.size() != list.size() || !list2.containsAll(list)) {
                                        dVar.mo50304b(DetailAwemeListFragment.m60073a(list));
                                    }
                                    b.setVisibility(4);
                                    DetailAwemeListFragment.this.f65154s.put(this.f65164a, z);
                                    DetailAwemeListFragment.this.mo47019a(z);
                                } else {
                                    if (DetailAwemeListFragment.this.f65140a == this.f65164a) {
                                        DetailAwemeListFragment.this.ar_();
                                    }
                                }
                            }
                        }
                    }
                });
                this.f65142c.mo54838a((C26878d) this);
                this.f65139C.put(this.f65140a, this.f65142c);
            }
            z = true;
        } else {
            z = false;
        }
        this.f65146k = (C24539d) this.f65152q.get(this.f65140a);
        if (this.f65146k == null) {
            this.f65146k = new C24539d(this.f65158w, this, this, this.f65156u);
            this.f65146k.mo54788a((C26846a) this);
            this.f65146k.f70684u = "detail_list";
            this.f65146k.f64965e = this.f65150o;
            this.f65152q.put(this.f65140a, this.f65146k);
            z = true;
        }
        this.mListView.setAdapter(this.f65146k);
        this.f65146k.f64965e = this.f65150o;
        if (!C24629ac.m60123a(getActivity())) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
        } else if (!this.f65151p && z) {
            mo50473n();
        } else if (getUserVisibleHint() && mo50474o()) {
            mo50473n();
        } else if (getUserVisibleHint()) {
            mo50462a(false, false);
        }
        if (this.mStatusViewContainer != null) {
            if (this.f65155t.size() == 0) {
                this.f65155t.put(this.f65140a, this.mStatusView);
                return;
            }
            if (this.mStatusView != null) {
                this.mStatusView.setAlpha(0.0f);
            }
            this.mStatusView = (DmtStatusView) this.f65155t.get(this.f65140a);
            if (this.mStatusView == null) {
                this.mStatusView = new DmtStatusView(this.mStatusViewContainer.getContext());
                m60078r();
                this.mStatusViewContainer.addView(this.mStatusView, new LayoutParams(-1, -1));
                this.f65155t.put(this.f65140a, this.mStatusView);
                return;
            }
            this.mStatusView.setAlpha(1.0f);
        }
    }

    /* renamed from: a */
    private void m60075a(boolean z, long j) {
        if (isViewValid()) {
            mo50464a_(false);
            m60080t();
            if (this.f65142c != null && !TextUtils.isEmpty(this.f65141b)) {
                if (this.f65156u == null || !this.f65156u.sendCustomRequest(this.f65142c, 1)) {
                    this.f65142c.mo44934a_(Integer.valueOf(1), this.f65141b, Integer.valueOf(this.f65148m), Boolean.valueOf(this.f65144e));
                }
                if (z) {
                    this.mStatusView.mo19212f();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SmartRoute mo50454a(Aweme aweme, C24623c cVar) {
        boolean z;
        String str;
        SmartRoute withParam = SmartRouter.buildRoute((Context) getActivity(), "aweme://aweme/detail/").withParam("id", aweme.getAid()).withParam("refer", cVar.f65168c).withParam("previous_page", this.f65159x).withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "").withParam("video_from", cVar.f65166a);
        String str2 = "video_challenge_profile_from";
        if (this.f65140a == 3 || this.f65140a == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = this.f65159x;
        } else {
            str = "";
        }
        return withParam.withParam(str2, str).withParam("video_type", this.f65140a).withParam("profile_enterprise_type", aweme.getEnterpriseType()).withParam("process_id", this.f65143d).withParam(cVar.f65167b, this.f65141b);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.b8e, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f65140a = arguments.getInt(C37195c.f94956x, 0);
            this.f65158w = arguments.getString(C37195c.f94957y, "");
            this.f65141b = arguments.getString(C37195c.f94958z, "");
            this.f65160y = (C24770z) arguments.getSerializable("detail_config");
            if (this.f65160y == null) {
                this.f65160y = new C24770z();
            }
            this.f65159x = arguments.getString(C37195c.f94954A, "");
            this.f65143d = arguments.getString("process_id", "");
            this.f65144e = arguments.getBoolean("extra_challenge_is_hashtag", false);
            this.f65137A = arguments.getString("extra_challenge_hashtag_name", "");
        }
        return inflate;
    }

    /* renamed from: a */
    public static DetailAwemeListFragment m60071a(int i, String str, String str2, boolean z, String str3, String str4, C24622b bVar) {
        DetailAwemeListFragment detailAwemeListFragment = new DetailAwemeListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(C37195c.f94956x, 4);
        bundle.putString(C37195c.f94957y, str);
        bundle.putString(C37195c.f94958z, str2);
        bundle.putBoolean("extra_challenge_is_hashtag", false);
        bundle.putString("extra_challenge_hashtag_name", str3);
        bundle.putString(C37195c.f94954A, str4);
        detailAwemeListFragment.setArguments(bundle);
        detailAwemeListFragment.f65156u = bVar;
        return detailAwemeListFragment;
    }

    /* renamed from: a */
    public static DetailAwemeListFragment m60072a(C24770z zVar, int i, String str, String str2, boolean z, String str3, String str4, String str5, C24622b bVar) {
        DetailAwemeListFragment detailAwemeListFragment = new DetailAwemeListFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("detail_config", null);
        bundle.putInt(C37195c.f94956x, 2);
        bundle.putString(C37195c.f94957y, str);
        bundle.putString(C37195c.f94958z, str2);
        bundle.putBoolean("extra_challenge_is_hashtag", z);
        bundle.putString("extra_challenge_hashtag_name", str3);
        bundle.putString(C37195c.f94954A, str4);
        bundle.putString("process_id", str5);
        detailAwemeListFragment.setArguments(bundle);
        detailAwemeListFragment.f65156u = bVar;
        return detailAwemeListFragment;
    }
}
