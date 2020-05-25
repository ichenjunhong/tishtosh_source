package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.model.C5738b;
import com.bytedance.android.livesdk.chatroom.model.C5743c.C5744a;
import com.bytedance.android.livesdk.chatroom.p309e.C5115z;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6422a.C6428f;
import com.bytedance.android.livesdk.i18n.C7676b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.ss.android.ugc.trill.R;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.f */
public final class C6576f extends C6422a<BottomRightBannerWidget> {

    /* renamed from: g */
    public static final C6578b f17910g = new C6578b(null);

    /* renamed from: l */
    private static boolean f17911l;

    /* renamed from: h */
    private final ViewGroup f17912h;

    /* renamed from: i */
    private final HSImageView f17913i = ((HSImageView) this.f17912h.findViewById(R.id.iz));

    /* renamed from: j */
    private final TextView f17914j = ((TextView) this.f17912h.findViewById(R.id.title));

    /* renamed from: k */
    private final TransitionDrawable f17915k;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.f$a */
    static final class C6577a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6576f f17916a;

        C6577a(C6576f fVar) {
            this.f17916a = fVar;
        }

        public final void onClick(View view) {
            String str;
            C8049c a = C8049c.m15979a();
            String str2 = "live_activity_banner_button_click";
            C52847n[] nVarArr = new C52847n[2];
            String str3 = "click_type";
            if (this.f17916a.f17698d) {
                str = "open";
            } else {
                str = "retract";
            }
            nVarArr[0] = C52856t.m112465a(str3, str);
            C8333e user = ((C4282a) C4116c.m10249a(C4282a.class)).user();
            C52711k.m112236a((Object) user, "ServiceManager.getServic…rvice::class.java).user()");
            nVarArr[1] = C52856t.m112465a("user_id", String.valueOf(user.mo14529b()));
            a.mo14202a(str2, C52550ab.m112050a(nVarArr), C8059j.class, Room.class);
            C6576f fVar = this.f17916a;
            if (fVar.f17698d) {
                fVar.mo12580j();
            } else {
                fVar.mo12581k();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.f$b */
    static final class C6578b {
        private C6578b() {
        }

        public /* synthetic */ C6578b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo12572b() {
        this.f17915k.startTransition(300);
        f17911l = false;
    }

    /* renamed from: c */
    public final void mo12573c() {
        this.f17915k.reverseTransition(300);
        f17911l = true;
    }

    /* renamed from: d */
    public final void mo12574d() {
        BottomRightBannerWidget bottomRightBannerWidget = (BottomRightBannerWidget) this.f17696b;
        if (bottomRightBannerWidget != null) {
            bottomRightBannerWidget.f16807g = this;
        }
        if (f17911l) {
            mo12581k();
        } else {
            mo12580j();
        }
    }

    /* renamed from: e */
    public final void mo12575e() {
        TextView textView = this.f17914j;
        C52711k.m112236a((Object) textView, "titleView");
        textView.setText("");
        this.f17913i.setActualImageResource(0);
        this.f17913i.setBackgroundResource(R.drawable.e0k);
    }

    /* renamed from: a */
    public final View mo12568a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parentView");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bxi, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…older, parentView, false)");
        return inflate;
    }

    /* renamed from: a */
    private final void m13941a(int i) {
        HSImageView hSImageView = this.f17913i;
        C52711k.m112236a((Object) hSImageView, "backgroundView");
        Drawable background = hSImageView.getBackground();
        if (background instanceof ShapeDrawable) {
            HSImageView hSImageView2 = this.f17913i;
            C52711k.m112236a((Object) hSImageView2, "backgroundView");
            Drawable background2 = hSImageView2.getBackground();
            if (background2 != null) {
                Paint paint = ((ShapeDrawable) background2).getPaint();
                C52711k.m112236a((Object) paint, "(backgroundView.background as ShapeDrawable).paint");
                paint.setColor(i);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.graphics.drawable.ShapeDrawable");
        } else if (background instanceof GradientDrawable) {
            HSImageView hSImageView3 = this.f17913i;
            C52711k.m112236a((Object) hSImageView3, "backgroundView");
            Drawable background3 = hSImageView3.getBackground();
            if (background3 != null) {
                ((GradientDrawable) background3).setColor(i);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        } else {
            if (background instanceof ColorDrawable) {
                HSImageView hSImageView4 = this.f17913i;
                C52711k.m112236a((Object) hSImageView4, "backgroundView");
                Drawable background4 = hSImageView4.getBackground();
                if (background4 != null) {
                    ((ColorDrawable) background4).setColor(i);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12570a(C5744a aVar) {
        String str;
        Number number;
        String str2;
        C52711k.m112240b(aVar, "info");
        super.mo12570a(aVar);
        C5738b bVar = aVar.f15104d;
        if (bVar != null) {
            C8851g gVar = bVar.f15093a;
            if (gVar != null) {
                TextView textView = this.f17914j;
                C52711k.m112236a((Object) textView, "titleView");
                if (!TextUtils.isEmpty(gVar.f24155a)) {
                    str2 = C7676b.m15696a().mo14036a(gVar.f24155a);
                } else {
                    str2 = null;
                }
                String str3 = gVar.f24156b;
                if (TextUtils.isEmpty(str2)) {
                    str2 = str3;
                }
                textView.setText(C5115z.m11758a(str2, gVar));
            }
        }
        C5738b bVar2 = aVar.f15104d;
        boolean z = false;
        if (bVar2 != null) {
            ImageModel imageModel = bVar2.f15095c;
            if (imageModel != null) {
                C5213c.m11820a(this.f17913i, imageModel);
                m13941a(0);
                if (imageModel != null) {
                    return;
                }
            }
        }
        C6576f fVar = this;
        C5738b bVar3 = aVar.f15104d;
        if (bVar3 != null) {
            str = bVar3.f15094b;
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (!(!z)) {
            str = null;
        }
        try {
            number = Integer.valueOf(Color.parseColor(str));
        } catch (Throwable unused) {
            number = null;
        }
        if (number != null) {
            fVar.m13941a(number.intValue());
        } else {
            fVar.f17913i.setBackgroundResource(R.drawable.e0k);
        }
    }

    public C6576f(ViewGroup viewGroup, C6428f fVar) {
        C52711k.m112240b(viewGroup, "parentView");
        C52711k.m112240b(fVar, "stateChangeListener");
        super(viewGroup, R.id.err, fVar);
        ViewGroup viewGroup2 = (ViewGroup) mo12567a().findViewById(R.id.dyo);
        viewGroup2.setOnClickListener(new C6577a(this));
        this.f17912h = viewGroup2;
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{C3922z.m9911c(R.drawable.e1z), C3922z.m9911c(R.drawable.e20)});
        transitionDrawable.setCrossFadeEnabled(true);
        ((ImageView) this.f17912h.findViewById(R.id.e7w)).setImageDrawable(transitionDrawable);
        transitionDrawable.startTransition(0);
        this.f17915k = transitionDrawable;
    }
}
