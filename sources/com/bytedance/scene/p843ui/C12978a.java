package com.bytedance.scene.p843ui;

import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.group.C12919g;

/* renamed from: com.bytedance.scene.ui.a */
public abstract class C12978a extends PagerAdapter {

    /* renamed from: a */
    private C12896b f33978a;

    /* renamed from: b */
    private C12919g f33979b;

    /* renamed from: a */
    public abstract C12919g mo24567a(int i);

    public C12978a(C12896b bVar) {
        this.f33978a = bVar;
    }

    public boolean isViewFromObject(View view, Object obj) {
        if (((C12924i) obj).f33834b == view) {
            return true;
        }
        return false;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        long j = (long) i;
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(j);
        String sb2 = sb.toString();
        ViewPager viewPager = (ViewPager) viewGroup;
        C12919g gVar = (C12919g) this.f33978a.mo24388a(sb2);
        if (gVar != null) {
            m26100a(viewPager, gVar, i);
            this.f33978a.mo24409d((C12924i) gVar);
            return gVar;
        }
        C12919g a = mo24567a(i);
        m26100a(viewPager, a, i);
        this.f33978a.mo24389a(viewGroup.getId(), (C12924i) a, sb2);
        return a;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f33978a.mo24399b((C12924i) obj);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
        C12919g gVar = (C12919g) obj;
        if (gVar != this.f33979b) {
            if (this.f33979b != null) {
                this.f33979b.mo24447a(false);
            }
            if (gVar != null) {
                gVar.mo24447a(true);
            }
            this.f33979b = gVar;
        }
    }

    /* renamed from: a */
    private void m26100a(ViewPager viewPager, C12919g gVar, int i) {
        boolean z;
        if (this.f33979b == null && viewPager.getCurrentItem() == i) {
            this.f33979b = gVar;
        }
        if (gVar == this.f33979b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (gVar.f33818l) {
                gVar.mo24447a(false);
            }
            gVar.mo24447a(true);
            return;
        }
        if (gVar.f33818l) {
            gVar.mo24447a(false);
        }
    }
}
