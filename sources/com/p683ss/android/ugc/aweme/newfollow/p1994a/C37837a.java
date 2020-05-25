package com.p683ss.android.ugc.aweme.newfollow.p1994a;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C23771be.C23772a.C23773a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.experiment.FollowFeedLiveTypeExperiment;
import com.p683ss.android.ugc.aweme.feed.C30128ae;
import com.p683ss.android.ugc.aweme.feed.experiment.RecommendFilterFollowExperiment;
import com.p683ss.android.ugc.aweme.feed.helper.C30395r;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p683ss.android.ugc.aweme.flowfeed.p1752a.C31749e;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31782a;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31846h;
import com.p683ss.android.ugc.aweme.follow.C31857a;
import com.p683ss.android.ugc.aweme.follow.p1767ui.HeaderViewHolder;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.forward.p1779vh.BaseForwardViewHolder;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32464b;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32506c;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32720aj;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32728al;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32730an;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32773t;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IRecommendContactItemView;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.main.story.feed.StoryFeedPanel;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.newfollow.p1996c.C37854a;
import com.p683ss.android.ugc.aweme.newfollow.p1996c.C37855b;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37862e;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37863f;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37914a;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37946aa;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37947ab;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37950ac;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37951ad;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37975f;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37976g;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37977h;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37978i;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37979j;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37980k;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37980k.C37981a;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37983l;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37987m;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37988n;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37989o;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37992p;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37994q;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37997r;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C38007x;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C38014y;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.UpLoadItemViewHolder;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.UpLoadRecoverItemViewHolder;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.RecommendCommonUserView;
import com.p683ss.android.ugc.aweme.profile.presenter.C39993z;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p683ss.android.ugc.aweme.story.api.p2333a.C46621a;
import com.p683ss.android.ugc.aweme.story.api.p2334b.C46623a;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import com.p683ss.android.ugc.vcd.C50513l;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.a.a */
public class C37837a extends C31749e<FollowFeed> {

    /* renamed from: J */
    public static int f96332J = ((int) C9432q.m18687b(C11010c.m22280a(), 52.0f));

    /* renamed from: E */
    public boolean f96333E = false;

    /* renamed from: F */
    public C46623a f96334F;

    /* renamed from: G */
    public String f96335G;

    /* renamed from: H */
    public String f96336H;

    /* renamed from: I */
    public boolean f96337I;

    /* renamed from: K */
    public boolean f96338K = false;

    /* renamed from: L */
    public FollowFeed f96339L;

    /* renamed from: M */
    public FollowFeed f96340M;

    /* renamed from: N */
    public FollowFeed f96341N;

    /* renamed from: O */
    public C37862e f96342O;

    /* renamed from: P */
    public FollowFeed f96343P;

    /* renamed from: Q */
    public C37855b f96344Q;

    /* renamed from: R */
    public C37947ab f96345R;

    /* renamed from: S */
    public C37854a f96346S;

    /* renamed from: T */
    public C23452y<User> f96347T;

    /* renamed from: U */
    public C32506c f96348U;

    /* renamed from: V */
    public boolean f96349V = true;

    /* renamed from: W */
    private final Fragment f96350W;

    /* renamed from: X */
    private FollowFeed f96351X;

    /* renamed from: Y */
    private C37863f f96352Y;

    /* renamed from: Z */
    private C37997r f96353Z;

    /* renamed from: aa */
    private HashMap<String, Boolean> f96354aa = new HashMap<>();

    /* renamed from: ab */
    private boolean f96355ab = false;

    /* renamed from: ac */
    private String f96356ac = "";

    /* renamed from: ad */
    private String f96357ad = "";

    /* renamed from: ae */
    private C52670a<C52860x> f96358ae = null;

    /* renamed from: s */
    private void m84434s() {
    }

    /* renamed from: b */
    public final void mo54789b(View view) {
    }

    public final void ba_() {
        super.ba_();
    }

    /* renamed from: a */
    public final void mo64627a(String str) {
        if (!C9376b.m18558a((Collection<T>) this.f70670n) && !TextUtils.isEmpty(str)) {
            int i = -1;
            for (int size = this.f70670n.size() - 1; size >= 0; size--) {
                FollowFeed followFeed = (FollowFeed) this.f70670n.get(size);
                if (followFeed != null) {
                    if (followFeed.getFeedType() == 65280) {
                        if (followFeed.getAweme() != null && str.equals(followFeed.getAweme().getAuthorUid())) {
                            this.f70670n.remove(size);
                            notifyItemRemoved(size);
                        }
                    } else if (!(followFeed.getFeedType() != 65298 || followFeed.getRoomStruct() == null || followFeed.getRoomStruct().getNewLiveRoomData() == null || followFeed.getRoomStruct().getNewLiveRoomData().owner == null || !TextUtils.equals(str, followFeed.getRoomStruct().getNewLiveRoomData().owner.getUid()))) {
                        this.f70670n.remove(size);
                        notifyItemRemoved(size);
                    }
                    i = size;
                }
            }
            if (i != -1) {
                notifyItemRangeChanged(i, Math.max(1, (this.f70670n.size() - 1) - i));
            }
        }
    }

    /* renamed from: a */
    public final void mo77278a(boolean z) {
        if (this.f70670n != null && this.f70670n.contains(this.f96352Y)) {
            mo64638c(this.f70670n.indexOf(this.f96352Y));
            if (z) {
                C10691a.m21542b(this.f82940k.mo64656c(), (int) R.string.on).mo19066a();
            }
        }
        this.f82934e.mo64959a(500);
    }

    /* renamed from: a */
    public final void mo64630a(String str, Aweme aweme, int i) {
        mo51186a(new FollowFeed(aweme), i);
        int d = mo64641d(str);
        m73698a(mo64635b(d));
        C1352v f = this.f82941l.mo4847f(d);
        if (f instanceof C31782a) {
            ((C31782a) f).mo64797o();
            return;
        }
        if (f instanceof BaseForwardViewHolder) {
            ((BaseForwardViewHolder) f).mo65645A();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        if ((com.bytedance.ies.abmock.C10181b.m20511a().mo18172a(com.p683ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", 31744, false) && com.bytedance.ies.abmock.C10181b.m20511a().mo18172a(com.p683ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment.class, true, "enable_live_in_follow_feed_full_screen", 31744, false)) != false) goto L_0x006b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64624a(com.p683ss.android.ugc.aweme.feed.model.Aweme r13, java.lang.String r14) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x008c
            java.lang.String r0 = r12.f82944z
            boolean r14 = android.text.TextUtils.equals(r14, r0)
            if (r14 != 0) goto L_0x000c
            goto L_0x008c
        L_0x000c:
            android.support.v7.widget.RecyclerView r14 = r12.f82941l
            android.support.v7.widget.RecyclerView$i r14 = r14.getLayoutManager()
            android.support.v7.widget.LinearLayoutManager r14 = (android.support.p043v7.widget.LinearLayoutManager) r14
            java.util.List r0 = r12.f70670n
            java.util.Iterator r0 = r0.iterator()
        L_0x001a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x008b
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r1 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r1.getAweme()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x006a
            int r2 = r1.getFeedType()
            r5 = 65280(0xff00, float:9.1477E-41)
            if (r2 == r5) goto L_0x006b
            int r2 = r1.getFeedType()
            r5 = 65298(0xff12, float:9.1502E-41)
            if (r2 != r5) goto L_0x006a
            com.bytedance.ies.abmock.b r6 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB> r7 = com.p683ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB.class
            r8 = 1
            java.lang.String r9 = "follow_detail_full_screen"
            r10 = 31744(0x7c00, float:4.4483E-41)
            r11 = 0
            boolean r2 = r6.mo18172a(r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x0066
            com.bytedance.ies.abmock.b r5 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment> r6 = com.p683ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment.class
            r7 = 1
            java.lang.String r8 = "enable_live_in_follow_feed_full_screen"
            r9 = 31744(0x7c00, float:4.4483E-41)
            r10 = 0
            boolean r2 = r5.mo18172a(r6, r7, r8, r9, r10)
            if (r2 == 0) goto L_0x0066
            r2 = 1
            goto L_0x0067
        L_0x0066:
            r2 = 0
        L_0x0067:
            if (r2 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r3 = 0
        L_0x006b:
            if (r3 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r1.getAweme()
            java.lang.String r2 = r2.getAid()
            java.lang.String r3 = r13.getAid()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x001a
            java.util.List r13 = r12.f70670n
            int r13 = r13.indexOf(r1)
            int r0 = f96332J
            r14.mo4721a(r13, r0)
            return
        L_0x008b:
            return
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.newfollow.p1994a.C37837a.mo64624a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    /* renamed from: t */
    private FollowFeed m84435t() {
        if (this.f96351X == null) {
            this.f96351X = new FollowFeed();
            this.f96351X.setFeedType(65535);
        }
        an_();
        return this.f96351X;
    }

    public final void bb_() {
        super.bb_();
        if (this.f96334F != null) {
            C1056u.m3018B(this.f96334F.mo93437a());
        }
    }

    /* renamed from: p */
    public final FollowFeed mo77282p() {
        m84434s();
        if (this.f96339L == null) {
            this.f96339L = new FollowFeed();
            this.f96339L.setFeedType(65283);
        }
        return this.f96339L;
    }

    /* renamed from: r */
    public final void mo77284r() {
        if (this.f70670n != null && this.f70670n.contains(this.f96351X)) {
            mo64638c(this.f70670n.indexOf(this.f96351X));
            mo54798c(true);
        }
    }

    /* renamed from: k */
    public final void mo56247k() {
        if (!C9376b.m18558a((Collection<T>) this.f82935f)) {
            for (C31782a aVar : this.f82935f) {
                if (aVar instanceof C38007x) {
                    aVar.mo64746K();
                }
            }
        }
        super.mo56247k();
    }

    /* renamed from: o */
    public final int mo77280o() {
        if (this.f70670n == null || this.f70670n.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < this.f70670n.size(); i++) {
            if (((FollowFeed) this.f70670n.get(i)).getFeedType() == 65283) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final void mo77283q() {
        if (this.f70670n == null) {
            this.f70670n = new ArrayList();
        }
        if (this.f70670n.size() == 0) {
            mo51186a(m84435t(), 0);
            mo54798c(false);
            return;
        }
        if (this.f70670n.size() == 1 && (this.f70670n.contains(this.f96339L) || this.f70670n.contains(this.f96342O) || this.f70670n.contains(this.f96352Y))) {
            mo51186a(m84435t(), 1);
            mo54798c(false);
        }
    }

    /* renamed from: a */
    public final void mo50303a(List<FollowFeed> list) {
        super.mo50303a(list);
    }

    @C53771m
    public void onStoryListWidgetRefreshEvent(C46621a aVar) {
        notifyItemChanged(0);
    }

    /* renamed from: a */
    public final int mo51179a(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.ff);
    }

    /* renamed from: b */
    public final C31782a mo64634b(ViewGroup viewGroup) {
        return new C37975f((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f82940k, this.f82934e, this.f82938i);
    }

    /* renamed from: c */
    public final C31782a mo64637c(ViewGroup viewGroup) {
        return new C37976g((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f82940k, this.f82934e, this.f82938i);
    }

    /* renamed from: d */
    public final BaseForwardViewHolder mo64642d(ViewGroup viewGroup) {
        C37978i iVar = new C37978i((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f82940k, this.f82934e, this.f82937h, this.f82938i);
        return iVar;
    }

    /* renamed from: e */
    public final BaseForwardViewHolder mo64643e(ViewGroup viewGroup) {
        C37979j jVar = new C37979j((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f82940k, this.f82934e, this.f82937h, this.f82938i);
        return jVar;
    }

    /* renamed from: f */
    public final C1352v mo64646f(ViewGroup viewGroup) {
        C37977h hVar = new C37977h((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f82940k, this.f82934e, this.f82937h, this.f82938i);
        return hVar;
    }

    /* renamed from: e */
    public final List<FollowFeed> mo64644e(List<FollowFeed> list) {
        FollowFeed p = mo77282p();
        if (C9376b.m18558a((Collection<T>) list)) {
            list = new ArrayList<>();
            if (this.f96333E) {
                list.add(p);
            }
            list.add(m84435t());
            mo54798c(false);
        } else if (this.f96333E) {
            list.add(0, p);
        }
        mo77279f(list);
        return list;
    }

    /* renamed from: f */
    public void mo77279f(List<FollowFeed> list) {
        if (this.f96352Y != null && this.f70670n.contains(this.f96352Y)) {
            if (this.f96333E) {
                list.add(1, this.f96352Y);
            } else {
                list.add(0, this.f96352Y);
            }
        }
        if (this.f96342O != null && this.f70670n.contains(this.f96342O)) {
            if (this.f96333E) {
                list.add(1, this.f96342O);
                return;
            }
            list.add(0, this.f96342O);
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        int a = super.mo48641a(i);
        if (a != -1) {
            return a;
        }
        FollowFeed followFeed = (FollowFeed) this.f70670n.get(i);
        if (followFeed == null) {
            return -1;
        }
        if (followFeed.getFeedType() == 65281) {
            return 33;
        }
        if (followFeed.getFeedType() == 65283) {
            return 32;
        }
        if (followFeed.getFeedType() == 65297) {
            return 37;
        }
        if (followFeed.getFeedType() == 65298) {
            return 36;
        }
        if (followFeed.getFeedType() == 65282) {
            return 34;
        }
        if (followFeed.getFeedType() == 65535) {
            return 38;
        }
        if (followFeed.getFeedType() == 65288) {
            return 39;
        }
        if (followFeed.getFeedType() == 65284) {
            return 128;
        }
        if (followFeed.getFeedType() == 65534) {
            return 40;
        }
        if (followFeed.getFeedType() == 65533) {
            return 41;
        }
        if (followFeed.getFeedType() == 65532) {
            return 48;
        }
        if (followFeed.getFeedType() == 65531) {
            return 49;
        }
        if (followFeed.getFeedType() == 65289) {
            return 50;
        }
        if (followFeed.getFeedType() == 65530) {
            return 51;
        }
        if (followFeed.getFeedType() == 65299) {
            return 52;
        }
        if (followFeed.getFeedType() == 66666) {
            return 53;
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo77277a(FollowFeed followFeed, boolean z) {
        if (z) {
            if (this.f70670n != null && this.f70670n.contains(this.f96342O)) {
                int indexOf = this.f70670n.indexOf(this.f96342O);
                mo64638c(indexOf);
                mo51186a(followFeed, indexOf);
            }
        } else if (this.f70670n != null && this.f70670n.contains(this.f96342O)) {
            mo64638c(this.f70670n.indexOf(this.f96342O));
        }
        this.f82934e.mo64959a(500);
    }

    /* renamed from: a */
    public final void mo77276a(C29059c cVar, boolean z) {
        if (this.f70670n == null || !this.f70670n.contains(this.f96352Y)) {
            this.f96352Y = new C37863f();
            if (!this.f96333E || this.f70670n == null || this.f70670n.size() <= 0) {
                mo51186a(this.f96352Y, 0);
            } else {
                mo51186a(this.f96352Y, 1);
            }
            if (this.f82941l != null) {
                this.f82941l.mo4814b(0);
            }
            this.f82934e.mo64959a(500);
        }
        this.f96352Y.f96393a = cVar;
        this.f96352Y.f96394b = z;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        String str;
        C38007x xVar;
        String str2;
        String str3;
        if (i == 128) {
            return new UpLoadRecoverItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uc, viewGroup, false), (FragmentActivity) this.f82940k.mo64656c());
        }
        int i2 = 1;
        switch (i) {
            case 32:
                return new HeaderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ug, viewGroup, false));
            case 33:
                RecommendCommonUserView recommendCommonUserView = new RecommendCommonUserView(viewGroup.getContext());
                recommendCommonUserView.setBackgroundResource(R.color.a2j);
                if (TextUtils.equals("extra_follow_type_friend", this.f96335G)) {
                    i2 = 2;
                }
                recommendCommonUserView.setPageType(i2);
                this.f96345R = new C37947ab(recommendCommonUserView);
                C37947ab abVar = this.f96345R;
                if (this.f96338K) {
                    str = "empty";
                } else {
                    str = "nonempty";
                }
                abVar.f96627d = str;
                this.f96345R.f96625b = this.f96335G;
                return this.f96345R;
            case 34:
                return new UpLoadItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uc, viewGroup, false));
            default:
                switch (i) {
                    case 36:
                        int a = FollowFeedLiveTypeExperiment.m69594a();
                        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false);
                        switch (a) {
                            case 4:
                                xVar = new C38014y((FollowFeedLayout) inflate, this.f82940k, this.f82934e, this.f82938i);
                                break;
                            case 5:
                                xVar = new C37946aa((FollowFeedLayout) inflate, this.f82940k, this.f82934e, this.f82938i);
                                break;
                            default:
                                xVar = new C38007x((FollowFeedLayout) inflate, this.f82940k, this.f82934e, this.f82938i);
                                break;
                        }
                        String str4 = this.f96335G;
                        C52711k.m112240b(str4, "enterFrom");
                        xVar.f96763aV = str4;
                        return xVar;
                    case 37:
                        C52711k.m112240b(viewGroup, "parent");
                        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uf, viewGroup, false);
                        C52711k.m112236a((Object) inflate2, "view");
                        return new C37989o(inflate2);
                    case 38:
                        View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.m7, viewGroup, false);
                        Context c = this.f82940k.mo64656c();
                        if (TextUtils.equals("extra_follow_type_friend", this.f96335G)) {
                            str2 = "homepage_friends";
                        } else {
                            str2 = "homepage_follow";
                        }
                        return new C37983l(inflate3, c, str2);
                    case 39:
                        return new C37988n(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.m8, viewGroup, false));
                    case 40:
                        return new C37992p(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.m9, viewGroup, false), this.f82940k.mo64656c(), 65534);
                    case BaseNotice.LIKE /*41*/:
                        return new C37992p(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.m9, viewGroup, false), this.f82940k.mo64656c(), 65533);
                    default:
                        switch (i) {
                            case 48:
                                View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.m6, viewGroup, false);
                                this.f96338K = true;
                                C37980k kVar = new C37980k(inflate4, (FragmentActivity) this.f82940k.mo64656c(), this.f96335G, this.f96353Z, this);
                                return kVar;
                            case 49:
                                return new C37992p(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.m9, viewGroup, false), this.f82940k.mo64656c(), 65531);
                            case 50:
                                C32720aj ajVar = new C32720aj(viewGroup.getContext(), this.f96354aa, true);
                                if (TextUtils.equals(this.f96335G, "extra_follow_type_friend")) {
                                    str3 = "homepage_friends";
                                } else if (TextUtils.equals(this.f96335G, "extra_follow_type_follow")) {
                                    str3 = "homepage_follow";
                                } else {
                                    str3 = "";
                                }
                                ajVar.setEnterFrom(str3);
                                ajVar.setListener(this.f96347T);
                                ajVar.setRecommendAwemeClickListener(this.f96348U);
                                return new C32728al(ajVar);
                            case 51:
                                return new C32730an(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.up, viewGroup, false));
                            case 52:
                                IRecommendContactItemView createRecommendContactItemView = C32616c.f84865a.createRecommendContactItemView(viewGroup.getContext());
                                createRecommendContactItemView.setEnterFrom(this.f82944z);
                                createRecommendContactItemView.setDislikeListener(new C52682m<RecommendContact, Integer, C52860x>() {
                                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        C37837a.this.f96347T.mo48614a(102, (RecommendContact) obj, ((Integer) obj2).intValue(), null, "");
                                        return null;
                                    }
                                });
                                return C32616c.f84865a.createRecommendContactViewHolder(createRecommendContactItemView);
                            case 53:
                                return new C37994q(new DmtStatusView(viewGroup.getContext()));
                            default:
                                return super.mo48221a(viewGroup, i);
                        }
                }
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        CharSequence charSequence;
        int a = mo48641a(i);
        if (a == 41) {
            C37992p pVar = (C37992p) vVar;
            C37854a aVar = this.f96346S;
            C52711k.m112240b(aVar, "listener");
            pVar.f96713a = aVar;
        } else if (a == 48) {
            C37980k kVar = (C37980k) vVar;
            if (this.f96355ab) {
                SharePrefCache inst = SharePrefCache.inst();
                C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
                C23051bf isContactsUploaded = inst.getIsContactsUploaded();
                C52711k.m112236a((Object) isContactsUploaded, "SharePrefCache.inst().isContactsUploaded");
                Object d = isContactsUploaded.mo47782d();
                C52711k.m112236a(d, "SharePrefCache.inst().isContactsUploaded.cache");
                if (((Boolean) d).booleanValue()) {
                    kVar.f96692e.f96349V = false;
                    kVar.f96691d.mo77466m();
                } else {
                    kVar.f96692e.f96349V = true;
                    kVar.f96691d.mo77466m();
                    new C37981a(kVar);
                }
            }
            this.f96355ab = false;
        } else if (a != 128) {
            switch (a) {
                case 32:
                    HeaderViewHolder headerViewHolder = (HeaderViewHolder) vVar;
                    Context context = vVar.itemView.getContext();
                    if (headerViewHolder.f83476a == null) {
                        headerViewHolder.f83476a = new StoryFeedPanel(context).create(context, headerViewHolder.f83478c, true, false);
                        headerViewHolder.f83476a.setFrom("homepage_follow");
                        headerViewHolder.f83476a.setVisible(true);
                        headerViewHolder.f83476a.bind(headerViewHolder.f83477b);
                    }
                    if (!headerViewHolder.f83480e) {
                        headerViewHolder.f83478c.getLayoutParams().height = 0;
                        ((ViewGroup) headerViewHolder.f83478c.getParent()).getLayoutParams().height = 0;
                    }
                    if (headerViewHolder.f83477b != null && C20902b.m53242a().isLogin()) {
                        headerViewHolder.f83479d = true;
                        headerViewHolder.f83477b.mo75832a(false);
                    }
                    int color = vVar.itemView.getContext().getResources().getColor(R.color.a2j);
                    if (headerViewHolder.f83476a.getAndroidView() != null) {
                        headerViewHolder.f83476a.getAndroidView().setBackgroundColor(color);
                        break;
                    }
                    break;
                case 33:
                    this.f96343P = (FollowFeed) this.f70670n.get(i);
                    C37947ab abVar = (C37947ab) vVar;
                    abVar.mo77423a(this.f96343P.getUser(), this.f96343P.getRequestId());
                    abVar.f96625b = this.f96335G;
                    break;
                case 34:
                    UpLoadItemViewHolder upLoadItemViewHolder = (UpLoadItemViewHolder) vVar;
                    FollowFeed followFeed = (FollowFeed) this.f70670n.get(i);
                    if (followFeed instanceof C37862e) {
                        C37862e eVar = (C37862e) followFeed;
                        upLoadItemViewHolder.mProgressBar.setProgress(eVar.f96389a);
                        upLoadItemViewHolder.mProgressBar.setMax(100);
                        upLoadItemViewHolder.mProgressBar.invalidate();
                        if (eVar.f96391c) {
                            upLoadItemViewHolder.mTextView.setText(R.string.csc);
                        } else {
                            upLoadItemViewHolder.mTextView.setText(R.string.f8d);
                        }
                        Bitmap bitmap = eVar.f96390b;
                        if (bitmap != null) {
                            upLoadItemViewHolder.mCoverImage.setImageDrawable(new C37914a(bitmap));
                        }
                        eVar.f96392d = upLoadItemViewHolder;
                        break;
                    }
                    break;
                default:
                    switch (a) {
                        case 36:
                            FollowFeed followFeed2 = (FollowFeed) this.f70670n.get(i);
                            if (followFeed2 != null) {
                                RoomFeedCellStruct roomStruct = followFeed2.getRoomStruct();
                                String requestId = followFeed2.getRequestId();
                                if (roomStruct != null) {
                                    if (roomStruct.getNewLiveRoomData() != null) {
                                        roomStruct.getNewLiveRoomData().setRequestId(requestId);
                                    }
                                    switch (FollowFeedLiveTypeExperiment.m69594a()) {
                                        case 4:
                                            ((C38014y) vVar).mo77477a(roomStruct.getNewLiveRoomData(), this.f82937h);
                                            break;
                                        case 5:
                                            ((C37946aa) vVar).mo77477a(roomStruct.getNewLiveRoomData(), this.f82937h);
                                            break;
                                        default:
                                            ((C38007x) vVar).mo77477a(roomStruct.getNewLiveRoomData(), this.f82937h);
                                            break;
                                    }
                                }
                            }
                            ((C31782a) vVar).f83011S = this.f82944z;
                            break;
                        case 37:
                            C37989o oVar = (C37989o) vVar;
                            FollowFeed followFeed3 = (FollowFeed) this.f70670n.get(i);
                            DmtTextView dmtTextView = oVar.f96712a;
                            if (followFeed3 != null) {
                                C31857a lastViewData = followFeed3.getLastViewData();
                                if (lastViewData != null) {
                                    String str = lastViewData.f83233b;
                                    if (str != null) {
                                        charSequence = str;
                                        dmtTextView.setText(charSequence);
                                        break;
                                    }
                                }
                            }
                            View view = oVar.itemView;
                            C52711k.m112236a((Object) view, "itemView");
                            charSequence = view.getContext().getString(R.string.bvv);
                            dmtTextView.setText(charSequence);
                        case 38:
                            C37983l lVar = (C37983l) vVar;
                            lVar.f96699e = this.f96344Q;
                            if (((Boolean) SharePrefCache.inst().getIsContactsUploaded().mo47782d()).booleanValue()) {
                                lVar.f96702h = false;
                                LayoutParams layoutParams = (LayoutParams) lVar.f96696b.getLayoutParams();
                                layoutParams.height = C32464b.m75163a(lVar.f96695a, 360.0f);
                                lVar.f96696b.setLayoutParams(layoutParams);
                                lVar.f96696b.setStatus(new C10723a(lVar.f96695a).mo19277a((int) R.drawable.b0o).mo19280b((int) R.string.b4q).mo19281b("").f28711a);
                            } else {
                                lVar.f96702h = true;
                                LayoutParams layoutParams2 = (LayoutParams) lVar.f96696b.getLayoutParams();
                                layoutParams2.height = C32464b.m75163a(lVar.f96695a, 460.0f);
                                lVar.f96696b.setLayoutParams(layoutParams2);
                                lVar.f96696b.setStatus(new C10723a(lVar.f96695a).mo19277a((int) R.drawable.b0o).mo19280b((int) R.string.b4q).mo19282c(R.string.b4g).mo19278a(C10720a.SOLID, R.string.ahu, new C37987m(lVar)).f28711a);
                            }
                            if (lVar.f96702h) {
                                lVar.f96697c.setVisibility(8);
                                break;
                            } else {
                                if (lVar.f96698d == null) {
                                    lVar.f96698d = new C39993z(new RecommendCommonUserModel(), lVar);
                                }
                                lVar.f96698d.mo81919a(30, C20902b.m53242a().getCurUserId(), 2, C47945d.m103731a(), (String) null, C47945d.m103733b());
                                C30128ae.m70698a("api_recommend_user", "follow_feed_empty_item_view_holder", "refresh");
                                break;
                            }
                        default:
                            switch (a) {
                                case 50:
                                    if (vVar instanceof C32728al) {
                                        ((C32728al) vVar).mo66320a(((FollowFeed) this.f70670n.get(i)).getRecommendUser(), i, false, 2);
                                        break;
                                    }
                                    break;
                                case 51:
                                    if (vVar instanceof C32730an) {
                                        ((C32730an) vVar).mo66322a(false, 2, 0, false, this.f96335G);
                                        break;
                                    }
                                    break;
                                case 52:
                                    if (vVar instanceof C32773t) {
                                        ((C32773t) vVar).mo66304a((RecommendContact) ((FollowFeed) this.f70670n.get(i)).getRecommendUser(), i);
                                        break;
                                    }
                                    break;
                                case 53:
                                    if (vVar instanceof C37994q) {
                                        C37994q qVar = (C37994q) vVar;
                                        String str2 = this.f96356ac;
                                        String str3 = this.f96357ad;
                                        C52670a<C52860x> aVar2 = this.f96358ae;
                                        if (qVar.itemView instanceof DmtStatusView) {
                                            DmtStatusView dmtStatusView = (DmtStatusView) qVar.itemView;
                                            if (!C50513l.m108855a() && !qVar.f96717a) {
                                                qVar.f96717a = true;
                                                C26890h.m65011a("vcd_relation_acquire_bar_show", C23089d.m56640a().mo47829a("enter_from", "homepage_follow").f61491a);
                                            }
                                            C10719a a2 = C10719a.m21676a(qVar.itemView.getContext());
                                            C10723a b = new C10723a(qVar.itemView.getContext()).mo19277a((int) R.drawable.b0o).mo19279a(str2).mo19281b(str3);
                                            if (aVar2 != null) {
                                                b.mo19278a(C10720a.SOLID, R.string.huu, new OnClickListener(aVar2) {

                                                    /* renamed from: a */
                                                    final /* synthetic */ C52670a f96718a;

                                                    public final void onClick(View view) {
                                                        ClickInstrumentation.onClick(view);
                                                        C26890h.m65011a("vcd_relation_acquire_bar_confirm", C23089d.m56640a().mo47829a("enter_from", "homepage_follow").f61491a);
                                                        C50513l.m108854a(C37994q.this.itemView.getContext(), new C23773a() {
                                                        });
                                                    }

                                                    {
                                                        this.f96718a = r2;
                                                    }
                                                });
                                            }
                                            dmtStatusView.mo19209d();
                                            a2.mo19229a(b.f28711a);
                                            dmtStatusView.setBuilder(a2);
                                            dmtStatusView.mo19213g();
                                            dmtStatusView.setUseScreenHeight(dmtStatusView.getContext().getResources().getDimensionPixelSize(R.dimen.mh));
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    if (this.f70670n.get(i) != null) {
                                        ((FollowFeed) this.f70670n.get(i)).setIsMomentStyle(true);
                                    }
                                    super.mo48222a(vVar, i);
                                    break;
                            }
                    }
                    break;
            }
        } else {
            UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder = (UpLoadRecoverItemViewHolder) vVar;
            FollowFeed followFeed4 = (FollowFeed) this.f70670n.get(i);
            if (followFeed4 instanceof C37863f) {
                C37863f fVar = (C37863f) followFeed4;
                upLoadRecoverItemViewHolder.mProgressBar.setVisibility(8);
                upLoadRecoverItemViewHolder.mTextView.setText(upLoadRecoverItemViewHolder.f96619a.getString(R.string.ol));
                AVExternalServiceImpl.getAVServiceImpl_Monster().draftService().loadAwemeDraftThumbCover(fVar.f96393a, new OnVideoCoverCallback() {
                    public final void onGetVideoCoverFailed(int i) {
                    }

                    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                        if (UpLoadRecoverItemViewHolder.this.mCoverImage != null) {
                            UpLoadRecoverItemViewHolder.this.mCoverImage.setImageDrawable(new C37914a(bitmap));
                        }
                    }
                });
                upLoadRecoverItemViewHolder.mIvClose.setVisibility(0);
                upLoadRecoverItemViewHolder.mIvClose.setOnClickListener(new C37950ac(fVar));
                upLoadRecoverItemViewHolder.mIvRefresh.setVisibility(0);
                upLoadRecoverItemViewHolder.mIvRefresh.setOnClickListener(new C37951ad(upLoadRecoverItemViewHolder, fVar));
            }
        }
        if (C10181b.m20511a().mo18172a(RecommendFilterFollowExperiment.class, true, "enable_recommend_filter_follow", 31744, false) && mo48641a(i) == 16) {
            Aweme aweme = mo64635b(i).getAweme();
            if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
                String aid = aweme.getAid();
                C52711k.m112240b(aid, "aid");
                if (!C30395r.f79460b.contains(aid)) {
                    C30395r.f79460b.add(aid);
                    C30395r.f79459a = true;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo77275a(int i, Bitmap bitmap, boolean z) {
        if (this.f70670n == null || !this.f70670n.contains(this.f96342O)) {
            this.f96342O = new C37862e();
            this.f96342O.setFeedType(TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN);
            this.f96342O.f96391c = z;
            if (!this.f96333E || this.f70670n == null || this.f70670n.size() <= 0) {
                mo51186a(this.f96342O, 0);
            } else {
                mo51186a(this.f96342O, 1);
            }
            if (this.f82941l != null) {
                this.f82941l.mo4814b(0);
            }
            this.f82934e.mo64959a(500);
        }
        C37862e eVar = this.f96342O;
        eVar.f96389a = i;
        if (eVar.f96392d != null) {
            UpLoadItemViewHolder upLoadItemViewHolder = eVar.f96392d;
            upLoadItemViewHolder.mProgressBar.post(new Runnable(i) {

                /* renamed from: a */
                final /* synthetic */ int f96616a;

                public final void run() {
                    UpLoadItemViewHolder.this.mProgressBar.setProgress(this.f96616a);
                    UpLoadItemViewHolder.this.mProgressBar.setMax(100);
                    UpLoadItemViewHolder.this.mProgressBar.invalidate();
                }

                {
                    this.f96616a = r2;
                }
            });
        }
        this.f96342O.mo77303a(bitmap);
    }

    public C37837a(RecyclerView recyclerView, C31846h hVar, C37997r rVar, Fragment fragment) {
        super(recyclerView, hVar);
        this.f96353Z = rVar;
        this.f96350W = fragment;
    }
}
