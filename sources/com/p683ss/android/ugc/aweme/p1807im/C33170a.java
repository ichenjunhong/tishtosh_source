package com.p683ss.android.ugc.aweme.p1807im;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment;
import com.p683ss.android.ugc.aweme.p1807im.service.C35428b;
import com.p683ss.android.ugc.aweme.p1912k.C35802a;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.model.MigrateABTestModel;
import com.p683ss.android.ugc.aweme.utils.C47789cu;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.a */
abstract class C33170a implements C35428b {

    /* renamed from: a */
    private int f86125a;

    /* renamed from: c */
    public final boolean mo70322c() {
        C41589c.m91432a();
        return C41589c.m91439k();
    }

    /* renamed from: g */
    public final boolean mo70326g() {
        return C35802a.m80931b();
    }

    /* renamed from: h */
    public final boolean mo70327h() {
        return MTNotificationTabMergeExperiment.m85061a();
    }

    /* renamed from: a */
    public final int mo70320a() {
        C41589c.m91432a();
        return MigrateABTestModel.getInstance().getBindPhoneForIm();
    }

    /* renamed from: e */
    public final int mo70324e() {
        return MigrateABTestModel.getInstance().getSingleChatHelloMsg();
    }

    /* renamed from: f */
    public final int mo70325f() {
        return MigrateABTestModel.getInstance().getEnableReadState();
    }

    /* renamed from: d */
    public final boolean mo70323d() {
        if (C10181b.m20511a().mo18168a(IMInnerNotificationExperiment.class, true, "im_inner_push_strategy", 31744, 0) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo70321b() {
        Locale b = C47789cu.m103419b();
        if (TextUtils.equals(b.getLanguage(), Locale.CHINESE.getLanguage()) || TextUtils.equals(b.getLanguage(), Locale.ENGLISH.getLanguage())) {
            return true;
        }
        return false;
    }

    C33170a(int i) {
        this.f86125a = i;
    }
}
