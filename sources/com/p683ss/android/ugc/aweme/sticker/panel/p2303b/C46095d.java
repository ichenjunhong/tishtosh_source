package com.p683ss.android.ugc.aweme.sticker.panel.p2303b;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39637s;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46057f;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.C46312b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.p683ss.android.ugc.tools.view.p2513f.C50237c;
import com.p683ss.android.ugc.tools.view.widget.AVTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.d */
public final class C46095d {

    /* renamed from: c */
    public static final C46096a f116329c = new C46096a(null);

    /* renamed from: a */
    public AVTextView f116330a;

    /* renamed from: b */
    public final C46312b f116331b;

    /* renamed from: d */
    private SimpleDraweeView f116332d;

    /* renamed from: e */
    private final LinearLayout f116333e;

    /* renamed from: f */
    private final String f116334f;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.d$a */
    public static final class C46096a {
        private C46096a() {
        }

        public /* synthetic */ C46096a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.d$b */
    static final class C46097b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46095d f116335a;

        /* renamed from: b */
        final /* synthetic */ FaceStickerBean f116336b;

        C46097b(C46095d dVar, FaceStickerBean faceStickerBean) {
            this.f116335a = dVar;
            this.f116336b = faceStickerBean;
        }

        public final void onClick(View view) {
            Context context;
            String str;
            Context context2;
            String str2;
            ClickInstrumentation.onClick(view);
            this.f116335a.f116331b.mo93041b(String.valueOf(this.f116336b.getStickerId()), "prop_panel");
            C39637s v = C39629l.m88232a().mo58591v();
            AVTextView aVTextView = this.f116335a.f116330a;
            if (aVTextView != null) {
                context = aVTextView.getContext();
            } else {
                context = null;
            }
            FaceStickerCommerceBean faceStickerCommerceBean = this.f116336b.getFaceStickerCommerceBean();
            if (faceStickerCommerceBean != null) {
                str = faceStickerCommerceBean.f116236b;
            } else {
                str = null;
            }
            if (!v.mo74194a(context, str, false)) {
                C39637s v2 = C39629l.m88232a().mo58591v();
                AVTextView aVTextView2 = this.f116335a.f116330a;
                if (aVTextView2 != null) {
                    context2 = aVTextView2.getContext();
                } else {
                    context2 = null;
                }
                FaceStickerCommerceBean faceStickerCommerceBean2 = this.f116336b.getFaceStickerCommerceBean();
                if (faceStickerCommerceBean2 != null) {
                    str2 = faceStickerCommerceBean2.f116235a;
                } else {
                    str2 = null;
                }
                String str3 = "commerce_sticker_tag";
                if (!TextUtils.isEmpty(str2)) {
                    str2 = Uri.parse(str2).buildUpon().appendQueryParameter("commerce_enter_from", str3).build().toString();
                }
                v2.mo74193a(context2, str2, (String) null);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo92790a(Effect effect) {
        String str;
        FaceStickerBean a = C46057f.m100055a(effect);
        C52711k.m112236a((Object) a, "StickerConfig.covert(effect)");
        if (effect != null && effect.isBusiness()) {
            FaceStickerCommerceBean faceStickerCommerceBean = a.getFaceStickerCommerceBean();
            if (faceStickerCommerceBean != null && 1 == faceStickerCommerceBean.f116238d) {
                this.f116331b.mo93040a(String.valueOf(a.getStickerId()), "prop_panel");
                this.f116333e.setVisibility(0);
                SimpleDraweeView simpleDraweeView = this.f116332d;
                UrlModel iconUrl = a.getIconUrl();
                C52711k.m112236a((Object) iconUrl, "bean.iconUrl");
                C50181a.m108292a(simpleDraweeView, (String) iconUrl.getUrlList().get(0));
                AVTextView aVTextView = this.f116330a;
                if (aVTextView != null) {
                    FaceStickerCommerceBean faceStickerCommerceBean2 = a.getFaceStickerCommerceBean();
                    if (faceStickerCommerceBean2 != null) {
                        str = faceStickerCommerceBean2.f116237c;
                    } else {
                        str = null;
                    }
                    aVTextView.setText(str);
                }
                AVTextView aVTextView2 = this.f116330a;
                if (aVTextView2 != null) {
                    TextView textView = aVTextView2;
                    String str2 = this.f116334f;
                    C52711k.m112240b(textView, "$this$updateFontType");
                    C52711k.m112240b(str2, "fontName");
                    Typeface a2 = C50237c.m108425a(str2);
                    if (a2 != null) {
                        textView.setTypeface(a2);
                    }
                }
                this.f116333e.setOnClickListener(new C46097b(this, a));
                return true;
            }
        }
        this.f116333e.setVisibility(8);
        return false;
    }

    public C46095d(LinearLayout linearLayout, C46312b bVar, String str) {
        C52711k.m112240b(linearLayout, "commerceStickerGoodsLayout");
        C52711k.m112240b(bVar, "mobHelper");
        C52711k.m112240b(str, "fontType");
        this.f116333e = linearLayout;
        this.f116331b = bVar;
        this.f116334f = str;
        LinearLayout linearLayout2 = this.f116333e;
        this.f116332d = (SimpleDraweeView) linearLayout2.findViewById(R.id.ya);
        this.f116330a = (AVTextView) linearLayout2.findViewById(R.id.yc);
    }
}
