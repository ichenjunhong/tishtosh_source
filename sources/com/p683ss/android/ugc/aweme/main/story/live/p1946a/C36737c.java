package com.p683ss.android.ugc.aweme.main.story.live.p1946a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView;
import com.p683ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.main.story.live.a.c */
public class C36737c implements C36733a {

    /* renamed from: a */
    private ValueAnimator f93894a;

    /* renamed from: c */
    protected LiveCircleView f93895c;

    /* renamed from: d */
    public AvatarImageView f93896d;

    /* renamed from: e */
    public boolean f93897e;

    /* renamed from: f */
    public int f93898f;

    /* renamed from: g */
    public int f93899g;

    /* renamed from: h */
    public ValueAnimator f93900h;

    /* renamed from: i */
    public List<UrlModel> f93901i = new ArrayList();

    /* renamed from: b */
    public void mo53034b() {
        if (this.f93894a != null) {
            this.f93894a.cancel();
            this.f93894a = null;
            this.f93897e = false;
        }
    }

    /* renamed from: c */
    public void mo53035c() {
        if (this.f93894a != null) {
            this.f93894a.cancel();
        }
    }

    /* renamed from: a */
    public void mo53031a() {
        if (this.f93896d != null && this.f93895c != null && !this.f93897e) {
            if (this.f93894a != null) {
                this.f93894a.start();
                return;
            }
            this.f93898f = 1;
            this.f93894a = ValueAnimator.ofInt(new int[]{0, 800});
            this.f93900h = ValueAnimator.ofInt(new int[]{0, 800});
            this.f93900h.setRepeatCount(-1);
            this.f93900h.setRepeatMode(1);
            this.f93900h.setDuration(800);
            this.f93894a.setRepeatCount(-1);
            this.f93894a.setRepeatMode(1);
            this.f93894a.setDuration(800);
            this.f93894a.start();
            this.f93900h.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (intValue >= 0 && intValue <= 640) {
                        C36737c.this.f93895c.setFraction((((float) intValue) * 1.0f) / 640.0f);
                    }
                }
            });
            this.f93894a.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f;
                    float f2;
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    if (C36737c.this.f93898f % 5 == 0) {
                        f = 1.0f;
                    } else {
                        f = 0.08f;
                    }
                    if (C36737c.this.f93898f % 5 == 0 && animatedFraction > 0.48f && animatedFraction < 0.52f && C36737c.this.f93901i.size() != 0) {
                        C23515d.m57669a((RemoteImageView) C36737c.this.f93896d, (UrlModel) C36737c.this.f93901i.get(C36737c.this.f93899g));
                        C36737c.this.f93899g = (C36737c.this.f93899g + 1) % C36737c.this.f93901i.size();
                    }
                    if (animatedFraction <= 0.5f) {
                        f2 = 1.0f - (f * (animatedFraction / 0.5f));
                    } else {
                        f2 = (1.0f - f) + (f * ((animatedFraction - 0.5f) / 0.5f));
                    }
                    C36737c.this.f93896d.setScaleX(f2);
                    C36737c.this.f93896d.setScaleY(f2);
                    if (intValue >= 730 && intValue < 740 && !C36737c.this.f93897e) {
                        C36737c.this.f93897e = true;
                        C36737c.this.f93900h.start();
                    }
                }
            });
            this.f93894a.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationCancel(Animator animator) {
                    C36737c.this.f93900h.cancel();
                    C36737c.this.f93897e = false;
                }

                public final void onAnimationRepeat(Animator animator) {
                    C36737c.this.f93898f = (C36737c.this.f93898f + 1) % 5;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo53033a(AbsLiveStoryItemView absLiveStoryItemView) {
        View rootView = absLiveStoryItemView.getRootView();
        this.f93896d = (AvatarImageView) rootView.findViewById(R.id.avs);
        this.f93895c = (LiveCircleView) rootView.findViewById(R.id.avw);
    }

    /* renamed from: a */
    public final void mo75839a(List<UrlModel> list) {
        if (list != null && list.size() != 0) {
            this.f93901i.addAll(list);
            C23515d.m57669a((RemoteImageView) this.f93896d, (UrlModel) this.f93901i.get(0));
        }
    }
}
