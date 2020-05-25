package com.bytedance.android.livesdk.feed.p331a;

import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout.C6792a;
import com.bytedance.android.livesdk.feed.C7012l;
import com.bytedance.android.livesdk.feed.p332b.C6829a.C6830a;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository.C7069a;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.a.e */
public final class C6812e {

    /* renamed from: a */
    public C6806a f18675a;

    /* renamed from: b */
    public RecyclerView f18676b;

    /* renamed from: c */
    public BaseFeedDataViewModel f18677c;

    /* renamed from: d */
    public C1332i f18678d;

    /* renamed from: e */
    public C1331h f18679e;

    /* renamed from: f */
    public C0184k f18680f;

    /* renamed from: g */
    public C7012l f18681g;

    /* renamed from: h */
    public boolean f18682h;

    /* renamed from: i */
    public C6816b f18683i;

    /* renamed from: j */
    public C6792a f18684j;

    /* renamed from: k */
    public Bundle f18685k;

    /* renamed from: l */
    boolean f18686l;

    /* renamed from: m */
    public C6830a f18687m;

    /* renamed from: com.bytedance.android.livesdk.feed.a.e$a */
    public static class C6815a {

        /* renamed from: a */
        public C6806a f18690a;

        /* renamed from: b */
        public RecyclerView f18691b;

        /* renamed from: c */
        public BaseFeedDataViewModel f18692c;

        /* renamed from: d */
        public C1332i f18693d;

        /* renamed from: e */
        public int f18694e = 2;

        /* renamed from: f */
        public C1331h f18695f;

        /* renamed from: g */
        public C0184k f18696g;

        /* renamed from: h */
        public boolean f18697h;

        /* renamed from: i */
        public C7012l f18698i;

        /* renamed from: j */
        public C6816b f18699j;

        /* renamed from: k */
        public C6792a f18700k;

        /* renamed from: l */
        public Bundle f18701l;

        public C6815a() {
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(this.f18694e, 1);
            staggeredGridLayoutManager.mo4731b(0);
            this.f18693d = staggeredGridLayoutManager;
        }

        /* renamed from: a */
        public final C6815a mo13003a(int i) {
            this.f18694e = i;
            return this;
        }

        /* renamed from: a */
        public final C6815a mo13004a(C0184k kVar) {
            this.f18696g = kVar;
            return this;
        }

        /* renamed from: a */
        public final C6815a mo13005a(C1331h hVar) {
            this.f18695f = hVar;
            return this;
        }

        /* renamed from: a */
        public final C6815a mo13006a(C1332i iVar) {
            this.f18693d = iVar;
            return this;
        }

        /* renamed from: a */
        public final C6815a mo13007a(RecyclerView recyclerView) {
            this.f18691b = recyclerView;
            return this;
        }

        /* renamed from: a */
        public final C6815a mo13008a(C6806a aVar) {
            this.f18690a = aVar;
            return this;
        }

        /* renamed from: a */
        public final C6815a mo13009a(C6816b bVar) {
            this.f18699j = bVar;
            return this;
        }

        /* renamed from: a */
        public final C6815a mo13010a(C7012l lVar) {
            this.f18698i = lVar;
            return this;
        }

        /* renamed from: a */
        public final C6815a mo13011a(BaseFeedDataViewModel baseFeedDataViewModel) {
            this.f18692c = baseFeedDataViewModel;
            return this;
        }

        /* renamed from: a */
        public final C6815a mo13012a(boolean z) {
            this.f18697h = z;
            return this;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.a.e$b */
    public interface C6816b {
        /* renamed from: a */
        void mo13013a(FeedItem feedItem);
    }

    private C6812e() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13000a(C7069a aVar) {
        if (aVar == C7069a.START) {
            Map<String, Long> map = this.f18675a.f18661p;
            if (map != null) {
                map.size();
            }
        }
        if (aVar == C7069a.SUCCESS) {
            C6806a aVar2 = this.f18675a;
            aVar2.mo12994a(aVar2.f18661p, false);
            this.f18676b.mo4814b(0);
        }
        if (this.f18687m != null && aVar != null) {
            aVar.ordinal();
        }
    }

    private C6812e(C0184k kVar, C6806a aVar, RecyclerView recyclerView, BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f18680f = kVar;
        this.f18675a = aVar;
        this.f18676b = recyclerView;
        this.f18677c = baseFeedDataViewModel;
    }
}
