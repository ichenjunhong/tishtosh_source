package com.p683ss.android.ugc.aweme.flowfeed.p1752a;

import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.widget.C23751c;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26847b;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.feed.helper.C30367g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30316ah;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31756c;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31757d;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31758e;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31782a;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31804o;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31805p;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31816x;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31839b;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31841d;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31842e;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31843f;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31846h;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j.C31853a;
import com.p683ss.android.ugc.aweme.flowfeed.utils.OptimizeFlowFeedAutoPlayExperiment;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.forward.p1776d.C32398i;
import com.p683ss.android.ugc.aweme.forward.p1779vh.BaseForwardViewHolder;
import com.p683ss.android.ugc.aweme.forward.p1779vh.C32432e;
import com.p683ss.android.ugc.aweme.forward.p1779vh.C32435h;
import com.p683ss.android.ugc.aweme.forward.p1779vh.C32436i;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47724bl;
import com.p683ss.android.ugc.aweme.utils.C47849eh;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.a.e */
public class C31749e<T extends C37859b> extends C23751c<T> implements C31756c, C31757d, C31853a {

    /* renamed from: A */
    public String f82929A;

    /* renamed from: B */
    public String f82930B;

    /* renamed from: C */
    public int f82931C;

    /* renamed from: D */
    protected boolean f82932D;

    /* renamed from: E */
    private int f82933E;

    /* renamed from: e */
    protected C31848j f82934e;

    /* renamed from: f */
    protected Set<C31782a> f82935f;

    /* renamed from: g */
    protected Set<BaseForwardViewHolder> f82936g;

    /* renamed from: h */
    public C31758e f82937h;

    /* renamed from: i */
    public C31754a f82938i;

    /* renamed from: j */
    public C26872d f82939j;

    /* renamed from: k */
    public C31755b f82940k;

    /* renamed from: l */
    protected RecyclerView f82941l;

    /* renamed from: m */
    public String f82942m;

    /* renamed from: y */
    public String f82943y;

    /* renamed from: z */
    public String f82944z;

    /* renamed from: a */
    public void mo64624a(Aweme aweme, String str) {
    }

    /* renamed from: a */
    public void mo64627a(String str) {
    }

    /* renamed from: a */
    public void mo64630a(String str, Aweme aweme, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public List<T> mo64644e(List<T> list) {
        return list;
    }

    /* renamed from: f */
    public boolean mo64647f(int i) {
        return true;
    }

    /* renamed from: l */
    public final C31756c mo64648l() {
        return this;
    }

    /* renamed from: m */
    public boolean mo64649m() {
        return false;
    }

    /* renamed from: n */
    public boolean mo64650n() {
        return true;
    }

    /* renamed from: a */
    public final void mo64623a(Aweme aweme) {
        Aweme aweme2;
        C0794k a = C47849eh.m103495a(this.f82941l);
        for (int intValue = ((Integer) a.f2711a).intValue(); intValue <= ((Integer) a.f2712b).intValue(); intValue++) {
            if (intValue >= 0 && intValue < mo50673a().size()) {
                C37859b bVar = (C37859b) mo50673a().get(intValue);
                if (bVar.getFeedType() == 65280) {
                    aweme2 = bVar.getAweme();
                } else {
                    aweme2 = null;
                }
                if (!(aweme2 == null || aweme2.getAid() == null || aweme2.getAid().equals(aweme.getAid()))) {
                    C1352v f = this.f82941l.mo4847f(intValue);
                    if (f != null && (f instanceof C31805p)) {
                        C31805p pVar = (C31805p) f;
                        if (pVar.f83025ae) {
                            pVar.mo64837V();
                        }
                    }
                    if (f != null && (f instanceof C31746b)) {
                        C10181b.m20511a().mo18168a(OptimizeFlowFeedAutoPlayExperiment.class, true, "optimize_flowfeed_autoplay", 31744, 1);
                    }
                    if (f != null && (f instanceof C32436i)) {
                        C32436i iVar = (C32436i) f;
                        if (iVar.f84365I) {
                            ((C32398i) iVar.f84369M).mo65579m();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64626a(Exception exc, Aweme aweme, int i) {
        C1352v d = m73701d(aweme);
        if (d instanceof C31816x) {
            ((C31816x) d).mo64768b(aweme);
        }
        C22971a.m56494a(this.f82940k.mo64656c(), exc, i == 1 ? R.string.apn : R.string.f6x);
    }

    /* renamed from: a */
    public final void mo64629a(String str, Comment comment) {
        int d = mo64641d(str);
        if (d >= 0) {
            m73699a(mo64635b(d), -1);
            C31841d.m74199a(mo64635b(d), comment);
            C1352v f = this.f82941l.mo4847f(d);
            if (f != null && (f instanceof C31816x)) {
                C31816x xVar = (C31816x) f;
                xVar.mo64800p();
                xVar.mo64772c(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo64628a(String str, long j) {
        int d = mo64641d(str);
        if (d >= 0) {
            m73699a(mo64635b(d), j);
            C1352v f = this.f82941l.mo4847f(d);
            if (f != null && (f instanceof C31816x)) {
                ((C31816x) f).mo64800p();
            }
        }
    }

    /* renamed from: a */
    public final void mo64632a(String str, String str2, int i) {
        int i2;
        int d = mo64641d(str);
        if (d >= 0) {
            C37859b b = mo64635b(d);
            C52711k.m112240b(b, "flowFeed");
            if (b.needUpdateComment() && !C9376b.m18558a((Collection<T>) b.getCommentList())) {
                List commentList = b.getCommentList();
                C52711k.m112236a((Object) commentList, "flowFeed.commentList");
                i2 = 0;
                Iterator it = commentList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C52575l.m112100b();
                    }
                    Comment comment = (Comment) next;
                    if (comment == null || !TextUtils.equals(comment.getCid(), str2)) {
                        i2 = i3;
                    } else {
                        C25280a.m61493a().updateDigg(comment, b.getAwemeAuthorId());
                        if (i > 0) {
                            comment.setDiggCount(i);
                        }
                    }
                }
            }
            i2 = -1;
            C1352v f = this.f82941l.mo4847f(d);
            if (i2 >= 0 && (f instanceof C31816x)) {
                ((C31816x) f).mo64779e(i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo64631a(String str, String str2) {
        int i;
        int d = mo64641d(str);
        if (d >= 0) {
            C37859b b = mo64635b(d);
            C52711k.m112240b(b, "flowFeed");
            if (b.needUpdateComment() && !C9376b.m18558a((Collection<T>) b.getCommentList())) {
                List commentList = b.getCommentList();
                C52711k.m112236a((Object) commentList, "flowFeed.commentList");
                i = 0;
                Iterator it = commentList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        C52575l.m112100b();
                    }
                    Comment comment = (Comment) next;
                    if (comment != null && TextUtils.equals(comment.getCid(), str2)) {
                        b.getCommentList().remove(i);
                        break;
                    }
                    i = i2;
                }
            }
            i = -1;
            C1352v f = this.f82941l.mo4847f(d);
            if (i >= 0 && (f instanceof C31816x)) {
                ((C31816x) f).mo64776d(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo64625a(Aweme aweme, boolean z, String str, long j) {
        if (aweme != null && TextUtils.equals(str, this.f82944z)) {
            String a = C31842e.m74200a(this.f82940k.mo64657d(), aweme.getAid());
            C31842e c = C31843f.m74206a().mo64954c(a);
            if (c == null) {
                c = new C31842e(aweme, new C47724bl(1), a);
            }
            c.f83207h = C30367g.m71282a().f79372a;
            C30367g.m71282a().f79372a = null;
            c.f83201b = z ? 3 : 4;
            if (j > 0) {
                if (c.f83205f != -1 || j <= 0) {
                    c.mo64943a();
                } else {
                    c.f83205f = j;
                }
            }
            C31843f.m74206a().mo64951a(a, c);
        }
    }

    /* renamed from: a */
    public void mo50303a(List<T> list) {
        super.mo50303a(mo64644e(list));
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64633a(boolean r3, com.p683ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0024
            if (r4 == 0) goto L_0x0012
            android.support.v7.widget.RecyclerView$v r3 = r2.m73701d(r4)
            if (r3 == 0) goto L_0x0012
            android.graphics.Rect r3 = com.p683ss.android.ugc.aweme.utils.C47849eh.m103494a(r3)
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            if (r3 == 0) goto L_0x0024
            r4 = 2
            int[] r4 = new int[r4]
            android.support.v7.widget.RecyclerView r1 = r2.f82941l
            r1.getLocationOnScreen(r4)
            int r3 = r3.top
            r1 = 1
            r4 = r4[r1]
            int r3 = r3 - r4
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            r2.f82933E = r3
            goto L_0x002d
        L_0x0028:
            int r3 = r2.f82933E
            int r3 = -r3
            r2.f82933E = r0
        L_0x002d:
            android.support.v7.widget.RecyclerView r4 = r2.f82941l
            if (r4 == 0) goto L_0x0036
            android.support.v7.widget.RecyclerView r4 = r2.f82941l
            r4.mo4795a(r0, r3)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.flowfeed.p1752a.C31749e.mo64633a(boolean, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: k */
    public void mo56247k() {
        if (this.f82934e != null) {
            this.f82934e.mo64966f();
        }
    }

    public void ba_() {
        if (!C9376b.m18558a((Collection<T>) this.f82935f)) {
            for (C31782a J : this.f82935f) {
                J.mo64745J();
            }
        }
        if (!C9376b.m18558a((Collection<T>) this.f82936g)) {
            for (BaseForwardViewHolder ba_ : this.f82936g) {
                ba_.ba_();
            }
        }
    }

    public void bb_() {
        if (!C9376b.m18558a((Collection<T>) this.f82935f)) {
            for (C31782a L : this.f82935f) {
                L.mo64747L();
            }
        }
        if (!C9376b.m18558a((Collection<T>) this.f82936g)) {
            for (BaseForwardViewHolder bb_ : this.f82936g) {
                bb_.bb_();
            }
        }
        if (this.f82934e != null) {
            C31848j jVar = this.f82934e;
            jVar.mo64967g();
            jVar.mo64961b();
            jVar.mo64964d();
        }
    }

    public C31749e(RecyclerView recyclerView) {
        this(recyclerView, null);
    }

    /* renamed from: a */
    public int mo51179a(View view) {
        if (view == null) {
            return 0;
        }
        return (int) C9432q.m18687b(view.getContext(), 95.0f);
    }

    /* renamed from: b */
    public void mo54789b(View view) {
        view.setPadding(0, 0, 0, (int) C9432q.m18687b(view.getContext(), 40.5f));
    }

    /* renamed from: c */
    public final void mo64639c(Aweme aweme) {
        C1352v d = m73701d(aweme);
        if (d != null && (d instanceof C31782a)) {
            ((C31782a) d).mo64774c(aweme);
        }
    }

    /* renamed from: a */
    public final void mo64622a(C30316ah ahVar) {
        C1352v d = m73701d(ahVar.f79205b);
        if (d != null && (d instanceof C31816x)) {
            C31816x xVar = (C31816x) d;
            xVar.mo64763a(ahVar.f79205b.getStatus(), ahVar.f79204a.labelPrivate);
            xVar.bc_();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C31782a mo64634b(ViewGroup viewGroup) {
        return new C31804o((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f82940k, this.f82934e, this.f82938i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C31782a mo64637c(ViewGroup viewGroup) {
        C31805p pVar = new C31805p((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f82940k, this.f82934e, this.f82938i);
        pVar.f83111aP = this;
        return pVar;
    }

    /* renamed from: e */
    public final void mo64645e(int i) {
        try {
            if (this.f70670n.size() == 0) {
                notifyDataSetChanged();
            } else {
                notifyItemRemoved(i);
            }
        } catch (Exception e) {
            C32458a.m75145a("FeedAdapter_NotifyRemove_Crash", e);
        }
    }

    public void onViewDetachedFromWindow(C1352v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof C31782a) {
            this.f82935f.remove(vVar);
        }
        if (vVar instanceof BaseForwardViewHolder) {
            this.f82936g.remove(vVar);
        }
    }

    /* renamed from: a */
    public static void m73698a(C37859b bVar) {
        if (bVar != null) {
            Aweme aweme = bVar.getAweme();
            if (aweme != null) {
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    statistics.setForwardCount(statistics.getForwardCount() + 1);
                } else {
                    statistics = new AwemeStatistics();
                    statistics.setForwardCount(1);
                }
                aweme.setStatistics(statistics);
            }
        }
    }

    /* renamed from: b */
    public final C37859b mo64635b(int i) {
        if (i < 0 || i >= mo48636c() || this.f70670n == null) {
            return null;
        }
        return (C37859b) this.f70670n.get(i);
    }

    /* renamed from: c */
    public final void mo64638c(int i) {
        if (this.f70670n != null) {
            this.f70670n.remove(i);
            if (this.f82941l.mo4875i()) {
                this.f82941l.post(new C31751f(this, i));
            } else {
                mo64645e(i);
            }
            this.f82934e.mo64959a(500);
        }
    }

    /* renamed from: d */
    public final int mo64641d(String str) {
        if (mo50673a() == null) {
            return -1;
        }
        for (int i = 0; i < mo50673a().size(); i++) {
            C37859b b = mo64635b(i);
            if (b.getAweme() != null && TextUtils.equals(b.getAweme().getAid(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public BaseForwardViewHolder mo64643e(ViewGroup viewGroup) {
        C32436i iVar = new C32436i((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f82940k, this.f82934e, this.f82937h, this.f82938i);
        ((C32398i) iVar.f84369M).f84311m = this;
        return iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C1352v mo64646f(ViewGroup viewGroup) {
        C32435h hVar = new C32435h((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f82940k, this.f82934e, this.f82937h, this.f82938i);
        return hVar;
    }

    public void onViewAttachedToWindow(C1352v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (this.f82939j != null) {
            this.f82939j.mo50455a(vVar);
        }
        if (vVar instanceof C31782a) {
            this.f82935f.add((C31782a) vVar);
        }
        if (vVar instanceof BaseForwardViewHolder) {
            this.f82936g.add((BaseForwardViewHolder) vVar);
        }
    }

    /* renamed from: b */
    public static int m73700b(Aweme aweme) {
        if (aweme == null) {
            return -1;
        }
        if (aweme.isAwemeFromXiGua()) {
            return 24;
        }
        if (aweme.isAd() && aweme.getAwemeRawAd().getSearchAdType() == 1) {
            return 25;
        }
        if (C31839b.m74197a(aweme)) {
            return 16;
        }
        if (aweme.getAwemeType() == 2) {
            return 17;
        }
        if (aweme.getAwemeType() == 13) {
            if (aweme.getForwardItem() == null) {
                return 20;
            }
            if (C31839b.m74197a(aweme.getForwardItem())) {
                return 18;
            }
            if (aweme.getForwardItem().getAwemeType() == 2) {
                return 19;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private C1352v m73701d(Aweme aweme) {
        C0794k a = C47849eh.m103495a(this.f82941l);
        List a2 = mo50673a();
        if (C9376b.m18558a((Collection<T>) a2)) {
            return null;
        }
        for (int intValue = ((Integer) a.f2711a).intValue(); intValue <= ((Integer) a.f2712b).intValue(); intValue++) {
            if (intValue < a2.size() && intValue >= 0 && ((C37859b) mo50673a().get(intValue)).getFeedType() == 65280) {
                Aweme aweme2 = ((C37859b) a2.get(intValue)).getAweme();
                if (!(aweme2 == null || aweme2.getAid() == null || !aweme2.getAid().equals(aweme.getAid()))) {
                    return this.f82941l.mo4847f(intValue);
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo64640c(String str) {
        int d = mo64641d(str);
        if (d >= 0) {
            Aweme awemeById = C23324d.m57378a().getAwemeById(str);
            if (awemeById != null) {
                mo64635b(d).getAweme().setUserDigg(awemeById.getUserDigg());
                mo64635b(d).getAweme().setStatistics(awemeById.getStatistics());
                C1352v d2 = m73701d(awemeById);
                if (d2 != null && (d2 instanceof C31816x)) {
                    ((C31816x) d2).mo64801q();
                }
            }
        }
    }

    /* renamed from: a */
    public int mo48641a(int i) {
        if (this.f70670n == null) {
            return -1;
        }
        C37859b bVar = (C37859b) this.f70670n.get(i);
        if (bVar != null && bVar.getFeedType() == 65280) {
            return m73700b(bVar.getAweme());
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public BaseForwardViewHolder mo64642d(ViewGroup viewGroup) {
        C32432e eVar = new C32432e((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f82940k, this.f82934e, this.f82937h, this.f82938i);
        return eVar;
    }

    /* renamed from: a */
    public final int mo64621a(User user) {
        if (mo50673a() == null || mo50673a().size() == 0) {
            return -1;
        }
        for (int i = 0; i < mo50673a().size(); i++) {
            C37859b b = mo64635b(i);
            if (b.getFeedType() == 65289) {
                User recommendUser = ((FollowFeed) b).getRecommendUser();
                if (recommendUser != null && recommendUser.equals(user)) {
                    return i;
                }
            } else if (b.getFeedType() == 65299) {
                User recommendUser2 = ((FollowFeed) b).getRecommendUser();
                if ((user instanceof RecommendContact) && (recommendUser2 instanceof RecommendContact)) {
                    return i;
                }
            } else {
                continue;
            }
        }
        return -1;
    }

    public C31749e(RecyclerView recyclerView, C31846h hVar) {
        this.f82935f = new LinkedHashSet();
        this.f82936g = new LinkedHashSet();
        this.f82941l = recyclerView;
        this.f82934e = new C31848j(recyclerView, hVar, this);
    }

    /* renamed from: a */
    private static void m73699a(C37859b bVar, long j) {
        if (bVar != null) {
            Aweme aweme = bVar.getAweme();
            if (aweme != null) {
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    if (j < 0) {
                        j = statistics.getCommentCount() + 1;
                    }
                    statistics.setCommentCount(j);
                } else {
                    statistics = new AwemeStatistics();
                    if (j < 0) {
                        j = 1;
                    }
                    statistics.setCommentCount(j);
                }
                aweme.setStatistics(statistics);
            }
        }
    }

    /* renamed from: b */
    public final void mo64636b(String str, Comment comment) {
        int d = mo64641d(str);
        if (d >= 0) {
            C31841d.m74199a(mo64635b(d), comment);
            C1352v f = this.f82941l.mo4847f(d);
            if (f instanceof C31816x) {
                ((C31816x) f).mo64772c(0);
            }
        }
    }

    /* renamed from: a */
    public C1352v mo48221a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 16:
                return mo64637c(viewGroup);
            case 17:
                return mo64634b(viewGroup);
            case 18:
                return mo64643e(viewGroup);
            case 19:
                return mo64642d(viewGroup);
            case 20:
                return mo64646f(viewGroup);
            default:
                return new C1352v(new View(viewGroup.getContext())) {
                };
        }
    }

    /* renamed from: a */
    public void mo48222a(C1352v vVar, int i) {
        List arrayList;
        List list;
        if (vVar instanceof C26847b) {
            ((C26847b) vVar).mo54794a();
            return;
        }
        this.f70670n.get(i);
        int i2 = i + 1;
        if (i2 < this.f70670n.size()) {
            this.f70670n.get(i2);
        }
        int a = mo48641a(i);
        if (a != 35) {
            switch (a) {
                case 16:
                case 17:
                    break;
                case 18:
                case 19:
                case 20:
                    if (((C37859b) this.f70670n.get(i)).getAweme() != null) {
                        BaseForwardViewHolder baseForwardViewHolder = (BaseForwardViewHolder) vVar;
                        baseForwardViewHolder.f84361E = (C37859b) this.f70670n.get(i);
                        Aweme aweme = ((C37859b) this.f70670n.get(i)).getAweme();
                        if (this.f70670n.get(i) != null) {
                            arrayList = ((C37859b) this.f70670n.get(i)).getCommentList();
                        } else {
                            arrayList = new ArrayList();
                        }
                        List list2 = arrayList;
                        if (this.f70670n.get(i) != null) {
                            list = ((C37859b) this.f70670n.get(i)).getLikeList();
                        } else {
                            list = null;
                        }
                        baseForwardViewHolder.mo65657a(aweme, list2, list, this.f82944z, this.f82929A);
                        break;
                    }
                    break;
                default:
                    switch (a) {
                        case 24:
                        case 25:
                            break;
                    }
            }
        }
        C31782a aVar = (C31782a) vVar;
        aVar.f83015W = this.f82942m;
        aVar.f83014V = this.f82943y;
        aVar.f83012T = this.f82931C;
        aVar.f83013U = "list";
        aVar.f83011S = this.f82944z;
        if (mo64649m()) {
            aVar.f83027ag = mo64647f(i);
        }
        aVar.f83047b = (C37859b) this.f70670n.get(i);
        aVar.mo64762a(((C37859b) this.f70670n.get(i)).getAweme(), ((C37859b) this.f70670n.get(i)).getCommentList(), ((C37859b) this.f70670n.get(i)).getLikeList(), this.f82937h);
        if (!TextUtils.isEmpty(this.f82930B)) {
            aVar.f83031ak = this.f82930B;
        }
    }
}
