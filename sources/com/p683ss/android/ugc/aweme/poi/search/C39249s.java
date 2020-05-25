package com.p683ss.android.ugc.aweme.poi.search;

import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.poi.api.POIApiManager;
import com.p683ss.android.ugc.aweme.poi.model.C39116av;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.poi.search.s */
public final class C39249s extends C26875a<PoiStruct, C39116av> {

    /* renamed from: a */
    public String f100253a;

    /* renamed from: b */
    public String f100254b;

    /* renamed from: c */
    private String f100255c;

    /* renamed from: d */
    private String f100256d;

    /* renamed from: e */
    private int f100257e;

    /* renamed from: f */
    private String f100258f;

    /* renamed from: a */
    public final PoiStruct mo80006a() {
        if (this.mData == null) {
            return null;
        }
        return ((C39116av) this.mData).f99787d;
    }

    public final List<PoiStruct> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C39116av) this.mData).f99784a;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C39116av) this.mData).f99785b) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || (objArr.length != 6 && objArr.length != 1)) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        String str = this.f100253a;
        String str2 = this.f100255c;
        String str3 = this.f100256d;
        int i2 = this.f100257e;
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((C39116av) this.mData).f99786c;
        }
        m87207a(str, str2, str3, i2, i, 20, 0, this.f100258f);
    }

    public final void refreshList(Object... objArr) {
        this.f100253a = objArr[1];
        this.f100255c = String.valueOf(objArr[2]);
        this.f100256d = String.valueOf(objArr[3]);
        this.f100257e = objArr[4].intValue();
        this.f100258f = String.valueOf(objArr[5]);
        m87207a((String) objArr[1], (String) objArr[2], (String) objArr[3], objArr[4].intValue(), 1, 20, 1, this.f100258f);
    }

    public final /* synthetic */ void handleData(Object obj) {
        C39116av avVar = (C39116av) obj;
        boolean z = true;
        if (avVar != null && this.mListQueryType == 1) {
            this.f100254b = C29981aa.m70153a().mo60160a(avVar.f99788e);
        }
        if (avVar != null) {
            if (avVar.f99784a != null) {
                for (PoiStruct put : avVar.f99784a) {
                    put.put("logpb", this.f100254b);
                }
            }
            if (avVar.f99787d != null) {
                avVar.f99787d.put("logpb", this.f100254b);
            }
        }
        int i = this.mListQueryType;
        if (i != 1) {
            if (i == 4 && this.mData != null) {
                if (avVar != null && !C9376b.m18558a((Collection<T>) avVar.f99784a)) {
                    z = false;
                }
                this.mIsNewDataEmpty = z;
                if (this.mIsNewDataEmpty) {
                    ((C39116av) this.mData).f99785b = false;
                    return;
                }
                ((C39116av) this.mData).f99784a.addAll(avVar.f99784a);
                ((C39116av) this.mData).f99785b = avVar.f99785b;
                ((C39116av) this.mData).f99786c = avVar.f99786c;
            }
            return;
        }
        this.mData = avVar;
    }

    /* renamed from: a */
    private void m87207a(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4) {
        C23566n a = C23566n.m57766a();
        C9381g gVar = this.mHandler;
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final int i5 = i;
        final int i6 = i2;
        final int i7 = i4;
        final String str8 = str4;
        C392501 r1 = new Callable(20) {
            public final Object call() throws Exception {
                return POIApiManager.m86870a(str5, str6, str7, i5, i6, 20, i7, str8);
            }
        };
        a.mo48750a(gVar, r1, 0);
    }
}
