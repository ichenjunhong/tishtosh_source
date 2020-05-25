package com.p683ss.android.ugc.aweme.challenge.p1497c;

import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.p1057b.p1058a.C17418j;
import com.google.p1057b.p1058a.C17422l;
import com.google.p1057b.p1060c.C17583ao;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p683ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.c.i */
public final class C24570i extends C26832a<SearchSugChallengeList> {

    /* renamed from: a */
    public static final C24571a f65034a = new C24571a(null);

    /* renamed from: b */
    private int f65035b;

    /* renamed from: com.ss.android.ugc.aweme.challenge.c.i$a */
    public static final class C24571a {
        private C24571a() {
        }

        public /* synthetic */ C24571a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.c.i$b */
    static final class C24572b<T> implements C17422l<T> {

        /* renamed from: a */
        final /* synthetic */ C24570i f65036a;

        C24572b(C24570i iVar) {
            this.f65036a = iVar;
        }

        public final /* synthetic */ boolean apply(Object obj) {
            String str;
            AVChallenge aVChallenge = (AVChallenge) obj;
            String str2 = null;
            if (aVChallenge != null) {
                str = aVChallenge.challengeName;
            } else {
                str = null;
            }
            if (str != null) {
                str2 = aVChallenge.challengeName;
            }
            return TextUtils.equals(str2, ((SearchSugChallengeList) this.f65036a.mData).keyword);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.c.i$c */
    public static final class C24573c implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C24570i f65037a;

        /* renamed from: b */
        final /* synthetic */ Object[] f65038b;

        public final Object call() throws Exception {
            this.f65037a.mIsLoading = false;
            Object obj = this.f65038b[0];
            if (obj != null) {
                String str = (String) obj;
                Object obj2 = this.f65038b[1];
                if (obj2 != null) {
                    SearchSugChallengeList searchSugChallengeList = (SearchSugChallengeList) ChallengeApi.f64991b.searchSugChallenge(str, (String) obj2).get();
                    searchSugChallengeList.setKeyword(str);
                    C52711k.m112236a((Object) searchSugChallengeList, "ChallengeApi.searchSugCh…ing, params[1] as String)");
                    return searchSugChallengeList;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.String");
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.String");
        }

        C24573c(C24570i iVar, Object[] objArr) {
            this.f65037a = iVar;
            this.f65038b = objArr;
        }
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    public final boolean sendRequest(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        if (!super.sendRequest(objArr[0], objArr[1])) {
            return false;
        }
        this.f65035b = (this.f65035b + 1) % 10;
        C23566n.m57766a().mo48750a(this.mHandler, new C24573c(this, objArr), this.f65035b);
        return true;
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        SearchSugChallengeList searchSugChallengeList = (SearchSugChallengeList) obj;
        if (searchSugChallengeList != null) {
            this.mData = searchSugChallengeList;
            if (!((SearchSugChallengeList) this.mData).isMatch) {
                if (((SearchSugChallengeList) this.mData).items == null) {
                    ((SearchSugChallengeList) this.mData).setItems(new ArrayList());
                    z = true;
                } else {
                    z = ((SearchSugChallengeList) this.mData).items.isEmpty();
                }
                if (!z) {
                    C17418j b = C17583ao.m43261b(((SearchSugChallengeList) this.mData).items, new C24572b(this));
                    C52711k.m112236a((Object) b, "Iterables.tryFind(mData.…eyword)\n                }");
                    z = !b.isPresent();
                }
                if (z) {
                    AVChallenge aVChallenge = new AVChallenge();
                    aVChallenge.challengeName = ((SearchSugChallengeList) this.mData).keyword;
                    ((SearchSugChallengeList) this.mData).items.add(0, aVChallenge);
                }
            }
        }
    }

    public final void handleMsg(Message message) {
        C52711k.m112240b(message, "msg");
        if (message.what != this.f65035b) {
            this.mHandler.removeMessages(message.what);
            return;
        }
        if (message.obj instanceof Exception) {
            Object obj = message.obj;
            if (obj != null) {
                Exception exc = (Exception) obj;
                if (exc.getMessage() != null) {
                    StringBuilder sb = new StringBuilder("challenge search failed, message:");
                    sb.append(exc.getMessage());
                    C45407ay.m98971b(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder("challenge search failed, stack trace:");
                sb2.append(Log.getStackTraceString(exc));
                C45407ay.m98971b(sb2.toString());
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
            }
        }
        super.handleMsg(message);
    }
}
