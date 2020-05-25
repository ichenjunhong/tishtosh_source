package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.arch.widgets.C23270a;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24989j;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24991l;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder */
public class MusicBoardViewHolder extends C23270a {

    /* renamed from: b */
    public C24989j f66194b;

    /* renamed from: c */
    C37306l<C24806c> f66195c;

    /* renamed from: d */
    public int f66196d = -1;

    /* renamed from: e */
    public int f66197e;

    /* renamed from: f */
    public C24803a f66198f;

    /* renamed from: g */
    C25005a f66199g;

    /* renamed from: h */
    public int f66200h;

    /* renamed from: i */
    public int f66201i;

    /* renamed from: j */
    public boolean f66202j;

    /* renamed from: k */
    private C0997e f66203k;
    TextView mTvTitleLeft;
    TextView mTvTitleRight;
    public ViewPager mVpMusicContainer;
    View mVwLine;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder$a */
    class C25005a extends PagerAdapter {

        /* renamed from: a */
        public List<MusicModel> f66204a = null;

        /* renamed from: b */
        LinkedList<C24991l> f66205b = new LinkedList<>();

        public final int getItemPosition(Object obj) {
            return -2;
        }

        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public final int getCount() {
            int i = 0;
            if (this.f66204a == null) {
                return 0;
            }
            int size = this.f66204a.size() / 3;
            if (this.f66204a.size() % 3 != 0) {
                i = 1;
            }
            return size + i;
        }

        C25005a(List<MusicModel> list) {
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            boolean z;
            C24991l lVar = (C24991l) this.f66205b.poll();
            if (lVar == null) {
                lVar = new C24991l(viewGroup.getContext(), MusicBoardViewHolder.this.f66201i);
            }
            C24989j jVar = MusicBoardViewHolder.this.f66194b;
            C37306l<C24806c> lVar2 = MusicBoardViewHolder.this.f66195c;
            lVar.f66164b = jVar;
            lVar.f66165c = lVar2;
            if (!lVar.f66163a.isEmpty()) {
                for (int i2 = 0; i2 < 3; i2++) {
                    ((MusicItemViewHolder) lVar.f66163a.get(i2)).mo51008a(lVar.f66164b, lVar.f66165c);
                }
            }
            List<MusicModel> list = this.f66204a;
            int i3 = i * 3;
            int i4 = MusicBoardViewHolder.this.f66196d;
            int i5 = MusicBoardViewHolder.this.f66197e;
            C24803a aVar = MusicBoardViewHolder.this.f66198f;
            boolean z2 = MusicBoardViewHolder.this.f66202j;
            if (list != null) {
                int min = Math.min(i3 + 3, list.size());
                int i6 = i3;
                while (i6 < min) {
                    MusicModel musicModel = (MusicModel) list.get(i6);
                    MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) lVar.getMusicItemViews().get(i6 - i3);
                    musicItemViewHolder.itemView.setVisibility(0);
                    String str = "";
                    if (i4 == i6) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i7 = i6;
                    int i8 = min;
                    boolean z3 = z2;
                    C24803a aVar2 = aVar;
                    musicItemViewHolder.mo51009a(musicModel, str, z2, z, false, 0, i5, i7, aVar2);
                    i6 = i7 + 1;
                    aVar = aVar2;
                    min = i8;
                    z2 = z3;
                }
                for (int i9 = min - i3; i9 < 3; i9++) {
                    ((MusicItemViewHolder) lVar.getMusicItemViews().get(i9)).itemView.setVisibility(8);
                }
            }
            viewGroup.addView(lVar);
            return lVar;
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            this.f66205b.offer((C24991l) obj);
        }
    }

    /* renamed from: a */
    public final void mo50996a() {
        this.mVwLine.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo51002b() {
        this.mVwLine.setVisibility(4);
    }

    /* renamed from: a */
    public final void mo50999a(C0997e eVar) {
        if (!(this.f66195c == null || this.mVpMusicContainer == null)) {
            this.mVpMusicContainer.removeOnPageChangeListener(this.f66203k);
        }
        this.f66203k = eVar;
    }

    /* renamed from: a */
    public final void mo51000a(C24989j jVar, C37306l<C24806c> lVar) {
        this.f66194b = jVar;
        this.f66195c = lVar;
    }

    public MusicBoardViewHolder(View view, int i) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f66200h = (int) C9432q.m18687b(C11010c.m22280a(), 84.0f);
        this.f66199g = new C25005a(null);
        this.mVpMusicContainer.setAdapter(this.f66199g);
        this.f66201i = i;
        this.mTvTitleRight.setOnClickListener(new C25022b(this));
        ((DmtTextView) this.mTvTitleRight).setFontType(C10751d.f28908g);
    }

    /* renamed from: a */
    public final void mo50997a(int i, int i2) {
        this.f66196d = i2;
        if (i >= 0) {
            int i3 = 0;
            while (i3 < this.mVpMusicContainer.getChildCount()) {
                C24991l lVar = (C24991l) this.mVpMusicContainer.getChildAt(i3);
                if (lVar != null) {
                    ArrayList musicItemViews = lVar.getMusicItemViews();
                    if (musicItemViews != null) {
                        Iterator it = musicItemViews.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) it.next();
                            if (musicItemViewHolder.f66231d == i) {
                                musicItemViewHolder.mo51012a(false, false);
                                break;
                            }
                        }
                        i3++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo50998a(int i, int i2, boolean[] zArr, boolean[] zArr2) {
        for (int i3 = 0; i3 < zArr2.length; i3++) {
            if (this.mVpMusicContainer.getTop() + (this.f66200h * i3) > i2 || this.mVpMusicContainer.getTop() + ((i3 + 1) * this.f66200h) < i) {
                zArr[i3] = false;
                zArr2[i3] = false;
            } else if (!zArr[i3]) {
                zArr[i3] = true;
                zArr2[i3] = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo51001a(MusicCollectionItem musicCollectionItem, List<MusicModel> list, int i, int i2, int i3, C24803a aVar, boolean z) {
        this.mTvTitleLeft.setText(musicCollectionItem.mcName);
        if (list != null) {
            this.mVpMusicContainer.getLayoutParams().height = this.f66200h * Math.min(3, list.size());
        }
        this.f66202j = z;
        this.f66197e = i3;
        this.f66196d = i2;
        this.f66199g.f66204a = list;
        this.f66199g.notifyDataSetChanged();
        this.mVpMusicContainer.setCurrentItem(i);
        this.mVpMusicContainer.addOnPageChangeListener(this.f66203k);
        this.f66198f = aVar;
    }
}
