package com.p683ss.android.ugc.aweme.newfollow.p2001h;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27369c;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27379l;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.follow.p1765d.C31871a;
import com.p683ss.android.ugc.aweme.follow.presenter.C31877a;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.p683ss.android.ugc.aweme.forward.api.ForwardApi;
import com.p683ss.android.ugc.aweme.forward.model.UserDynamicList;
import com.p683ss.android.ugc.aweme.net.C37776h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.h.b */
public final class C37882b extends C27369c<FollowFeed, FollowFeedList> implements C27379l, Cloneable {
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    /* renamed from: a */
    public final List<Aweme> mo55861a() {
        return C31877a.m74301a(getItems());
    }

    public final List<FollowFeed> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FollowFeedList) this.mData).getItems();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C37882b clone() {
        try {
            C37882b bVar = (C37882b) super.clone();
            bVar.mData = ((FollowFeedList) this.mData).clone();
            return bVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((FollowFeedList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        if (objArr.length >= 3) {
            m84631a((String) objArr[1], (String) objArr[2], 0, 0, 20);
            return;
        }
        m84631a((String) objArr[1], (String) null, 0, 0, 20);
    }

    public final void loadMoreList(Object... objArr) {
        long j = 0;
        if (objArr.length >= 3) {
            String str = (String) objArr[1];
            String str2 = (String) objArr[2];
            if (!C9376b.m18558a((Collection<T>) getItems())) {
                j = ((FollowFeedList) this.mData).getMaxCursor();
            }
            m84631a(str, str2, j, -1, 10);
            return;
        }
        String str3 = (String) objArr[1];
        if (!C9376b.m18558a((Collection<T>) getItems())) {
            j = ((FollowFeedList) this.mData).getMaxCursor();
        }
        m84631a(str3, (String) null, j, -1, 10);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        FollowFeedList followFeedList = (FollowFeedList) obj;
        if (followFeedList == null || C9376b.m18558a((Collection<T>) followFeedList.getItems())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (this.mListQueryType == 2 && !isDataEmpty()) {
                ((FollowFeedList) this.mData).getItems().clear();
            }
            int size = followFeedList.getItems().size();
            for (int i = 0; i < size; i++) {
                FollowFeed followFeed = (FollowFeed) followFeedList.getItems().get(i);
                if (followFeed != null && followFeed.getFeedType() == 65280) {
                    Aweme aweme = followFeed.getAweme();
                    if (C31871a.m74288a(aweme)) {
                        Aweme updateAweme = C23324d.m57378a().updateAweme(aweme);
                        IRequestIdService a = C23325e.m57379a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(updateAweme.getAid());
                        sb.append(1);
                        a.setRequestIdAndIndex(sb.toString(), followFeedList.getRequestId(), i);
                        followFeed.setAweme(updateAweme);
                        followFeedList.getItems().set(i, followFeed);
                        if (updateAweme.getAwemeType() == 13) {
                            Aweme forwardItem = updateAweme.getForwardItem();
                            if (forwardItem != null) {
                                forwardItem.setRepostFromGroupId(updateAweme.getAid());
                                forwardItem.setRepostFromUserId(updateAweme.getAuthorUid());
                                Aweme updateAweme2 = C23324d.m57378a().updateAweme(forwardItem);
                                IRequestIdService a2 = C23325e.m57379a();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(updateAweme2.getAid());
                                sb2.append(1);
                                a2.setRequestIdAndIndex(sb2.toString(), followFeedList.getRequestId(), i);
                            }
                        }
                    }
                }
            }
            if (this.mListQueryType != 1) {
                Iterator it = followFeedList.getItems().iterator();
                while (it.hasNext()) {
                    FollowFeed followFeed2 = (FollowFeed) it.next();
                    if (!isDataEmpty() && ((FollowFeedList) this.mData).getItems().indexOf(followFeed2) >= 0) {
                        it.remove();
                    }
                }
            }
            int i2 = this.mListQueryType;
            if (i2 != 4) {
                switch (i2) {
                    case 1:
                        this.mData = followFeedList;
                        break;
                    case 2:
                        followFeedList.getItems().addAll(getItems());
                        ((FollowFeedList) this.mData).setItems(followFeedList.getItems());
                        break;
                }
            } else {
                ((FollowFeedList) this.mData).getItems().addAll(followFeedList.getItems());
                ((FollowFeedList) this.mData).setHasMore(((FollowFeedList) this.mData).getHasMore() & followFeedList.getHasMore());
            }
            C29981aa.m70153a().mo60162a(((FollowFeedList) this.mData).getRequestId(), ((FollowFeedList) this.mData).getLogPb());
            if (((FollowFeedList) this.mData).getMaxCursor() != 0) {
                ((FollowFeedList) this.mData).setMaxCursor(Math.min(((FollowFeedList) this.mData).getMaxCursor(), followFeedList.getMaxCursor()));
            }
            if (((FollowFeedList) this.mData).getMinCursor() != 0) {
                ((FollowFeedList) this.mData).setMinCursor(Math.max(((FollowFeedList) this.mData).getMinCursor(), followFeedList.getMinCursor()));
            }
            for (int i3 = 0; i3 < ((FollowFeedList) this.mData).getItems().size(); i3++) {
                if (((FollowFeed) ((FollowFeedList) this.mData).getItems().get(i3)).getFeedType() == 65280 && ((FollowFeed) ((FollowFeedList) this.mData).getItems().get(i3)).getAweme() != null) {
                    ((FollowFeed) ((FollowFeedList) this.mData).getItems().get(i3)).getAweme().setAwemePosition(i3);
                }
            }
            return;
        }
        if (this.mListQueryType == 1) {
            this.mData = null;
        }
        if (!(this.mData == null || this.mListQueryType == 2)) {
            ((FollowFeedList) this.mData).setHasMore(0);
        }
    }

    /* renamed from: a */
    private void m84631a(String str, String str2, long j, long j2, int i) {
        ForwardApi.m74733a(str, str2, j, j2, i).mo32d(new C37885e(this, str, str2, i)).mo29c(new C37886f(this)).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0013i<UserDynamicList> mo77324a(String str, String str2, C0013i<UserDynamicList> iVar, int i, int i2) {
        UserDynamicList userDynamicList = (UserDynamicList) iVar.mo34e();
        if (i2 <= 0 || userDynamicList == null || userDynamicList.getHasMore() != 1 || !C9376b.m18558a((Collection<T>) userDynamicList.getDynamicList())) {
            return C0013i.m22b((Callable<TResult>) new C37884d<TResult>(userDynamicList));
        }
        C0013i a = ForwardApi.m74733a(str, str2, userDynamicList.getMaxCursor(), -1, i);
        C37883c cVar = new C37883c(this, str, str2, i, i2);
        return a.mo32d(cVar);
    }
}
