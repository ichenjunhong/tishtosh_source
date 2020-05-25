package com.p683ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.C47270j;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.C47270j.C47271a;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.C47270j.C47272b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRecyclerView */
public final class MvThumbnailRecyclerView extends RecyclerView {

    /* renamed from: N */
    final int f119409N;

    /* renamed from: O */
    int f119410O;

    public MvThumbnailRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MvThumbnailRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getMScrollX() {
        return this.f119410O;
    }

    public final int getCurrentPosition() {
        return this.f119410O / this.f119409N;
    }

    public final float getOffset() {
        return (((float) this.f119410O) % ((float) this.f119409N)) / ((float) this.f119409N);
    }

    public final void setMScrollX(int i) {
        this.f119410O = i;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            C47270j jVar = new C47270j(C47272b.START, C47271a.ICON_LIST, 0, 0.0f, 12, null);
            C47718bf.m103288a(jVar);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public MvThumbnailRecyclerView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f119409N = C47314b.m102688a(context);
        if (VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
        }
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        mo4801a((C1340m) new C1340m(this) {

            /* renamed from: a */
            final /* synthetic */ MvThumbnailRecyclerView f119411a;

            {
                this.f119411a = r1;
            }

            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                C52711k.m112240b(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    MvThumbnailRecyclerView mvThumbnailRecyclerView = this.f119411a;
                    int i2 = mvThumbnailRecyclerView.f119410O % mvThumbnailRecyclerView.f119409N;
                    if (i2 <= mvThumbnailRecyclerView.f119409N / 2) {
                        mvThumbnailRecyclerView.mo4795a(-i2, 0);
                        return;
                    }
                    mvThumbnailRecyclerView.mo4795a(mvThumbnailRecyclerView.f119409N - i2, 0);
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                C52711k.m112240b(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i, i2);
                MvThumbnailRecyclerView mvThumbnailRecyclerView = this.f119411a;
                mvThumbnailRecyclerView.setMScrollX(mvThumbnailRecyclerView.getMScrollX() + i);
                C47718bf.m103288a(new C47270j(C47272b.SCROLL, C47271a.ICON_LIST, this.f119411a.getCurrentPosition(), this.f119411a.getOffset()));
            }
        });
    }

    /* renamed from: a */
    public final void mo94584a(int i, float f, boolean z) {
        if (f > 0.99f) {
            f = 1.0f;
        }
        float f2 = ((((float) i) + f) * ((float) this.f119409N)) - ((float) this.f119410O);
        if (z) {
            mo4795a((int) f2, 0);
        } else {
            scrollBy((int) f2, 0);
        }
    }

    public /* synthetic */ MvThumbnailRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
