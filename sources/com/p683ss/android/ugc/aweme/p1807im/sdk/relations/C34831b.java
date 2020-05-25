package com.p683ss.android.ugc.aweme.p1807im.sdk.relations;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11180b;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29293i;
import com.p683ss.android.ugc.aweme.emoji.p1684d.C29303a;
import com.p683ss.android.ugc.aweme.emoji.p1684d.C29304b;
import com.p683ss.android.ugc.aweme.emoji.p1684d.C29305c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33220b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33359af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices.IMService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.C35099a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.C35117b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.C35117b.C35119b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35116j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.C35142b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.C35163f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1890b.C35145a.C35146a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.C35405k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ShareNestedLayout;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1897b.C35386b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1897b.C35386b.C35391a;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b */
public final class C34831b implements C35099a {

    /* renamed from: k */
    public static final int f89735k = C23728o.m58241a(162.0d);

    /* renamed from: l */
    public static final float f89736l = ((float) C23728o.m58241a(80.0d));

    /* renamed from: m */
    public static final int f89737m = C23728o.m58241a(131.0d);

    /* renamed from: n */
    public static final C34832a f89738n = new C34832a(null);

    /* renamed from: a */
    public final View f89739a;

    /* renamed from: b */
    public final DmtEditText f89740b;

    /* renamed from: c */
    public C35117b f89741c;

    /* renamed from: d */
    public LinkedHashSet<IMContact> f89742d;

    /* renamed from: e */
    public C35386b f89743e;

    /* renamed from: f */
    public final Activity f89744f;

    /* renamed from: g */
    public final C23371a<Boolean> f89745g;

    /* renamed from: h */
    public final ViewGroup f89746h;

    /* renamed from: i */
    public final SharePackage f89747i;

    /* renamed from: j */
    public final BaseContent f89748j;

    /* renamed from: o */
    private final DmtTextView f89749o;

    /* renamed from: p */
    private final LinearLayout f89750p;

    /* renamed from: q */
    private final RemoteImageView f89751q;

    /* renamed from: r */
    private final ViewGroup f89752r;

    /* renamed from: s */
    private boolean f89753s;

    /* renamed from: t */
    private C35142b f89754t;

    /* renamed from: u */
    private final ViewGroup f89755u;

    /* renamed from: v */
    private final LinkedHashSet<IMContact> f89756v;

    /* renamed from: w */
    private final boolean f89757w = false;

    /* renamed from: x */
    private final MeasureLinearLayout f89758x;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b$a */
    public static final class C34832a {
        private C34832a() {
        }

        /* renamed from: a */
        public static int m78901a() {
            return C34831b.f89735k;
        }

        public /* synthetic */ C34832a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b$b */
    public static final class C34833b implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C34831b f89759a;

        C34833b(C34831b bVar) {
            this.f89759a = bVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f89759a.f89740b.requestFocus();
            ((ShareNestedLayout) this.f89759a.f89746h.findViewById(R.id.cnh)).mo73616c();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b$c */
    static final class C34834c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34831b f89760a;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b$c$a */
        static final class C34836a extends C52712l implements C52671b<Boolean, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C34834c f89762a;

            C34836a(C34834c cVar) {
                this.f89762a = cVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C23371a<Boolean> aVar = this.f89762a.f89760a.f89745g;
                if (aVar != null) {
                    aVar.run(Boolean.valueOf(booleanValue));
                }
                if (booleanValue) {
                    KeyboardUtils.m58184c(this.f89762a.f89760a.f89740b);
                    this.f89762a.f89760a.f89744f.finish();
                }
                return C52860x.f131107a;
            }
        }

        C34834c(C34831b bVar) {
            this.f89760a = bVar;
        }

        public final void onClick(View view) {
            boolean z;
            int i;
            boolean z2;
            boolean z3;
            String str;
            ClickInstrumentation.onClick(view);
            C34831b bVar = this.f89760a;
            Collection collection = this.f89760a.f89742d;
            boolean z4 = true;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            C35117b bVar2 = null;
            if (!z) {
                bVar = null;
            }
            if (bVar != null) {
                C10691a.m21542b((Context) this.f89760a.f89744f, (int) R.string.ftu).mo19066a();
                return;
            }
            C34831b bVar3 = this.f89760a;
            Editable text = this.f89760a.f89740b.getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            if (i > C35197am.m79552a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                bVar3 = null;
            }
            if (bVar3 != null) {
                C10691a.m21542b((Context) this.f89760a.f89744f, (int) R.string.bkj).mo19066a();
                return;
            }
            C34831b bVar4 = this.f89760a;
            C35117b bVar5 = this.f89760a.f89741c;
            if (bVar5 == null || !bVar5.f90315a) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                bVar4 = null;
            }
            if (bVar4 != null) {
                C35117b bVar6 = this.f89760a.f89741c;
                if (bVar6 == null) {
                    C52711k.m112234a();
                }
                LinkedHashSet<IMContact> linkedHashSet = this.f89760a.f89742d;
                if (linkedHashSet == null) {
                    C52711k.m112234a();
                }
                Set set = linkedHashSet;
                SharePackage sharePackage = this.f89760a.f89747i;
                BaseContent baseContent = this.f89760a.f89748j;
                Editable text2 = this.f89760a.f89740b.getText();
                if (text2 != null) {
                    str = text2.toString();
                } else {
                    str = null;
                }
                C52671b aVar = new C34836a(this);
                C52711k.m112240b(aVar, "callback");
                Collection collection2 = set;
                if (collection2 != null && !collection2.isEmpty()) {
                    z4 = false;
                }
                if (z4) {
                    bVar2 = bVar6;
                }
                if (bVar2 != null) {
                    aVar.invoke(Boolean.valueOf(false));
                    return;
                }
                if (set == null) {
                    C52711k.m112234a();
                }
                List e = C52575l.m112139e(collection2);
                C35119b bVar7 = new C35119b(bVar6, str, sharePackage, baseContent, aVar);
                bVar6.mo73232a(e, (C52671b<? super C11180b, C52860x>) bVar7);
                return;
            }
            new C33220b(this.f89760a.f89744f, new C33242d(this) {

                /* renamed from: a */
                final /* synthetic */ C34834c f89761a;

                {
                    this.f89761a = r1;
                }

                public final void sendMsg() {
                    String str;
                    String uuid = UUID.randomUUID().toString();
                    C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
                    LinkedHashSet<IMContact> linkedHashSet = this.f89761a.f89760a.f89742d;
                    if (linkedHashSet == null) {
                        C52711k.m112234a();
                    }
                    List e = C52575l.m112139e((Collection<? extends T>) linkedHashSet);
                    Editable text = this.f89761a.f89760a.f89740b.getText();
                    String str2 = null;
                    if (text != null) {
                        str = text.toString();
                    } else {
                        str = null;
                    }
                    C35106c.m79332a(e, str, this.f89761a.f89760a.f89747i, this.f89761a.f89760a.f89748j, uuid);
                    C23371a<Boolean> aVar = this.f89761a.f89760a.f89745g;
                    if (aVar != null) {
                        aVar.run(Boolean.valueOf(true));
                    }
                    KeyboardUtils.m58184c(this.f89761a.f89760a.f89740b);
                    SharePackage sharePackage = this.f89761a.f89760a.f89747i;
                    LinkedHashSet<IMContact> linkedHashSet2 = this.f89761a.f89760a.f89742d;
                    if (linkedHashSet2 == null) {
                        C52711k.m112234a();
                    }
                    String valueOf = String.valueOf(linkedHashSet2.size());
                    Editable text2 = this.f89761a.f89760a.f89740b.getText();
                    if (text2 != null) {
                        str2 = text2.toString();
                    }
                    LinkedHashSet<IMContact> linkedHashSet3 = this.f89761a.f89760a.f89742d;
                    if (linkedHashSet3 == null) {
                        C52711k.m112234a();
                    }
                    C35190af.m79456a(sharePackage, valueOf, str2, C52575l.m112139e((Collection<? extends T>) linkedHashSet3));
                    SharePackage sharePackage2 = this.f89761a.f89760a.f89747i;
                    if (sharePackage2 == null) {
                        C52711k.m112234a();
                    }
                    LinkedHashSet<IMContact> linkedHashSet4 = this.f89761a.f89760a.f89742d;
                    if (linkedHashSet4 == null) {
                        C52711k.m112234a();
                    }
                    C35116j.m79348a(uuid, sharePackage2, C52575l.m112139e((Collection<? extends T>) linkedHashSet4));
                }
            }).sendMsg();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b$d */
    static final class C34837d implements OnClickListener {

        /* renamed from: a */
        public static final C34837d f89763a = new C34837d();

        C34837d() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b$e */
    public static final class C34838e implements C29303a {

        /* renamed from: a */
        final /* synthetic */ C34831b f89764a;

        C34838e(C34831b bVar) {
            this.f89764a = bVar;
        }

        /* renamed from: a */
        public final void mo59248a(String str) {
            if (ImShareSoftAndMiniEmojiExperimentV2.INSTANCE.mo70519e()) {
                this.f89764a.f89740b.requestFocus();
                Window window = this.f89764a.f89744f.getWindow();
                if (window != null) {
                    window.setSoftInputMode(16);
                }
                KeyboardUtils.m58182a(this.f89764a.f89740b);
            }
            C35190af.m79452a(this.f89764a.f89747i);
        }
    }

    /* renamed from: e */
    private final void m78893e() {
        View view = this.f89739a;
        C52711k.m112236a((Object) view, "layout");
        view.setVisibility(0);
        this.f89753s = true;
    }

    /* renamed from: c */
    public final void mo72955c() {
        C34831b bVar;
        if (this.f89753s) {
            bVar = this;
        } else {
            bVar = null;
        }
        C34831b bVar2 = bVar;
        if (bVar2 != null) {
            bVar2.m78893e();
        }
    }

    /* renamed from: b */
    public final void mo72954b() {
        View view = this.f89739a;
        C52711k.m112236a((Object) view, "layout");
        view.setVisibility(8);
        C35142b bVar = this.f89754t;
        if (bVar != null) {
            bVar.mo73262c();
        }
        m78891b(false);
    }

    /* renamed from: a */
    public final boolean mo72953a() {
        C35386b bVar = this.f89743e;
        if (bVar != null) {
            return bVar.f90934n;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m78892d() {
        /*
            r6 = this;
            java.util.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact> r0 = r6.f89742d
            if (r0 == 0) goto L_0x000d
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            java.lang.String.valueOf(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r6.f89749o
            java.util.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = r6.f89742d
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0024
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r1 = 0
            goto L_0x0025
        L_0x0024:
            r1 = 1
        L_0x0025:
            if (r1 != 0) goto L_0x0069
            java.util.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = r6.f89742d
            if (r1 != 0) goto L_0x002e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x002e:
            int r1 = r1.size()
            if (r1 > r3) goto L_0x0035
            goto L_0x0069
        L_0x0035:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r6.f89749o
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2132548804(0x7f1c1cc4, float:2.0750893E38)
            java.lang.String r4 = r4.getString(r5)
            r1.append(r4)
            r4 = 40
            r1.append(r4)
            java.util.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact> r4 = r6.f89742d
            if (r4 != 0) goto L_0x0056
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0056:
            int r4 = r4.size()
            r1.append(r4)
            r4 = 41
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x0074
        L_0x0069:
            android.app.Activity r1 = r6.f89744f
            r4 = 2132545527(0x7f1c0ff7, float:2.0744246E38)
            java.lang.String r1 = r1.getString(r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x0074:
            r0.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r6.f89749o
            java.util.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = r6.f89742d
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0085
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r2 = 1
        L_0x0086:
            if (r2 == 0) goto L_0x008b
            r1 = 1056964608(0x3f000000, float:0.5)
            goto L_0x008d
        L_0x008b:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x008d:
            r0.setAlpha(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.C34831b.m78892d():void");
    }

    /* renamed from: a */
    public final void mo72952a(boolean z) {
        m78892d();
    }

    /* renamed from: a */
    public final void mo72951a(LinkedHashSet<IMContact> linkedHashSet) {
        this.f89742d = linkedHashSet;
        C35117b bVar = this.f89741c;
        if (bVar != null) {
            bVar.mo73233a((Set<IMContact>) linkedHashSet);
        }
        m78892d();
    }

    /* renamed from: a */
    public final void mo72949a(int i) {
        if (this.f89743e != null) {
            C35386b bVar = this.f89743e;
            if (bVar == null) {
                C52711k.m112234a();
            }
            View view = bVar.f90926f;
            C52711k.m112236a((Object) view, "pop!!.bubbleView");
            view.setTranslationY((float) i);
        }
    }

    /* renamed from: b */
    private void m78891b(boolean z) {
        int i;
        LayoutParams layoutParams = this.f89755u.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (z) {
                i = f89735k;
            } else {
                i = 0;
            }
            marginLayoutParams.bottomMargin = i;
            this.f89755u.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a */
    public final void mo72950a(int i, int i2) {
        if (this.f89743e == null) {
            View view = this.f89739a;
            C52711k.m112236a((Object) view, "layout");
            view.setVisibility(0);
            this.f89743e = new C35391a().mo73664b((View) this.f89746h).mo73661a(this.f89739a).mo73660a(2).mo73663b(0).mo73665c(0).mo73666d(i2).mo73662a();
        }
        C35386b bVar = this.f89743e;
        if (bVar != null) {
            bVar.mo73652a();
        }
    }

    public C34831b(Activity activity, C23371a<Boolean> aVar, ViewGroup viewGroup, ViewGroup viewGroup2, SharePackage sharePackage, BaseContent baseContent, LinkedHashSet<IMContact> linkedHashSet, boolean z, MeasureLinearLayout measureLinearLayout) {
        boolean z2;
        C34831b bVar;
        C34831b bVar2;
        Activity activity2 = activity;
        ViewGroup viewGroup3 = viewGroup;
        ViewGroup viewGroup4 = viewGroup2;
        MeasureLinearLayout measureLinearLayout2 = measureLinearLayout;
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(viewGroup3, "parent");
        C52711k.m112240b(viewGroup4, "listView");
        C52711k.m112240b(measureLinearLayout2, "rootContainer");
        this.f89744f = activity2;
        this.f89745g = aVar;
        this.f89746h = viewGroup3;
        this.f89755u = viewGroup4;
        this.f89747i = sharePackage;
        this.f89748j = baseContent;
        this.f89756v = linkedHashSet;
        this.f89758x = measureLinearLayout2;
        this.f89739a = LayoutInflater.from(this.f89744f).inflate(R.layout.bgo, this.f89746h, false);
        View findViewById = this.f89739a.findViewById(R.id.e6r);
        C52711k.m112236a((Object) findViewById, "layout.findViewById(R.id.edit_msg)");
        this.f89740b = (DmtEditText) findViewById;
        View findViewById2 = this.f89739a.findViewById(R.id.f4b);
        C52711k.m112236a((Object) findViewById2, "layout.findViewById(R.id.tv_send)");
        this.f89749o = (DmtTextView) findViewById2;
        View findViewById3 = this.f89739a.findViewById(R.id.ein);
        C52711k.m112236a((Object) findViewById3, "layout.findViewById(R.id.layout_send)");
        this.f89750p = (LinearLayout) findViewById3;
        View findViewById4 = this.f89739a.findViewById(R.id.azj);
        C52711k.m112236a((Object) findViewById4, "layout.findViewById(R.id.iv_cover)");
        this.f89751q = (RemoteImageView) findViewById4;
        View findViewById5 = this.f89739a.findViewById(R.id.eih);
        C52711k.m112236a((Object) findViewById5, "layout.findViewById(R.id.layout_mini_choose_emoji)");
        this.f89752r = (ViewGroup) findViewById5;
        IIMService iIMService = IMService.get();
        if (iIMService != null) {
            iIMService.getAbInterface();
        }
        this.f89740b.setOnTouchListener(new C34833b(this));
        this.f89740b.setFilters(new InputFilter[]{new C33359af(C35197am.m79552a())});
        this.f89749o.setOnClickListener(new C34834c(this));
        this.f89739a.setOnClickListener(C34837d.f89763a);
        View view = this.f89739a;
        C52711k.m112236a((Object) view, "layout");
        view.setEnabled(false);
        Collection collection = this.f89756v;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        ImageView imageView = null;
        if (z2) {
            bVar = this;
        } else {
            bVar = null;
        }
        C34831b bVar3 = bVar;
        if (bVar3 != null) {
            bVar3.mo72954b();
            bVar3.m78891b(false);
        } else {
            C34831b bVar4 = this;
            bVar4.m78893e();
            bVar4.m78891b(true);
        }
        if (!C35405k.m80043a(this.f89751q, this.f89747i)) {
            bVar2 = this;
        } else {
            bVar2 = null;
        }
        if (bVar2 != null) {
            this.f89751q.setVisibility(8);
        }
        if (ImShareSoftAndMiniEmojiExperimentV2.INSTANCE.mo70516b()) {
            C29293i a = C35146a.m79385a(this.f89740b, 500, C11010c.m22280a().getResources().getString(R.string.bho), new C34838e(this));
            View a2 = ImShareSoftAndMiniEmojiExperimentV2.INSTANCE.mo70514a(this.f89744f);
            ViewGroup viewGroup5 = this.f89750p;
            C29304b bVar5 = new C29304b(this.f89752r, a, ImShareSoftAndMiniEmojiExperimentV2.INSTANCE.mo70517c(), a2, ImShareSoftAndMiniEmojiExperimentV2.INSTANCE.mo70515b(this.f89744f), null, 32, null);
            C29305c cVar = new C29305c(bVar5);
            if (a2 != null) {
                imageView = (ImageView) a2.findViewById(R.id.a_s);
            }
            C35142b bVar6 = new C35142b(viewGroup5, cVar, imageView, this.f89758x, this.f89740b, new C35163f(R.drawable.d_k, R.drawable.d_m));
            this.f89754t = bVar6;
        }
    }
}
