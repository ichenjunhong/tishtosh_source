package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.sticker.C46410r;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45815a;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45816b;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45858a;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45875c;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46086b;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.b.c */
public final class C46137c extends C1352v implements OnClickListener, C45874b {

    /* renamed from: a */
    public C46086b f116431a;

    /* renamed from: b */
    public int f116432b;

    /* renamed from: c */
    public final ImageView f116433c;

    /* renamed from: d */
    public final View f116434d;

    /* renamed from: e */
    public final C46354l f116435e;

    /* renamed from: f */
    public final C45814b f116436f;

    /* renamed from: g */
    public final List<StickerWrapper> f116437g;

    /* renamed from: h */
    private StickerWrapper f116438h;

    /* renamed from: i */
    private ObjectAnimator f116439i;

    /* renamed from: j */
    private final Context f116440j;

    /* renamed from: k */
    private final SimpleDraweeView f116441k;

    /* renamed from: l */
    private final ImageView f116442l;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.b.c$a */
    static final class C46138a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46137c f116443a;

        /* renamed from: b */
        final /* synthetic */ Effect f116444b;

        /* renamed from: c */
        final /* synthetic */ int f116445c;

        /* renamed from: d */
        final /* synthetic */ int f116446d;

        C46138a(C46137c cVar, Effect effect, int i, int i2) {
            this.f116443a = cVar;
            this.f116444b = effect;
            this.f116445c = i;
            this.f116446d = i2;
        }

        public final void run() {
            View view = this.f116443a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            if (view.getParent() != null) {
                this.f116443a.f116436f.mo92249a((C45816b<T>) C45858a.m99692a(this.f116444b, this.f116443a.f116432b, (C45815a) null, (StickerWrapper) null, (Bundle) null, (C45874b) null, (C45875c) null, 62, (Object) null));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.b.c$b */
    public static final class C46139b implements C48710o {
        C46139b() {
        }

        /* renamed from: a */
        public final void mo8641a() {
        }

        /* renamed from: b */
        public final void mo8642b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.b.c$c */
    static final class C46140c implements C48715t {

        /* renamed from: a */
        public static final C46140c f116447a = new C46140c();

        C46140c() {
        }

        /* renamed from: a */
        public final void mo8708a() {
        }
    }

    /* renamed from: a */
    public final void mo92252a(Effect effect, int i) {
    }

    /* renamed from: c */
    private final void m100257c() {
        ObjectAnimator objectAnimator = this.f116439i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f116442l.setRotation(0.0f);
        this.f116442l.setImageDrawable(C0726c.m2091a(this.f116440j, (int) R.drawable.fo));
    }

    /* renamed from: a */
    private final void m100254a() {
        Integer num;
        StickerWrapper stickerWrapper = this.f116438h;
        if (stickerWrapper != null) {
            num = Integer.valueOf(stickerWrapper.f115781c);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            this.f116442l.setVisibility(0);
        } else if (num != null && num.intValue() == 3) {
            this.f116442l.setVisibility(0);
        } else if (num != null && num.intValue() == 4) {
            this.f116442l.setVisibility(0);
        } else {
            if (num != null && num.intValue() == 2) {
                this.f116442l.setVisibility(0);
                m100256b();
            }
        }
    }

    /* renamed from: b */
    private final void m100256b() {
        this.f116442l.setImageDrawable(C0726c.m2091a(this.f116440j, (int) R.drawable.fp));
        this.f116439i = ObjectAnimator.ofFloat(this.f116442l, "rotation", new float[]{0.0f, 360.0f});
        ObjectAnimator objectAnimator = this.f116439i;
        if (objectAnimator != null) {
            objectAnimator.setDuration(800);
        }
        ObjectAnimator objectAnimator2 = this.f116439i;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatMode(1);
        }
        ObjectAnimator objectAnimator3 = this.f116439i;
        if (objectAnimator3 != null) {
            objectAnimator3.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator4 = this.f116439i;
        if (objectAnimator4 != null) {
            objectAnimator4.start();
        }
    }

    /* renamed from: b */
    public final void mo92254b(Effect effect) {
        CharSequence charSequence;
        String str = null;
        if (effect != null) {
            charSequence = effect.getEffectId();
        } else {
            charSequence = null;
        }
        CharSequence charSequence2 = charSequence;
        StickerWrapper stickerWrapper = this.f116438h;
        if (stickerWrapper != null) {
            Effect effect2 = stickerWrapper.f115779a;
            if (effect2 != null) {
                str = effect2.getEffectId();
            }
        }
        if (TextUtils.equals(charSequence2, str)) {
            StickerWrapper stickerWrapper2 = this.f116438h;
            if (stickerWrapper2 != null) {
                stickerWrapper2.f115781c = 2;
            }
            m100256b();
        }
    }

    /* renamed from: a */
    public final void mo92251a(Effect effect) {
        CharSequence charSequence;
        String str = null;
        if (effect != null) {
            charSequence = effect.getEffectId();
        } else {
            charSequence = null;
        }
        CharSequence charSequence2 = charSequence;
        StickerWrapper stickerWrapper = this.f116438h;
        if (stickerWrapper != null) {
            Effect effect2 = stickerWrapper.f115779a;
            if (effect2 != null) {
                str = effect2.getEffectId();
            }
        }
        if (TextUtils.equals(charSequence2, str)) {
            StickerWrapper stickerWrapper2 = this.f116438h;
            if (stickerWrapper2 != null) {
                stickerWrapper2.f115781c = 1;
            }
            m100257c();
            m100254a();
            if (!C46059g.m100087k(effect)) {
                this.f116433c.setAlpha(0.0f);
                this.f116433c.animate().alpha(1.0f).setDuration(150).start();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r13)
            com.ss.android.ugc.aweme.sticker.presenter.l r13 = r12.f116435e
            com.ss.android.ugc.aweme.sticker.presenter.g r13 = r13.mo92989g()
            com.ss.android.ugc.aweme.sticker.StickerWrapper r0 = r12.f116438h
            r1 = 0
            if (r0 == 0) goto L_0x0011
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f115779a
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            r13.mo93015b(r0)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r13 = r12.f116438h
            if (r13 == 0) goto L_0x001f
            int r13 = r13.f115781c
            r0 = 2
            if (r13 != r0) goto L_0x001f
            return
        L_0x001f:
            com.ss.android.ugc.aweme.sticker.presenter.l r13 = r12.f116435e
            com.ss.android.ugc.aweme.sticker.StickerWrapper r0 = r12.f116438h
            if (r0 == 0) goto L_0x0028
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f115779a
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            boolean r13 = com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b.m99701b(r13, r0)
            if (r13 == 0) goto L_0x0061
            android.widget.ImageView r13 = r12.f116433c
            r0 = 1065353216(0x3f800000, float:1.0)
            r13.setAlpha(r0)
            android.widget.ImageView r13 = r12.f116433c
            android.view.ViewPropertyAnimator r13 = r13.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r13 = r13.alpha(r0)
            r0 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r13 = r13.setDuration(r0)
            r13.start()
            com.ss.android.ugc.aweme.sticker.StickerWrapper r0 = r12.f116438h
            if (r0 == 0) goto L_0x0060
            com.ss.android.ugc.aweme.sticker.a.b r13 = r12.f116436f
            int r1 = r12.f116432b
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            com.ss.android.ugc.aweme.sticker.a.b.d r0 = com.p683ss.android.ugc.aweme.sticker.p2280d.C45858a.m99694a(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.sticker.a.b.b r0 = (com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45816b) r0
            r13.mo92249a(r0)
            return
        L_0x0060:
            return
        L_0x0061:
            com.ss.android.ugc.aweme.sticker.presenter.l r13 = r12.f116435e
            com.ss.android.ugc.aweme.sticker.StickerWrapper r0 = r12.f116438h
            if (r0 == 0) goto L_0x0070
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f115779a
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = r0.getId()
            goto L_0x0071
        L_0x0070:
            r0 = r1
        L_0x0071:
            com.ss.android.ugc.aweme.sticker.StickerWrapper r2 = r12.f116438h
            if (r2 == 0) goto L_0x007d
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f115779a
            if (r2 == 0) goto L_0x007d
            java.lang.String r1 = r2.getTagsUpdatedAt()
        L_0x007d:
            com.ss.android.ugc.aweme.sticker.panel.defaultpanel.b.c$c r2 = com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b.C46137c.C46140c.f116447a
            com.ss.android.ugc.effectmanager.effect.c.t r2 = (com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t) r2
            r13.mo92979a(r0, r1, r2)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r3 = r12.f116438h
            if (r3 == 0) goto L_0x00a0
            com.ss.android.ugc.aweme.sticker.a.b r13 = r12.f116436f
            int r4 = r12.f116432b
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = r12
            com.ss.android.ugc.aweme.sticker.e.c$b r8 = (com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b) r8
            r9 = 0
            r10 = 46
            r11 = 0
            com.ss.android.ugc.aweme.sticker.a.b.c r0 = com.p683ss.android.ugc.aweme.sticker.p2280d.C45858a.m99691a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.sticker.a.b.b r0 = (com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45816b) r0
            r13.mo92249a(r0)
            return
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b.C46137c.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo92253a(Effect effect, C48649d dVar) {
        CharSequence charSequence;
        String str = null;
        if (effect != null) {
            charSequence = effect.getEffectId();
        } else {
            charSequence = null;
        }
        CharSequence charSequence2 = charSequence;
        StickerWrapper stickerWrapper = this.f116438h;
        if (stickerWrapper != null) {
            Effect effect2 = stickerWrapper.f115779a;
            if (effect2 != null) {
                str = effect2.getEffectId();
            }
        }
        if (TextUtils.equals(charSequence2, str)) {
            C50275d.m108531a(this.f116440j, (int) R.string.awe, 0).mo98174a();
            StickerWrapper stickerWrapper2 = this.f116438h;
            if (stickerWrapper2 != null) {
                stickerWrapper2.f115781c = 3;
            }
            m100257c();
            m100254a();
        }
    }

    /* renamed from: a */
    private final void m100255a(Effect effect, int i, int i2) {
        C46086b bVar = this.f116431a;
        if (bVar != null && bVar.mo92784a(effect, i, i2)) {
            this.itemView.post(new C46138a(this, effect, i, i2));
        }
    }

    public C46137c(View view, C46354l lVar, C45814b bVar, List<? extends StickerWrapper> list) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(bVar, "selectedController");
        C52711k.m112240b(list, "stickers");
        super(view);
        this.f116434d = view;
        this.f116435e = lVar;
        this.f116436f = bVar;
        this.f116437g = list;
        Context context = this.f116434d.getContext();
        C52711k.m112236a((Object) context, "view.context");
        this.f116440j = context;
        View findViewById = this.f116434d.findViewById(R.id.at4);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.img_sticker_icon)");
        this.f116441k = (SimpleDraweeView) findViewById;
        View findViewById2 = this.f116434d.findViewById(R.id.at6);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.img_sticker_loading)");
        this.f116442l = (ImageView) findViewById2;
        this.itemView.setOnTouchListener(new C46410r(1.1f, 100, this.f116441k));
        this.f116434d.setOnClickListener(this);
        View findViewById3 = this.f116434d.findViewById(R.id.at2);
        C52711k.m112236a((Object) findViewById3, "view.findViewById(R.id.img_sticker_back)");
        this.f116433c = (ImageView) findViewById3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00eb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92834a(com.p683ss.android.ugc.aweme.sticker.StickerWrapper r6, java.util.List<? extends com.p683ss.android.ugc.aweme.sticker.StickerWrapper> r7, int r8, int r9) {
        /*
            r5 = this;
            java.lang.String r0 = "data"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            if (r6 == 0) goto L_0x011e
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = com.bytedance.common.utility.p522b.C9376b.m18558a(r7)
            if (r7 == 0) goto L_0x0011
            goto L_0x011e
        L_0x0011:
            com.ss.android.ugc.aweme.sticker.presenter.l r7 = r5.f116435e
            com.ss.android.ugc.aweme.sticker.i.a.p r7 = r7.mo92973a()
            com.ss.android.ugc.aweme.sticker.i.a.i r7 = r7.mo92532d()
            com.ss.android.ugc.aweme.sticker.StickerWrapper r7 = r7.mo92509a(r6)
            r5.f116438h = r7
            android.widget.ImageView r7 = r5.f116433c
            r0 = 0
            r7.setAlpha(r0)
            r5.f116432b = r9
            r5.m100254a()
            com.ss.android.ugc.aweme.sticker.StickerWrapper r7 = r5.f116438h
            r1 = 0
            if (r7 == 0) goto L_0x0034
            com.ss.android.ugc.effectmanager.effect.model.Effect r7 = r7.f115779a
            goto L_0x0035
        L_0x0034:
            r7 = r1
        L_0x0035:
            boolean r7 = com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g.m100088l(r7)
            if (r7 == 0) goto L_0x008f
            com.ss.android.ugc.aweme.sticker.StickerWrapper r7 = r5.f116438h
            if (r7 == 0) goto L_0x0048
            com.ss.android.ugc.effectmanager.effect.model.Effect r7 = r7.f115779a
            if (r7 == 0) goto L_0x0048
            com.ss.android.ugc.effectmanager.common.model.UrlModel r7 = r7.getIconUrl()
            goto L_0x0049
        L_0x0048:
            r7 = r1
        L_0x0049:
            if (r7 == 0) goto L_0x0097
            com.ss.android.ugc.aweme.sticker.StickerWrapper r7 = r5.f116438h
            if (r7 == 0) goto L_0x005e
            com.ss.android.ugc.effectmanager.effect.model.Effect r7 = r7.f115779a
            if (r7 == 0) goto L_0x005e
            com.ss.android.ugc.effectmanager.common.model.UrlModel r7 = r7.getIconUrl()
            if (r7 == 0) goto L_0x005e
            java.util.List r7 = r7.getUrlList()
            goto L_0x005f
        L_0x005e:
            r7 = r1
        L_0x005f:
            boolean r7 = com.bytedance.common.utility.C9414h.m18630a(r7)
            if (r7 != 0) goto L_0x0097
            com.facebook.drawee.view.SimpleDraweeView r7 = r5.f116441k
            r2 = 128(0x80, float:1.794E-43)
            r7.setImageAlpha(r2)
            com.facebook.drawee.view.SimpleDraweeView r7 = r5.f116441k
            com.ss.android.ugc.aweme.sticker.StickerWrapper r2 = r5.f116438h
            if (r2 == 0) goto L_0x008a
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f115779a
            if (r2 == 0) goto L_0x008a
            com.ss.android.ugc.effectmanager.common.model.UrlModel r2 = r2.getIconUrl()
            if (r2 == 0) goto L_0x008a
            java.util.List r2 = r2.getUrlList()
            if (r2 == 0) goto L_0x008a
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x008b
        L_0x008a:
            r2 = r1
        L_0x008b:
            com.p683ss.android.ugc.tools.p2504a.C50181a.m108292a(r7, r2)
            goto L_0x0097
        L_0x008f:
            com.facebook.drawee.view.SimpleDraweeView r7 = r5.f116441k
            r2 = 2131953540(0x7f130784, float:1.9543554E38)
            r7.setImageResource(r2)
        L_0x0097:
            com.ss.android.ugc.aweme.sticker.presenter.l r7 = r5.f116435e
            com.ss.android.ugc.aweme.sticker.StickerWrapper r2 = r5.f116438h
            if (r2 == 0) goto L_0x00a6
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f115779a
            if (r2 == 0) goto L_0x00a6
            java.lang.String r2 = r2.getId()
            goto L_0x00a7
        L_0x00a6:
            r2 = r1
        L_0x00a7:
            com.ss.android.ugc.aweme.sticker.StickerWrapper r3 = r5.f116438h
            if (r3 == 0) goto L_0x00b4
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r3.f115779a
            if (r3 == 0) goto L_0x00b4
            java.util.List r3 = r3.getTags()
            goto L_0x00b5
        L_0x00b4:
            r3 = r1
        L_0x00b5:
            com.ss.android.ugc.aweme.sticker.StickerWrapper r4 = r5.f116438h
            if (r4 == 0) goto L_0x00c1
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r4.f115779a
            if (r4 == 0) goto L_0x00c1
            java.lang.String r1 = r4.getTagsUpdatedAt()
        L_0x00c1:
            com.ss.android.ugc.aweme.sticker.panel.defaultpanel.b.c$b r4 = new com.ss.android.ugc.aweme.sticker.panel.defaultpanel.b.c$b
            r4.<init>()
            com.ss.android.ugc.effectmanager.effect.c.o r4 = (com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o) r4
            r7.mo92980a(r2, r3, r1, r4)
            com.ss.android.ugc.aweme.sticker.presenter.l r7 = r5.f116435e
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r6.f115779a
            boolean r7 = com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b.m99701b(r7, r1)
            r1 = 150(0x96, double:7.4E-322)
            if (r7 == 0) goto L_0x00eb
            android.widget.ImageView r7 = r5.f116433c
            android.view.ViewPropertyAnimator r7 = r7.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r7 = r7.alpha(r0)
            android.view.ViewPropertyAnimator r7 = r7.setDuration(r1)
            r7.start()
            goto L_0x00fc
        L_0x00eb:
            android.widget.ImageView r7 = r5.f116433c
            android.view.ViewPropertyAnimator r7 = r7.animate()
            android.view.ViewPropertyAnimator r7 = r7.alpha(r0)
            android.view.ViewPropertyAnimator r7 = r7.setDuration(r1)
            r7.start()
        L_0x00fc:
            android.view.View r7 = r5.itemView
            java.lang.String r0 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.f115779a
            java.lang.String r1 = "effect.effect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r0 = r0.getName()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.setContentDescription(r0)
            com.ss.android.ugc.effectmanager.effect.model.Effect r6 = r6.f115779a
            java.lang.String r7 = "effect.effect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            r5.m100255a(r6, r8, r9)
            return
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b.C46137c.mo92834a(com.ss.android.ugc.aweme.sticker.StickerWrapper, java.util.List, int, int):void");
    }
}
