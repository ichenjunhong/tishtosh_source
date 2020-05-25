package android.support.p043v7.widget;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.view.C1002a;
import android.support.p030v4.view.p041a.C1008c;
import android.support.p030v4.view.p041a.C1008c.C1010b;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;

/* renamed from: android.support.v7.widget.an */
public final class C1428an extends C1002a {

    /* renamed from: a */
    final RecyclerView f5125a;

    /* renamed from: d */
    public final C1002a f5126d = new C1429a(this);

    /* renamed from: android.support.v7.widget.an$a */
    public static class C1429a extends C1002a {

        /* renamed from: a */
        final C1428an f5127a;

        public C1429a(C1428an anVar) {
            this.f5127a = anVar;
        }

        /* renamed from: a */
        public final void mo1119a(View view, C1008c cVar) {
            super.mo1119a(view, cVar);
            if (!this.f5127a.mo5531a() && this.f5127a.f5125a.getLayoutManager() != null) {
                this.f5127a.f5125a.getLayoutManager().mo5025a(view, cVar);
            }
        }

        /* renamed from: a */
        public final boolean mo1246a(View view, int i, Bundle bundle) {
            if (super.mo1246a(view, i, bundle)) {
                return true;
            }
            if (this.f5127a.mo5531a() || this.f5127a.f5125a.getLayoutManager() == null) {
                return false;
            }
            this.f5127a.f5125a.getLayoutManager();
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5531a() {
        return this.f5125a.mo4882n();
    }

    public C1428an(RecyclerView recyclerView) {
        this.f5125a = recyclerView;
    }

    /* renamed from: a */
    public final void mo1322a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1322a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !mo5531a()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo4728a(accessibilityEvent);
            }
        }
    }

    /* renamed from: a */
    public final void mo1119a(View view, C1008c cVar) {
        C1010b bVar;
        super.mo1119a(view, cVar);
        cVar.mo3139b((CharSequence) RecyclerView.class.getName());
        if (!mo5531a() && this.f5125a.getLayoutManager() != null) {
            C1332i layoutManager = this.f5125a.getLayoutManager();
            C1343o oVar = layoutManager.f4750v.f4694e;
            C1349s sVar = layoutManager.f4750v.f4646E;
            if (layoutManager.f4750v.canScrollVertically(-1) || layoutManager.f4750v.canScrollHorizontally(-1)) {
                cVar.mo3130a((int) VideoCacheReadBuffersizeExperiment.DEFAULT);
                cVar.mo3164j(true);
            }
            if (layoutManager.f4750v.canScrollVertically(1) || layoutManager.f4750v.canScrollHorizontally(1)) {
                cVar.mo3130a(4096);
                cVar.mo3164j(true);
            }
            int a = layoutManager.mo4666a(oVar, sVar);
            int b = layoutManager.mo4686b(oVar, sVar);
            if (VERSION.SDK_INT >= 21) {
                bVar = new C1010b(CollectionInfo.obtain(a, b, false, 0));
            } else if (VERSION.SDK_INT >= 19) {
                bVar = new C1010b(CollectionInfo.obtain(a, b, false));
            } else {
                bVar = new C1010b(null);
            }
            if (VERSION.SDK_INT >= 19) {
                cVar.f3230a.setCollectionInfo((CollectionInfo) bVar.f3266a);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008f A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1246a(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.mo1246a(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L_0x0008
            return r6
        L_0x0008:
            boolean r4 = r3.mo5531a()
            r0 = 0
            if (r4 != 0) goto L_0x0098
            android.support.v7.widget.RecyclerView r4 = r3.f5125a
            android.support.v7.widget.RecyclerView$i r4 = r4.getLayoutManager()
            if (r4 == 0) goto L_0x0098
            android.support.v7.widget.RecyclerView r4 = r3.f5125a
            android.support.v7.widget.RecyclerView$i r4 = r4.getLayoutManager()
            android.support.v7.widget.RecyclerView r1 = r4.f4750v
            android.support.v7.widget.RecyclerView$o r1 = r1.f4694e
            android.support.v7.widget.RecyclerView r1 = r4.f4750v
            android.support.v7.widget.RecyclerView$s r1 = r1.f4646E
            android.support.v7.widget.RecyclerView r1 = r4.f4750v
            if (r1 != 0) goto L_0x002a
            return r0
        L_0x002a:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 == r1) goto L_0x0063
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r1) goto L_0x0035
            r5 = 0
        L_0x0033:
            r1 = 0
            goto L_0x008d
        L_0x0035:
            android.support.v7.widget.RecyclerView r5 = r4.f4750v
            r1 = -1
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 == 0) goto L_0x004c
            int r5 = r4.f4746J
            int r2 = r4.mo5064u()
            int r5 = r5 - r2
            int r2 = r4.mo5066w()
            int r5 = r5 - r2
            int r5 = -r5
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            android.support.v7.widget.RecyclerView r2 = r4.f4750v
            boolean r1 = r2.canScrollHorizontally(r1)
            if (r1 == 0) goto L_0x0033
            int r1 = r4.f4745I
            int r2 = r4.mo5063t()
            int r1 = r1 - r2
            int r2 = r4.mo5065v()
            int r1 = r1 - r2
            int r1 = -r1
            goto L_0x008d
        L_0x0063:
            android.support.v7.widget.RecyclerView r5 = r4.f4750v
            boolean r5 = r5.canScrollVertically(r6)
            if (r5 == 0) goto L_0x0078
            int r5 = r4.f4746J
            int r1 = r4.mo5064u()
            int r5 = r5 - r1
            int r1 = r4.mo5066w()
            int r5 = r5 - r1
            goto L_0x0079
        L_0x0078:
            r5 = 0
        L_0x0079:
            android.support.v7.widget.RecyclerView r1 = r4.f4750v
            boolean r1 = r1.canScrollHorizontally(r6)
            if (r1 == 0) goto L_0x0033
            int r1 = r4.f4745I
            int r2 = r4.mo5063t()
            int r1 = r1 - r2
            int r2 = r4.mo5065v()
            int r1 = r1 - r2
        L_0x008d:
            if (r5 != 0) goto L_0x0092
            if (r1 != 0) goto L_0x0092
            return r0
        L_0x0092:
            android.support.v7.widget.RecyclerView r4 = r4.f4750v
            r4.mo4795a(r1, r5)
            return r6
        L_0x0098:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.C1428an.mo1246a(android.view.View, int, android.os.Bundle):boolean");
    }
}
