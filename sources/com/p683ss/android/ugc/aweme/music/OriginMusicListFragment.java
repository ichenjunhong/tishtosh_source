package com.p683ss.android.ugc.aweme.music;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.view.C1221d;
import android.support.p043v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26990b.C26991a;
import com.p683ss.android.ugc.aweme.experiment.UseRecyclerPartialUpdateExperiment;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29686a;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29689c;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29691e;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.music.adapter.C37307m;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1975c.C37351d;
import com.p683ss.android.ugc.aweme.music.p1975c.C37354g;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37518aw;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37625m;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1982d.C37600a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40266bq.C40268b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40321dd;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.music.OriginMusicListFragment */
public class OriginMusicListFragment extends C40321dd implements C26846a, C26877c<Music>, C26991a, C29689c, C29691e, C37625m {

    /* renamed from: a */
    public C40268b f94998a;

    /* renamed from: b */
    protected C37518aw f94999b;

    /* renamed from: c */
    public boolean f95000c = true;

    /* renamed from: d */
    public C26876b f95001d;

    /* renamed from: e */
    public String f95002e;

    /* renamed from: j */
    public String f95003j;

    /* renamed from: k */
    public String f95004k = "";

    /* renamed from: l */
    protected ViewStub f95005l;

    /* renamed from: m */
    protected View f95006m;
    @BindView(2131494563)
    public RecyclerView mListView;
    @BindView(2131494826)
    DmtStatusView mStatusView;

    /* renamed from: n */
    protected boolean f95007n;

    /* renamed from: o */
    private String f95008o = "popular_song";

    /* renamed from: p */
    private C37307m f95009p;

    /* renamed from: q */
    private MusicModel f95010q;

    /* renamed from: r */
    private C29686a f95011r;

    /* renamed from: s */
    private int f95012s = 7;

    /* renamed from: t */
    private boolean f95013t = true;

    /* renamed from: u */
    private boolean f95014u;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo50568a(BaseResponse baseResponse) {
    }

    /* renamed from: a */
    public final void mo50813a(MusicModel musicModel, Exception exc) {
    }

    public final void aS_() {
    }

    public final boolean aT_() {
        return this.f95013t;
    }

    public final void aX_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    public final void ar_() {
    }

    /* renamed from: c */
    public final void mo47029c(List<Music> list, boolean z) {
    }

    /* renamed from: g */
    public final MusicModel mo50819g() {
        return this.f95010q;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo47018a(List<Music> list, boolean z) {
        if (isViewValid()) {
            this.mStatusView.mo19209d();
            this.mStatusView.mo19220n();
            this.f95009p.ao_();
            m83455a(list);
            this.f95009p.mo54798c(true);
        }
    }

    /* renamed from: i */
    public final Activity mo50821i() {
        return getActivity();
    }

    /* renamed from: j */
    public final boolean mo50822j() {
        return isViewValid();
    }

    public void onDestroyView() {
        super.onDestroyView();
        m83458m();
    }

    public void onPause() {
        super.onPause();
        m83457k();
    }

    /* renamed from: m */
    private void m83458m() {
        if (this.f94999b != null) {
            this.f94999b.mo50911a();
        }
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (isViewValid()) {
            this.f95009p.am_();
        }
    }

    /* renamed from: l */
    public final View mo50471l() {
        if (!isViewValid()) {
            return null;
        }
        return this.mListView;
    }

    public void onResume() {
        super.onResume();
        this.f94999b.f95726n = false;
    }

    /* renamed from: k */
    private void m83457k() {
        if (this.f95009p != null) {
            this.f95009p.mo76606a();
        }
        if (this.f94999b != null) {
            this.f94999b.mo50911a();
            this.f94999b.f95726n = true;
        }
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (isViewValid()) {
            this.f95006m.setVisibility(4);
            this.mStatusView.mo19212f();
        }
    }

    public final void aJ_() {
        if (isViewValid()) {
            this.f95006m.setVisibility(4);
            this.mStatusView.mo19213g();
            if (this.f94998a != null) {
                this.f94998a.mo82155H();
            }
        }
    }

    public final void aV_() {
        if (this.mStatusView == null || (!this.f95007n && !C23794bh.m58390d().mo47103a())) {
            mo76537h();
            return;
        }
        this.mStatusView.setVisibility(4);
        this.f95006m.setVisibility(0);
    }

    /* renamed from: n */
    private void m83459n() {
        if (getContext() != null) {
            C10719a a = C10719a.m21676a(getContext());
            try {
                DmtTextView a2 = m83453a((int) R.string.c0e);
                a2.setOnClickListener(new C37387h(this));
                a.mo19231b((View) m83456d(this.f95014u)).mo19234c((View) a2);
                int b = (int) C9432q.m18687b(getContext(), 24.0f);
                this.mStatusView.setPadding(b, 0, b, 0);
            } catch (Exception unused) {
            }
            this.mStatusView.setBuilder(a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo76537h() {
        if (isViewValid() && !C23794bh.m58390d().mo47103a() && getActivity() != null) {
            if (!C37388i.m83712a(getActivity())) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
                this.mStatusView.mo19214h();
                this.f95013t = true;
                return;
            }
            if (this.f95001d != null && !TextUtils.isEmpty(this.f95002e)) {
                this.f95001d.mo44934a_(Integer.valueOf(1), this.f95002e, this.f95003j);
                this.f95013t = false;
            }
        }
    }

    /* renamed from: c_ */
    public final void mo76536c_(boolean z) {
        this.f95007n = z;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @C53771m
    public void onEvent(C37354g gVar) {
        m83458m();
    }

    /* renamed from: a */
    public final void mo50570a(Exception exc) {
        C32458a.m75148a((Throwable) exc);
    }

    /* renamed from: b */
    public final void mo59960b(MusicModel musicModel) {
        if (this.f94999b != null) {
            this.f94999b.mo50911a();
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        if (isViewValid()) {
            this.f95009p.mo54793i();
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            m83457k();
        } else {
            this.f94999b.f95726n = false;
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (isViewValid()) {
            this.f95013t = true;
            this.mStatusView.mo19214h();
        }
    }

    @C53771m
    public void onAntiCrawlerEvent(C23481a aVar) {
        String str = aVar.f62554a;
        if (str != null && str.contains("/aweme/v1/original/music/list/?")) {
            C47718bf.m103293f(aVar);
            mo76537h();
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            m83457k();
        } else if (this.f94999b != null) {
            this.f94999b.f95726n = false;
        }
    }

    /* renamed from: a */
    private DmtTextView m83453a(int i) {
        DmtTextView dmtTextView = new DmtTextView(new C1221d(getContext(), R.style.tf));
        dmtTextView.setTextColor(getContext().getResources().getColor(R.color.a19));
        dmtTextView.setText(R.string.c0e);
        return dmtTextView;
    }

    /* renamed from: a */
    private void m83455a(List<Music> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Music music : list) {
                if (music != null) {
                    arrayList.add(music.convertToMusicModel());
                }
            }
            this.mListView.setVisibility(0);
            this.f95009p.mo76607a((List<MusicModel>) arrayList);
        }
    }

    @C53771m
    public void onMusicCollect(C37351d dVar) {
        if (dVar != null && dVar.f95312b != null) {
            if (1 == dVar.f95311a) {
                this.f95011r.mo44934a_(Integer.valueOf(1), dVar.f95312b.getMusicId(), Integer.valueOf(1));
                return;
            }
            if (dVar.f95311a == 0) {
                this.f95011r.mo44934a_(Integer.valueOf(1), dVar.f95312b.getMusicId(), Integer.valueOf(0));
            }
        }
    }

    /* renamed from: d */
    private DmtTextView m83456d(boolean z) {
        int i;
        String str;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        DmtTextView dmtTextView = new DmtTextView(new C1221d(context, R.style.tf));
        if (z) {
            i = R.string.gth;
        } else {
            i = R.string.gx2;
        }
        String string = getString(i);
        if (z) {
            str = getString(R.string.gtg);
        } else {
            StringBuilder sb = new StringBuilder("@");
            sb.append(this.f95004k);
            str = getString(R.string.gx1, sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append("\n");
        sb2.append(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(17, true), 0, string.length(), 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, string.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.a17)), 0, string.length(), 18);
        dmtTextView.setTextColor(context.getResources().getColor(R.color.a19));
        dmtTextView.setGravity(17);
        dmtTextView.setText(spannableStringBuilder);
        dmtTextView.setLineSpacing(C9432q.m18687b(context, 12.0f), 1.0f);
        return dmtTextView;
    }

    /* renamed from: a */
    public final void mo59958a(MusicModel musicModel) {
        if (musicModel != null) {
            this.f95010q = musicModel;
            if (this.f95000c) {
                this.f94999b.mo77055a(musicModel, this.f95012s);
            } else {
                this.f94999b.mo77059b(musicModel, this.f95012s);
            }
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<Music> list, boolean z) {
        if (isViewValid()) {
            if (z) {
                this.f95009p.ao_();
            } else {
                this.f95009p.an_();
            }
            if (!C10181b.m20511a().mo18172a(UseRecyclerPartialUpdateExperiment.class, true, "share_useNotifySingle", 31744, false)) {
                m83455a(list);
            } else if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Music music : list) {
                    if (music != null) {
                        arrayList.add(music.convertToMusicModel());
                    }
                }
                this.mListView.setVisibility(0);
                C37307m mVar = this.f95009p;
                mVar.f95217c.clear();
                mVar.f95217c.addAll(arrayList);
                if (mVar.f70699x) {
                    mVar.notifyItemRangeChanged(mVar.f95219e - 1, mVar.getItemCount() - mVar.f95219e);
                    mVar.notifyItemChanged(mVar.getItemCount() - 1);
                } else {
                    mVar.notifyItemRangeChanged(mVar.f95219e, mVar.getItemCount() - mVar.f95219e);
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.f95002e = arguments.getString("user_id");
        this.f95003j = arguments.getString("sec_user_id");
        this.f95014u = arguments.getBoolean("is_me", false);
        m83459n();
        this.f95001d = new C26876b();
        this.f95001d.mo54799a(new C37600a());
        this.f95001d.mo54800a(this);
        this.f95011r = new C29686a();
        this.f95011r.mo54800a(this);
        this.f95009p = new C37307m(this, this.f95002e, this.f102926I);
        this.f95009p.mo54798c(true);
        this.f94999b.mo50915c();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo4731b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.f95009p.mo54788a((C26846a) this);
        this.mListView.setAdapter(this.f95009p);
        this.f95009p.mo76607a((List<MusicModel>) new ArrayList<MusicModel>());
        if (!C37388i.m83712a(getActivity())) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
        } else if (this.f102924G) {
            mo76537h();
        }
        this.f95009p.mo54798c(true);
        this.f95009p.mo54788a((C26846a) new C26846a() {
            public final void ar_() {
                if (OriginMusicListFragment.this.f95001d != null && !TextUtils.isEmpty(OriginMusicListFragment.this.f95002e)) {
                    OriginMusicListFragment.this.f95001d.mo44934a_(Integer.valueOf(4), OriginMusicListFragment.this.f95002e, OriginMusicListFragment.this.f95003j);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo59959a(MusicModel musicModel, int i) {
        this.f94999b.f95723k = this.f95008o;
        this.f94999b.f95725m = i;
        this.f94999b.mo77059b(musicModel, this.f95012s);
    }

    /* renamed from: a */
    public final void mo53807a(String str, String str2) {
        this.f95002e = str;
        this.f95003j = str2;
    }

    /* renamed from: a */
    public static OriginMusicListFragment m83454a(String str, String str2, boolean z) {
        OriginMusicListFragment originMusicListFragment = new OriginMusicListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        bundle.putString("sec_user_id", str2);
        bundle.putBoolean("is_me", z);
        originMusicListFragment.setArguments(bundle);
        return originMusicListFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.bq3, viewGroup, false);
        this.f94999b = new C37518aw(this);
        this.f95005l = (ViewStub) inflate.findViewById(R.id.cue);
        this.f95006m = this.f95005l.inflate();
        if (C23794bh.m58390d().mo47103a()) {
            ((TextView) this.f95006m.findViewById(R.id.title)).setText(R.string.dww);
            ((TextView) this.f95006m.findViewById(R.id.ze)).setText(R.string.dwl);
        }
        this.f95006m.setVisibility(4);
        return inflate;
    }

    /* renamed from: a */
    public final void mo50816a(String str, MusicModel musicModel, String str2) {
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C37386g(getActivity(), new Builder().musicOrigin(str2).musicPath(str).build(), musicModel));
    }
}
