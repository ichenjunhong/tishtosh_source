package com.p683ss.android.ugc.aweme.main.story.live.p1946a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarWithBorderView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.main.story.live.a.b */
public final class C36734b implements C36733a {

    /* renamed from: a */
    public List<AvatarWithBorderView> f93887a;

    /* renamed from: b */
    public int f93888b;

    /* renamed from: c */
    public List<UrlModel> f93889c = new ArrayList();

    /* renamed from: d */
    public boolean f93890d;

    /* renamed from: e */
    private ValueAnimator f93891e;

    /* renamed from: b */
    public final void mo53034b() {
        if (this.f93891e != null) {
            this.f93891e.cancel();
            this.f93891e = null;
        }
        this.f93890d = false;
    }

    /* renamed from: c */
    public final void mo53035c() {
        if (this.f93891e != null) {
            this.f93891e.cancel();
        }
    }

    /* renamed from: a */
    public final void mo53031a() {
        if (this.f93887a != null && this.f93889c != null && this.f93889c.size() != 0 && !this.f93890d) {
            if (this.f93891e != null) {
                this.f93891e.start();
                return;
            }
            this.f93888b = 0;
            this.f93891e = ValueAnimator.ofInt(new int[]{0, 2500});
            this.f93891e.setRepeatCount(-1);
            this.f93891e.setRepeatMode(1);
            this.f93891e.setDuration(2500);
            this.f93891e.start();
            this.f93891e.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (intValue >= 0 && intValue <= 510) {
                        float f = (((float) intValue) * 1.0f) / 500.0f;
                        if (f > 1.0f) {
                            f = 1.0f;
                        }
                        ((AvatarWithBorderView) C36734b.this.f93887a.get(0)).setAlpha(f);
                        ((AvatarWithBorderView) C36734b.this.f93887a.get(0)).setScaleX(f);
                        ((AvatarWithBorderView) C36734b.this.f93887a.get(0)).setScaleY(f);
                        ((AvatarWithBorderView) C36734b.this.f93887a.get(1)).setTranslationX(C9432q.m18687b(C11010c.m22280a(), 21.0f) * f);
                        ((AvatarWithBorderView) C36734b.this.f93887a.get(2)).setTranslationX(C9432q.m18687b(C11010c.m22280a(), 21.0f) * f);
                        ((AvatarWithBorderView) C36734b.this.f93887a.get(3)).setAlpha(1.0f - f);
                    }
                }
            });
            this.f93891e.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationCancel(Animator animator) {
                    C36734b.this.f93890d = false;
                }

                public final void onAnimationStart(Animator animator) {
                    C36734b.this.f93890d = true;
                }

                public final void onAnimationRepeat(Animator animator) {
                    C36734b.this.f93888b = (C36734b.this.f93888b + 1) % C36734b.this.f93889c.size();
                    for (int i = 0; i < C36734b.this.f93887a.size(); i++) {
                        C23515d.m57669a((RemoteImageView) (AvatarWithBorderView) C36734b.this.f93887a.get(3 - i), (UrlModel) C36734b.this.f93889c.get((C36734b.this.f93888b + i) % C36734b.this.f93889c.size()));
                    }
                }
            });
            this.f93890d = true;
        }
    }

    /* renamed from: a */
    public final void mo75839a(List<UrlModel> list) {
        if (list != null && list.size() != 0) {
            this.f93889c.addAll(list);
            for (int i = 0; i < this.f93887a.size(); i++) {
                C23515d.m57669a((RemoteImageView) this.f93887a.get(i), (UrlModel) this.f93889c.get(i));
            }
        }
    }

    /* renamed from: a */
    public final void mo53033a(AbsLiveStoryItemView absLiveStoryItemView) {
        View rootView = absLiveStoryItemView.getRootView();
        ArrayList<AvatarWithBorderView> arrayList = new ArrayList<>();
        arrayList.add(rootView.findViewById(R.id.avs));
        arrayList.add(rootView.findViewById(R.id.avt));
        arrayList.add(rootView.findViewById(R.id.avu));
        arrayList.add(rootView.findViewById(R.id.avv));
        for (AvatarWithBorderView borderColor : arrayList) {
            borderColor.setBorderColor(R.color.a3c);
        }
        this.f93887a = arrayList;
    }
}
