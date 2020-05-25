package com.p683ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.router.SmartRouter;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.C20299a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p683ss.android.ugc.aweme.commercialize.model.C26131l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26502cf;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26515i;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.MuteDownloadForJapanExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1731n.C30534c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30824bz;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30834ca;
import com.p683ss.android.ugc.aweme.guide.p1796a.C32932c;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1382aq.C23207am;
import com.p683ss.android.ugc.aweme.p1632di.C27650cj;
import com.p683ss.android.ugc.aweme.p1807im.C33180c;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.profile.C39833e;
import com.p683ss.android.ugc.aweme.profile.experiment.C39868b;
import com.p683ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41923b;
import com.p683ss.android.ugc.aweme.share.improve.C42155d;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42057ae;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42062ah;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42063ai;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42085f;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42125x;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.p2161a.C42050b;
import com.p683ss.android.ugc.aweme.share.improve.p2162b.C42134b;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42148a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.share.improve.p2164d.C42157a.C42158a;
import com.p683ss.android.ugc.aweme.share.improve.p2164d.C42162b;
import com.p683ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p683ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage.C42171a;
import com.p683ss.android.ugc.aweme.share.improve.pkg.MusicSharePackage;
import com.p683ss.android.ugc.aweme.share.improve.pkg.MusicSharePackage.C42190a;
import com.p683ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import com.p683ss.android.ugc.aweme.share.improve.pkg.UserSharePackage.C42195a;
import com.p683ss.android.ugc.aweme.share.improve.pkg.UserSharePackage.C42195a.C42196a;
import com.p683ss.android.ugc.aweme.share.improve.pkg.UserSharePackage.C42195a.C42197b;
import com.p683ss.android.ugc.aweme.share.libra.NonStandardAdPostExperiment;
import com.p683ss.android.ugc.aweme.share.more.p2166a.C42209a;
import com.p683ss.android.ugc.aweme.share.p2149a.C41936a;
import com.p683ss.android.ugc.aweme.share.p2151c.C41996b;
import com.p683ss.android.ugc.aweme.share.p2159h.C42038d;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d.C42350b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42356f;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42359h;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.ShareChannelBar;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.ss.android.ugc.trill.R;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.p071d.C1710e;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.ar */
public final class C41980ar implements ShareService {

    /* renamed from: a */
    public static final C41981a f106265a = new C41981a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.ar$a */
    public static final class C41981a {
        private C41981a() {
        }

        public /* synthetic */ C41981a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ar$b */
    public static final class C41982b extends C42356f {

        /* renamed from: a */
        final /* synthetic */ Activity f106266a;

        /* renamed from: b */
        final /* synthetic */ Aweme f106267b;

        C41982b(Activity activity, Aweme aweme) {
            this.f106266a = activity;
            this.f106267b = aweme;
        }

        /* renamed from: a */
        public final void mo49959a(C42307b bVar, boolean z, SharePackage sharePackage, Context context) {
            C52711k.m112240b(bVar, "channel");
            C52711k.m112240b(context, "context");
            C26890h.m65005a((Context) this.f106266a, "share_video", bVar.mo86136b(), this.f106267b.getAid(), 0);
            new C23207am().mo47988a("release").mo47954f(this.f106267b).mo47989b(bVar.mo86136b()).mo47987a(0).mo48076e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ar$c */
    static final class C41983c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PhotoContext f106268a;

        /* renamed from: b */
        final /* synthetic */ Activity f106269b;

        /* renamed from: c */
        final /* synthetic */ Aweme f106270c;

        C41983c(PhotoContext photoContext, Activity activity, Aweme aweme) {
            this.f106268a = photoContext;
            this.f106269b = activity;
            this.f106270c = aweme;
        }

        public final void run() {
            if (this.f106268a != null && this.f106269b != null) {
                PhotoUploadSuccessPopView photoUploadSuccessPopView = new PhotoUploadSuccessPopView(this.f106269b, this.f106270c, this.f106268a);
                if (photoUploadSuccessPopView.f106091b != null && !photoUploadSuccessPopView.f106091b.isFinishing() && !photoUploadSuccessPopView.isShowing()) {
                    photoUploadSuccessPopView.f106095f = System.currentTimeMillis() + ((long) photoUploadSuccessPopView.f106090a);
                    photoUploadSuccessPopView.mPullUpLayout.postDelayed(photoUploadSuccessPopView.f106093d, (long) photoUploadSuccessPopView.f106090a);
                    if (photoUploadSuccessPopView.f106092c.getParent() != null) {
                        ((ViewGroup) photoUploadSuccessPopView.f106092c.getParent()).removeView(photoUploadSuccessPopView.f106092c);
                    }
                    View rootView = photoUploadSuccessPopView.f106091b.getWindow().getDecorView().getRootView();
                    int i = VERSION.SDK_INT;
                    photoUploadSuccessPopView.showAtLocation(rootView, 48, 0, -C9432q.m18695e(C11010c.m22280a()));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ar$d */
    static final class C41984d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f106271a;

        /* renamed from: b */
        final /* synthetic */ C30824bz f106272b;

        /* renamed from: c */
        final /* synthetic */ Aweme f106273c;

        C41984d(Activity activity, C30824bz bzVar, Aweme aweme) {
            this.f106271a = activity;
            this.f106272b = bzVar;
            this.f106273c = aweme;
        }

        public final void run() {
            boolean z;
            if (!this.f106271a.isFinishing()) {
                Aweme aweme = this.f106273c;
                if (aweme == null || aweme.getAuthor() == null || aweme.getVideo() == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C30824bz bzVar = this.f106272b;
                    Aweme aweme2 = this.f106273c;
                    C26131l a = CommerceSettingsApi.m62160a();
                    if (!(a == null || a.f69006a == null || !NonStandardAdPostExperiment.m92639a())) {
                        bzVar.f80747g.setBackgroundResource(R.drawable.dx9);
                        ViewGroup viewGroup = (ViewGroup) bzVar.f80745e.findViewById(R.id.c3q);
                        viewGroup.setVisibility(0);
                        ImageView imageView = (ImageView) bzVar.f80745e.findViewById(R.id.c3t);
                        Drawable a2 = C26502cf.m64047a(bzVar.f80745e.getResources(), R.drawable.dxy);
                        if (a2 == null) {
                            imageView.setImageResource(R.color.in);
                        } else {
                            imageView.setImageDrawable(a2);
                        }
                        viewGroup.findViewById(R.id.c3s).bringToFront();
                        DmtTextView dmtTextView = (DmtTextView) viewGroup.findViewById(R.id.c3v);
                        if (TextUtils.isEmpty(a.f69006a.f69040b)) {
                            dmtTextView.setVisibility(8);
                        } else {
                            dmtTextView.setVisibility(0);
                            dmtTextView.setText(a.f69006a.f69040b);
                        }
                        C26515i.m64154a((RemoteImageView) viewGroup.findViewById(R.id.c3u), a.f69006a.f69039a, (C13791d<C14045f>) new C13790c<C14045f>(aweme2) {

                            /* renamed from: a */
                            final /* synthetic */ Aweme f80752a;

                            {
                                this.f80752a = r2;
                            }

                            public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                                C14045f fVar = (C14045f) obj;
                                HashMap hashMap = new HashMap();
                                AwemeStatus status = this.f80752a.getStatus();
                                if (status != null) {
                                    switch (status.getPrivateStatus()) {
                                        case 0:
                                            hashMap.put("privacy_status", "public");
                                            break;
                                        case 1:
                                            hashMap.put("privacy_status", "private");
                                            break;
                                        case 2:
                                            hashMap.put("privacy_status", "friend");
                                            break;
                                    }
                                }
                                hashMap.put("enter_from", "release");
                                C26890h.m65011a("show_ad_sticker", (Map<String, String>) hashMap);
                            }
                        });
                        viewGroup.setOnClickListener(new C30834ca(bzVar, aweme2, a));
                    }
                    this.f106272b.f80746f = this.f106271a;
                    this.f106272b.mo63556b();
                    C30824bz bzVar2 = this.f106272b;
                    bzVar2.f80749i = C23324d.m57378a().updateAweme(this.f106273c);
                    C23515d.m57670a(bzVar2.f80748h, bzVar2.f80749i.getVideo().getCover(), (int) C9432q.m18687b((Context) bzVar2.f80746f, 49.0f), (int) C9432q.m18687b((Context) bzVar2.f80746f, 59.0f));
                    if (bzVar2.f80749i != null && bzVar2.f80749i.isPrivate()) {
                        View view = bzVar2.f80745e;
                        if (view != null) {
                            DmtTextView dmtTextView2 = (DmtTextView) view.findViewById(R.id.di5);
                            DmtTextView dmtTextView3 = (DmtTextView) view.findViewById(R.id.d97);
                            User currentUser = BaseUserService.getBaseUserService_Monster().getCurrentUser();
                            if (dmtTextView2 != null && dmtTextView3 != null && currentUser != null) {
                                Context context = dmtTextView2.getContext();
                                if (C39868b.m88638a()) {
                                    dmtTextView2.setText(context.getString(R.string.h48));
                                    dmtTextView3.setText(context.getString(R.string.h47));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static ShareService m91948a() {
        if (C27991b.f73510f == null) {
            synchronized (ShareService.class) {
                if (C27991b.f73510f == null) {
                    C27991b.f73510f = C27650cj.m66322a();
                }
            }
        }
        return (ShareService) C27991b.f73510f;
    }

    public final C42307b provideAwemeShareChannel(String str, C42307b bVar) {
        C52711k.m112240b(str, "awemeId");
        C52711k.m112240b(bVar, "originChannel");
        return null;
    }

    public final void shareMix(Activity activity, MixStruct mixStruct, List<? extends Aweme> list, String str, String str2) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "previousPage");
    }

    public final boolean getMuteDownloadForJapanExperiment() {
        return C10181b.m20511a().mo18172a(MuteDownloadForJapanExperiment.class, false, "download_video_with_mute", 31744, false);
    }

    public final ShareChannelBar provideImShareChannelBar(Activity activity, ViewGroup viewGroup) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(activity, "activity");
        View inflate = activity.getLayoutInflater().inflate(R.layout.buk, viewGroup);
        if (inflate != null) {
            return (ShareChannelBar) inflate;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar");
    }

    public final void injectUniversalConfig(C42350b bVar, Activity activity, boolean z) {
        C52711k.m112240b(bVar, "builder");
        C42162b.m92530a(bVar, z, activity);
    }

    public final void sharePhotoAfterPublish(Activity activity, Aweme aweme, PhotoContext photoContext) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(photoContext, "context");
        C18842a.m45934b(new C41983c(photoContext, activity, aweme));
    }

    public final C41996b sharePrivateAfterPublishDialog(Activity activity, Aweme aweme, int i) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(aweme, "aweme");
        C30824bz bzVar = new C30824bz();
        if (i > 0) {
            bzVar.f80741a = i;
        }
        C18842a.m45933a(new C41984d(activity, bzVar, aweme), NormalGiftView.MASK_TRANSLATE_VALUE);
        return bzVar;
    }

    public final C41996b shareAfterPublishDialog(Activity activity, Aweme aweme, int i) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(aweme, "aweme");
        SharePackage parseAweme = parseAweme(activity, aweme, -1, "", "");
        C42350b bVar = new C42350b();
        C42038d.m92003a(bVar, C41922a.m91868a().getImChannel(parseAweme, "", -1));
        C42158a.m92528a(bVar, false, C11016e.m22312g());
        bVar.mo86259a(parseAweme).mo86263a("whatsapp_status").mo86261a((C42354e) new C41982b(activity, aweme));
        C42201j jVar = new C42201j(activity, bVar.mo86266a());
        jVar.mo86076a(aweme);
        return jVar;
    }

    public final PopupWindow showSharePanelGuide(Activity activity, View view, C1710e<Boolean> eVar) {
        float f;
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(view, "anchor");
        C32932c cVar = new C32932c(activity, view, eVar);
        if (!cVar.f85593a.isFinishing()) {
            float f2 = -((float) cVar.f85594b.getHeight());
            if (C47842ed.m103485a(cVar.f85593a)) {
                f = C20141b.m49696a((Context) cVar.f85593a, 225.0f);
            } else {
                f = -C20141b.m49696a((Context) cVar.f85593a, 225.0f);
            }
            cVar.showAsDropDown(cVar.f85594b, (int) f, (int) f2);
            C26890h.onEventV3("share_train_banner_show");
        }
        return cVar;
    }

    public final C42205l obtainAvatarEditableShareDialog(User user, Activity activity, C39833e eVar) {
        String str;
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(eVar, "controller");
        C42195a aVar = UserSharePackage.f106703b;
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(eVar, "controller");
        if (user == null || user.getShareInfo() == null) {
            return null;
        }
        Context context = activity;
        UserSharePackage a = C42195a.m92589a(user, context, null);
        if (C47915gg.m103664m(user)) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C42350b bVar = new C42350b();
        SharePackage sharePackage = a;
        C42038d.m92003a(bVar, C41923b.m91869a(C41922a.m91868a(), sharePackage, str, 0, 4, (Object) null));
        C41979aq.m91946a().injectUniversalConfig(bVar, activity, true);
        bVar.f106968i = R.string.dib;
        bVar.mo86270b(false);
        bVar.f106974o = LayoutInflater.from(context).inflate(R.layout.bur, null);
        if (C20854a.m53167g().isMe(user.getUid()) || !user.isSecret()) {
            bVar.mo86258a((C42307b) new C42134b());
            C26890h.m65011a("share_person_show", C23089d.m56640a().mo47829a("enter_method", "click_head").mo47829a("enter_from", str).mo47829a("author_id", user.getUid()).f61491a);
        } else {
            bVar.mo86267b();
        }
        bVar.mo86259a(sharePackage);
        bVar.mo86261a((C42354e) new C42197b(a, str, activity, user));
        C20299a aVar2 = new C20299a(user, activity, eVar, bVar.mo86266a(), 0, 16, null);
        return aVar2;
    }

    public final SharePackage parseAweme(Context context, Aweme aweme, int i, String str, String str2) {
        C52711k.m112240b(context, "activity");
        C52711k.m112240b(aweme, "aweme");
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return C42171a.m92542a(aweme, context, i, str, str2);
    }

    public final C42359h sharePrivateAweme(Activity activity, Fragment fragment, Aweme aweme, C30313ae<C30332aw> aeVar, Bundle bundle) {
        Activity activity2 = activity;
        Fragment fragment2 = fragment;
        Aweme aweme2 = aweme;
        C30313ae<C30332aw> aeVar2 = aeVar;
        Bundle bundle2 = bundle;
        C52711k.m112240b(activity2, "activity");
        C52711k.m112240b(fragment2, "fragment");
        C52711k.m112240b(aweme2, "aweme");
        C52711k.m112240b(aeVar2, "eventListener");
        C52711k.m112240b(bundle2, "extras");
        C52711k.m112240b(activity2, "activity");
        C52711k.m112240b(fragment2, "fragment");
        C52711k.m112240b(aweme2, "aweme");
        C52711k.m112240b(aeVar2, "eventListener");
        C52711k.m112240b(bundle2, "extras");
        String string = bundle2.getString("event_type", "");
        int i = bundle2.getInt("page_type");
        C42171a aVar = AwemeSharePackage.f106655b;
        Context context = activity2;
        C52711k.m112236a((Object) string, "eventType");
        AwemeSharePackage a = C42171a.m92543a(aVar, aweme, context, i, string, null, 16, null);
        a.f106900i.putAll(bundle2);
        C42350b a2 = new C42350b().mo86259a((SharePackage) a);
        C42158a.m92528a(a2, false, C11016e.m22312g());
        a2.mo86267b().mo86270b(false).mo86257a((int) R.string.c7g);
        if (C47950q.m103754c(aweme)) {
            a2.mo86270b(true);
            a.f106900i.putString("is_friend_private", "true");
        }
        C30534c cVar = new C30534c(aweme, true, context, a2, aeVar, string, i);
        cVar.mo62732a();
        C41994c.m91962a(a2, string, aweme2);
        C42359h scoopShareDialogWithImModule = C41922a.m91868a().scoopShareDialogWithImModule(activity2, a2.mo86266a(), R.style.tq);
        scoopShareDialogWithImModule.show();
        return scoopShareDialogWithImModule;
    }

    public final Dialog showMore(Activity activity, Fragment fragment, Aweme aweme, C30313ae<C30332aw> aeVar, Bundle bundle) {
        boolean z;
        String str;
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(aeVar, "eventListener");
        C52711k.m112240b(bundle, "extras");
        C41936a aVar = new C41936a(activity, fragment, aweme, aeVar, bundle);
        C42350b a = new C42350b().mo86259a((SharePackage) C42171a.m92543a(AwemeSharePackage.f106655b, aVar.f106134d, aVar.f106133c, 0, null, null, 28, null)).mo86264a((Comparator<C42357g>) new C42155d<C42357g>());
        Aweme aweme2 = aVar.f106134d;
        Aweme aweme3 = aVar.f106134d;
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf isPrivateAvailable = inst.getIsPrivateAvailable();
        C52711k.m112236a((Object) isPrivateAvailable, "SharePrefCache.inst().isPrivateAvailable");
        Boolean bool = (Boolean) isPrivateAvailable.mo47782d();
        boolean z2 = true;
        if (C47950q.m103755d(aweme3) || C47950q.m103754c(aweme3)) {
            z = true;
        } else {
            z = false;
        }
        IAccountUserService g = C20854a.m53167g();
        User author = aweme3.getAuthor();
        if (author != null) {
            str = author.getUid();
        } else {
            str = null;
        }
        boolean isMe = g.isMe(str);
        C52711k.m112236a((Object) bool, "isPrivateAvailable");
        if (!bool.booleanValue() || !z || !isMe) {
            z2 = false;
        }
        C30534c cVar = new C30534c(aweme2, z2, aVar.f106133c, a, aVar.f106135e, aVar.f106132b, aVar.f106131a);
        cVar.mo62732a();
        if (!aVar.f106133c.isFinishing() && (aVar.f106133c instanceof FragmentActivity) && !((FragmentActivity) aVar.f106133c).isFinishing()) {
            new C42209a(a.mo86266a()).show(((FragmentActivity) aVar.f106133c).getSupportFragmentManager(), "AwemeMore");
        }
        return null;
    }

    public final void shareMusic(Activity activity, Music music, C42356f fVar, List<? extends Aweme> list, String str) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(fVar, "listener");
        C42190a aVar = MusicSharePackage.f106697a;
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(fVar, "listener");
        if (music != null && music.getShareInfo() != null) {
            Context context = activity;
            if (list == null) {
                list = C52575l.m112097a();
            }
            List<? extends Aweme> list2 = list;
            C52711k.m112240b(music, "music");
            C52711k.m112240b(context, "context");
            C52711k.m112240b(list2, "awemeList");
            C42326a a = new C42326a().mo86236a("music");
            String mid = music.getMid();
            C52711k.m112236a((Object) mid, "music.mid");
            C42326a b = a.mo86239b(mid);
            ShareInfo shareInfo = music.getShareInfo();
            C52711k.m112236a((Object) shareInfo, "music.shareInfo");
            String shareTitle = shareInfo.getShareTitle();
            C52711k.m112236a((Object) shareTitle, "music.shareInfo.shareTitle");
            C42326a c = b.mo86240c(shareTitle);
            ShareInfo shareInfo2 = music.getShareInfo();
            C52711k.m112236a((Object) shareInfo2, "music.shareInfo");
            String shareDesc = shareInfo2.getShareDesc();
            C52711k.m112236a((Object) shareDesc, "music.shareInfo.shareDesc");
            C42326a d = c.mo86241d(shareDesc);
            ShareInfo shareInfo3 = music.getShareInfo();
            C52711k.m112236a((Object) shareInfo3, "music.shareInfo");
            String c2 = C42149b.m92516c(C42149b.m92515b(shareInfo3.getShareUrl()));
            if (c2 == null) {
                c2 = "";
            }
            MusicSharePackage musicSharePackage = new MusicSharePackage(d.mo86242e(c2));
            Bundle bundle = musicSharePackage.f106900i;
            bundle.putString("app_name", context.getString(R.string.ip));
            bundle.putString("thumb_url", C23515d.m57664a(music.getCoverThumb()));
            bundle.putSerializable("video_cover", music.getCoverMedium());
            bundle.putString("music_id", music.getMid());
            bundle.putString("process_id", str);
            bundle.putString("music_name", music.getMusicName());
            bundle.putInt("user_count", music.getUserCount());
            bundle.putSerializable("cover_thumb", music.getCoverThumb());
            C42148a.m92509a(bundle, "aweme_cover_list", list2, 3);
            C42350b bVar = new C42350b();
            SharePackage sharePackage = musicSharePackage;
            bVar.mo86259a(sharePackage);
            C42038d.m92003a(bVar, C41922a.m91868a().getImChannel(sharePackage, "", -1));
            C42162b.m92530a(bVar, true, activity);
            bVar.mo86258a((C42307b) new C42134b());
            bVar.mo86262a((C42357g) new C42062ah(music));
            if (SmartRouter.canOpen("//qrcodev2")) {
                bVar.mo86262a((C42357g) new C42050b(music));
            }
            bVar.mo86261a((C42354e) fVar);
            C41922a.m91868a().scoopShareDialogWithImModule(activity, bVar.mo86266a(), R.style.to).show();
        }
    }

    public final void shareProfile(Handler handler, Activity activity, User user, List<? extends Aweme> list, boolean z) {
        String str;
        String str2;
        C52711k.m112240b(activity, "activity");
        C42195a aVar = UserSharePackage.f106703b;
        C52711k.m112240b(activity, "activity");
        if (user != null && user.getShareInfo() != null) {
            UserSharePackage a = C42195a.m92589a(user, activity, list);
            if (C47915gg.m103664m(user)) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            C42350b bVar = new C42350b();
            SharePackage sharePackage = a;
            C42038d.m92003a(bVar, C41923b.m91869a(C41922a.m91868a(), sharePackage, str, 0, 4, (Object) null));
            C41979aq.m91946a().injectUniversalConfig(bVar, activity, true);
            GeneralPermission generalPermission = user.getGeneralPermission();
            if (generalPermission != null) {
                str2 = generalPermission.getShareProfileToast();
            } else {
                str2 = null;
            }
            boolean z2 = false;
            if (!TextUtils.isEmpty(str2)) {
                bVar.mo86270b(false);
            }
            if (C20854a.m53167g().isMe(user.getUid()) || !user.isSecret()) {
                bVar.mo86258a((C42307b) new C42134b());
            } else {
                bVar.mo86267b();
                bVar.mo86270b(false);
            }
            if (handler != null) {
                bVar.mo86262a((C42357g) new C42063ai(user));
                IAccountUserService g = C20854a.m53167g();
                C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                if (g.isLogin()) {
                    bVar.mo86262a((C42357g) new C42085f(user, handler));
                }
                C33180c h = C23794bh.m58394h();
                C52711k.m112236a((Object) h, "LegacyServiceUtils.getIMAdapterService()");
                if (h.mo70345c() || C23794bh.m58394h().mo70346d()) {
                    z2 = true;
                }
                if (!user.isBlock && C23794bh.m58394h().mo70344b() && !C47915gg.m103651b() && !z2) {
                    bVar.mo86262a((C42357g) new C42125x(handler));
                }
                SharePrefCache inst = SharePrefCache.inst();
                C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
                C23051bf removeFollowerSwitch = inst.getRemoveFollowerSwitch();
                C52711k.m112236a((Object) removeFollowerSwitch, "SharePrefCache.inst().removeFollowerSwitch");
                Object d = removeFollowerSwitch.mo47782d();
                C52711k.m112236a(d, "SharePrefCache.inst().removeFollowerSwitch.cache");
                if (((Boolean) d).booleanValue() && user.getFollowerStatus() == 1) {
                    bVar.mo86262a((C42357g) new C42057ae(handler));
                }
            }
            bVar.mo86259a(sharePackage);
            C42196a aVar2 = new C42196a(a, str, activity, user, handler);
            bVar.mo86261a((C42354e) aVar2);
            C42348d a2 = bVar.mo86266a();
            if (!activity.isFinishing()) {
                C41922a.m91868a().scoopShareDialogWithImModule(activity, a2, R.style.to).show();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r3 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (r3 == null) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void shareSticker(android.app.Activity r10, com.p683ss.android.ugc.aweme.sticker.model.C46069d r11, java.lang.String r12, java.util.List<? extends com.p683ss.android.ugc.aweme.feed.model.Aweme> r13, java.lang.String r14) {
        /*
            r9 = this;
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$a r0 = com.p683ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage.f106701a
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            r0 = 0
            if (r11 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r11.shareInfo
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            if (r1 == 0) goto L_0x0115
            r1 = r10
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r2 = "sticker"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r2)
            java.lang.String r2 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r2 = new com.ss.android.ugc.aweme.sharer.ui.SharePackage$a
            r2.<init>()
            java.lang.String r3 = "sticker"
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r2 = r2.mo86236a(r3)
            java.lang.String r3 = r11.f116246id
            java.lang.String r4 = "sticker.id"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r2 = r2.mo86239b(r3)
            com.ss.android.ugc.aweme.base.share.ShareInfo r3 = r11.shareInfo
            if (r3 == 0) goto L_0x0042
            java.lang.String r3 = r3.getShareTitle()
            if (r3 != 0) goto L_0x0044
        L_0x0042:
            java.lang.String r3 = " "
        L_0x0044:
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r2 = r2.mo86240c(r3)
            com.ss.android.ugc.aweme.base.share.ShareInfo r3 = r11.shareInfo
            if (r3 == 0) goto L_0x0052
            java.lang.String r3 = r3.getShareDesc()
            if (r3 != 0) goto L_0x0054
        L_0x0052:
            java.lang.String r3 = " "
        L_0x0054:
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r2 = r2.mo86241d(r3)
            com.ss.android.ugc.aweme.base.share.ShareInfo r3 = r11.shareInfo
            if (r3 == 0) goto L_0x0060
            java.lang.String r0 = r3.getShareUrl()
        L_0x0060:
            java.lang.String r0 = com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b.m92515b(r0)
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = ""
        L_0x0068:
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r0 = r2.mo86242e(r0)
            com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage r2 = new com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage
            r2.<init>(r0)
            android.os.Bundle r3 = r2.f106900i
            java.lang.String r0 = "app_name"
            r4 = 2132541961(0x7f1c0209, float:2.0737013E38)
            java.lang.String r1 = r1.getString(r4)
            r3.putString(r0, r1)
            java.lang.String r0 = "video_cover"
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r11.iconUrl
            java.io.Serializable r1 = (java.io.Serializable) r1
            r3.putSerializable(r0, r1)
            java.lang.String r0 = "sticker_id"
            java.lang.String r1 = r11.f116246id
            r3.putString(r0, r1)
            java.lang.String r0 = "sticker_name"
            java.lang.String r1 = r11.name
            r3.putString(r0, r1)
            java.lang.String r0 = "user_count"
            long r4 = r11.userCount
            r3.putLong(r0, r4)
            java.lang.String r0 = "group_id"
            if (r12 != 0) goto L_0x00a4
            java.lang.String r1 = ""
            goto L_0x00a5
        L_0x00a4:
            r1 = r12
        L_0x00a5:
            r3.putString(r0, r1)
            java.lang.String r0 = "user_id"
            java.lang.String r1 = r11.ownerId
            r3.putString(r0, r1)
            java.lang.String r0 = "log_pb"
            if (r14 != 0) goto L_0x00b5
            java.lang.String r14 = ""
        L_0x00b5:
            r3.putString(r0, r14)
            java.lang.String r4 = "aweme_cover_list"
            r6 = 0
            r7 = 4
            r8 = 0
            r5 = r13
            com.p683ss.android.ugc.aweme.share.improve.p2163c.C42148a.m92509a(r3, r4, r5, 3)
            com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$a$a r13 = new com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$a$a
            r13.<init>(r11)
            com.ss.android.ugc.aweme.sharer.ui.d$b r14 = new com.ss.android.ugc.aweme.sharer.ui.d$b
            r14.<init>()
            com.ss.android.ugc.aweme.share.ShareDependService r3 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            r0 = r2
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r0 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage) r0
            r5 = 0
            r7 = 6
            r4 = r0
            com.ss.android.ugc.aweme.sharer.b r1 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41923b.m91869a(r3, r4, r5, r6, r7, r8)
            com.p683ss.android.ugc.aweme.share.p2159h.C42038d.m92003a(r14, r1)
            com.ss.android.ugc.aweme.share.ShareService r3 = com.p683ss.android.ugc.aweme.share.C41979aq.m91946a()
            r7 = 4
            r4 = r14
            r5 = r10
            r3.injectUniversalConfig(r4, r5, true)
            r14.mo86259a(r0)
            com.ss.android.ugc.aweme.share.improve.b.b r0 = new com.ss.android.ugc.aweme.share.improve.b.b
            r0.<init>()
            com.ss.android.ugc.aweme.sharer.b r0 = (com.p683ss.android.ugc.aweme.sharer.C42307b) r0
            r14.mo86258a(r0)
            com.ss.android.ugc.aweme.share.improve.a.a.c r0 = new com.ss.android.ugc.aweme.share.improve.a.a.c
            r0.<init>(r11, r12)
            com.ss.android.ugc.aweme.sharer.ui.g r0 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g) r0
            r14.mo86262a(r0)
            com.ss.android.ugc.aweme.sharer.ui.e r13 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e) r13
            r14.mo86261a(r13)
            com.ss.android.ugc.aweme.sharer.ui.d r2 = r14.mo86266a()
            com.ss.android.ugc.aweme.share.ShareDependService r0 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            r3 = 0
            r4 = 4
            r5 = 0
            r1 = r10
            com.ss.android.ugc.aweme.sharer.ui.h r10 = r0.scoopShareDialogWithImModule(r1, r2, com.ss.android.ugc.trill.R.style.to)
            r10.show()
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.C41980ar.shareSticker(android.app.Activity, com.ss.android.ugc.aweme.sticker.model.d, java.lang.String, java.util.List, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b2, code lost:
        if (r1 == false) goto L_0x0430;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e8, code lost:
        if (r7 != false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0245, code lost:
        if (r7 != false) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0253, code lost:
        if (com.p683ss.android.ugc.aweme.utils.C47950q.m103754c(r1.f106149l) == false) goto L_0x025b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog shareAweme(android.app.Activity r17, android.support.p030v4.app.Fragment r18, com.p683ss.android.ugc.aweme.feed.model.Aweme r19, boolean r20, com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae<com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw> r21, android.os.Bundle r22) {
        /*
            r16 = this;
            java.lang.String r0 = "activity"
            r2 = r17
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            java.lang.String r0 = "fragment"
            r3 = r18
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            java.lang.String r0 = "aweme"
            r4 = r19
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.lang.String r0 = "eventListener"
            r6 = r21
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.String r0 = "extras"
            r7 = r22
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            com.ss.android.ugc.aweme.share.a.b r0 = new com.ss.android.ugc.aweme.share.a.b
            r1 = r0
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.im.service.experiment.RefineShareInSiteExperiment r1 = com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment.INSTANCE
            boolean r1 = r1.mo73737b()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x00b4
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f106149l
            boolean r5 = r1.isProhibited()
            r6 = 2132551886(0x7f1c28ce, float:2.0757144E38)
            if (r5 != 0) goto L_0x00a6
            boolean r5 = r1.isDelete()
            if (r5 == 0) goto L_0x0048
            goto L_0x00a6
        L_0x0048:
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r5 = r1.getStatus()
            if (r5 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r5 = r1.getStatus()
            java.lang.String r7 = "aweme.status"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
            int r5 = r5.getPrivateStatus()
            if (r5 != r3) goto L_0x005f
            r5 = 1
            goto L_0x0060
        L_0x005f:
            r5 = 0
        L_0x0060:
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r7 = r1.getStatus()
            r8 = 2
            if (r7 == 0) goto L_0x0078
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r7 = r1.getStatus()
            java.lang.String r9 = "aweme.status"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r9)
            int r7 = r7.getPrivateStatus()
            if (r7 != r8) goto L_0x0078
            r7 = 1
            goto L_0x0079
        L_0x0078:
            r7 = 0
        L_0x0079:
            if (r5 == 0) goto L_0x0087
            android.app.Activity r1 = r0.f106147j
            android.content.Context r1 = (android.content.Context) r1
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r1, r6)
            r1.mo19066a()
            goto L_0x00b1
        L_0x0087:
            if (r7 == 0) goto L_0x00a4
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            java.lang.String r5 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)
            int r1 = r1.getFollowStatus()
            if (r1 == r8) goto L_0x00a4
            android.app.Activity r1 = r0.f106147j
            android.content.Context r1 = (android.content.Context) r1
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r1, r6)
            r1.mo19066a()
            goto L_0x00b1
        L_0x00a4:
            r1 = 1
            goto L_0x00b2
        L_0x00a6:
            android.app.Activity r1 = r0.f106147j
            android.content.Context r1 = (android.content.Context) r1
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r1, r6)
            r1.mo19066a()
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            if (r1 == 0) goto L_0x0430
        L_0x00b4:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f106149l
            android.app.Activity r5 = r0.f106147j
            android.content.Context r5 = (android.content.Context) r5
            int r6 = r0.f106138a
            java.lang.String r7 = r0.f106139b
            java.lang.String r8 = "eventType"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            java.lang.String r8 = r0.f106140c
            java.lang.String r9 = "enterMethod"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage r1 = com.p683ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage.C42171a.m92542a(r1, r5, r6, r7, r8)
            android.os.Bundle r5 = r1.f106900i
            android.os.Bundle r6 = r0.f106152o
            r5.putAll(r6)
            com.ss.android.ugc.aweme.sharer.ui.d$b r5 = new com.ss.android.ugc.aweme.sharer.ui.d$b
            r5.<init>()
            r6 = r1
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r6 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage) r6
            com.ss.android.ugc.aweme.sharer.ui.d$b r5 = r5.mo86259a(r6)
            com.ss.android.ugc.aweme.share.ShareDependService r7 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r0.f106149l
            android.support.v4.app.Fragment r9 = r0.f106148k
            boolean r7 = r7.whetherShowForwardView(r8, r9)
            if (r7 == 0) goto L_0x0104
            com.ss.android.ugc.aweme.share.improve.business.AwemeForwardChannel r7 = new com.ss.android.ugc.aweme.share.improve.business.AwemeForwardChannel
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r0.f106149l
            android.support.v4.app.Fragment r9 = r0.f106148k
            java.lang.String r10 = r0.f106139b
            java.lang.String r11 = "eventType"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
            r7.<init>(r8, r9, r10)
            com.ss.android.ugc.aweme.sharer.b r7 = (com.p683ss.android.ugc.aweme.sharer.C42307b) r7
            r5.mo86258a(r7)
        L_0x0104:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f106149l
            r8 = 13
            if (r7 == 0) goto L_0x0112
            int r7 = r7.getAwemeType()
            if (r7 != r8) goto L_0x0112
            r7 = 1
            goto L_0x0113
        L_0x0112:
            r7 = 0
        L_0x0113:
            if (r7 != 0) goto L_0x0128
            com.ss.android.ugc.aweme.share.ShareDependService r7 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            java.lang.String r9 = r0.f106139b
            java.lang.String r10 = "eventType"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r10 = -1
            com.ss.android.ugc.aweme.sharer.b r7 = r7.getImChannel(r6, r9, r10)
            com.p683ss.android.ugc.aweme.share.p2159h.C42038d.m92003a(r5, r7)
        L_0x0128:
            com.ss.android.ugc.aweme.share.improve.d.a$a r7 = com.p683ss.android.ugc.aweme.share.improve.p2164d.C42157a.f106625b
            r9 = 0
            r10 = 0
            r11 = 4
            r12 = 0
            r17 = r7
            r18 = r5
            r19 = r9
            r20 = r10
            r21 = r11
            r22 = r12
            com.p683ss.android.ugc.aweme.share.improve.p2164d.C42157a.C42158a.m92528a(r18, false, com.bytedance.ies.ugc.p694a.C11016e.m22312g())
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f106149l
            boolean r7 = com.p683ss.android.ugc.aweme.utils.C47950q.m103758g(r7)
            if (r7 == 0) goto L_0x014a
            java.lang.String r7 = "copy"
            r5.mo86263a(r7)
        L_0x014a:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f106149l
            if (r7 == 0) goto L_0x01bd
            com.ss.android.ugc.aweme.profile.model.User r9 = r7.getAuthor()
            if (r9 != 0) goto L_0x0155
            goto L_0x01bd
        L_0x0155:
            int r9 = r7.getAwemeType()
            if (r9 == r8) goto L_0x01bd
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r8 = r7.getStatus()
            if (r8 == 0) goto L_0x0172
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r8 = r7.getStatus()
            java.lang.String r9 = "aweme.status"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            int r8 = r8.getPrivateStatus()
            if (r8 != 0) goto L_0x0172
            r8 = 1
            goto L_0x0173
        L_0x0172:
            r8 = 0
        L_0x0173:
            if (r8 == 0) goto L_0x01bd
            com.ss.android.ugc.aweme.IAccountUserService r8 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r9 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            boolean r8 = r8.isLogin()
            if (r8 == 0) goto L_0x01bd
            com.ss.android.ugc.aweme.IAccountUserService r8 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r9 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            java.lang.String r8 = r8.getCurUserId()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.String r9 = r7.getAuthorUid()
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r8 = android.text.TextUtils.equals(r8, r9)
            if (r8 == 0) goto L_0x01bd
            com.ss.android.ugc.aweme.IAccountUserService r8 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r9 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            com.ss.android.ugc.aweme.profile.model.User r8 = r8.getCurUser()
            boolean r8 = r8.isSecret()
            if (r8 == 0) goto L_0x01b3
            goto L_0x01bd
        L_0x01b3:
            com.ss.android.ugc.aweme.share.improve.b.f r8 = new com.ss.android.ugc.aweme.share.improve.b.f
            r8.<init>(r7)
            com.ss.android.ugc.aweme.sharer.b r8 = (com.p683ss.android.ugc.aweme.sharer.C42307b) r8
            r5.mo86258a(r8)
        L_0x01bd:
            com.ss.android.ugc.aweme.share.improve.e.a r7 = new com.ss.android.ugc.aweme.share.improve.e.a
            r7.<init>(r4)
            java.util.Comparator r7 = (java.util.Comparator) r7
            r5.mo86269b(r7)
            boolean r7 = com.p683ss.android.ugc.aweme.language.C35837h.m80982g()
            if (r7 != 0) goto L_0x01ea
            java.util.Locale r7 = java.util.Locale.KOREA
            java.lang.String r7 = r7.getCountry()
            if (r7 == 0) goto L_0x01e7
            java.util.Locale r7 = java.util.Locale.KOREA
            java.lang.String r7 = r7.getCountry()
            java.lang.String r8 = com.p683ss.android.ugc.aweme.language.C35837h.m80980e()
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L_0x01e7
            r7 = 1
            goto L_0x01e8
        L_0x01e7:
            r7 = 0
        L_0x01e8:
            if (r7 == 0) goto L_0x01f0
        L_0x01ea:
            r7 = 2132549133(0x7f1c1e0d, float:2.075156E38)
            r5.mo86257a(r7)
        L_0x01f0:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f106149l
            com.ss.android.ugc.aweme.profile.model.User r7 = r7.getAuthor()
            if (r7 == 0) goto L_0x0247
            com.ss.android.ugc.aweme.IAccountService r7 = com.p683ss.android.ugc.aweme.account.C20854a.m53161a()
            com.ss.android.ugc.aweme.IAccountUserService r7 = r7.userService()
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r0.f106149l
            com.ss.android.ugc.aweme.profile.model.User r8 = r8.getAuthor()
            java.lang.String r9 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            java.lang.String r8 = r8.getUid()
            boolean r7 = r7.isMe(r8)
            if (r7 == 0) goto L_0x0236
            com.ss.android.ugc.aweme.IAccountUserService r7 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r8 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            com.ss.android.ugc.aweme.profile.model.User r7 = r7.getCurUser()
            if (r7 == 0) goto L_0x0236
            com.ss.android.ugc.aweme.IAccountUserService r7 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r8 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            com.ss.android.ugc.aweme.profile.model.User r7 = r7.getCurUser()
            boolean r7 = r7.isSecret()
            goto L_0x0245
        L_0x0236:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f106149l
            com.ss.android.ugc.aweme.profile.model.User r7 = r7.getAuthor()
            java.lang.String r8 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            boolean r7 = r7.isSecret()
        L_0x0245:
            if (r7 != 0) goto L_0x0255
        L_0x0247:
            boolean r7 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r7 != 0) goto L_0x0255
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f106149l
            boolean r7 = com.p683ss.android.ugc.aweme.utils.C47950q.m103754c(r7)
            if (r7 == 0) goto L_0x025b
        L_0x0255:
            r5.mo86267b()
            r5.mo86270b(r4)
        L_0x025b:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f106149l
            boolean r7 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64060c(r7)
            if (r7 == 0) goto L_0x0266
            r5.mo86270b(r4)
        L_0x0266:
            com.ss.android.ugc.aweme.feed.n.c r15 = new com.ss.android.ugc.aweme.feed.n.c
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r0.f106149l
            r9 = 0
            android.app.Activity r7 = r0.f106147j
            r10 = r7
            android.content.Context r10 = (android.content.Context) r10
            com.ss.android.ugc.aweme.feed.h.ae<com.ss.android.ugc.aweme.feed.h.aw> r12 = r0.f106151n
            java.lang.String r13 = r0.f106139b
            java.lang.String r7 = "eventType"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r7)
            int r14 = r0.f106138a
            r7 = r15
            r11 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r15.mo62732a()
            com.ss.android.ugc.aweme.share.a.b$a r7 = new com.ss.android.ugc.aweme.share.a.b$a
            r7.<init>(r0)
            com.ss.android.ugc.aweme.sharer.ui.e r7 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e) r7
            r5.mo86261a(r7)
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f106149l
            if (r7 == 0) goto L_0x02a6
            com.ss.android.ugc.aweme.profile.model.User r8 = r7.getAuthor()
            if (r8 != 0) goto L_0x029e
            r8 = 3
            boolean r8 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63997a(r7, r8)
            if (r8 == 0) goto L_0x02a6
        L_0x029e:
            com.ss.android.ugc.aweme.feed.model.Video r7 = r7.getVideo()
            if (r7 == 0) goto L_0x02a6
            r7 = 1
            goto L_0x02a7
        L_0x02a6:
            r7 = 0
        L_0x02a7:
            if (r7 == 0) goto L_0x0430
            android.support.v4.app.Fragment r7 = r0.f106148k
            if (r7 == 0) goto L_0x02c7
            android.support.v4.app.Fragment r7 = r0.f106148k
            boolean r7 = r7 instanceof com.bytedance.ies.uikit.base.C11079a
            if (r7 == 0) goto L_0x02b4
            goto L_0x02c7
        L_0x02b4:
            android.support.v4.app.Fragment r7 = r0.f106148k
            if (r7 == 0) goto L_0x02bf
            com.bytedance.ies.uikit.base.a r7 = (com.bytedance.ies.uikit.base.C11079a) r7
            boolean r7 = r7.isViewValid()
            goto L_0x02d6
        L_0x02bf:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type com.bytedance.ies.uikit.base.AbsFragment"
            r0.<init>(r1)
            throw r0
        L_0x02c7:
            android.app.Activity r7 = r0.f106147j
            if (r7 == 0) goto L_0x02d5
            android.app.Activity r7 = r0.f106147j
            boolean r7 = r7.isFinishing()
            if (r7 != 0) goto L_0x02d5
            r7 = 1
            goto L_0x02d6
        L_0x02d5:
            r7 = 0
        L_0x02d6:
            if (r7 == 0) goto L_0x0430
            android.app.Activity r7 = r0.f106147j
            boolean r7 = r7.isFinishing()
            if (r7 != 0) goto L_0x0430
            android.os.Bundle r7 = r1.f106900i
            java.lang.String r8 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r0.f106149l
            java.lang.String r9 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56846a(r9)
            r7.putString(r8, r9)
            android.os.Bundle r7 = r1.f106900i
            java.lang.String r8 = "enter_from"
            java.lang.String r9 = r0.f106139b
            r7.putString(r8, r9)
            android.os.Bundle r1 = r1.f106900i
            java.lang.String r7 = "content_type"
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r0.f106149l
            java.lang.String r8 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56879o(r8)
            r1.putString(r7, r8)
            java.lang.String r1 = r0.f106139b
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f106149l
            com.p683ss.android.ugc.aweme.share.C41994c.m91962a(r5, r1, r7)
            java.lang.String r1 = r0.f106139b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r7 = "homepage_follow"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x0319
            goto L_0x036a
        L_0x0319:
            java.lang.String r1 = r0.f106139b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r7 = "homepage_friends"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x0328
            goto L_0x036a
        L_0x0328:
            java.lang.String r1 = r0.f106139b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r7 = "general_search"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x0337
            goto L_0x036a
        L_0x0337:
            java.lang.String r1 = r0.f106139b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r7 = "personal_homepage"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x0350
            java.lang.String r1 = r0.f106145h
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0350
            goto L_0x036a
        L_0x0350:
            java.lang.String r1 = r0.f106139b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r7 = "others_homepage"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x0369
            java.lang.String r1 = r0.f106145h
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0369
            goto L_0x036a
        L_0x0369:
            r3 = 0
        L_0x036a:
            if (r3 == 0) goto L_0x0370
            r1 = 2132607794(0x7f1d0332, float:2.0870539E38)
            goto L_0x0373
        L_0x0370:
            r1 = 2132607796(0x7f1d0334, float:2.0870543E38)
        L_0x0373:
            com.ss.android.ugc.aweme.im.service.experiment.RefineShareInSiteExperiment r3 = com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment.INSTANCE
            boolean r3 = r3.mo73738c()
            if (r3 == 0) goto L_0x041c
            android.os.Bundle r3 = r0.f106152o
            java.lang.String r4 = "download_method"
            java.lang.String r7 = ""
            java.lang.String r3 = r3.getString(r4, r7)
            com.ss.android.ugc.aweme.share.ShareExtService r4 = com.p683ss.android.ugc.aweme.share.C41979aq.m91947b()
            android.app.Activity r7 = r0.f106147j
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r0.f106149l
            java.lang.String r9 = r0.f106139b
            com.ss.android.ugc.aweme.sharer.ui.g r3 = r4.getDownloadAction(r7, r8, r9, r3)
            if (r3 == 0) goto L_0x0414
            com.ss.android.ugc.aweme.share.improve.a.k r3 = (com.p683ss.android.ugc.aweme.share.improve.p2160a.C42098k) r3
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.f106149l
            boolean r4 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72843k(r4)
            if (r4 == 0) goto L_0x03a9
            com.ss.android.ugc.aweme.share.improve.b.c r4 = new com.ss.android.ugc.aweme.share.improve.b.c
            r4.<init>(r3, r6)
            com.ss.android.ugc.aweme.sharer.b r4 = (com.p683ss.android.ugc.aweme.sharer.C42307b) r4
            r5.mo86258a(r4)
        L_0x03a9:
            com.ss.android.ugc.aweme.sharer.ui.d r3 = r5.mo86266a()
            boolean r4 = r0.f106150m
            if (r4 != 0) goto L_0x03f5
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.f106149l
            boolean r4 = com.p683ss.android.ugc.aweme.utils.C47950q.m103758g(r4)
            if (r4 != 0) goto L_0x03f5
            com.ss.android.ugc.aweme.share.ShareService r4 = com.p683ss.android.ugc.aweme.share.C41979aq.m91946a()
            android.app.Activity r5 = r0.f106147j
            com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar r4 = r4.provideImShareChannelBar(r5, r2)
            if (r4 == 0) goto L_0x03f6
            java.util.List<com.ss.android.ugc.aweme.sharer.b> r5 = r3.f106945a
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r5 = r5.iterator()
        L_0x03d4:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x03ef
            java.lang.Object r7 = r5.next()
            r8 = r7
            com.ss.android.ugc.aweme.sharer.b r8 = (com.p683ss.android.ugc.aweme.sharer.C42307b) r8
            android.app.Activity r9 = r0.f106147j
            android.content.Context r9 = (android.content.Context) r9
            boolean r8 = r8.mo86141a(r9)
            if (r8 == 0) goto L_0x03d4
            r6.add(r7)
            goto L_0x03d4
        L_0x03ef:
            java.util.List r6 = (java.util.List) r6
            r4.mo86251a(r6)
            goto L_0x03f6
        L_0x03f5:
            r4 = r2
        L_0x03f6:
            com.ss.android.ugc.aweme.share.ShareDependService r5 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            android.app.Activity r6 = r0.f106147j
            android.app.Dialog r1 = r5.scoopShareDialogWithNewSharePanel(r6, r4, r3, r1)
            if (r1 == 0) goto L_0x0406
            r1.show()
            goto L_0x0407
        L_0x0406:
            r1 = r2
        L_0x0407:
            if (r4 == 0) goto L_0x0413
            com.ss.android.ugc.aweme.share.a.b$b r2 = new com.ss.android.ugc.aweme.share.a.b$b
            r2.<init>(r0, r3, r1)
            com.ss.android.ugc.aweme.sharer.ui.bar.e r2 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.C42345e) r2
            r4.mo86250a(r2)
        L_0x0413:
            return r1
        L_0x0414:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.action.DownloadAction"
            r0.<init>(r1)
            throw r0
        L_0x041c:
            com.ss.android.ugc.aweme.share.ShareDependService r2 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            android.app.Activity r0 = r0.f106147j
            com.ss.android.ugc.aweme.sharer.ui.d r3 = r5.mo86266a()
            com.ss.android.ugc.aweme.sharer.ui.h r0 = r2.scoopShareDialogWithImModule(r0, r3, r1)
            r0.show()
            android.app.Dialog r0 = (android.app.Dialog) r0
            return r0
        L_0x0430:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.C41980ar.shareAweme(android.app.Activity, android.support.v4.app.Fragment, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, com.ss.android.ugc.aweme.feed.h.ae, android.os.Bundle):android.app.Dialog");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0141, code lost:
        if (android.text.TextUtils.equals(r0, r1) != false) goto L_0x014d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void shareChallenge(android.app.Activity r22, com.p683ss.android.ugc.aweme.discover.model.Challenge r23, java.util.List<? extends com.p683ss.android.ugc.aweme.feed.model.Aweme> r24, java.lang.String r25, boolean r26, java.lang.String r27, java.lang.String r28) {
        /*
            r21 = this;
            r6 = r22
            r7 = r23
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage$a r0 = com.p683ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage.f106674a
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            if (r7 == 0) goto L_0x0189
            com.ss.android.ugc.aweme.base.share.ShareInfo r0 = r23.getShareInfo()
            if (r0 != 0) goto L_0x001a
            goto L_0x0189
        L_0x001a:
            r0 = r6
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = "challenge"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r1)
            java.lang.String r1 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r1 = new com.ss.android.ugc.aweme.sharer.ui.SharePackage$a
            r1.<init>()
            java.lang.String r2 = "challenge"
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r1 = r1.mo86236a(r2)
            java.lang.String r2 = r23.getCid()
            java.lang.String r3 = "challenge.cid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r1 = r1.mo86239b(r2)
            com.ss.android.ugc.aweme.base.share.ShareInfo r2 = r23.getShareInfo()
            java.lang.String r3 = "challenge.shareInfo"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r2 = r2.getShareTitle()
            java.lang.String r3 = "challenge.shareInfo.shareTitle"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r1 = r1.mo86240c(r2)
            com.ss.android.ugc.aweme.base.share.ShareInfo r2 = r23.getShareInfo()
            java.lang.String r3 = "challenge.shareInfo"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r2 = r2.getShareDesc()
            java.lang.String r3 = "challenge.shareInfo.shareDesc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r1 = r1.mo86241d(r2)
            com.ss.android.ugc.aweme.base.share.ShareInfo r2 = r23.getShareInfo()
            java.lang.String r3 = "challenge.shareInfo"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r2 = r2.getShareUrl()
            java.lang.String r2 = com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b.m92515b(r2)
            java.lang.String r2 = com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b.m92516c(r2)
            if (r2 != 0) goto L_0x0084
            java.lang.String r2 = ""
        L_0x0084:
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r1 = r1.mo86242e(r2)
            com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage r2 = new com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage
            r2.<init>(r1)
            android.os.Bundle r8 = r2.f106900i
            java.lang.String r1 = "app_name"
            r3 = 2132541961(0x7f1c0209, float:2.0737013E38)
            java.lang.String r0 = r0.getString(r3)
            r8.putString(r1, r0)
            java.lang.String r0 = "uid_for_share"
            com.ss.android.ugc.aweme.profile.model.User r1 = r23.getAuthor()
            java.lang.String r3 = "challenge.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.lang.String r1 = r1.getUid()
            r8.putString(r0, r1)
            java.lang.String r0 = "challenge_id"
            java.lang.String r1 = r23.getCid()
            r8.putString(r0, r1)
            java.lang.String r0 = "process_id"
            r14 = r28
            r8.putString(r0, r14)
            java.lang.String r0 = "challenge_name"
            java.lang.String r1 = r23.getChallengeName()
            r8.putString(r0, r1)
            java.lang.String r0 = "view_count"
            long r3 = r23.getDisplayCount()
            r8.putLong(r0, r3)
            java.lang.String r9 = "cover_thumb"
            r11 = 0
            r12 = 4
            r13 = 0
            r10 = r24
            com.p683ss.android.ugc.aweme.share.improve.p2163c.C42148a.m92509a(r8, r9, r10, 3)
            java.lang.String r17 = "challenge"
            com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage$a$a r8 = new com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage$a$a
            r8.<init>(r7)
            com.ss.android.ugc.aweme.sharer.ui.d$b r9 = new com.ss.android.ugc.aweme.sharer.ui.d$b
            r9.<init>()
            com.ss.android.ugc.aweme.share.ShareDependService r15 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            r10 = r2
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r10 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage) r10
            r18 = 0
            r19 = 4
            r20 = 0
            r16 = r10
            com.ss.android.ugc.aweme.sharer.b r0 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41923b.m91869a(r15, r16, r17, r18, r19, r20)
            com.p683ss.android.ugc.aweme.share.p2159h.C42038d.m92003a(r9, r0)
            com.ss.android.ugc.aweme.share.ShareService r0 = com.p683ss.android.ugc.aweme.share.C41979aq.m91946a()
            r3 = 0
            r4 = 4
            r5 = 0
            r1 = r9
            r2 = r22
            r0.injectUniversalConfig(r1, r2, true)
            com.ss.android.ugc.aweme.share.improve.b.b r0 = new com.ss.android.ugc.aweme.share.improve.b.b
            r0.<init>()
            com.ss.android.ugc.aweme.sharer.b r0 = (com.p683ss.android.ugc.aweme.sharer.C42307b) r0
            r9.mo86258a(r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r1 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r0 = r0.getCurUserId()
            if (r7 == 0) goto L_0x012c
            com.ss.android.ugc.aweme.profile.model.User r1 = r23.getAuthor()
            if (r1 == 0) goto L_0x012c
            java.lang.String r1 = r1.getUid()
            goto L_0x012d
        L_0x012c:
            r1 = 0
        L_0x012d:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0143
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0143
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x014d
        L_0x0143:
            com.ss.android.ugc.aweme.share.improve.a.ag r0 = new com.ss.android.ugc.aweme.share.improve.a.ag
            r0.<init>(r7)
            com.ss.android.ugc.aweme.sharer.ui.g r0 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g) r0
            r9.mo86262a(r0)
        L_0x014d:
            com.ss.android.ugc.aweme.share.improve.a.a.a r11 = new com.ss.android.ugc.aweme.share.improve.a.a.a
            r0 = r11
            r1 = r23
            r2 = r26
            r3 = r25
            r4 = r27
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.sharer.ui.g r11 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g) r11
            r9.mo86262a(r11)
            com.ss.android.ugc.aweme.sharer.ui.e r8 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e) r8
            r9.mo86261a(r8)
            r9.mo86259a(r10)
            com.ss.android.ugc.aweme.sharer.ui.d r0 = r9.mo86266a()
            com.ss.android.ugc.aweme.share.ShareDependService r1 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            r2 = 0
            r3 = 4
            r4 = 0
            r23 = r1
            r24 = r22
            r25 = r0
            r26 = r2
            r27 = r3
            r28 = r4
            com.ss.android.ugc.aweme.sharer.ui.h r0 = r23.scoopShareDialogWithImModule(r24, r25, com.ss.android.ugc.trill.R.style.to)
            r0.show()
            return
        L_0x0189:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.C41980ar.shareChallenge(android.app.Activity, com.ss.android.ugc.aweme.discover.model.Challenge, java.util.List, java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }
}
