package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.commnet;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.comment_sticker.C25467c;
import com.p683ss.android.ugc.aweme.comment_sticker.view.CommentStickerView;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView.C43604a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b.C44526a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b.C44531b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2230e.C44565b;
import com.p683ss.android.ugc.aweme.tools.C46811b;
import com.p683ss.android.ugc.gamora.editor.EditCommentStickerState;
import com.p683ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.commnet.CommentStickerInteractView */
public class CommentStickerInteractView extends InteractStickerBaseView {

    /* renamed from: a */
    CommentStickerView f110205a;

    /* renamed from: b */
    private int f110206b;

    /* renamed from: c */
    private int f110207c;

    /* renamed from: d */
    private int f110208d;

    /* renamed from: w */
    private EditCommentStickerViewModel f110209w;

    /* renamed from: d */
    public final boolean mo88713d() {
        return true;
    }

    public View getDrawView() {
        return this.f110205a;
    }

    /* renamed from: c */
    public final void mo88712c() {
        this.f110205a.setVisibility(0);
    }

    /* renamed from: a */
    public final C44526a mo88705a() {
        return new C44531b(this, new C43604a());
    }

    /* renamed from: b */
    public final boolean mo88710b() {
        if (this.f110205a.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo88714e() {
        return ((EditCommentStickerState) this.f110209w.mo97464a((FragmentActivity) this.f110373e)).getInTimeEditView();
    }

    public CommentStickerInteractView(Context context) {
        this(context, null);
    }

    public void setAlpha(float f) {
        this.f110205a.setAlpha(f);
    }

    public void setController(C43551a aVar) {
        this.f110205a.setController(aVar);
    }

    public void setPlayPosition(long j) {
        this.f110205a.setPlayPosition(j);
    }

    public void setDumpData(C44565b bVar) {
        if (this.f110205a != null) {
            this.f110205a.setDumpData(bVar);
        }
    }

    /* renamed from: b */
    public final boolean mo88711b(MotionEvent motionEvent) {
        boolean b = super.mo88711b(motionEvent);
        this.f110205a.setTouching(false);
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88708a(C25467c cVar) {
        this.f110379k.post(new C43557f(this, cVar));
    }

    /* renamed from: a */
    public final boolean mo88709a(MotionEvent motionEvent) {
        boolean a = super.mo88709a(motionEvent);
        if (a) {
            this.f110205a.setTouching(true);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo88707a(CommentVideoModel commentVideoModel, C25467c cVar) {
        setVisibility(4);
        this.f110205a.mo52067a(commentVideoModel, (C25467c) new C43555d(this, cVar));
    }

    public CommentStickerInteractView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f110373e = context;
        this.f110207c = (int) C9432q.m18687b(context, 32.0f);
        this.f110206b = C9432q.m18670a(context) - this.f110207c;
        this.f110208d = this.f110206b;
        this.f110209w = (EditCommentStickerViewModel) C48927d.m105736a((FragmentActivity) this.f110373e).mo96760a(EditCommentStickerViewModel.class);
        LayoutInflater.from(this.f110373e).inflate(R.layout.bkj, this);
        this.f110378j = (StickerHelpBoxView) findViewById(R.id.ct1);
        this.f110379k = findViewById(R.id.zr);
        this.f110205a = (CommentStickerView) findViewById(R.id.a03);
        setVisibility(8);
    }

    /* renamed from: a */
    public final void mo88706a(int i, int i2) {
        int i3;
        if (this.f110379k != null) {
            if (C46811b.m101654a(this.f110373e)) {
                this.f110379k.setX(C9432q.m18687b(getContext(), -32.0f));
            } else {
                this.f110379k.setX(C9432q.m18687b(getContext(), 32.0f));
            }
            if (C22452a.m55499e()) {
                i3 = 0;
            } else {
                i3 = C43303dy.m94972c(this.f110373e);
            }
            this.f110379k.setY(C9432q.m18687b(getContext(), 130.0f) + ((float) i3));
        }
    }
}
