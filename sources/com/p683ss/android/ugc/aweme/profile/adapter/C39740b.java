package com.p683ss.android.ugc.aweme.profile.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextLoadingLayout;
import com.bytedance.jedi.ext.adapter.C11971g;
import com.google.p1057b.p1058a.C17417i;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26837d;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.profile.experiment.ProfilePostListPositionExperiment;
import com.p683ss.android.ugc.aweme.profile.experiment.ShowPrivateAlbumExp;
import com.p683ss.android.ugc.aweme.profile.model.LiveReplayCover;
import com.p683ss.android.ugc.aweme.profile.model.MediaMixList;
import com.p683ss.android.ugc.aweme.profile.model.PostGuideTasks;
import com.p683ss.android.ugc.aweme.profile.service.C40014g;
import com.p683ss.android.ugc.aweme.profile.service.C40022o;
import com.p683ss.android.ugc.aweme.profile.util.C40548i;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.b */
public final class C39740b extends C26837d {

    /* renamed from: A */
    public String f101423A;

    /* renamed from: B */
    public String f101424B;

    /* renamed from: C */
    public boolean f101425C;

    /* renamed from: D */
    public C1352v f101426D;

    /* renamed from: E */
    public Boolean f101427E = Boolean.valueOf(false);

    /* renamed from: F */
    public String f101428F;

    /* renamed from: G */
    protected String f101429G;

    /* renamed from: H */
    private C26872d f101430H;

    /* renamed from: I */
    private C39774s f101431I;

    /* renamed from: J */
    private MediaMixList f101432J;

    /* renamed from: K */
    private FragmentActivity f101433K;

    /* renamed from: L */
    private boolean f101434L;

    /* renamed from: M */
    private PostGuideTasks f101435M = null;

    /* renamed from: N */
    private ArrayList<LiveReplayCover> f101436N = new ArrayList<>();

    /* renamed from: e */
    public boolean f101437e;

    /* renamed from: f */
    public boolean f101438f = true;

    /* renamed from: g */
    public boolean f101439g;

    /* renamed from: h */
    C24579d f101440h;

    /* renamed from: i */
    public C29059c f101441i;

    /* renamed from: j */
    public LiveRoomStruct f101442j;

    /* renamed from: k */
    boolean f101443k;

    /* renamed from: l */
    protected int f101444l;

    /* renamed from: m */
    public boolean f101445m = true;

    /* renamed from: y */
    public boolean f101446y = true;

    /* renamed from: z */
    public String f101447z;

    /* renamed from: a */
    public final List<Aweme> mo50673a() {
        return this.f70670n;
    }

    /* renamed from: g */
    public final int mo80833g() {
        return super.mo48636c();
    }

    /* renamed from: j */
    public final boolean mo80834j() {
        if (this.f101435M != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private int m88440k() {
        return m88441l() + this.f101436N.size();
    }

    /* renamed from: l */
    private int m88441l() {
        boolean z;
        boolean z2 = this.f101437e;
        if (this.f101442j != null) {
            z = true;
        } else {
            z = false;
        }
        return (z2 ? 1 : 0) + (z ? 1 : 0) + (this.f101434L ? 1 : 0);
    }

    /* renamed from: f */
    public final void mo54785f() {
        this.f101435M = null;
        this.f101434L = false;
        this.f101432J = null;
        this.f101442j = null;
        super.mo54785f();
    }

    /* renamed from: c */
    public final int mo48636c() {
        int i;
        int k = m88440k() + super.mo48636c();
        if (this.f101435M == null) {
            i = 0;
        } else {
            i = 1;
        }
        return k + i;
    }

    public final String toString() {
        String str;
        switch (this.f101444l) {
            case 0:
                str = "TYPE_PUBLISH_AWEME";
                break;
            case 1:
                str = "TYPE_FAVORITE_AWEME";
                break;
            case 2:
                str = "TYPE_STORY_AWEME";
                break;
            case 3:
                str = "TYPE_ORIGIN_MUSIC";
                break;
            case 4:
                str = "TYPE_COLLECT_AWEME";
                break;
            case 5:
                str = "TYPE_DYNAMIC_STATE";
                break;
            default:
                str = "TYPE_TOOL_MASTER";
                break;
        }
        StringBuilder sb = new StringBuilder("profileListType: ");
        sb.append(str);
        sb.append(", itemCount: ");
        sb.append(getItemCount());
        sb.append(", baseCount: ");
        sb.append(mo48636c());
        sb.append(", mShowDraftBox: ");
        sb.append(this.f101437e);
        sb.append(", mShowFooter: ");
        sb.append(this.f70699x);
        sb.append(", isMyProfile: ");
        sb.append(this.f101443k);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo50303a(List<Aweme> list) {
        super.mo50303a(list);
        m88439e(list);
    }

    /* renamed from: b */
    public final void mo50304b(List<Aweme> list) {
        super.mo50304b(list);
        m88439e(list);
    }

    /* renamed from: c */
    public final void mo54798c(boolean z) {
        boolean z2;
        if (this.f101435M != null || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        super.mo54798c(z2);
    }

    /* renamed from: b */
    private Aweme m88438b(int i) {
        int k = i - m88440k();
        if (this.f70670n != null && k >= 0 && k < this.f70670n.size()) {
            return (Aweme) this.f70670n.get(k);
        }
        return null;
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        this.f101426D = super.mo49730a_(viewGroup);
        if (this.f101427E.booleanValue()) {
            mo80831c(this.f101428F);
            this.f101427E = Boolean.valueOf(false);
        }
        return this.f101426D;
    }

    public final void onViewDetachedFromWindow(C1352v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof C39755o) {
            C39755o oVar = (C39755o) vVar;
            oVar.f101502g.mo80964a().removeObserver(oVar);
        }
    }

    /* renamed from: a */
    public final void mo80829a(PostGuideTasks postGuideTasks) {
        boolean z;
        if (!C17417i.m42646a(this.f101435M, null)) {
            this.f101435M = null;
            if (this.f101435M == null) {
                z = true;
            } else {
                z = false;
            }
            mo54798c(z);
            notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public final void mo80832d(String str) {
        mo54790b(str);
        if (this.f101426D != null) {
            TextView textView = (TextView) ((DmtStatusView) this.f101426D.itemView).mo19205b(1);
            LayoutParams layoutParams = new LayoutParams(-2, -1);
            layoutParams.gravity = 1;
            textView.setLayoutParams(layoutParams);
            textView.setTextColor(this.f101433K.getResources().getColor(R.color.a7y));
            textView.setText(str);
            an_();
        }
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (this.f101439g && vVar.mItemViewType == 0 && this.f101430H != null) {
            this.f101430H.mo50455a(vVar);
        }
        if (vVar instanceof C39755o) {
            C39755o oVar = (C39755o) vVar;
            oVar.f101502g.mo80964a().observe(oVar.f101505j, oVar);
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        int i2;
        if (!this.f101434L) {
            i2 = 0;
        } else if (i == 0) {
            return 4;
        } else {
            i2 = 1;
        }
        if (this.f101437e) {
            if (i2 == i) {
                return 1;
            }
            i2++;
        }
        if (this.f101442j != null && i2 == i) {
            return 3;
        }
        if (this.f101436N.size() > 0) {
            int l = m88441l();
            if (i >= l && i < l + this.f101436N.size()) {
                return 6;
            }
        }
        Aweme b = m88438b(i);
        if (b != null && b.getAwemeType() == 2) {
            return 2;
        }
        if (this.f101435M == null || i != mo48636c() - 1) {
            return super.mo48641a(i);
        }
        return 5;
    }

    /* renamed from: c */
    public void mo80831c(String str) {
        if (this.f101426D != null && !TextUtils.isEmpty(str)) {
            DmtStatusView dmtStatusView = (DmtStatusView) this.f101426D.itemView;
            DmtTextLoadingLayout dmtTextLoadingLayout = new DmtTextLoadingLayout(this.f101433K);
            dmtTextLoadingLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            dmtTextLoadingLayout.setBottomText(str);
            dmtTextLoadingLayout.setBoxViewBackground(null);
            dmtStatusView.setBuilder(dmtStatusView.mo19207c().mo19228a((View) dmtTextLoadingLayout));
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) dmtStatusView.getLayoutParams();
            layoutParams.height = (int) C9432q.m18687b((Context) this.f101433K, 85.0f);
            dmtStatusView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: e */
    private void m88439e(List<Aweme> list) {
        if (this.f101443k && this.f101444l == 0 && list != null) {
            int size = list.size();
            int awemeCount = C20854a.m53167g().getCurUser().getAwemeCount();
            if (size > awemeCount) {
                StringBuilder sb = new StringBuilder();
                sb.append(size);
                sb.append("-");
                sb.append(awemeCount);
                C26890h.m65011a("publish_num_check", C23089d.m56640a().mo47826a("error_type", 1).mo47829a("num_des", sb.toString()).f61491a);
            }
            if (size == 0 && awemeCount == 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(size);
                sb2.append("-");
                sb2.append(awemeCount);
                C26890h.m65011a("publish_num_check", C23089d.m56640a().mo47826a("error_type", 2).mo47829a("num_des", sb2.toString()).f61491a);
            }
            if (!this.f101446y && size != awemeCount) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(size);
                sb3.append("-");
                sb3.append(awemeCount);
                C26890h.m65011a("publish_num_check", C23089d.m56640a().mo47826a("error_type", 3).mo47829a("num_des", sb3.toString()).f61491a);
            }
        }
    }

    /* renamed from: a */
    private static boolean m88437a(int i, boolean z) {
        if (i != 4 || !z || C40014g.f101956a.mo82040a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return new C39744e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bqh, viewGroup, false));
            case 2:
                return new C39753n(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bpf, viewGroup, false), this.f101429G, this.f101440h);
            case 3:
                return new C39755o(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bpl, viewGroup, false), this.f101433K);
            case 4:
                if (this.f101431I == null) {
                    this.f101431I = new C39774s(this.f101433K);
                }
                C39774s sVar = this.f101431I;
                MediaMixList mediaMixList = this.f101432J;
                C52711k.m112240b(viewGroup, "parent");
                C52711k.m112240b(mediaMixList, "mediaMixList");
                MediaMixListViewHolder mediaMixListViewHolder = (MediaMixListViewHolder) sVar.f101527a.mo22695a(viewGroup, sVar.f101527a.mo22701b(0));
                mediaMixListViewHolder.f101383r = mediaMixList;
                return mediaMixListViewHolder;
            case 5:
                return new C39777t(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bpm, viewGroup, false));
            case 6:
                throw new IllegalArgumentException("not supported in i18n");
            default:
                return new C39741c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bp9, viewGroup, false), this.f101429G, this.f101440h);
        }
    }

    /* renamed from: a */
    public final void mo80830a(boolean z, MediaMixList mediaMixList) {
        if (this.f101434L != z) {
            this.f101434L = z;
            this.f101432J = mediaMixList;
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        long j;
        long j2;
        C1352v vVar2 = vVar;
        int i2 = i;
        int i3 = 8;
        switch (getItemViewType(i2)) {
            case 1:
                ((C39744e) vVar2).mo54774a(this.f101441i, i2);
                return;
            case 2:
                Aweme b = m88438b(i2);
                C39753n nVar = (C39753n) vVar2;
                boolean z = this.f101439g;
                String str = this.f101429G;
                boolean z2 = this.f101443k;
                int i4 = this.f101444l;
                if (b != null) {
                    nVar.f70665k = b;
                    AwemeStatistics statistics = b.getStatistics();
                    if (!z2 || i4 != 0) {
                        nVar.f101489f.setVisibility(0);
                        nVar.f101489f.setCompoundDrawablesWithIntrinsicBounds(C0726c.m2091a(nVar.f101484a, (int) R.drawable.dqa), null, null, null);
                        if (statistics == null) {
                            j = 0;
                        } else {
                            j = statistics.getDiggCount();
                        }
                        String a = C33095b.m76068a(j);
                        nVar.f101489f.setText(a);
                        nVar.f101489f.setContentDescription(nVar.f101484a.getString(R.string.cyr, new Object[]{a}));
                        nVar.f101491h.setBackground(C0726c.m2091a(nVar.f101484a, (int) R.drawable.dm1));
                    } else {
                        nVar.f101489f.setVisibility(0);
                        AwemeStatus status = b.getStatus();
                        if (status != null) {
                            status.isInReviewing();
                        }
                        if (statistics == null) {
                            j2 = 0;
                        } else {
                            j2 = statistics.getPlayCount();
                        }
                        String a2 = C33095b.m76068a(j2);
                        nVar.f101489f.setCompoundDrawablesWithIntrinsicBounds(C0726c.m2091a(nVar.f101484a, (int) R.drawable.dqd), null, null, null);
                        nVar.f101489f.setText(a2);
                        nVar.f101489f.setTextColor(nVar.f101484a.getResources().getColor(R.color.w2));
                        nVar.f101489f.setTypeface(Typeface.SANS_SERIF, 2);
                        nVar.f101489f.setContentDescription(nVar.f101484a.getString(R.string.cyu, new Object[]{a2}));
                    }
                    if (!((Boolean) SharePrefCache.inst().getIsPrivateAvailable().mo47782d()).booleanValue() || (((!z2 || i4 != 0) && !C31190f.m72831a(b)) || b.getStatus().getPrivateStatus() == 0)) {
                        nVar.f101488e.setVisibility(8);
                    } else {
                        nVar.f101488e.setVisibility(0);
                        if (b.getStatus().getPrivateStatus() == 1) {
                            nVar.f101488e.setImageResource(R.drawable.dqc);
                        } else if (b.getStatus().getPrivateStatus() == 2) {
                            nVar.f101488e.setImageResource(R.drawable.dq_);
                        }
                        if (ShowPrivateAlbumExp.m88630a()) {
                            nVar.f101489f.setVisibility(8);
                        }
                    }
                    if (b.getIsTop() == 1) {
                        nVar.f101490g.setVisibility(0);
                    } else {
                        nVar.f101490g.setVisibility(8);
                    }
                    if (z) {
                        nVar.mo50301a();
                    }
                    nVar.f70666l.setContentDescription(nVar.f101484a.getString(R.string.cyt, new Object[]{Integer.valueOf(i2 + 1)}));
                }
                String str2 = this.f101447z;
                if (ProfilePostListPositionExperiment.m88629a()) {
                    if (TextUtils.equals(str2, ((Aweme) nVar.f70665k).getAid())) {
                        i3 = 0;
                    }
                    nVar.f101492o.setVisibility(i3);
                } else {
                    C40022o.f101958a.mo46904a(str2, ((Aweme) nVar.f70665k).getAid(), nVar.f101486c, nVar.f101487d, nVar.f101484a);
                }
                m88436a(this.f101444l, this.f101445m, b);
                return;
            case 3:
                C39755o oVar = (C39755o) vVar2;
                LiveRoomStruct liveRoomStruct = this.f101442j;
                C52711k.m112240b(liveRoomStruct, "room");
                LiveRoomStruct liveRoomStruct2 = oVar.f101501f;
                if (liveRoomStruct2 == null || liveRoomStruct2.f79734id != liveRoomStruct.f79734id) {
                    C39755o.m88475a(liveRoomStruct);
                }
                oVar.f101501f = liveRoomStruct;
                if (oVar.f101503h) {
                    oVar.f101504i.mo74822a(true, liveRoomStruct, oVar.f101498c);
                }
                oVar.f101499d.setText(String.valueOf(liveRoomStruct.user_count));
                oVar.f101502g.mo80964a().observe(oVar.f101505j, oVar);
                return;
            case 4:
                if (this.f101431I != null) {
                    C39774s sVar = this.f101431I;
                    MediaMixListViewHolder mediaMixListViewHolder = (MediaMixListViewHolder) vVar2;
                    MediaMixList mediaMixList = this.f101432J;
                    String str3 = this.f101429G;
                    String str4 = this.f101423A;
                    String str5 = this.f101424B;
                    C52711k.m112240b(mediaMixListViewHolder, "holder");
                    C52711k.m112240b(mediaMixList, "mediaMixList");
                    if (mediaMixListViewHolder.f101383r != mediaMixList) {
                        MediaMixListViewModel p = mediaMixListViewHolder.mo80826p();
                        C52671b aVar = new C39776a(mediaMixList);
                        C52711k.m112240b(aVar, "reducer");
                        p.mo22530c(aVar);
                    }
                    mediaMixListViewHolder.f101382q = str3;
                    if (str4 == null) {
                        str4 = "";
                    }
                    mediaMixListViewHolder.mo80824a(str4);
                    if (str5 == null) {
                        str5 = "";
                    }
                    mediaMixListViewHolder.mo80825b(str5);
                    C11971g.m24330a(mediaMixListViewHolder, C52860x.f131107a, i2, null);
                    return;
                }
                break;
            case 5:
                ((C39777t) vVar2).mo80849a(this.f101435M);
                break;
            case 6:
                StringBuilder sb = new StringBuilder("onBindBasicViewHolder TYPE_LIVE_REPLAY_COVER, position is ");
                sb.append(i2);
                sb.append(", countBeforeLiveReplayCover is ");
                sb.append(m88441l());
                C40548i.m89965a(sb.toString());
                LiveReplayCover liveReplayCover = (LiveReplayCover) this.f101436N.get(i2 - m88441l());
                throw new IllegalArgumentException("not supported in i18n");
        }
        if (vVar2 instanceof C39741c) {
            Aweme b2 = m88438b(i2);
            C39741c cVar = (C39741c) vVar2;
            cVar.mo80836a(b2, i, this.f101439g, this.f101429G, this.f101443k, this.f101444l);
            cVar.mo54779c(this.f101438f);
            String str6 = this.f101447z;
            if (ProfilePostListPositionExperiment.m88629a()) {
                if (TextUtils.equals(str6, ((Aweme) cVar.f70665k).getAid())) {
                    i3 = 0;
                }
                cVar.f101452e.setVisibility(i3);
            } else {
                C40022o.f101958a.mo46904a(str6, ((Aweme) cVar.f70665k).getAid(), cVar.f101450c, cVar.f101451d, cVar.f101448a);
            }
            m88436a(this.f101444l, this.f101445m, b2);
        }
    }

    /* renamed from: a */
    private static void m88436a(int i, boolean z, Aweme aweme) {
        if (m88437a(i, z) && aweme != null) {
            C40014g.f101956a.mo82038a(aweme);
        }
    }

    public C39740b(FragmentActivity fragmentActivity, String str, boolean z, int i, C24579d dVar, C26872d dVar2, String str2, String str3) {
        this.f101433K = fragmentActivity;
        this.f101429G = str;
        this.f101440h = dVar;
        this.f101443k = z;
        this.f101444l = i;
        this.f101430H = dVar2;
        this.f101423A = str2;
        this.f101424B = str3;
    }
}
