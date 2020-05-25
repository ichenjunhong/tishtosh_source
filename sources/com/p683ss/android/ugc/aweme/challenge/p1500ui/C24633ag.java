package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.common.p1589a.C26843i;
import com.p683ss.android.ugc.aweme.setting.C41632l;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.ag */
public final class C24633ag extends C1340m {

    /* renamed from: a */
    private int f65189a;

    /* renamed from: b */
    private int f65190b;

    /* renamed from: c */
    private int[] f65191c = new int[2];

    /* renamed from: d */
    private int f65192d = ViewConfiguration.get(C11010c.m22280a()).getScaledTouchSlop();

    /* renamed from: e */
    private C24634a f65193e;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ag$a */
    class C24634a {

        /* renamed from: a */
        public int f65194a = -1;

        /* renamed from: b */
        public int f65195b = -1;

        /* renamed from: c */
        public int f65196c = -1;

        C24634a() {
        }
    }

    /* renamed from: a */
    private static boolean m60130a(C1352v vVar) {
        if (vVar.mItemViewType == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m60128a(Context context) {
        if (this.f65190b == 0) {
            this.f65190b = C9432q.m18670a(context);
        }
    }

    /* renamed from: b */
    private void m60131b(Context context) {
        if (this.f65189a == 0) {
            this.f65189a = C9432q.m18688b(context);
        }
    }

    /* renamed from: a */
    public static void m60129a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1352v b = recyclerView.mo4812b(recyclerView.getChildAt(i));
                if (b instanceof C26843i) {
                    C26843i iVar = (C26843i) b;
                    if (iVar != null) {
                        iVar.aR_();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m60133b(RecyclerView recyclerView) {
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).f4552i == 1) {
                return true;
            }
            return false;
        } else if (!(layoutManager instanceof StaggeredGridLayoutManager) || ((StaggeredGridLayoutManager) layoutManager).f4900e != 1) {
            return false;
        } else {
            return true;
        }
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            mo50495a(recyclerView, false);
        }
    }

    /* renamed from: a */
    public final void mo50495a(RecyclerView recyclerView, boolean z) {
        if (m60133b(recyclerView)) {
            m60134c(recyclerView, z);
        } else {
            m60132b(recyclerView, z);
        }
    }

    /* renamed from: c */
    private void m60134c(RecyclerView recyclerView, boolean z) {
        int i;
        m60131b(recyclerView.getContext());
        recyclerView.getLocationOnScreen(this.f65191c);
        C1332i layoutManager = recyclerView.getLayoutManager();
        int childCount = recyclerView.getChildCount();
        int i2 = this.f65191c[1];
        int min = Math.min(this.f65189a, recyclerView.getHeight() + i2);
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            C1352v b = recyclerView.mo4812b(childAt);
            if (m60130a(b)) {
                C26843i iVar = (C26843i) b;
                if (!iVar.mo54780f()) {
                    if (z) {
                        if (z) {
                            iVar.mo50308c();
                        }
                    }
                }
                int h = layoutManager.mo5051h(childAt);
                int j = layoutManager.mo5055j(childAt);
                int height = childAt.getHeight();
                if (h >= 0 || j <= min) {
                    if (h < 0) {
                        i = h + height;
                    } else {
                        int i4 = j + i2;
                        if (i4 > min) {
                            i = height - (i4 - min);
                        } else {
                            i = height;
                        }
                    }
                    if (i * 4 > height * 3) {
                        iVar.mo54778b(true);
                        iVar.aQ_();
                    } else {
                        iVar.mo54778b(false);
                        iVar.aR_();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m60132b(RecyclerView recyclerView, boolean z) {
        boolean z2;
        int i;
        m60128a(recyclerView.getContext());
        m60131b(recyclerView.getContext());
        recyclerView.getLocationOnScreen(this.f65191c);
        C1332i layoutManager = recyclerView.getLayoutManager();
        int childCount = recyclerView.getChildCount();
        int i2 = this.f65191c[0];
        int min = Math.min(this.f65190b, recyclerView.getWidth() + i2);
        int height = recyclerView.getHeight();
        if (this.f65191c[1] + (height >> 2) <= 0 || this.f65189a - this.f65191c[1] <= (height >> 1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            C1352v b = recyclerView.mo4812b(childAt);
            if (m60130a(b)) {
                C26843i iVar = (C26843i) b;
                if (!iVar.mo54780f()) {
                    if (z) {
                        if (z) {
                            iVar.mo50308c();
                        }
                    }
                }
                if (!z2) {
                    int g = layoutManager.mo5049g(childAt);
                    int i4 = layoutManager.mo5053i(childAt);
                    int width = childAt.getWidth();
                    if (g >= 0 || i4 <= min) {
                        if (g < 0) {
                            i = g + width;
                        } else {
                            int i5 = i4 + i2;
                            if (i5 > min) {
                                i = width - (i5 - min);
                            } else {
                                i = width;
                            }
                        }
                        if (i * 4 > width * 3) {
                            iVar.mo54778b(true);
                            iVar.aQ_();
                        }
                    }
                }
                iVar.mo54778b(false);
                iVar.aR_();
            }
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        int scrollState = recyclerView.getScrollState();
        if (this.f65193e == null) {
            this.f65193e = new C24634a();
        }
        if (scrollState != 0 || (this.f65193e.f65194a == scrollState && this.f65193e.f65195b == i && this.f65193e.f65196c == i2)) {
            z = false;
        } else {
            this.f65193e.f65194a = scrollState;
            this.f65193e.f65195b = i;
            this.f65193e.f65196c = i2;
            z = true;
        }
        if (z && C41632l.m91511a(C11010c.m22280a())) {
            if (m60133b(recyclerView)) {
                i = i2;
            }
            if (Math.abs(i) <= this.f65192d) {
                mo50495a(recyclerView, false);
            }
        }
    }
}
