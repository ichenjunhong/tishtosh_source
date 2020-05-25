package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.content.C0732g;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23393g;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30508z;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30750af;
import com.p683ss.android.ugc.aweme.flowfeed.p1757f.C31777f;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31805p;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.C31835c;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31843f;
import com.p683ss.android.ugc.aweme.flowfeed.viewmodel.FollowEnterDetailViewModel;
import com.p683ss.android.ugc.aweme.follow.presenter.C31877a;
import com.p683ss.android.ugc.aweme.follow.presenter.C31882e;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.forward.p1778f.C32411d;
import com.p683ss.android.ugc.aweme.forward.p1779vh.C32436i;
import com.p683ss.android.ugc.aweme.homepage.api.data.C32968a;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p683ss.android.ugc.aweme.live.model.C36141b;
import com.p683ss.android.ugc.aweme.main.C36606dx;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p683ss.android.ugc.aweme.newfollow.p1994a.C37837a;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37861d;
import com.p683ss.android.ugc.aweme.newfollow.p1999f.C37864a;
import com.p683ss.android.ugc.aweme.newfollow.p1999f.C37865b;
import com.p683ss.android.ugc.aweme.newfollow.p1999f.C37867d;
import com.p683ss.android.ugc.aweme.newfollow.p1999f.C37875i;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37878a;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37879b;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37997r;
import com.p683ss.android.ugc.aweme.newfollow.util.C37934d;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1390av.C23298a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.services.video.IAVPublishService.OnPublishCallback;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44371e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2235c.C44593a;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean;
import com.p683ss.android.ugc.aweme.story.p2332a.C46619a;
import com.p683ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47863eu;
import com.p683ss.android.ugc.aweme.utils.C47881fd;
import com.p683ss.android.ugc.vcd.C50509h;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.b */
public class C37915b extends C30750af {

    /* renamed from: A */
    private String f96542A;

    /* renamed from: B */
    private String f96543B;

    /* renamed from: C */
    private String f96544C;

    /* renamed from: D */
    private Integer f96545D;

    /* renamed from: a */
    public C37997r f96546a;

    /* renamed from: b */
    public C31877a f96547b;

    /* renamed from: c */
    public boolean f96548c;

    /* renamed from: d */
    public View f96549d;

    /* renamed from: e */
    public View f96550e;

    /* renamed from: j */
    public boolean f96551j;

    /* renamed from: k */
    public long f96552k;

    /* renamed from: l */
    private C37865b f96553l;

    /* renamed from: m */
    private C37867d f96554m;

    /* renamed from: n */
    private C37864a f96555n;

    /* renamed from: o */
    private C31777f f96556o;

    /* renamed from: v */
    private BroadcastReceiver f96557v;

    /* renamed from: w */
    private C37875i f96558w;

    /* renamed from: x */
    private View f96559x;

    /* renamed from: y */
    private String f96560y;

    /* renamed from: z */
    private String f96561z;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    public final void bD_() {
    }

    public void onDetach() {
        super.onDetach();
    }

    @C53771m
    public void onLiveRoomScrollEvent(C36141b bVar) {
    }

    @C53771m
    public void onStoryPublishAnimEnd(C46619a aVar) {
    }

    /* renamed from: w */
    public final int mo63442w() {
        return this.f80581r;
    }

    /* renamed from: e */
    public final List<FollowFeed> mo77373e() {
        return this.f96547b.f83275i;
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("homepage_follow");
    }

    public void onStop() {
        super.onStop();
        if (this.f96546a != null) {
            this.f96546a.mo64891g();
        }
        this.f96548c = false;
    }

    /* renamed from: f */
    private C37867d m84772f() {
        if (this.f96554m == null) {
            this.f96554m = new C37867d(getContext(), this.f80580q);
        }
        return this.f96554m;
    }

    public void onResume() {
        super.onResume();
        if (getUserVisibleHint() && !C47863eu.m103535a()) {
            if (this.f96546a != null) {
                this.f96546a.mo64890f();
            }
            mo63439t();
            this.f96548c = true;
        }
    }

    /* renamed from: g */
    private boolean m84773g() {
        if (C10181b.m20511a().mo18172a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", 31744, false) && (getActivity() instanceof MainActivity)) {
            return FollowEnterDetailViewModel.m74256a("FollowFeedFragment", getActivity()).f83230a;
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.f29769b_ = false;
        if (this.f96546a != null) {
            this.f96546a.mo64893h();
        }
        if (getActivity() != null) {
            if ((getActivity() instanceof MainActivity) && ((MainActivity) getActivity()).isUnderSecondTab()) {
                mo63440u();
            }
            this.f96548c = false;
            C37940g.m84832a().mo77418d();
        }
    }

    /* renamed from: t */
    public final void mo63439t() {
        if (getActivity() != null && (getActivity() instanceof MainActivity) && ((MainActivity) getActivity()).isUnderSecondTab() && !C47863eu.m103535a()) {
            C37879b.m84566a();
        }
    }

    /* renamed from: u */
    public final void mo63440u() {
        if (C10181b.m20511a().mo18172a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", 31744, false)) {
            if (!m84773g()) {
                C37879b.m84580a(mo63441v(), "list");
            }
        } else if (!C31843f.m74206a().mo64953b()) {
            C37879b.m84580a(mo63441v(), "list");
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f96553l != null) {
            this.f96553l.mo46991S_();
            this.f96553l.aq_();
            this.f96553l.mo64717g();
            this.f96553l.mo64716f();
        }
        if (this.f96555n != null) {
            this.f96555n.mo46991S_();
            this.f96555n.aq_();
            C47718bf.m103291d(this.f96555n);
        }
        if (this.f96556o != null) {
            this.f96556o.mo46991S_();
            this.f96556o.aq_();
            this.f96556o.mo64734g();
        }
        if (this.f96546a != null) {
            this.f96546a.mo64894i();
        }
        C0732g.m2130a(getContext()).mo2402a(this.f96557v);
        C31843f.m74206a().mo64950a("key_container_follow");
        C32411d.m74938a().f84344a.clear();
    }

    @C53771m
    public void onVcdAuthorizeEvent(C50509h hVar) {
        if (hVar.f126610a && this.f96546a != null) {
            this.f96546a.mo77463j();
        }
    }

    @C53771m
    public void onAntiCrawlerEvent(C23481a aVar) {
        String str = aVar.f62554a;
        if (str != null && str.contains("/aweme/v2/follow/feed/?")) {
            C47718bf.m103293f(aVar);
            mo59855d_(false);
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (this.f96546a != null) {
            this.f96546a.mo65164f_(!z);
        }
        if (z) {
            this.f96547b.f83272f = 0;
            this.f96552k = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo63436a(Bundle bundle) {
        super.mo63436a(bundle);
        this.f96551j = bundle.getBoolean("extra_follow_lazy_refresh", false);
        this.f96543B = bundle.getString("extra_story_insert_uid");
        this.f96544C = bundle.getString("extra_insert_aweme_id");
        m84772f().f96399b = this.f80580q;
    }

    /* renamed from: d_ */
    public final boolean mo59855d_(boolean z) {
        if (z && this.f96546a != null) {
            this.f96546a.mo77465l();
        }
        C37865b bVar = this.f96553l;
        ((C31877a) bVar.f70700f).f83270d = z;
        bVar.f96396p = z;
        if (this.f96546a != null) {
            C37997r rVar = this.f96546a;
            rVar.f96726A = this.f96545D;
            rVar.mo47048a();
        }
        return false;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishServiceRunning(activity)) {
            if (activity instanceof MainActivity) {
                MainActivity mainActivity = (MainActivity) activity;
                mo77372a(mainActivity.getBinder(), mainActivity.getProcessedCallback());
            }
        } else if (activity instanceof MainActivity) {
            this.f96554m = m84772f();
            this.f96554m.mo77311a(false);
        }
    }

    @C53771m
    public void onEvent(C35471h hVar) {
        if ((TextUtils.equals("aweme", hVar.itemType) && TextUtils.equals("homepage_follow", hVar.enterFrom) && TextUtils.equals("extra_follow_type_follow", this.f80583t)) || (TextUtils.equals("homepage_friends", hVar.enterFrom) && TextUtils.equals("extra_follow_type_friend", this.f80583t))) {
            C47881fd.m103578a(getActivity(), this.f96559x, hVar);
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C23298a.m57308a();
        boolean equals = TextUtils.equals(this.f80583t, "extra_follow_type_follow");
        C36606dx dxVar = (C36606dx) C23393g.m57474a(C11010c.m22280a(), C36606dx.class);
        if (dxVar != null) {
            dxVar.mo48527g(equals);
        }
        if (this.f96546a != null) {
            this.f96546a.mo64887c(z);
        }
        if (z) {
            mo63439t();
            if (getActivity() != null) {
                FriendTabViewModel.m84727a(getActivity()).f96515b.setValue(new C37925h(this.f80580q, true));
            }
        } else {
            mo63440u();
        }
    }

    @C53771m
    public void onVoteEvent(C44593a aVar) {
        C37997r rVar = this.f96546a;
        if (aVar != null && rVar.f83139f != null) {
            for (int i = 0; i < ((C37837a) rVar.f83139f).getItemCount(); i++) {
                C37859b b = ((C37837a) rVar.f83139f).mo64635b(i);
                if (b instanceof FollowFeed) {
                    Aweme aweme = b.getAweme();
                    if (aweme != null && TextUtils.equals(aweme.getAid(), aVar.f112807a)) {
                        for (InteractStickerStruct voteStruct : aweme.getInteractStickerStructs()) {
                            VoteStruct voteStruct2 = voteStruct.getVoteStruct();
                            if (voteStruct2 != null && voteStruct2.getOptions() != null) {
                                Iterator it = voteStruct2.getOptions().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((OptionsBean) it.next()).getOptionId() == aVar.f112808b) {
                                            voteStruct2.setSelectOptionId(aVar.f112808b);
                                            int j = rVar.f83140g.mo4749j();
                                            int l = rVar.f83140g.mo4751l();
                                            while (true) {
                                                if (j > l) {
                                                    break;
                                                }
                                                C1352v f = rVar.f83135b.mo4847f(j);
                                                if (f instanceof C31805p) {
                                                    C31805p pVar = (C31805p) f;
                                                    if (TextUtils.equals(pVar.f83048c.getAid(), aweme.getAid())) {
                                                        pVar.f83048c = aweme;
                                                        pVar.mo64833R();
                                                        break;
                                                    }
                                                }
                                                if (f instanceof C32436i) {
                                                    C32436i iVar = (C32436i) f;
                                                    if (TextUtils.equals(iVar.f84362F.getAid(), aweme.getAid())) {
                                                        iVar.f84362F = aweme;
                                                        iVar.mo65686G();
                                                        break;
                                                    }
                                                }
                                                j++;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo77372a(C44371e eVar, OnPublishCallback onPublishCallback) {
        this.f96554m = m84772f();
        this.f96554m.f96400c = onPublishCallback;
        this.f96554m.mo77310a(eVar);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f96549d = view.findViewById(R.id.b9e);
        this.f96550e = view.findViewById(R.id.b72);
        if (this.f96555n == null) {
            this.f96555n = new C37864a();
        }
        this.f96555n = this.f96555n;
        C47718bf.m103290c(this.f96555n);
        this.f96556o = new C31777f(this.f80580q, this.f80581r);
        this.f96556o.mo64733f();
        this.f96546a = new C37997r();
        this.f96546a.f96741n = this.f80583t;
        this.f96546a.f96742o = this.f80580q;
        this.f96556o.mo54799a(new C30508z());
        this.f96556o.mo54800a((C31835c) this.f96546a);
        this.f96557v = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && C37915b.this.getUserVisibleHint() && C37915b.this.f29769b_ && !C37915b.this.f96548c) {
                    if (C37915b.this.f96546a != null) {
                        C37915b.this.f96546a.mo64890f();
                    }
                    C37915b.this.mo63439t();
                    C37915b.this.f96548c = true;
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C0732g.m2130a(getContext()).mo2403a(this.f96557v, intentFilter);
        if (this.f96553l == null) {
            this.f96553l = new C37865b(this);
        }
        this.f96553l = this.f96553l;
        this.f96553l.mo64702a((Fragment) this, mo63442w());
        this.f96553l.mo54800a(this.f96546a);
        this.f96546a.f96745r = this.f96543B;
        C37997r rVar = this.f96546a;
        rVar.f96747t = this.f96551j;
        if (rVar.f83139f != null) {
            ((C37837a) rVar.f83139f).f96337I = rVar.f96747t;
        }
        this.f96546a.mo77458a(this, view, this.f96553l, this.f96556o);
        C37867d f = m84772f();
        f.f96402e = this.f96546a;
        if (f.f96402e != null) {
            f.f96402e.mo77465l();
        }
        if (AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishServiceRunning(getContext())) {
            m84772f().mo77309a();
        }
        this.f96558w = new C37875i();
        C37875i iVar = this.f96558w;
        iVar.f96418a = this.f96546a;
        if (iVar.f96418a != null) {
            iVar.f96418a.mo77465l();
        }
        this.f96547b = new C31877a();
        this.f96547b.f83268b = this.f80580q;
        this.f96547b.f83269c = this.f80583t;
        this.f96553l.mo54799a(this.f96547b);
        this.f96547b.f83271e = System.currentTimeMillis();
        if (getActivity() instanceof MainActivity) {
            C32968a aVar = HomePageDataViewModel.m75866a(getActivity()).f85648b;
            this.f96560y = aVar.mo69850a();
            this.f96561z = aVar.mo69851b();
            this.f96542A = aVar.mo69852c();
        }
        if (TextUtils.isEmpty(this.f96560y)) {
            this.f96560y = this.f96544C;
        }
        if (!this.f96551j) {
            if (TextUtils.equals(this.f80580q, "homepage_follow")) {
                FollowPageFirstFrameViewModel.m103062a(getActivity());
            }
            C37997r rVar2 = this.f96546a;
            String str = this.f96560y;
            String str2 = this.f96561z;
            String str3 = this.f96542A;
            if (rVar2.f96739l != null) {
                C37878a.m84562a(C37878a.m84561a(Integer.valueOf(1)));
                C37865b bVar = rVar2.f96739l;
                C31882e a = C31882e.m74310a(1, 0, 1, C37934d.m84797a(C22858c.f61207c).mo77398c());
                a.f83312a = Integer.valueOf(rVar2.f96748u.f83231a ? 1 : 0);
                bVar.mo44934a_(Integer.valueOf(1), a.mo65088b(str).mo65089c(str2).mo65090d(str3).mo65085a());
            }
        }
        this.f96555n.mo54800a(this.f96546a);
        this.f96555n.mo54799a(new C37861d());
        String str4 = this.f80580q;
        C52711k.m112240b(str4, "eventType");
        if (!TextUtils.equals(str4, "rec_follow")) {
            view.findViewById(R.id.csm).setVisibility(8);
        }
        this.f96559x = view.findViewById(R.id.cq0);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            mo59855d_(false);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ov, viewGroup, false);
        C26894c.m65022a(inflate.findViewById(R.id.csm));
        return inflate;
    }
}
