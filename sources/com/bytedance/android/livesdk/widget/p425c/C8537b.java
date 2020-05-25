package com.bytedance.android.livesdk.widget.p425c;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

/* renamed from: com.bytedance.android.livesdk.widget.c.b */
public abstract class C8537b {

    /* renamed from: a */
    protected final C1332i f23418a;

    /* renamed from: b */
    final Rect f23419b;

    /* renamed from: c */
    private int f23420c;

    /* renamed from: a */
    public abstract int mo14968a();

    /* renamed from: a */
    public abstract int mo14969a(View view);

    /* renamed from: b */
    public abstract int mo14970b();

    /* renamed from: b */
    public abstract int mo14971b(View view);

    /* renamed from: c */
    public abstract int mo14972c();

    /* renamed from: c */
    public abstract int mo14973c(View view);

    /* renamed from: a */
    public static C8537b m16822a(C1332i iVar) {
        return new C8537b(iVar) {
            /* renamed from: a */
            public final int mo14968a() {
                return this.f23418a.mo5063t();
            }

            /* renamed from: b */
            public final int mo14970b() {
                return this.f23418a.f4745I;
            }

            /* renamed from: c */
            public final int mo14972c() {
                return (this.f23418a.f4745I - this.f23418a.mo5063t()) - this.f23418a.mo5065v();
            }

            /* renamed from: a */
            public final int mo14969a(View view) {
                return this.f23418a.mo5049g(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: b */
            public final int mo14971b(View view) {
                return this.f23418a.mo5053i(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: c */
            public final int mo14973c(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return C1332i.m4421e(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }
        };
    }

    /* renamed from: b */
    public static C8537b m16823b(C1332i iVar) {
        return new C8537b(iVar) {
            /* renamed from: a */
            public final int mo14968a() {
                return this.f23418a.mo5064u();
            }

            /* renamed from: b */
            public final int mo14970b() {
                return this.f23418a.f4746J;
            }

            /* renamed from: c */
            public final int mo14972c() {
                return (this.f23418a.f4746J - this.f23418a.mo5064u()) - this.f23418a.mo5066w();
            }

            /* renamed from: a */
            public final int mo14969a(View view) {
                return this.f23418a.mo5051h(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: b */
            public final int mo14971b(View view) {
                return this.f23418a.mo5055j(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }

            /* renamed from: c */
            public final int mo14973c(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return C1332i.m4422f(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }
        };
    }

    private C8537b(C1332i iVar) {
        this.f23420c = DynamicTabYellowPointVersion.DEFAULT;
        this.f23419b = new Rect();
        this.f23418a = iVar;
    }
}
