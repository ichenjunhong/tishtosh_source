package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.l */
final /* synthetic */ class C33852l implements Runnable {

    /* renamed from: a */
    private final C33849j f87821a;

    /* renamed from: b */
    private final RecyclerView f87822b;

    C33852l(C33849j jVar, RecyclerView recyclerView) {
        this.f87821a = jVar;
        this.f87822b = recyclerView;
    }

    public final void run() {
        C33849j jVar = this.f87821a;
        RecyclerView recyclerView = this.f87822b;
        if (recyclerView.getAdapter() != null && !jVar.f87813b.isEmpty()) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int j = linearLayoutManager.mo4749j();
            int l = linearLayoutManager.mo4751l();
            for (int i = j; i <= l; i++) {
                if (jVar.f87813b.get(Integer.valueOf(i)) != null) {
                    ((C33850a) jVar.f87813b.get(Integer.valueOf(i))).mo71827b(i);
                }
            }
            if (recyclerView.getAdapter().getItemCount() >= l && j != -1) {
                while (true) {
                    if (j > l) {
                        j = -1;
                        break;
                    }
                    try {
                        int itemViewType = recyclerView.getAdapter().getItemViewType(j);
                        if ((itemViewType == 3 || itemViewType == 4) && linearLayoutManager.mo5030a(linearLayoutManager.mo4736c(j), true, true)) {
                            break;
                        }
                        j++;
                    } catch (Exception unused) {
                        return;
                    }
                }
                if (j != jVar.f87815d || jVar.f87813b.get(Integer.valueOf(j)) == null || !((C33850a) jVar.f87813b.get(Integer.valueOf(j))).mo71830e()) {
                    for (Entry entry : jVar.f87813b.entrySet()) {
                        if (!(((Integer) entry.getKey()).intValue() == j || entry.getValue() == null)) {
                            ((C33850a) entry.getValue()).mo71824a();
                        }
                    }
                    if (jVar.f87813b.get(Integer.valueOf(j)) != null) {
                        ((C33850a) jVar.f87813b.get(Integer.valueOf(j))).mo71825a(j);
                        jVar.mo71880a(j);
                    }
                    jVar.f87816e = false;
                }
            }
        }
    }
}
