package com.p683ss.android.ugc.aweme.main;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.video.C48039k;
import com.p683ss.android.ugc.aweme.video.C48121w;

/* renamed from: com.ss.android.ugc.aweme.main.bx */
public final class C36543bx extends TiktokBaseMainHelper {

    /* renamed from: a */
    public boolean f93633a;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo75659a() {
        boolean isCommentListShowing = C25280a.m61493a().isCommentListShowing(this.f93547b);
        this.f93633a = isCommentListShowing;
        if (!isCommentListShowing) {
            return false;
        }
        C25280a.m61493a().hideCommentList(this.f93547b);
        return true;
    }

    /* renamed from: b */
    public final void mo75620b() {
        super.mo75620b();
        C48121w.m104249M().mo95264A();
        C48039k.m104036a();
        BusinessComponentServiceUtils.getMainHelperService().mo75661b();
        C23324d.m57378a().clearCache();
    }

    public C36543bx(Activity activity) {
        super(activity);
    }
}
