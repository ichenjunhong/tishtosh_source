package com.bytedance.android.livesdk.gift.combo;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.widget.SpecialCombView;
import com.bytedance.common.utility.p522b.C9376b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ComboTarget {
    private List<ObjectAnimator> animators;
    private View backgroundView;
    private SpecialCombView giftCombView;

    public float getComboViewProgress() {
        return this.giftCombView.getProgress();
    }

    public float getComboViewScale() {
        return this.giftCombView.getScaleX();
    }

    public void showAll() {
        this.giftCombView.setVisibility(0);
        this.backgroundView.setVisibility(0);
    }

    public void hideAll() {
        if (!C9376b.m18558a((Collection<T>) this.animators)) {
            for (ObjectAnimator objectAnimator : this.animators) {
                if (objectAnimator.getTarget() == this && objectAnimator.isRunning()) {
                    objectAnimator.cancel();
                }
            }
            this.backgroundView.setVisibility(8);
            this.giftCombView.endScaleAnim();
            this.giftCombView.setVisibility(8);
        }
    }

    public void setComboViewProgress(float f) {
        this.giftCombView.setProgress(f);
    }

    public void setCountDownTime(int i) {
        this.giftCombView.setCountDownTime(i);
    }

    public void startComboAnim(long j) {
        this.giftCombView.startScaleAnim(j, null);
    }

    public void setComboViewScale(float f) {
        this.giftCombView.setScaleX(f);
        this.giftCombView.setScaleY(f);
    }

    public void asTarget(ObjectAnimator objectAnimator) {
        objectAnimator.setTarget(this);
        if (this.animators == null) {
            this.animators = new ArrayList(3);
        }
        if (!this.animators.contains(objectAnimator)) {
            this.animators.add(objectAnimator);
        }
    }

    public ComboTarget(SpecialCombView specialCombView, View view) {
        this.giftCombView = specialCombView;
        this.backgroundView = view;
        specialCombView.setCircleBackgroundColor(C3922z.m9909b((int) R.color.aky), C3922z.m9909b((int) R.color.akw));
        specialCombView.setProgressColor(C3922z.m9909b((int) R.color.aku), C3922z.m9909b((int) R.color.aks));
    }
}
