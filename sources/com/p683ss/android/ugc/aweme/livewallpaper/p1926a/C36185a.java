package com.p683ss.android.ugc.aweme.livewallpaper.p1926a;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.a.a */
public final class C36185a extends C1322a<C36187b> implements OnClickListener {

    /* renamed from: c */
    private static final int f92647c = (C23724k.m58222a()[0] / 3);

    /* renamed from: d */
    private static final int f92648d = ((int) (((float) C23724k.m58222a()[0]) * 0.44f));

    /* renamed from: a */
    public List<LiveWallPaperBean> f92649a = new ArrayList();

    /* renamed from: b */
    public C36186a f92650b;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.a.a$a */
    public interface C36186a {
        /* renamed from: a */
        void mo74933a(LiveWallPaperBean liveWallPaperBean);
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.a.a$b */
    public class C36187b extends C1352v {

        /* renamed from: a */
        public RemoteImageView f92651a;

        public C36187b(View view) {
            super(view);
            this.f92651a = (RemoteImageView) view.findViewById(R.id.d00);
        }
    }

    public final int getItemCount() {
        return this.f92649a.size();
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f92650b != null) {
            this.f92650b.mo74933a((LiveWallPaperBean) view.getTag());
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vk, viewGroup, false);
        inflate.setOnClickListener(this);
        return new C36187b(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        LiveWallPaperBean liveWallPaperBean;
        C36187b bVar = (C36187b) vVar;
        if (i >= this.f92649a.size() || i < 0) {
            liveWallPaperBean = null;
        } else {
            liveWallPaperBean = (LiveWallPaperBean) this.f92649a.get(i);
        }
        if (liveWallPaperBean != null) {
            RemoteImageView remoteImageView = bVar.f92651a;
            StringBuilder sb = new StringBuilder("file://");
            sb.append(liveWallPaperBean.getThumbnailPath());
            C23515d.m57686b(remoteImageView, sb.toString(), f92647c, f92648d);
            bVar.itemView.setTag(liveWallPaperBean);
        }
    }
}
