package com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger.p1867a;

import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34550g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34553j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.StrangerSessionList;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34597i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35202ap;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.greenrobot.eventbus.C53755c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.stranger.a.a */
public final class C34680a extends C26875a<C34597i, StrangerSessionList> {

    /* renamed from: a */
    private int f89348a;

    public final boolean checkParams(Object... objArr) {
        return objArr != null;
    }

    public final List<C34597i> getItems() {
        if (this.mData != null) {
            return C34553j.m78483a(((StrangerSessionList) this.mData).getLastMsg());
        }
        return null;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((StrangerSessionList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        m78662a((long) this.f89348a, 20, true);
    }

    public final void refreshList(Object... objArr) {
        m78662a(0, 20, true);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        StrangerSessionList strangerSessionList = (StrangerSessionList) obj;
        if (strangerSessionList == null || C9376b.m18558a((Collection<T>) strangerSessionList.getLastMsg())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        int i = this.mListQueryType;
        if (i == 1) {
            this.mData = strangerSessionList;
            if (this.mIsNewDataEmpty) {
                C53755c.m114319a().mo112960d(new C34550g());
            }
            this.f89348a = 0;
        } else if (i == 4 && !this.mIsNewDataEmpty) {
            List lastMsg = ((StrangerSessionList) this.mData).getLastMsg();
            lastMsg.addAll(strangerSessionList.getLastMsg());
            ((StrangerSessionList) this.mData).setLastMsg(lastMsg);
            ((StrangerSessionList) this.mData).setHasMore(strangerSessionList.isHasMore());
        }
        int i2 = this.f89348a;
        if (strangerSessionList == null || strangerSessionList.getNextCursor() <= 0) {
            this.f89348a += 20;
        } else {
            this.f89348a = strangerSessionList.getNextCursor();
        }
        StringBuilder sb = new StringBuilder("StrangerListModel handleData: originCursor=");
        sb.append(i2);
        sb.append(", nextCursor=");
        sb.append(this.f89348a);
        sb.append(", empty=");
        sb.append(this.mIsNewDataEmpty);
        C32458a.m75144a(sb.toString());
    }

    /* renamed from: a */
    private void m78662a(long j, long j2, boolean z) {
        StringBuilder sb = new StringBuilder("StrangerListModel fetchStrangerSessionList: ");
        sb.append(j);
        sb.append(", 20");
        C32458a.m75144a(sb.toString());
        C23566n a = C23566n.m57766a();
        C9381g gVar = this.mHandler;
        final long j3 = j;
        C346811 r0 = new Callable(20, true) {
            public final Object call() throws Exception {
                try {
                    return C35286u.m79864a(j3, 20, true);
                } catch (ExecutionException e) {
                    throw C35202ap.m79581a(e);
                }
            }
        };
        a.mo48750a(gVar, r0, 0);
    }
}
