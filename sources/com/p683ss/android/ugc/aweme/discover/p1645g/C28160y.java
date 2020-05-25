package com.p683ss.android.ugc.aweme.discover.p1645g;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.discover.api.SearchApi;
import com.p683ss.android.ugc.aweme.discover.model.SearchUser;
import com.p683ss.android.ugc.aweme.discover.model.SearchUserList;
import com.p683ss.android.ugc.aweme.feed.C30228f;

/* renamed from: com.ss.android.ugc.aweme.discover.g.y */
public final class C28160y extends C28127h<SearchUser, SearchUserList> {

    /* renamed from: b */
    public String f73949b;

    /* renamed from: c */
    public final boolean f73950c;

    /* renamed from: com.ss.android.ugc.aweme.discover.g.y$a */
    class C28162a extends C28118b {

        /* renamed from: b */
        final String f73951b;

        /* renamed from: c */
        final int f73952c;

        /* renamed from: d */
        final int f73953d;

        /* renamed from: e */
        final int f73954e;

        /* renamed from: f */
        final String f73955f;

        /* renamed from: g */
        final int f73956g;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Object mo56525b() throws Exception {
            String str;
            String str2;
            String str3;
            if (C28160y.this.f73950c) {
                String a = C30228f.m70974a();
                String b = C30228f.m70977b();
                String str4 = "aweme_city_user";
                C28160y.this.mo56533a(str4);
                str2 = b;
                str3 = a;
                str = str4;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            return SearchApi.m66829a(this.f73951b, (long) this.f73952c, this.f73954e, this.f73953d, C28160y.this.f73862i, C28160y.this.mo56537d(), this.f73955f, this.f73956g, str3, str2, str);
        }

        private C28162a(String str, int i, int i2, int i3, String str2, int i4) {
            this.f73951b = str;
            this.f73952c = i;
            this.f73953d = i2;
            this.f73954e = i3;
            this.f73955f = str2;
            this.f73956g = i4;
        }
    }

    public final int aK_() {
        return 0;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchUserList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public C28160y(boolean z) {
        this.f73950c = z;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        int i2;
        if (objArr.length >= 4) {
            String str = (String) objArr[1];
            if (isDataEmpty()) {
                i2 = 0;
            } else {
                i2 = ((SearchUserList) this.mData).cursor;
            }
            m67054a(str, i2, 1, 10, this.f73864k, objArr[3].intValue());
            return;
        }
        String str2 = (String) objArr[1];
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((SearchUserList) this.mData).cursor;
        }
        m67054a(str2, i, 1, 10, this.f73864k, 0);
    }

    public final void refreshList(Object... objArr) {
        if (objArr.length >= 5) {
            m67054a((String) objArr[1], 0, objArr[2].intValue(), objArr[3].intValue(), "", objArr[4].intValue());
        } else if (objArr.length >= 4) {
            m67054a((String) objArr[1], 0, objArr[2].intValue(), 10, "", objArr[3].intValue());
        } else {
            m67054a((String) objArr[1], 0, objArr[2].intValue(), 10, "", 0);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        if (r7.mData != null) goto L_0x00a3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(com.p683ss.android.ugc.aweme.discover.model.SearchUserList r8) {
        /*
            r7 = this;
            super.handleData(r8)
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchUser> r0 = r8.userList
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L_0x0012
            boolean r3 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
            if (r3 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r3 = 0
            goto L_0x0013
        L_0x0012:
            r3 = 1
        L_0x0013:
            r7.mIsNewDataEmpty = r3
            boolean r3 = r7.mIsNewDataEmpty
            r4 = 4
            if (r3 != 0) goto L_0x0069
            java.util.Iterator r3 = r0.iterator()
        L_0x001e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0032
            java.lang.Object r5 = r3.next()
            com.ss.android.ugc.aweme.discover.model.SearchUser r5 = (com.p683ss.android.ugc.aweme.discover.model.SearchUser) r5
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.user
            java.lang.String r6 = r7.f73863j
            r5.setRequestId(r6)
            goto L_0x001e
        L_0x0032:
            int r3 = r7.mListQueryType
            if (r3 == r2) goto L_0x0058
            if (r3 == r4) goto L_0x0039
            return
        L_0x0039:
            r7.mo56535b(r0)
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.p683ss.android.ugc.aweme.discover.model.SearchUserList) r0
            boolean r3 = r8.hasMore
            if (r3 == 0) goto L_0x004d
            java.lang.Object r3 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r3 = (com.p683ss.android.ugc.aweme.discover.model.SearchUserList) r3
            boolean r3 = r3.hasMore
            if (r3 == 0) goto L_0x004d
            r1 = 1
        L_0x004d:
            r0.hasMore = r1
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.p683ss.android.ugc.aweme.discover.model.SearchUserList) r0
            int r8 = r8.cursor
            r0.cursor = r8
            return
        L_0x0058:
            r7.mData = r8
            java.lang.Object r8 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r8 = (com.p683ss.android.ugc.aweme.discover.model.SearchUserList) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.userList = r1
            r7.mo56532a_(r0)
            return
        L_0x0069:
            int r0 = r7.mListQueryType
            if (r0 == r2) goto L_0x009a
            if (r0 == r4) goto L_0x0070
            goto L_0x00a9
        L_0x0070:
            java.lang.Object r0 = r7.mData
            if (r0 == 0) goto L_0x00a9
            if (r8 == 0) goto L_0x00a3
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.p683ss.android.ugc.aweme.discover.model.SearchUserList) r0
            boolean r3 = r8.hasMore
            if (r3 == 0) goto L_0x0087
            java.lang.Object r3 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r3 = (com.p683ss.android.ugc.aweme.discover.model.SearchUserList) r3
            boolean r3 = r3.hasMore
            if (r3 == 0) goto L_0x0087
            r1 = 1
        L_0x0087:
            r0.hasMore = r1
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.p683ss.android.ugc.aweme.discover.model.SearchUserList) r0
            boolean r0 = r0.hasMore
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.p683ss.android.ugc.aweme.discover.model.SearchUserList) r0
            int r8 = r8.cursor
            r0.cursor = r8
            return
        L_0x009a:
            r7.mData = r8
            r7.mo56536c()
            java.lang.Object r8 = r7.mData
            if (r8 == 0) goto L_0x00a9
        L_0x00a3:
            java.lang.Object r8 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r8 = (com.p683ss.android.ugc.aweme.discover.model.SearchUserList) r8
            r8.hasMore = r1
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1645g.C28160y.handleData(com.ss.android.ugc.aweme.discover.model.SearchUserList):void");
    }

    /* renamed from: a */
    private void m67054a(String str, int i, int i2, int i3, String str2, int i4) {
        String str3 = str;
        this.f73949b = str3;
        C28162a aVar = new C28162a(str3, i, i2, i3, str2, i4);
        aVar.f73843a = this.f73860g;
        this.f73861h = aVar;
        C23566n.m57766a().mo48750a(this.mHandler, aVar, 0);
    }
}
