package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2305a;

import android.animation.ObjectAnimator;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b.C46146h;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b.C46147i;
import com.p683ss.android.ugc.tools.view.p2509b.C50209b;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.a.e */
public abstract class C46130e<T> extends C50209b<T> {

    /* renamed from: a */
    private final int f116418a = -3;

    /* renamed from: b */
    private final int f116419b = -2;

    /* renamed from: c */
    public boolean f116420c;

    /* renamed from: d */
    private final int f116421d = -4;

    /* renamed from: e */
    private final int f116422e = Integer.MAX_VALUE;

    /* renamed from: f */
    private boolean f116423f;

    /* renamed from: g */
    private C46147i f116424g;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.a.e$a */
    class C46132a extends C1352v {
        C46132a(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract int mo92823b(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C1352v mo92824b(ViewGroup viewGroup, int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo92826b(C1352v vVar, int i);

    /* renamed from: a */
    public final int mo64314a() {
        if (this.f116423f || this.f116420c) {
            return 1;
        }
        return super.mo64314a() + 2;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f4526g = new C1302b() {
                /* renamed from: a */
                public final int mo4690a(int i) {
                    if (C46130e.this.getItemViewType(i) == -2 || C46130e.this.getItemViewType(i) == Integer.MAX_VALUE || C46130e.this.getItemViewType(i) == -4) {
                        return gridLayoutManager.f4521b;
                    }
                    return 1;
                }
            };
        }
    }

    /* renamed from: a */
    public final int mo64315a(int i) {
        if (this.f116423f && i == 0) {
            return -3;
        }
        if (this.f116420c && i == 0) {
            return -4;
        }
        if (i == 0) {
            return -2;
        }
        if (i == mo64314a() - 1) {
            return Integer.MAX_VALUE;
        }
        return mo92823b(i);
    }

    /* renamed from: c */
    public final T mo92831c(int i) {
        if (i >= mo64314a() || C9414h.m18630a(this.f125763k)) {
            return null;
        }
        int min = Math.min(i - 1, this.f125763k.size() - 1);
        List list = this.f125763k;
        if (min < 0) {
            min = 0;
        }
        return list.get(min);
    }

    /* renamed from: c */
    private static View m100238c(ViewGroup viewGroup, int i) {
        LayoutParams layoutParams = new LayoutParams(-1, (int) C9432q.m18687b(viewGroup.getContext(), (float) i));
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(0);
        return view;
    }

    /* renamed from: a */
    public final C1352v mo64316a(ViewGroup viewGroup, int i) {
        if (i == Integer.MAX_VALUE) {
            return new C46132a(m100238c(viewGroup, 10));
        }
        switch (i) {
            case -4:
                return new C46146h(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0p, viewGroup, false));
            case ImageFrame.NV21 /*-3*/:
                this.f116424g = new C46147i(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0q, viewGroup, false));
                return this.f116424g;
            case -2:
                return new C46132a(m100238c(viewGroup, 5));
            default:
                return mo92824b(viewGroup, i);
        }
    }

    /* renamed from: a */
    public final void mo64317a(C1352v vVar, int i) {
        int a = mo64315a(i);
        if (a != Integer.MAX_VALUE) {
            switch (a) {
                case -4:
                    return;
                case ImageFrame.NV21 /*-3*/:
                    C46147i iVar = (C46147i) vVar;
                    iVar.f116462b = ObjectAnimator.ofFloat(iVar.f116461a, "rotation", new float[]{0.0f, 360.0f});
                    iVar.f116462b.setDuration(800);
                    iVar.f116462b.setRepeatMode(1);
                    iVar.f116462b.setRepeatCount(-1);
                    iVar.f116462b.start();
                    return;
                case -2:
                    return;
                default:
                    mo92826b(vVar, i);
                    return;
            }
        }
    }
}
