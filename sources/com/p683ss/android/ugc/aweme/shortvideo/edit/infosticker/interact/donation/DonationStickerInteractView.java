package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView.C43604a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b.C44526a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b.C44531b;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerInteractView */
public final class DonationStickerInteractView extends InteractStickerBaseView {

    /* renamed from: a */
    public final DonationStickerView f110284a;

    /* renamed from: b */
    private final int f110285b;

    /* renamed from: c */
    private final EditDonationStickerViewModel f110286c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerInteractView$a */
    public static final class C43580a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DonationStickerInteractView f110287a;

        public C43580a(DonationStickerInteractView donationStickerInteractView) {
            this.f110287a = donationStickerInteractView;
        }

        public final void run() {
            this.f110287a.mo88875f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerInteractView$b */
    static final class C43581b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DonationStickerInteractView f110288a;

        C43581b(DonationStickerInteractView donationStickerInteractView) {
            this.f110288a = donationStickerInteractView;
        }

        public final void run() {
            this.f110288a.mo88876g();
            this.f110288a.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final boolean mo88713d() {
        return true;
    }

    /* renamed from: c */
    public final void mo88712c() {
        this.f110284a.setVisibility(0);
    }

    public final View getDrawView() {
        return this.f110284a;
    }

    /* renamed from: b */
    public final boolean mo88710b() {
        if (this.f110284a.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final float getEndTime() {
        return (float) this.f110284a.mo52069b(0);
    }

    public final float getStartTime() {
        return (float) this.f110284a.mo52063a(0);
    }

    /* renamed from: a */
    public final C44526a mo88705a() {
        return new C44531b(this, new C43604a());
    }

    /* renamed from: e */
    public final boolean mo88714e() {
        EditDonationStickerViewModel editDonationStickerViewModel = this.f110286c;
        Context context = this.f110373e;
        if (context != null) {
            return ((EditDonationStickerState) editDonationStickerViewModel.mo97464a((FragmentActivity) context)).getInTimeEditView();
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final void setAlpha(float f) {
        this.f110284a.setAlpha(f);
    }

    public final void setPlayPosition(long j) {
        this.f110284a.setPlayPosition(j);
    }

    /* renamed from: a */
    public final boolean mo88709a(MotionEvent motionEvent) {
        boolean a = super.mo88709a(motionEvent);
        if (a) {
            this.f110284a.setTouching(true);
        }
        return a;
    }

    public final void setController(C43588b bVar) {
        C52711k.m112240b(bVar, "controller");
        this.f110284a.setStickerController(bVar);
    }

    /* renamed from: b */
    public final boolean mo88711b(MotionEvent motionEvent) {
        boolean b = super.mo88711b(motionEvent);
        this.f110284a.setTouching(false);
        return b;
    }

    public DonationStickerInteractView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f110285b = (int) C9432q.m18687b(context, 32.0f);
        this.f110373e = context;
        Context context2 = this.f110373e;
        if (context2 != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) context2).mo96760a(EditDonationStickerViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f110286c = (EditDonationStickerViewModel) a;
            LayoutInflater.from(context).inflate(R.layout.br7, this);
            this.f110378j = (StickerHelpBoxView) findViewById(R.id.ct1);
            this.f110379k = findViewById(R.id.zr);
            View findViewById = findViewById(R.id.e5q);
            C52711k.m112236a((Object) findViewById, "findViewById(R.id.donation_sticker_view)");
            this.f110284a = (DonationStickerView) findViewById;
            setVisibility(8);
            this.f110387s = 0.8f;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public /* synthetic */ DonationStickerInteractView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
