package com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate;

import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate.FeedUpdate.C34166d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.b */
public final class C34172b implements Serializable {

    /* renamed from: a */
    private String f88295a;

    /* renamed from: b */
    private int f88296b;

    /* renamed from: c */
    private String f88297c;

    /* renamed from: d */
    private UrlModel f88298d;

    /* renamed from: e */
    private boolean f88299e;

    /* renamed from: f */
    private String f88300f;

    /* renamed from: g */
    private long f88301g;

    /* renamed from: h */
    private List<C34163a> f88302h = new ArrayList();

    public final UrlModel getCoverUrl() {
        return this.f88298d;
    }

    public final String getLastAid() {
        return this.f88300f;
    }

    public final long getLastTime() {
        return this.f88301g;
    }

    public final int getTagCount() {
        return this.f88296b;
    }

    public final String getTitle() {
        return this.f88297c;
    }

    public final String getUid() {
        return this.f88295a;
    }

    public final boolean isPhoto() {
        return this.f88299e;
    }

    public final void generate() {
        if (C23715d.m58202a((Collection<T>) this.f88302h)) {
            this.f88296b = 0;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = this.f88302h.iterator();
        while (it.hasNext()) {
            try {
                if (currentTimeMillis - ((C34163a) it.next()).f88274b > 604800) {
                    it.remove();
                }
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
        }
        if (C23715d.m58202a((Collection<T>) this.f88302h)) {
            this.f88296b = 0;
        } else {
            this.f88296b = this.f88302h.size();
        }
    }

    public final void setPhoto(boolean z) {
        this.f88299e = z;
    }

    public C34172b(C34166d dVar) {
        this.f88295a = String.valueOf(dVar.f88282a);
        add(dVar);
    }

    public final void add(C34166d dVar) {
        boolean z;
        if (dVar.f88284c != null) {
            this.f88300f = dVar.f88284c.f88276a;
            this.f88297c = dVar.f88284c.f88278c;
            this.f88301g = dVar.f88284c.f88277b;
            if (dVar.f88284c.f88281f == 2) {
                z = true;
            } else {
                z = false;
            }
            this.f88299e = z;
            if (this.f88299e) {
                if (dVar.f88284c.f88280e != null && dVar.f88284c.f88280e.size() > 0) {
                    this.f88298d = ((C34164b) dVar.f88284c.f88280e.get(0)).f88275a;
                }
            } else if (dVar.f88284c.f88279d != null) {
                this.f88298d = dVar.f88284c.f88279d.f88286a;
            }
        }
        this.f88302h.addAll(dVar.getAwemeSubsets());
        this.f88296b = this.f88302h.size();
    }
}
