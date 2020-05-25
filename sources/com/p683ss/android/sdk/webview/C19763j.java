package com.p683ss.android.sdk.webview;

import android.webkit.WebResourceResponse;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.sdk.webview.C19761i.C19762a;
import com.p683ss.android.ugc.aweme.web.p2398b.C48268a;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.ss.android.sdk.webview.j */
public class C19763j implements C19762a {

    /* renamed from: a */
    private static volatile C19763j f54445a;

    /* renamed from: b */
    private Set<C19762a> f54446b = new LinkedHashSet();

    private C19763j() {
    }

    /* renamed from: a */
    public static C19763j m48282a() {
        if (f54445a == null) {
            synchronized (C19763j.class) {
                if (f54445a == null) {
                    f54445a = new C19763j();
                }
            }
        }
        return f54445a;
    }

    /* renamed from: b */
    public final void mo41196b() {
        if (!C9376b.m18558a((Collection<T>) this.f54446b)) {
            Iterator it = this.f54446b.iterator();
            while (it.hasNext()) {
                C19762a aVar = (C19762a) it.next();
                if ((aVar instanceof C48268a) && ((C48268a) aVar).f121474d) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo41195a(C19762a aVar) {
        synchronized (this) {
            this.f54446b.add(aVar);
        }
    }

    /* renamed from: a */
    public final WebResourceResponse mo41194a(String str) {
        HashSet<C19762a> hashSet = new HashSet<>();
        synchronized (this) {
            hashSet.addAll(this.f54446b);
        }
        WebResourceResponse webResourceResponse = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        for (C19762a a : hashSet) {
            webResourceResponse = a.mo41194a(str);
            if (webResourceResponse != null) {
                break;
            }
        }
        return webResourceResponse;
    }
}
