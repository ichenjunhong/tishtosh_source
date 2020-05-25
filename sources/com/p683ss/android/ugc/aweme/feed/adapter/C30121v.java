package com.p683ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30198m;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.v */
public final class C30121v extends C30056b {

    /* renamed from: a */
    private final ArrayList<Aweme> f78640a = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.v$a */
    static final class C30122a extends C52712l implements C52671b<C30069bh, C30123w> {

        /* renamed from: a */
        public static final C30122a f78641a = new C30122a();

        C30122a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C30069bh bhVar = (C30069bh) obj;
            C52711k.m112240b(bhVar, "it");
            return new C30123w(bhVar);
        }
    }

    /* renamed from: d */
    public final List<Aweme> mo60336d() {
        return this.f78640a;
    }

    /* renamed from: a */
    public final C30071bj mo55769a() {
        return new C30071bj(null, C30122a.f78641a, 1, null);
    }

    /* renamed from: d */
    public final Aweme mo60335d(int i) {
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return (Aweme) this.f78640a.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo60337e(int i) {
        if (i >= 0 && i < getCount()) {
            this.f78640a.remove(i);
            super.mo60337e(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo60300b(int i) {
        Aweme c = mo60285c(i);
        if (c == null || !c.isForwardAweme() || c.getForwardItem() == null) {
            return super.mo60300b(i);
        }
        Aweme forwardItem = c.getForwardItem();
        C52711k.m112236a((Object) forwardItem, "aweme.forwardItem");
        if (forwardItem.getAwemeType() == 2) {
            return 1;
        }
        return 0;
    }

    public final int getItemPosition(Object obj) {
        C52711k.m112240b(obj, "any");
        C30016ag c = m70474c((View) obj);
        int count = getCount();
        for (int i = 0; i < count; i++) {
            Aweme d = mo60335d(i);
            if (!(c == null || d == null)) {
                String aid = d.getAid();
                Aweme E = c.mo60289E();
                C52711k.m112236a((Object) E, "holder.originalAweme");
                if (C9431p.m18665a(aid, E.getAid())) {
                    return i;
                }
            }
        }
        return -2;
    }

    /* renamed from: a */
    public final void mo60331a(List<? extends Aweme> list) {
        List list2;
        this.f78640a.clear();
        ArrayList<Aweme> arrayList = this.f78640a;
        List list3 = null;
        if (list != null) {
            list2 = C52575l.m112128b((Iterable<? extends T>) list);
        } else {
            list2 = null;
        }
        C30085j.m70621a(arrayList, list2);
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Aweme aweme : list) {
                if (aweme != null) {
                    if (aweme.isForwardAweme()) {
                        arrayList2.add(aweme.getForwardItem());
                    } else {
                        arrayList2.add(aweme);
                    }
                }
            }
            list3 = arrayList2;
        }
        super.mo60331a(list3);
    }

    public C30121v(Context context, LayoutInflater layoutInflater, C30313ae<C30332aw> aeVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, C30198m mVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(aeVar, "listener");
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(onTouchListener, "tapTouchListener");
        C52711k.m112240b(baseFeedPageParams, "baseFeedPageParams");
        C52711k.m112240b(mVar, "iHandlePlay");
        super(context, layoutInflater, aeVar, fragment, onTouchListener, baseFeedPageParams, mVar);
    }
}
