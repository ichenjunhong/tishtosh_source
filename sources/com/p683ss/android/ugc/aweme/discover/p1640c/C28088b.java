package com.p683ss.android.ugc.aweme.discover.p1640c;

import android.support.constraint.ConstraintLayout;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27884c;
import com.p683ss.android.ugc.aweme.discover.adapter.CategoryViewHolder;
import com.p683ss.android.ugc.aweme.discover.model.Category;
import com.p683ss.android.ugc.aweme.discover.model.CategoryOrAd;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.c.b */
public final class C28088b extends C26835b<List<DiscoverItemData>> {

    /* renamed from: a */
    public boolean f73774a = true;

    /* renamed from: b */
    public final void mo54758b(C1352v vVar) {
        ((CategoryViewHolder) vVar).mo56176c();
    }

    /* renamed from: a */
    public final void mo54756a(C1352v vVar) {
        if (this.f73774a) {
            ((CategoryViewHolder) vVar).mo56175b();
        }
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        return new CategoryViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b9m, viewGroup, false));
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        DiscoverItemData discoverItemData = (DiscoverItemData) ((List) obj).get(i);
        if (discoverItemData.getType() == 5) {
            return discoverItemData.getCategoryOrAd().isCategory();
        }
        return false;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        int i2;
        List list2 = (List) obj;
        CategoryOrAd categoryOrAd = ((DiscoverItemData) list2.get(i)).getCategoryOrAd();
        if (list2 != null) {
            i2 = 0;
            while (true) {
                if (i2 >= list2.size()) {
                    break;
                } else if (((DiscoverItemData) list2.get(i2)).getType() == 5) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        i2 = 0;
        CategoryViewHolder categoryViewHolder = (CategoryViewHolder) vVar;
        Category category = categoryOrAd.category;
        int i3 = i - i2;
        if (category != null) {
            if (CategoryViewHolder.f72826a == category) {
                if (categoryViewHolder.f72832g == null) {
                    categoryViewHolder.f72832g = categoryViewHolder.mViewStubPlaceHolder.inflate();
                }
                C23729p.m58257a(categoryViewHolder.f72832g, 0);
                C23729p.m58257a(categoryViewHolder.mRoot, 8);
            } else {
                categoryViewHolder.f72829d = i3;
                C23729p.m58257a((View) categoryViewHolder.mViewStubPlaceHolder, 8);
                C23729p.m58257a(categoryViewHolder.mRoot, 0);
                if (C47915gg.m103651b()) {
                    C23729p.m58257a(categoryViewHolder.mCategoryCountView, 8);
                }
                categoryViewHolder.f72828c = category;
                Challenge challenge = categoryViewHolder.f72828c.getChallenge();
                Music music = categoryViewHolder.f72828c.getMusic();
                if (categoryViewHolder.f72830e == null) {
                    categoryViewHolder.f72830e = new C27884c();
                    categoryViewHolder.f72830e.f73252f = categoryViewHolder.f72828c;
                    View view = new View(categoryViewHolder.f72831f);
                    view.setLayoutParams(new LayoutParams((int) C9432q.m18687b(categoryViewHolder.f72831f, 14.0f), -1));
                    categoryViewHolder.f72830e.mo49209c_(view);
                    categoryViewHolder.mListView.setAdapter(categoryViewHolder.f72830e);
                    categoryViewHolder.f72830e.f73251e = categoryViewHolder;
                }
                if (challenge != null) {
                    categoryViewHolder.mViewDiscoverBg.setVisibility(8);
                    if (!C23794bh.m58375A().mo56135a() || !challenge.isPgcshow()) {
                        categoryViewHolder.mIvType.setImageResource(R.drawable.cv3);
                        if (!TextUtils.isEmpty(category.getDesc())) {
                            categoryViewHolder.mTvType.setText(category.getDesc());
                        } else {
                            categoryViewHolder.mTvType.setVisibility(8);
                            ((ConstraintLayout.LayoutParams) categoryViewHolder.mTvTitle.getLayoutParams()).topMargin = (int) C9432q.m18687b(categoryViewHolder.f72831f, 20.0f);
                        }
                    } else {
                        if (!(challenge.getAuthor() == null || challenge.getAuthor().getAvatarThumb() == null)) {
                            C23515d.m57669a(categoryViewHolder.mIvType, challenge.getAuthor().getAvatarThumb());
                        }
                        categoryViewHolder.mTvType.setText(categoryViewHolder.f72831f.getString(R.string.co8));
                    }
                    categoryViewHolder.mTvCount.setText(C33095b.m76068a(challenge.getDisplayCount()));
                    categoryViewHolder.mTvTitle.setText(challenge.getChallengeName());
                    categoryViewHolder.f72830e.f73254h = challenge.getCid();
                    categoryViewHolder.f72830e.f73253g = 0;
                    if (categoryViewHolder.f72828c.isAd()) {
                        categoryViewHolder.f72830e.f73252f = category;
                    }
                } else if (music != null) {
                    categoryViewHolder.mIvType.setImageResource(R.drawable.cuy);
                    categoryViewHolder.mViewDiscoverBg.setVisibility(8);
                    categoryViewHolder.mTvCount.setText(C33095b.m76068a((long) music.getUserCount()));
                    categoryViewHolder.mTvTitle.setText(music.getMusicName());
                    if (!TextUtils.isEmpty(category.getDesc())) {
                        categoryViewHolder.mTvType.setText(category.getDesc());
                    } else {
                        categoryViewHolder.mTvType.setVisibility(8);
                        ((ConstraintLayout.LayoutParams) categoryViewHolder.mTvTitle.getLayoutParams()).topMargin = (int) C9432q.m18687b(categoryViewHolder.f72831f, 20.0f);
                    }
                    categoryViewHolder.f72830e.f73254h = String.valueOf(music.getId());
                    categoryViewHolder.f72830e.f73253g = 1;
                }
                categoryViewHolder.f72830e.mo50303a(categoryViewHolder.f72828c.getItems());
                try {
                    categoryViewHolder.f72827b.mo4721a(0, 0);
                } catch (Exception unused) {
                }
            }
        }
        boolean z = this.f73774a;
        if (categoryViewHolder.f72830e != null) {
            categoryViewHolder.f72830e.f73255i = z;
        }
    }
}
