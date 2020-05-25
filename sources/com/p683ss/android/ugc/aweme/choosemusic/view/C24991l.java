package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.l */
public final class C24991l extends LinearLayout {

    /* renamed from: a */
    public ArrayList<MusicItemViewHolder> f66163a = new ArrayList<>(3);

    /* renamed from: b */
    public C24989j f66164b;

    /* renamed from: c */
    public C37306l<C24806c> f66165c;

    /* renamed from: d */
    private int f66166d;

    public final ArrayList<MusicItemViewHolder> getMusicItemViews() {
        return this.f66163a;
    }

    /* renamed from: a */
    private void m60794a() {
        setOrientation(1);
        for (int i = 0; i < 3; i++) {
            MusicItemViewHolder musicItemViewHolder = new MusicItemViewHolder(LayoutInflater.from(getContext()).inflate(R.layout.x7, null, false), this.f66166d);
            musicItemViewHolder.mLlItemContainer.setPadding(musicItemViewHolder.mLlItemContainer.getPaddingLeft(), 0, 0, 0);
            this.f66163a.add(musicItemViewHolder);
            musicItemViewHolder.mo51008a(this.f66164b, this.f66165c);
            addView(musicItemViewHolder.itemView);
        }
    }

    public C24991l(Context context, int i) {
        super(context);
        this.f66166d = i;
        m60794a();
    }
}
