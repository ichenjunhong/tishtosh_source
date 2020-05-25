package com.p683ss.android.ugc.aweme.initializer;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.initializer.k */
public final class C35698k implements C22055c {

    /* renamed from: a */
    private User f91657a;

    /* renamed from: a */
    public final String mo46157a() {
        return this.f91657a.getUniqueId();
    }

    /* renamed from: b */
    public final String mo46158b() {
        return this.f91657a.getShortId();
    }

    /* renamed from: c */
    public final String mo46159c() {
        return this.f91657a.getUid();
    }

    /* renamed from: d */
    public final boolean mo46160d() {
        return this.f91657a.isSecret();
    }

    /* renamed from: e */
    public final UrlModel mo46161e() {
        return this.f91657a.getAvatarThumb();
    }

    /* renamed from: f */
    public final UrlModel mo46162f() {
        return this.f91657a.getAvatarMedium();
    }

    /* renamed from: g */
    public final String mo46163g() {
        return this.f91657a.getNickname();
    }

    /* renamed from: h */
    public final String mo46164h() {
        return this.f91657a.getCity();
    }

    /* renamed from: i */
    public final int mo46165i() {
        return this.f91657a.getFansCount();
    }

    /* renamed from: j */
    public final boolean mo46166j() {
        return this.f91657a.isFlowcardMember();
    }

    /* renamed from: l */
    public final boolean mo46168l() {
        return this.f91657a.isPostDefaultDownloadSetting();
    }

    /* renamed from: k */
    public final boolean mo46167k() {
        if (this.f91657a.getDownloadSetting() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo46169m() {
        if (this.f91657a.roomId > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo46170n() {
        if (this.f91657a.getCommerceUserLevel() > 0 || !TextUtils.isEmpty(this.f91657a.getEnterpriseVerifyReason())) {
            return true;
        }
        return false;
    }

    public C35698k(User user) {
        this.f91657a = user;
    }
}
