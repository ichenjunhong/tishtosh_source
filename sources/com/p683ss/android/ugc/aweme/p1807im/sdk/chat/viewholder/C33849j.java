package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImMtShareVideoAutoPlayExperiment;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33366b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33464h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.j */
public class C33849j extends C33366b {

    /* renamed from: g */
    private static volatile C33849j f87811g;

    /* renamed from: a */
    public boolean f87812a;

    /* renamed from: b */
    Map<Integer, C33850a> f87813b = new ConcurrentHashMap();

    /* renamed from: c */
    Set<String> f87814c = new HashSet();

    /* renamed from: d */
    int f87815d = -1;

    /* renamed from: e */
    public boolean f87816e;

    /* renamed from: f */
    volatile C1690c f87817f;

    /* renamed from: h */
    private List<BaseContent> f87818h = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.j$a */
    static class C33850a {

        /* renamed from: a */
        public int f87819a;

        /* renamed from: a */
        public void mo71824a() {
        }

        /* renamed from: a */
        public void mo71825a(int i) {
        }

        /* renamed from: b */
        public void mo71826b() {
        }

        /* renamed from: b */
        public void mo71827b(int i) {
        }

        /* renamed from: c */
        public void mo71828c() {
        }

        /* renamed from: d */
        public void mo71829d() {
        }

        /* renamed from: e */
        public boolean mo71830e() {
            return false;
        }

        /* renamed from: f */
        public void mo71831f() {
        }

        public C33850a(int i) {
            this.f87819a = i;
        }
    }

    /* renamed from: e */
    public static C33849j m77600e() {
        if (f87811g == null) {
            synchronized (C33849j.class) {
                if (f87811g == null) {
                    f87811g = new C33849j();
                }
            }
        }
        return f87811g;
    }

    /* renamed from: a */
    public final void mo70734a() {
        if (this.f87813b != null && this.f87813b.get(Integer.valueOf(this.f87815d)) != null) {
            ((C33850a) this.f87813b.get(Integer.valueOf(this.f87815d))).mo71828c();
        }
    }

    /* renamed from: b */
    public final void mo70738b() {
        if (this.f87813b != null) {
            for (Entry value : this.f87813b.entrySet()) {
                ((C33850a) value.getValue()).mo71826b();
            }
        }
    }

    /* renamed from: c */
    public final void mo70739c() {
        if (this.f87813b != null && this.f87813b.get(Integer.valueOf(this.f87815d)) != null && C11016e.m22313h()) {
            ((C33850a) this.f87813b.get(Integer.valueOf(this.f87815d))).mo71826b();
        }
    }

    private C33849j() {
        boolean z;
        Set stringSet = C35284t.m79782a().f90620a.getStringSet("share_video_message_has_watched", null);
        if (!C9376b.m18558a((Collection<T>) stringSet)) {
            this.f87814c.addAll(stringSet);
        }
        if (C33229c.f86227e.mo70571d() == ImMtShareVideoAutoPlayExperiment.m76319b()) {
            z = true;
        } else {
            z = false;
        }
        this.f87812a = z;
    }

    /* renamed from: d */
    public final void mo70740d() {
        super.mo70740d();
        C35284t a = C35284t.m79782a();
        a.f90620a.edit().putStringSet("share_video_message_has_watched", this.f87814c).commit();
        if (this.f87813b.get(Integer.valueOf(this.f87815d)) != null) {
            ((C33850a) this.f87813b.get(Integer.valueOf(this.f87815d))).mo71831f();
        }
        this.f87813b.clear();
        this.f87818h.clear();
        this.f87815d = -1;
        this.f87816e = false;
        if (this.f87817f != null) {
            this.f87817f.dispose();
            this.f87817f = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo71880a(int i) {
        this.f87815d = i;
    }

    /* renamed from: a */
    public final void mo70735a(RecyclerView recyclerView) {
        C33464h.m76693a(new C33872n(this, recyclerView), 800);
    }

    /* renamed from: a */
    public final void mo70736a(RecyclerView recyclerView, int i) {
        if (i == 0 && (ActivityStack.getTopActivity() instanceof ChatRoomActivity) && recyclerView != null && (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            C33852l lVar = new C33852l(this, recyclerView);
            if (!this.f87816e || this.f87813b == null || this.f87813b.size() <= 0) {
                lVar.run();
            } else {
                recyclerView.getAdapter().notifyDataSetChanged();
                C33464h.m76692a(lVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo70737a(RecyclerView recyclerView, boolean z) {
        if (!z) {
            mo70736a(recyclerView, 0);
        } else if (this.f87813b.get(Integer.valueOf(this.f87815d)) != null) {
            ((C33850a) this.f87813b.get(Integer.valueOf(this.f87815d))).mo71824a();
        }
    }
}
