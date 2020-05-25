package com.p683ss.android.ugc.aweme.flowfeed.p1756e;

import android.content.Context;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1517b.C25145b;
import com.p683ss.android.ugc.aweme.comment.services.C25285d;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1752a.C31745a;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31778a;
import com.p683ss.android.ugc.aweme.newfollow.p1994a.C37839b;
import com.p683ss.android.ugc.aweme.p1632di.C27614ba;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.e.a */
public final class C31766a implements C31778a {
    /* renamed from: b */
    public static C31778a m73774b() {
        if (C27991b.f73530z == null) {
            synchronized (C31778a.class) {
                if (C27991b.f73530z == null) {
                    C27991b.f73530z = C27614ba.m66297a();
                }
            }
        }
        return (C31778a) C27991b.f73530z;
    }

    /* renamed from: a */
    public final C31745a mo64675a() {
        return new C37839b();
    }

    /* renamed from: a */
    public final String mo64676a(Comment comment) {
        return C25280a.m61493a().getCommentCategory(comment);
    }

    /* renamed from: a */
    public final void mo64677a(String str) {
        C25280a.m61493a().sendCloseCommentTabEvent(str);
    }

    /* renamed from: a */
    public final C25145b mo64674a(Fragment fragment, int i, C25285d dVar) {
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(dVar, "service");
        return C25280a.m61493a().providerCommentInputManager(fragment, i, dVar);
    }

    /* renamed from: a */
    public final void mo64679a(String str, String str2, String str3, Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        C25280a.m61493a().sendCopyCommentEvent(str, str2, str3, aweme);
    }

    /* renamed from: a */
    public final void mo64680a(String str, String str2, String str3, String str4) {
        C25280a.m61493a().sendEmojiToKeyboardEvent(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final boolean mo64681a(Context context, Exception exc, int i, boolean z) {
        return C25280a.m61493a().handleException(context, exc, i, false);
    }

    /* renamed from: a */
    public final void mo64678a(String str, Aweme aweme, String str2, String str3, String str4) {
        C52711k.m112240b(aweme, "aweme");
        C25280a.m61493a().sendReportCommentEvent(str, aweme, str2, str3, str4);
    }
}
