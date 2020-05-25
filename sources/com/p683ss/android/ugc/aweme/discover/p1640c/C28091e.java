package com.p683ss.android.ugc.aweme.discover.p1640c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25560e;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25563g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27800ag;
import com.p683ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.p683ss.android.ugc.aweme.discover.model.RankingListCover;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27715b;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28515aw;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.model.Brand;
import com.p683ss.android.ugc.aweme.music.model.BrandBillboard;
import com.p683ss.android.ugc.aweme.music.model.BrandCategory;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.utils.C47794cz;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.c.e */
public final class C28091e extends C26835b<List<DiscoverItemData>> {

    /* renamed from: a */
    public boolean f73777a;

    /* renamed from: b */
    private Fragment f73778b;

    public C28091e() {
    }

    public C28091e(Fragment fragment) {
        this.f73778b = fragment;
    }

    /* renamed from: b */
    public final void mo54758b(C1352v vVar) {
        super.mo54758b(vVar);
        RankingListCoverViewHolder rankingListCoverViewHolder = (RankingListCoverViewHolder) vVar;
        if (rankingListCoverViewHolder.f72906r != null) {
            rankingListCoverViewHolder.f72906r.cancel();
            rankingListCoverViewHolder.f72906r = null;
        }
        if (rankingListCoverViewHolder.f72905q != null) {
            rankingListCoverViewHolder.f72905q.cancel();
            rankingListCoverViewHolder.f72905q = null;
        }
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        if (this.f73777a) {
            return new RankingListCoverViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b9o, viewGroup, false), true, this.f73778b);
        }
        return new RankingListCoverViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b9n, viewGroup, false), false);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        if (((DiscoverItemData) ((List) obj).get(i)).getType() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        RankingListCoverViewHolder rankingListCoverViewHolder = (RankingListCoverViewHolder) vVar;
        RankingListCover rankingListCover = ((DiscoverItemData) ((List) obj).get(i)).getRankingListCover();
        if (rankingListCover != null && rankingListCover != rankingListCoverViewHolder.f72911w) {
            rankingListCoverViewHolder.f72911w = rankingListCover;
            User topStar = rankingListCover.getTopStar();
            if (topStar == null) {
                rankingListCoverViewHolder.mStarContainer.setVisibility(8);
            } else {
                C27715b.m66364a(rankingListCoverViewHolder.mStarHeaderView, topStar.getAvatarThumb());
                rankingListCoverViewHolder.mStarName.setText(topStar.getNickname());
            }
            Music topMusic = rankingListCover.getTopMusic();
            if (topMusic != null) {
                C27715b.m66364a(rankingListCoverViewHolder.mMusicHeaderView, topMusic.getCoverThumb());
                rankingListCoverViewHolder.mMusicName.setText(topMusic.getMusicName());
            }
            if (rankingListCoverViewHolder.f72904p) {
                rankingListCoverViewHolder.f72910v = new C27800ag(rankingListCoverViewHolder);
                C25563g topGoods = rankingListCover.getTopGoods();
                if (topGoods == null) {
                    rankingListCoverViewHolder.f72890b.setVisibility(8);
                } else {
                    rankingListCoverViewHolder.f72890b.setVisibility(0);
                    rankingListCoverViewHolder.f72889a.setOnScrollListener(rankingListCoverViewHolder.f72910v);
                    C27715b.m66364a(rankingListCoverViewHolder.f72894f, topGoods.getPromotionImage());
                    rankingListCoverViewHolder.f72891c.setText(topGoods.getTitle());
                    rankingListCoverViewHolder.f72893e.setText(topGoods.getPromotionTitle());
                    rankingListCoverViewHolder.f72892d.setText(topGoods.getCategory());
                    rankingListCoverViewHolder.f72890b.setOnTouchListener(new C28515aw(topGoods) {

                        /* renamed from: a */
                        final /* synthetic */ C25563g f72915a;

                        {
                            this.f72915a = r2;
                        }

                        /* renamed from: b */
                        public final void mo55272b(View view, MotionEvent motionEvent) {
                            C25560e eVar = new C25560e();
                            eVar.f67569b = "discovery";
                            C25539a.m62079a().logCommerceEvents("click_hot_list_entrance", eVar);
                            if (C20854a.m53167g().isLogin()) {
                                String h5Url = this.f72915a.getH5Url();
                                if (!C27803aj.m66547a(RankingListCoverViewHolder.this.itemView.getContext()) || TextUtils.isEmpty(h5Url)) {
                                    C10691a.m21542b(RankingListCoverViewHolder.this.itemView.getContext(), (int) R.string.cg1).mo19066a();
                                    return;
                                }
                                C23794bh.m58407u().mo46887a(h5Url, C47794cz.m103425a("entrance_location", "fullscreen_card"), RankingListCoverViewHolder.this.itemView.getContext());
                            } else if (RankingListCoverViewHolder.this.f72898j != null) {
                                C27965f.m66726a(RankingListCoverViewHolder.this.f72898j, "discovery", "click_open_url", (C23505g) new C23505g() {
                                    /* renamed from: a */
                                    public final void mo46280a(Bundle bundle) {
                                    }

                                    /* renamed from: a */
                                    public final void mo46279a() {
                                        String h5Url = C277633.this.f72915a.getH5Url();
                                        if (!C27802ai.m66546a(RankingListCoverViewHolder.this.itemView.getContext()) || TextUtils.isEmpty(h5Url)) {
                                            C10691a.m21542b(RankingListCoverViewHolder.this.itemView.getContext(), (int) R.string.cg1).mo19066a();
                                        } else {
                                            C23794bh.m58407u().mo46887a(h5Url, C47794cz.m103425a("entrance_location", "fullscreen_card"), RankingListCoverViewHolder.this.itemView.getContext());
                                        }
                                    }
                                });
                            } else {
                                C10691a.m21542b(RankingListCoverViewHolder.this.itemView.getContext(), (int) R.string.cg1).mo19066a();
                            }
                        }
                    });
                }
                BrandBillboard topBrand = rankingListCover.getTopBrand();
                if (topBrand == null) {
                    rankingListCoverViewHolder.f72899k.setVisibility(8);
                    return;
                }
                rankingListCoverViewHolder.f72899k.setVisibility(0);
                rankingListCoverViewHolder.f72889a.setOnScrollListener(rankingListCoverViewHolder.f72910v);
                if (rankingListCoverViewHolder.f72905q == null && rankingListCoverViewHolder.f72906r == null) {
                    List categoryList = topBrand.getCategoryList();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    if (rankingListCoverViewHolder.mo56198a(categoryList, arrayList, arrayList2, 0, 0, 0)) {
                        rankingListCoverViewHolder.f72905q = ObjectAnimator.ofFloat(rankingListCoverViewHolder.f72900l, "alpha", new float[]{1.0f, 1.0f});
                        rankingListCoverViewHolder.f72905q.setDuration(2000);
                        rankingListCoverViewHolder.f72905q.setInterpolator(new LinearInterpolator());
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(rankingListCoverViewHolder.f72900l, "alpha", new float[]{1.0f, 0.0f});
                        ofFloat.setDuration(180);
                        ofFloat.setStartDelay(2000);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(rankingListCoverViewHolder.f72900l, "alpha", new float[]{0.0f, 1.0f});
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(rankingListCoverViewHolder.f72900l, "translationY", new float[]{(float) C23728o.m58241a(8.0d), 0.0f});
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{ofFloat2, ofFloat3});
                        animatorSet.setDuration(250);
                        animatorSet.setInterpolator(new LinearInterpolator());
                        rankingListCoverViewHolder.f72906r = new AnimatorSet();
                        rankingListCoverViewHolder.f72906r.playSequentially(new Animator[]{animatorSet, ofFloat});
                        rankingListCoverViewHolder.f72907s = ((BrandCategory) categoryList.get(0)).getId();
                        rankingListCoverViewHolder.f72906r.addListener(new AnimatorListenerAdapter(arrayList, arrayList2, categoryList) {

                            /* renamed from: a */
                            int f72919a = 1;

                            /* renamed from: b */
                            final /* synthetic */ List f72920b;

                            /* renamed from: c */
                            final /* synthetic */ List f72921c;

                            /* renamed from: d */
                            final /* synthetic */ List f72922d;

                            /* renamed from: f */
                            private boolean f72924f;

                            public final void onAnimationCancel(Animator animator) {
                                this.f72924f = true;
                            }

                            public final void onAnimationEnd(Animator animator) {
                                if (!this.f72924f && RankingListCoverViewHolder.this.f72906r != null) {
                                    RankingListCoverViewHolder.this.f72906r.start();
                                }
                            }

                            public final void onAnimationStart(Animator animator) {
                                if (((Brand) this.f72920b.get(this.f72919a)).getLogoUrl() == null) {
                                    RankingListCoverViewHolder.this.f72903o.setImageResource(R.drawable.dv5);
                                } else {
                                    C27715b.m66364a(RankingListCoverViewHolder.this.f72903o, ((Brand) this.f72920b.get(this.f72919a)).getLogoUrl());
                                }
                                RankingListCoverViewHolder.this.f72902n.setText(((Brand) this.f72920b.get(this.f72919a)).getName());
                                RankingListCoverViewHolder.this.f72901m.setText(C2240a.m6772a(C23723j.m58219b(R.string.uw), new Object[]{this.f72921c.get(this.f72919a)}));
                                RankingListCoverViewHolder.this.f72907s = ((BrandCategory) this.f72922d.get(this.f72919a)).getId();
                                this.f72919a = (this.f72919a + 1) % this.f72920b.size();
                            }

                            {
                                this.f72920b = r2;
                                this.f72921c = r3;
                                this.f72922d = r4;
                            }
                        });
                        rankingListCoverViewHolder.f72905q.addListener(new AnimatorListenerAdapter() {

                            /* renamed from: b */
                            private boolean f72926b;

                            public final void onAnimationCancel(Animator animator) {
                                this.f72926b = true;
                            }

                            public final void onAnimationEnd(Animator animator) {
                                if (!this.f72926b && RankingListCoverViewHolder.this.f72906r != null) {
                                    RankingListCoverViewHolder.this.f72906r.start();
                                }
                            }
                        });
                        rankingListCoverViewHolder.f72905q.start();
                        rankingListCoverViewHolder.f72899k.setOnTouchListener(new C28515aw() {
                            /* renamed from: b */
                            public final void mo55272b(View view, MotionEvent motionEvent) {
                                String uri = C37382g.m83707a((String) SharePrefCache.inst().getBrandScheme().mo47782d()).mo76659a("brand_category_id", String.valueOf(RankingListCoverViewHolder.this.f72907s)).mo76658a().toString();
                                C26890h.m65011a("click_brand_list_entrance", C23089d.m56640a().mo47829a("enter_from", "discovery").f61491a);
                                if (!TextUtils.isEmpty(uri)) {
                                    C41302w.m91042a().mo83861a(uri);
                                }
                            }
                        });
                    }
                }
            }
        }
    }
}
