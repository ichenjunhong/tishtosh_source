package com.p683ss.android.ugc.aweme.challenge.p1497c;

import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.p1057b.p1060c.C17583ao;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p683ss.android.ugc.aweme.challenge.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.challenge.c.f */
public final class C24566f extends C26832a<SearchChallengeList> {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                C24566f.this.mIsLoading = false;
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                HashMap hashMap = new HashMap();
                hashMap.put("keyword", str);
                hashMap.put("count", "20");
                hashMap.put("search_source", str2);
                hashMap.put("is_hash_tag", "1");
                if (TextUtils.equals(str2, "video_challenge") || TextUtils.equals(str2, "photo_publish") || TextUtils.equals(str2, CustomActionPushReceiver.f104061f)) {
                    hashMap.put("search_channel", "tiktok_challenge_create");
                }
                NetUtil.putCommonParams(hashMap, true);
                SearchChallengeList searchChallengeList = (SearchChallengeList) ChallengeApi.f64991b.searchChallenge(hashMap).get();
                searchChallengeList.keyword = str;
                return searchChallengeList;
            }
        }, 0);
        return true;
    }

    public final void handleMsg(Message message) {
        if (message.obj instanceof Exception) {
            Exception exc = (Exception) message.obj;
            if (exc.getMessage() != null) {
                StringBuilder sb = new StringBuilder("challenge search failed, message:");
                sb.append(exc.getMessage());
                C45407ay.m98971b(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder("challenge search failed, stack trace:");
            sb2.append(Log.getStackTraceString(exc));
            C45407ay.m98971b(sb2.toString());
        }
        super.handleMsg(message);
    }

    public final /* synthetic */ void handleData(Object obj) {
        SearchChallengeList searchChallengeList = (SearchChallengeList) obj;
        if (searchChallengeList != null) {
            this.mData = searchChallengeList;
            if (((SearchChallengeList) this.mData).items == null) {
                ((SearchChallengeList) this.mData).items = new ArrayList();
            }
            if (!searchChallengeList.isMatch) {
                boolean isEmpty = ((SearchChallengeList) this.mData).items.isEmpty();
                if (!isEmpty) {
                    isEmpty = !C17583ao.m43261b(((SearchChallengeList) this.mData).items, new C24568g(this)).isPresent();
                }
                if (isEmpty) {
                    Challenge challenge = new Challenge();
                    challenge.setChallengeName(((SearchChallengeList) this.mData).keyword);
                    SearchChallenge searchChallenge = new SearchChallenge();
                    searchChallenge.challenge = challenge;
                    searchChallenge.isFake = true;
                    ((SearchChallengeList) this.mData).items.add(0, searchChallenge);
                }
            }
        }
    }
}
