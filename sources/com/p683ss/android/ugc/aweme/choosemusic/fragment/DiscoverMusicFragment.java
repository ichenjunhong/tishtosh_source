package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.arch.lifecycle.C0199s;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.choosemusic.adapter.C24814a;
import com.p683ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24836e;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24842a;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24847c;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24995p;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26990b.C26991a;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.DiscoverMusicFragment */
public class DiscoverMusicFragment extends C23526a implements C0199s<C23274a>, C26846a, C26991a {

    /* renamed from: a */
    public DataCenter f65840a;

    /* renamed from: b */
    public C23279d f65841b;

    /* renamed from: c */
    public C24814a f65842c;

    /* renamed from: d */
    C24833b f65843d;

    /* renamed from: e */
    C24836e f65844e;

    /* renamed from: j */
    C37306l<C24806c> f65845j;

    /* renamed from: k */
    public C24842a f65846k;

    /* renamed from: l */
    private int f65847l;

    /* renamed from: m */
    private int f65848m;
    RecyclerView mListView;
    DmtStatusView mStatusView;

    /* renamed from: l */
    public final View mo50471l() {
        return this.mListView;
    }

    public final void ar_() {
        C0013i iVar;
        int i = this.f65848m - 2;
        if (i < 0) {
            i = 0;
        }
        C24842a aVar = this.f65846k;
        if (!aVar.f65740c) {
            aVar.f65740c = true;
            C17429o b = C17429o.m42675b();
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(10);
            if (C24954a.m60699b()) {
                iVar = ChooseMusicApi.f65730a.commerceMusicCollectionFeed(valueOf, valueOf2);
            } else {
                iVar = ChooseMusicApi.f65730a.musicCollectionFeed(valueOf, valueOf2);
            }
            iVar.mo20a((C0011g<TResult, TContinuationResult>) new C24847c<TResult,TContinuationResult>(aVar, b), C0013i.f25b);
        }
        if (isViewValid() && this.f65842c != null) {
            this.f65842c.am_();
        }
    }

    /* renamed from: a */
    public final void mo50809a(int i) {
        if (this.f65842c != null) {
            this.f65842c.mo50696c(i);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            i = 1;
        }
        this.f65847l = i;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!(this.mListView == null || !z || this.f65842c == null)) {
            this.f65842c.mo50693a(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(java.lang.Object r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.arch.widgets.base.a r9 = (com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a) r9
            java.lang.String r0 = r9.f62242a
            int r1 = r0.hashCode()
            r2 = -1635157503(0xffffffff9e897a01, float:-1.4555899E-20)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x003e
            r2 = 3322014(0x32b09e, float:4.655133E-39)
            if (r1 == r2) goto L_0x0034
            r2 = 510590654(0x1e6efebe, float:1.26522945E-20)
            if (r1 == r2) goto L_0x002a
            r2 = 1110903186(0x42370992, float:45.759346)
            if (r1 == r2) goto L_0x0020
            goto L_0x0048
        L_0x0020:
            java.lang.String r1 = "collection_feed_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0048
            r0 = 3
            goto L_0x0049
        L_0x002a:
            java.lang.String r1 = "should_load_more_pick"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0048
            r0 = 0
            goto L_0x0049
        L_0x0034:
            java.lang.String r1 = "list"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0048
            r0 = 1
            goto L_0x0049
        L_0x003e:
            java.lang.String r1 = "music_collect_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0048
            r0 = 2
            goto L_0x0049
        L_0x0048:
            r0 = -1
        L_0x0049:
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0203;
                case 1: goto L_0x009e;
                case 2: goto L_0x0068;
                case 3: goto L_0x004f;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x0209
        L_0x004f:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f65840a
            java.lang.String r0 = "collection_feed_status"
            java.lang.Object r9 = r9.mo48229a(r0)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x0209
            int r9 = r9.intValue()
            if (r9 != r5) goto L_0x0209
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            r9.mo54798c(r4)
            goto L_0x0209
        L_0x0068:
            java.lang.Object r9 = r9.mo48246a()
            com.ss.android.ugc.aweme.choosemusic.a.a r9 = (com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24804a) r9
            boolean r0 = r8.getUserVisibleHint()
            if (r0 == 0) goto L_0x009d
            int r0 = r9.f65652c
            if (r0 != r3) goto L_0x0079
            goto L_0x009d
        L_0x0079:
            int r0 = r9.f65653d
            if (r0 != r5) goto L_0x0081
            int r0 = r9.f65650a
            if (r0 == 0) goto L_0x0209
        L_0x0081:
            int r0 = r9.f65650a
            if (r0 != r5) goto L_0x009c
            android.support.v4.app.FragmentActivity r0 = r8.getActivity()
            int r9 = r9.f65653d
            if (r9 != r5) goto L_0x0091
            r9 = 2132542937(0x7f1c05d9, float:2.0738993E38)
            goto L_0x0094
        L_0x0091:
            r9 = 2132542535(0x7f1c0447, float:2.0738178E38)
        L_0x0094:
            com.bytedance.ies.dmt.ui.d.a r9 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r0, r9)
            r9.mo19066a()
            return
        L_0x009c:
            return
        L_0x009d:
            return
        L_0x009e:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f65840a
            java.lang.String r0 = "list"
            java.lang.Object r9 = r9.mo48229a(r0)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x0202
            int r0 = r9.size()
            if (r0 > 0) goto L_0x00b2
            goto L_0x0202
        L_0x00b2:
            com.ss.android.ugc.aweme.choosemusic.adapter.a r0 = r8.f65842c
            int r0 = r0.getItemCount()
            int r9 = r9.size()
            r8.f65848m = r9
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f65840a
            java.lang.String r2 = "is_busi_sticker"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r9 = r9.mo48230b(r2, r3)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r8.f65840a
            java.lang.String r3 = "shoot_way"
            java.lang.Object r2 = r2.mo48230b(r3, r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "challenge"
            boolean r2 = r3.equals(r2)
            r3 = 4
            r6 = 5
            if (r2 == 0) goto L_0x010e
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f65840a
            java.lang.String r2 = "data_challenge"
            java.lang.Object r9 = r9.mo48229a(r2)
            if (r9 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            r9.mo50694a(r5, r6)
            goto L_0x0191
        L_0x00f5:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f65840a
            java.lang.String r2 = "data_sticker"
            java.lang.Object r9 = r9.mo48230b(r2, r1)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x0191
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x0191
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            r9.mo50694a(r5, r3)
            goto L_0x0191
        L_0x010e:
            if (r9 == 0) goto L_0x016a
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f65840a
            java.lang.String r2 = "data_sticker_music_from_video"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r9 = r9.mo48230b(r2, r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r8.f65840a
            java.lang.String r7 = "data_sticker"
            java.lang.Object r1 = r2.mo48230b(r7, r1)
            java.util.List r1 = (java.util.List) r1
            if (r9 == 0) goto L_0x014c
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f65840a
            java.lang.String r2 = "data_challenge"
            java.lang.Object r9 = r9.mo48229a(r2)
            if (r9 == 0) goto L_0x013e
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            r9.mo50694a(r5, r6)
            goto L_0x0191
        L_0x013e:
            if (r1 == 0) goto L_0x0191
            int r9 = r1.size()
            if (r9 <= 0) goto L_0x0191
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            r9.mo50694a(r5, r3)
            goto L_0x0191
        L_0x014c:
            if (r1 == 0) goto L_0x015a
            int r9 = r1.size()
            if (r9 <= 0) goto L_0x015a
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            r9.mo50694a(r5, r3)
            goto L_0x0191
        L_0x015a:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f65840a
            java.lang.String r1 = "data_challenge"
            java.lang.Object r9 = r9.mo48229a(r1)
            if (r9 == 0) goto L_0x0191
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            r9.mo50694a(r5, r6)
            goto L_0x0191
        L_0x016a:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f65840a
            java.lang.String r2 = "data_sticker"
            java.lang.Object r9 = r9.mo48230b(r2, r1)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x0182
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x0182
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            r9.mo50694a(r5, r3)
            goto L_0x0191
        L_0x0182:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f65840a
            java.lang.String r1 = "data_challenge"
            java.lang.Object r9 = r9.mo48229a(r1)
            if (r9 == 0) goto L_0x0191
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            r9.mo50694a(r5, r6)
        L_0x0191:
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r8.f65840a
            java.lang.String r2 = "show_music_radio"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r1 = r1.mo48230b(r2, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r9.f65685g = r1
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            int r1 = r8.f65848m
            r9.f65684f = r1
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            int r9 = r9.getItemCount()
            int r9 = r9 - r0
            if (r9 <= 0) goto L_0x01d7
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r2 = "Redmi 6A"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x01d1
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r2 = "Redmi 6"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x01cb
            goto L_0x01d1
        L_0x01cb:
            com.ss.android.ugc.aweme.choosemusic.adapter.a r1 = r8.f65842c
            r1.notifyItemRangeInserted(r0, r9)
            goto L_0x01dc
        L_0x01d1:
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            r9.notifyDataSetChanged()
            goto L_0x01dc
        L_0x01d7:
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            r9.notifyDataSetChanged()
        L_0x01dc:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f65840a
            java.lang.String r0 = "collection_feed_has_more"
            java.lang.Object r9 = r9.mo48229a(r0)
            if (r9 == 0) goto L_0x0209
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f65840a
            java.lang.String r0 = "collection_feed_has_more"
            java.lang.Object r9 = r9.mo48229a(r0)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 != r5) goto L_0x01fc
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            r9.ao_()
            goto L_0x0209
        L_0x01fc:
            com.ss.android.ugc.aweme.choosemusic.adapter.a r9 = r8.f65842c
            r9.mo54798c(r4)
            return
        L_0x0202:
            return
        L_0x0203:
            com.ss.android.ugc.aweme.choosemusic.d.a r9 = r8.f65846k
            r9.mo50749a(r5, r1, r1, r4)
            return
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.choosemusic.fragment.DiscoverMusicFragment.onChanged(java.lang.Object):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo50810a(int i, int i2) {
        ar_();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ok, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        C24814a aVar = new C24814a(this.f65841b, this.f65840a, this.f65843d, this.f65844e, this.f65845j, this.f65847l);
        this.f65842c = aVar;
        this.f65842c.mo54788a((C26846a) this);
        this.f65842c.f70682s = getResources().getColor(R.color.jl);
        this.mListView.setOverScrollMode(2);
        this.mListView.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        this.mListView.setAdapter(this.f65842c);
        new C24995p(new C24937m(this), 5).mo50986a(this.mListView);
        this.f65840a.mo48226a("list", (C0199s<C23274a>) this).mo48226a("should_load_more_pick", (C0199s<C23274a>) this).mo48226a("music_collect_status", (C0199s<C23274a>) this).mo48226a("collection_feed_status", (C0199s<C23274a>) this);
        return inflate;
    }
}
