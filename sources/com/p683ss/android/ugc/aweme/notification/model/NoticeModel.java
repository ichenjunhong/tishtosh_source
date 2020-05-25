package com.p683ss.android.ugc.aweme.notification.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.NoticeResponse;
import com.p683ss.android.ugc.aweme.notice.repo.p2010a.C38081a;
import com.p683ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.notification.model.NoticeModel */
public class NoticeModel extends C26875a<BaseNotice, NoticeResponse> {
    private long mMaxTime;
    private long mMinTime;

    public List<BaseNotice> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((NoticeResponse) this.mData).getItems();
    }

    public boolean isHasMore() {
        if (this.mData == null || !((NoticeResponse) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 3) {
            return false;
        }
        return true;
    }

    public void loadMoreList(Object... objArr) {
        fetchNotice(this.mMaxTime, this.mMinTime, objArr[1].intValue(), (Integer) objArr[2]);
    }

    public void refreshList(Object... objArr) {
        this.mMaxTime = 0;
        this.mMinTime = 0;
        fetchNotice(this.mMaxTime, this.mMinTime, objArr[1].intValue(), (Integer) objArr[2]);
    }

    /* access modifiers changed from: protected */
    public void handleData(NoticeResponse noticeResponse) {
        boolean z;
        if (noticeResponse == null || C9376b.m18558a((Collection<T>) noticeResponse.getItems())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        int i = this.mListQueryType;
        if (i == 1) {
            this.mData = noticeResponse;
            if (!this.mIsNewDataEmpty) {
                this.mMaxTime = noticeResponse.maxTime;
                this.mMinTime = noticeResponse.minTime;
                for (BaseNotice lastReadTime : noticeResponse.items) {
                    lastReadTime.setLastReadTime(noticeResponse.lastReadTime);
                }
            }
        } else if (i == 4) {
            if (!this.mIsNewDataEmpty) {
                ((NoticeResponse) this.mData).getItems().addAll(noticeResponse.getItems());
                ((NoticeResponse) this.mData).setHasMore(noticeResponse.hasMore);
                this.mMaxTime = noticeResponse.maxTime;
                this.mMinTime = noticeResponse.minTime;
                for (BaseNotice lastReadTime2 : noticeResponse.items) {
                    lastReadTime2.setLastReadTime(noticeResponse.lastReadTime);
                }
                return;
            }
            ((NoticeResponse) this.mData).setHasMore(false);
        }
    }

    private void fetchNotice(long j, long j2, int i, Integer num) {
        C23566n a = C23566n.m57766a();
        C9381g gVar = this.mHandler;
        final long j3 = j;
        final long j4 = j2;
        final int i2 = i;
        final Integer num2 = num;
        C382221 r1 = new Callable<NoticeResponse>() {
            public NoticeResponse call() throws Exception {
                try {
                    return NoticeApiManager.m85270a(j3, j4, 20, i2, num2, 1, C38081a.m85158a(), C38081a.m85160b());
                } catch (ExecutionException e) {
                    throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
                }
            }
        };
        a.mo48750a(gVar, r1, 0);
    }
}
