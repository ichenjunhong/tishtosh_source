package com.p683ss.android.ugc.aweme.utils;

import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.utils.n */
public final class C47933n {
    /* renamed from: a */
    public static UrlModel m103706a(User user) {
        if (user == null) {
            return null;
        }
        if (user.getAvatarMedium() != null) {
            return user.getAvatarMedium();
        }
        if (user.getAvatarThumb() != null) {
            return user.getAvatarThumb();
        }
        if (user.getAvatarLarger() != null) {
            return user.getAvatarLarger();
        }
        return null;
    }
}
