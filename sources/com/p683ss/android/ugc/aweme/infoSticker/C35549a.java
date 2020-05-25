package com.p683ss.android.ugc.aweme.infoSticker;

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
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b.C46146h;
import com.p683ss.android.ugc.tools.view.p2509b.C50209b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.a */
public abstract class C35549a<T> extends C50209b<T> {

    /* renamed from: a */
    public boolean f91374a;

    /* renamed from: b */
    public boolean f91375b;

    /* renamed from: c */
    private C35583au f91376c;

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.a$a */
    static class C35551a extends C1352v {
        C35551a(View view) {
            super(view);
        }
    }

    /* renamed from: b */
    public abstract int mo73953b(int i);

    /* renamed from: b */
    public abstract C1352v mo73954b(ViewGroup viewGroup, int i);

    /* renamed from: b */
    public abstract void mo73955b(C1352v vVar, int i);

    /* renamed from: a */
    public int mo64314a() {
        if (this.f91374a) {
            return 1;
        }
        return super.mo64314a() + 2;
    }

    /* renamed from: a */
    public final int mo64315a(int i) {
        if (this.f91374a && i == 0) {
            return -3;
        }
        if (i == 0) {
            return -2;
        }
        if (i == mo64314a() - 1) {
            return -5;
        }
        return mo73953b(i);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f4526g = new C1302b() {
                /* renamed from: a */
                public final int mo4690a(int i) {
                    if (C35549a.this.mo64315a(i) == -2 || C35549a.this.mo64315a(i) == -5 || C35549a.this.mo64315a(i) == -4 || C35549a.this.getItemViewType(i) == Integer.MIN_VALUE) {
                        return gridLayoutManager.f4521b;
                    }
                    return 1;
                }
            };
        }
    }

    /* renamed from: c */
    private static View m80333c(ViewGroup viewGroup, int i) {
        LayoutParams layoutParams = new LayoutParams(-1, (int) C9432q.m18687b(viewGroup.getContext(), (float) i));
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(0);
        return view;
    }

    /* renamed from: a */
    public C1352v mo64316a(ViewGroup viewGroup, int i) {
        switch (i) {
            case -5:
                return new C35551a(m80333c(viewGroup, 8));
            case -4:
                return new C46146h(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0p, viewGroup, false));
            case ImageFrame.NV21 /*-3*/:
                this.f91376c = new C35583au(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0q, viewGroup, false));
                return this.f91376c;
            case -2:
                return new C35551a(m80333c(viewGroup, 5));
            default:
                return mo73954b(viewGroup, i);
        }
    }

    /* renamed from: a */
    public void mo64317a(C1352v vVar, int i) {
        switch (mo64315a(i)) {
            case -5:
                return;
            case -4:
                return;
            case ImageFrame.NV21 /*-3*/:
                C35583au auVar = (C35583au) vVar;
                auVar.f91456b = ObjectAnimator.ofFloat(auVar.f91455a, "rotation", new float[]{0.0f, 360.0f});
                auVar.f91456b.setDuration(800);
                auVar.f91456b.setRepeatMode(1);
                auVar.f91456b.setRepeatCount(-1);
                auVar.f91456b.start();
                return;
            case -2:
                return;
            default:
                mo73955b(vVar, i);
                return;
        }
    }
}
