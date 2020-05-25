package com.p683ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.adaptation.C22453b.C22456b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22711b;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25880al;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25881am;
import com.p683ss.android.ugc.aweme.feed.C29984ac;
import com.p683ss.android.ugc.aweme.feed.api.C30153k;
import com.p683ss.android.ugc.aweme.feed.helper.C30365e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30315ag;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30316ah;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30340i;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LongPressLayout.C30722a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.video.C48039k;
import com.p683ss.android.ugc.aweme.video.p2395d.C48012b;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.C50158g;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.c */
public class C30075c implements C22456b, C30012ac, C30014ae, C30016ag {

    /* renamed from: a */
    public final Context f78506a;

    /* renamed from: b */
    public Aweme f78507b;

    /* renamed from: c */
    public LiveRoomStruct f78508c;

    /* renamed from: d */
    public C30018ai f78509d;

    /* renamed from: e */
    public String f78510e = "click";

    /* renamed from: f */
    public boolean f78511f;

    /* renamed from: g */
    public boolean f78512g;

    /* renamed from: h */
    public final View f78513h;

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.c$a */
    static final class C30076a implements C30722a {

        /* renamed from: a */
        final /* synthetic */ Context f78514a;

        C30076a(Context context) {
            this.f78514a = context;
        }

        /* renamed from: a */
        public final void mo60340a(float f, float f2) {
            if (!C47915gg.m103651b()) {
                C22711b d = C23794bh.m58390d();
                C52711k.m112236a((Object) d, "LegacyServiceUtils.getTimeLockRulerService()");
                if (!d.mo47103a()) {
                    C30340i iVar = new C30340i(true, 1, f, f2, this.f78514a.hashCode(), 3);
                    C47718bf.m103288a(iVar);
                }
            }
        }
    }

    /* renamed from: A */
    public final void mo60178A() {
    }

    /* renamed from: B */
    public final void mo60179B() {
    }

    /* renamed from: C */
    public void mo60284C() {
    }

    /* renamed from: D */
    public final C48012b mo60180D() {
        return null;
    }

    /* renamed from: E */
    public final Aweme mo60289E() {
        return C30017ah.m70428a(this);
    }

    /* renamed from: F */
    public final boolean mo60181F() {
        return false;
    }

    /* renamed from: G */
    public final void mo60182G() {
    }

    /* renamed from: H */
    public final void mo60183H() {
    }

    /* renamed from: I */
    public final C29984ac mo60184I() {
        return null;
    }

    /* renamed from: J */
    public final C30365e mo60185J() {
        return null;
    }

    /* renamed from: M */
    public final C30153k mo60188M() {
        return null;
    }

    /* renamed from: a */
    public void mo46747a() {
    }

    /* renamed from: a */
    public final void mo53523a(float f) {
    }

    /* renamed from: a */
    public final void mo60199a(long j) {
    }

    /* renamed from: a */
    public final void mo60202a(C30316ah ahVar) {
    }

    /* renamed from: a */
    public final void mo60203a(Aweme aweme, int i) {
        C30017ah.m70429a(this, aweme, i);
    }

    /* renamed from: a */
    public final void mo60206a(C35471h hVar) {
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
    }

    /* renamed from: a */
    public final void mo60208a(String str, String str2) {
    }

    /* renamed from: a */
    public final void mo53528a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo60209a(Map map, int i) {
    }

    /* renamed from: a */
    public final void mo53529a(boolean z) {
    }

    public final boolean aE_() {
        return false;
    }

    public final boolean aF_() {
        return false;
    }

    /* renamed from: b */
    public void mo60223b(int i) {
    }

    /* renamed from: b */
    public final void mo53530b(C50112d dVar) {
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
    }

    /* renamed from: c */
    public final int mo53997c() {
        return BaseNotice.HASHTAG;
    }

    /* renamed from: c */
    public final void mo60228c(Aweme aweme) {
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
    }

    /* renamed from: c */
    public final void mo55903c(boolean z) {
    }

    /* renamed from: d */
    public final int mo53998d() {
        return 2;
    }

    /* renamed from: d */
    public final void mo53534d(String str) {
    }

    /* renamed from: d */
    public final void mo60231d(boolean z) {
    }

    /* renamed from: e */
    public final Aweme mo53999e() {
        return this.f78507b;
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
    }

    /* renamed from: e */
    public void mo60234e(boolean z) {
    }

    /* renamed from: f */
    public void mo54000f() {
    }

    /* renamed from: f */
    public final void mo60237f(boolean z) {
    }

    /* renamed from: g */
    public void mo54001g() {
    }

    /* renamed from: g */
    public final void mo60239g(boolean z) {
    }

    /* renamed from: h */
    public void mo54002h() {
    }

    /* renamed from: h */
    public final void mo60240h(boolean z) {
    }

    /* renamed from: i */
    public void mo54003i() {
    }

    /* renamed from: j */
    public final C30014ae mo54004j() {
        return this;
    }

    /* renamed from: k */
    public void mo60342k() {
    }

    /* renamed from: m */
    public final C50158g mo60242m() {
        return null;
    }

    /* renamed from: n */
    public final Context mo60344n() {
        return this.f78506a;
    }

    /* renamed from: q */
    public final int mo60247q() {
        return 2;
    }

    /* renamed from: r */
    public final C25880al mo60248r() {
        return null;
    }

    /* renamed from: s */
    public final C25881am mo60249s() {
        return null;
    }

    /* renamed from: t */
    public final void mo60250t() {
    }

    /* renamed from: u */
    public final C30015af mo60251u() {
        return null;
    }

    /* renamed from: v */
    public final boolean mo60252v() {
        return true;
    }

    /* renamed from: w */
    public final Surface mo60253w() {
        return null;
    }

    /* renamed from: x */
    public final View mo60254x() {
        return null;
    }

    /* renamed from: y */
    public final void mo60255y() {
    }

    /* renamed from: z */
    public final void mo60256z() {
    }

    /* renamed from: o */
    public final void mo60244o() {
        this.f78512g = false;
        mo60343l();
    }

    /* renamed from: p */
    public final void mo60246p() {
        VideoViewHolder.m70205a(this.f78506a);
    }

    /* renamed from: l */
    public void mo60343l() {
        C48039k a = C48039k.m104036a();
        C52711k.m112236a((Object) a, "LivePlayerManager.inst()");
        a.mo95302a(this.f78509d);
    }

    public void aw_() {
        C30018ai aiVar = this.f78509d;
        C48039k a = C48039k.m104036a();
        C52711k.m112236a((Object) a, "LivePlayerManager.inst()");
        if (C52711k.m112239a((Object) aiVar, (Object) a.f120721a)) {
            C48039k a2 = C48039k.m104036a();
            C52711k.m112236a((Object) a2, "LivePlayerManager.inst()");
            a2.mo95302a((C30018ai) null);
        }
    }

    /* renamed from: b */
    public void mo60224b(Aweme aweme) {
        this.f78512g = false;
    }

    /* renamed from: c */
    public void mo60227c(int i) {
        this.f78512g = false;
    }

    /* renamed from: f */
    public final void mo60236f(String str) {
        C52711k.m112240b(str, "enterMethodValue");
        this.f78510e = str;
    }

    /* renamed from: a */
    public void mo53995a(int i) {
        C47718bf.m103288a(new C30315ag(this.f78507b));
    }

    /* renamed from: a */
    public void mo53996a(Aweme aweme) {
        this.f78512g = false;
        this.f78507b = aweme;
        Aweme aweme2 = this.f78507b;
        if (aweme2 != null) {
            LiveRoomStruct newLiveRoomData = aweme2.getNewLiveRoomData();
            if (newLiveRoomData == null) {
                RoomFeedCellStruct roomFeedCellStruct = aweme2.getRoomFeedCellStruct();
                C52711k.m112236a((Object) roomFeedCellStruct, "it.roomFeedCellStruct");
                newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData();
            }
            this.f78508c = newLiveRoomData;
        }
        mo60342k();
    }

    public C30075c(View view, C30313ae<C30332aw> aeVar) {
        C52711k.m112240b(view, "view");
        this.f78513h = view;
        Context context = this.f78513h.getContext();
        C52711k.m112236a((Object) context, "view.context");
        this.f78506a = context;
    }
}
