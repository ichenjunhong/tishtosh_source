package com.p683ss.android.ugc.aweme.sticker.prop.p2315b;

import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.p1793g.C32799a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.sticker.prop.api.StickerPropApi;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.b.b */
public final class C46363b extends C26875a<Aweme, C46362a> {

    /* renamed from: a */
    public StickerPropApi f116973a = ((StickerPropApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(StickerPropApi.class));

    /* renamed from: b */
    private int f116974b;

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C46362a) this.mData).f116967a;
    }

    public final boolean isDataEmpty() {
        if ((this.mData == null || !((C46362a) this.mData).mo93091a()) && C9376b.m18558a((Collection<T>) getItems())) {
            return true;
        }
        return false;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C46362a) this.mData).mo93091a()) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 3) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean deleteItem(Object obj) {
        return C31190f.m72832a(getItems(), (Aweme) obj, this.mNotifyListeners);
    }

    public final void refreshList(Object... objArr) {
        m100715a((String) objArr[1], 0, 20, objArr[2].intValue());
    }

    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new C46362a();
        }
        ((C46362a) this.mData).f116969c = 1;
        ((C46362a) this.mData).f116967a = list;
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((C46362a) this.mData).f116968b;
        }
        m100715a(str, j, 20, objArr[2].intValue());
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        C46362a aVar = (C46362a) obj;
        if (aVar == null || (C9376b.m18558a((Collection<T>) aVar.f116967a) && !aVar.mo93091a())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (aVar.f116967a != null) {
                int size = aVar.f116967a.size();
                for (int i = 0; i < size; i++) {
                    Aweme updateAweme = C23324d.m57378a().updateAweme((Aweme) aVar.f116967a.get(i));
                    updateAweme.setIsTop(((Aweme) aVar.f116967a.get(i)).getIsTop());
                    IRequestIdService a = C23325e.m57379a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(updateAweme.getAid());
                    sb.append(this.f116974b + 10000);
                    a.setRequestIdAndIndex(sb.toString(), aVar.f116970d, i);
                    aVar.f116967a.set(i, updateAweme);
                    if (aVar.f116971e != null) {
                        C29981aa.m70153a().mo60162a(aVar.f116970d, aVar.f116971e);
                    }
                }
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = aVar;
            } else if (i2 == 4) {
                if (aVar.f116967a != null) {
                    if (C9376b.m18558a((Collection<T>) ((C46362a) this.mData).f116967a)) {
                        ((C46362a) this.mData).f116967a = aVar.f116967a;
                    } else {
                        C32799a.m75677a(((C46362a) this.mData).f116967a, aVar.f116967a, C46365c.f116979a);
                    }
                }
                ((C46362a) this.mData).f116968b = aVar.f116968b;
                ((C46362a) this.mData).f116969c = aVar.f116969c & ((C46362a) this.mData).f116969c;
            }
        } else {
            if (this.mData != null) {
                ((C46362a) this.mData).f116969c = 0;
            }
        }
    }

    /* renamed from: a */
    private void m100715a(String str, long j, int i, int i2) {
        this.f116974b = i2;
        C23566n a = C23566n.m57766a();
        C9381g gVar = this.mHandler;
        final String str2 = str;
        final long j2 = j;
        C463641 r0 = new Callable(20) {
            public final Object call() throws Exception {
                return C46363b.this.f116973a.queryStickerAwemeList(str2, j2, 20).get();
            }
        };
        a.mo48750a(gVar, r0, 0);
    }
}
