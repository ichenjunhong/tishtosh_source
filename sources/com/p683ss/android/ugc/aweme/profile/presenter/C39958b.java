package com.p683ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C18083m;
import com.google.gson.C18091u;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23396j;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26879e;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27379l;
import com.p683ss.android.ugc.aweme.experiment.ListParamOptExperiment;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.C40732y;
import com.p683ss.android.ugc.aweme.profile.api.AwemeApi;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.profile.util.C40542c;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.b */
public final class C39958b extends C26875a<Aweme, FeedItemList> implements C27379l {

    /* renamed from: a */
    protected int f101859a;

    /* renamed from: b */
    public int f101860b;

    /* renamed from: c */
    public String f101861c;

    /* renamed from: d */
    public boolean f101862d;

    /* renamed from: e */
    public int f101863e;

    /* renamed from: f */
    public int f101864f;

    /* renamed from: g */
    public String f101865g = "";

    public final boolean isNewDataEmpty() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo81863a(Aweme aweme) {
        int i = 0;
        if (aweme == null || aweme.getAid() == null) {
            return false;
        }
        List items = getItems();
        if (items == null) {
            items = new ArrayList();
            setItems(items);
        }
        int i2 = -1;
        for (int i3 = 0; i3 < items.size(); i3++) {
            Aweme aweme2 = (Aweme) items.get(i3);
            if (aweme2 != null) {
                if (aweme2.isTop() || aweme.getCreateTime() < aweme2.getCreateTime()) {
                    i2 = i3 + 1;
                }
                if (aweme.getAid().equals(aweme2.getAid())) {
                    return false;
                }
            }
        }
        if (i2 >= 0) {
            i = i2;
        }
        items.add(i, aweme);
        for (C26874f fVar : this.mNotifyListeners) {
            if (fVar != null && (fVar instanceof C26879e)) {
                ((C26879e) fVar).mo46993a(items, i);
            }
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo81866c() {
        if (this.f101864f == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final String mo81865b() {
        if (this.mData == null) {
            return "";
        }
        return ((FeedItemList) this.mData).invalidItemText;
    }

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FeedItemList) this.mData).getItems();
    }

    /* renamed from: a */
    public final List<Aweme> mo55861a() {
        if (this.f101859a == 1) {
            return getItems();
        }
        return getItems();
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((FeedItemList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 5) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean deleteItem(Object obj) {
        return C31190f.m72832a(getItems(), (Aweme) obj, this.mNotifyListeners);
    }

    public final void setItems(List<Aweme> list) {
        super.setItems(list);
        if (this.mData == null) {
            FeedItemList feedItemList = new FeedItemList();
            feedItemList.items = list;
            this.mData = feedItemList;
            return;
        }
        ((FeedItemList) this.mData).items = list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public FeedItemList mo81864b(String str) {
        String a;
        File c = m88752c(str);
        if (c != null && c.exists()) {
            synchronized (this) {
                a = C47723bk.m103307a(c, "UTF-8");
            }
            if (!TextUtils.isEmpty(a)) {
                try {
                    return (FeedItemList) C47759cc.m103382a().getGson().mo34884a(a, FeedItemList.class);
                } catch (C18083m | C18091u unused) {
                } catch (UnsupportedOperationException e) {
                    C32458a.m75148a((Throwable) e);
                }
            }
        }
        return null;
    }

    public final boolean sendRequest(Object... objArr) {
        boolean z;
        if (checkParams(objArr)) {
            this.mIsLoading = true;
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        this.mListQueryType = objArr[0].intValue();
        int i = this.mListQueryType;
        if (i != 4) {
            switch (i) {
                case 1:
                    refreshList(objArr);
                    break;
                case 2:
                    loadLatestList(objArr);
                    break;
            }
        } else {
            loadMoreList(objArr);
        }
        return true;
    }

    /* renamed from: c */
    private File m88752c(String str) {
        File cacheDir = C11010c.m22280a().getCacheDir();
        if (cacheDir == null || !cacheDir.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cacheDir.getPath());
        sb.append(File.separator);
        sb.append("aweme_publish");
        File file = new File(sb.toString());
        try {
            if (!file.exists() && !file.mkdirs()) {
                return null;
            }
        } catch (SecurityException unused) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getPath());
        sb2.append(File.separator);
        C40026s sVar = C40026s.f101964a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(AwemeApi.f101545a);
        sb3.append(str);
        sb2.append(sVar.hexDigest(sb3.toString()));
        return new File(sb2.toString());
    }

    public final void refreshList(Object... objArr) {
        int i;
        int i2;
        this.f101860b = objArr[4].intValue();
        if (this.f101859a == 4) {
            i = 12;
        } else {
            i = 20;
        }
        if (!ListParamOptExperiment.m69615a() || this.f101859a != 0) {
            i2 = i;
        } else {
            i2 = 33;
        }
        if (objArr.length >= 6) {
            m88751a(objArr[1].booleanValue(), (String) objArr[2], objArr[3].intValue(), 0, i2, (String) objArr[5], 0, 0);
            return;
        }
        String c = C47865ew.m103536a().mo95083c(objArr[2]);
        m88751a(objArr[1].booleanValue(), (String) objArr[2], objArr[3].intValue(), 0, i2, c, 0, 0);
    }

    /* renamed from: a */
    public final C2201v<FeedItemList> mo81859a(String str) {
        ((C40732y) C23396j.m57478a(C11010c.m22280a(), C40732y.class)).mo48469a("");
        return C2201v.m6601a((C2205y<T>) new C39960c<T>(this, str)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        long j;
        long j2;
        this.f101860b = objArr[4].intValue();
        if (!ListParamOptExperiment.m69615a() || this.f101859a != 0) {
            i = 10;
        } else {
            i = 21;
        }
        if (objArr.length >= 6) {
            String str = objArr[2];
            int intValue = objArr[3].intValue();
            if (this.mData == null) {
                j2 = 0;
            } else {
                j2 = ((FeedItemList) this.mData).maxCursor;
            }
            m88750a(str, intValue, j2, i, objArr[5], this.f101863e, this.f101864f);
            return;
        }
        String c = C47865ew.m103536a().mo95083c(objArr[2]);
        String str2 = objArr[2];
        int intValue2 = objArr[3].intValue();
        if (this.mData == null) {
            j = 0;
        } else {
            j = ((FeedItemList) this.mData).maxCursor;
        }
        m88750a(str2, intValue2, j, i, c, this.f101863e, this.f101864f);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        FeedItemList feedItemList = (FeedItemList) obj;
        C29981aa.m70153a().mo60162a(feedItemList.getRequestId(), feedItemList.logPb);
        if (feedItemList.fetchType == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean a = C9376b.m18558a((Collection<T>) feedItemList.getItems());
        if (this.f101859a == 1 && this.mData != null) {
            ((FeedItemList) this.mData).invalidItemCount = feedItemList.invalidItemCount;
            ((FeedItemList) this.mData).invalidItemText = feedItemList.invalidItemText;
            ((FeedItemList) this.mData).hidingInvalidItem = feedItemList.hidingInvalidItem;
        }
        if (!a) {
            m88749a(feedItemList, z, this.f101859a, this.f101860b);
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = feedItemList;
                if (TextUtils.equals(this.f101861c, C20854a.m53167g().getCurUserId())) {
                    C40542c.m89959a(this.f101859a, false, 0, feedItemList.hasMore, feedItemList.maxCursor, feedItemList.minCursor, feedItemList.getItems().size());
                }
            } else if (i == 4) {
                if (this.mData == null) {
                    this.mData = feedItemList;
                } else {
                    if (C9376b.m18558a((Collection<T>) ((FeedItemList) this.mData).getItems())) {
                        ((FeedItemList) this.mData).items = feedItemList.getItems();
                    } else {
                        List items = ((FeedItemList) this.mData).getItems();
                        List<Aweme> items2 = feedItemList.getItems();
                        List items3 = ((FeedItemList) this.mData).getItems();
                        if (!(items2 == null || items3 == null)) {
                            List arrayList = new ArrayList();
                            for (Aweme aweme : items2) {
                                arrayList.add(aweme);
                                Iterator it = items3.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (TextUtils.equals(aweme.getAid(), ((Aweme) it.next()).getAid())) {
                                        arrayList.remove(aweme);
                                        break;
                                    }
                                }
                            }
                            items2 = arrayList;
                        }
                        items.addAll(items2);
                    }
                    ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
                    ((FeedItemList) this.mData).hasMore = feedItemList.hasMore & ((FeedItemList) this.mData).hasMore;
                }
                if (TextUtils.equals(this.f101861c, C20854a.m53167g().getCurUserId()) && ((FeedItemList) this.mData).getItems().size() - feedItemList.getItems().size() <= 10) {
                    C40542c.m89959a(this.f101859a, true, 0, feedItemList.hasMore, feedItemList.maxCursor, feedItemList.minCursor, feedItemList.getItems().size());
                }
            }
            if (this.f101859a == 4 && this.mData != null) {
                ((FeedItemList) this.mData).cursor = feedItemList.cursor;
                ((FeedItemList) this.mData).maxCursor = feedItemList.cursor;
            }
        } else if (this.mData != null) {
            ((FeedItemList) this.mData).hasMore = feedItemList.hasMore;
            ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
        } else {
            this.mData = feedItemList;
        }
    }

    /* renamed from: a */
    public final void mo81860a(Aweme aweme, String str) {
        C2201v.m6601a((C2205y<T>) new C39963f<T>(this, str, aweme)).mo6529b(C2168a.m6521b()).mo6551j();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0025 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81861a(com.p683ss.android.ugc.aweme.feed.model.FeedItemList r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.io.File r4 = r2.m88752c(r4)     // Catch:{ all -> 0x0027 }
            if (r4 != 0) goto L_0x0009
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            return
        L_0x0009:
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0025 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0025 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0025 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0025 }
            com.ss.android.ugc.aweme.utils.GsonProvider r4 = com.p683ss.android.ugc.aweme.utils.C47759cc.m103382a()     // Catch:{ IOException -> 0x0025 }
            com.google.gson.f r4 = r4.getGson()     // Catch:{ IOException -> 0x0025 }
            java.lang.String r3 = r4.mo34889b(r3)     // Catch:{ IOException -> 0x0025 }
            r0.write(r3)     // Catch:{ IOException -> 0x0025 }
            r0.close()     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.presenter.C39958b.mo81861a(com.ss.android.ugc.aweme.feed.model.FeedItemList, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo81862a(Collection<Aweme> collection, String str) {
        if (!collection.isEmpty()) {
            C2201v.m6601a((C2205y<T>) new C39962e<T>(this, str, collection)).mo6529b(C2168a.m6521b()).mo6551j();
        }
    }

    /* renamed from: a */
    public static void m88749a(FeedItemList feedItemList, boolean z, int i, int i2) {
        int i3;
        Aweme aweme;
        if (feedItemList != null && feedItemList.getItems() != null) {
            int size = feedItemList.getItems().size();
            for (int i4 = 0; i4 < size; i4++) {
                Aweme aweme2 = (Aweme) feedItemList.getItems().get(i4);
                if (aweme2 == null) {
                    i3 = -1;
                } else {
                    i3 = aweme2.getIsTop();
                }
                if (aweme2 == null || (!aweme2.isSelfSee() && !aweme2.isProhibited())) {
                    aweme = C23324d.m57378a().updateAweme(aweme2);
                } else {
                    aweme = C23324d.m57378a().updateProfileSelfSeeAweme(aweme2, i);
                }
                if (z && i3 >= 0) {
                    aweme.setIsTop(i3);
                }
                IRequestIdService a = C23325e.m57379a();
                StringBuilder sb = new StringBuilder();
                sb.append(aweme.getAid());
                sb.append(i2 + i);
                a.setRequestIdAndIndex(sb.toString(), feedItemList.getRequestId(), i4);
                feedItemList.getItems().set(i4, aweme);
            }
        }
    }

    /* renamed from: a */
    private void m88750a(String str, int i, long j, int i2, String str2, int i3, int i4) {
        m88751a(false, str, i, j, i2, str2, i3, i4);
    }

    /* renamed from: a */
    private void m88751a(boolean z, String str, int i, long j, int i2, String str2, int i3, int i4) {
        final int i5 = i;
        this.f101859a = i5;
        final String str3 = str;
        this.f101861c = str3;
        C23566n a = C23566n.m57766a();
        C9381g gVar = this.mHandler;
        final boolean z2 = z;
        final String str4 = str2;
        final long j2 = j;
        final int i6 = i2;
        final int i7 = i3;
        final int i8 = i4;
        C399591 r0 = new Callable<FeedItemList>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public FeedItemList call() throws Exception {
                FeedItemList feedItemList;
                int i;
                if (C39958b.this.f101859a == 14) {
                    feedItemList = AwemeApi.m88493a(z2, str3, str4, 14, j2, i6, null, i7, i8, Integer.valueOf(C39958b.this.f101860b));
                } else if (C39958b.this.f101859a == 1) {
                    if (C39958b.this.mListQueryType == 1) {
                        feedItemList = AwemeApi.m88492a(z2, str3, str4, i5, j2, i6, null, 0, 0);
                    } else {
                        boolean z = z2;
                        String str = str3;
                        String str2 = str4;
                        int i2 = i5;
                        long j = j2;
                        int i3 = i6;
                        C39958b bVar = C39958b.this;
                        int i4 = 0;
                        if (bVar.mData == null) {
                            i = 0;
                        } else {
                            i = ((FeedItemList) bVar.mData).invalidItemCount;
                        }
                        C39958b bVar2 = C39958b.this;
                        if (bVar2.mData != null) {
                            i4 = ((FeedItemList) bVar2.mData).hidingInvalidItem;
                        }
                        feedItemList = AwemeApi.m88492a(z, str, str2, i2, j, i3, null, i, i4);
                    }
                } else if (C39958b.this.f101862d) {
                    feedItemList = AwemeApi.m88493a(z2, str3, str4, 11, j2, i6, null, i7, i8, Integer.valueOf(C39958b.this.f101860b));
                } else {
                    feedItemList = AwemeApi.m88493a(z2, str3, str4, i5, j2, i6, null, i7, i8, Integer.valueOf(C39958b.this.f101860b));
                }
                if (feedItemList != null) {
                    feedItemList.fetchType = i5;
                    if (TextUtils.equals(str3, C20854a.m53167g().getCurUserId()) && i5 == 0 && j2 == 0) {
                        if (C39958b.this.mData != null && C9376b.m18558a((Collection<T>) feedItemList.getItems())) {
                            ((FeedItemList) C39958b.this.mData).items = feedItemList.getItems();
                        }
                        C39958b.this.mo81861a(feedItemList, str3);
                    }
                    C39958b.this.f101863e = feedItemList.hotsoonFilteredCount;
                    C39958b.this.f101864f = feedItemList.hotsoonHasMore;
                    C39958b.this.f101865g = feedItemList.hotSoonText;
                }
                if (feedItemList.getItems() != null) {
                    for (Aweme requestId : feedItemList.getItems()) {
                        requestId.setRequestId(feedItemList.logPb.getImprId());
                    }
                }
                return feedItemList;
            }
        };
        a.mo48750a(gVar, r0, 0);
    }
}
