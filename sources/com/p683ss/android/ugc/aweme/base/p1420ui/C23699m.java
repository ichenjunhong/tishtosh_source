package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.ui.m */
public final class C23699m extends C23693g<C23689d> {

    /* renamed from: b */
    public List<C23695i> f63211b;

    /* renamed from: c */
    HashMap<String, C23695i> f63212c;

    /* renamed from: d */
    List<C23695i> f63213d;

    /* renamed from: e */
    public C0654k f63214e;

    /* renamed from: f */
    public C23702b f63215f;

    /* renamed from: g */
    public C23703c f63216g;

    /* renamed from: h */
    private int f63217h;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.m$a */
    public static class C23700a {

        /* renamed from: a */
        List<C23695i> f63218a = new ArrayList();

        /* renamed from: b */
        public C23702b f63219b;

        /* renamed from: a */
        private int m58161a() {
            if (C9376b.m18558a((Collection<T>) this.f63218a)) {
                return 0;
            }
            Collections.sort(this.f63218a, new Comparator<C23695i>() {
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((C23695i) obj).f63203e - ((C23695i) obj2).f63203e;
                }
            });
            int i = 1;
            for (int i2 = 1; i2 < this.f63218a.size(); i2++) {
                if (((C23695i) this.f63218a.get(i2 - 1)).f63203e != ((C23695i) this.f63218a.get(i2)).f63203e) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: a */
        private static int m58162a(List<C23695i> list) {
            if (C9376b.m18558a((Collection<T>) list)) {
                return 0;
            }
            HashSet hashSet = new HashSet();
            for (C23695i iVar : list) {
                if (iVar != null) {
                    hashSet.add(Integer.valueOf(iVar.f63203e));
                }
            }
            return hashSet.size();
        }

        /* renamed from: a */
        public final C23699m mo49128a(C0654k kVar) {
            C23699m mVar = new C23699m(kVar, m58162a(this.f63218a));
            mVar.f63215f = this.f63219b;
            mVar.f63211b = this.f63218a;
            if (!C9376b.m18558a((Collection<T>) mVar.f63211b)) {
                mVar.f63212c = new HashMap<>(mVar.f63211b.size());
                mVar.f63213d = new ArrayList();
                for (C23695i iVar : mVar.f63211b) {
                    if (iVar != null) {
                        mVar.f63212c.put(iVar.f63200b, iVar);
                        int i = iVar.f63203e;
                        if (i >= mVar.f63213d.size()) {
                            mVar.f63213d.add(i, iVar);
                        }
                    }
                }
                if (mVar.f63215f != null) {
                    mVar.f63215f.mo49131a(mVar.f63213d);
                }
                mVar.f63213d.size();
            }
            return mVar;
        }

        /* renamed from: a */
        public final C23700a mo49125a(Class<? extends C23689d> cls, String str) {
            return mo49127a(cls, str, null);
        }

        /* renamed from: a */
        public final C23700a mo49127a(Class<? extends C23689d> cls, String str, Bundle bundle) {
            return mo49126a(cls, str, m58161a(), 1.0f, bundle);
        }

        /* renamed from: a */
        public final C23700a mo49126a(Class<? extends C23689d> cls, String str, int i, float f, Bundle bundle) {
            List<C23695i> list = this.f63218a;
            C23695i iVar = new C23695i(cls, str, i, f, bundle);
            list.add(iVar);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.m$b */
    public interface C23702b {
        /* renamed from: a */
        void mo49130a(HashMap<Integer, C23689d> hashMap);

        /* renamed from: a */
        void mo49131a(List<C23695i> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.m$c */
    public interface C23703c {
        /* renamed from: a */
        void mo49132a(C23689d dVar, int i);
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
    }

    public final int getItemPosition(Object obj) {
        return -2;
    }

    /* renamed from: a */
    private long m58152a(C23695i iVar) {
        if (iVar == null) {
            return -1;
        }
        return (long) this.f63211b.indexOf(iVar);
    }

    /* renamed from: b */
    private String m58154b(C23695i iVar) {
        return m58153a(this.f63217h, m58152a(iVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C23689d mo49117c(int i) {
        C23695i iVar = (C23695i) this.f63213d.get(i);
        if (iVar != null) {
            try {
                C23689d dVar = (C23689d) iVar.f63199a.newInstance();
                if (!(iVar.f63201c == null || dVar == null)) {
                    dVar.setArguments(iVar.f63201c);
                }
                return dVar;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final long mo2310b(int i) {
        if (this.f63213d == null || this.f63211b == null) {
            return (long) i;
        }
        return (long) this.f63211b.indexOf(this.f63213d.get(i));
    }

    public final float getPageWidth(int i) {
        C23695i iVar;
        if (i < 0 || i >= this.f63213d.size()) {
            iVar = null;
        } else {
            iVar = (C23695i) this.f63213d.get(i);
        }
        if (iVar == null || iVar.f63202d <= 0.0f) {
            return 1.0f;
        }
        return iVar.f63202d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49116a(HashMap<Integer, C23689d> hashMap) {
        if (this.f63215f != null) {
            this.f63215f.mo49130a(hashMap);
        }
    }

    /* renamed from: a */
    public final void mo49124a(String str) {
        if (!C9376b.m18558a((Collection<T>) this.f63211b) && !C9376b.m18558a((Collection<T>) this.f63213d) && !TextUtils.isEmpty(str)) {
            C23695i iVar = (C23695i) this.f63212c.get(str);
            if (iVar != null && this.f63213d.size() > iVar.f63203e && !str.equals(((C23695i) this.f63213d.get(iVar.f63203e)).f63200b)) {
                C23695i iVar2 = (C23695i) this.f63213d.get(iVar.f63203e);
                C0679r a = this.f63214e.mo2225a();
                Fragment a2 = this.f63214e.mo2224a(m58154b(iVar2));
                if (a2 != null) {
                    a.mo2193b(a2);
                }
                Fragment a3 = this.f63214e.mo2224a(m58154b(iVar));
                if (a3 != null && a3.isAdded()) {
                    a.mo2196c(a3);
                }
                a.mo2195c();
                this.f63213d.remove(iVar.f63203e);
                this.f63213d.add(iVar.f63203e, iVar);
                if (this.f63215f != null) {
                    this.f63215f.mo49131a(this.f63213d);
                }
                notifyDataSetChanged();
            }
        }
    }

    public C23699m(C0654k kVar, int i) {
        super(kVar, i);
        this.f63214e = kVar;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        this.f63217h = viewGroup.getId();
        return super.instantiateItem(viewGroup, i);
    }

    /* renamed from: a */
    private static String m58153a(int i, long j) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49115a(Fragment fragment, int i) {
        C23689d dVar = (C23689d) fragment;
        if (this.f63216g != null) {
            this.f63216g.mo49132a(dVar, i);
        }
    }
}
