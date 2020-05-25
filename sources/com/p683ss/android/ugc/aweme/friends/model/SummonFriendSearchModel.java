package com.p683ss.android.ugc.aweme.friends.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.friends.api.SummonFriendApi;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.friends.model.SummonFriendSearchModel */
public class SummonFriendSearchModel extends C26832a<SummonFriendList> {
    public boolean mIsRefresh;
    public String mKeyword;

    public SummonFriendList getData() {
        return (SummonFriendList) super.getData();
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 2) {
            return false;
        }
        return true;
    }

    public boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        final boolean booleanValue = objArr[0].booleanValue();
        this.mIsRefresh = objArr[0].booleanValue();
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public Object call() throws Exception {
                if (booleanValue) {
                    SummonFriendSearchModel.this.mIsLoading = false;
                    return SummonFriendApi.m75334a((String) objArr[1], 0, 20, (String) objArr[2]);
                } else if (objArr.length != 3) {
                    return null;
                } else {
                    SummonFriendSearchModel.this.mKeyword = (String) objArr[1];
                    String str = (String) objArr[2];
                    if (SummonFriendSearchModel.this.mData == null || ((SummonFriendList) SummonFriendSearchModel.this.mData).cursor <= 0) {
                        SummonFriendSearchModel.this.mIsRefresh = true;
                        return SummonFriendApi.m75334a(SummonFriendSearchModel.this.mKeyword, 0, 20, str);
                    }
                    SummonFriendSearchModel.this.mIsRefresh = false;
                    return SummonFriendApi.m75334a(SummonFriendSearchModel.this.mKeyword, ((SummonFriendList) SummonFriendSearchModel.this.mData).cursor, 20, str);
                }
            }
        }, 0);
        return true;
    }

    /* access modifiers changed from: protected */
    public void handleData(SummonFriendList summonFriendList) {
        String str;
        if (summonFriendList != null) {
            if (this.mData == null) {
                this.mData = summonFriendList;
            } else {
                ((SummonFriendList) this.mData).cursor = summonFriendList.cursor;
                ((SummonFriendList) this.mData).hasMore = summonFriendList.hasMore;
                ((SummonFriendList) this.mData).keyword = summonFriendList.keyword;
                ((SummonFriendList) this.mData).requestId = summonFriendList.requestId;
            }
            if (this.mIsRefresh) {
                ((SummonFriendList) this.mData).items = summonFriendList.items;
            } else if (((SummonFriendList) this.mData).items == null) {
                ((SummonFriendList) this.mData).items = summonFriendList.items;
            } else {
                List<SummonFriendItem> list = summonFriendList.items;
                if (!C9376b.m18558a((Collection<T>) list)) {
                    ((SummonFriendList) this.mData).items.addAll(list);
                    return;
                }
                String str2 = "summon_friend_user_list_empty";
                String str3 = "";
                C23088c a = C23088c.m56631a();
                String str4 = "request_id";
                if (summonFriendList.logPbBean != null) {
                    str = summonFriendList.logPbBean.getImprId();
                } else {
                    str = "";
                }
                C23131p.m56692a(str2, str3, a.mo47824a(str4, str).mo47824a("key_word", this.mKeyword).mo47825b());
            }
        }
    }
}
