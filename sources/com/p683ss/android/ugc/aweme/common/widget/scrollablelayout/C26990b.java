package com.p683ss.android.ugc.aweme.common.widget.scrollablelayout;

import android.os.Build.VERSION;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ScrollView;

/* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.b */
public final class C26990b {

    /* renamed from: a */
    public View f71218a;

    /* renamed from: b */
    public C26991a f71219b;

    /* renamed from: c */
    private int f71220c = VERSION.SDK_INT;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.b$a */
    public interface C26991a {
        /* renamed from: l */
        View mo50471l();
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.b$b */
    public interface C26992b {
        /* renamed from: o */
        boolean mo49162o();
    }

    /* renamed from: b */
    public final boolean mo55139b() {
        View a = mo55137a();
        if (a == null) {
            return false;
        }
        if (a instanceof AdapterView) {
            return m65164a((AdapterView) a);
        }
        if (a instanceof ScrollView) {
            return m65165a((ScrollView) a);
        }
        if (a instanceof C26992b) {
            return ((C26992b) a).mo49162o();
        }
        if (a instanceof RecyclerView) {
            return m65162a((RecyclerView) a);
        }
        if (a instanceof WebView) {
            return m65163a((WebView) a);
        }
        throw new IllegalStateException("scrollableView must be a instance of AdapterView|ScrollView|RecyclerView");
    }

    /* renamed from: a */
    public final View mo55137a() {
        if (this.f71219b == null) {
            return this.f71218a;
        }
        return this.f71219b.mo50471l();
    }

    /* renamed from: a */
    private static boolean m65163a(WebView webView) {
        if (webView == null || webView.getScrollY() > 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m65164a(AdapterView adapterView) {
        if (adapterView != null) {
            int firstVisiblePosition = adapterView.getFirstVisiblePosition();
            View childAt = adapterView.getChildAt(0);
            if (childAt == null || (firstVisiblePosition == 0 && childAt != null && childAt.getTop() == 0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m65162a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            C1332i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                int j = ((LinearLayoutManager) layoutManager).mo4749j();
                View childAt = recyclerView.getChildAt(0);
                if (childAt == null) {
                    return true;
                }
                if (j != 0 || childAt.getTop() < ((MarginLayoutParams) childAt.getLayoutParams()).topMargin) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m65165a(ScrollView scrollView) {
        if (scrollView == null || scrollView.getScrollY() > 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo55138a(int i, int i2, int i3) {
        View a = mo55137a();
        if (a instanceof AbsListView) {
            AbsListView absListView = (AbsListView) a;
            if (this.f71220c >= 21) {
                absListView.fling(i);
            } else {
                absListView.smoothScrollBy(i2, i3);
            }
        } else if (a instanceof ScrollView) {
            ((ScrollView) a).fling(i);
        } else if (a instanceof RecyclerView) {
            ((RecyclerView) a).mo4820b(0, i);
        } else if (a instanceof WebView) {
            ((WebView) a).flingScroll(0, i);
        }
    }
}
