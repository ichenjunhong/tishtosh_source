package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.c */
public final class C43628c extends InteractStickerBaseView {

    /* renamed from: a */
    float f110516a;

    /* renamed from: b */
    private int f110517b;

    /* renamed from: c */
    private int f110518c;

    /* renamed from: d */
    private float f110519d = 28.0f;

    /* renamed from: w */
    private int f110520w;

    /* renamed from: x */
    private VotingStickerView f110521x;

    /* renamed from: y */
    private float f110522y;

    /* renamed from: d */
    public final boolean mo88713d() {
        return true;
    }

    public final VotingStickerView getBaseView() {
        return this.f110521x;
    }

    /* renamed from: c */
    public final void mo88712c() {
        this.f110516a = (float) this.f110379k.getMeasuredHeight();
    }

    /* renamed from: a */
    public final void mo88979a(VotingStickerView votingStickerView) {
        if (votingStickerView != null) {
            this.f110521x = votingStickerView;
            ((ViewGroup) this.f110379k).removeAllViews();
            ((ViewGroup) this.f110379k).addView(votingStickerView);
        }
    }

    /* renamed from: b */
    public final float mo88981b(VotingStickerView votingStickerView) {
        float height = (this.f110516a - ((float) this.f110521x.getHeight())) * this.f110374f;
        if (height >= 0.0f || !C9431p.m18664a(votingStickerView.getVoteStruct().getQuestion())) {
            return height / 2.0f;
        }
        return height;
    }

    public C43628c(Context context) {
        super(context);
        this.f110373e = context;
        this.f110518c = (int) C9432q.m18687b(context, 32.0f);
        this.f110517b = C9432q.m18670a(context) - this.f110518c;
        this.f110520w = this.f110517b;
        this.f110519d = C9432q.m18687b(context, 28.0f);
        this.f110522y = C9432q.m18687b(context, 96.0f);
        LayoutInflater.from(this.f110373e).inflate(R.layout.a85, this);
        this.f110378j = (StickerHelpBoxView) findViewById(R.id.ct1);
        this.f110379k = findViewById(R.id.zr);
    }

    /* renamed from: a */
    public final void mo88980a(VoteStruct voteStruct) {
        if (this.f110521x == null) {
            this.f110521x = new VotingStickerView(getContext());
            this.f110521x.setTouchEnable(true);
            this.f110521x.setEditEnable(false);
            if (voteStruct != null && !C9376b.m18558a((Collection<T>) voteStruct.getOptions())) {
                this.f110521x.mo88954a(voteStruct);
            }
            this.f110521x.mo88956b();
        }
        ((ViewGroup) this.f110379k).removeAllViews();
        ((ViewGroup) this.f110379k).addView(this.f110521x);
    }
}
