package com.p683ss.android.ugc.aweme.compliance.business.api.services;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.compliance.businesses.serviceimpl.ComplianceBusinessServiceImpl;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.api.services.a */
public final class C27021a implements IComplianceBusinessService {

    /* renamed from: a */
    public static final C27021a f71325a = new C27021a();

    /* renamed from: b */
    private final /* synthetic */ IComplianceBusinessService f71326b;

    public final C27022b getBanAppealService() {
        return this.f71326b.getBanAppealService();
    }

    public final Object getCommentFilterPushSettingCallback() {
        return this.f71326b.getCommentFilterPushSettingCallback();
    }

    public final boolean isShowPrivacyAccountSetting() {
        return this.f71326b.isShowPrivacyAccountSetting();
    }

    public final Class<? extends Activity> provideChildrenModeSettingActivityClass() {
        return this.f71326b.provideChildrenModeSettingActivityClass();
    }

    public final void tryShowCommentFilterGuide(Activity activity, Aweme aweme, Comment comment) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(comment, "comment");
        this.f71326b.tryShowCommentFilterGuide(activity, aweme, comment);
    }

    private C27021a() {
        IComplianceBusinessService createIComplianceBusinessServicebyMonsterPlugin = ComplianceBusinessServiceImpl.createIComplianceBusinessServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIComplianceBusinessServicebyMonsterPlugin, "ServiceManager.get().get…inessService::class.java)");
        this.f71326b = createIComplianceBusinessServicebyMonsterPlugin;
    }
}
