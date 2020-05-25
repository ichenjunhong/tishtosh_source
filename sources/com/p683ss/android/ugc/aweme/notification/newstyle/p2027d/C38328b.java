package com.p683ss.android.ugc.aweme.notification.newstyle.p2027d;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25242m;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.d.b */
public final class C38328b {
    /* renamed from: a */
    public static final String m85623a(Comment comment) {
        if (comment == null) {
            return "";
        }
        if (TextUtils.isEmpty(comment.getCid())) {
            return "";
        }
        if (comment.getUser() == null) {
            return C25242m.m61365a().getDisplayText(comment, false);
        }
        StringBuilder sb = new StringBuilder();
        User user = comment.getUser();
        C52711k.m112236a((Object) user, "user");
        sb.append(C38415g.m85724a(user));
        sb.append(": ");
        sb.append(C25242m.m61365a().getDisplayText(comment, false));
        return sb.toString();
    }
}
