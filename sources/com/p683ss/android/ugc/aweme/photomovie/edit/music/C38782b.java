package com.p683ss.android.ugc.aweme.photomovie.edit.music;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.b */
public final class C38782b extends C1322a<C1352v> {

    /* renamed from: a */
    public volatile int f98689a;

    /* renamed from: b */
    public CopyOnWriteArrayList<C38781a> f98690b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public C38786c f98691c = this;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.b$a */
    class C38783a extends C1352v {
        C38783a(View view) {
            super(view);
            view.findViewById(R.id.avp).setOnClickListener(new C38787c(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.b$b */
    class C38784b extends C1352v {

        /* renamed from: a */
        AVDmtImageTextView f98693a;

        /* renamed from: b */
        int f98694b;

        /* renamed from: a */
        public final void mo78747a() {
            C38782b.this.notifyDataSetChanged();
            if (C38782b.this.f98691c != null) {
                C38782b.this.f98691c.mo78742a(((C38781a) C38782b.this.f98690b.get(C38782b.this.f98689a)).f98686c, ((C38781a) C38782b.this.f98690b.get(C38782b.this.f98689a)).f98684a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo78748b() {
            switch (((C38781a) C38782b.this.f98690b.get(this.f98694b)).f98687d) {
                case 0:
                    this.f98693a.mo93973b(true);
                    return;
                case 1:
                case 2:
                    this.f98693a.mo93973b(false);
                    break;
            }
        }

        C38784b(View view) {
            super(view);
            this.f98693a = (AVDmtImageTextView) view.findViewById(R.id.avp);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.b$c */
    public interface C38786c {
        /* renamed from: a */
        void mo78742a(C42482c cVar, String str);
    }

    public final int getItemViewType(int i) {
        return i == 0 ? 1 : 2;
    }

    public final int getItemCount() {
        return this.f98690b.size();
    }

    /* renamed from: a */
    public final void mo78745a(int i) {
        if (this.f98689a >= 0) {
            ((C38781a) this.f98690b.get(this.f98689a)).f98688e = false;
        }
        ((C38781a) this.f98690b.get(i)).f98688e = true;
        this.f98689a = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo78746b(int i) {
        if (this.f98690b.size() > i) {
            ((C38781a) this.f98690b.get(i)).f98687d = 1;
            mo78745a(i);
            notifyDataSetChanged();
        }
    }

    C38782b(List<C42482c> list, C42482c cVar) {
        this.f98690b.add(new C38781a(new C42482c()));
        if (list != null) {
            for (C42482c aVar : list) {
                this.f98690b.add(new C38781a(aVar));
            }
        }
        this.f98689a = m86166a(this.f98690b, cVar);
    }

    /* renamed from: a */
    private static int m86166a(List<C38781a> list, C42482c cVar) {
        if (cVar == null) {
            return -1;
        }
        for (int i = 1; i < list.size(); i++) {
            C38781a aVar = (C38781a) list.get(i);
            if (aVar.f98686c.getMusicName().equals(cVar.getMusicName())) {
                aVar.f98688e = true;
                return i;
            }
        }
        return 0;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C38783a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ag5, viewGroup, false));
        }
        return new C38784b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ag4, viewGroup, false));
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        if (getItemViewType(i) == 2) {
            C38784b bVar = (C38784b) vVar;
            bVar.f98694b = i;
            if (bVar.f98693a != null) {
                bVar.mo78748b();
                bVar.f98693a.mo93970a(((C38781a) C38782b.this.f98690b.get(bVar.f98694b)).f98688e);
            }
            bVar.f98693a.setOnClickListener(new C38788d(bVar, i));
            bVar.f98693a.mo93968a(((C38781a) C38782b.this.f98690b.get(bVar.f98694b)).f98686c.getCoverMedium());
        }
    }
}
