package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.adapter.C24534a;
import com.p683ss.android.ugc.aweme.challenge.p1497c.C24559a;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24623c;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24624d;
import com.p683ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.p683ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel.C24785a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.j */
public final class C24720j extends C24624d {
    public static final C24721a Companion = new C24721a(null);

    /* renamed from: a */
    private WeakReference<FragmentActivity> f65467a;

    /* renamed from: b */
    private String f65468b;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$a */
    public static final class C24721a {
        private C24721a() {
        }

        public /* synthetic */ C24721a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$b */
    public static final class C24722b extends C26876b<C24559a> {
        C24722b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a6, code lost:
            if (((com.p683ss.android.ugc.aweme.challenge.p1497c.C24559a) r3).isNewDataEmpty() == false) goto L_0x00aa;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo44838b() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.common.a r0 = r5.f70700f
                if (r0 == 0) goto L_0x00ae
                com.ss.android.ugc.aweme.common.e r0 = r5.f70701g
                if (r0 != 0) goto L_0x000a
                goto L_0x00ae
            L_0x000a:
                com.ss.android.ugc.aweme.common.a r0 = r5.f70700f
                java.lang.String r1 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                com.ss.android.ugc.aweme.challenge.c.a r0 = (com.p683ss.android.ugc.aweme.challenge.p1497c.C24559a) r0
                int r0 = r0.mListQueryType
                r1 = 4
                r2 = 1
                if (r0 == r1) goto L_0x0079
                switch(r0) {
                    case 1: goto L_0x0040;
                    case 2: goto L_0x001d;
                    default: goto L_0x001c;
                }
            L_0x001c:
                goto L_0x003f
            L_0x001d:
                com.ss.android.ugc.aweme.common.e r0 = r5.f70701g
                com.ss.android.ugc.aweme.common.f.c r0 = (com.p683ss.android.ugc.aweme.common.p1594f.C26877c) r0
                com.ss.android.ugc.aweme.common.a r1 = r5.f70700f
                java.lang.String r3 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
                com.ss.android.ugc.aweme.challenge.c.a r1 = (com.p683ss.android.ugc.aweme.challenge.p1497c.C24559a) r1
                java.util.List r1 = r1.mo50330a()
                com.ss.android.ugc.aweme.common.a r3 = r5.f70700f
                java.lang.String r4 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                com.ss.android.ugc.aweme.challenge.c.a r3 = (com.p683ss.android.ugc.aweme.challenge.p1497c.C24559a) r3
                boolean r3 = r3.isNewDataEmpty()
                r2 = r2 ^ r3
                r0.mo47029c(r1, r2)
            L_0x003f:
                return
            L_0x0040:
                com.ss.android.ugc.aweme.common.a r0 = r5.f70700f
                java.lang.String r1 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                com.ss.android.ugc.aweme.challenge.c.a r0 = (com.p683ss.android.ugc.aweme.challenge.p1497c.C24559a) r0
                boolean r0 = r0.isDataEmpty()
                if (r0 == 0) goto L_0x0057
                com.ss.android.ugc.aweme.common.e r0 = r5.f70701g
                com.ss.android.ugc.aweme.common.f.c r0 = (com.p683ss.android.ugc.aweme.common.p1594f.C26877c) r0
                r0.aJ_()
                return
            L_0x0057:
                com.ss.android.ugc.aweme.common.e r0 = r5.f70701g
                com.ss.android.ugc.aweme.common.f.c r0 = (com.p683ss.android.ugc.aweme.common.p1594f.C26877c) r0
                com.ss.android.ugc.aweme.common.a r1 = r5.f70700f
                java.lang.String r2 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                com.ss.android.ugc.aweme.challenge.c.a r1 = (com.p683ss.android.ugc.aweme.challenge.p1497c.C24559a) r1
                java.util.List r1 = r1.mo50330a()
                com.ss.android.ugc.aweme.common.a r2 = r5.f70700f
                java.lang.String r3 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                com.ss.android.ugc.aweme.challenge.c.a r2 = (com.p683ss.android.ugc.aweme.challenge.p1497c.C24559a) r2
                boolean r2 = r2.isHasMore()
                r0.mo47018a(r1, r2)
                return
            L_0x0079:
                com.ss.android.ugc.aweme.common.e r0 = r5.f70701g
                com.ss.android.ugc.aweme.common.f.c r0 = (com.p683ss.android.ugc.aweme.common.p1594f.C26877c) r0
                com.ss.android.ugc.aweme.common.a r1 = r5.f70700f
                java.lang.String r3 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
                com.ss.android.ugc.aweme.challenge.c.a r1 = (com.p683ss.android.ugc.aweme.challenge.p1497c.C24559a) r1
                java.util.List r1 = r1.mo50330a()
                com.ss.android.ugc.aweme.common.a r3 = r5.f70700f
                java.lang.String r4 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                com.ss.android.ugc.aweme.challenge.c.a r3 = (com.p683ss.android.ugc.aweme.challenge.p1497c.C24559a) r3
                boolean r3 = r3.isHasMore()
                if (r3 == 0) goto L_0x00a9
                com.ss.android.ugc.aweme.common.a r3 = r5.f70700f
                java.lang.String r4 = "mModel"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                com.ss.android.ugc.aweme.challenge.c.a r3 = (com.p683ss.android.ugc.aweme.challenge.p1497c.C24559a) r3
                boolean r3 = r3.isNewDataEmpty()
                if (r3 != 0) goto L_0x00a9
                goto L_0x00aa
            L_0x00a9:
                r2 = 0
            L_0x00aa:
                r0.mo47026b(r1, r2)
                return
            L_0x00ae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.C24720j.C24722b.mo44838b():void");
        }
    }

    public C24720j() {
        this(null, 1, null);
    }

    public final WeakReference<FragmentActivity> getActivity() {
        return this.f65467a;
    }

    public final String getSource() {
        return this.f65468b;
    }

    public final boolean sendCustomRequest(C26876b<? extends C26875a<?, ?>> bVar, int i) {
        return false;
    }

    public final void setActivity(WeakReference<FragmentActivity> weakReference) {
        this.f65467a = weakReference;
    }

    public final void setSource(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f65468b = str;
    }

    public C24720j(String str) {
        C52711k.m112240b(str, "source");
        this.f65468b = str;
    }

    public final void onJumpToDetail(String str) {
        C52711k.m112240b(str, "aid");
        super.onJumpToDetail(str);
    }

    public final int getDetailAwemeViewType(int i, Aweme aweme) {
        LiveRoomStruct liveRoomStruct;
        if (aweme != null) {
            liveRoomStruct = aweme.getNewLiveRoomData();
        } else {
            liveRoomStruct = null;
        }
        if (liveRoomStruct != null) {
            return 1;
        }
        return 0;
    }

    public final C26876b<? extends C26875a<?, ?>> getPresenter(int i, FragmentActivity fragmentActivity) {
        C24559a aVar = new C24559a();
        if (fragmentActivity != null) {
            ChallengeDetailViewModel a = C24785a.m60319a(fragmentActivity);
            C52711k.m112240b(aVar, "model");
            a.f65606b.setValue(new C52847n(Integer.valueOf(i), aVar));
        }
        aVar.mo50331a(this.f65468b);
        C24722b bVar = new C24722b();
        bVar.mo54799a(aVar);
        return bVar;
    }

    public final C24623c getJumpToVideoParam(C24623c cVar, Aweme aweme) {
        C52711k.m112240b(cVar, "param");
        C52711k.m112240b(aweme, "aweme");
        C26890h.m65011a("feed_enter", new C23089d().mo47829a("enter_from", "challenge").mo47829a("group_id", aweme.getAid()).mo47829a("tag_id", cVar.f65169d).mo47829a("search_id", (String) C24559a.f65017a.get(aweme.getAid())).mo47829a("rank_index", String.valueOf(cVar.f65171f)).mo47829a("process_id", cVar.f65170e).f61491a);
        cVar.f65166a = "from_challenge";
        cVar.f65167b = "challenge_id";
        return cVar;
    }

    public /* synthetic */ C24720j(String str, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        this(str);
    }

    public final C24534a onCreateDetailAwemeViewHolder(ViewGroup viewGroup, int i, String str, C24579d dVar) {
        C52711k.m112240b(viewGroup, "parent");
        if (i != 1) {
            return new C24723k(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b8g, viewGroup, false), str, dVar);
        }
        C24534a createLiveChallengeDetailViewHolder = C24632af.m60127a().createLiveChallengeDetailViewHolder(viewGroup, str);
        C52711k.m112236a((Object) createLiveChallengeDetailViewHolder, "LiveChallengeDetailDeleg…older(parent, eventLabel)");
        return createLiveChallengeDetailViewHolder;
    }
}
