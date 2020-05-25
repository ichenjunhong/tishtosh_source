package com.p683ss.android.ugc.aweme.friends.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.p030v4.app.C0636b;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.jedi.p725a.p733f.C11585a;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23392f;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.friends.C32502a;
import com.p683ss.android.ugc.aweme.friends.adapter.C32541p;
import com.p683ss.android.ugc.aweme.friends.adapter.C32542q;
import com.p683ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.p683ss.android.ugc.aweme.friends.p1790d.C32579a;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32715ae;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32741aq;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32772s;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32773t;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32774u;
import com.p683ss.android.ugc.aweme.friends.p1792ui.ContactsActivity;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IRecommendContactItemView;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IRecommendFriendItemViewV2;
import com.p683ss.android.ugc.aweme.friends.p1792ui.InviteFriendsActivity;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendContactItemView;
import com.p683ss.android.ugc.aweme.friends.recommendlist.repository.C32590a;
import com.p683ss.android.ugc.aweme.friends.recommendlist.repository.C32594d;
import com.p683ss.android.ugc.aweme.friends.utils.C32783c;
import com.p683ss.android.ugc.aweme.friends.utils.C32783c.C32784a;
import com.p683ss.android.ugc.aweme.friends.utils.C32783c.C32785b;
import com.p683ss.android.ugc.aweme.friends.utils.C32783c.C32786c;
import com.p683ss.android.ugc.aweme.friends.utils.C32796e;
import com.p683ss.android.ugc.aweme.friends.utils.ContactPermissionExperiment;
import com.p683ss.android.ugc.aweme.friends.utils.FacebookPermissionExperiment;
import com.p683ss.android.ugc.aweme.p1632di.C27618be;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39971i;
import com.p683ss.android.ugc.aweme.recommend.C41107c;
import com.p683ss.android.ugc.aweme.utils.C47673an;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.trill.p2516b.p2517a.C50310a;
import java.util.HashMap;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl */
public final class FriendsServiceImpl implements IFriendsService {
    private volatile boolean mHasInitialized;
    private C32618e mThirdPatryFriendsService;

    /* renamed from: com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl$a */
    static final class C32610a<T> implements C1710e<String> {

        /* renamed from: a */
        public static final C32610a f84861a = new C32610a();

        C32610a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl$b */
    static final class C32611b<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C32611b f84862a = new C32611b();

        C32611b() {
        }

        public final /* synthetic */ void accept(Object obj) {
            C32458a.m75148a((Throwable) obj);
        }
    }

    private final void init() {
        C32615b.f84864a = this;
    }

    public static IFriendsService provideIFriendsService_Monster() {
        if (C27991b.f73430N == null) {
            synchronized (IFriendsService.class) {
                if (C27991b.f73430N == null) {
                    C27991b.f73430N = C27618be.m66300a();
                }
            }
        }
        return (IFriendsService) C27991b.f73430N;
    }

    public final void hasShownComplianceDialog() {
        C32783c.f85369b = true;
    }

    public final boolean hasShownFriendslistPermissionPopUp() {
        return C32783c.f85368a;
    }

    public final void launchAddFriendActivity(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "enterFrom");
    }

    public final void startChatActivity(Context context, User user) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
    }

    public final void wrapperSendMessageSyncXIcon(RemoteImageView remoteImageView, int i) {
    }

    public final C11585a<String, String, DislikeRecommendParams, String> createDislikeRecommendFetcher() {
        return new C32590a<>();
    }

    public final C32541p createRecommendAwemeAdapter() {
        return new C32542q();
    }

    public final C32579a createRecommendListRepository() {
        return new C32594d();
    }

    public final C32617d getContactService() {
        return new C32614a();
    }

    public final C32772s getFollowPresenter() {
        return new C39971i();
    }

    private final void tryInit() {
        if (!this.mHasInitialized) {
            this.mHasInitialized = true;
            init();
        }
    }

    public final C32618e thirdPartyFriendsService() {
        tryInit();
        if (this.mThirdPatryFriendsService == null) {
            this.mThirdPatryFriendsService = new C32620g();
        }
        return this.mThirdPatryFriendsService;
    }

    public final int needHomepageShowPermissionPopUp() {
        int i = Integer.MAX_VALUE;
        switch (C32783c.m75662a("homepage_hot")) {
            case 1:
                C32796e a = ContactPermissionExperiment.m75656a();
                if (a != null) {
                    if (a.f85391b) {
                        i = a.f85392c;
                        break;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                }
                break;
            case 2:
                C32796e a2 = FacebookPermissionExperiment.m75657a();
                if (a2 != null) {
                    if (a2.f85391b) {
                        i = a2.f85392c;
                        break;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                }
                break;
        }
        return i;
    }

    public final void setPermissionPopUpNextTime(int i) {
        C32783c.m75663a(i);
    }

    public final void setShownFriendslistPermissionPopUp(boolean z) {
        C32783c.f85368a = z;
    }

    public final int checkFriendslistPermissionPopUp(String str) {
        C52711k.m112240b(str, "enterFrom");
        return C32783c.m75662a(str);
    }

    public final C32773t createRecommendContactViewHolder(IRecommendContactItemView iRecommendContactItemView) {
        C52711k.m112240b(iRecommendContactItemView, "recommendContactItemView");
        return new C32715ae(iRecommendContactItemView);
    }

    public final C32774u createRecommendFriendItemViewV2Holder(IRecommendFriendItemViewV2 iRecommendFriendItemViewV2) {
        C52711k.m112240b(iRecommendFriendItemViewV2, "view");
        C52711k.m112240b(iRecommendFriendItemViewV2, "view");
        return null;
    }

    public final boolean isContactsActivityOrInviteFriendsActivity(Activity activity) {
        if ((activity instanceof ContactsActivity) || (activity instanceof InviteFriendsActivity)) {
            return true;
        }
        return false;
    }

    public final void setPermissionNextPopUp(int i) {
        String str;
        if (i == 1) {
            str = "facebook_friend_list";
        } else {
            str = "contact_list";
        }
        C32783c.m75665a(str, 0);
    }

    public final IRecommendContactItemView createRecommendContactItemView(Context context) {
        C52711k.m112240b(context, "context");
        RecommendContactItemView recommendContactItemView = new RecommendContactItemView(context, null, 0, 6, null);
        return recommendContactItemView;
    }

    public final Intent getFriendListIntent(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "enterFrom");
        return new Intent();
    }

    public final void openPrivacyReminder(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "url");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "url");
    }

    public final void returnResult(int i, Object obj) {
        if (i == 1 && this.mThirdPatryFriendsService != null) {
            C32618e eVar = this.mThirdPatryFriendsService;
            if (eVar != null) {
                eVar.mo66143a(obj);
            }
        }
    }

    public final void dislikeRecommendUser(String str, String str2) {
        C52711k.m112240b(str, "uid");
        C47718bf.m103288a(new C41107c(str));
        new C32590a().mo22318c(new DislikeRecommendParams(str, str2)).mo6505a((C1710e<? super T>) C32610a.f84861a, (C1710e<? super Throwable>) C32611b.f84862a);
    }

    public final void showFriendslistPermissionPopUp(int i, String str) {
        C52711k.m112240b(str, "enterFrom");
        if (i != 0) {
            C52711k.m112240b(str, "enterFrom");
            switch (i) {
                case 1:
                    C32783c cVar = C32783c.f85371d;
                    Activity g = C11016e.m22312g();
                    if (g != null) {
                        if (VERSION.SDK_INT >= 23) {
                            if (((C32502a) C23392f.m57473a(g, C32502a.class)).mo48497a(false) && !C0636b.m1719a(g, C32783c.f85370c[0])) {
                                C32783c.m75664a(g, 0, str, new C32785b(str));
                                break;
                            } else {
                                C47673an.m103184a(g, new C32784a(str));
                                C32783c.m75663a(0);
                                C26890h.m65011a("show_authorize_contact_pop_up", C23089d.m56640a().mo47829a("enter_from", str).mo47829a("pop_up_type", "authorize").f61491a);
                                break;
                            }
                        } else {
                            C32783c.m75664a(g, 0, str, new C32786c(str));
                            return;
                        }
                    }
                    break;
                case 2:
                    C32783c cVar2 = C32783c.f85371d;
                    Activity g2 = C11016e.m22312g();
                    if (g2 != null && TextUtils.isEmpty(C50310a.m108577b()) && (TextUtils.equals(str, "others_homepage") || Keva.getRepo("friendslist_permission_keva_name").getLong("facebook_next_time_key", 0) < System.currentTimeMillis())) {
                        C32783c.m75664a(g2, 1, str, null);
                    }
                    return;
            }
        }
    }

    public final IRecommendFriendItemViewV2 createRecommendFriendItemViewV2(Context context, HashMap<String, Boolean> hashMap, boolean z) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(hashMap, "followClickMap");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(hashMap, "followClickMap");
        return null;
    }

    public final Intent getFindFriendsIntent(Context context, int i, int i2, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "enterFrom");
        return new Intent();
    }

    public final IRecommendFriendItemViewV2 createRecommendUserDialogItemView(Context context, HashMap<String, Boolean> hashMap, boolean z, boolean z2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(hashMap, "followClickMap");
        C32741aq aqVar = new C32741aq(context, null, 0, hashMap, 6, null);
        return aqVar;
    }

    public final IRecommendFriendItemViewV2 createRecommendUserModalDialogItemView(Context context, HashMap<String, Boolean> hashMap, boolean z, boolean z2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(hashMap, "followClickMap");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(hashMap, "followClickMap");
        return null;
    }
}
