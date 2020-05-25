package com.p683ss.android.ugc.aweme.adaptation;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.adaptation.C22453b.C22458d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.adaptation.c */
public final /* synthetic */ class C22459c implements Runnable {

    /* renamed from: a */
    private final Activity f60489a;

    /* renamed from: b */
    private final ViewGroup f60490b;

    /* renamed from: c */
    private final View f60491c;

    /* renamed from: d */
    private final int f60492d;

    /* renamed from: e */
    private final C22458d f60493e;

    public C22459c(Activity activity, ViewGroup viewGroup, View view, int i, C22458d dVar) {
        this.f60489a = activity;
        this.f60490b = viewGroup;
        this.f60491c = view;
        this.f60492d = i;
        this.f60493e = dVar;
    }

    public final void run() {
        int i;
        Activity activity = this.f60489a;
        ViewGroup viewGroup = this.f60490b;
        View view = this.f60491c;
        int i2 = this.f60492d;
        C22458d dVar = this.f60493e;
        if (activity != null) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (C22453b.m55514f()) {
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (Exception unused) {
                }
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            int i3 = displayMetrics.heightPixels;
            int i4 = displayMetrics.widthPixels;
            boolean z = C18920g.m46054c() && C22453b.m55506a((Context) activity);
            if (z) {
                i = 0;
            } else {
                i = C22453b.m55504a(activity);
            }
            C224541 r0 = new Runnable(activity, viewGroup, view, C22453b.m55508b(activity), i3, i4, i, C22453b.m55509c(activity), i2, z, dVar) {

                /* renamed from: a */
                final /* synthetic */ Activity f60477a;

                /* renamed from: b */
                final /* synthetic */ ViewGroup f60478b;

                /* renamed from: c */
                final /* synthetic */ View f60479c;

                /* renamed from: d */
                final /* synthetic */ boolean f60480d;

                /* renamed from: e */
                final /* synthetic */ int f60481e;

                /* renamed from: f */
                final /* synthetic */ int f60482f;

                /* renamed from: g */
                final /* synthetic */ int f60483g;

                /* renamed from: h */
                final /* synthetic */ int f60484h;

                /* renamed from: i */
                final /* synthetic */ int f60485i;

                /* renamed from: j */
                final /* synthetic */ boolean f60486j;

                /* renamed from: k */
                final /* synthetic */ C22458d f60487k;

                public final void run() {
                    boolean z;
                    int i;
                    if (this.f60477a != null && !this.f60477a.isFinishing() && this.f60478b != null && this.f60479c != null) {
                        C22453b.m55505a().f60470f = this.f60478b.getHeight();
                        C22453b.m55505a().f60471g = this.f60480d;
                        double d = (double) this.f60481e;
                        Double.isNaN(d);
                        double d2 = d * 0.05263157894736842d;
                        double d3 = (double) this.f60482f;
                        double d4 = (double) this.f60481e;
                        Double.isNaN(d3);
                        Double.isNaN(d4);
                        double d5 = d3 / d4;
                        C22453b.m55505a().f60467c = this.f60483g;
                        boolean z2 = true;
                        if (this.f60484h != C22453b.m55505a().f60468d) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C22453b.m55505a().f60468d = this.f60484h;
                        if (this.f60483g > 0 && ((double) this.f60483g) < d2) {
                            i = (int) C9432q.m18687b(C11010c.m22280a(), (float) this.f60485i);
                            C22453b.m55505a().f60469e = this.f60483g;
                        } else if ((this.f60483g == 0 || this.f60486j) && d5 <= 0.5d) {
                            i = (int) C9432q.m18687b(C11010c.m22280a(), (float) this.f60485i);
                            C22453b.m55505a().f60469e = 0;
                        } else {
                            C22453b.m55505a().f60469e = 0;
                            i = 0;
                            z2 = false;
                        }
                        C22453b.m55505a().f60472h.f117627a = false;
                        C22453b.m55505a().f60472h.f117630d = this.f60483g;
                        if (this.f60479c != null) {
                            LayoutParams layoutParams = (LayoutParams) this.f60479c.getLayoutParams();
                            if (layoutParams.height != i) {
                                layoutParams.height = i;
                                this.f60479c.setLayoutParams(layoutParams);
                            }
                            if (C22453b.m55505a().f60473k != z2 || z) {
                                C22453b.m55505a().f60473k = z2;
                                for (int i2 = 0; i2 < this.f60478b.getChildCount(); i2++) {
                                    Object tag = this.f60478b.getChildAt(i2).getTag(R.id.aeh);
                                    if (tag instanceof C22456b) {
                                        ((C22456b) tag).mo46747a();
                                    }
                                }
                            }
                        }
                        if (this.f60487k != null) {
                            this.f60487k.aA_();
                        }
                    }
                }

                {
                    this.f60477a = r1;
                    this.f60478b = r2;
                    this.f60479c = r3;
                    this.f60480d = r4;
                    this.f60481e = r5;
                    this.f60482f = r6;
                    this.f60483g = r7;
                    this.f60484h = r8;
                    this.f60485i = r9;
                    this.f60486j = r10;
                    this.f60487k = r11;
                }
            };
            C18842a.m45934b(r0);
        }
    }
}
