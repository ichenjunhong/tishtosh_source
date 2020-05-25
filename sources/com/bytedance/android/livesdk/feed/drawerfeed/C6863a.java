package com.bytedance.android.livesdk.feed.drawerfeed;

import android.arch.lifecycle.C0199s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.p226e.C3842b;
import com.bytedance.android.live.core.p235h.C3924b;
import com.bytedance.android.live.core.paging.p236a.C3930c.C3932a;
import com.bytedance.android.live.core.paging.p236a.C3930c.C3935d;
import com.bytedance.android.live.core.paging.p236a.C3930c.C3937f;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.chatroom.p325ui.DoubleColorBallLoadingLayout;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.p331a.C6806a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a */
public final class C6863a extends C6806a {

    /* renamed from: A */
    private final C6890l f18802A;

    /* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a$a */
    static class C6864a extends C3932a {

        /* renamed from: a */
        PagingViewModel f18803a;

        /* renamed from: b */
        private View f18804b;

        /* renamed from: c */
        private TextView f18805c;

        /* renamed from: d */
        private TextView f18806d;

        /* renamed from: a */
        public final void mo9322a(boolean z) {
            this.f18805c.setTextColor(this.f18805c.getResources().getColor(R.color.abb));
            this.f18805c.setText(R.string.gyg);
            this.f18806d.setText(R.string.gyh);
            this.f18806d.setTextColor(this.f18806d.getResources().getColor(R.color.b3i));
            if (!z) {
                int j = this.f18803a.f11045h.mo9306j();
                for (int i = 0; i < j; i++) {
                    this.f18803a.f11045h.mo9298b(0);
                }
            }
            this.f18806d.setOnClickListener(new C6879b(this));
        }

        C6864a(View view, PagingViewModel pagingViewModel) {
            super(view);
            this.f18803a = pagingViewModel;
            this.f18804b = view.findViewById(R.id.ab9);
            this.f18805c = (TextView) view.findViewById(R.id.abb);
            this.f18806d = (TextView) view.findViewById(R.id.e7l);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a$b */
    static class C6865b extends C3937f {

        /* renamed from: a */
        public View f18807a;

        /* renamed from: b */
        private ViewGroup f18808b;

        /* renamed from: c */
        private PagingViewModel f18809c;

        /* renamed from: a */
        public final void mo9328a() {
            this.f18809c.f11039b.observeForever(new C0199s<C3842b>() {
                public final /* synthetic */ void onChanged(Object obj) {
                    C3842b bVar = (C3842b) obj;
                    if (bVar != null) {
                        if (bVar.mo9203a()) {
                            C6865b.this.f18807a.setVisibility(0);
                            return;
                        }
                        C6865b.this.f18807a.setVisibility(8);
                    }
                }
            });
        }

        C6865b(View view, PagingViewModel pagingViewModel) {
            super(view);
            this.f18809c = pagingViewModel;
            this.f18808b = (ViewGroup) view.findViewById(R.id.ekk);
            this.f18807a = new DoubleColorBallLoadingLayout(view.getContext());
            this.f18808b.addView(this.f18807a);
        }
    }

    /* renamed from: a */
    public final int mo9307a() {
        return R.layout.agu;
    }

    /* renamed from: c */
    public final int mo12996c(int i) {
        if (i != 1) {
            if (i == 3) {
                return R.layout.alm;
            }
            if (i != 6) {
                switch (i) {
                    case 1001:
                        break;
                    case BaseNotice.CHECK_PROFILE /*1002*/:
                        return R.layout.apj;
                    case BaseNotice.COMMENT_REPLY_WITH_VIDEO /*1003*/:
                        return R.layout.apk;
                    case 1004:
                        return R.layout.alt;
                    default:
                        return super.mo12996c(i);
                }
            }
            return R.layout.bxj;
        } else if (C6890l.m14433g()) {
            return R.layout.bwq;
        } else {
            return R.layout.aln;
        }
    }

    /* renamed from: c */
    public final C1352v mo9321c(ViewGroup viewGroup, int i) {
        return new C3935d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ah1, viewGroup, false));
    }

    /* renamed from: b */
    public final C1352v mo9320b(ViewGroup viewGroup, int i) {
        if (i == -1091576148) {
            return new C6865b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bwd, viewGroup, false), this.f10949b);
        }
        if (i == -1091576149) {
            return new C6864a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bvy, viewGroup, false), this.f10949b);
        }
        return super.mo9320b(viewGroup, i);
    }

    public C6863a(Map<Integer, C3924b> map, C6957i iVar, C6890l lVar) {
        super(map, iVar);
        this.f18802A = lVar;
    }
}
