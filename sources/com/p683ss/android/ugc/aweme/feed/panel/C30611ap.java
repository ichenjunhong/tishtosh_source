package com.p683ss.android.ugc.aweme.feed.panel;

import android.view.View;
import android.view.ViewParent;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.ap */
public final class C30611ap {

    /* renamed from: b */
    public static final C30612a f79934b = new C30612a(null);

    /* renamed from: a */
    public final long f79935a = DmtFixFullVideoBlackIssueSetting.INSTANCE.getDelayMillis();

    /* renamed from: com.ss.android.ugc.aweme.feed.panel.ap$a */
    public static final class C30612a {
        private C30612a() {
        }

        public /* synthetic */ C30612a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.panel.ap$b */
    static final class C30613b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ ViewParent f79936a;

        C30613b(ViewParent viewParent) {
            this.f79936a = viewParent;
        }

        public final /* synthetic */ Object call() {
            StringBuilder sb = new StringBuilder("maybe incorrect view:");
            sb.append(this.f79936a);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder("forceViewRequestLayout:");
            sb3.append(sb2);
            C32458a.m75141a(4, "VideoViewBlackSolver", sb3.toString());
            C9220a.m18311a((Throwable) new C30615aq(sb2));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.panel.ap$c */
    static final class C30614c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C30611ap f79937a;

        /* renamed from: b */
        final /* synthetic */ View f79938b;

        C30614c(C30611ap apVar, View view) {
            this.f79937a = apVar;
            this.f79938b = view;
        }

        public final void run() {
            this.f79937a.mo62807a(this.f79938b);
        }
    }

    /* renamed from: a */
    private static void m71640a(ViewParent viewParent) {
        if (!viewParent.isLayoutRequested()) {
            viewParent.requestLayout();
            if (ReportIssueSetting.INSTANCE.getEnable()) {
                C0013i.m16a((Callable<TResult>) new C30613b<TResult>(viewParent));
                return;
            }
            StringBuilder sb = new StringBuilder("maybe incorrect view:");
            sb.append(viewParent);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder("forceViewRequestLayout:");
            sb3.append(sb2);
            C32458a.m75141a(4, "VideoViewBlackSolver", sb3.toString());
        }
    }

    /* renamed from: a */
    public final void mo62807a(View view) {
        int i = 0;
        try {
            view.requestLayout();
            ViewParent parent = view.getParent();
            while (parent != null && i < MaxParentNumbersToCount.INSTANCE.getMaxNumber()) {
                m71640a(parent);
                parent = parent.getParent();
                StringBuilder sb = new StringBuilder("process:");
                sb.append(parent);
                C32458a.m75141a(3, "VideoViewBlackSolver", sb.toString());
                i++;
            }
            StringBuilder sb2 = new StringBuilder("final process Number:");
            sb2.append(i);
            C32458a.m75141a(4, "VideoViewBlackSolver", sb2.toString());
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }
}
