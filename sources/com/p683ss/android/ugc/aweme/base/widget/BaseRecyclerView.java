package com.p683ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.widget.BaseRecyclerView */
public class BaseRecyclerView extends RecyclerView {

    /* renamed from: N */
    private List<Object> f63267N;

    public int getEndItemIndex() {
        if (!mo49162o()) {
            return getAdapter().getItemCount() - 1;
        }
        return 0;
    }

    public int getFirstPosition() {
        if (getChildCount() <= 0) {
            return -1;
        }
        return m4275f(getChildAt(0));
    }

    public int getLastPosition() {
        if (getChildCount() <= 0) {
            return -1;
        }
        return m4275f(getChildAt(getChildCount() - 1));
    }

    public int getStartItemIndex() {
        if (!mo49162o()) {
            return 0;
        }
        return getAdapter().getItemCount() - 1;
    }

    /* renamed from: o */
    public boolean mo49162o() {
        if (getLayoutManager() instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) getLayoutManager()).f4901f;
        }
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getLayoutManager()).f4554k;
        }
        return false;
    }

    public BaseRecyclerView(Context context) {
        super(context);
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (this.f63267N != null) {
            Iterator it = this.f63267N.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public BaseRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
