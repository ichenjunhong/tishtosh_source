package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0199s;
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
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarBorderView;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.model.C26121f;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.experiment.C30224d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.utils.C31208r;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.live.feedpage.C36083b;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.q */
public final class C31112q implements C0199s<C23274a>, OnClickListener {

    /* renamed from: a */
    public Aweme f81420a;

    /* renamed from: b */
    public SmartAvatarBorderView f81421b;

    /* renamed from: c */
    public AvatarImageWithLive f81422c;

    /* renamed from: d */
    public C25908e f81423d;

    /* renamed from: e */
    private String f81424e;

    /* renamed from: f */
    private JSONObject f81425f;

    /* renamed from: g */
    private boolean f81426g;

    /* renamed from: h */
    private int f81427h;

    /* renamed from: i */
    private DataCenter f81428i;

    /* renamed from: j */
    private Context f81429j;

    /* renamed from: k */
    private LiveCircleView f81430k;

    /* renamed from: l */
    private ImageView f81431l;

    /* renamed from: m */
    private RemoteImageView f81432m;

    /* renamed from: n */
    private int f81433n;

    /* renamed from: o */
    private C30828c f81434o;

    /* renamed from: p */
    private ViewGroup f81435p;

    /* renamed from: q */
    private C1710e<C36083b> f81436q;

    /* renamed from: r */
    private boolean f81437r;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.q$a */
    static final class C31113a<T> implements C1710e<C36083b> {

        /* renamed from: a */
        final /* synthetic */ C31112q f81438a;

        /* renamed from: b */
        final /* synthetic */ User f81439b;

        C31113a(C31112q qVar, User user) {
            this.f81438a = qVar;
            this.f81439b = user;
        }

        public final /* synthetic */ void accept(Object obj) {
            C36083b bVar = (C36083b) obj;
            if (this.f81438a.f81420a != null) {
                Aweme aweme = this.f81438a.f81420a;
                if (aweme == null) {
                    C52711k.m112234a();
                }
                if (aweme.getAuthor() != null) {
                    Aweme aweme2 = this.f81438a.f81420a;
                    if (aweme2 == null) {
                        C52711k.m112234a();
                    }
                    if (TextUtils.equals(aweme2.getAuthorUid(), String.valueOf(bVar.f92446a))) {
                        this.f81439b.roomId = bVar.f92447b;
                        if (!C26235d.m63570a(this.f81438a.f81420a) && !this.f81439b.isLive()) {
                            C31112q qVar = this.f81438a;
                            Aweme aweme3 = this.f81438a.f81420a;
                            if (aweme3 == null) {
                                C52711k.m112234a();
                            }
                            qVar.mo63901a(aweme3.getAuthor());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63898a() {
        C47718bf.m103291d(this);
    }

    /* renamed from: b */
    public final void mo63902b() {
        m72709d();
    }

    /* renamed from: c */
    private final String m72707c() {
        return C23325e.m57379a().getRequestId(this.f81420a, this.f81427h);
    }

    /* renamed from: d */
    private void m72709d() {
        if (this.f81437r) {
            this.f81437r = false;
            if (this.f81434o != null) {
                C30828c cVar = this.f81434o;
                if (cVar == null) {
                    C52711k.m112234a();
                }
                cVar.mo63567d();
            }
        }
    }

    /* renamed from: a */
    private final void m72703a(SmartAvatarBorderView smartAvatarBorderView) {
        m72704a(smartAvatarBorderView, false);
    }

    /* renamed from: b */
    private final void m72706b(User user) {
        if (this.f81420a != null) {
            Aweme aweme = this.f81420a;
            if (aweme == null) {
                C52711k.m112234a();
            }
            if (aweme.getAuthor() != null) {
                if (this.f81436q == null) {
                    this.f81436q = new C31113a(this, user);
                }
                C30828c cVar = this.f81434o;
                if (cVar == null) {
                    C52711k.m112234a();
                }
                cVar.mo63564a(user, getClass(), this.f81436q, this.f81420a, C31208r.m72886a(this.f81420a));
            }
        }
    }

    /* renamed from: c */
    private final boolean m72708c(User user) {
        if (C26235d.m63570a(this.f81420a)) {
            if (!C31208r.m72886a(this.f81420a)) {
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
    public final void mo63899a(DataCenter dataCenter) {
        this.f81428i = dataCenter;
        if (dataCenter != null) {
            C0199s sVar = this;
            DataCenter a = dataCenter.mo48226a("startPlayAnimation", sVar);
            if (a != null) {
                DataCenter a2 = a.mo48226a("stopPlayAnimation", sVar);
                if (a2 != null) {
                    DataCenter a3 = a2.mo48226a("on_page_selected", sVar);
                    if (a3 != null) {
                        a3.mo48226a("image_pause", sVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m72702a(int i) {
        if (this.f81425f != null) {
            String str = "";
            try {
                JSONObject jSONObject = this.f81425f;
                if (jSONObject == null) {
                    C52711k.m112234a();
                }
                str = jSONObject.getString("request_id");
            } catch (JSONException unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                Aweme aweme = this.f81420a;
                if (aweme == null) {
                    C52711k.m112234a();
                }
                aweme.setRequestId(str);
            }
        }
        if (this.f81428i != null) {
            DataCenter dataCenter = this.f81428i;
            if (dataCenter == null) {
                C52711k.m112234a();
            }
            dataCenter.mo48228a("feed_internal_event", (Object) new C30332aw(19, this.f81420a));
        }
    }

    @C53771m
    public final void onLiveStatusEvent(RoomStatusEvent roomStatusEvent) {
        long j;
        C52711k.m112240b(roomStatusEvent, "event");
        Aweme aweme = this.f81420a;
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
                    m72705a(false, 0, j);
                }
                author.roomId = 0;
            } else if (roomStatusEvent.f8660a != 0) {
                if (author.roomId == 0) {
                    BusinessComponentServiceUtils.getLiveStateManager().mo74799a(j);
                    m72705a(true, roomStatusEvent.f8660a, j);
                }
                author.roomId = roomStatusEvent.f8660a;
            }
            mo63901a(author);
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
    public C31112q(android.view.View r5) {
        /*
            r4 = this;
            java.lang.String r0 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            r4.<init>()
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103290c(r4)
            android.content.Context r0 = r5.getContext()
            r4.f81429j = r0
            r0 = 2132024372(0x7f141c34, float:1.9687218E38)
            android.view.View r0 = r5.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarBorderView) r0
            r4.f81421b = r0
            r0 = 2132024378(0x7f141c3a, float:1.968723E38)
            android.view.View r0 = r5.findViewById(r0)
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r0 = (com.p683ss.android.ugc.aweme.feed.p1736ui.AvatarImageWithLive) r0
            r4.f81422c = r0
            r0 = 2132024374(0x7f141c36, float:1.9687222E38)
            android.view.View r0 = r5.findViewById(r0)
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r0 = (com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView) r0
            r4.f81430k = r0
            r0 = 2132020041(0x7f140b49, float:1.9678434E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.f81431l = r0
            r0 = 2132017520(0x7f140170, float:1.967332E38)
            android.view.View r0 = r5.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r0
            r4.f81432m = r0
            r0 = 2132019173(0x7f1407e5, float:1.9676673E38)
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.f81435p = r0
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
            r4.f81433n = r5
            int r5 = com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment.m70953a()
            if (r5 != r1) goto L_0x01a7
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r5 = r4.f81421b
            r0 = 1073741824(0x40000000, float:2.0)
            if (r5 == 0) goto L_0x00d7
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x00d7
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r1 = r4.f81421b
            if (r1 == 0) goto L_0x00d0
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x00d0
            int r1 = r1.width
            android.content.Context r3 = r4.f81429j
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
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r5 = r4.f81421b
            if (r5 == 0) goto L_0x0101
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x0101
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r1 = r4.f81421b
            if (r1 == 0) goto L_0x00fa
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x00fa
            int r1 = r1.height
            android.content.Context r3 = r4.f81429j
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
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r5 = r4.f81422c
            if (r5 == 0) goto L_0x012b
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x012b
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r1 = r4.f81422c
            if (r1 == 0) goto L_0x0124
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x0124
            int r1 = r1.width
            android.content.Context r3 = r4.f81429j
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
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r5 = r4.f81422c
            if (r5 == 0) goto L_0x0155
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x0155
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r1 = r4.f81422c
            if (r1 == 0) goto L_0x014e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x014e
            int r1 = r1.height
            android.content.Context r3 = r4.f81429j
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
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r5 = r4.f81430k
            if (r5 == 0) goto L_0x017f
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x017f
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r1 = r4.f81430k
            if (r1 == 0) goto L_0x0178
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x0178
            int r1 = r1.width
            android.content.Context r3 = r4.f81429j
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
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r5 = r4.f81430k
            if (r5 == 0) goto L_0x01a7
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x01a7
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r1 = r4.f81430k
            if (r1 == 0) goto L_0x01a1
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x01a1
            int r1 = r1.height
            android.content.Context r2 = r4.f81429j
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
            android.view.ViewGroup r5 = r4.f81435p
            if (r5 == 0) goto L_0x01c3
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.content.Context r1 = r4.f81429j
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
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r0 = r4.f81421b
            if (r0 == 0) goto L_0x01d5
            r0.setOnTouchListener(r5)
        L_0x01d5:
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r0 = r4.f81422c
            if (r0 == 0) goto L_0x01dc
            r0.setOnTouchListener(r5)
        L_0x01dc:
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r5 = r4.f81421b
            if (r5 == 0) goto L_0x01e6
            r0 = r4
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r5.setOnClickListener(r0)
        L_0x01e6:
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r5 = r4.f81422c
            if (r5 == 0) goto L_0x01f0
            r0 = r4
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r5.setOnClickListener(r0)
        L_0x01f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C31112q.<init>(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00fe, code lost:
        if (r5.equals("stopPlayAnimation") != false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0107, code lost:
        if (r5.equals("image_pause") != false) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(java.lang.Object r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.arch.widgets.base.a r5 = (com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a) r5
            if (r5 == 0) goto L_0x010d
            java.lang.String r5 = r5.f62242a
            int r0 = r5.hashCode()
            r1 = -1780252142(0xffffffff95e38212, float:-9.1889785E-26)
            if (r0 == r1) goto L_0x0101
            r1 = -1661876786(0xffffffff9cf1c5ce, float:-1.5999174E-21)
            if (r0 == r1) goto L_0x00f8
            r1 = 307897710(0x125a256e, float:6.8834807E-28)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x00b8
            r1 = 350216171(0x14dfdfeb, float:2.2605566E-26)
            if (r0 == r1) goto L_0x0022
            goto L_0x010d
        L_0x0022:
            java.lang.String r0 = "on_page_selected"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x010d
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r5 = r4.f81422c
            if (r5 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r5 = r5.getAvatarImageView()
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r0 = r4.f81422c
            if (r0 == 0) goto L_0x0040
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0040
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r4.m72704a(r5, r0)
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r5 = r4.f81421b
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r0 = r4.f81421b
            if (r0 == 0) goto L_0x0052
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0052
            r0 = 1
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            r4.m72704a(r5, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r4.f81420a
            if (r5 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r4.f81420a
            if (r5 != 0) goto L_0x0061
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0061:
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getAuthor()
            if (r5 == 0) goto L_0x0076
            com.ss.android.ugc.aweme.commercialize.model.f$a r0 = com.p683ss.android.ugc.aweme.commercialize.model.C26121f.f68971d
            boolean r0 = r0.mo53636a(r5)
            if (r0 == 0) goto L_0x0076
            boolean r5 = r4.m72708c(r5)
            if (r5 == 0) goto L_0x0076
            r2 = 1
        L_0x0076:
            if (r2 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.commercialize.model.f$a r5 = com.p683ss.android.ugc.aweme.commercialize.model.C26121f.f68971d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f81420a
            if (r0 != 0) goto L_0x0081
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0081:
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r1 = "video"
            r5.mo53635a(r0, r1)
        L_0x008a:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r4.f81420a
            boolean r5 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64064g(r5)
            if (r5 == 0) goto L_0x010d
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r4.f81420a
            r0 = 3
            boolean r5 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63997a(r5, r0)
            if (r5 != 0) goto L_0x010d
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r4.f81420a
            if (r5 != 0) goto L_0x00a2
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00a2:
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getAuthor()
            boolean r5 = r4.m72708c(r5)
            if (r5 == 0) goto L_0x010d
            com.ss.android.ugc.aweme.commercialize.feed.an r5 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r0 = r4.f81429j
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.f81420a
            r5.mo53137c(r0, r1)
            goto L_0x010d
        L_0x00b8:
            java.lang.String r0 = "startPlayAnimation"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x010d
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r4.f81420a
            if (r5 == 0) goto L_0x00e1
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r4.f81420a
            if (r5 != 0) goto L_0x00cb
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00cb:
            int r5 = r5.getAwemeType()
            r0 = 101(0x65, float:1.42E-43)
            if (r5 != r0) goto L_0x00e1
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r4.f81420a
            if (r5 != 0) goto L_0x00da
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00da:
            com.ss.android.ugc.aweme.feed.model.StreamUrlModel r5 = r5.getStreamUrlModel()
            if (r5 == 0) goto L_0x00e1
            r2 = 1
        L_0x00e1:
            if (r2 != 0) goto L_0x00f7
            boolean r5 = r4.f81437r
            if (r5 != 0) goto L_0x00f7
            r4.f81437r = r3
            com.ss.android.ugc.aweme.feed.ui.c r5 = r4.f81434o
            if (r5 == 0) goto L_0x00f7
            com.ss.android.ugc.aweme.feed.ui.c r5 = r4.f81434o
            if (r5 != 0) goto L_0x00f4
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00f4:
            r5.mo63566c()
        L_0x00f7:
            return
        L_0x00f8:
            java.lang.String r0 = "stopPlayAnimation"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x010d
            goto L_0x0109
        L_0x0101:
            java.lang.String r0 = "image_pause"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x010d
        L_0x0109:
            r4.m72709d()
            return
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C31112q.onChanged(java.lang.Object):void");
    }

    /* renamed from: a */
    public final void mo63900a(VideoItemParams videoItemParams) {
        User user;
        if (videoItemParams != null) {
            this.f81423d = videoItemParams.mAdViewController;
            this.f81420a = videoItemParams.mAweme;
            this.f81427h = videoItemParams.mPageType;
            this.f81424e = videoItemParams.mEventType;
            this.f81425f = videoItemParams.mRequestId;
            this.f81426g = videoItemParams.isMyProfile;
        }
        int i = 8;
        if (C26469cc.m63997a(this.f81420a, 3)) {
            ImageView imageView = this.f81431l;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else {
            ImageView imageView2 = this.f81431l;
            if (imageView2 != null) {
                if (C26503d.m64062e(this.f81420a)) {
                    i = 0;
                }
                imageView2.setVisibility(i);
            }
        }
        Aweme aweme = this.f81420a;
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        mo63901a(user);
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
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81420a
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64064g(r1)
            if (r1 == 0) goto L_0x0025
            com.ss.android.ugc.aweme.commercialize.feed.an r1 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r2 = r0.f81429j
            java.lang.String r3 = "draw_ad"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.f81420a
            r1.mo53124a(r2, r3, r4)
        L_0x0025:
            boolean r1 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r1 != 0) goto L_0x0247
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81420a
            boolean r1 = com.p683ss.android.ugc.aweme.login.utils.C36330a.m81964a(r1)
            if (r1 == 0) goto L_0x0035
            goto L_0x0247
        L_0x0035:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81420a
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64057a(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81420a
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81420a
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
            android.content.Context r1 = r0.f81429j
            r2 = 2132541683(0x7f1c00f3, float:2.073645E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r1, r2)
            r1.mo19066a()
            goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            if (r3 != 0) goto L_0x0246
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81420a
            if (r1 == 0) goto L_0x00b0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81420a
            if (r1 != 0) goto L_0x0075
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0075:
            boolean r1 = r1.isCanPlay()
            if (r1 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81420a
            if (r1 != 0) goto L_0x0082
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0082:
            boolean r1 = r1.isDelete()
            if (r1 == 0) goto L_0x00b0
        L_0x0088:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81420a
            if (r1 != 0) goto L_0x008f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x008f:
            boolean r1 = r1.isImage()
            if (r1 == 0) goto L_0x00a3
            android.content.Context r1 = r0.f81429j
            r2 = 2132545667(0x7f1c1083, float:2.074453E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r1, r2)
            r1.mo19066a()
            goto L_0x0246
        L_0x00a3:
            android.content.Context r1 = r0.f81429j
            r2 = 2132551886(0x7f1c28ce, float:2.0757144E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r1, r2)
            r1.mo19066a()
            return
        L_0x00b0:
            com.ss.android.ugc.aweme.commercialize.feed.e r1 = r0.f81423d
            if (r1 == 0) goto L_0x00b7
            r1.mo53255k()
        L_0x00b7:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f81420a
            if (r1 == 0) goto L_0x0246
            r1 = 19
            r0.m72702a(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81420a
            if (r2 != 0) goto L_0x00c7
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00c7:
            com.ss.android.ugc.aweme.profile.model.User r5 = r2.getAuthor()
            boolean r2 = r0.m72708c(r5)
            if (r2 == 0) goto L_0x0197
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81420a
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63571b(r2)
            if (r2 == 0) goto L_0x00e9
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81420a
            boolean r2 = com.p683ss.android.ugc.aweme.feed.utils.C31208r.m72886a(r2)
            if (r2 != 0) goto L_0x00e9
            android.content.Context r1 = r0.f81429j
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81420a
            com.p683ss.android.ugc.aweme.feed.utils.C31208r.m72878a(r1, r2)
            return
        L_0x00e9:
            java.lang.String r2 = r0.f81424e
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r3 = "homepage_hot"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0118
            android.content.Context r6 = r0.f81429j
            r7 = 1
            java.lang.String r8 = r20.m72707c()
            java.lang.String r2 = "author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r2)
            java.lang.String r9 = r5.getUid()
            long r10 = r5.roomId
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81420a
            if (r2 != 0) goto L_0x0110
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0110:
            java.lang.String r12 = r2.getAid()
            com.p683ss.android.ugc.aweme.story.live.C46641d.m101225d(r6, r7, r8, r9, r10, r12)
            goto L_0x0166
        L_0x0118:
            java.lang.String r2 = r0.f81424e
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r3 = "homepage_follow"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0147
            android.content.Context r6 = r0.f81429j
            r7 = 1
            java.lang.String r8 = r20.m72707c()
            java.lang.String r2 = "author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r2)
            java.lang.String r9 = r5.getUid()
            long r10 = r5.roomId
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81420a
            if (r2 != 0) goto L_0x013f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x013f:
            java.lang.String r12 = r2.getAid()
            com.p683ss.android.ugc.aweme.story.live.C46641d.m101224c(r6, r7, r8, r9, r10, r12)
            goto L_0x0166
        L_0x0147:
            android.content.Context r13 = r0.f81429j
            r14 = 1
            java.lang.String r2 = r0.f81424e
            boolean r3 = r0.f81426g
            java.lang.String r15 = com.p683ss.android.ugc.aweme.feed.helper.C30366f.m71280a(r2, r3)
            java.lang.String r16 = r20.m72707c()
            java.lang.String r2 = "author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r2)
            java.lang.String r17 = r5.getUid()
            long r2 = r5.roomId
            r18 = r2
            com.p683ss.android.ugc.aweme.story.live.C46641d.m101208a(r13, r14, r15, r16, r17, r18)
        L_0x0166:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r2 = "live.intent.extra.ENTER_AWEME_ID"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f81420a
            if (r3 != 0) goto L_0x0174
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0174:
            java.lang.String r3 = r3.getAid()
            r8.putString(r2, r3)
            com.ss.android.ugc.aweme.live.ILiveOuterService r2 = com.p683ss.android.ugc.aweme.live.C36173w.m81665a()
            java.lang.String r3 = "ServiceManager.get().get…OuterService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.live.ILiveOuterService r2 = (com.p683ss.android.ugc.aweme.live.ILiveOuterService) r2
            com.ss.android.ugc.aweme.i.c r3 = r2.getLiveWatcherUtils()
            android.content.Context r4 = r0.f81429j
            java.lang.String r6 = r0.f81424e
            java.lang.String r7 = "video_head"
            r3.mo70095a(r4, r5, r6, r7, r8)
            r0.m72702a(r1)
            return
        L_0x0197:
            com.ss.android.ugc.aweme.aq.s r1 = new com.ss.android.ugc.aweme.aq.s
            r1.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81420a
            int r3 = r0.f81427h
            com.ss.android.ugc.aweme.aq.s r1 = r1.mo48136c(r2, r3)
            java.lang.String r2 = r0.f81424e
            if (r2 != 0) goto L_0x01aa
            java.lang.String r2 = ""
        L_0x01aa:
            com.ss.android.ugc.aweme.aq.s r1 = r1.mo48137c(r2)
            android.content.Context r2 = r0.f81429j
            com.ss.android.ugc.aweme.aq.a r1 = r1.mo47940a(r2)
            com.ss.android.ugc.aweme.aq.s r1 = (com.p683ss.android.ugc.aweme.p1382aq.C23249s) r1
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r0.f81428i
            r3 = 0
            if (r2 == 0) goto L_0x01c6
            java.lang.String r4 = "playlist_type"
            java.lang.String r5 = ""
            java.lang.Object r2 = r2.mo48230b(r4, r5)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x01c7
        L_0x01c6:
            r2 = r3
        L_0x01c7:
            com.ss.android.ugc.aweme.aq.s r1 = r1.mo48138d(r2)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r0.f81428i
            if (r2 == 0) goto L_0x01da
            java.lang.String r4 = "playlist_id"
            java.lang.String r5 = ""
            java.lang.Object r2 = r2.mo48230b(r4, r5)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x01db
        L_0x01da:
            r2 = r3
        L_0x01db:
            com.ss.android.ugc.aweme.aq.s r1 = r1.mo48141f(r2)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r0.f81428i
            if (r2 == 0) goto L_0x01ee
            java.lang.String r4 = "playlist_id_key"
            java.lang.String r5 = ""
            java.lang.Object r2 = r2.mo48230b(r4, r5)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x01ef
        L_0x01ee:
            r2 = r3
        L_0x01ef:
            com.ss.android.ugc.aweme.aq.s r1 = r1.mo48140e(r2)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r0.f81428i
            if (r2 == 0) goto L_0x0202
            java.lang.String r3 = "tab_name"
            java.lang.String r4 = ""
            java.lang.Object r2 = r2.mo48230b(r3, r4)
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
        L_0x0202:
            com.ss.android.ugc.aweme.aq.k r1 = r1.mo48100j(r3)
            com.ss.android.ugc.aweme.aq.s r1 = (com.p683ss.android.ugc.aweme.p1382aq.C23249s) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81420a
            int r3 = r0.f81427h
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56854b(r2, r3)
            com.ss.android.ugc.aweme.aq.k r1 = r1.mo48101k(r2)
            com.ss.android.ugc.aweme.aq.s r1 = (com.p683ss.android.ugc.aweme.p1382aq.C23249s) r1
            java.lang.String r2 = "click_head"
            com.ss.android.ugc.aweme.aq.a r1 = r1.mo47941a(r2)
            com.ss.android.ugc.aweme.aq.s r1 = (com.p683ss.android.ugc.aweme.p1382aq.C23249s) r1
            r1.mo48076e()
            com.ss.android.ugc.aweme.feed.ad r1 = com.p683ss.android.ugc.aweme.feed.C29988ad.PROFILE
            com.p683ss.android.ugc.aweme.feed.C30578o.m71566a(r1)
            java.lang.String r1 = ""
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r0.f81428i
            if (r2 == 0) goto L_0x0237
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r0.f81428i
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C31112q.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo63901a(User user) {
        if (user == null || C26469cc.m63997a(this.f81420a, 3)) {
            if (this.f81422c != null) {
                AvatarImageWithLive avatarImageWithLive = this.f81422c;
                if (avatarImageWithLive != null) {
                    avatarImageWithLive.setVisibility(4);
                }
                AvatarImageWithLive avatarImageWithLive2 = this.f81422c;
                if (avatarImageWithLive2 != null) {
                    avatarImageWithLive2.mo63283a(false);
                }
            }
            SmartAvatarBorderView smartAvatarBorderView = this.f81421b;
            if (smartAvatarBorderView != null) {
                smartAvatarBorderView.setVisibility(0);
            }
            SmartAvatarBorderView smartAvatarBorderView2 = this.f81421b;
            if (smartAvatarBorderView2 != null) {
                smartAvatarBorderView2.setBorderColor(R.color.bs);
            }
            m72703a(this.f81421b);
            RemoteImageView remoteImageView = this.f81432m;
            if (remoteImageView != null) {
                remoteImageView.setVisibility(8);
            }
        } else {
            DataCenter dataCenter = this.f81428i;
            if (dataCenter != null) {
                dataCenter.mo48228a("bind_follow_view", (Object) Integer.valueOf(user.getFollowStatus()));
            }
            if (C20854a.m53167g().isMe(user.getUid())) {
                IAccountUserService g = C20854a.m53167g();
                C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                user.roomId = g.getCurUser().roomId;
            }
            if (this.f81434o == null) {
                this.f81434o = new C30828c(user.isLive(), this.f81422c, this.f81421b, this.f81430k);
            }
            m72706b(user);
            if (m72708c(user)) {
                AvatarImageWithLive avatarImageWithLive3 = this.f81422c;
                if (avatarImageWithLive3 != null) {
                    avatarImageWithLive3.setBorderColor(R.color.arz);
                }
                AvatarImageWithLive avatarImageWithLive4 = this.f81422c;
                if (avatarImageWithLive4 == null) {
                    C52711k.m112234a();
                }
                m72703a(avatarImageWithLive4.getAvatarImageView());
                AvatarImageWithLive avatarImageWithLive5 = this.f81422c;
                if (avatarImageWithLive5 != null) {
                    avatarImageWithLive5.mo63283a(true);
                }
            } else {
                SmartAvatarBorderView smartAvatarBorderView3 = this.f81421b;
                if (smartAvatarBorderView3 != null) {
                    smartAvatarBorderView3.setBorderColor(R.color.bs);
                }
                SmartAvatarBorderView smartAvatarBorderView4 = this.f81421b;
                if (smartAvatarBorderView4 == null) {
                    C52711k.m112234a();
                }
                m72703a(smartAvatarBorderView4);
                AvatarImageWithLive avatarImageWithLive6 = this.f81422c;
                if (avatarImageWithLive6 != null) {
                    avatarImageWithLive6.mo63283a(false);
                }
            }
            if (this.f81432m != null) {
                if (m72708c(user) || !C26121f.f68971d.mo53636a(user)) {
                    RemoteImageView remoteImageView2 = this.f81432m;
                    if (remoteImageView2 != null) {
                        remoteImageView2.setVisibility(8);
                    }
                } else {
                    RemoteImageView remoteImageView3 = this.f81432m;
                    if (remoteImageView3 != null) {
                        remoteImageView3.setVisibility(0);
                    }
                    C26121f.f68971d.mo53634a(user, this.f81432m);
                    C26121f.f68971d.mo53635a(user, C22858c.f61207c);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m72704a(SmartAvatarBorderView smartAvatarBorderView, boolean z) {
        String str;
        if (C26469cc.m63998a(this.f81420a, (SmartImageView) smartAvatarBorderView)) {
            if (z) {
                C25945k.m62923n().mo54135a(C26469cc.m64003d(this.f81420a));
            }
            return;
        }
        StringBuilder sb = new StringBuilder("FeedAvatarView_");
        if (this.f81420a == null) {
            str = "no_aid";
        } else {
            Aweme aweme = this.f81420a;
            if (aweme == null) {
                C52711k.m112234a();
            }
            str = aweme.getAid();
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (this.f81420a != null) {
            Aweme aweme2 = this.f81420a;
            if (aweme2 == null) {
                C52711k.m112234a();
            }
            if (aweme2.getAuthor() != null) {
                Aweme aweme3 = this.f81420a;
                if (aweme3 == null) {
                    C52711k.m112234a();
                }
                User author = aweme3.getAuthor();
                C52711k.m112236a((Object) author, "mAweme!!.author");
                if (author.getAvatarThumb() != null) {
                    Aweme aweme4 = this.f81420a;
                    if (aweme4 == null) {
                        C52711k.m112234a();
                    }
                    User author2 = aweme4.getAuthor();
                    C52711k.m112236a((Object) author2, "mAweme!!.author");
                    UrlModel avatarThumb = author2.getAvatarThumb();
                    C52711k.m112236a((Object) avatarThumb, "mAweme!!.author.avatarThumb");
                    if (!C9376b.m18558a((Collection<T>) avatarThumb.getUrlList())) {
                        if (smartAvatarBorderView == this.f81421b && C30224d.m70966a()) {
                            String str2 = "FeedAvatarView";
                            StringBuilder sb3 = new StringBuilder("loadAvatarViews:");
                            Aweme aweme5 = this.f81420a;
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
                            Aweme aweme6 = this.f81420a;
                            if (aweme6 == null) {
                                C52711k.m112234a();
                            }
                            User author4 = aweme6.getAuthor();
                            C52711k.m112236a((Object) author4, "mAweme!!.author");
                            smartAvatarBorderView.mo49062a(author4.getAvatarThumb(), C47788ct.m103417a(BaseNotice.HASHTAG), this.f81433n, this.f81433n, sb2, true);
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
    private static void m72705a(boolean z, long j, long j2) {
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
