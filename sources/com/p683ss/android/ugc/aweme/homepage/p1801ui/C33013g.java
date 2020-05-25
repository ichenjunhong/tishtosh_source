package com.p683ss.android.ugc.aweme.homepage.p1801ui;

import android.content.Context;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23687b;
import com.p683ss.android.ugc.aweme.homepage.api.p1800ui.HomePageUIFrameService;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.p1802a.C32993a;
import com.p683ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import java.lang.ref.WeakReference;
import p2628d.C52855s;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.g */
public final class C33013g extends C23687b {

    /* renamed from: c */
    public SparseArray<Fragment> f85735c = new SparseArray<>();

    /* renamed from: d */
    public boolean f85736d;

    /* renamed from: e */
    private final String[] f85737e;

    /* renamed from: f */
    private int[] f85738f;

    /* renamed from: g */
    private String[] f85739g;

    /* renamed from: h */
    private final C11079a f85740h;

    /* renamed from: i */
    private WeakReference<Fragment> f85741i;

    /* renamed from: j */
    private final C32993a f85742j;

    public final int getCount() {
        return HomePageUIFrameServiceImpl.createHomePageUIFrameServicebyMonsterPlugin().getCount(this.f85737e.length);
    }

    /* renamed from: a */
    public final Fragment mo69929a() {
        if (this.f85741i == null) {
            return null;
        }
        WeakReference<Fragment> weakReference = this.f85741i;
        if (weakReference == null) {
            C52711k.m112234a();
        }
        return (Fragment) weakReference.get();
    }

    public final CharSequence getPageTitle(int i) {
        return this.f85737e[i];
    }

    /* renamed from: b */
    public final int mo69930b(int i) {
        if (i >= 0) {
            int[] iArr = this.f85738f;
            if (iArr == null) {
                C52711k.m112234a();
            }
            if (i < iArr.length) {
                int[] iArr2 = this.f85738f;
                if (iArr2 == null) {
                    C52711k.m112234a();
                }
                return iArr2[i];
            }
        }
        return -1;
    }

    public final int getItemPosition(Object obj) {
        C52711k.m112240b(obj, "item");
        int itemPosition = HomePageUIFrameServiceImpl.createHomePageUIFrameServicebyMonsterPlugin().getItemPosition(obj);
        if (itemPosition == 0) {
            return super.getItemPosition(obj);
        }
        return itemPosition;
    }

    /* renamed from: a */
    public final Fragment mo49105a(int i) {
        HomePageUIFrameService createHomePageUIFrameServicebyMonsterPlugin = HomePageUIFrameServiceImpl.createHomePageUIFrameServicebyMonsterPlugin();
        C11079a aVar = this.f85740h;
        int[] iArr = this.f85738f;
        if (iArr == null) {
            C52711k.m112234a();
        }
        int i2 = iArr[i];
        String[] strArr = this.f85739g;
        if (strArr == null) {
            C52711k.m112234a();
        }
        return createHomePageUIFrameServicebyMonsterPlugin.getItemForPagerInMainFragment(aVar, i2, strArr[i]);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "container");
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        C52711k.m112236a(instantiateItem, "super.instantiateItem(container, position)");
        SparseArray<Fragment> sparseArray = this.f85735c;
        if (instantiateItem != null) {
            sparseArray.put(i, (Fragment) instantiateItem);
            C32993a aVar = this.f85742j;
            if (aVar != null) {
                aVar.mo69908a(this.f85735c);
            }
            return instantiateItem;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.Fragment");
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C52711k.m112240b(viewGroup, "container");
        C52711k.m112240b(obj, "item");
        super.destroyItem(viewGroup, i, obj);
        if (obj instanceof Fragment) {
            try {
                if (this.f63177b != null) {
                    this.f63177b.mo2177a((Fragment) obj);
                }
                this.f85735c.remove(i);
                C32993a aVar = this.f85742j;
                if (aVar != null) {
                    aVar.mo69908a(this.f85735c);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment;
        C52711k.m112240b(viewGroup, "container");
        C52711k.m112240b(obj, "item");
        super.setPrimaryItem(viewGroup, i, obj);
        if (this.f85741i != null) {
            WeakReference<Fragment> weakReference = this.f85741i;
            if (weakReference == null) {
                C52711k.m112234a();
            }
            fragment = (Fragment) weakReference.get();
        } else {
            fragment = null;
        }
        if (fragment != obj) {
            this.f85741i = new WeakReference<>((Fragment) obj);
            C32993a aVar = this.f85742j;
            if (aVar != null) {
                aVar.mo69909a(this.f85741i);
            }
        }
    }

    public C33013g(C11079a aVar, Context context, C0654k kVar, C32993a aVar2) {
        C52711k.m112240b(aVar, "mainFragment");
        C52711k.m112240b(kVar, "fm");
        super(kVar);
        this.f85742j = aVar2;
        this.f85740h = aVar;
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf showTimeLineTab = inst.getShowTimeLineTab();
        C52711k.m112236a((Object) showTimeLineTab, "SharePrefCache.inst().showTimeLineTab");
        Object d = showTimeLineTab.mo47782d();
        C52711k.m112236a(d, "SharePrefCache.inst().showTimeLineTab.cache");
        this.f85736d = ((Boolean) d).booleanValue();
        C52855s contentForMainFragment = HomePageUIFrameServiceImpl.createHomePageUIFrameServicebyMonsterPlugin().getContentForMainFragment(context);
        this.f85737e = (String[]) contentForMainFragment.getFirst();
        this.f85738f = (int[]) contentForMainFragment.getSecond();
        this.f85739g = (String[]) contentForMainFragment.getThird();
        C32993a aVar3 = this.f85742j;
        if (aVar3 != null) {
            aVar3.mo69908a(this.f85735c);
        }
    }
}
