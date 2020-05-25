package com.p683ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27379l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37860c;
import com.p683ss.android.ugc.aweme.poi.C39065f;
import com.p683ss.android.ugc.aweme.poi.api.PoiFeedApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.poi.model.i */
public final class C39125i extends C39140x implements C27379l {
    public C39125i() {
        this(65441);
    }

    /* renamed from: a */
    public final List<Aweme> mo55861a() {
        List<C37859b> items = getItems();
        if (items == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C37859b bVar : items) {
            if (bVar.getFeedType() == 65280) {
                arrayList.add(bVar.getAweme());
            }
        }
        return arrayList;
    }

    public C39125i(int i) {
        super(i);
    }

    public final void setItems(List<C37859b> list) {
        if (this.mData == null) {
            this.mData = new C37860c();
        }
        ((C37860c) this.mData).f96380a = list;
    }

    public final void refreshList(Object... objArr) {
        if (m86978a(2, objArr)) {
            C39065f fVar = objArr[1];
            f99871h.getAwemeList(fVar.f99618a, fVar.f99627j, 20, 0, fVar.f99620c, 0).mo20a((C0011g<TResult, TContinuationResult>) new C39124h<TResult,TContinuationResult>(this.mHandler, TextExtraStruct.TYPE_CUSTOM, null), C0013i.f25b);
        }
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        if (m86978a(2, objArr)) {
            C39065f fVar = objArr[1];
            String str = fVar.f99618a;
            int i = fVar.f99627j;
            String str2 = fVar.f99620c;
            PoiFeedApi poiFeedApi = f99871h;
            if (C9376b.m18558a((Collection<T>) getItems())) {
                j = 0;
            } else {
                j = ((C37860c) this.mData).f96382c;
            }
            poiFeedApi.getAwemeList(str, i, 20, j, str2, 0).mo20a((C0011g<TResult, TContinuationResult>) new C39124h<TResult,TContinuationResult>(this.mHandler, TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN, null), C0013i.f25b);
        }
    }
}
