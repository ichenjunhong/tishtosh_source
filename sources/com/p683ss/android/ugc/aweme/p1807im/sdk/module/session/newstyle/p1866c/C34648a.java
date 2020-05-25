package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1866c;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.main.service.IUnReadVideoService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34550g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.SessionListUserActiveViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.SessionListUserActiveViewModel.C34558a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1864a.C34643d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend.C34652b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend.C34654d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend.C34655e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend.C34659f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1863b.C34601a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.unread.UnReadVideoSessionViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.unread.UnReadVideoSessionViewModel.C34672a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34028i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35424c;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.unread.C47496d;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.c.a */
public final class C34648a implements C34601a<C35456b>, C34652b, C35424c<User> {

    /* renamed from: f */
    public static final C34649a f89255f = new C34649a(null);

    /* renamed from: a */
    public boolean f89256a = true;

    /* renamed from: b */
    public boolean f89257b;

    /* renamed from: c */
    public String f89258c = "";

    /* renamed from: d */
    public final C34659f f89259d = new C34659f();

    /* renamed from: e */
    public final C34643d f89260e;

    /* renamed from: h */
    private boolean f89261h = true;

    /* renamed from: i */
    private final IUnReadVideoService f89262i;

    /* renamed from: j */
    private UnReadVideoSessionViewModel f89263j;

    /* renamed from: k */
    private SessionListUserActiveViewModel f89264k;

    /* renamed from: l */
    private final DmtStatusView f89265l;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.c.a$a */
    public static final class C34649a {
        private C34649a() {
        }

        public /* synthetic */ C34649a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo72701a() {
        this.f89260e.am_();
    }

    /* renamed from: b */
    public final void mo72706b() {
        this.f89260e.am_();
    }

    /* renamed from: c */
    public final void mo72709c() {
        if (this.f89260e.mo72698j() || !this.f89260e.mo72699k()) {
            this.f89260e.mo54798c(false);
            this.f89260e.an_();
            return;
        }
        this.f89260e.mo54798c(true);
        this.f89260e.an_();
    }

    /* renamed from: a */
    public final void mo72704a(Exception exc) {
        mo72709c();
    }

    /* renamed from: b */
    public final void mo72708b(Exception exc) {
        mo72709c();
    }

    /* renamed from: a */
    public final void mo72705a(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f89258c = str;
    }

    @C53771m
    public final void onEvent(C34550g gVar) {
        C52711k.m112240b(gVar, "event");
        C34032k.m77795a().mo71989f();
    }

    /* renamed from: a */
    public final void mo72703a(C34654d dVar) {
        if (dVar != null) {
            C34643d dVar2 = this.f89260e;
            List<User> a = dVar.mo72718a();
            C52711k.m112236a((Object) a, "this.userList");
            C52711k.m112240b(a, "<set-?>");
            dVar2.f89243a = a;
            this.f89260e.mo72700l();
            if (dVar.f89271d) {
                this.f89260e.ao_();
            } else {
                mo72709c();
            }
        }
    }

    /* renamed from: b */
    public final void mo72707b(C34654d dVar) {
        if (dVar != null) {
            List<User> list = this.f89260e.f89243a;
            List a = dVar.mo72718a();
            C52711k.m112236a((Object) a, "this.userList");
            list.addAll(a);
            this.f89260e.mo72700l();
            if (dVar.f89271d) {
                this.f89260e.ao_();
            } else {
                mo72709c();
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onUnReadVideoChanged(C47496d dVar) {
        C52711k.m112240b(dVar, "event");
        if (this.f89262i.checkEnableExperiment(4)) {
            UnReadVideoSessionViewModel unReadVideoSessionViewModel = this.f89263j;
            if (unReadVideoSessionViewModel != null) {
                String str = dVar.f119793a;
                int i = dVar.f119794b;
                Map<String, Integer> map = unReadVideoSessionViewModel.f89330a;
                if (str == null) {
                    C52711k.m112234a();
                }
                map.put(str, Integer.valueOf(i));
            }
            this.f89260e.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo72620a(List<C35456b> list) {
        List<C35456b> list2;
        C34643d dVar = this.f89260e;
        if (list == null) {
            list2 = new ArrayList<>();
        } else {
            list2 = list;
        }
        C52711k.m112240b(list2, "<set-?>");
        dVar.f89244b = list2;
        this.f89260e.mo72700l();
        if (!C35279p.m79763a()) {
            this.f89265l.mo19209d();
            this.f89265l.setVisibility(8);
            if (this.f89260e.mo72699k()) {
                this.f89260e.mo54798c(true);
            }
        } else if (this.f89260e.mo72698j()) {
            this.f89265l.mo19209d();
            this.f89265l.setVisibility(0);
            this.f89265l.mo19213g();
        } else {
            this.f89265l.mo19209d();
            this.f89265l.setVisibility(8);
        }
        if (this.f89261h) {
            this.f89261h = false;
            C34028i.m77787a(list);
        }
    }

    public C34648a(C34643d dVar, DmtStatusView dmtStatusView) {
        IUnReadVideoService iUnReadVideoService;
        C52711k.m112240b(dVar, "mSessionListAdapter");
        C52711k.m112240b(dmtStatusView, "mStatusView");
        this.f89260e = dVar;
        this.f89265l = dmtStatusView;
        if (!C53755c.m114319a().mo112958b((Object) this)) {
            C53755c.m114319a().mo112955a((Object) this);
        }
        this.f89265l.mo19212f();
        this.f89259d.mo54799a(new C34655e());
        this.f89259d.mo54800a(this);
        this.f89260e.f89245c = this;
        Object a = C27991b.m66756a(IUnReadVideoService.class);
        if (a != null) {
            iUnReadVideoService = (IUnReadVideoService) a;
        } else {
            iUnReadVideoService = (IUnReadVideoService) C20302a.m50070a(IUnReadVideoService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
        }
        C52711k.m112236a((Object) iUnReadVideoService, "ServiceManager.get().get…VideoService::class.java)");
        this.f89262i = iUnReadVideoService;
        if (this.f89265l.getContext() instanceof FragmentActivity) {
            Context context = this.f89265l.getContext();
            if (context != null) {
                this.f89263j = C34672a.m78655a((FragmentActivity) context);
                Context context2 = this.f89265l.getContext();
                if (context2 != null) {
                    this.f89264k = C34558a.m78500a((FragmentActivity) context2);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 == null) goto L_0x0016;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m78608a(com.p683ss.android.ugc.aweme.profile.model.User r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.f r0 = r4.f89259d
            com.ss.android.ugc.aweme.common.a r0 = r0.mo54803n()
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.e r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend.C34655e) r0
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.d r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend.C34654d) r0
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r0.f89269b
            if (r0 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r0 = ""
        L_0x0018:
            java.lang.String r1 = "follow_card"
            com.ss.android.ugc.aweme.app.f.d r2 = new com.ss.android.ugc.aweme.app.f.d
            r2.<init>()
            java.lang.String r3 = "req_id"
            com.ss.android.ugc.aweme.app.f.d r0 = r2.mo47829a(r3, r0)
            java.lang.String r2 = "event_type"
            com.ss.android.ugc.aweme.app.f.d r7 = r0.mo47829a(r2, r7)
            java.lang.String r0 = "enter_from"
            java.lang.String r2 = "message"
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r0, r2)
            java.lang.String r0 = "previous_page"
            java.lang.String r2 = r4.f89258c
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r0, r2)
            java.lang.String r0 = "rec_reason"
            java.lang.String r2 = r5.getRecommendReason()
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r0, r2)
            java.lang.String r0 = "rec_uid"
            java.lang.String r5 = r5.getUid()
            com.ss.android.ugc.aweme.app.f.d r5 = r7.mo47829a(r0, r5)
            java.lang.String r7 = "impr_order"
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47826a(r7, r6)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1866c.C34648a.m78608a(com.ss.android.ugc.aweme.profile.model.User, int, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b0, code lost:
        if (r1 == null) goto L_0x00b2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo72702a(int r3, java.lang.Object r4, int r5, android.view.View r6, java.lang.String r7) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.profile.model.User r4 = (com.p683ss.android.ugc.aweme.profile.model.User) r4
            java.lang.String r0 = "user"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.String r0 = "enterMethod"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            r7 = 2132546921(0x7f1c1569, float:2.0747074E38)
            r0 = 1
            switch(r3) {
                case 100: goto L_0x00f0;
                case 101: goto L_0x005e;
                case 102: goto L_0x0020;
                case 103: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0164
        L_0x001a:
            java.lang.String r3 = "impression"
            r2.m78608a(r4, r5, r3)
            return
        L_0x0020:
            android.content.Context r3 = r6.getContext()
            java.lang.String r6 = "view.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
            android.content.Context r6 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            boolean r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1866c.C34650b.m78619a(r6)
            if (r6 != 0) goto L_0x003f
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            com.bytedance.ies.dmt.ui.d.a r3 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r3, r7)
            r3.mo19066a()
            return
        L_0x003f:
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.a.d r6 = r2.f89260e
            r6.mo72695a(r4)
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.f r6 = r2.f89259d
            r6.mo72722a(r4)
            boolean r6 = r4 instanceof com.p683ss.android.ugc.aweme.friends.model.RecommendContact
            if (r6 != 0) goto L_0x0164
            r6 = 2132542438(0x7f1c03e6, float:2.073798E38)
            com.bytedance.ies.dmt.ui.d.a r3 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r3, r6)
            r3.mo19066a()
            java.lang.String r3 = "delete"
            r2.m78608a(r4, r5, r3)
            goto L_0x0164
        L_0x005e:
            com.ss.android.ugc.aweme.router.w r3 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "aweme://user/profile/"
            r6.<init>(r7)
            java.lang.String r7 = r4.getUid()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.ss.android.ugc.aweme.router.y r6 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r6)
            java.lang.String r7 = "sec_user_id"
            java.lang.String r1 = r4.getSecUid()
            com.ss.android.ugc.aweme.router.y r6 = r6.mo83870a(r7, r1)
            java.lang.String r7 = "previous_page_position"
            java.lang.String r1 = "other_places"
            com.ss.android.ugc.aweme.router.y r6 = r6.mo83870a(r7, r1)
            java.lang.String r7 = "previous_page"
            java.lang.String r1 = "message"
            com.ss.android.ugc.aweme.router.y r6 = r6.mo83870a(r7, r1)
            java.lang.String r7 = "enter_from"
            java.lang.String r1 = "message"
            com.ss.android.ugc.aweme.router.y r6 = r6.mo83870a(r7, r1)
            java.lang.String r7 = "enter_from_request_id"
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.f r1 = r2.f89259d
            com.ss.android.ugc.aweme.common.a r1 = r1.mo54803n()
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.e r1 = (com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend.C34655e) r1
            if (r1 == 0) goto L_0x00b2
            java.lang.Object r1 = r1.getData()
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.d r1 = (com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend.C34654d) r1
            if (r1 == 0) goto L_0x00b2
            java.lang.String r1 = r1.f89269b
            if (r1 != 0) goto L_0x00b4
        L_0x00b2:
            java.lang.String r1 = ""
        L_0x00b4:
            com.ss.android.ugc.aweme.router.y r6 = r6.mo83870a(r7, r1)
            java.lang.String r7 = "recommend_from_type"
            java.lang.String r1 = "list"
            com.ss.android.ugc.aweme.router.y r6 = r6.mo83870a(r7, r1)
            java.lang.String r7 = "from_recommend_card"
            com.ss.android.ugc.aweme.router.y r6 = r6.mo83868a(r7, r0)
            java.lang.String r6 = r6.mo83871a()
            r3.mo83861a(r6)
            java.lang.String r3 = "enter_profile"
            r2.m78608a(r4, r5, r3)
            java.lang.String r3 = "enter_personal_detail"
            com.ss.android.ugc.aweme.app.f.d r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r6 = "enter_from"
            java.lang.String r7 = "message"
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "to_user_id"
            java.lang.String r4 = r4.getUid()
            com.ss.android.ugc.aweme.app.f.d r4 = r5.mo47829a(r6, r4)
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r4)
            return
        L_0x00f0:
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            boolean r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1866c.C34650b.m78619a(r3)
            if (r3 != 0) goto L_0x0106
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            com.bytedance.ies.dmt.ui.d.a r3 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r3, r7)
            r3.mo19066a()
            goto L_0x0164
        L_0x0106:
            int r3 = r4.getFollowStatus()
            if (r3 == 0) goto L_0x010e
            r3 = 1
            goto L_0x010f
        L_0x010e:
            r3 = 0
        L_0x010f:
            r3 = r3 ^ r0
            if (r3 != r0) goto L_0x013e
            java.lang.String r3 = "follow"
            r2.m78608a(r4, r5, r3)
            java.lang.String r3 = "follow"
            com.ss.android.ugc.aweme.app.f.d r5 = new com.ss.android.ugc.aweme.app.f.d
            r5.<init>()
            java.lang.String r6 = "enter_from"
            java.lang.String r7 = "message"
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "previous_page"
            java.lang.String r7 = r2.f89258c
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "to_user_id"
            java.lang.String r4 = r4.getUid()
            com.ss.android.ugc.aweme.app.f.d r4 = r5.mo47829a(r6, r4)
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r4)
            goto L_0x0161
        L_0x013e:
            java.lang.String r3 = "follow_cancel"
            r2.m78608a(r4, r5, r3)
            java.lang.String r3 = "follow_cancel"
            com.ss.android.ugc.aweme.app.f.d r5 = new com.ss.android.ugc.aweme.app.f.d
            r5.<init>()
            java.lang.String r6 = "enter_from"
            java.lang.String r7 = "message"
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "to_user_id"
            java.lang.String r4 = r4.getUid()
            com.ss.android.ugc.aweme.app.f.d r4 = r5.mo47829a(r6, r4)
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r4)
        L_0x0161:
            r2.f89257b = r0
            return
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1866c.C34648a.mo72702a(int, java.lang.Object, int, android.view.View, java.lang.String):void");
    }
}
