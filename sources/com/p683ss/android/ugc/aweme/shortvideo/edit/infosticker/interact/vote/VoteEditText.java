package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.content.Context;
import android.support.p043v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText */
public class VoteEditText extends AppCompatEditText {

    /* renamed from: a */
    public long f110451a;

    /* renamed from: b */
    private boolean f110452b;

    public VoteEditText(Context context) {
        super(context);
    }

    public void setMode(boolean z) {
        this.f110452b = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f110452b) {
            return super.onTouchEvent(motionEvent);
        }
        this.f110451a = System.currentTimeMillis();
        return false;
    }

    public VoteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
