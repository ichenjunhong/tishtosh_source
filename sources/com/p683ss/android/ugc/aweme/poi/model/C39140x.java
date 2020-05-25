package com.p683ss.android.ugc.aweme.poi.model;

import android.os.Message;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27369c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37860c;
import com.p683ss.android.ugc.aweme.poi.C39065f;
import com.p683ss.android.ugc.aweme.poi.api.PoiFeedApi;
import com.p683ss.android.ugc.aweme.poi.utils.C39456o;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.poi.model.x */
public class C39140x extends C27369c<C37859b, C37860c> implements Cloneable {

    /* renamed from: h */
    public static final PoiFeedApi f99871h = ((PoiFeedApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(PoiFeedApi.class));

    /* renamed from: b */
    protected int f99872b;

    /* renamed from: c */
    protected String f99873c;

    /* renamed from: d */
    protected String f99874d;

    /* renamed from: e */
    protected String f99875e;

    /* renamed from: f */
    protected String f99876f;

    /* renamed from: g */
    protected String f99877g;

    /* renamed from: i */
    private boolean f99878i = true;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    /* renamed from: a */
    private static String mo55861a() {
        return String.valueOf(System.currentTimeMillis());
    }

    /* renamed from: c */
    public final C39136t mo79785c() {
        C39105ak b = mo79783b();
        if (b != null) {
            return b.getActivity();
        }
        return null;
    }

    public List<C37859b> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C37860c) this.mData).f96380a;
    }

    public boolean isDataEmpty() {
        if (super.isDataEmpty() || this.f99878i) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C39140x clone() {
        try {
            C39140x xVar = (C39140x) super.clone();
            xVar.mData = ((C37860c) this.mData).clone();
            return xVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final C39105ak mo79783b() {
        List items = getItems();
        if (!C9376b.m18558a((Collection<T>) items)) {
            C37859b bVar = (C37859b) items.get(0);
            if (bVar instanceof PoiDetail) {
                return ((PoiDetail) bVar).getPoiActivityResponse();
            }
        }
        return null;
    }

    public boolean isHasMore() {
        boolean z;
        if (this.mData != null) {
            if (((C37860c) this.mData).f96383d == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C39140x mo79782a(String str) {
        this.f99874d = str;
        return this;
    }

    /* renamed from: b */
    public final C39140x mo79784b(String str) {
        this.f99875e = str;
        return this;
    }

    /* renamed from: c */
    public final C39140x mo79786c(String str) {
        this.f99876f = str;
        return this;
    }

    /* renamed from: d */
    public final C39140x mo79788d(String str) {
        this.f99877g = str;
        return this;
    }

    public C39140x(int i) {
        this.f99872b = i;
    }

    /* renamed from: b */
    private void m86979b(C37860c cVar) {
        if (((C37860c) this.mData).f96382c != 0) {
            ((C37860c) this.mData).f96382c = Math.max(((C37860c) this.mData).f96382c, cVar.f96382c);
        }
        if (((C37860c) this.mData).f96381b != 0) {
            ((C37860c) this.mData).f96381b = Math.max(((C37860c) this.mData).f96381b, cVar.f96381b);
        }
    }

    public void loadMoreList(Object... objArr) {
        if (m86978a(2, objArr)) {
            String a = mo55861a();
            this.f99873c = a;
            C39065f fVar = objArr[1];
            m86977a(fVar.f99618a, fVar.f99627j, a, fVar.f99628k, fVar.f99621d, fVar.f99622e, fVar.f99620c);
        }
    }

    public void handleMsg(Message message) {
        if (message.what != 65282) {
            if (message.obj instanceof C37860c) {
                C37860c cVar = (C37860c) message.obj;
                if (C9431p.m18664a(this.f99873c) || this.f99873c.equalsIgnoreCase(cVar.f96386g)) {
                    this.mIsLoading = false;
                    if (cVar.f96387h != null) {
                        if (this.mNotifyListeners != null) {
                            for (C26874f c_ : this.mNotifyListeners) {
                                c_.mo44840c_(cVar.f96387h);
                            }
                        }
                        return;
                    }
                }
            }
            super.handleMsg(message);
        } else if (message.obj != null && (message.obj instanceof C37860c)) {
            C37860c cVar2 = (C37860c) message.obj;
            if (C9431p.m18664a(this.f99873c) || this.f99873c.equalsIgnoreCase(cVar2.f96386g)) {
                this.mIsLoading = false;
                if (cVar2.f96387h != null) {
                    if (this.mNotifyListeners != null) {
                        for (C26874f c_2 : this.mNotifyListeners) {
                            c_2.mo44840c_(cVar2.f96387h);
                        }
                    }
                    return;
                }
                handleData(cVar2);
                if (this.mNotifyListeners != null) {
                    for (C26874f b : this.mNotifyListeners) {
                        b.mo44838b();
                    }
                }
            }
        }
    }

    public void refreshList(Object... objArr) {
        int i;
        C0013i iVar;
        Object[] objArr2 = objArr;
        if (m86978a(2, objArr2)) {
            int i2 = 1;
            C39065f fVar = (C39065f) objArr2[1];
            String str = fVar.f99618a;
            int i3 = fVar.f99627j;
            String str2 = fVar.f99622e;
            String str3 = fVar.f99621d;
            int i4 = fVar.f99623f;
            boolean z = fVar.f99629l;
            long j = fVar.f99626i;
            String str4 = fVar.f99620c;
            boolean z2 = fVar.f99624g;
            String str5 = fVar.f99625h;
            boolean z3 = z2;
            String str6 = str4;
            int i5 = i4;
            boolean z4 = z;
            C0013i awemeList = f99871h.getAwemeList(str, i3, 20, 0, str4, 0);
            String str7 = str6;
            Aweme rawAdAwemeById = C23324d.m57378a().getRawAdAwemeById(str7);
            PoiFeedApi poiFeedApi = f99871h;
            String str8 = "all";
            switch (this.f99872b) {
                case 65440:
                    i = 1;
                    break;
                case 65441:
                    i = 2;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (rawAdAwemeById == null || !rawAdAwemeById.isAd()) {
                i2 = 0;
            }
            String str9 = str7;
            int i6 = i2;
            C0013i iVar2 = awemeList;
            C0013i poiDetail = poiFeedApi.getPoiDetail(str, str3, str2, str8, i, i5, i6, str9, 0);
            C0027j jVar = new C0027j();
            C0013i<TResult> iVar3 = jVar.f77a;
            jVar.mo44a(null);
            if (z4) {
                iVar = f99871h.getQRDetail(str, z3, str5);
            } else {
                C0027j jVar2 = new C0027j();
                C0013i<TResult> iVar4 = jVar2.f77a;
                jVar2.mo44a(null);
                iVar = iVar4;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(iVar2);
            arrayList.add(poiDetail);
            arrayList.add(iVar);
            arrayList.add(iVar3);
            C39456o.m87753a((Collection<? extends C0013i<?>>) arrayList).mo29c(new C0011g<Void, List<TResult>>(arrayList) {

                /* renamed from: a */
                final /* synthetic */ Collection f100874a;

                {
                    this.f100874a = r1;
                }

                public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                    if (this.f100874a.size() == 0) {
                        return Collections.emptyList();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C0013i e : this.f100874a) {
                        arrayList.add(e.mo34e());
                    }
                    return arrayList;
                }
            }).mo20a((C0011g<TResult, TContinuationResult>) new C39097ac<TResult,TContinuationResult>(this.mHandler, TextExtraStruct.TYPE_CUSTOM, this.f99872b), (Executor) C0013i.f24a);
        }
    }

    public boolean sendRequest(Object... objArr) {
        if (!checkParams(objArr)) {
            return false;
        }
        this.mIsLoading = true;
        if (isDataEmpty()) {
            this.mListQueryType = 1;
        } else {
            this.mListQueryType = objArr[0].intValue();
        }
        switch (this.mListQueryType) {
            case 1:
                refreshList(objArr);
                break;
            case 2:
                loadLatestList(objArr);
                break;
            case 4:
                loadMoreList(objArr);
                break;
            case 5:
                if (m86978a(2, objArr)) {
                    if (this.mData != null) {
                        ((C37860c) this.mData).f96382c = 0;
                        if (!C9376b.m18558a((Collection<T>) ((C37860c) this.mData).f96380a)) {
                            ArrayList arrayList = new ArrayList();
                            for (C37859b bVar : ((C37860c) this.mData).f96380a) {
                                if (bVar instanceof PoiDetail) {
                                    arrayList.add(bVar);
                                }
                            }
                            ((C37860c) this.mData).f96380a.clear();
                            ((C37860c) this.mData).f96380a.addAll(arrayList);
                        }
                    }
                    String a = mo55861a();
                    this.f99873c = a;
                    C39065f fVar = objArr[1];
                    m86977a(fVar.f99618a, fVar.f99627j, a, fVar.f99628k, fVar.f99621d, fVar.f99622e, fVar.f99620c);
                    break;
                }
                break;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C37860c cVar) {
        boolean z;
        if (cVar == null) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            this.f99878i = false;
            if (this.mListQueryType == 2 && !isDataEmpty()) {
                ((C37860c) this.mData).f96380a.clear();
            }
            int size = cVar.f96380a.size();
            for (int i = 0; i < size; i++) {
                C37859b bVar = (C37859b) cVar.f96380a.get(i);
                if (bVar != null && bVar.getFeedType() == 65280) {
                    Aweme aweme = bVar.getAweme();
                    aweme.appendMobParam("page_poi_id", this.f99874d);
                    aweme.appendMobParam("page_poi_city", this.f99875e);
                    aweme.appendMobParam("page_poi_device_samecity", this.f99876f);
                    aweme.appendMobParam("page_poi_backend_type", this.f99877g);
                    Aweme updateAweme = C23324d.m57378a().updateAweme(aweme);
                    IRequestIdService a = C23325e.m57379a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(updateAweme.getAid());
                    sb.append(10);
                    a.setRequestIdAndIndex(sb.toString(), cVar.f96385f, i);
                    bVar.setAweme(updateAweme);
                    cVar.f96380a.set(i, bVar);
                }
            }
            if (this.mListQueryType != 1) {
                Iterator it = cVar.f96380a.iterator();
                while (it.hasNext()) {
                    C37859b bVar2 = (C37859b) it.next();
                    if (!isDataEmpty() && ((C37860c) this.mData).f96380a.indexOf(bVar2) >= 0) {
                        it.remove();
                    }
                }
            }
            switch (this.mListQueryType) {
                case 1:
                    this.mData = cVar;
                    break;
                case 2:
                    cVar.f96380a.addAll(getItems());
                    ((C37860c) this.mData).f96380a = cVar.f96380a;
                    break;
                case 4:
                case 5:
                    ((C37860c) this.mData).f96380a.addAll(cVar.f96380a);
                    ((C37860c) this.mData).f96383d &= cVar.f96383d;
                    break;
            }
            m86979b(cVar);
            for (int i2 = 0; i2 < ((C37860c) this.mData).f96380a.size(); i2++) {
                if (((C37859b) ((C37860c) this.mData).f96380a.get(i2)).getFeedType() == 65280) {
                    ((C37859b) ((C37860c) this.mData).f96380a.get(i2)).getAweme().setAwemePosition(i2);
                }
            }
            return;
        }
        if (this.mListQueryType == 1) {
            this.mData = null;
        }
        if (!(this.mData == null || this.mListQueryType == 2)) {
            ((C37860c) this.mData).f96383d = 0;
        }
    }

    /* renamed from: a */
    protected static boolean m86978a(int i, Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m86977a(String str, int i, String str2, long j, String str3, String str4, String str5) {
        long j2;
        PoiFeedApi poiFeedApi = f99871h;
        if (C9376b.m18558a((Collection<T>) getItems())) {
            j2 = 0;
        } else {
            j2 = ((C37860c) this.mData).f96382c;
        }
        poiFeedApi.getAwemeList(str, i, 20, j2, j, str3, str4, 3, str5).mo20a((C0011g<TResult, TContinuationResult>) new C39124h<TResult,TContinuationResult>(this.mHandler, TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN, str2), C0013i.f25b);
    }
}
