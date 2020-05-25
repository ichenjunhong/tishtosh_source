package com.p683ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.bullet.p1471ab.C24100a;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25068e;
import com.p683ss.android.ugc.aweme.profile.experiment.C39867a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40266bq;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40391s;
import com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileEditFragment;
import com.p683ss.android.ugc.aweme.recommend.C41127o;
import com.p683ss.android.ugc.aweme.recommend.RecommendUserDialogShowStrategy;
import com.p683ss.android.ugc.aweme.recommend.RecommendUserDialogTask.C41078a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.service.d */
public final class C40011d implements C40017j {
    /* renamed from: j */
    private static IBridgeService m88906j() {
        return I18nBridgeService.getBridgeService_Monster();
    }

    /* renamed from: a */
    public final void mo82022a() {
        m88906j().checkToTransformMusDraft();
    }

    /* renamed from: b */
    public final C23526a mo82027b() {
        return I18nBridgeService.getBridgeService_Monster().createMyProfileFragment();
    }

    /* renamed from: d */
    public final C23526a mo82031d() {
        return I18nBridgeService.getBridgeService_Monster().createUserProfileFragment();
    }

    /* renamed from: e */
    public final C39867a mo82033e() {
        return (C24100a) C24100a.f63973a.getValue();
    }

    /* renamed from: f */
    public final boolean mo82034f() {
        return m88906j().needShowSafeInfoNotice();
    }

    /* renamed from: g */
    public final void mo82035g() {
        I18nBridgeService.getBridgeService_Monster().onFeedStop();
    }

    /* renamed from: i */
    public final void mo82037i() {
        C47718bf.m103288a(new C25068e());
    }

    /* renamed from: c */
    public final C40391s mo82029c() {
        ProfileEditFragment createUserProfileEditFragment = I18nBridgeService.getBridgeService_Monster().createUserProfileEditFragment();
        if (createUserProfileEditFragment != null) {
            return createUserProfileEditFragment;
        }
        return new ProfileEditFragment();
    }

    /* renamed from: h */
    public final boolean mo82036h() {
        if (!RecommendUserDialogShowStrategy.m90746c() || !C41078a.m90750b() || !C41127o.m90814a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo82023a(Activity activity) {
        C52711k.m112240b(activity, "activity");
        I18nBridgeService.getBridgeService_Monster().enterChildrenModeSetting(activity);
    }

    /* renamed from: c */
    public final void mo82030c(Activity activity) {
        I18nBridgeService.getBridgeService_Monster().setCustomStatusBarInLayout(activity);
    }

    /* renamed from: b */
    public final void mo82028b(Activity activity) {
        C52711k.m112240b(activity, "activity");
        I18nBridgeService.getBridgeService_Monster().openWallet(activity);
    }

    /* renamed from: d */
    public final void mo82032d(Activity activity) {
        I18nBridgeService.getBridgeService_Monster().switchToSignature(activity);
    }

    /* renamed from: a */
    public final void mo82024a(Activity activity, Bundle bundle) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(bundle, "bundle");
        I18nBridgeService.getBridgeService_Monster().enterMyFavorites(activity, bundle);
    }

    /* renamed from: a */
    public final void mo82025a(Activity activity, String str) {
        I18nBridgeService.getBridgeService_Monster().switchToBioUrl(activity, str);
    }

    /* renamed from: a */
    public final void mo82026a(Context context, User user, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        I18nBridgeService.getBridgeService_Monster().startThirdSocialActivity(context, user, i);
    }

    /* renamed from: a */
    public final Intent mo82020a(Context context, int i, int i2, String str, String str2) {
        return I18nBridgeService.getBridgeService_Monster().getAddFriendsActivityIntent(context, i, i2, str, str2);
    }

    /* renamed from: a */
    public final C40266bq mo82021a(int i, int i2, String str, String str2, boolean z, boolean z2) {
        return I18nBridgeService.getBridgeService_Monster().createAwemeListFragment(i, i2, str, str2, z, z2);
    }
}
