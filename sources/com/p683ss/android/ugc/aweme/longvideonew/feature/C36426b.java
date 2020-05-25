package com.p683ss.android.ugc.aweme.longvideonew.feature;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.b */
public final class C36426b {

    /* renamed from: a */
    public static final C36427a f93306a = new C36427a(null);

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.b$a */
    public static final class C36427a {
        private C36427a() {
        }

        public /* synthetic */ C36427a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C36429d m82194a(int i, int i2) {
            if (i > i2) {
                return new C36429d(i2, i);
            }
            return new C36429d(i, i2);
        }

        /* renamed from: a */
        public static void m82195a(Activity activity, View view, View view2, Video video, C36429d dVar, boolean z) {
            int i;
            int i2;
            int i3;
            C36429d dVar2 = dVar;
            C52711k.m112240b(dVar, "screenSize");
            if (activity != null && view != null && view2 != null) {
                C36427a aVar = C36426b.f93306a;
                int i4 = 0;
                if (video != null) {
                    i = video.getWidth();
                } else {
                    i = 0;
                }
                if (video != null) {
                    i2 = video.getHeight();
                } else {
                    i2 = 0;
                }
                aVar.m82196a(view, i, i2, dVar2.f93309a, dVar2.f93310b, z);
                C36427a aVar2 = C36426b.f93306a;
                if (video != null) {
                    i3 = video.getWidth();
                } else {
                    i3 = 0;
                }
                if (video != null) {
                    i4 = video.getHeight();
                }
                aVar2.m82196a(view2, i3, i4, dVar2.f93309a, dVar2.f93310b, z);
            }
        }

        /* renamed from: a */
        private void m82196a(View view, int i, int i2, int i3, int i4, boolean z) {
            C36429d dVar;
            int i5;
            int i6;
            int i7;
            View view2 = view;
            int i8 = i;
            int i9 = i2;
            int i10 = i3;
            int i11 = i4;
            C52711k.m112240b(view2, "view");
            C36427a aVar = this;
            if (!z) {
                double d = (double) i8;
                double d2 = (double) i9;
                Double.isNaN(d);
                Double.isNaN(d2);
                double d3 = d / d2;
                double d4 = (double) i10;
                double d5 = (double) i11;
                Double.isNaN(d4);
                Double.isNaN(d5);
                if (d3 > d4 / d5) {
                    Double.isNaN(d4);
                    Double.isNaN(d2);
                    double d6 = d4 * d2;
                    Double.isNaN(d);
                    i11 = (int) (d6 / d);
                    i7 = i10;
                } else {
                    Double.isNaN(d5);
                    Double.isNaN(d);
                    double d7 = d5 * d;
                    Double.isNaN(d2);
                    i7 = (int) (d7 / d2);
                }
                dVar = new C36429d(i7, i11);
            } else {
                double d8 = (double) i8;
                double d9 = (double) i9;
                Double.isNaN(d8);
                Double.isNaN(d9);
                if (d8 / d9 > 0.625d) {
                    if (i8 <= 0 || i9 <= 0) {
                        i6 = i10;
                    } else {
                        i6 = (i8 * i10) / i9;
                    }
                    i5 = i10;
                } else {
                    if (i8 <= 0 || i9 <= 0) {
                        i5 = i11;
                    } else {
                        i5 = (i9 * i11) / i8;
                    }
                    i6 = i11;
                }
                dVar = new C36429d(i6, i5);
            }
            int i12 = dVar.f93309a;
            int i13 = dVar.f93310b;
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (marginLayoutParams.width != i12 || marginLayoutParams.height != i13 || VERSION.SDK_INT < 19) {
                    marginLayoutParams.width = i12;
                    marginLayoutParams.height = i13;
                    view2.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
