package com.p683ss.android.ugc.aweme.longvideo.p1934b;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.b.c */
public final class C36357c {

    /* renamed from: a */
    public static final float f93070a = 0.625f;

    /* renamed from: b */
    public static final C36358a f93071b = new C36358a(null);

    /* renamed from: com.ss.android.ugc.aweme.longvideo.b.c$a */
    public static final class C36358a {
        private C36358a() {
        }

        /* renamed from: a */
        public static boolean m82045a(int i, int i2) {
            return ((double) i) > ((double) i2);
        }

        public /* synthetic */ C36358a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m82043a(Activity activity, View view, View view2, Video video, C36359d dVar, boolean z) {
            int i;
            int i2;
            int i3;
            int i4;
            C36359d dVar2 = dVar;
            Activity activity2 = activity;
            C52711k.m112240b(activity, "activity");
            View view3 = view;
            C52711k.m112240b(view, "mVideoView");
            View view4 = view2;
            C52711k.m112240b(view2, "mCover");
            C52711k.m112240b(dVar, "screenSize");
            C36358a aVar = C36357c.f93071b;
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
            aVar.m82044a(view, i, i2, dVar2.f93072a, dVar2.f93073b, z);
            C36358a aVar2 = C36357c.f93071b;
            if (video != null) {
                i3 = video.getWidth();
            } else {
                i3 = 0;
            }
            if (video != null) {
                i4 = video.getHeight();
            } else {
                i4 = 0;
            }
            aVar2.m82044a(view2, i3, i4, dVar2.f93072a, dVar2.f93073b, z);
        }

        /* renamed from: a */
        private void m82044a(View view, int i, int i2, int i3, int i4, boolean z) {
            C36359d dVar;
            int i5;
            int i6;
            int i7;
            View view2 = view;
            int i8 = i;
            int i9 = i2;
            int i10 = i3;
            int i11 = i4;
            C52711k.m112240b(view2, "view");
            C36358a aVar = this;
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
                dVar = new C36359d(i7, i11);
            } else {
                double d8 = (double) i8;
                double d9 = (double) i9;
                Double.isNaN(d8);
                Double.isNaN(d9);
                if (d8 / d9 > ((double) C36357c.f93070a)) {
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
                dVar = new C36359d(i6, i5);
            }
            int i12 = dVar.f93072a;
            int i13 = dVar.f93073b;
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
