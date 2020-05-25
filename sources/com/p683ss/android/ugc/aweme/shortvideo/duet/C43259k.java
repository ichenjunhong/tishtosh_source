package com.p683ss.android.ugc.aweme.shortvideo.duet;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a;
import com.p683ss.android.ugc.aweme.base.p1417h.C23541e;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39594be;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.k */
public final class C43259k {

    /* renamed from: a */
    public static C23543g f109389a;

    /* renamed from: b */
    public static final C43259k f109390b = new C43259k();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.k$a */
    public static final class C43260a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f109391a;

        /* renamed from: b */
        final /* synthetic */ View f109392b;

        /* renamed from: c */
        final /* synthetic */ C10660a f109393c;

        /* renamed from: d */
        final /* synthetic */ int f109394d;

        public C43260a(Activity activity, View view, C10660a aVar, int i) {
            this.f109391a = activity;
            this.f109392b = view;
            this.f109393c = aVar;
            this.f109394d = i;
        }

        public final void run() {
            boolean z;
            int i;
            if (!this.f109391a.isFinishing()) {
                int[] iArr = new int[2];
                this.f109392b.getLocationOnScreen(iArr);
                int i2 = 0;
                if (VERSION.SDK_INT < 28) {
                    z = true;
                } else {
                    z = false;
                }
                boolean a = C47842ed.m103485a(this.f109391a);
                int d = this.f109393c.mo19003d();
                int i3 = iArr[0];
                if (a) {
                    d = -this.f109392b.getWidth();
                }
                int i4 = i3 - d;
                int c = (iArr[1] - (this.f109393c.mo19002c() / 2)) + (this.f109392b.getHeight() / 2);
                if (z) {
                    i2 = C43303dy.m94972c(this.f109391a);
                }
                int i5 = c - i2;
                float width = (float) this.f109392b.getWidth();
                C43303dy.m94972c(this.f109391a);
                C10660a aVar = this.f109393c;
                View view = this.f109392b;
                if (C47842ed.m103485a(this.f109391a)) {
                    i = 5;
                } else {
                    i = 3;
                }
                aVar.mo18998a(view, i, i4, i5, width);
                C43259k.f109389a.mo48707b("duet_layout_tool_bar_bubble_hint", this.f109394d + 1);
            }
        }
    }

    private C43259k() {
    }

    /* renamed from: a */
    public static void m94900a() {
        f109389a.mo48710b("duet_layout_up_down_drag_gesture_hint", false);
    }

    /* renamed from: b */
    public static void m94901b() {
        f109389a.mo48710b("duet_layout_three_screen_drag_gesture_hint", false);
    }

    static {
        Context context = C39618d.f101160a;
        C39594be beVar = C39618d.f101174o;
        C52711k.m112236a((Object) beVar, "AVEnv.SP_SERIVCE");
        f109389a = C23541e.m57714a(context, beVar.mo74236a());
    }
}
