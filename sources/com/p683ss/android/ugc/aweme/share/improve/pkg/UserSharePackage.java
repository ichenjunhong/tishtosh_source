package com.p683ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30471a;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30478c.C30479a;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad.C23197a;
import com.p683ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42063ai;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42079d;
import com.p683ss.android.ugc.aweme.share.improve.p2162b.C42134b;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42148a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e.C42355a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage */
public final class UserSharePackage extends LinkDefaultSharePackage {

    /* renamed from: b */
    public static final C42195a f106703b = new C42195a(null);

    /* renamed from: a */
    public User f106704a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage$a */
    public static final class C42195a {

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage$a$a */
        public static final class C42196a implements C42354e {

            /* renamed from: a */
            final /* synthetic */ UserSharePackage f106705a;

            /* renamed from: b */
            final /* synthetic */ String f106706b;

            /* renamed from: c */
            final /* synthetic */ Activity f106707c;

            /* renamed from: d */
            final /* synthetic */ User f106708d;

            /* renamed from: e */
            final /* synthetic */ Handler f106709e;

            /* renamed from: a */
            public final void mo49960a(SharePackage sharePackage, Context context) {
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
                C42355a.m92983a(this, sharePackage, context);
            }

            /* renamed from: b */
            public final void mo49962b(SharePackage sharePackage, Context context) {
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
                C42355a.m92984b(this, sharePackage, context);
            }

            /* renamed from: a */
            public final void mo49961a(C42357g gVar, SharePackage sharePackage, Context context) {
                C52711k.m112240b(gVar, "action");
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
                if (gVar instanceof C42079d) {
                    C42195a.m92590a("copy", this.f106708d);
                    C42195a.m92591a(gVar.mo49954c(), true, sharePackage, context, this.f106708d);
                    return;
                }
                if (gVar instanceof C42063ai) {
                    C42195a.m92590a("report", this.f106708d);
                }
            }

            /* renamed from: a */
            public final void mo49959a(C42307b bVar, boolean z, SharePackage sharePackage, Context context) {
                C52711k.m112240b(bVar, "channel");
                C52711k.m112240b(context, "context");
                C42195a.m92591a(bVar.mo86136b(), z, sharePackage, context, this.f106708d);
                if (bVar instanceof C42134b) {
                    C42195a.m92590a("copy", this.f106708d);
                }
            }

            public C42196a(UserSharePackage userSharePackage, String str, Activity activity, User user, Handler handler) {
                this.f106705a = userSharePackage;
                this.f106706b = str;
                this.f106707c = activity;
                this.f106708d = user;
                this.f106709e = handler;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage$a$b */
        public static final class C42197b implements C42354e {

            /* renamed from: a */
            final /* synthetic */ UserSharePackage f106710a;

            /* renamed from: b */
            final /* synthetic */ String f106711b;

            /* renamed from: c */
            final /* synthetic */ Activity f106712c;

            /* renamed from: d */
            final /* synthetic */ User f106713d;

            /* renamed from: a */
            public final void mo49960a(SharePackage sharePackage, Context context) {
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
                C42355a.m92983a(this, sharePackage, context);
            }

            /* renamed from: b */
            public final void mo49962b(SharePackage sharePackage, Context context) {
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
                C42355a.m92984b(this, sharePackage, context);
            }

            /* renamed from: a */
            public final void mo49961a(C42357g gVar, SharePackage sharePackage, Context context) {
                C52711k.m112240b(gVar, "action");
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
                C52711k.m112240b(gVar, "action");
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
            }

            public C42197b(UserSharePackage userSharePackage, String str, Activity activity, User user) {
                this.f106710a = userSharePackage;
                this.f106711b = str;
                this.f106712c = activity;
                this.f106713d = user;
            }

            /* renamed from: a */
            public final void mo49959a(C42307b bVar, boolean z, SharePackage sharePackage, Context context) {
                C52711k.m112240b(bVar, "channel");
                C52711k.m112240b(context, "context");
                C42195a.m92591a(bVar.mo86136b(), z, sharePackage, context, this.f106713d);
                C26890h.m65011a("share_person", C23089d.m56640a().mo47829a("platform", bVar.mo86136b()).mo47829a("enter_method", "click_head").mo47829a("enter_from", this.f106711b).mo47829a("author_id", this.f106713d.getUid()).f61491a);
            }
        }

        private C42195a() {
        }

        public /* synthetic */ C42195a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m92590a(String str, User user) {
            String str2;
            C52711k.m112240b(str, "type");
            if (user != null) {
                C23197a b = C23196ad.m56841a("share_person").mo47957b("platform", str).mo47957b("target_id", user.getUid());
                String str3 = "enter_from";
                if (C47915gg.m103664m(user)) {
                    str2 = "personal_homepage";
                } else {
                    str2 = "others_homepage";
                }
                b.mo47957b(str3, str2).mo48076e();
            }
        }

        /* renamed from: a */
        public static UserSharePackage m92589a(User user, Context context, List<? extends Aweme> list) {
            boolean z;
            String str;
            C52711k.m112240b(user, "user");
            C52711k.m112240b(context, "context");
            C42326a aVar = new C42326a();
            String uid = user.getUid();
            C52711k.m112236a((Object) uid, "user.uid");
            String string = context.getString(R.string.ip);
            C52711k.m112236a((Object) string, "context.getString(R.string.app_name)");
            C42326a a = aVar.mo86239b(uid).mo86237a("app_name", string);
            ShareInfo shareInfo = user.getShareInfo();
            C52711k.m112236a((Object) shareInfo, "user.shareInfo");
            String shareTitle = shareInfo.getShareTitle();
            C52711k.m112236a((Object) shareTitle, "user.shareInfo.shareTitle");
            C42326a c = a.mo86240c(shareTitle);
            ShareInfo shareInfo2 = user.getShareInfo();
            C52711k.m112236a((Object) shareInfo2, "user.shareInfo");
            String shareWeiboDesc = shareInfo2.getShareWeiboDesc();
            C52711k.m112236a((Object) shareWeiboDesc, "user.shareInfo.shareWeiboDesc");
            C42326a d = c.mo86241d(shareWeiboDesc);
            ShareInfo shareInfo3 = user.getShareInfo();
            C52711k.m112236a((Object) shareInfo3, "user.shareInfo");
            String c2 = C42149b.m92516c(C42149b.m92515b(C42149b.m92513a(shareInfo3.getShareUrl())));
            if (c2 == null) {
                c2 = "";
            }
            String uid2 = user.getUid();
            C52711k.m112236a((Object) uid2, "user.uid");
            C42326a a2 = d.mo86242e(c2).mo86236a("user").mo86237a("uid", uid2);
            String str2 = "sec_user_id";
            String secUid = user.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            C42326a a3 = a2.mo86237a(str2, secUid);
            String str3 = LeakCanaryFileProvider.f132049i;
            String nickname = user.getNickname();
            C52711k.m112236a((Object) nickname, "user.nickname");
            C42326a a4 = a3.mo86237a(str3, nickname);
            String str4 = "desc";
            CharSequence uniqueId = user.getUniqueId();
            if (uniqueId == null || uniqueId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = user.getShortId();
            } else {
                str = user.getUniqueId();
            }
            C52711k.m112236a((Object) str, "if (user.uniqueId.isNull…hortId else user.uniqueId");
            C42326a a5 = a4.mo86237a(str4, str);
            if (!C47915gg.m103652b(user, C47915gg.m103664m(user)) && list != null && list.size() >= 3) {
                C42148a.m92509a(a5.f106907f, "aweme_cover_list", list, 3);
            }
            a5.f106907f.putSerializable("video_cover", user.getAvatarMedium());
            UserSharePackage userSharePackage = new UserSharePackage(a5);
            userSharePackage.f106704a = user;
            return userSharePackage;
        }

        /* renamed from: a */
        public static void m92591a(String str, boolean z, SharePackage sharePackage, Context context, User user) {
            C52711k.m112240b(str, "channelKey");
            C52711k.m112240b(context, "context");
            if (z && user != null) {
                C26851b bVar = new C26851b();
                bVar.mo54799a(new C30471a());
                bVar.mo44934a_(new C30479a().mo60897a(user.getUid()).mo60896a(1).mo60902d(4).mo60900b(str).mo60898a());
            }
        }
    }

    public UserSharePackage(C42326a aVar) {
        C52711k.m112240b(aVar, "builder");
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo85939a(C42307b bVar, Context context) {
        CharSequence charSequence;
        C52711k.m112240b(bVar, "channel");
        C52711k.m112240b(context, "context");
        User user = this.f106704a;
        if (user == null) {
            C52711k.m112237a("user");
        }
        GeneralPermission generalPermission = user.getGeneralPermission();
        String str = null;
        if (generalPermission != null) {
            charSequence = generalPermission.getShareProfileToast();
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            User user2 = this.f106704a;
            if (user2 == null) {
                C52711k.m112237a("user");
            }
            GeneralPermission generalPermission2 = user2.getGeneralPermission();
            if (generalPermission2 != null) {
                str = generalPermission2.getShareProfileToast();
            }
            C10691a.m21545b(context, str).mo19066a();
            return true;
        }
        C41979aq.m91947b().addShareRecord(bVar.mo86136b(), 2);
        return false;
    }

    /* renamed from: a */
    public final boolean mo86154a(C42357g gVar, Context context) {
        CharSequence charSequence;
        C52711k.m112240b(gVar, "action");
        C52711k.m112240b(context, "context");
        if (gVar instanceof C42079d) {
            User user = this.f106704a;
            if (user == null) {
                C52711k.m112237a("user");
            }
            GeneralPermission generalPermission = user.getGeneralPermission();
            String str = null;
            if (generalPermission != null) {
                charSequence = generalPermission.getShareProfileToast();
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                User user2 = this.f106704a;
                if (user2 == null) {
                    C52711k.m112237a("user");
                }
                GeneralPermission generalPermission2 = user2.getGeneralPermission();
                if (generalPermission2 != null) {
                    str = generalPermission2.getShareProfileToast();
                }
                C10691a.m21545b(context, str).mo19066a();
                return true;
            }
        }
        return false;
    }
}
