package com.p683ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.support.p030v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.feed.experiment.C30220a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.LinkedList;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ap */
public abstract class C30028ap extends PagerAdapter {

    /* renamed from: q */
    protected final LinkedList<View>[] f78382q;

    /* renamed from: r */
    protected final LayoutInflater f78383r;

    /* renamed from: s */
    protected final Context f78384s;

    /* renamed from: t */
    public final int f78385t = 11;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo60298a(View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo60299a(int i, View view, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo60300b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo60301b(View view) {
    }

    /* renamed from: d */
    public void mo60302d(View view) {
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo60297a(int i) {
        int b = mo60300b(i);
        if (b >= 0 && b < this.f78385t) {
            return b;
        }
        StringBuilder sb = new StringBuilder("getItemViewType must return a number which is form 0 to ");
        sb.append(this.f78385t - 1);
        C32458a.m75143a(new Exception(sb.toString()));
        return 0;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        int a = mo60297a(i);
        if (!this.f78382q[a].isEmpty()) {
            view = (View) this.f78382q[a].removeFirst();
        } else {
            view = null;
        }
        View a2 = mo60299a(i, view, viewGroup);
        if (a2.getParent() != null) {
            try {
                ((ViewGroup) a2.getParent()).removeView(a2);
            } catch (Exception e) {
                C30220a.f78947a.mo60570c(new C30029aq(e));
                C9220a.m18311a((Throwable) e);
                C32458a.m75143a(e);
            }
        }
        if (a2.getParent() != viewGroup) {
            viewGroup.addView(a2);
        }
        mo60301b(a2);
        return a2;
    }

    public C30028ap(Context context, LayoutInflater layoutInflater, int i) {
        this.f78383r = layoutInflater;
        this.f78384s = context;
        LinkedList<View>[] linkedListArr = new LinkedList[11];
        for (int i2 = 0; i2 < 11; i2++) {
            linkedListArr[i2] = new LinkedList<>();
        }
        this.f78382q = linkedListArr;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            try {
                viewGroup.removeView(view);
            } catch (Exception e) {
                C32458a.m75143a(e);
            }
            this.f78382q[mo60298a(view)].add(view);
            mo60302d(view);
        }
    }
}
