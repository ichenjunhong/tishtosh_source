package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.android.live.base.event.RoomStatusEvent;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarBorderView;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.model.C26121f;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.feed.experiment.C30224d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
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
import org.greenrobot.eventbus.C53771m;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.as */
public final class C30769as implements C0199s<C23274a>, OnClickListener {

    /* renamed from: a */
    public Aweme f80629a;

    /* renamed from: b */
    public String f80630b;

    /* renamed from: c */
    public ImageView f80631c;

    /* renamed from: d */
    private DataCenter f80632d;

    /* renamed from: e */
    private Context f80633e;

    /* renamed from: f */
    private SmartAvatarBorderView f80634f;

    /* renamed from: g */
    private AvatarImageWithLive f80635g;

    /* renamed from: h */
    private LiveCircleView f80636h;

    /* renamed from: i */
    private RemoteImageView f80637i;

    /* renamed from: j */
    private int f80638j;

    /* renamed from: k */
    private C30828c f80639k;

    /* renamed from: l */
    private C1710e<C36083b> f80640l;

    /* renamed from: m */
    private boolean f80641m;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.as$a */
    static final class C30770a<T> implements C1710e<C36083b> {

        /* renamed from: a */
        final /* synthetic */ C30769as f80642a;

        /* renamed from: b */
        final /* synthetic */ User f80643b;

        C30770a(C30769as asVar, User user) {
            this.f80642a = asVar;
            this.f80643b = user;
        }

        public final /* synthetic */ void accept(Object obj) {
            C36083b bVar = (C36083b) obj;
            if (this.f80642a.f80629a != null) {
                Aweme aweme = this.f80642a.f80629a;
                if (aweme == null) {
                    C52711k.m112234a();
                }
                if (aweme.getAuthor() != null) {
                    Aweme aweme2 = this.f80642a.f80629a;
                    if (aweme2 == null) {
                        C52711k.m112234a();
                    }
                    if (TextUtils.equals(aweme2.getAuthorUid(), String.valueOf(bVar.f92446a))) {
                        this.f80643b.roomId = bVar.f92447b;
                        if (!C26235d.m63570a(this.f80642a.f80629a) && !this.f80643b.isLive()) {
                            C30769as asVar = this.f80642a;
                            Aweme aweme3 = this.f80642a.f80629a;
                            if (aweme3 == null) {
                                C52711k.m112234a();
                            }
                            asVar.mo63474a(aweme3.getAuthor());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m72143a(SmartAvatarBorderView smartAvatarBorderView) {
        m72144a(smartAvatarBorderView, false);
    }

    /* renamed from: b */
    private final void m72145b(User user) {
        if (this.f80629a != null) {
            Aweme aweme = this.f80629a;
            if (aweme == null) {
                C52711k.m112234a();
            }
            if (aweme.getAuthor() != null) {
                if (this.f80640l == null) {
                    this.f80640l = new C30770a(this, user);
                }
                C30828c cVar = this.f80639k;
                if (cVar == null) {
                    C52711k.m112234a();
                }
                cVar.mo63564a(user, getClass(), this.f80640l, this.f80629a, C31208r.m72886a(this.f80629a));
            }
        }
    }

    /* renamed from: c */
    private final boolean m72146c(User user) {
        if (C26235d.m63570a(this.f80629a)) {
            if (!C31208r.m72886a(this.f80629a)) {
                return true;
            }
            return false;
        } else if (user == null || !user.isLive() || !C46635b.m101190a() || user.isBlock() || C47915gg.m103651b()) {
            return false;
        } else {
            return true;
        }
    }

    @C53771m
    public final void onLiveStatusEvent(RoomStatusEvent roomStatusEvent) {
        long j;
        C52711k.m112240b(roomStatusEvent, "event");
        Aweme aweme = this.f80629a;
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
                }
                author.roomId = 0;
            } else if (roomStatusEvent.f8660a != 0) {
                if (author.roomId == 0) {
                    BusinessComponentServiceUtils.getLiveStateManager().mo74799a(j);
                }
                author.roomId = roomStatusEvent.f8660a;
            }
            mo63474a(author);
        }
    }

    /* renamed from: a */
    public final void mo63474a(User user) {
        if (user == null || C26469cc.m63997a(this.f80629a, 3)) {
            if (this.f80635g != null) {
                AvatarImageWithLive avatarImageWithLive = this.f80635g;
                if (avatarImageWithLive != null) {
                    avatarImageWithLive.setVisibility(4);
                }
                AvatarImageWithLive avatarImageWithLive2 = this.f80635g;
                if (avatarImageWithLive2 != null) {
                    avatarImageWithLive2.mo63283a(false);
                }
            }
            SmartAvatarBorderView smartAvatarBorderView = this.f80634f;
            if (smartAvatarBorderView != null) {
                smartAvatarBorderView.setVisibility(0);
            }
            SmartAvatarBorderView smartAvatarBorderView2 = this.f80634f;
            if (smartAvatarBorderView2 != null) {
                smartAvatarBorderView2.setBorderColor(R.color.bs);
            }
            m72143a(this.f80634f);
            RemoteImageView remoteImageView = this.f80637i;
            if (remoteImageView != null) {
                remoteImageView.setVisibility(8);
            }
        } else {
            DataCenter dataCenter = this.f80632d;
            if (dataCenter != null) {
                dataCenter.mo48228a("bind_follow_view", (Object) Integer.valueOf(user.getFollowStatus()));
            }
            if (C20854a.m53167g().isMe(user.getUid())) {
                IAccountUserService g = C20854a.m53167g();
                C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                user.roomId = g.getCurUser().roomId;
            }
            if (this.f80639k == null) {
                this.f80639k = new C30828c(user.isLive(), this.f80635g, this.f80634f, this.f80636h);
            }
            m72145b(user);
            if (m72146c(user)) {
                AvatarImageWithLive avatarImageWithLive3 = this.f80635g;
                if (avatarImageWithLive3 != null) {
                    avatarImageWithLive3.setBorderColor(R.color.arz);
                }
                AvatarImageWithLive avatarImageWithLive4 = this.f80635g;
                if (avatarImageWithLive4 == null) {
                    C52711k.m112234a();
                }
                m72143a(avatarImageWithLive4.getAvatarImageView());
                AvatarImageWithLive avatarImageWithLive5 = this.f80635g;
                if (avatarImageWithLive5 != null) {
                    avatarImageWithLive5.mo63283a(true);
                }
            } else {
                SmartAvatarBorderView smartAvatarBorderView3 = this.f80634f;
                if (smartAvatarBorderView3 != null) {
                    smartAvatarBorderView3.setBorderColor(R.color.bs);
                }
                SmartAvatarBorderView smartAvatarBorderView4 = this.f80634f;
                if (smartAvatarBorderView4 == null) {
                    C52711k.m112234a();
                }
                m72143a(smartAvatarBorderView4);
                AvatarImageWithLive avatarImageWithLive6 = this.f80635g;
                if (avatarImageWithLive6 != null) {
                    avatarImageWithLive6.mo63283a(false);
                }
            }
            if (this.f80637i != null) {
                if (m72146c(user) || !C26121f.f68971d.mo53636a(user)) {
                    RemoteImageView remoteImageView2 = this.f80637i;
                    if (remoteImageView2 != null) {
                        remoteImageView2.setVisibility(8);
                    }
                } else {
                    RemoteImageView remoteImageView3 = this.f80637i;
                    if (remoteImageView3 != null) {
                        remoteImageView3.setVisibility(0);
                    }
                    C26121f.f68971d.mo53634a(user, this.f80637i);
                    C26121f.f68971d.mo53635a(user, C22858c.f61207c);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00db, code lost:
        if (r5.equals("stopPlayAnimation") != false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e4, code lost:
        if (r5.equals("image_pause") != false) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(java.lang.Object r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.arch.widgets.base.a r5 = (com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a) r5
            if (r5 == 0) goto L_0x00fb
            java.lang.String r5 = r5.f62242a
            int r0 = r5.hashCode()
            r1 = -1780252142(0xffffffff95e38212, float:-9.1889785E-26)
            r2 = 0
            if (r0 == r1) goto L_0x00de
            r1 = -1661876786(0xffffffff9cf1c5ce, float:-1.5999174E-21)
            if (r0 == r1) goto L_0x00d5
            r1 = 307897710(0x125a256e, float:6.8834807E-28)
            r3 = 1
            if (r0 == r1) goto L_0x00b8
            r1 = 350216171(0x14dfdfeb, float:2.2605566E-26)
            if (r0 == r1) goto L_0x0022
            goto L_0x00fb
        L_0x0022:
            java.lang.String r0 = "on_page_selected"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00fb
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r5 = r4.f80635g
            if (r5 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r5 = r5.getAvatarImageView()
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r0 = r4.f80635g
            if (r0 == 0) goto L_0x0040
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0040
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r4.m72144a(r5, r0)
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r5 = r4.f80634f
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r0 = r4.f80634f
            if (r0 == 0) goto L_0x0052
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0052
            r0 = 1
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            r4.m72144a(r5, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r4.f80629a
            if (r5 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r4.f80629a
            if (r5 != 0) goto L_0x0061
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0061:
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getAuthor()
            if (r5 == 0) goto L_0x0076
            com.ss.android.ugc.aweme.commercialize.model.f$a r0 = com.p683ss.android.ugc.aweme.commercialize.model.C26121f.f68971d
            boolean r0 = r0.mo53636a(r5)
            if (r0 == 0) goto L_0x0076
            boolean r5 = r4.m72146c(r5)
            if (r5 == 0) goto L_0x0076
            r2 = 1
        L_0x0076:
            if (r2 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.commercialize.model.f$a r5 = com.p683ss.android.ugc.aweme.commercialize.model.C26121f.f68971d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f80629a
            if (r0 != 0) goto L_0x0081
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0081:
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r1 = "video"
            r5.mo53635a(r0, r1)
        L_0x008a:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r4.f80629a
            boolean r5 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64064g(r5)
            if (r5 == 0) goto L_0x00fb
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r4.f80629a
            r0 = 3
            boolean r5 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63997a(r5, r0)
            if (r5 != 0) goto L_0x00fb
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r4.f80629a
            if (r5 != 0) goto L_0x00a2
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00a2:
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getAuthor()
            boolean r5 = r4.m72146c(r5)
            if (r5 == 0) goto L_0x00fb
            com.ss.android.ugc.aweme.commercialize.feed.an r5 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r0 = r4.f80633e
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.f80629a
            r5.mo53137c(r0, r1)
            goto L_0x00fb
        L_0x00b8:
            java.lang.String r0 = "startPlayAnimation"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00fb
            boolean r5 = r4.f80641m
            if (r5 != 0) goto L_0x00d4
            r4.f80641m = r3
            com.ss.android.ugc.aweme.feed.ui.c r5 = r4.f80639k
            if (r5 == 0) goto L_0x00d4
            com.ss.android.ugc.aweme.feed.ui.c r5 = r4.f80639k
            if (r5 != 0) goto L_0x00d1
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00d1:
            r5.mo63566c()
        L_0x00d4:
            return
        L_0x00d5:
            java.lang.String r0 = "stopPlayAnimation"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00fb
            goto L_0x00e6
        L_0x00de:
            java.lang.String r0 = "image_pause"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00fb
        L_0x00e6:
            boolean r5 = r4.f80641m
            if (r5 == 0) goto L_0x00fa
            r4.f80641m = r2
            com.ss.android.ugc.aweme.feed.ui.c r5 = r4.f80639k
            if (r5 == 0) goto L_0x00fa
            com.ss.android.ugc.aweme.feed.ui.c r5 = r4.f80639k
            if (r5 != 0) goto L_0x00f7
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00f7:
            r5.mo63567d()
        L_0x00fa:
            return
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30769as.onChanged(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r7.isDelete() != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r7)
            if (r7 == 0) goto L_0x0023
            int r7 = r7.getId()
            r0 = 2132024378(0x7f141c3a, float:1.968723E38)
            if (r7 != r0) goto L_0x0023
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f80629a
            boolean r7 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64064g(r7)
            if (r7 == 0) goto L_0x0023
            com.ss.android.ugc.aweme.commercialize.feed.an r7 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r0 = r6.f80633e
            java.lang.String r1 = "draw_ad"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f80629a
            r7.mo53124a(r0, r1, r2)
        L_0x0023:
            boolean r7 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r7 != 0) goto L_0x00c4
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f80629a
            boolean r7 = com.p683ss.android.ugc.aweme.login.utils.C36330a.m81964a(r7)
            if (r7 == 0) goto L_0x0033
            goto L_0x00c4
        L_0x0033:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f80629a
            if (r7 == 0) goto L_0x0078
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f80629a
            if (r7 != 0) goto L_0x003e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x003e:
            boolean r7 = r7.isCanPlay()
            if (r7 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f80629a
            if (r7 != 0) goto L_0x004b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x004b:
            boolean r7 = r7.isDelete()
            if (r7 == 0) goto L_0x0078
        L_0x0051:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f80629a
            if (r7 != 0) goto L_0x0058
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0058:
            boolean r7 = r7.isImage()
            if (r7 == 0) goto L_0x006b
            android.content.Context r7 = r6.f80633e
            r0 = 2132545667(0x7f1c1083, float:2.074453E38)
            com.bytedance.ies.dmt.ui.d.a r7 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r7, r0)
            r7.mo19066a()
            goto L_0x00c3
        L_0x006b:
            android.content.Context r7 = r6.f80633e
            r0 = 2132551886(0x7f1c28ce, float:2.0757144E38)
            com.bytedance.ies.dmt.ui.d.a r7 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r7, r0)
            r7.mo19066a()
            return
        L_0x0078:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f80629a
            if (r7 == 0) goto L_0x00c3
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f80629a
            if (r7 != 0) goto L_0x0083
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0083:
            com.ss.android.ugc.aweme.profile.model.User r2 = r7.getAuthor()
            if (r2 == 0) goto L_0x00c3
            boolean r7 = r2.isLive()
            if (r7 == 0) goto L_0x00c3
            boolean r7 = com.p683ss.android.ugc.aweme.story.C46635b.m101190a()
            if (r7 == 0) goto L_0x00c3
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r7 = "live.intent.extra.ENTER_AWEME_ID"
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f80629a
            if (r0 != 0) goto L_0x00a3
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00a3:
            java.lang.String r0 = r0.getAid()
            r5.putString(r7, r0)
            java.lang.String r7 = "live.intent.extra.IS_VIDEO_HEAD"
            r0 = 1
            r5.putBoolean(r7, r0)
            com.ss.android.ugc.aweme.live.ILiveOuterService r7 = com.p683ss.android.ugc.aweme.live.C36173w.m81665a()
            com.ss.android.ugc.aweme.live.ILiveOuterService r7 = (com.p683ss.android.ugc.aweme.live.ILiveOuterService) r7
            com.ss.android.ugc.aweme.i.c r0 = r7.getLiveWatcherUtils()
            android.content.Context r1 = r6.f80633e
            java.lang.String r3 = r6.f80630b
            java.lang.String r4 = "video_head"
            r0.mo70095a(r1, r2, r3, r4, r5)
        L_0x00c3:
            return
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30769as.onClick(android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C30769as(android.view.View r5) {
        /*
            r4 = this;
            java.lang.String r0 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            r4.<init>()
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103290c(r4)
            android.content.Context r0 = r5.getContext()
            r4.f80633e = r0
            r0 = 2132024372(0x7f141c34, float:1.9687218E38)
            android.view.View r0 = r5.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarBorderView) r0
            r4.f80634f = r0
            r0 = 2132024378(0x7f141c3a, float:1.968723E38)
            android.view.View r0 = r5.findViewById(r0)
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r0 = (com.p683ss.android.ugc.aweme.feed.p1736ui.AvatarImageWithLive) r0
            r4.f80635g = r0
            r0 = 2132024374(0x7f141c36, float:1.9687222E38)
            android.view.View r0 = r5.findViewById(r0)
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r0 = (com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView) r0
            r4.f80636h = r0
            r0 = 2132020041(0x7f140b49, float:1.9678434E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.f80631c = r0
            r0 = 2132017520(0x7f140170, float:1.967332E38)
            android.view.View r0 = r5.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r0
            r4.f80637i = r0
            int r0 = com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment.m70953a()
            r1 = 5
            r2 = 0
            if (r0 != 0) goto L_0x0065
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x0063
            r0 = 2131886461(0x7f12017d, float:1.9407501E38)
            float r5 = r5.getDimension(r0)
            int r5 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0090
        L_0x0063:
            r5 = r2
            goto L_0x0090
        L_0x0065:
            int r0 = com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment.m70953a()
            if (r0 != r1) goto L_0x007e
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x0063
            r0 = 2131886458(0x7f12017a, float:1.9407495E38)
            float r5 = r5.getDimension(r0)
            int r5 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0090
        L_0x007e:
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x0063
            r0 = 2131886457(0x7f120179, float:1.9407493E38)
            float r5 = r5.getDimension(r0)
            int r5 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x0090:
            if (r5 == 0) goto L_0x0097
            int r5 = r5.intValue()
            goto L_0x0098
        L_0x0097:
            r5 = 0
        L_0x0098:
            r4.f80638j = r5
            int r5 = com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment.m70953a()
            if (r5 != r1) goto L_0x019c
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r5 = r4.f80634f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r5 == 0) goto L_0x00cc
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x00cc
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r1 = r4.f80634f
            if (r1 == 0) goto L_0x00c5
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x00c5
            int r1 = r1.width
            android.content.Context r3 = r4.f80633e
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r0)
            int r3 = (int) r3
            int r1 = r1 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00c6
        L_0x00c5:
            r1 = r2
        L_0x00c6:
            int r1 = r1.intValue()
            r5.width = r1
        L_0x00cc:
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r5 = r4.f80634f
            if (r5 == 0) goto L_0x00f6
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x00f6
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r1 = r4.f80634f
            if (r1 == 0) goto L_0x00ef
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x00ef
            int r1 = r1.height
            android.content.Context r3 = r4.f80633e
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r0)
            int r3 = (int) r3
            int r1 = r1 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00f0
        L_0x00ef:
            r1 = r2
        L_0x00f0:
            int r1 = r1.intValue()
            r5.height = r1
        L_0x00f6:
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r5 = r4.f80635g
            if (r5 == 0) goto L_0x0120
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x0120
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r1 = r4.f80635g
            if (r1 == 0) goto L_0x0119
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x0119
            int r1 = r1.width
            android.content.Context r3 = r4.f80633e
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r0)
            int r3 = (int) r3
            int r1 = r1 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x011a
        L_0x0119:
            r1 = r2
        L_0x011a:
            int r1 = r1.intValue()
            r5.width = r1
        L_0x0120:
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r5 = r4.f80635g
            if (r5 == 0) goto L_0x014a
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x014a
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r1 = r4.f80635g
            if (r1 == 0) goto L_0x0143
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x0143
            int r1 = r1.height
            android.content.Context r3 = r4.f80633e
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r0)
            int r3 = (int) r3
            int r1 = r1 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0144
        L_0x0143:
            r1 = r2
        L_0x0144:
            int r1 = r1.intValue()
            r5.height = r1
        L_0x014a:
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r5 = r4.f80636h
            if (r5 == 0) goto L_0x0174
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x0174
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r1 = r4.f80636h
            if (r1 == 0) goto L_0x016d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x016d
            int r1 = r1.width
            android.content.Context r3 = r4.f80633e
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r0)
            int r3 = (int) r3
            int r1 = r1 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x016e
        L_0x016d:
            r1 = r2
        L_0x016e:
            int r1 = r1.intValue()
            r5.width = r1
        L_0x0174:
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r5 = r4.f80636h
            if (r5 == 0) goto L_0x019c
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x019c
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r1 = r4.f80636h
            if (r1 == 0) goto L_0x0196
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x0196
            int r1 = r1.height
            android.content.Context r2 = r4.f80633e
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r2, r0)
            int r0 = (int) r0
            int r1 = r1 + r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L_0x0196:
            int r0 = r2.intValue()
            r5.height = r0
        L_0x019c:
            com.bytedance.ies.dmt.ui.widget.b r5 = new com.bytedance.ies.dmt.ui.widget.b
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r0, r1)
            android.view.View$OnTouchListener r5 = (android.view.View.OnTouchListener) r5
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r0 = r4.f80634f
            if (r0 == 0) goto L_0x01ae
            r0.setOnTouchListener(r5)
        L_0x01ae:
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r0 = r4.f80635g
            if (r0 == 0) goto L_0x01b5
            r0.setOnTouchListener(r5)
        L_0x01b5:
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r5 = r4.f80634f
            if (r5 == 0) goto L_0x01bf
            r0 = r4
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r5.setOnClickListener(r0)
        L_0x01bf:
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r5 = r4.f80635g
            if (r5 == 0) goto L_0x01c9
            r0 = r4
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r5.setOnClickListener(r0)
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30769as.<init>(android.view.View):void");
    }

    /* renamed from: a */
    private final void m72144a(SmartAvatarBorderView smartAvatarBorderView, boolean z) {
        String str;
        if (C26469cc.m63998a(this.f80629a, (SmartImageView) smartAvatarBorderView)) {
            if (z) {
                C25945k.m62923n().mo54135a(C26469cc.m64003d(this.f80629a));
            }
            return;
        }
        StringBuilder sb = new StringBuilder("FeedAvatarView_");
        if (this.f80629a == null) {
            str = "no_aid";
        } else {
            Aweme aweme = this.f80629a;
            if (aweme == null) {
                C52711k.m112234a();
            }
            str = aweme.getAid();
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (this.f80629a != null) {
            Aweme aweme2 = this.f80629a;
            if (aweme2 == null) {
                C52711k.m112234a();
            }
            if (aweme2.getAuthor() != null) {
                Aweme aweme3 = this.f80629a;
                if (aweme3 == null) {
                    C52711k.m112234a();
                }
                User author = aweme3.getAuthor();
                C52711k.m112236a((Object) author, "mAweme!!.author");
                if (author.getAvatarThumb() != null) {
                    Aweme aweme4 = this.f80629a;
                    if (aweme4 == null) {
                        C52711k.m112234a();
                    }
                    User author2 = aweme4.getAuthor();
                    C52711k.m112236a((Object) author2, "mAweme!!.author");
                    UrlModel avatarThumb = author2.getAvatarThumb();
                    C52711k.m112236a((Object) avatarThumb, "mAweme!!.author.avatarThumb");
                    if (!C9376b.m18558a((Collection<T>) avatarThumb.getUrlList())) {
                        if (smartAvatarBorderView == this.f80634f && C30224d.m70966a()) {
                            String str2 = "FeedAvatarView";
                            StringBuilder sb3 = new StringBuilder("loadAvatarViews:");
                            Aweme aweme5 = this.f80629a;
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
                            Aweme aweme6 = this.f80629a;
                            if (aweme6 == null) {
                                C52711k.m112234a();
                            }
                            User author4 = aweme6.getAuthor();
                            C52711k.m112236a((Object) author4, "mAweme!!.author");
                            smartAvatarBorderView.mo49062a(author4.getAvatarThumb(), C47788ct.m103417a(BaseNotice.HASHTAG), this.f80638j, this.f80638j, sb2, true);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        C12203q.m24642a(2131953301).mo23127c(true).mo23118a(sb2).mo23116a((C12197k) smartAvatarBorderView).mo23121a();
    }
}
