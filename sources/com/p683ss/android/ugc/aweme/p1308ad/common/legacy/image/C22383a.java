package com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image;

import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.ad.common.legacy.image.a */
public class C22383a extends RemoteImageView {

    /* renamed from: a */
    public C22384a f60288a;

    /* renamed from: b */
    public boolean f60289b;

    /* renamed from: c */
    private WeakReference<C22385b> f60290c;

    /* renamed from: d */
    private UrlModel f60291d;

    /* renamed from: e */
    private boolean f60292e;

    /* renamed from: com.ss.android.ugc.aweme.ad.common.legacy.image.a$a */
    public interface C22384a {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo46606a() {
    }

    public String getUrl() {
        if (this.f60291d == null || this.f60291d.getUrlList() == null || this.f60291d.getUrlList().size() == 0) {
            return "";
        }
        return (String) this.f60291d.getUrlList().get(0);
    }

    public void setAttached(boolean z) {
        this.f60289b = z;
    }

    public void setImageLoadFinishListener(C22384a aVar) {
        this.f60288a = aVar;
    }

    public void setUserVisibleHint(boolean z) {
        this.f60292e = z;
    }

    public void setAnimationListener(C22385b bVar) {
        this.f60290c = new WeakReference<>(bVar);
    }
}
