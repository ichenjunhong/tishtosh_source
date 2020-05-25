package com.p683ss.android.ugc.aweme.follow.p1767ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.base.mvvm.C23562e;
import com.p683ss.android.ugc.aweme.base.widget.p1422a.C23746a;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31761a;
import com.p683ss.android.ugc.aweme.follow.p1763b.C31868e;
import com.p683ss.android.ugc.aweme.main.story.C36713f;
import com.p683ss.android.ugc.aweme.main.story.C36731g;
import com.p683ss.android.ugc.aweme.main.story.feed.C36716a;
import com.p683ss.android.ugc.aweme.main.story.feed.C36727d;
import com.p683ss.android.ugc.aweme.main.story.feed.StoryFeedItemViewBig;
import com.p683ss.android.ugc.aweme.main.story.feed.StoryFeedPanel;
import com.p683ss.android.ugc.aweme.story.model.C46660d.C46661a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.views.FpsRecyclerView;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.follow.ui.HeaderViewHolder */
public class HeaderViewHolder extends C1352v implements C36713f {

    /* renamed from: a */
    public StoryFeedPanel f83476a;

    /* renamed from: b */
    public C36727d f83477b;

    /* renamed from: c */
    public ViewGroup f83478c;

    /* renamed from: d */
    public boolean f83479d = true;

    /* renamed from: e */
    public boolean f83480e;

    /* renamed from: com.ss.android.ugc.aweme.follow.ui.HeaderViewHolder$StoryPanelScrollHelper */
    static class StoryPanelScrollHelper {
        private WeakReference<HeaderViewHolder> mHostHolder;
        private int mStoryPanelHeight;

        public void setStoryPanelHeight(int i) {
            this.mStoryPanelHeight = i;
        }

        StoryPanelScrollHelper(HeaderViewHolder headerViewHolder) {
            this.mHostHolder = new WeakReference<>(headerViewHolder);
        }

        public void setScrollY(int i) {
            HeaderViewHolder headerViewHolder = (HeaderViewHolder) this.mHostHolder.get();
            if (headerViewHolder != null) {
                C11065a.m22390a(C11010c.m22280a());
                ViewGroup viewGroup = (ViewGroup) headerViewHolder.f83478c.getParent().getParent();
                if (viewGroup instanceof FpsRecyclerView) {
                    ((FpsRecyclerView) viewGroup).setTop(-(this.mStoryPanelHeight + i));
                }
            }
        }
    }

    /* renamed from: f_ */
    public final void mo65164f_(boolean z) {
        if (this.f83476a != null) {
            this.f83476a.setVisible(z);
            if (z) {
                this.f83476a.refresh();
            }
        }
    }

    @C53771m
    public void onEvent(C36731g gVar) {
        if (this.f83477b != null && C20902b.m53242a().isLogin()) {
            this.f83477b.mo75832a(false);
        }
    }

    public HeaderViewHolder(View view) {
        super(view);
        this.f83478c = (ViewGroup) view.findViewById(R.id.agv);
        this.f83477b = new C36727d(StoryFeedItemViewBig.class);
        this.f83477b.f93877f = new C36716a() {
            /* renamed from: a */
            public final void mo65166a(List<C23562e> list, C46661a aVar) {
                if (HeaderViewHolder.this.f83479d) {
                    HeaderViewHolder.this.f83479d = false;
                    if ((list == null || list.isEmpty() || (list.size() == 1 && (list.get(0) instanceof C23746a))) && !HeaderViewHolder.this.f83476a.isLivePageItemViewVisiable()) {
                        HeaderViewHolder headerViewHolder = HeaderViewHolder.this;
                        C31761a aVar2 = new C31761a();
                        aVar2.f82954a = 2;
                        aVar2.f82955b = headerViewHolder.getAdapterPosition();
                        C47718bf.m103288a(aVar2);
                        HeaderViewHolder.this.f83480e = false;
                        C47718bf.m103288a(new C31868e(false));
                        return;
                    }
                    if (!HeaderViewHolder.this.f83480e) {
                        HeaderViewHolder.this.f83478c.getLayoutParams().height = -2;
                        View view = (View) HeaderViewHolder.this.f83478c.getParent();
                        HeaderViewHolder headerViewHolder2 = HeaderViewHolder.this;
                        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{view.getHeight(), HeaderViewHolder.this.f83476a.getAndroidView().getLayoutParams().height});
                        ofInt.addUpdateListener(new AnimatorUpdateListener(view) {

                            /* renamed from: a */
                            final /* synthetic */ View f83482a;

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                LayoutParams layoutParams = this.f83482a.getLayoutParams();
                                layoutParams.height = intValue;
                                this.f83482a.setLayoutParams(layoutParams);
                            }

                            {
                                this.f83482a = r2;
                            }
                        });
                        ofInt.setDuration(150);
                        ofInt.start();
                        HeaderViewHolder.this.f83480e = true;
                    }
                    C47718bf.m103288a(new C31868e(true));
                }
            }
        };
    }
}
