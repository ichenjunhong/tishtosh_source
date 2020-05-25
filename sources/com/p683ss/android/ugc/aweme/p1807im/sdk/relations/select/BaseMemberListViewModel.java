package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select;

import android.arch.lifecycle.C0198r;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.ListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p2628d.C52847n;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel */
public abstract class BaseMemberListViewModel<T> extends ListViewModel<T> {

    /* renamed from: j */
    public int f90193j;

    /* renamed from: k */
    public final C0198r<List<IMContact>> f90194k = new C0198r<>();

    /* renamed from: l */
    public final C0198r<List<IMContact>> f90195l = new C0198r<>();

    /* renamed from: m */
    public final C0198r<C52847n<List<String>, List<Integer>>> f90196m = new C0198r<>();

    /* renamed from: n */
    public final C0198r<Integer> f90197n = new C0198r<>();

    /* renamed from: o */
    public final C0198r<Integer> f90198o = new C0198r<>();

    /* renamed from: p */
    public final C0198r<List<IMContact>> f90199p = new C0198r<>();

    /* renamed from: q */
    public final C0198r<String> f90200q = new C0198r<>();

    /* renamed from: r */
    public final C0198r<IMContact> f90201r = new C0198r<>();

    /* renamed from: s */
    public final List<IMContact> f90202s = new ArrayList();

    /* renamed from: a */
    public abstract void mo72357a();

    /* renamed from: a */
    public abstract void mo72358a(String str);

    public void onCleared() {
        super.onCleared();
    }

    /* renamed from: o */
    public final List<IMContact> mo73183o() {
        List<IMContact> list = (List) this.f90199p.getValue();
        if (list == null) {
            return C52575l.m112097a();
        }
        return list;
    }

    /* renamed from: q */
    public final String mo73185q() {
        String str = (String) this.f90200q.getValue();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: s */
    public final void mo73187s() {
        this.f90199p.postValue(C52575l.m112097a());
    }

    /* renamed from: m */
    public final boolean mo73181m() {
        Integer num = (Integer) this.f90197n.getValue();
        if (num != null && num.intValue() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo73182n() {
        Integer num = (Integer) this.f90198o.getValue();
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final int mo73184p() {
        List list = (List) this.f90199p.getValue();
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: r */
    public final void mo73186r() {
        int p = mo73184p();
        C0198r<List<IMContact>> rVar = this.f90199p;
        Iterable o = mo73183o();
        Collection arrayList = new ArrayList();
        int i = 0;
        for (Object next : o) {
            int i2 = i + 1;
            if (i < 0) {
                C52575l.m112100b();
            }
            boolean z = true;
            if (i >= p - 1) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
            i = i2;
        }
        rVar.postValue((List) arrayList);
    }

    /* renamed from: a */
    public final void mo73178a(int i) {
        this.f90197n.postValue(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo73180b(int i) {
        this.f90198o.postValue(Integer.valueOf(i));
        if (i == 0) {
            this.f90200q.postValue("");
        }
    }

    /* renamed from: a */
    public final void mo73179a(IMContact iMContact) {
        List list;
        C52711k.m112240b(iMContact, "contact");
        List list2 = (List) this.f90199p.getValue();
        if (list2 != null) {
            list = C52575l.m112139e((Collection<? extends T>) list2);
            if (list.contains(iMContact)) {
                list.remove(iMContact);
            } else {
                list.add(iMContact);
            }
        } else {
            list = Collections.singletonList(iMContact);
        }
        this.f90199p.postValue(list);
    }
}
