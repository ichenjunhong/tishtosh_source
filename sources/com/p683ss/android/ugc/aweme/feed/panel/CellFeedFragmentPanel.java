package com.p683ss.android.ugc.aweme.feed.panel;

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
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23597c;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24529c;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26882h;
import com.p683ss.android.ugc.aweme.feed.adapter.C30009a;
import com.p683ss.android.ugc.aweme.feed.adapter.C30078e;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoShowTypeExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30464q;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30836cc;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30839cf;
import com.p683ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.main.C36603dv;
import com.p683ss.android.ugc.aweme.utils.C47729bp;
import com.p683ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel */
public class CellFeedFragmentPanel extends AbsCellFeedFragmentPanel implements C26872d<C30009a>, C26877c<Aweme>, C26878d, C30504w {

    /* renamed from: g */
    protected C23597c f79887g;

    /* renamed from: h */
    protected C23600b f79888h;

    /* renamed from: i */
    public C30464q f79889i;

    /* renamed from: j */
    public boolean f79890j = true;

    /* renamed from: k */
    protected String f79891k;

    /* renamed from: l */
    protected boolean f79892l;

    /* renamed from: m */
    public int f79893m;
    protected FeedSwipeRefreshLayout mRefreshLayout;

    /* renamed from: n */
    protected boolean f79894n;

    /* renamed from: a */
    public final void mo50461a(List list, int i) {
    }

    /* renamed from: a */
    public final boolean mo50463a(C26882h hVar) {
        return false;
    }

    /* renamed from: k */
    public final void mo62774k() {
        this.f79890j = false;
        m71589o();
    }

    /* renamed from: o */
    private void m71589o() {
        if (this.f79881c != null) {
            this.f79881c.mo54825a();
        }
    }

    public final void az_() {
        super.az_();
        if (mo62963bx()) {
            this.f79890j = false;
            m71589o();
        }
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (mo62868bh()) {
            this.f79882d.am_();
        }
    }

    public final void aJ_() {
        if (mo62868bh()) {
            this.f79888h.setRefreshing(false);
            this.mStatusView.setVisibility(0);
            this.mStatusView.mo19213g();
        }
    }

    public final void aS_() {
        if (mo62868bh() && !this.f79892l) {
            this.f79888h.setRefreshing(true);
        }
    }

    /* renamed from: b */
    public final C1332i mo62766b() {
        return new WrapGridLayoutManager(mo96010bw(), 2, 1, false);
    }

    /* renamed from: d */
    public final C30078e mo62769d() {
        int i;
        if (this.f79882d != null) {
            return this.f79882d;
        }
        if (this.f79893m == 7) {
            i = 1;
        } else {
            i = 0;
        }
        C30078e eVar = new C30078e(this, this.f79891k, this.f79879a, this, i, this.f79893m);
        return eVar;
    }

    /* renamed from: n */
    private void m71588n() {
        if (this.f79882d != null && !this.f79890j && this.mListView != null) {
            int childCount = this.mListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1352v b = this.mListView.mo4812b(this.mListView.getChildAt(i));
                if (b.mItemViewType == 0) {
                    mo50455a((C30009a) b);
                }
            }
        }
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (mo62868bh()) {
            if (this.f79882d.getItemCount() == 0) {
                this.f79888h.setRefreshing(false);
                if (this.mStatusView != null) {
                    this.mStatusView.setVisibility(0);
                    this.mStatusView.mo19212f();
                }
            } else {
                this.f79888h.setRefreshing(true);
            }
        }
    }

    /* renamed from: i */
    public final void mo62773i() {
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
        m71587b(false);
        m71588n();
    }

    /* renamed from: l */
    public final void mo55812l() {
        super.mo55812l();
        if (mo62963bx() && C23794bh.m58403q().mo77209b(this.f121964aK)) {
            this.f79890j = false;
            m71588n();
            m71587b(true);
        }
    }

    /* renamed from: c */
    public final C1331h mo62768c() {
        if (this.f79893m == 9) {
            if (C10181b.m20511a().mo18168a(VideoShowTypeExperiment.class, true, "video_search_show_style", 31744, 0) == 5) {
                return new C30836cc(8);
            }
            if (C10181b.m20511a().mo18168a(VideoShowTypeExperiment.class, true, "video_search_show_style", 31744, 0) != 3) {
                return new C30836cc(1);
            }
        }
        return new C30839cf((int) C9432q.m18687b(mo96010bw(), 1.0f));
    }

    /* renamed from: d */
    public final void mo55806d(boolean z) {
        this.f79892l = z;
    }

    /* renamed from: b */
    private void m71587b(boolean z) {
        if (this.f79881c != null) {
            this.f79881c.mo54826a(false, z);
        }
    }

    /* renamed from: a */
    public final void mo62772a(boolean z) {
        if (z) {
            this.f79882d.ao_();
        } else {
            C30602aj.m71631a(this.f79882d);
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        if (mo62868bh()) {
            this.f79882d.co_();
        }
    }

    @C53771m
    public void onDynamicEvent(C24529c cVar) {
        if (cVar.f64950a == 0) {
            m71587b(true);
        } else {
            m71589o();
        }
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
        if (mo62868bh()) {
            this.f79888h.setRefreshing(false);
            if (!this.f79892l) {
                C10691a.m21542b((Context) this.f121964aK, (int) R.string.c0a).mo19066a();
            }
        }
    }

    /* renamed from: a */
    public final void mo62771a(String str) {
        if (this.mListView != null && (this.mListView instanceof FpsRecyclerView)) {
            ((FpsRecyclerView) this.mListView).setLabel(str);
        }
        C47729bp.m103326a(str).mo95020a(this.mListView);
        if (this.f79882d != null && (this.f79882d instanceof C26844j)) {
            this.f79882d.f70684u = str;
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (mo62868bh()) {
            this.f79888h.setRefreshing(false);
            if (!this.f79894n) {
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
            this.f79882d.notifyItemRemoved(i);
            if (i != 0) {
                this.f79882d.notifyItemChanged(i, Boolean.FALSE);
                this.f79882d.notifyItemChanged(i + 1, Boolean.FALSE);
                this.f79882d.notifyItemChanged(i + 2, Boolean.FALSE);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00eb A[Catch:{ JSONException -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fe A[Catch:{ JSONException -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02c4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50455a(com.p683ss.android.ugc.aweme.feed.adapter.C30009a r14) {
        /*
            r13 = this;
            if (r14 == 0) goto L_0x02f2
            boolean r0 = r13.mo62868bh()
            if (r0 != 0) goto L_0x000a
            goto L_0x02f2
        L_0x000a:
            boolean r0 = r13.mo62788as()
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            int r0 = r13.f79893m
            r1 = 9
            if (r0 == r1) goto L_0x02f1
            int r0 = r13.f79893m
            r1 = 15
            if (r0 != r1) goto L_0x001f
            goto L_0x02f1
        L_0x001f:
            r0 = 1
            r13.f79890j = r0
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r1 = com.p683ss.android.ugc.aweme.awemeservice.C23325e.m57379a()
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r1 = (com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()
            int r3 = r13.f79893m
            org.json.JSONObject r10 = r1.getRequestIdAndOrderJsonObject(r2, r3)
            java.lang.String r1 = "display"
            java.lang.String r2 = "dual"
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r1 = r13.f79891k     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r2 = "homepage_fresh"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ JSONException -> 0x0138 }
            if (r1 == 0) goto L_0x0050
            java.lang.String r1 = "homepage_fresh"
            java.lang.String r0 = "style"
            java.lang.String r2 = "text"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x0139 }
        L_0x004e:
            r0 = r1
            goto L_0x00a0
        L_0x0050:
            java.lang.String r1 = r13.f79891k     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r2 = "homepage_hot"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ JSONException -> 0x0138 }
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = "homepage_hot"
            java.lang.String r0 = "style"
            java.lang.String r2 = "text"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x0139 }
            goto L_0x004e
        L_0x0064:
            java.lang.String r1 = r13.f79891k     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r2 = "homepage_follow"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ JSONException -> 0x0138 }
            if (r1 == 0) goto L_0x0078
            java.lang.String r1 = "homepage_follow"
            java.lang.String r0 = "style"
            java.lang.String r2 = "text"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x0139 }
            goto L_0x004e
        L_0x0078:
            java.lang.String r1 = r13.f79891k     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r2 = "categorized_city_poi"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ JSONException -> 0x0138 }
            if (r1 == 0) goto L_0x008c
            java.lang.String r1 = "categorized_city_poi"
            java.lang.String r0 = "style"
            java.lang.String r2 = "text"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x0139 }
            goto L_0x004e
        L_0x008c:
            java.lang.String r1 = r13.f79891k     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r2 = "homepage_channel"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ JSONException -> 0x0138 }
            if (r1 == 0) goto L_0x00a0
            java.lang.String r1 = "homepage_channel"
            java.lang.String r0 = "style"
            java.lang.String r2 = "text"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x0139 }
            goto L_0x004e
        L_0x00a0:
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56846a(r2)     // Catch:{ JSONException -> 0x0138 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r1 = "request_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0138 }
            int r3 = r13.f79893m     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56847a(r2, r3)     // Catch:{ JSONException -> 0x0138 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r1 = "music_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0138 }
            java.lang.Long r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56871j(r2)     // Catch:{ JSONException -> 0x0138 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r1 = "content"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56876l(r2)     // Catch:{ JSONException -> 0x0138 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r1 = "display"
            java.lang.String r2 = "dual"
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0138 }
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r14.mo54754d()     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r1 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56861e(r1)     // Catch:{ JSONException -> 0x0138 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0138 }
            if (r1 != 0) goto L_0x00f8
            java.lang.String r1 = "poi_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56861e(r2)     // Catch:{ JSONException -> 0x0138 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0138 }
        L_0x00f8:
            boolean r1 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56858c(r0)     // Catch:{ JSONException -> 0x0138 }
            if (r1 == 0) goto L_0x012a
            java.lang.String r1 = "poi_type"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56867h(r2)     // Catch:{ JSONException -> 0x0138 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r1 = "poi_channel"
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56852b()     // Catch:{ JSONException -> 0x0138 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r1 = "city_info"
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56845a()     // Catch:{ JSONException -> 0x0138 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r1 = "distance_info"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56869i(r2)     // Catch:{ JSONException -> 0x0138 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0138 }
        L_0x012a:
            java.lang.String r1 = "is_photo"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56878n(r2)     // Catch:{ JSONException -> 0x0138 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0138 }
            goto L_0x013a
        L_0x0138:
            r1 = r0
        L_0x0139:
            r0 = r1
        L_0x013a:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r14.mo54754d()
            boolean r1 = r1.isLive()
            if (r1 == 0) goto L_0x02c4
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
            if (r2 != 0) goto L_0x016d
            java.lang.String r2 = ""
            goto L_0x017b
        L_0x016d:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo54754d()
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            long r2 = r2.roomId
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L_0x017b:
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
            int r5 = r13.f79893m
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
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r14.mo54754d()
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r1 = r1.getNewLiveRoomData()
            if (r1 == 0) goto L_0x02d4
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "content_tag"
            java.lang.String r4 = r1.contentTag     // Catch:{ JSONException -> 0x023e }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x023e }
            boolean r3 = com.p683ss.android.ugc.aweme.feed.C30228f.m70984h()     // Catch:{ JSONException -> 0x023e }
            if (r3 == 0) goto L_0x023e
            com.ss.android.ugc.aweme.feed.model.TVStationRoomStruct r3 = r1.tvStationRoomStruct     // Catch:{ JSONException -> 0x023e }
            if (r3 == 0) goto L_0x0231
            com.ss.android.ugc.aweme.feed.model.TVStationRoomStruct r3 = r1.tvStationRoomStruct     // Catch:{ JSONException -> 0x023e }
            java.lang.String r3 = r3.statesDesc     // Catch:{ JSONException -> 0x023e }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x023e }
            if (r3 == 0) goto L_0x023e
        L_0x0231:
            java.lang.String r3 = "location"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r14.mo54754d()     // Catch:{ JSONException -> 0x023e }
            java.lang.String r4 = r4.getDistance()     // Catch:{ JSONException -> 0x023e }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x023e }
        L_0x023e:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "anchor_id"
            com.ss.android.ugc.aweme.profile.model.User r5 = r1.owner
            if (r5 == 0) goto L_0x0254
            com.ss.android.ugc.aweme.profile.model.User r5 = r1.owner
            java.lang.String r5 = r5.getUid()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto L_0x0256
        L_0x0254:
            java.lang.String r5 = ""
        L_0x0256:
            r3.put(r4, r5)
            java.lang.String r4 = "room_id"
            long r5 = r1.f79734id
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.put(r4, r5)
            java.lang.String r4 = "enter_from_merge"
            java.lang.String r5 = "homepage_fresh"
            r3.put(r4, r5)
            java.lang.String r4 = "enter_method"
            java.lang.String r5 = "live_cover"
            r3.put(r4, r5)
            java.lang.String r4 = "action_type"
            java.lang.String r5 = "click"
            r3.put(r4, r5)
            java.lang.String r4 = "request_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r14.mo54754d()
            java.lang.String r5 = r5.getRequestId()
            r3.put(r4, r5)
            java.lang.String r4 = "basic_info"
            java.lang.String r2 = r2.toString()
            r3.put(r4, r2)
            com.ss.android.ugc.aweme.feed.model.live.LiveImageModel r2 = r1.getOperationLabel()
            if (r2 == 0) goto L_0x02a7
            java.lang.String r2 = "sub_info"
            com.ss.android.ugc.aweme.feed.model.live.LiveImageModel r1 = r1.getOperationLabel()
            int r1 = r1.getImageType()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.put(r2, r1)
            goto L_0x02be
        L_0x02a7:
            com.ss.android.ugc.aweme.feed.model.live.LiveImageModel r2 = r1.getContentLabel()
            if (r2 == 0) goto L_0x02be
            java.lang.String r2 = "main_info"
            com.ss.android.ugc.aweme.feed.model.live.LiveImageModel r1 = r1.getContentLabel()
            int r1 = r1.getImageType()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.put(r2, r1)
        L_0x02be:
            java.lang.String r1 = "livesdk_live_cover_info"
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r3)
            goto L_0x02d4
        L_0x02c4:
            android.content.Context r4 = r13.mo96010bw()
            java.lang.String r5 = "show"
            java.lang.String r7 = r14.mo58501l()
            r8 = 0
            r6 = r0
            com.p683ss.android.ugc.aweme.common.C26890h.m65006a(r4, r5, r6, r7, r8, r10)
        L_0x02d4:
            com.ss.android.ugc.aweme.aq.ar r1 = new com.ss.android.ugc.aweme.aq.ar
            r1.<init>()
            com.ss.android.ugc.aweme.aq.ar r0 = r1.mo47997a(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r14 = r14.mo54754d()
            int r1 = r13.f79893m
            com.ss.android.ugc.aweme.aq.ar r14 = r0.mo47999c(r14, r1)
            java.lang.String r0 = "dual"
            com.ss.android.ugc.aweme.aq.ar r14 = r14.mo48002e(r0)
            r14.mo48076e()
            return
        L_0x02f1:
            return
        L_0x02f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel.mo50455a(com.ss.android.ugc.aweme.feed.adapter.a):void");
    }

    /* renamed from: a */
    public final void mo55784a(View view, Bundle bundle) {
        super.mo55784a(view, bundle);
        this.f79888h = new C36603dv(this.mRefreshLayout);
        if (this.f79887g != null) {
            this.mRefreshLayout.setOnSwipeChangeListener(this.f79887g);
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<Aweme> list, boolean z) {
        if (mo62868bh()) {
            this.mStatusView.mo19209d();
            this.mStatusView.setVisibility(8);
            this.f79888h.setRefreshing(false);
            this.f79894n = true;
            this.f79882d.mo54798c(true);
            this.f79882d.mo50303a(list);
            mo62772a(z);
            if (this.f79889i != null) {
                this.f79889i.mo56557k();
            }
            m71587b(true);
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<Aweme> list, boolean z) {
        if (mo62868bh()) {
            this.f79888h.setRefreshing(false);
            this.f79882d.mo50304b(list);
            m71587b(true);
            mo62772a(z);
        }
    }

    /* renamed from: c */
    public final void mo47029c(List<Aweme> list, boolean z) {
        if (mo62868bh()) {
            if (z || this.f79892l) {
                this.f79882d.mo54784d(list);
                if (!this.f79892l && aB_()) {
                    mo62767b(0);
                    m71587b(true);
                }
            } else if (mo62963bx() && this.f121964aK != null && C23794bh.m58403q().mo77208a(this.f121964aK)) {
                C10691a.m21548c((Context) this.f121964aK, (int) R.string.an1).mo19066a();
                mo62767b(0);
            }
            this.f79888h.setRefreshing(false);
        }
    }

    public CellFeedFragmentPanel(String str, C24579d dVar, C30462o oVar, int i) {
        super(dVar, oVar);
        this.f79891k = str;
        this.f79893m = i;
    }
}
