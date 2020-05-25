package com.p683ss.android.ugc.aweme.poi.preview.p2071c.p2072a;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.C39181e;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.C39184f;
import com.p683ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.c.a.b */
public final class C39173b extends C39174c {

    /* renamed from: a */
    public C39184f f99914a;

    /* renamed from: d */
    private int f99915d;

    /* renamed from: e */
    private SparseArray<FrameLayout> f99916e = new SparseArray<>();

    public final int getCount() {
        return this.f99917b;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(obj, "object");
        return view == obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo79818a() {
        boolean z;
        if (this.f99917b > 1) {
            C39181e transConfig = this.f99914a.getTransConfig();
            if (transConfig != null) {
                z = transConfig.f99932D;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final FrameLayout mo79819b(int i) {
        return (FrameLayout) this.f99916e.get(i);
    }

    /* renamed from: a */
    public final TransferImage mo79816a(int i) {
        FrameLayout frameLayout = (FrameLayout) this.f99916e.get(i);
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = frameLayout.getChildAt(i2);
                if (childAt instanceof ImageView) {
                    return (TransferImage) childAt;
                }
            }
        }
        return null;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "container");
        FrameLayout frameLayout = (FrameLayout) this.f99916e.get(i);
        if (frameLayout == null) {
            Context context = viewGroup.getContext();
            C39181e transConfig = this.f99914a.getTransConfig();
            TransferImage transferImage = new TransferImage(context);
            C52711k.m112236a((Object) transConfig, "config");
            transferImage.setDuration(transConfig.f99940f);
            transferImage.setScaleType(ScaleType.FIT_CENTER);
            transferImage.setLayoutParams(new LayoutParams(-1, -1));
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setLayoutParams(new LayoutParams(-1, -1));
            frameLayout2.addView(transferImage);
            if (transConfig.f99941g) {
                this.f99914a.mo79848a(i).mo79822a(transferImage, i);
            }
            this.f99916e.put(i, frameLayout2);
            if (i == this.f99915d && this.f99918c != null) {
                this.f99918c.mo79820a();
            }
            frameLayout = frameLayout2;
        }
        ViewGroup viewGroup2 = (ViewGroup) frameLayout.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(frameLayout);
        }
        try {
            viewGroup.addView(frameLayout);
        } catch (Exception unused) {
        }
        return frameLayout;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C52711k.m112240b(viewGroup, "container");
        C52711k.m112240b(obj, "object");
        viewGroup.removeView((View) obj);
    }

    public C39173b(C39184f fVar, int i, int i2) {
        C52711k.m112240b(fVar, "transfer");
        this.f99914a = fVar;
        this.f99917b = i;
        int i3 = i2 + 1;
        if (i3 == this.f99917b) {
            i3 = i2 - 1;
        }
        this.f99915d = i3;
        if (this.f99915d < 0) {
            this.f99915d = 0;
        }
    }
}
