package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.event.RoomStatusEvent;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarBorderView;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.model.C26121f;
import com.p683ss.android.ugc.aweme.commercialize.model.C26121f.C26122a;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.experiment.C30224d;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30256p;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.utils.C31208r;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.live.feedpage.C36083b;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.p */
public final class C31107p implements OnClickListener {

    /* renamed from: a */
    Aweme f81394a;

    /* renamed from: b */
    String f81395b;

    /* renamed from: c */
    JSONObject f81396c;

    /* renamed from: d */
    boolean f81397d;

    /* renamed from: e */
    int f81398e;

    /* renamed from: f */
    DataCenter f81399f;

    /* renamed from: g */
    Context f81400g;

    /* renamed from: h */
    User f81401h;

    /* renamed from: i */
    public SmartAvatarBorderView f81402i;

    /* renamed from: j */
    public AvatarImageWithLive f81403j;

    /* renamed from: k */
    public C25908e f81404k;

    /* renamed from: l */
    C30828c f81405l;

    /* renamed from: m */
    boolean f81406m;

    /* renamed from: n */
    private LiveCircleView f81407n;

    /* renamed from: o */
    private ImageView f81408o;

    /* renamed from: p */
    private RemoteImageView f81409p;

    /* renamed from: q */
    private int f81410q;

    /* renamed from: r */
    private ViewGroup f81411r;

    /* renamed from: s */
    private C1710e<C36083b> f81412s;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.p$a */
    static final class C31108a<T> implements C1710e<C36083b> {

        /* renamed from: a */
        final /* synthetic */ C31107p f81413a;

        /* renamed from: b */
        final /* synthetic */ C52727e f81414b;

        /* renamed from: c */
        final /* synthetic */ User f81415c;

        C31108a(C31107p pVar, C52727e eVar, User user) {
            this.f81413a = pVar;
            this.f81414b = eVar;
            this.f81415c = user;
        }

        public final /* synthetic */ void accept(Object obj) {
            C36083b bVar = (C36083b) obj;
            if (((Aweme) this.f81414b.element) != null) {
                Aweme aweme = (Aweme) this.f81414b.element;
                if (aweme == null) {
                    C52711k.m112234a();
                }
                if (aweme.getAuthor() != null) {
                    Aweme aweme2 = (Aweme) this.f81414b.element;
                    if (aweme2 == null) {
                        C52711k.m112234a();
                    }
                    if (TextUtils.equals(aweme2.getAuthorUid(), String.valueOf(bVar.f92446a))) {
                        this.f81415c.roomId = bVar.f92447b;
                        if (!C26235d.m63570a((Aweme) this.f81414b.element) && !this.f81415c.isLive()) {
                            C31107p pVar = this.f81413a;
                            Aweme aweme3 = (Aweme) this.f81414b.element;
                            if (aweme3 == null) {
                                C52711k.m112234a();
                            }
                            User author = aweme3.getAuthor();
                            C52711k.m112236a((Object) author, "aweme!!.author");
                            pVar.mo63889a(author);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.p$b */
    static final class C31109b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C31107p f81416a;

        /* renamed from: b */
        final /* synthetic */ HashMap f81417b;

        C31109b(C31107p pVar, HashMap hashMap) {
            this.f81416a = pVar;
            this.f81417b = hashMap;
        }

        public final void run() {
            SmartAvatarBorderView smartAvatarBorderView;
            boolean z;
            boolean z2;
            C31107p pVar = this.f81416a;
            HashMap hashMap = this.f81417b;
            AvatarImageWithLive avatarImageWithLive = pVar.f81403j;
            if (avatarImageWithLive != null) {
                smartAvatarBorderView = avatarImageWithLive.getAvatarImageView();
            } else {
                smartAvatarBorderView = null;
            }
            AvatarImageWithLive avatarImageWithLive2 = pVar.f81403j;
            boolean z3 = false;
            if (avatarImageWithLive2 == null || avatarImageWithLive2.getVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            pVar.mo63888a(smartAvatarBorderView, z);
            SmartAvatarBorderView smartAvatarBorderView2 = pVar.f81402i;
            SmartAvatarBorderView smartAvatarBorderView3 = pVar.f81402i;
            if (smartAvatarBorderView3 == null || smartAvatarBorderView3.getVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            pVar.mo63888a(smartAvatarBorderView2, z2);
            if (pVar.f81394a != null) {
                Aweme aweme = pVar.f81394a;
                if (aweme == null) {
                    C52711k.m112234a();
                }
                User author = aweme.getAuthor();
                if (author != null && C26121f.f68971d.mo53636a(author) && pVar.mo63892b(author)) {
                    z3 = true;
                }
                if (z3) {
                    C26122a aVar = C26121f.f68971d;
                    Aweme aweme2 = pVar.f81394a;
                    if (aweme2 == null) {
                        C52711k.m112234a();
                    }
                    aVar.mo53635a(aweme2.getAuthor(), "video");
                }
            }
            if (C26503d.m64064g(pVar.f81394a) && !C26469cc.m63997a(pVar.f81394a, 3)) {
                Aweme aweme3 = pVar.f81394a;
                if (aweme3 == null) {
                    C52711k.m112234a();
                }
                if (pVar.mo63892b(aweme3.getAuthor())) {
                    C25945k.m62911b().mo53137c(pVar.f81400g, pVar.f81394a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.p$c */
    static final class C31110c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C30828c f81418a;

        C31110c(C30828c cVar) {
            this.f81418a = cVar;
        }

        public final void run() {
            C30828c cVar = this.f81418a;
            if (cVar == null) {
                C52711k.m112234a();
            }
            cVar.mo63566c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.p$d */
    static final class C31111d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C30828c f81419a;

        C31111d(C30828c cVar) {
            this.f81419a = cVar;
        }

        public final void run() {
            C30828c cVar = this.f81419a;
            if (cVar == null) {
                C52711k.m112234a();
            }
            cVar.mo63567d();
        }
    }

    /* renamed from: b */
    private final String m72694b() {
        return C23325e.m57379a().getRequestId(this.f81394a, this.f81398e);
    }

    /* renamed from: a */
    public final void mo63887a() {
        if (this.f81406m) {
            this.f81406m = false;
            if (this.f81405l != null) {
                C30255o.f79039a.mo60617a(new C30256p(false, new C31111d(this.f81405l)));
            }
        }
    }

    /* renamed from: a */
    private final void m72692a(SmartAvatarBorderView smartAvatarBorderView) {
        mo63888a(smartAvatarBorderView, false);
    }

    /* renamed from: c */
    private final void m72695c(User user) {
        if (this.f81394a != null) {
            Aweme aweme = this.f81394a;
            if (aweme == null) {
                C52711k.m112234a();
            }
            if (aweme.getAuthor() != null && this.f81412s == null) {
                C52727e eVar = new C52727e();
                eVar.element = this.f81394a;
                this.f81412s = new C31108a(this, eVar, user);
            }
        }
    }

    /* renamed from: a */
    public final void mo63889a(User user) {
        HashMap hashMap = new HashMap();
        Aweme aweme = this.f81394a;
        hashMap.put("aweme_state", aweme);
        if (aweme == null) {
            C52711k.m112234a();
        }
        mo63891a(hashMap, aweme.getAuthor());
        mo63890a(user, hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo63892b(User user) {
        if (C26235d.m63570a(this.f81394a)) {
            if (!C31208r.m72886a(this.f81394a)) {
                return true;
            }
            return false;
        } else if (user == null || !user.isLive() || !C46635b.m101190a() || user.isBlock() || C47915gg.m103651b()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private final void m72691a(int i) {
        if (this.f81396c != null) {
            String str = "";
            try {
                JSONObject jSONObject = this.f81396c;
                if (jSONObject == null) {
                    C52711k.m112234a();
                }
                str = jSONObject.getString("request_id");
            } catch (JSONException unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                Aweme aweme = this.f81394a;
                if (aweme == null) {
                    C52711k.m112234a();
                }
                aweme.setRequestId(str);
            }
        }
        if (this.f81399f != null) {
            DataCenter dataCenter = this.f81399f;
            if (dataCenter == null) {
                C52711k.m112234a();
            }
            dataCenter.mo48228a("feed_internal_event", (Object) new C30332aw(19, this.f81394a));
        }
    }

    @C53771m
    public final void onLiveStatusEvent(RoomStatusEvent roomStatusEvent) {
        long j;
        C52711k.m112240b(roomStatusEvent, "event");
        Aweme aweme = this.f81394a;
        if (aweme == null) {
            C52711k.m112234a();
        }
        User author = aweme.getAuthor();
        if (author == null) {
            try {
                C52711k.m112234a();
            } catch (Throwable unused) {
                j = 0;
            }
        }
        String uid = author.getUid();
        C52711k.m112236a((Object) uid, "author!!.uid");
        j = Long.parseLong(uid);
        if (author != null && !(!C52711k.m112239a((Object) String.valueOf(roomStatusEvent.f8661b), (Object) author.getUid()))) {
            if (roomStatusEvent.f8662c) {
                if (author.roomId != 0) {
                    BusinessComponentServiceUtils.getLiveStateManager().mo74799a(j);
                    m72693a(false, 0, j);
                }
                author.roomId = 0;
            } else if (roomStatusEvent.f8660a != 0) {
                if (author.roomId == 0) {
                    BusinessComponentServiceUtils.getLiveStateManager().mo74799a(j);
                    m72693a(true, roomStatusEvent.f8660a, j);
                }
                author.roomId = roomStatusEvent.f8660a;
            }
            mo63889a(author);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C31107p(android.view.View r5) {
        /*
            r4 = this;
            java.lang.String r0 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            r4.<init>()
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103290c(r4)
            android.content.Context r0 = r5.getContext()
            r4.f81400g = r0
            r0 = 2132024372(0x7f141c34, float:1.9687218E38)
            android.view.View r0 = r5.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarBorderView) r0
            r4.f81402i = r0
            r0 = 2132024378(0x7f141c3a, float:1.968723E38)
            android.view.View r0 = r5.findViewById(r0)
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r0 = (com.p683ss.android.ugc.aweme.feed.p1736ui.AvatarImageWithLive) r0
            r4.f81403j = r0
            r0 = 2132024374(0x7f141c36, float:1.9687222E38)
            android.view.View r0 = r5.findViewById(r0)
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r0 = (com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView) r0
            r4.f81407n = r0
            r0 = 2132020041(0x7f140b49, float:1.9678434E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.f81408o = r0
            r0 = 2132017520(0x7f140170, float:1.967332E38)
            android.view.View r0 = r5.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r0
            r4.f81409p = r0
            r0 = 2132019173(0x7f1407e5, float:1.9676673E38)
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.f81411r = r0
            int r0 = com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment.m70953a()
            r1 = 5
            r2 = 0
            if (r0 != 0) goto L_0x0070
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x006e
            r0 = 2131886318(0x7f1200ee, float:1.9407211E38)
            float r5 = r5.getDimension(r0)
            int r5 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x009b
        L_0x006e:
            r5 = r2
            goto L_0x009b
        L_0x0070:
            int r0 = com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment.m70953a()
            if (r0 != r1) goto L_0x0089
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x006e
            r0 = 2131886315(0x7f1200eb, float:1.9407205E38)
            float r5 = r5.getDimension(r0)
            int r5 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x009b
        L_0x0089:
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x006e
            r0 = 2131886314(0x7f1200ea, float:1.9407203E38)
            float r5 = r5.getDimension(r0)
            int r5 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x009b:
            if (r5 == 0) goto L_0x00a2
            int r5 = r5.intValue()
            goto L_0x00a3
        L_0x00a2:
            r5 = 0
        L_0x00a3:
            r4.f81410q = r5
            int r5 = com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment.m70953a()
            if (r5 != r1) goto L_0x01a7
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r5 = r4.f81402i
            r0 = 1073741824(0x40000000, float:2.0)
            if (r5 == 0) goto L_0x00d7
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x00d7
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r1 = r4.f81402i
            if (r1 == 0) goto L_0x00d0
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x00d0
            int r1 = r1.width
            android.content.Context r3 = r4.f81400g
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r0)
            int r3 = (int) r3
            int r1 = r1 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00d1
        L_0x00d0:
            r1 = r2
        L_0x00d1:
            int r1 = r1.intValue()
            r5.width = r1
        L_0x00d7:
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r5 = r4.f81402i
            if (r5 == 0) goto L_0x0101
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x0101
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r1 = r4.f81402i
            if (r1 == 0) goto L_0x00fa
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x00fa
            int r1 = r1.height
            android.content.Context r3 = r4.f81400g
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r0)
            int r3 = (int) r3
            int r1 = r1 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00fb
        L_0x00fa:
            r1 = r2
        L_0x00fb:
            int r1 = r1.intValue()
            r5.height = r1
        L_0x0101:
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r5 = r4.f81403j
            if (r5 == 0) goto L_0x012b
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x012b
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r1 = r4.f81403j
            if (r1 == 0) goto L_0x0124
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x0124
            int r1 = r1.width
            android.content.Context r3 = r4.f81400g
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r0)
            int r3 = (int) r3
            int r1 = r1 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0125
        L_0x0124:
            r1 = r2
        L_0x0125:
            int r1 = r1.intValue()
            r5.width = r1
        L_0x012b:
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r5 = r4.f81403j
            if (r5 == 0) goto L_0x0155
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x0155
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r1 = r4.f81403j
            if (r1 == 0) goto L_0x014e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x014e
            int r1 = r1.height
            android.content.Context r3 = r4.f81400g
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r0)
            int r3 = (int) r3
            int r1 = r1 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x014f
        L_0x014e:
            r1 = r2
        L_0x014f:
            int r1 = r1.intValue()
            r5.height = r1
        L_0x0155:
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r5 = r4.f81407n
            if (r5 == 0) goto L_0x017f
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x017f
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r1 = r4.f81407n
            if (r1 == 0) goto L_0x0178
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x0178
            int r1 = r1.width
            android.content.Context r3 = r4.f81400g
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r0)
            int r3 = (int) r3
            int r1 = r1 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0179
        L_0x0178:
            r1 = r2
        L_0x0179:
            int r1 = r1.intValue()
            r5.width = r1
        L_0x017f:
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r5 = r4.f81407n
            if (r5 == 0) goto L_0x01a7
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x01a7
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r1 = r4.f81407n
            if (r1 == 0) goto L_0x01a1
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x01a1
            int r1 = r1.height
            android.content.Context r2 = r4.f81400g
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r2, r0)
            int r0 = (int) r0
            int r1 = r1 + r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L_0x01a1:
            int r0 = r2.intValue()
            r5.height = r0
        L_0x01a7:
            boolean r5 = com.p683ss.android.ugc.aweme.feed.experiment.HomeUIOptimizeAvatarRegion.m70948a()
            if (r5 == 0) goto L_0x01c3
            android.view.ViewGroup r5 = r4.f81411r
            if (r5 == 0) goto L_0x01c3
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.content.Context r1 = r4.f81400g
            r2 = 1109393408(0x42200000, float:40.0)
            float r1 = com.bytedance.common.utility.C9432q.m18687b(r1, r2)
            int r1 = (int) r1
            r0.width = r1
            r5.setLayoutParams(r0)
        L_0x01c3:
            com.bytedance.ies.dmt.ui.widget.b r5 = new com.bytedance.ies.dmt.ui.widget.b
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r0, r1)
            android.view.View$OnTouchListener r5 = (android.view.View.OnTouchListener) r5
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r0 = r4.f81402i
            if (r0 == 0) goto L_0x01d5
            r0.setOnTouchListener(r5)
        L_0x01d5:
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r0 = r4.f81403j
            if (r0 == 0) goto L_0x01dc
            r0.setOnTouchListener(r5)
        L_0x01dc:
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r5 = r4.f81402i
            if (r5 == 0) goto L_0x01e6
            r0 = r4
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r5.setOnClickListener(r0)
        L_0x01e6:
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r5 = r4.f81403j
            if (r5 == 0) goto L_0x01f0
            r0 = r4
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r5.setOnClickListener(r0)
        L_0x01f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C31107p.<init>(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (r1.isDelete() != false) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r21) {
        /*
            r20 = this;
            r0 = r20
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r21)
            if (r21 == 0) goto L_0x0025
            int r1 = r21.getId()
            r2 = 2132024378(0x7f141c3a, float:1.968723E38)
            if (r1 != r2) goto L_0x0025
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81394a
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64064g(r1)
            if (r1 == 0) goto L_0x0025
            com.ss.android.ugc.aweme.commercialize.feed.an r1 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r2 = r0.f81400g
            java.lang.String r3 = "draw_ad"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.f81394a
            r1.mo53124a(r2, r3, r4)
        L_0x0025:
            boolean r1 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r1 != 0) goto L_0x0247
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81394a
            boolean r1 = com.p683ss.android.ugc.aweme.login.utils.C36330a.m81964a(r1)
            if (r1 == 0) goto L_0x0035
            goto L_0x0247
        L_0x0035:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81394a
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64057a(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81394a
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81394a
            if (r2 != 0) goto L_0x0048
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0048:
            boolean r2 = r2.isAd()
            if (r2 == 0) goto L_0x0050
            r2 = 1
            goto L_0x0051
        L_0x0050:
            r2 = 0
        L_0x0051:
            if (r2 != 0) goto L_0x0057
            if (r1 == 0) goto L_0x0057
            r1 = 1
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            if (r1 == 0) goto L_0x0067
            android.content.Context r1 = r0.f81400g
            r2 = 2132541683(0x7f1c00f3, float:2.073645E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r1, r2)
            r1.mo19066a()
            goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            if (r3 != 0) goto L_0x0246
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81394a
            if (r1 == 0) goto L_0x00b0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81394a
            if (r1 != 0) goto L_0x0075
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0075:
            boolean r1 = r1.isCanPlay()
            if (r1 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81394a
            if (r1 != 0) goto L_0x0082
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0082:
            boolean r1 = r1.isDelete()
            if (r1 == 0) goto L_0x00b0
        L_0x0088:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81394a
            if (r1 != 0) goto L_0x008f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x008f:
            boolean r1 = r1.isImage()
            if (r1 == 0) goto L_0x00a3
            android.content.Context r1 = r0.f81400g
            r2 = 2132545667(0x7f1c1083, float:2.074453E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r1, r2)
            r1.mo19066a()
            goto L_0x0246
        L_0x00a3:
            android.content.Context r1 = r0.f81400g
            r2 = 2132551886(0x7f1c28ce, float:2.0757144E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r1, r2)
            r1.mo19066a()
            return
        L_0x00b0:
            com.ss.android.ugc.aweme.commercialize.feed.e r1 = r0.f81404k
            if (r1 == 0) goto L_0x00b7
            r1.mo53255k()
        L_0x00b7:
            com.ss.android.ugc.aweme.aq.s r1 = new com.ss.android.ugc.aweme.aq.s
            r1.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81394a
            int r3 = r0.f81398e
            com.ss.android.ugc.aweme.aq.s r1 = r1.mo48136c(r2, r3)
            java.lang.String r2 = r0.f81395b
            if (r2 != 0) goto L_0x00ca
            java.lang.String r2 = ""
        L_0x00ca:
            com.ss.android.ugc.aweme.aq.s r1 = r1.mo48137c(r2)
            android.content.Context r2 = r0.f81400g
            com.ss.android.ugc.aweme.aq.a r1 = r1.mo47940a(r2)
            com.ss.android.ugc.aweme.aq.s r1 = (com.p683ss.android.ugc.aweme.p1382aq.C23249s) r1
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r0.f81399f
            r3 = 0
            if (r2 == 0) goto L_0x00e6
            java.lang.String r4 = "playlist_type"
            java.lang.String r5 = ""
            java.lang.Object r2 = r2.mo48230b(r4, r5)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00e7
        L_0x00e6:
            r2 = r3
        L_0x00e7:
            com.ss.android.ugc.aweme.aq.s r1 = r1.mo48138d(r2)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r0.f81399f
            if (r2 == 0) goto L_0x00fa
            java.lang.String r4 = "playlist_id"
            java.lang.String r5 = ""
            java.lang.Object r2 = r2.mo48230b(r4, r5)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00fb
        L_0x00fa:
            r2 = r3
        L_0x00fb:
            com.ss.android.ugc.aweme.aq.s r1 = r1.mo48141f(r2)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r0.f81399f
            if (r2 == 0) goto L_0x010e
            java.lang.String r4 = "playlist_id_key"
            java.lang.String r5 = ""
            java.lang.Object r2 = r2.mo48230b(r4, r5)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x010f
        L_0x010e:
            r2 = r3
        L_0x010f:
            com.ss.android.ugc.aweme.aq.s r1 = r1.mo48140e(r2)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r0.f81399f
            if (r2 == 0) goto L_0x0122
            java.lang.String r3 = "tab_name"
            java.lang.String r4 = ""
            java.lang.Object r2 = r2.mo48230b(r3, r4)
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
        L_0x0122:
            com.ss.android.ugc.aweme.aq.k r1 = r1.mo48100j(r3)
            com.ss.android.ugc.aweme.aq.s r1 = (com.p683ss.android.ugc.aweme.p1382aq.C23249s) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81394a
            int r3 = r0.f81398e
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56854b(r2, r3)
            com.ss.android.ugc.aweme.aq.k r1 = r1.mo48101k(r2)
            com.ss.android.ugc.aweme.aq.s r1 = (com.p683ss.android.ugc.aweme.p1382aq.C23249s) r1
            java.lang.String r2 = "click_head"
            com.ss.android.ugc.aweme.aq.a r1 = r1.mo47941a(r2)
            com.ss.android.ugc.aweme.aq.s r1 = (com.p683ss.android.ugc.aweme.p1382aq.C23249s) r1
            r1.mo48076e()
            com.ss.android.ugc.aweme.feed.ad r1 = com.p683ss.android.ugc.aweme.feed.C29988ad.PROFILE
            com.p683ss.android.ugc.aweme.feed.C30578o.m71566a(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81394a
            if (r1 == 0) goto L_0x0246
            r1 = 19
            r0.m72691a(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81394a
            if (r2 != 0) goto L_0x0156
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0156:
            com.ss.android.ugc.aweme.profile.model.User r5 = r2.getAuthor()
            boolean r2 = r0.mo63892b(r5)
            if (r2 == 0) goto L_0x0226
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81394a
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63571b(r2)
            if (r2 == 0) goto L_0x0178
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81394a
            boolean r2 = com.p683ss.android.ugc.aweme.feed.utils.C31208r.m72886a(r2)
            if (r2 != 0) goto L_0x0178
            android.content.Context r1 = r0.f81400g
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81394a
            com.p683ss.android.ugc.aweme.feed.utils.C31208r.m72878a(r1, r2)
            return
        L_0x0178:
            java.lang.String r2 = r0.f81395b
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r3 = "homepage_hot"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x01a7
            android.content.Context r6 = r0.f81400g
            r7 = 1
            java.lang.String r8 = r20.m72694b()
            java.lang.String r2 = "author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r2)
            java.lang.String r9 = r5.getUid()
            long r10 = r5.roomId
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81394a
            if (r2 != 0) goto L_0x019f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x019f:
            java.lang.String r12 = r2.getAid()
            com.p683ss.android.ugc.aweme.story.live.C46641d.m101225d(r6, r7, r8, r9, r10, r12)
            goto L_0x01f5
        L_0x01a7:
            java.lang.String r2 = r0.f81395b
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r3 = "homepage_follow"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x01d6
            android.content.Context r6 = r0.f81400g
            r7 = 1
            java.lang.String r8 = r20.m72694b()
            java.lang.String r2 = "author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r2)
            java.lang.String r9 = r5.getUid()
            long r10 = r5.roomId
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81394a
            if (r2 != 0) goto L_0x01ce
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01ce:
            java.lang.String r12 = r2.getAid()
            com.p683ss.android.ugc.aweme.story.live.C46641d.m101224c(r6, r7, r8, r9, r10, r12)
            goto L_0x01f5
        L_0x01d6:
            android.content.Context r13 = r0.f81400g
            r14 = 1
            java.lang.String r2 = r0.f81395b
            boolean r3 = r0.f81397d
            java.lang.String r15 = com.p683ss.android.ugc.aweme.feed.helper.C30366f.m71280a(r2, r3)
            java.lang.String r16 = r20.m72694b()
            java.lang.String r2 = "author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r2)
            java.lang.String r17 = r5.getUid()
            long r2 = r5.roomId
            r18 = r2
            com.p683ss.android.ugc.aweme.story.live.C46641d.m101208a(r13, r14, r15, r16, r17, r18)
        L_0x01f5:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r2 = "live.intent.extra.ENTER_AWEME_ID"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f81394a
            if (r3 != 0) goto L_0x0203
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0203:
            java.lang.String r3 = r3.getAid()
            r8.putString(r2, r3)
            com.ss.android.ugc.aweme.live.ILiveOuterService r2 = com.p683ss.android.ugc.aweme.live.C36173w.m81665a()
            java.lang.String r3 = "ServiceManager.get().get…OuterService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.live.ILiveOuterService r2 = (com.p683ss.android.ugc.aweme.live.ILiveOuterService) r2
            com.ss.android.ugc.aweme.i.c r3 = r2.getLiveWatcherUtils()
            android.content.Context r4 = r0.f81400g
            java.lang.String r6 = r0.f81395b
            java.lang.String r7 = "video_head"
            r3.mo70095a(r4, r5, r6, r7, r8)
            r0.m72691a(r1)
            return
        L_0x0226:
            java.lang.String r1 = ""
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r0.f81399f
            if (r2 == 0) goto L_0x0237
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r0.f81399f
            if (r2 == 0) goto L_0x0236
            java.lang.String r3 = "to_profile"
            r2.mo48228a(r3, r1)
            goto L_0x0246
        L_0x0236:
            return
        L_0x0237:
            com.ss.android.ugc.aweme.feed.i.a r1 = new com.ss.android.ugc.aweme.feed.i.a
            java.lang.String r2 = "dataCenter is null! can't go!"
            r1.<init>(r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r1)
            com.bytedance.p502b.p503a.p506b.p508b.C9220a.m18311a(r1)
        L_0x0246:
            return
        L_0x0247:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C31107p.onClick(android.view.View):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo63888a(SmartAvatarBorderView smartAvatarBorderView, boolean z) {
        String str;
        if (C26469cc.m63998a(this.f81394a, (SmartImageView) smartAvatarBorderView)) {
            if (z) {
                C25945k.m62923n().mo54135a(C26469cc.m64003d(this.f81394a));
            }
            return;
        }
        StringBuilder sb = new StringBuilder("FeedAvatarView_");
        if (this.f81394a == null) {
            str = "no_aid";
        } else {
            Aweme aweme = this.f81394a;
            if (aweme == null) {
                C52711k.m112234a();
            }
            str = aweme.getAid();
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (this.f81394a != null) {
            Aweme aweme2 = this.f81394a;
            if (aweme2 == null) {
                C52711k.m112234a();
            }
            if (aweme2.getAuthor() != null) {
                Aweme aweme3 = this.f81394a;
                if (aweme3 == null) {
                    C52711k.m112234a();
                }
                User author = aweme3.getAuthor();
                C52711k.m112236a((Object) author, "mAweme!!.author");
                if (author.getAvatarThumb() != null) {
                    Aweme aweme4 = this.f81394a;
                    if (aweme4 == null) {
                        C52711k.m112234a();
                    }
                    User author2 = aweme4.getAuthor();
                    C52711k.m112236a((Object) author2, "mAweme!!.author");
                    UrlModel avatarThumb = author2.getAvatarThumb();
                    C52711k.m112236a((Object) avatarThumb, "mAweme!!.author.avatarThumb");
                    if (!C9376b.m18558a((Collection<T>) avatarThumb.getUrlList())) {
                        if (smartAvatarBorderView == this.f81402i && C30224d.m70966a()) {
                            String str2 = "FeedAvatarView";
                            StringBuilder sb3 = new StringBuilder("loadAvatarViews:");
                            Aweme aweme5 = this.f81394a;
                            if (aweme5 == null) {
                                C52711k.m112234a();
                            }
                            User author3 = aweme5.getAuthor();
                            C52711k.m112236a((Object) author3, "mAweme!!.author");
                            UrlModel avatarThumb2 = author3.getAvatarThumb();
                            C52711k.m112236a((Object) avatarThumb2, "mAweme!!.author.avatarThumb");
                            sb3.append(avatarThumb2.getUrlList());
                            C32458a.m75141a(4, str2, sb3.toString());
                        }
                        if (smartAvatarBorderView != null) {
                            Aweme aweme6 = this.f81394a;
                            if (aweme6 == null) {
                                C52711k.m112234a();
                            }
                            User author4 = aweme6.getAuthor();
                            C52711k.m112236a((Object) author4, "mAweme!!.author");
                            smartAvatarBorderView.mo49062a(author4.getAvatarThumb(), C47788ct.m103417a(BaseNotice.HASHTAG), this.f81410q, this.f81410q, sb2, true);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        C12203q.m24642a(2131953301).mo23127c(true).mo23118a(sb2).mo23116a((C12197k) smartAvatarBorderView).mo23121a();
    }

    /* renamed from: a */
    public final void mo63890a(User user, HashMap<String, Object> hashMap) {
        int i;
        int i2;
        C52711k.m112240b(hashMap, "state");
        Object obj = hashMap.get("aweme_state");
        if (obj != null) {
            Aweme aweme = (Aweme) obj;
            Object obj2 = hashMap.get("check_vast_ad_state");
            if (obj2 != null) {
                if (((Boolean) obj2).booleanValue()) {
                    ImageView imageView = this.f81408o;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                } else {
                    ImageView imageView2 = this.f81408o;
                    if (imageView2 != null) {
                        if (C26503d.m64062e(aweme)) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        imageView2.setVisibility(i2);
                    }
                }
                Object obj3 = hashMap.get("show_live_state");
                if (obj3 != null) {
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    if (user != null) {
                        Object obj4 = hashMap.get("check_vast_ad_state");
                        if (obj4 == null) {
                            throw new C52857u("null cannot be cast to non-null type kotlin.Boolean");
                        } else if (!((Boolean) obj4).booleanValue()) {
                            DataCenter dataCenter = this.f81399f;
                            if (dataCenter != null) {
                                dataCenter.mo48228a("bind_follow_view", (Object) Integer.valueOf(user.getFollowStatus()));
                            }
                            LiveCircleView liveCircleView = this.f81407n;
                            if (liveCircleView == null) {
                                C52711k.m112234a();
                            }
                            if (user.isLive()) {
                                i = 0;
                            } else {
                                i = 8;
                            }
                            liveCircleView.setVisibility(i);
                            if (!(aweme == null || aweme.getAuthor() == null)) {
                                C30828c cVar = this.f81405l;
                                if (cVar == null) {
                                    C52711k.m112234a();
                                }
                                cVar.mo63564a(user, getClass(), this.f81412s, aweme, C31208r.m72886a(aweme));
                            }
                            if (booleanValue) {
                                AvatarImageWithLive avatarImageWithLive = this.f81403j;
                                if (avatarImageWithLive != null) {
                                    avatarImageWithLive.setBorderColor(R.color.arz);
                                }
                                AvatarImageWithLive avatarImageWithLive2 = this.f81403j;
                                if (avatarImageWithLive2 == null) {
                                    C52711k.m112234a();
                                }
                                m72692a(avatarImageWithLive2.getAvatarImageView());
                                AvatarImageWithLive avatarImageWithLive3 = this.f81403j;
                                if (avatarImageWithLive3 != null) {
                                    avatarImageWithLive3.mo63283a(true);
                                }
                            } else {
                                SmartAvatarBorderView smartAvatarBorderView = this.f81402i;
                                if (smartAvatarBorderView != null) {
                                    smartAvatarBorderView.setBorderColor(R.color.bs);
                                }
                                SmartAvatarBorderView smartAvatarBorderView2 = this.f81402i;
                                if (smartAvatarBorderView2 == null) {
                                    C52711k.m112234a();
                                }
                                m72692a(smartAvatarBorderView2);
                                AvatarImageWithLive avatarImageWithLive4 = this.f81403j;
                                if (avatarImageWithLive4 != null) {
                                    avatarImageWithLive4.mo63283a(false);
                                }
                            }
                            if (this.f81409p != null) {
                                if (booleanValue || !C26121f.f68971d.mo53636a(user)) {
                                    RemoteImageView remoteImageView = this.f81409p;
                                    if (remoteImageView != null) {
                                        remoteImageView.setVisibility(8);
                                    } else {
                                        return;
                                    }
                                } else {
                                    RemoteImageView remoteImageView2 = this.f81409p;
                                    if (remoteImageView2 != null) {
                                        remoteImageView2.setVisibility(0);
                                    }
                                    C26121f.f68971d.mo53634a(user, this.f81409p);
                                    C26121f.f68971d.mo53635a(user, C22858c.f61207c);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    if (this.f81403j != null) {
                        AvatarImageWithLive avatarImageWithLive5 = this.f81403j;
                        if (avatarImageWithLive5 != null) {
                            avatarImageWithLive5.setVisibility(4);
                        }
                        AvatarImageWithLive avatarImageWithLive6 = this.f81403j;
                        if (avatarImageWithLive6 != null) {
                            avatarImageWithLive6.mo63283a(false);
                        }
                    }
                    SmartAvatarBorderView smartAvatarBorderView3 = this.f81402i;
                    if (smartAvatarBorderView3 != null) {
                        smartAvatarBorderView3.setVisibility(0);
                    }
                    SmartAvatarBorderView smartAvatarBorderView4 = this.f81402i;
                    if (smartAvatarBorderView4 != null) {
                        smartAvatarBorderView4.setBorderColor(R.color.bs);
                    }
                    m72692a(this.f81402i);
                    RemoteImageView remoteImageView3 = this.f81409p;
                    if (remoteImageView3 != null) {
                        remoteImageView3.setVisibility(8);
                        return;
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Boolean");
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Boolean");
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    /* renamed from: a */
    public final void mo63891a(HashMap<String, Object> hashMap, User user) {
        C52711k.m112240b(hashMap, "state");
        Map map = hashMap;
        map.put("check_vast_ad_state", Boolean.valueOf(C26469cc.m63997a(this.f81394a, 3)));
        map.put("show_live_state", Boolean.valueOf(mo63892b(user)));
        if (user != null) {
            if (C20854a.m53167g().isMe(user.getUid())) {
                IAccountUserService g = C20854a.m53167g();
                C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                user.roomId = g.getCurUser().roomId;
            }
            if (this.f81405l == null) {
                C30828c cVar = new C30828c(user.isLive(), this.f81403j, this.f81402i, this.f81407n, false);
                this.f81405l = cVar;
            }
            m72695c(user);
        }
    }

    /* renamed from: a */
    private static void m72693a(boolean z, long j, long j2) {
        String str;
        String str2 = "livesdk_live_status_change";
        C23089d a = C23089d.m56640a().mo47829a("action_type", "click").mo47829a("anchor_id", String.valueOf(j2)).mo47829a("room_id", String.valueOf(j)).mo47829a("enter_from_merge", "homepage_hot").mo47829a("enter_method", "video_head");
        String str3 = "status";
        if (z) {
            str = "live_on";
        } else {
            str = "live_off";
        }
        C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
    }
}
