package com.p683ss.android.ugc.aweme.search.performance;

import android.os.Handler;
import android.os.Looper;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.search.performance.h */
public final class C41454h {

    /* renamed from: e */
    public static volatile AtomicInteger f105081e = new AtomicInteger(0);

    /* renamed from: a */
    public ViewGroup f105082a;

    /* renamed from: b */
    public C41456a f105083b;

    /* renamed from: c */
    public Queue<C1352v> f105084c = new LinkedList();

    /* renamed from: d */
    public Handler f105085d = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public int f105086f = 0;

    /* renamed from: com.ss.android.ugc.aweme.search.performance.h$a */
    public interface C41456a {
        /* renamed from: b */
        C1352v mo56661b(ViewGroup viewGroup);
    }

    public C41454h(ViewGroup viewGroup, C41456a aVar) {
        this.f105082a = viewGroup;
        this.f105083b = aVar;
    }
}
