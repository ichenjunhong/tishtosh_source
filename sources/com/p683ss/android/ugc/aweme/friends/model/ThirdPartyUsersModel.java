package com.p683ss.android.ugc.aweme.friends.model;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.friends.api.C32558a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ThirdPartyUsersModel */
public class ThirdPartyUsersModel extends C26875a<User, ThirdPartyUserList> {
    private final String accessToken;
    private final boolean isSignUp;
    private final String platform;
    private final int queryCount = 20;
    private final String secretAccessToken;

    /* renamed from: com.ss.android.ugc.aweme.friends.model.ThirdPartyUsersModel$PlatformType */
    public interface PlatformType {
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.model.ThirdPartyUsersModel$Scenario */
    public interface Scenario {
    }

    private int getScenario(boolean z) {
        return z ? 5 : 4;
    }

    public List<User> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((ThirdPartyUserList) this.mData).userList;
    }

    public boolean isHasMore() {
        if (this.mData == null || !((ThirdPartyUserList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public void setListData(ThirdPartyUserList thirdPartyUserList) {
        super.handleData(thirdPartyUserList);
    }

    static final /* synthetic */ ThirdPartyUserList lambda$fetchList$0$ThirdPartyUsersModel(C0013i iVar) throws Exception {
        return (ThirdPartyUserList) iVar.mo34e();
    }

    public void refreshList(Object... objArr) {
        fetchList(0, 20);
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public void loadMoreList(Object... objArr) {
        fetchList(((ThirdPartyUserList) this.mData).cursor, 20);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getThridPartyType(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = -916346253(0xffffffffc961aa73, float:-924327.2)
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x001b
            r1 = 497130182(0x1da19ac6, float:4.2776377E-21)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "facebook"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0025
            r5 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "twitter"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0025
            r5 = 1
            goto L_0x0026
        L_0x0025:
            r5 = -1
        L_0x0026:
            switch(r5) {
                case 0: goto L_0x002c;
                case 1: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            return r3
        L_0x002a:
            r5 = 2
            return r5
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.model.ThirdPartyUsersModel.getThridPartyType(java.lang.String):int");
    }

    /* access modifiers changed from: protected */
    public void fetchList(int i, int i2) {
        C32558a.m75336a().thirdPartyRecommendUsers(getThridPartyType(this.platform), this.accessToken, this.secretAccessToken, getScenario(this.isSignUp), i, i2).mo29c(ThirdPartyUsersModel$$Lambda$0.$instance).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
    }

    public ThirdPartyUsersModel(String str, String str2, String str3, boolean z) {
        this.platform = str;
        this.accessToken = str2;
        this.secretAccessToken = str3;
        this.isSignUp = z;
    }
}
