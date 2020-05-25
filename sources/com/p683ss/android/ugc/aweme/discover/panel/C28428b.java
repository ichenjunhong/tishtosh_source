package com.p683ss.android.ugc.aweme.discover.panel;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.C23600b;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24529c;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26882h;
import com.p683ss.android.ugc.aweme.discover.adapter.C27819ao;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1654a.C28301a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28641ch;
import com.p683ss.android.ugc.aweme.feed.adapter.C30009a;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoShowTypeExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30464q;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30836cc;
import com.p683ss.android.ugc.aweme.utils.C47729bp;
import com.p683ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.discover.panel.b */
public class C28428b extends AbsSearchFragmentPanel implements C26872d<C30009a>, C26877c<Aweme>, C26878d, C30504w {

    /* renamed from: g */
    protected C23600b f74703g;

    /* renamed from: h */
    public C30464q f74704h;

    /* renamed from: i */
    protected String f74705i;

    /* renamed from: j */
    protected boolean f74706j;

    /* renamed from: k */
    public int f74707k;

    /* renamed from: l */
    protected boolean f74708l;

    /* renamed from: m */
    private DoubleBallSwipeRefreshLayout f74709m;

    /* renamed from: a */
    public final void mo50461a(List list, int i) {
    }

    /* renamed from: a */
    public final boolean mo50463a(C26882h hVar) {
        return false;
    }

    /* renamed from: n */
    public final void mo58038n() {
        m67445o();
    }

    public final void az_() {
        super.az_();
        if (mo62963bx()) {
            m67445o();
        }
    }

    /* renamed from: b */
    public C1332i mo58026b() {
        return new WrapGridLayoutManager(mo96010bw(), 2, 1, false);
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (mo62868bh()) {
            this.f74696d.am_();
        }
    }

    /* renamed from: l */
    public final void mo55812l() {
        super.mo55812l();
        if (mo62963bx()) {
            m67444b(true);
        }
    }

    /* renamed from: o */
    private void m67445o() {
        if (this.f74696d == null || !this.f74696d.f73086f) {
            if (this.f74695c != null) {
                this.f74695c.mo54825a();
            }
            return;
        }
        C28301a aVar = this.f74696d.f73085e;
        if (aVar != null) {
            aVar.mo56703g();
        }
    }

    public final void aJ_() {
        if (mo62868bh()) {
            this.f74703g.setRefreshing(false);
            this.mStatusView.setVisibility(0);
            this.mStatusView.mo19213g();
        }
    }

    public final void aS_() {
        if (mo62868bh() && !this.f74706j) {
            this.f74703g.setRefreshing(true);
        }
    }

    /* renamed from: d */
    public final C27819ao mo58029d() {
        int i;
        if (this.f74696d != null) {
            return this.f74696d;
        }
        if (this.f74707k == 7) {
            i = 1;
        } else {
            i = 0;
        }
        C27819ao aoVar = new C27819ao(this, this.f74705i, this.f74693a, this, i, this.f74707k);
        return aoVar;
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (mo62868bh()) {
            if (this.f74696d.getItemCount() == 0) {
                this.f74703g.setRefreshing(false);
                if (this.mStatusView != null) {
                    this.mStatusView.setVisibility(0);
                    this.mStatusView.mo19212f();
                }
            } else {
                this.f74703g.setRefreshing(true);
            }
        }
    }

    /* renamed from: k */
    public final void mo58037k() {
        if (mo62868bh()) {
            int childCount = this.mListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1352v b = this.mListView.mo4812b(this.mListView.getChildAt(i));
                if (b.mItemViewType == 0) {
                    C30009a aVar = (C30009a) b;
                    if (aVar != null && !aVar.mo58502m()) {
                        aVar.mo50301a();
                        aVar.mo58500d(true);
                    }
                }
            }
        }
        m67444b(false);
    }

    /* renamed from: c */
    public C1331h mo58028c() {
        if (this.f74707k == 9) {
            if (C10181b.m20511a().mo18168a(VideoShowTypeExperiment.class, true, "video_search_show_style", 31744, 0) == 5) {
                return new C30836cc(8);
            }
            if (C10181b.m20511a().mo18168a(VideoShowTypeExperiment.class, true, "video_search_show_style", 31744, 0) != 3) {
                return new C30836cc(1);
            }
        }
        return new C28641ch((int) C9432q.m18687b(mo96010bw(), 1.0f));
    }

    /* renamed from: d */
    public final void mo55806d(boolean z) {
        this.f74706j = z;
    }

    /* renamed from: a */
    public final void mo58035a(boolean z) {
        if (z) {
            this.f74696d.ao_();
        } else {
            C28429c.m67468a(this.f74696d);
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        if (mo62868bh()) {
            this.f74696d.co_();
        }
    }

    @C53771m
    public void onDynamicEvent(C24529c cVar) {
        if (cVar.f64950a == 0) {
            m67444b(true);
        } else {
            m67445o();
        }
    }

    /* renamed from: b */
    private void m67444b(boolean z) {
        if (this.f74696d == null || !this.f74696d.f73086f) {
            if (this.f74695c != null) {
                this.f74695c.mo54826a(false, z);
            }
            return;
        }
        C28301a aVar = this.f74696d.f73085e;
        if (aVar != null) {
            aVar.mo56704h();
        }
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
        if (mo62868bh()) {
            this.f74703g.setRefreshing(false);
            if (!this.f74706j) {
                C10691a.m21542b((Context) this.f121964aK, (int) R.string.c0a).mo19066a();
            }
        }
    }

    /* renamed from: a */
    public final void mo58034a(String str) {
        if (this.mListView != null && (this.mListView instanceof FpsRecyclerView)) {
            ((FpsRecyclerView) this.mListView).setLabel(str);
        }
        C47729bp.m103326a(str).mo95020a(this.mListView);
        if (this.f74696d != null && (this.f74696d instanceof C26844j)) {
            this.f74696d.f70684u = str;
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (mo62868bh()) {
            this.f74703g.setRefreshing(false);
            if (!this.f74708l) {
                this.mStatusView.setVisibility(0);
                this.mStatusView.mo19214h();
                return;
            }
            C10691a.m21542b((Context) this.f121964aK, (int) R.string.cg1).mo19066a();
        }
    }

    /* renamed from: c_ */
    public final void mo50466c_(int i) {
        if (mo62868bh()) {
            this.f74696d.notifyItemRemoved(i);
            if (i != 0) {
                this.f74696d.notifyItemChanged(i, Boolean.FALSE);
                this.f74696d.notifyItemChanged(i + 1, Boolean.FALSE);
                this.f74696d.notifyItemChanged(i + 2, Boolean.FALSE);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e3 A[Catch:{ JSONException -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f6 A[Catch:{ JSONException -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0200  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo50455a(android.support.p043v7.widget.RecyclerView.C1352v r14) {
        /*
            r13 = this;
            com.ss.android.ugc.aweme.feed.adapter.a r14 = (com.p683ss.android.ugc.aweme.feed.adapter.C30009a) r14
            if (r14 == 0) goto L_0x022e
            boolean r0 = r13.mo62868bh()
            if (r0 != 0) goto L_0x000c
            goto L_0x022e
        L_0x000c:
            int r0 = r13.f74707k
            r1 = 9
            if (r0 == r1) goto L_0x022d
            int r0 = r13.f74707k
            r1 = 15
            if (r0 != r1) goto L_0x001a
            goto L_0x022d
        L_0x001a:
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r1 = com.p683ss.android.ugc.aweme.awemeservice.C23325e.m57379a()
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r1 = (com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()
            int r3 = r13.f74707k
            org.json.JSONObject r10 = r1.getRequestIdAndOrderJsonObject(r2, r3)
            java.lang.String r1 = "display"
            java.lang.String r2 = "dual"
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r1 = r13.f74705i     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r2 = "homepage_fresh"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ JSONException -> 0x0130 }
            if (r1 == 0) goto L_0x0048
            java.lang.String r1 = "homepage_fresh"
            java.lang.String r0 = "style"
            java.lang.String r2 = "text"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x0131 }
        L_0x0046:
            r0 = r1
            goto L_0x0098
        L_0x0048:
            java.lang.String r1 = r13.f74705i     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r2 = "homepage_hot"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ JSONException -> 0x0130 }
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = "homepage_hot"
            java.lang.String r0 = "style"
            java.lang.String r2 = "text"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x0131 }
            goto L_0x0046
        L_0x005c:
            java.lang.String r1 = r13.f74705i     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r2 = "homepage_follow"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ JSONException -> 0x0130 }
            if (r1 == 0) goto L_0x0070
            java.lang.String r1 = "homepage_follow"
            java.lang.String r0 = "style"
            java.lang.String r2 = "text"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x0131 }
            goto L_0x0046
        L_0x0070:
            java.lang.String r1 = r13.f74705i     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r2 = "categorized_city_poi"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ JSONException -> 0x0130 }
            if (r1 == 0) goto L_0x0084
            java.lang.String r1 = "categorized_city_poi"
            java.lang.String r0 = "style"
            java.lang.String r2 = "text"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x0131 }
            goto L_0x0046
        L_0x0084:
            java.lang.String r1 = r13.f74705i     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r2 = "homepage_channel"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ JSONException -> 0x0130 }
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = "homepage_channel"
            java.lang.String r0 = "style"
            java.lang.String r2 = "text"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x0131 }
            goto L_0x0046
        L_0x0098:
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56846a(r2)     // Catch:{ JSONException -> 0x0130 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r1 = "request_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0130 }
            int r3 = r13.f74707k     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56847a(r2, r3)     // Catch:{ JSONException -> 0x0130 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r1 = "music_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0130 }
            java.lang.Long r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56871j(r2)     // Catch:{ JSONException -> 0x0130 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r1 = "content"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56876l(r2)     // Catch:{ JSONException -> 0x0130 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r1 = "display"
            java.lang.String r2 = "dual"
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0130 }
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r14.mo54754d()     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r1 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56861e(r1)     // Catch:{ JSONException -> 0x0130 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0130 }
            if (r1 != 0) goto L_0x00f0
            java.lang.String r1 = "poi_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56861e(r2)     // Catch:{ JSONException -> 0x0130 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0130 }
        L_0x00f0:
            boolean r1 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56858c(r0)     // Catch:{ JSONException -> 0x0130 }
            if (r1 == 0) goto L_0x0122
            java.lang.String r1 = "poi_type"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56867h(r2)     // Catch:{ JSONException -> 0x0130 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r1 = "poi_channel"
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56852b()     // Catch:{ JSONException -> 0x0130 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r1 = "city_info"
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56845a()     // Catch:{ JSONException -> 0x0130 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r1 = "distance_info"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56869i(r2)     // Catch:{ JSONException -> 0x0130 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0130 }
        L_0x0122:
            java.lang.String r1 = "is_photo"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56878n(r2)     // Catch:{ JSONException -> 0x0130 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0130 }
            goto L_0x0132
        L_0x0130:
            r1 = r0
        L_0x0131:
            r0 = r1
        L_0x0132:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r14.mo54754d()
            boolean r1 = r1.isLive()
            if (r1 == 0) goto L_0x0200
            com.ss.android.ugc.aweme.common.MobClick r1 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r2 = "impression"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r2)
            java.lang.String r2 = "live"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()
            java.lang.String r2 = r2.getAuthorUid()
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setValue(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            if (r2 != 0) goto L_0x0165
            java.lang.String r2 = ""
            goto L_0x0173
        L_0x0165:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            long r2 = r2.roomId
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L_0x0173:
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setExtValueString(r2)
            com.ss.android.ugc.aweme.app.f.c r2 = new com.ss.android.ugc.aweme.app.f.c
            r2.<init>()
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r14.mo54754d()
            java.lang.String r4 = r4.getAuthorUid()
            com.ss.android.ugc.aweme.app.f.c r2 = r2.mo47824a(r3, r4)
            java.lang.String r3 = "page_name"
            com.ss.android.ugc.aweme.app.f.c r2 = r2.mo47824a(r3, r0)
            java.lang.String r3 = "position"
            java.lang.String r4 = "homepage_fresh"
            com.ss.android.ugc.aweme.app.f.c r2 = r2.mo47824a(r3, r4)
            java.lang.String r3 = "city_info"
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56845a()
            com.ss.android.ugc.aweme.app.f.c r2 = r2.mo47824a(r3, r4)
            java.lang.String r3 = "distance_info"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r14.mo54754d()
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56869i(r4)
            com.ss.android.ugc.aweme.app.f.c r2 = r2.mo47824a(r3, r4)
            java.lang.String r3 = "request_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r14.mo54754d()
            int r5 = r13.f74707k
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56847a(r4, r5)
            com.ss.android.ugc.aweme.app.f.c r2 = r2.mo47824a(r3, r4)
            org.json.JSONObject r2 = r2.mo47825b()
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setJsonObject(r2)
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r14.mo54754d()
            java.lang.String r2 = r1.getAuthorUid()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r14.mo54754d()
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            long r3 = r1.roomId
            java.lang.String r5 = "homepage_fresh"
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r14.mo54754d()
            java.lang.String r6 = r1.getRequestId()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r14.mo54754d()
            int r7 = r1.getAwemePosition()
            r8 = -1
            r9 = 0
            java.lang.String r10 = "live_cover"
            r11 = 0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r14.mo54754d()
            java.lang.String r12 = r1.getLiveReaSon()
            com.p683ss.android.ugc.aweme.story.live.C46641d.m101213a(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0210
        L_0x0200:
            android.content.Context r4 = r13.mo96010bw()
            java.lang.String r5 = "show"
            java.lang.String r7 = r14.mo58501l()
            r8 = 0
            r6 = r0
            com.p683ss.android.ugc.aweme.common.C26890h.m65006a(r4, r5, r6, r7, r8, r10)
        L_0x0210:
            com.ss.android.ugc.aweme.aq.ar r1 = new com.ss.android.ugc.aweme.aq.ar
            r1.<init>()
            com.ss.android.ugc.aweme.aq.ar r0 = r1.mo47997a(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r14 = r14.mo54754d()
            int r1 = r13.f74707k
            com.ss.android.ugc.aweme.aq.ar r14 = r0.mo47999c(r14, r1)
            java.lang.String r0 = "dual"
            com.ss.android.ugc.aweme.aq.ar r14 = r14.mo48002e(r0)
            r14.mo48076e()
            return
        L_0x022d:
            return
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.panel.C28428b.mo50455a(android.support.v7.widget.RecyclerView$v):void");
    }

    /* renamed from: a */
    public void mo55784a(View view, Bundle bundle) {
        super.mo55784a(view, bundle);
        this.f74709m = (DoubleBallSwipeRefreshLayout) view.findViewById(R.id.caw);
        this.f74703g = new C28430d(this.f74709m);
    }

    /* renamed from: a */
    public final void mo47018a(List<Aweme> list, boolean z) {
        if (mo62868bh()) {
            this.mStatusView.mo19209d();
            this.mStatusView.setVisibility(8);
            this.f74703g.setRefreshing(false);
            this.f74708l = true;
            this.f74696d.mo54798c(true);
            this.f74696d.mo50303a(list);
            mo58035a(z);
            if (this.f74704h != null) {
                this.f74704h.mo56557k();
            }
            m67444b(true);
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<Aweme> list, boolean z) {
        if (mo62868bh()) {
            this.f74703g.setRefreshing(false);
            this.f74696d.mo50304b(list);
            m67444b(true);
            mo58035a(z);
        }
    }

    /* renamed from: c */
    public final void mo47029c(List<Aweme> list, boolean z) {
        if (mo62868bh()) {
            if (z || this.f74706j) {
                this.f74696d.mo54784d(list);
                if (!this.f74706j && aB_()) {
                    mo58027b(0);
                    m67444b(true);
                }
            } else if (mo62963bx() && this.f121964aK != null && C23794bh.m58403q().mo77208a(this.f121964aK)) {
                C10691a.m21548c((Context) this.f121964aK, (int) R.string.an1).mo19066a();
                mo58027b(0);
            }
            this.f74703g.setRefreshing(false);
        }
    }

    public C28428b(String str, C24579d dVar, C30462o oVar, int i) {
        super(dVar, oVar);
        this.f74705i = str;
        this.f74707k = i;
    }
}
