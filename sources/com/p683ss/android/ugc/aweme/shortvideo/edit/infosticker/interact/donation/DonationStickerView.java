package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.C2240a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.scene.C18998a;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43509at;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.sticker.data.C45868a;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49481b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerView */
public final class DonationStickerView extends LinearLayout implements C43509at<C43592c>, C43593d {

    /* renamed from: b */
    public static final C43582a f110289b = new C43582a(null);

    /* renamed from: a */
    public C43588b f110290a;

    /* renamed from: c */
    private C43592c f110291c;

    /* renamed from: d */
    private long f110292d;

    /* renamed from: e */
    private boolean f110293e;

    /* renamed from: f */
    private long f110294f;

    /* renamed from: g */
    private final SafeHandler f110295g;

    /* renamed from: h */
    private final CircleImageView f110296h;

    /* renamed from: i */
    private final DmtTextView f110297i;

    /* renamed from: j */
    private final DmtButton f110298j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerView$a */
    public static final class C43582a {
        private C43582a() {
        }

        public /* synthetic */ C43582a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerView$b */
    static final class C43583b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DonationStickerView f110299a;

        C43583b(DonationStickerView donationStickerView) {
            this.f110299a = donationStickerView;
        }

        public final void run() {
            this.f110299a.mo88777b();
        }
    }

    public DonationStickerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DonationStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final long getPlayPosition() {
        return this.f110292d;
    }

    public final C43588b getStickerController() {
        C43588b bVar = this.f110290a;
        if (bVar == null) {
            C52711k.m112237a("stickerController");
        }
        return bVar;
    }

    /* renamed from: e */
    private final boolean m95739e() {
        if (this.f110291c != null) {
            C43592c cVar = this.f110291c;
            if (cVar == null) {
                C52711k.m112234a();
            }
            if (cVar.f110318d != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C43592c mo52072c() {
        return C43592c.m95768a(m95738d(), null, null, 0, 0, 15, null);
    }

    /* renamed from: d */
    private final C43592c m95738d() {
        C43592c cVar = this.f110291c;
        if (cVar != null) {
            C43588b bVar = this.f110290a;
            if (bVar == null) {
                C52711k.m112237a("stickerController");
            }
            cVar.f110316b = bVar.mo88731d();
            if (cVar != null) {
                return cVar;
            }
        }
        C43592c cVar2 = new C43592c(null, null, 0, 0, 15, null);
        return cVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r3 <= ((long) r0.f110318d)) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0055  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo88777b() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c r0 = r7.f110291c
            r1 = 0
            if (r0 == 0) goto L_0x005b
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b r0 = r7.f110290a
            if (r0 != 0) goto L_0x000e
            java.lang.String r2 = "stickerController"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x000e:
            boolean r0 = r0.mo88748a()
            if (r0 != 0) goto L_0x005b
            boolean r0 = r7.f110293e
            if (r0 != 0) goto L_0x005b
            boolean r0 = r7.m95739e()
            r2 = 1
            if (r0 == 0) goto L_0x0042
            long r3 = r7.f110292d
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c r0 = r7.f110291c
            if (r0 != 0) goto L_0x0028
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0028:
            int r0 = r0.f110317c
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0040
            long r3 = r7.f110292d
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c r0 = r7.f110291c
            if (r0 != 0) goto L_0x0038
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0038:
            int r0 = r0.f110318d
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r0 = 0
            goto L_0x0043
        L_0x0042:
            r0 = 1
        L_0x0043:
            r3 = 8
            if (r0 == 0) goto L_0x004e
            int r4 = r7.getVisibility()
            if (r3 != r4) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            r4 = r7
            android.view.View r4 = (android.view.View) r4
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r1 = 8
        L_0x0057:
            com.p683ss.android.ugc.aweme.base.utils.C23729p.m58264b(r4, r1)
            return r2
        L_0x005b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerView.mo88777b():boolean");
    }

    public final void setPlayPosition(long j) {
        this.f110292d = j;
    }

    public final void setEndTime(int i) {
        C43592c cVar = this.f110291c;
        if (cVar != null) {
            cVar.f110318d = i;
        }
    }

    public final void setStartTime(int i) {
        C43592c cVar = this.f110291c;
        if (cVar != null) {
            cVar.f110317c = i;
        }
    }

    public final void setStickerController(C43588b bVar) {
        C52711k.m112240b(bVar, "<set-?>");
        this.f110290a = bVar;
    }

    /* renamed from: a */
    public final int mo52063a(int i) {
        if (!m95739e()) {
            return i;
        }
        C43592c cVar = this.f110291c;
        if (cVar == null) {
            C52711k.m112234a();
        }
        return cVar.f110317c;
    }

    /* renamed from: b */
    public final int mo52069b(int i) {
        if (!m95739e()) {
            return i;
        }
        C43592c cVar = this.f110291c;
        if (cVar == null) {
            C52711k.m112234a();
        }
        return cVar.f110318d;
    }

    /* renamed from: d */
    public final int mo52073d(int i) {
        if (!m95739e()) {
            return i;
        }
        C43592c cVar = this.f110291c;
        if (cVar == null) {
            C52711k.m112234a();
        }
        return cVar.f110318d;
    }

    public final void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        mo88775a(f, false);
    }

    public final void setDonationStickerData(C43592c cVar) {
        C52711k.m112240b(cVar, "data");
        this.f110291c = cVar;
        C49481b bVar = cVar.f110315a;
        if (bVar != null) {
            mo88776a(bVar);
        }
    }

    /* renamed from: c */
    public final int mo52071c(int i) {
        if (!m95739e()) {
            return 0;
        }
        C43592c cVar = this.f110291c;
        if (cVar == null) {
            C52711k.m112234a();
        }
        return cVar.f110317c;
    }

    public final void setTouching(boolean z) {
        if (z != this.f110293e) {
            this.f110293e = z;
            if (!z) {
                this.f110294f = SystemClock.elapsedRealtime();
                this.f110295g.postDelayed(new C43583b(this), 1000);
            }
        }
    }

    /* renamed from: a */
    public final void mo88776a(C49481b bVar) {
        C52711k.m112240b(bVar, "org");
        UrlModel icon = bVar.getIcon();
        if (icon != null) {
            C23515d.m57669a((RemoteImageView) this.f110296h, icon);
        }
        DmtTextView dmtTextView = this.f110297i;
        String string = getContext().getString(R.string.g9u);
        C52711k.m112236a((Object) string, "context.getString(R.string.donation_sticker_title)");
        String a = C2240a.m6772a(string, Arrays.copyOf(new Object[]{bVar.getName()}, 1));
        C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
        dmtTextView.setText(a);
    }

    /* renamed from: a */
    public final void mo88775a(float f, boolean z) {
        setAlpha(f);
    }

    public DonationStickerView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.b9u, this, true);
        View findViewById = findViewById(R.id.enr);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.org_icon)");
        this.f110296h = (CircleImageView) findViewById;
        View findViewById2 = findViewById(R.id.eys);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.support_org)");
        this.f110297i = (DmtTextView) findViewById2;
        View findViewById3 = findViewById(R.id.e0l);
        C52711k.m112236a((Object) findViewById3, "findViewById(R.id.btn_donate)");
        this.f110298j = (DmtButton) findViewById3;
        C13833a aVar = (C13833a) this.f110296h.getHierarchy();
        C52711k.m112236a((Object) aVar, "iconImageView.hierarchy");
        C13837e eVar = aVar.f36079a;
        if (eVar != null) {
            eVar.mo25939c(C9432q.m18687b(context, 0.5f));
        }
        C13833a aVar2 = (C13833a) this.f110296h.getHierarchy();
        C52711k.m112236a((Object) aVar2, "iconImageView.hierarchy");
        C13837e eVar2 = aVar2.f36079a;
        if (eVar2 != null) {
            eVar2.mo25938b(C0726c.m2098c(context, R.color.aus));
        }
        this.f110298j.setEnabled(false);
        this.f110298j.setClickable(false);
        Activity a = C18998a.m46169a(context);
        if (a != null) {
            this.f110295g = new SafeHandler((AppCompatActivity) a);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }

    /* renamed from: a */
    public final /* synthetic */ void mo52068a(C45868a aVar, int i, int i2) {
        C43592c cVar = (C43592c) aVar;
        C52711k.m112240b(cVar, "stickerData");
        NormalTrackTimeStamp a = C43577d.m95722a(cVar.f110316b);
        C43588b bVar = this.f110290a;
        if (bVar == null) {
            C52711k.m112237a("stickerController");
        }
        NormalTrackTimeStamp a2 = C43577d.m95722a(bVar.mo88731d());
        if (a != null && a2 != null) {
            a.setRotation(a.getRotation() - a2.getRotation());
            if (!C52711k.m112238a(a2.getScale(), 0.0f)) {
                float floatValue = a.getScale().floatValue();
                Float scale = a2.getScale();
                C52711k.m112236a((Object) scale, "newLocation.scale");
                a.setScale(Float.valueOf(floatValue / scale.floatValue()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(a);
            String b = C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(arrayList);
            InteractStickerStruct interactStickerStruct = cVar.f110316b;
            if (interactStickerStruct != null) {
                interactStickerStruct.setTrackList(b);
            }
            C43588b bVar2 = this.f110290a;
            if (bVar2 == null) {
                C52711k.m112237a("stickerController");
            }
            bVar2.mo88751b(false);
            C43588b bVar3 = this.f110290a;
            if (bVar3 == null) {
                C52711k.m112237a("stickerController");
            }
            bVar3.mo88747a(cVar.f110316b, Boolean.valueOf(false));
            C43588b bVar4 = this.f110290a;
            if (bVar4 == null) {
                C52711k.m112237a("stickerController");
            }
            bVar4.mo88751b(true);
        }
    }

    public /* synthetic */ DonationStickerView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
