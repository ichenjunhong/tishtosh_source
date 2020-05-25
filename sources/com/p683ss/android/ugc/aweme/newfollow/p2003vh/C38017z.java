package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.z */
public final class C38017z extends C38014y {
    /* renamed from: e */
    public final void mo64778e() {
        if (mo77429af() != null) {
            View view = this.f96765aX;
            UrlModel urlModel = mo77429af().roomCover;
            C52711k.m112236a((Object) urlModel, "mRoom.roomCover");
            int width = urlModel.getWidth();
            UrlModel urlModel2 = mo77429af().roomCover;
            C52711k.m112236a((Object) urlModel2, "mRoom.roomCover");
            mo64760a(view, width, urlModel2.getHeight());
        }
    }

    /* renamed from: a */
    public final void mo64756a(View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        View view4 = null;
        if (view != null) {
            viewStub = (ViewStub) view.findViewById(R.id.cu2);
        } else {
            viewStub = null;
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.a4k);
        }
        if (viewStub != null) {
            view2 = viewStub.inflate();
        } else {
            view2 = null;
        }
        mo64757a(view2, 4.0f);
        if (view != null) {
            viewStub2 = (ViewStub) view.findViewById(R.id.ctu);
        } else {
            viewStub2 = null;
        }
        if (viewStub2 != null) {
            viewStub2.setLayoutResource(R.layout.ba0);
        }
        if (viewStub2 != null) {
            view3 = viewStub2.inflate();
        } else {
            view3 = null;
        }
        mo64757a(view3, 12.0f);
        if (view != null) {
            viewStub3 = (ViewStub) view.findViewById(R.id.ctz);
        } else {
            viewStub3 = null;
        }
        if (viewStub3 != null) {
            viewStub3.setLayoutResource(R.layout.a3g);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        }
        mo64759a(view4, 16.0f, 16.0f, 0.0f, 0.0f);
    }

    /* renamed from: a */
    public final void mo77421a(int i, int i2) {
        mo64760a(this.f96765aX, i, i2);
    }

    /* renamed from: a */
    public final void mo77475a(int i, float f, int[] iArr) {
        C52711k.m112240b(iArr, "dstSize");
        iArr[0] = i;
        if (f > 1.2533333f) {
            iArr[1] = (int) (((float) i) * 1.2533333f);
        } else {
            iArr[1] = (int) (((float) i) * f);
        }
    }

    /* renamed from: a */
    public final void mo64760a(View view, int i, int i2) {
        LayoutParams layoutParams;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            mo77475a(C9432q.m18670a(mo64749N()), ((float) i2) / ((float) i), iArr);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }
}
