package com.p683ss.android.ugc.aweme.base.widget.recyclerview;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import com.p683ss.android.ugc.aweme.base.mvvm.C23562e;
import com.p683ss.android.ugc.aweme.base.widget.BaseRecyclerView;
import com.p683ss.android.ugc.aweme.base.widget.commonitem.NoMoreTextHintView;
import com.p683ss.android.ugc.aweme.base.widget.commonitem.SimpleLoadMoreProgressBar;
import com.p683ss.android.ugc.aweme.base.widget.commonitem.p1424a.C23754a;
import com.p683ss.android.ugc.aweme.base.widget.commonitem.p1424a.C23755b;
import com.p683ss.android.ugc.aweme.base.widget.recyclerview.p1425a.C23757a;
import com.p683ss.android.ugc.aweme.base.widget.recyclerview.p1425a.C23758b;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.base.widget.recyclerview.c */
public abstract class C23760c extends C23759b<C23562e> implements C23758b {

    /* renamed from: a */
    public C23757a f63342a;

    /* renamed from: b */
    private BaseRecyclerView f63343b;

    /* renamed from: c */
    private C1340m f63344c;

    /* renamed from: a */
    public final C23562e mo49214a() {
        return new C23755b();
    }

    /* renamed from: b */
    public C23562e mo49215b() {
        return new C23754a("已显示全部内容");
    }

    /* renamed from: c */
    public final void mo49220c() {
        C23757a aVar = this.f63342a;
        if (aVar.f63335d != null) {
            int indexOf = aVar.f63332a.indexOf(aVar.f63335d);
            if (indexOf != -1) {
                aVar.f63332a.remove(indexOf);
                aVar.f63333b.notifyItemRemoved(indexOf);
            }
        }
    }

    /* renamed from: d */
    public final void mo49221d() {
        C23757a aVar = this.f63342a;
        if (aVar.f63334c) {
            aVar.f63334c = false;
            if (!aVar.f63332a.isEmpty()) {
                aVar.mo49213b();
            }
        }
    }

    /* renamed from: e */
    public final void mo49216e() {
        BaseRecyclerView baseRecyclerView = this.f63343b;
        if (baseRecyclerView.getChildCount() > 0) {
            baseRecyclerView.mo4814b(baseRecyclerView.getAdapter().getItemCount() - 1);
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (recyclerView instanceof BaseRecyclerView) {
            BaseRecyclerView baseRecyclerView = (BaseRecyclerView) recyclerView;
            this.f63343b = baseRecyclerView;
            super.onAttachedToRecyclerView(recyclerView);
            baseRecyclerView.mo4801a(this.f63344c);
            return;
        }
        StringBuilder sb = new StringBuilder("RecyclerView to hold PageLoadingListMultiTypeAdapter must be a ");
        sb.append(BaseRecyclerView.class.getName());
        sb.append(" !");
        throw new IllegalArgumentException(sb.toString());
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        if (recyclerView instanceof BaseRecyclerView) {
            this.f63343b = null;
            super.onDetachedFromRecyclerView(recyclerView);
            ((BaseRecyclerView) recyclerView).mo4818b(this.f63344c);
            return;
        }
        StringBuilder sb = new StringBuilder("RecyclerView to hold PageLoadingListMultiTypeAdapter must be a ");
        sb.append(BaseRecyclerView.class.getName());
        sb.append(" !");
        throw new IllegalArgumentException(sb.toString());
    }

    public C23760c(Context context, List<C23562e> list, Map<Class, Class> map) {
        if (map.get(C23755b.class) == null) {
            map.put(C23755b.class, SimpleLoadMoreProgressBar.class);
        }
        if (map.get(C23754a.class) == null) {
            map.put(C23754a.class, NoMoreTextHintView.class);
        }
        super(context, list, map);
        this.f63344c = new C1340m() {
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
                if ((r3 - r7) >= 0) goto L_0x0065;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
                if ((r3 - r7) >= 0) goto L_0x0065;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f7, code lost:
                if ((r3 - r7) >= 0) goto L_0x0065;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:68:0x0139, code lost:
                if ((r3 - r7) >= 0) goto L_0x0065;
             */
            /* JADX WARNING: Removed duplicated region for block: B:70:0x013f  */
            /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onScrollStateChanged(android.support.p043v7.widget.RecyclerView r6, int r7) {
                /*
                    r5 = this;
                    r0 = r6
                    com.ss.android.ugc.aweme.base.widget.BaseRecyclerView r0 = (com.p683ss.android.ugc.aweme.base.widget.BaseRecyclerView) r0
                    super.onScrollStateChanged(r6, r7)
                    if (r7 != 0) goto L_0x017a
                    android.support.v7.widget.RecyclerView$i r6 = r0.getLayoutManager()
                    android.support.v7.widget.LinearLayoutManager r6 = (android.support.p043v7.widget.LinearLayoutManager) r6
                    int r6 = r6.f4552i
                    r7 = -1
                    r1 = 0
                    r2 = 1
                    if (r6 == 0) goto L_0x00a9
                    boolean r6 = r0.mo49162o()
                    if (r6 != 0) goto L_0x0068
                    int r6 = r0.getChildCount()
                    if (r6 == 0) goto L_0x013d
                    android.support.v7.widget.RecyclerView$i r6 = r0.getLayoutManager()
                    android.support.v7.widget.LinearLayoutManager r6 = (android.support.p043v7.widget.LinearLayoutManager) r6
                    int r3 = r6.f4552i
                    if (r3 != r2) goto L_0x013d
                    boolean r3 = r0.mo49162o()
                    if (r3 != 0) goto L_0x0036
                    int r6 = r6.mo4752m()
                    goto L_0x003a
                L_0x0036:
                    int r6 = r6.mo4750k()
                L_0x003a:
                    if (r6 == r7) goto L_0x013d
                    android.support.v7.widget.RecyclerView$i r7 = r0.getLayoutManager()
                    android.view.View r7 = r7.mo4736c(r6)
                    if (r7 == 0) goto L_0x013d
                    int r3 = r0.getHeight()
                    int r4 = r0.getPaddingBottom()
                    int r3 = r3 - r4
                    int r4 = r7.getBottom()
                    int r3 = r3 - r4
                    android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                    android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
                    int r7 = r7.bottomMargin
                    int r0 = r0.getEndItemIndex()
                    if (r6 != r0) goto L_0x013d
                    int r3 = r3 - r7
                    if (r3 < 0) goto L_0x013d
                L_0x0065:
                    r1 = 1
                    goto L_0x013d
                L_0x0068:
                    int r6 = r0.getChildCount()
                    if (r6 == 0) goto L_0x013d
                    android.support.v7.widget.RecyclerView$i r6 = r0.getLayoutManager()
                    android.support.v7.widget.LinearLayoutManager r6 = (android.support.p043v7.widget.LinearLayoutManager) r6
                    int r3 = r6.f4552i
                    if (r3 != r2) goto L_0x013d
                    boolean r3 = r0.mo49162o()
                    if (r3 != 0) goto L_0x0083
                    int r6 = r6.mo4750k()
                    goto L_0x0087
                L_0x0083:
                    int r6 = r6.mo4752m()
                L_0x0087:
                    if (r6 == r7) goto L_0x013d
                    android.support.v7.widget.RecyclerView$i r7 = r0.getLayoutManager()
                    android.view.View r7 = r7.mo4736c(r6)
                    if (r7 == 0) goto L_0x013d
                    int r3 = r7.getTop()
                    android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                    android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
                    int r7 = r7.topMargin
                    int r0 = r0.getStartItemIndex()
                    if (r6 != r0) goto L_0x013d
                    int r3 = r3 - r7
                    if (r3 < 0) goto L_0x013d
                    goto L_0x0065
                L_0x00a9:
                    boolean r6 = r0.mo49162o()
                    if (r6 != 0) goto L_0x00fb
                    int r6 = r0.getChildCount()
                    if (r6 == 0) goto L_0x013d
                    android.support.v7.widget.RecyclerView$i r6 = r0.getLayoutManager()
                    android.support.v7.widget.LinearLayoutManager r6 = (android.support.p043v7.widget.LinearLayoutManager) r6
                    int r3 = r6.f4552i
                    if (r3 != 0) goto L_0x013d
                    boolean r3 = r0.mo49162o()
                    if (r3 != 0) goto L_0x00ca
                    int r6 = r6.mo4752m()
                    goto L_0x00ce
                L_0x00ca:
                    int r6 = r6.mo4750k()
                L_0x00ce:
                    if (r6 == r7) goto L_0x013d
                    android.support.v7.widget.RecyclerView$i r7 = r0.getLayoutManager()
                    android.view.View r7 = r7.mo4736c(r6)
                    if (r7 == 0) goto L_0x013d
                    int r3 = r0.getWidth()
                    int r4 = r0.getPaddingRight()
                    int r3 = r3 - r4
                    int r4 = r7.getRight()
                    int r3 = r3 - r4
                    android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                    android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
                    int r7 = r7.rightMargin
                    int r0 = r0.getEndItemIndex()
                    if (r6 != r0) goto L_0x013d
                    int r3 = r3 - r7
                    if (r3 < 0) goto L_0x013d
                    goto L_0x0065
                L_0x00fb:
                    int r6 = r0.getChildCount()
                    if (r6 == 0) goto L_0x013d
                    android.support.v7.widget.RecyclerView$i r6 = r0.getLayoutManager()
                    android.support.v7.widget.LinearLayoutManager r6 = (android.support.p043v7.widget.LinearLayoutManager) r6
                    int r3 = r6.f4552i
                    if (r3 != 0) goto L_0x013d
                    boolean r3 = r0.mo49162o()
                    if (r3 != 0) goto L_0x0116
                    int r6 = r6.mo4750k()
                    goto L_0x011a
                L_0x0116:
                    int r6 = r6.mo4752m()
                L_0x011a:
                    if (r6 == r7) goto L_0x013d
                    android.support.v7.widget.RecyclerView$i r7 = r0.getLayoutManager()
                    android.view.View r7 = r7.mo4736c(r6)
                    if (r7 == 0) goto L_0x013d
                    int r3 = r7.getLeft()
                    android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                    android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
                    int r7 = r7.leftMargin
                    int r0 = r0.getStartItemIndex()
                    if (r6 != r0) goto L_0x013d
                    int r3 = r3 - r7
                    if (r3 < 0) goto L_0x013d
                    goto L_0x0065
                L_0x013d:
                    if (r1 == 0) goto L_0x017a
                    com.ss.android.ugc.aweme.base.widget.recyclerview.c r6 = com.p683ss.android.ugc.aweme.base.widget.recyclerview.C23760c.this
                    com.ss.android.ugc.aweme.base.widget.recyclerview.a.a r6 = r6.f63342a
                    boolean r7 = r6.f63334c
                    if (r7 == 0) goto L_0x017a
                    java.util.List<com.ss.android.ugc.aweme.base.mvvm.e> r7 = r6.f63332a
                    boolean r7 = r7.isEmpty()
                    if (r7 != 0) goto L_0x017a
                    java.util.List<com.ss.android.ugc.aweme.base.mvvm.e> r7 = r6.f63332a
                    com.ss.android.ugc.aweme.base.mvvm.e r0 = r6.mo49212a()
                    boolean r7 = r7.contains(r0)
                    if (r7 != 0) goto L_0x017a
                    com.ss.android.ugc.aweme.base.widget.recyclerview.a.b r7 = r6.f63333b
                    r7.mo49217f()
                    java.util.List<com.ss.android.ugc.aweme.base.mvvm.e> r7 = r6.f63332a
                    com.ss.android.ugc.aweme.base.mvvm.e r0 = r6.mo49212a()
                    r7.add(r0)
                    java.util.List<com.ss.android.ugc.aweme.base.mvvm.e> r7 = r6.f63332a
                    int r7 = r7.size()
                    int r7 = r7 - r2
                    com.ss.android.ugc.aweme.base.widget.recyclerview.a.b r0 = r6.f63333b
                    r0.notifyItemInserted(r7)
                    com.ss.android.ugc.aweme.base.widget.recyclerview.a.b r6 = r6.f63333b
                    r6.mo49216e()
                L_0x017a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.widget.recyclerview.C23760c.C237611.onScrollStateChanged(android.support.v7.widget.RecyclerView, int):void");
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
            }
        };
        this.f63342a = new C23757a(list, this);
    }
}
