package com.p683ss.android.ugc.aweme.friends.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.p1417h.C23540d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.discover.mob.C28383ad;
import com.p683ss.android.ugc.aweme.discover.mob.C28393ak;
import com.p683ss.android.ugc.aweme.experiment.C29503d;
import com.p683ss.android.ugc.aweme.familiar.p1700b.C29642a;
import com.p683ss.android.ugc.aweme.following.p1770ui.C32352x.C32357b;
import com.p683ss.android.ugc.aweme.following.p1770ui.FollowingFollowerActivity.C32049a;
import com.p683ss.android.ugc.aweme.friends.p1792ui.ContactsActivity;
import com.p683ss.android.ugc.aweme.friends.p1792ui.InviteMoreFriendsActivity;
import com.p683ss.android.ugc.aweme.friends.utils.C32782b;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1632di.C27618be;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.profile.util.C40556o;
import com.p683ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47665af;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.service.BaseRecommendDependentImpl */
public abstract class BaseRecommendDependentImpl implements IRecommendDependentService {
    public static IRecommendDependentService provideIRecommendDependentService_Monster() {
        if (C27991b.f73417A == null) {
            synchronized (IRecommendDependentService.class) {
                if (C27991b.f73417A == null) {
                    C27991b.f73417A = C27618be.m66301b();
                }
            }
        }
        return (IRecommendDependentService) C27991b.f73417A;
    }

    public void dislike(String str) {
    }

    public String getAppProtocol() {
        return "https://www.tiktokv.com/aweme/i18n/in_app/term_of_service/";
    }

    public void handleRemarkEditView(User user, int i, TextView textView, View view, boolean z, String str, boolean z2) {
        C52711k.m112240b(user, "user");
        C52711k.m112240b(textView, "userName");
        C52711k.m112240b(view, "editRemark");
        C52711k.m112240b(str, "enterFrom");
    }

    public void showRecommendContact(String str) {
    }

    public boolean checkInsertRecommendContact() {
        return C32782b.f85367a.mo66362a();
    }

    public int getRecommendContactPosition() {
        return C29503d.m69640a();
    }

    public boolean enableFriendRecommendEnhance() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        return C41589c.m91435g();
    }

    public int getShowRemarkIconStyle() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        return C41589c.m91437i();
    }

    public boolean isPrivacyReminder() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        return C41589c.m91439k();
    }

    public int showRemarkIconStyle() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        return C41589c.m91437i();
    }

    public boolean enableFace2Face() {
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf enableFace2Face = inst.getEnableFace2Face();
        C52711k.m112236a((Object) enableFace2Face, "SharePrefCache.inst().enableFace2Face");
        Object d = enableFace2Face.mo47782d();
        C52711k.m112236a(d, "SharePrefCache.inst().enableFace2Face.cache");
        return ((Boolean) d).booleanValue();
    }

    public void cleanUpdateTagCount(String str) {
        C52711k.m112240b(str, "uid");
        C33194e.m76279d().cleanUpdateTagCount(str);
    }

    public int getUpdateTagCount(String str) {
        C52711k.m112240b(str, "uid");
        return C33194e.m76279d().getUpdateTagCount(str);
    }

    public void goToPrivacyActivity(Context context) {
        I18nBridgeService.getBridgeService_Monster().goToPrivacyActivity(context);
    }

    public void startInviteMoreFriendsActivity(Context context) {
        C52711k.m112240b(context, "context");
        context.startActivity(new Intent(context, InviteMoreFriendsActivity.class));
    }

    public String sortLetters(String str) {
        String str2;
        int i;
        if (TextUtils.isEmpty(str)) {
            str2 = "0";
        } else {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            int i3 = 0;
            while (i2 < 12) {
                if (i3 < str.length()) {
                    char charAt = str.charAt(i3);
                    if (Character.isUpperCase(charAt)) {
                        i = str.charAt(i3) - 'A';
                    } else if (Character.isLowerCase(charAt)) {
                        i = (str.charAt(i3) - 'a') + 26;
                        if (i3 == 0) {
                            i -= 26;
                        }
                    } else if (C47665af.m103173a(charAt)) {
                        i = (str.charAt(i3) - '0') + 52;
                    } else if (C47665af.m103176b(charAt)) {
                        i = 62;
                    } else if (C47665af.m103174a(str.substring(i3))) {
                        i = 64;
                    } else {
                        i = 63;
                    }
                } else {
                    i = 0;
                }
                if (i < 10) {
                    sb.append("0");
                }
                if (i == 64) {
                    i3++;
                }
                sb.append(String.valueOf(i));
                i2++;
                i3++;
            }
            str2 = sb.toString();
        }
        C52711k.m112236a((Object) str2, "CharacterUtil.hashCode(spelling)");
        return str2;
    }

    public void launchQRCodePermissionActivity(Context context, boolean z) {
        QRCodePermissionActivity.m90501a(context, z);
    }

    public void startQRCodePermissionActivity(Context context, boolean z) {
        QRCodePermissionActivity.m90501a(context, z);
    }

    public void wrapperSendMessageSyncXIcon(RemoteImageView remoteImageView, int i) {
        C33194e.m76279d().wrapperSendMessageSyncXIcon(remoteImageView, i);
    }

    public void enterContactActivity(Activity activity, C52671b<? super Boolean, C52860x> bVar) {
        C52711k.m112240b(activity, "activity");
        C32782b.m75659a(activity, bVar);
    }

    public Intent getInviteUserListActivityIntent(Activity activity, int i) {
        return I18nBridgeService.getBridgeService_Monster().getInviteUserListActivityIntent(activity, i);
    }

    public <T> T getSP(Context context, Class<T> cls) {
        C52711k.m112240b(cls, "preferencesClass");
        return C23540d.m57713a(context, cls);
    }

    public void launchProfileActivity(Context context, User user) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        UserProfileActivity.m89401a(context, user);
    }

    public void logRecommendContactEvent(String str, String str2) {
        C52711k.m112240b(str, "actionType");
        C32782b.m75660a(str, str2);
    }

    public void startChatActivity(Context context, User user) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        C33194e.m76279d().startChat(context, C33194e.m76261a(user));
    }

    public void openPrivacyReminder(Context context, String str) {
        C52711k.m112240b(context, "context");
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_load_dialog", true);
            intent.putExtra("hide_nav_bar", false);
            intent.putExtra("use_webview_title", true);
            intent.putExtras(bundle);
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        }
    }

    public void startFollowingFollowerActivity(Context context, User user) {
        C52711k.m112240b(context, "context");
        if (user != null) {
            C32049a aVar = new C32049a(context, null, user.getUid(), true, C32357b.follower, 1);
            aVar.mo65246a(user).mo65247a();
        }
    }

    public String getFriendToFamiliarStr(int i, int i2, int i3) {
        return C29642a.m69690a(i, i2, i3);
    }

    public Intent getContactsActivityIntent(Context context, String str, boolean z) {
        if (context == null) {
            C52711k.m112234a();
        }
        Intent a = ContactsActivity.m75414a(context, str, z);
        C52711k.m112236a((Object) a, "ContactsActivity.getInte…om, justGrantReadContact)");
        return a;
    }

    public void startContactActivity(Context context, String str, boolean z) {
        C52711k.m112240b(context, "context");
        if (str == null) {
            str = "";
        }
        context.startActivity(ContactsActivity.m75414a(context, str, z));
    }

    public void watchFromSearch(Context context, User user, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        C52711k.m112240b(str, "previousPage");
        ILiveOuterService a = C36173w.m81665a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
        a.getLiveWatcherUtils().mo70094a(context, user, str);
    }

    public void guideContactToEditRemark(Context context, User user, FollowStatus followStatus, C52671b<? super User, C52860x> bVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        C52711k.m112240b(followStatus, "followStatus");
        C40556o.m89968a(context, user, followStatus);
    }

    public void launchProfileActivity(Context context, User user, String str, String str2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        C47661ab a = C47661ab.m103163a().mo94972a("uid", user.getUid()).mo94972a("sec_user_id", user.getSecUid());
        String str3 = "enter_from";
        if (str == null) {
            str = "find_friends";
        }
        UserProfileActivity.m89400a(context, a.mo94972a(str3, str).mo94972a("enter_from_request_id", str2).mo94969a("from_recommend_card", 1).mo94969a("need_track_compare_recommend_reason", 1).mo94972a("previous_recommend_reason", user.getRecommendReason()).mo94972a("recommend_from_type", "list").f120139a);
    }

    public void launchProfileActivity(Context context, User user, String str, String str2, String str3) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        C52711k.m112240b(str, "enterFrom");
        UserProfileActivity.m89404a(context, user, str, str2, str3);
    }

    public void sendEnterPersonalDetailForAddFriend(int i, String str, int i2, String str2, String str3, String str4) {
        C52711k.m112240b(str, "keyword");
        C52711k.m112240b(str3, "uid");
        C52711k.m112240b(str4, "enterMethod");
        String a = C28393ak.m67382a(str4);
        C23249s s = new C23249s().mo48137c(C28393ak.m67381a(i2)).mo48145t(str2).mo48144s(str3);
        new C28383ad().setOrder(i).setSearchKeyword(str).setRid(str2).setEnterFrom("find_friends").setEnterMethod(a).installToMetrics(s);
        s.mo48076e();
    }

    public void startFollowingFollowerActivity(Context context, Fragment fragment, String str, boolean z, boolean z2, int i, User user) {
        C32357b bVar;
        if (z2) {
            bVar = C32357b.following;
        } else {
            bVar = C32357b.follower;
        }
        C32049a aVar = new C32049a(context, fragment, str, z, bVar, i);
        aVar.mo65246a(user).mo65247a();
    }
}
