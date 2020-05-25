package com.p683ss.android.ugc.aweme.common.p1589a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.base.widget.C23751c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.common.a.d */
public abstract class C26837d extends C23751c<Aweme> {
    public void onViewAttachedToWindow(C1352v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (vVar.mItemViewType == 0) {
            ((C26843i) vVar).mo54775a(true);
        }
    }

    public void onViewDetachedFromWindow(C1352v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (vVar.mItemViewType == 0) {
            C26843i iVar = (C26843i) vVar;
            iVar.mo54775a(false);
            iVar.aR_();
        }
    }

    /* renamed from: a */
    public final int mo54772a(String str) {
        if (this.f70670n == null || this.f70670n.isEmpty() || TextUtils.isEmpty(str)) {
            return -1;
        }
        int size = this.f70670n.size();
        int i = 0;
        while (i < size) {
            Aweme aweme = (Aweme) this.f70670n.get(i);
            if (aweme == null || !C9431p.m18665a(str, aweme.getAid())) {
                i++;
            } else if (this.f63324c != null) {
                return i + 1;
            } else {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo54773a(FollowStatus followStatus) {
        if (this.f70670n != null && !this.f70670n.isEmpty() && followStatus != null && !TextUtils.isEmpty(followStatus.userId)) {
            for (Aweme aweme : this.f70670n) {
                if (aweme != null) {
                    User author = aweme.getAuthor();
                    if (author != null && followStatus.userId.equals(author.getUid())) {
                        author.setFollowStatus(followStatus.followStatus);
                    }
                }
            }
        }
    }
}
