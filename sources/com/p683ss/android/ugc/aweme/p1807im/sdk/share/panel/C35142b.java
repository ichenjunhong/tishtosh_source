package com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.keyboard.C26912b;
import com.p683ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29340c;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29340c.C29342a;
import com.p683ss.android.ugc.aweme.emoji.p1684d.C29305c;
import com.p683ss.android.ugc.aweme.emoji.p1685e.C29313b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2;
import com.ss.android.ugc.trill.R;
import p2628d.C52775l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.b */
public final class C35142b implements C26912b {

    /* renamed from: j */
    public static final C35144a f90376j = new C35144a(null);

    /* renamed from: a */
    public final C29313b f90377a;

    /* renamed from: b */
    public C29340c f90378b;

    /* renamed from: c */
    public boolean f90379c;

    /* renamed from: d */
    public final ViewGroup f90380d;

    /* renamed from: e */
    public final C29305c f90381e;

    /* renamed from: f */
    public final ImageView f90382f;

    /* renamed from: g */
    public final MeasureLinearLayout f90383g;

    /* renamed from: h */
    public final DmtEditText f90384h;

    /* renamed from: i */
    public final C35163f f90385i;

    /* renamed from: k */
    private C35164g f90386k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.b$a */
    public static final class C35144a {
        private C35144a() {
        }

        public /* synthetic */ C35144a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: c */
    public final void mo73262c() {
        m79373a(C35164g.INIT_STATE);
    }

    /* renamed from: a */
    public final void mo73259a() {
        if (ImShareSoftAndMiniEmojiExperimentV2.INSTANCE.mo70518d()) {
            this.f90383g.getKeyBoardObservable().mo54865a(this);
        }
    }

    /* renamed from: b */
    public final void mo73261b() {
        if (ImShareSoftAndMiniEmojiExperimentV2.INSTANCE.mo70518d()) {
            this.f90383g.getKeyBoardObservable().mo54867b(this);
        }
    }

    /* renamed from: a */
    private final void m79373a(C35164g gVar) {
        StringBuilder sb = new StringBuilder("setState->targetState:");
        sb.append(gVar);
        C32458a.m75141a(4, "EmojiSwitchPanel", sb.toString());
        this.f90386k = gVar;
        switch (C35147c.f90399f[gVar.ordinal()]) {
            case 1:
                ImageView imageView = this.f90382f;
                if (imageView != null) {
                    imageView.setImageResource(this.f90385i.f90432a);
                }
                C29340c cVar = this.f90378b;
                if (cVar != null) {
                    cVar.mo59231d_(8);
                    break;
                } else {
                    return;
                }
            case 2:
                ImageView imageView2 = this.f90382f;
                if (imageView2 != null) {
                    imageView2.setImageResource(this.f90385i.f90433b);
                }
                if (!this.f90379c) {
                    C29340c cVar2 = this.f90378b;
                    if (cVar2 != null) {
                        cVar2.mo59231d_(0);
                    }
                }
                KeyboardUtils.m58184c(this.f90384h);
                return;
            case 3:
                ImageView imageView3 = this.f90382f;
                if (imageView3 != null) {
                    imageView3.setImageResource(this.f90385i.f90432a);
                }
                if (this.f90379c) {
                    C29340c cVar3 = this.f90378b;
                    if (cVar3 != null) {
                        cVar3.mo59231d_(8);
                    }
                }
                this.f90384h.requestFocus();
                KeyboardUtils.m58183b(this.f90384h);
                break;
        }
    }

    /* renamed from: a */
    public final void mo73260a(C35162e eVar) {
        C35164g gVar;
        C35164g gVar2;
        C35164g gVar3;
        C35164g gVar4;
        StringBuilder sb = new StringBuilder("state:");
        sb.append(this.f90386k);
        sb.append(",action is ");
        sb.append(eVar);
        C32458a.m75141a(4, "EmojiSwitchPanel", sb.toString());
        switch (C35147c.f90398e[eVar.ordinal()]) {
            case 1:
                switch (C35147c.f90394a[this.f90386k.ordinal()]) {
                    case 1:
                        gVar = C35164g.EMOJI_PANEL_STATE;
                        break;
                    case 2:
                        gVar = C35164g.KEYBOARD_STATE;
                        break;
                    case 3:
                        gVar = C35164g.EMOJI_PANEL_STATE;
                        break;
                    default:
                        throw new C52775l();
                }
                m79373a(gVar);
                return;
            case 2:
                switch (C35147c.f90395b[this.f90386k.ordinal()]) {
                    case 1:
                        gVar2 = C35164g.INIT_STATE;
                        break;
                    case 2:
                        gVar2 = C35164g.EMOJI_PANEL_STATE;
                        break;
                    case 3:
                        gVar2 = C35164g.INIT_STATE;
                        break;
                    default:
                        throw new C52775l();
                }
                m79373a(gVar2);
                return;
            case 3:
                switch (C35147c.f90396c[this.f90386k.ordinal()]) {
                    case 1:
                        gVar3 = C35164g.KEYBOARD_STATE;
                        break;
                    case 2:
                        gVar3 = C35164g.KEYBOARD_STATE;
                        break;
                    case 3:
                        gVar3 = C35164g.KEYBOARD_STATE;
                        break;
                    default:
                        throw new C52775l();
                }
                m79373a(gVar3);
                return;
            case 4:
                switch (C35147c.f90397d[this.f90386k.ordinal()]) {
                    case 1:
                        gVar4 = C35164g.INIT_STATE;
                        break;
                    case 2:
                        gVar4 = C35164g.INIT_STATE;
                        break;
                    case 3:
                        gVar4 = C35164g.INIT_STATE;
                        break;
                    default:
                        throw new C52775l();
                }
                m79373a(gVar4);
                break;
        }
    }

    /* renamed from: b */
    public final void mo51856b(boolean z, int i) {
        C35162e eVar;
        if (ImShareSoftAndMiniEmojiExperimentV2.INSTANCE.mo70518d()) {
            this.f90379c = z;
            if (z) {
                eVar = C35162e.KEYBOARD_SHOW_ACTION;
            } else {
                eVar = C35162e.KEYBOARD_HIDE_ACTION;
            }
            mo73260a(eVar);
        }
    }

    public C35142b(ViewGroup viewGroup, C29305c cVar, ImageView imageView, MeasureLinearLayout measureLinearLayout, DmtEditText dmtEditText, C35163f fVar) {
        C52711k.m112240b(viewGroup, "bigEmojiLayoutContainer");
        C52711k.m112240b(cVar, "provider");
        C52711k.m112240b(measureLinearLayout, "rootContainer");
        C52711k.m112240b(dmtEditText, "editText");
        C52711k.m112240b(fVar, "resConfig");
        this.f90380d = viewGroup;
        this.f90381e = cVar;
        this.f90382f = imageView;
        this.f90383g = measureLinearLayout;
        this.f90384h = dmtEditText;
        this.f90385i = fVar;
        C29305c cVar2 = this.f90381e;
        cVar2.mo59252a().mo59227a().setBackgroundColor(C11010c.m22280a().getResources().getColor(R.color.a8w));
        cVar2.f76691b.f76684a.addView(cVar2.mo59252a().mo59227a());
        this.f90377a = cVar2.mo59252a();
        this.f90386k = C35164g.INIT_STATE;
        if (ImShareSoftAndMiniEmojiExperimentV2.INSTANCE.mo70518d()) {
            C29340c b = new C29342a(this.f90381e.f76691b.f76685b, this.f90380d).mo59281a().mo59282b();
            View a = b.mo59227a();
            C52711k.m112236a((Object) a, "view");
            a.setVisibility(8);
            b.mo59227a().setBackgroundColor(Color.parseColor("#FFFFFF"));
            this.f90380d.addView(b.mo59227a());
            this.f90378b = b;
            ImageView imageView2 = this.f90382f;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C35142b f90387a;

                    {
                        this.f90387a = r1;
                    }

                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        Context context = this.f90387a.f90382f.getContext();
                        if (!(context instanceof Activity)) {
                            context = null;
                        }
                        Activity activity = (Activity) context;
                        if (activity != null) {
                            Window window = activity.getWindow();
                            if (window != null) {
                                window.setSoftInputMode(16);
                            }
                        }
                        this.f90387a.mo73260a(C35162e.CLIKE_EMOJI);
                    }
                });
            }
            ImageView imageView3 = this.f90382f;
            if (imageView3 != null) {
                imageView3.setImageResource(this.f90385i.f90432a);
            }
        }
    }

    public /* synthetic */ C35142b(ViewGroup viewGroup, C29305c cVar, ImageView imageView, MeasureLinearLayout measureLinearLayout, DmtEditText dmtEditText, C35163f fVar, int i, C52707g gVar) {
        this(viewGroup, cVar, imageView, measureLinearLayout, dmtEditText, new C35163f(0, 0, 3, null));
    }
}
