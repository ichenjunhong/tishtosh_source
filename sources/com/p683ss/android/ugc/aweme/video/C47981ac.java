package com.p683ss.android.ugc.aweme.video;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.ac */
public final class C47981ac {

    /* renamed from: a */
    private List<C48021h> f120611a = new LinkedList();

    /* renamed from: com.ss.android.ugc.aweme.video.ac$a */
    static class C47982a {

        /* renamed from: a */
        public static C47981ac f120612a = new C47981ac();
    }

    /* renamed from: a */
    public static C47981ac m103815a() {
        return C47982a.f120612a;
    }

    /* renamed from: c */
    public final synchronized C48021h mo95142c() {
        if (!C48069o.f120792a) {
            return C48121w.m104249M();
        }
        C48121w wVar = new C48121w();
        this.f120611a.add(wVar);
        return wVar;
    }

    /* renamed from: b */
    public final synchronized C48021h mo95141b() {
        if (!C48069o.f120792a) {
            return C48121w.m104249M();
        }
        for (C48021h hVar : this.f120611a) {
            if (hVar.mo95270G()) {
                return hVar;
            }
        }
        return mo95142c();
    }

    /* renamed from: d */
    public final synchronized void mo95143d() {
        if (C48069o.f120792a) {
            for (C48021h hVar : this.f120611a) {
                if (hVar != null) {
                    hVar.mo95264A();
                }
            }
            this.f120611a.clear();
        }
    }

    /* renamed from: a */
    public final synchronized void mo95140a(C48021h hVar) {
        if (C48069o.f120792a) {
            if (hVar != null) {
                hVar.mo95264A();
                this.f120611a.remove(hVar);
            }
        }
    }

    /* renamed from: a */
    public final synchronized C48021h mo95139a(String str) {
        if (!C48069o.f120792a) {
            return C48121w.m104249M();
        }
        ArrayList<C48021h> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            for (C48021h hVar : this.f120611a) {
                if (hVar.mo95259q() != null && str.equals(hVar.mo95259q().getUri())) {
                    return hVar;
                }
                if (!hVar.mo95270G()) {
                    arrayList.add(hVar);
                }
            }
        }
        for (C48021h a : arrayList) {
            mo95140a(a);
        }
        return mo95142c();
    }
}
