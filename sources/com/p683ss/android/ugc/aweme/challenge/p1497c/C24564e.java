package com.p683ss.android.ugc.aweme.challenge.p1497c;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.challenge.data.C24590c;
import com.p683ss.android.ugc.aweme.challenge.data.C24591d;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.challenge.c.e */
public final class C24564e extends C26875a<Challenge, ChallengeList> {
    public final List<Challenge> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((ChallengeList) this.mData).items;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((ChallengeList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        C41589c.m91432a();
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        C41589c.m91432a();
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() {
                ChallengeList challengeList = new ChallengeList();
                ArrayList arrayList = new ArrayList();
                List<C24590c> a = C24591d.m60026a();
                if (a != null) {
                    for (C24590c cVar : a) {
                        Challenge challenge = new Challenge();
                        challenge.setChallengeName(cVar.f65056a);
                        arrayList.add(challenge);
                    }
                }
                challengeList.items = arrayList;
                return challengeList;
            }
        }, 0);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        ChallengeList challengeList = (ChallengeList) obj;
        if (challengeList == null || C9376b.m18558a((Collection<T>) challengeList.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = challengeList;
            } else if (i == 4) {
                ((ChallengeList) this.mData).items.addAll(challengeList.items);
                ((ChallengeList) this.mData).maxCursor = Math.min(((ChallengeList) this.mData).maxCursor, challengeList.maxCursor);
                ((ChallengeList) this.mData).hasMore = ((ChallengeList) this.mData).hasMore;
            }
        } else {
            if (this.mData != null) {
                ((ChallengeList) this.mData).hasMore = false;
            }
        }
    }
}
