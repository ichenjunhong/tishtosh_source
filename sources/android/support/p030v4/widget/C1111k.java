package android.support.p030v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.ListView;

/* renamed from: android.support.v4.widget.k */
public final class C1111k extends C1092a {

    /* renamed from: h */
    private final ListView f3542h;

    public C1111k(ListView listView) {
        super(listView);
        this.f3542h = listView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3487a(int r8) {
        /*
            r7 = this;
            android.widget.ListView r0 = r7.f3542h
            int r1 = r0.getCount()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r3 = r0.getChildCount()
            int r4 = r0.getFirstVisiblePosition()
            int r5 = r4 + r3
            r6 = 1
            if (r8 <= 0) goto L_0x0029
            if (r5 < r1) goto L_0x0038
            int r3 = r3 - r6
            android.view.View r8 = r0.getChildAt(r3)
            int r8 = r8.getBottom()
            int r0 = r0.getHeight()
            if (r8 > r0) goto L_0x0038
            return r2
        L_0x0029:
            if (r8 >= 0) goto L_0x0039
            if (r4 > 0) goto L_0x0038
            android.view.View r8 = r0.getChildAt(r2)
            int r8 = r8.getTop()
            if (r8 < 0) goto L_0x0038
            return r2
        L_0x0038:
            return r6
        L_0x0039:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.widget.C1111k.mo3487a(int):boolean");
    }

    /* renamed from: a */
    public final void mo3485a(int i, int i2) {
        ListView listView = this.f3542h;
        if (VERSION.SDK_INT >= 19) {
            listView.scrollListBy(i2);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1) {
            View childAt = listView.getChildAt(0);
            if (childAt != null) {
                listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i2);
            }
        }
    }
}
