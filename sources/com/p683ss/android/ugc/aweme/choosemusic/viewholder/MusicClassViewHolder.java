package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.arch.widgets.C23270a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24834c;
import com.p683ss.android.ugc.aweme.music.adapter.C37289e;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicClassViewHolder */
public class MusicClassViewHolder extends C23270a {

    /* renamed from: b */
    public C37289e f66212b;

    /* renamed from: c */
    public C24834c f66213c;
    RecyclerView mRvClassContainer;
    TextView mTvTitleLeft;
    TextView mTvTitleRight;

    public MusicClassViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.mTvTitleLeft.setText(view.getContext().getText(R.string.ceg));
        final int b = (int) C9432q.m18687b(view.getContext(), 16.0f);
        this.mRvClassContainer.mo4798a((C1331h) new C1331h() {
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
                rect.bottom = b;
            }
        });
        this.mTvTitleRight.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C32800a.m75679a(view) && MusicClassViewHolder.this.f66212b != null) {
                    MusicClassViewHolder.this.f66212b.mo51050a(null, view, null);
                }
            }
        });
        this.mRvClassContainer.setLayoutManager(new WrapGridLayoutManager(view.getContext(), 2));
        ((DmtTextView) this.mTvTitleRight).setFontType(C10751d.f28908g);
    }

    /* renamed from: a */
    public final void mo51004a(final List<MusicCollectionItem> list, final int i) {
        this.mRvClassContainer.setAdapter(new C1322a() {
            public final int getItemCount() {
                if (list == null) {
                    return 0;
                }
                return list.size();
            }

            public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
                return new MusicClassItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x_, viewGroup, false), i, MusicClassViewHolder.this.f66213c);
            }

            public final void onBindViewHolder(C1352v vVar, int i) {
                MusicClassItemViewHolder musicClassItemViewHolder = (MusicClassItemViewHolder) vVar;
                musicClassItemViewHolder.f66208a = (MusicCollectionItem) list.get(i);
                if (musicClassItemViewHolder.f66208a != null) {
                    musicClassItemViewHolder.mTvClassName.setText(musicClassItemViewHolder.f66208a.mcName);
                    C23515d.m57669a(musicClassItemViewHolder.mIvClassCover, musicClassItemViewHolder.f66208a.awemeCover);
                }
            }
        });
    }
}
