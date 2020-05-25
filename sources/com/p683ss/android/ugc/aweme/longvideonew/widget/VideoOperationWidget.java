package com.p683ss.android.ugc.aweme.longvideonew.widget;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25164b.C25165a;
import com.p683ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.p683ss.android.ugc.aweme.feed.C30303h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.longvideo.DiggView;
import com.p683ss.android.ugc.aweme.longvideo.DiggView.C36332a;
import com.p683ss.android.ugc.aweme.longvideo.p1933a.C36349a;
import com.p683ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView;
import com.p683ss.android.ugc.aweme.longvideonew.C36396a;
import com.p683ss.android.ugc.aweme.longvideonew.C36402b;
import com.p683ss.android.ugc.aweme.longvideonew.C36404d.C36405a;
import com.p683ss.android.ugc.aweme.p1382aq.C23256z;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.service.IPoiService;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.GenericWidget;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoOperationWidget */
public final class VideoOperationWidget extends GenericWidget implements C0199s<C23274a>, OnClickListener {

    /* renamed from: a */
    public ViewGroup f93366a;

    /* renamed from: h */
    public C36396a f93367h;

    /* renamed from: i */
    public final Aweme f93368i;

    /* renamed from: j */
    public final String f93369j;

    /* renamed from: k */
    public final int f93370k;

    /* renamed from: l */
    public final String f93371l;

    /* renamed from: m */
    public final C36402b f93372m;

    /* renamed from: n */
    public final C30303h f93373n;

    /* renamed from: o */
    private DiggView f93374o;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoOperationWidget$a */
    public static final class C36442a implements C36332a {

        /* renamed from: a */
        final /* synthetic */ VideoOperationWidget f93375a;

        /* renamed from: a */
        public final void mo75228a() {
            long j;
            C23256z c = new C23256z().mo48189d(this.f93375a.f93369j).mo48191e(this.f93375a.f93369j).mo48185b(this.f93375a.f93370k).mo47954f(this.f93375a.f93368i).mo48187c(1);
            C36402b bVar = this.f93375a.f93372m;
            if (bVar != null) {
                j = bVar.mo75343a();
            } else {
                j = 0;
            }
            c.mo48183a(j).mo48076e();
        }

        C36442a(VideoOperationWidget videoOperationWidget) {
            this.f93375a = videoOperationWidget;
        }
    }

    public final void onCreate() {
        super.onCreate();
        C0199s sVar = this;
        this.f62238e.mo48226a("action_is_landscape_mode", sVar).mo48226a("action_container_on_double_click_digg", sVar);
    }

    public final void onDestroy() {
        super.onDestroy();
        DiggView diggView = this.f93374o;
        if (diggView != null) {
            diggView.onDestroy();
        }
        C36396a aVar = this.f93367h;
        if (aVar != null) {
            C47718bf.m103291d(aVar);
        }
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        String str;
        int i;
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -338693263) {
                if (hashCode == 929573523 && str.equals("action_is_landscape_mode")) {
                    ViewGroup viewGroup = this.f93366a;
                    if (viewGroup != null) {
                        Object a = aVar.mo48246a();
                        C52711k.m112236a(a, "t.getData()");
                        if (((Boolean) a).booleanValue()) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        viewGroup.setVisibility(i);
                    }
                }
            } else if (str.equals("action_container_on_double_click_digg")) {
                DiggView diggView = this.f93374o;
                if (diggView != null) {
                    diggView.mo75223a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo48241a(View view) {
        if (view != null) {
            this.f93366a = (ViewGroup) view;
            TextView textView = null;
            View inflate = LayoutInflater.from(mo48242c()).inflate(R.layout.a9d, null, false);
            if (inflate != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                ViewGroup viewGroup = this.f93366a;
                if (viewGroup != null) {
                    viewGroup.addView(linearLayout);
                }
                View findViewById = linearLayout.findViewById(R.id.b1v);
                C52711k.m112236a((Object) findViewById, "operationView.findViewById(R.id.iv_like)");
                LongVideoDiggAnimationView longVideoDiggAnimationView = (LongVideoDiggAnimationView) findViewById;
                View findViewById2 = ((ViewGroup) mo48242c().findViewById(16908290)).findViewById(R.id.y1);
                C52711k.m112236a((Object) findViewById2, "root.findViewById(R.id.commerce_like_layout)");
                CommerceLikeLayout commerceLikeLayout = (CommerceLikeLayout) findViewById2;
                if (C36405a.m82161a()) {
                    textView = (TextView) linearLayout.findViewById(R.id.d9h);
                    textView.setOnClickListener(this);
                    C52711k.m112236a((Object) textView, "diggCountView");
                    textView.setVisibility(0);
                }
                this.f93374o = new DiggView(longVideoDiggAnimationView, textView, this.f93369j);
                DiggView diggView = this.f93374o;
                if (diggView != null) {
                    Activity c = mo48242c();
                    if (c != null) {
                        diggView.mo75224a((AmeSSActivity) c, this.f93368i, commerceLikeLayout, this.f93369j);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.AmeSSActivity");
                    }
                }
                DiggView diggView2 = this.f93374o;
                if (diggView2 != null) {
                    diggView2.mo75225a((C36332a) new C36442a(this));
                }
                View findViewById3 = linearLayout.findViewById(R.id.azd);
                C52711k.m112236a((Object) findViewById3, "operationView.findViewById(R.id.iv_comment)");
                OnClickListener onClickListener = this;
                ((ImageView) findViewById3).setOnClickListener(onClickListener);
                View findViewById4 = linearLayout.findViewById(R.id.b48);
                C52711k.m112236a((Object) findViewById4, "operationView.findViewById(R.id.iv_share)");
                ((ImageView) findViewById4).setOnClickListener(onClickListener);
                if (C36405a.m82161a()) {
                    View findViewById5 = linearLayout.findViewById(R.id.d8_);
                    C52711k.m112236a((Object) findViewById5, "operationView.findViewById(R.id.tv_comment_count)");
                    TextView textView2 = (TextView) findViewById5;
                    textView2.setOnClickListener(onClickListener);
                    this.f93367h = new C36396a(textView2, this.f93368i);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        C47718bf.m103288a(new C36349a());
        String str = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.azd) {
            C30303h hVar = this.f93373n;
            if (hVar != null) {
                hVar.mo51536a(new C25165a(this.f93368i).mo51333a());
            }
        } else if (num != null && num.intValue() == R.id.b48) {
            C30303h hVar2 = this.f93373n;
            if (hVar2 != null) {
                hVar2.mo60707a(mo48242c(), this.f93368i, null);
            }
            IPoiService createIPoiServicebyMonsterPlugin = PoiServiceImpl.createIPoiServicebyMonsterPlugin();
            Aweme aweme = this.f93368i;
            String str2 = "click_more_button";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", this.f93369j).mo47826a("is_long_item", 1);
            String str3 = "group_id";
            Aweme aweme2 = this.f93368i;
            if (aweme2 != null) {
                str = aweme2.getAid();
            }
            createIPoiServicebyMonsterPlugin.onEventV3IncludingPoiParams(aweme, str2, a.mo47829a(str3, str));
        } else if (num != null && num.intValue() == R.id.d9h) {
            DiggView diggView = this.f93374o;
            if (diggView != null) {
                diggView.onClick(diggView.f92969h);
            }
        } else if (num != null && num.intValue() == R.id.d8_) {
            C30303h hVar3 = this.f93373n;
            if (hVar3 != null) {
                hVar3.mo51536a(new C25165a(this.f93368i).mo51333a());
            }
        }
    }

    public VideoOperationWidget(Aweme aweme, String str, int i, String str2, C36402b bVar, C30303h hVar) {
        C52711k.m112240b(str, "mEventType");
        C52711k.m112240b(str2, "mBusinessType");
        this.f93368i = aweme;
        this.f93369j = str;
        this.f93370k = i;
        this.f93371l = str2;
        this.f93372m = bVar;
        this.f93373n = hVar;
    }
}
