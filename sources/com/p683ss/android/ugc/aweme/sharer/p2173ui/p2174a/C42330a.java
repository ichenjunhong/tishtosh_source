package com.p683ss.android.ugc.aweme.sharer.p2173ui.p2174a;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0497a;
import android.support.design.widget.C0535b;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.a.a */
public final class C42330a {

    /* renamed from: a */
    public static final C42331a f106908a = new C42331a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.a.a$a */
    public static final class C42331a {

        /* renamed from: com.ss.android.ugc.aweme.sharer.ui.a.a$a$a */
        public static final class C42332a extends C0497a {

            /* renamed from: a */
            final /* synthetic */ C0535b f106909a;

            /* renamed from: b */
            final /* synthetic */ BottomSheetBehavior f106910b;

            /* renamed from: a */
            public final void mo1315a(View view, float f) {
                C52711k.m112240b(view, "bottomSheet");
            }

            C42332a(C0535b bVar, BottomSheetBehavior bottomSheetBehavior) {
                this.f106909a = bVar;
                this.f106910b = bottomSheetBehavior;
            }

            /* renamed from: a */
            public final void mo1316a(View view, int i) {
                C52711k.m112240b(view, "bottomSheet");
                if (i == 5) {
                    this.f106909a.cancel();
                    this.f106910b.mo1301b(4);
                }
            }
        }

        private C42331a() {
        }

        public /* synthetic */ C42331a(C52707g gVar) {
            this();
        }

        /* renamed from: b */
        private static void m92945b(C0535b bVar, View view) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                BottomSheetBehavior a = BottomSheetBehavior.m1227a((View) parent);
                if (a != null) {
                    Window window = bVar.getWindow();
                    if (window != null) {
                        LayoutParams attributes = window.getAttributes();
                        if (attributes != null) {
                            a.mo1296a(attributes.height);
                        }
                    }
                    return;
                }
                C52711k.m112236a((Object) a, "behavior");
                a.mo1301b(3);
                a.f1646q = new C42332a(bVar, a);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.View");
        }

        /* renamed from: a */
        public final void mo86245a(C0535b bVar, View view) {
            C52711k.m112240b(bVar, "dialog");
            C52711k.m112240b(view, "rootView");
            Context context = bVar.getContext();
            Window window = bVar.getWindow();
            int b = C9432q.m18688b(context) - C9432q.m18695e(context);
            if (window != null) {
                if (b == 0) {
                    b = -1;
                }
                m92944a(window, -1, b);
                m92945b(bVar, view);
                window.setGravity(80);
                LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                window.setAttributes(attributes);
                window.findViewById(R.id.a4q).setBackgroundDrawable(new ColorDrawable(0));
                bVar.setCanceledOnTouchOutside(true);
            }
        }

        /* renamed from: a */
        private static void m92944a(Window window, int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(Build.MANUFACTURER);
            sb.append("-");
            sb.append(Build.MODEL);
            CharSequence sb2 = sb.toString();
            if (TextUtils.equals("vivo-V1821A", sb2) || TextUtils.equals("vivo-V1821T", sb2)) {
                window.setLayout(-1, -2);
            } else {
                window.setLayout(-1, i2);
            }
        }
    }
}
