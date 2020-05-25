package com.p683ss.android.ugc.aweme.comment.widgets;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25171f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget */
public abstract class BaseCommentWidget extends Widget implements C0199s<C23274a> {

    /* renamed from: a */
    protected Aweme f67261a;

    /* renamed from: h */
    protected C25171f f67262h;

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget$a */
    protected static final class C25429a<T extends View> {

        /* renamed from: a */
        public T f67263a;

        /* renamed from: b */
        public final int f67264b;

        public C25429a(int i) {
            this.f67264b = i;
        }

        /* renamed from: a */
        public final T mo52036a(BaseCommentWidget baseCommentWidget, C52767h<?> hVar) {
            C52711k.m112240b(baseCommentWidget, "thisRef");
            C52711k.m112240b(hVar, "property");
            if (this.f67263a == null) {
                T findViewById = baseCommentWidget.f62237d.findViewById(this.f67264b);
                if (findViewById == null) {
                    C52711k.m112234a();
                }
                this.f67263a = findViewById;
            }
            T t = this.f67263a;
            if (t == null) {
                C52711k.m112237a("_value");
            }
            return t;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo52035j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Aweme mo52029d() {
        Aweme aweme = this.f67261a;
        if (aweme == null) {
            C52711k.m112237a("aweme");
        }
        return aweme;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo52030e() {
        if (this.f67261a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo52031f() {
        if (this.f67262h != null) {
            return true;
        }
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f62238e.mo48225a((C0199s<C23274a>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo52032g() {
        if (!mo52031f()) {
            return "";
        }
        C25171f fVar = this.f67262h;
        if (fVar == null) {
            C52711k.m112237a("params");
        }
        String eventType = fVar.getEventType();
        C52711k.m112236a((Object) eventType, "params.eventType");
        return eventType;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo52033h() {
        if (!mo52031f()) {
            return "";
        }
        C25171f fVar = this.f67262h;
        if (fVar == null) {
            C52711k.m112237a("params");
        }
        String enterFrom = fVar.getEnterFrom();
        C52711k.m112236a((Object) enterFrom, "params.enterFrom");
        return enterFrom;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Integer mo52034i() {
        if (!mo52031f()) {
            return null;
        }
        C25171f fVar = this.f67262h;
        if (fVar == null) {
            C52711k.m112237a("params");
        }
        return Integer.valueOf(fVar.getPageType());
    }

    public void onCreate() {
        super.onCreate();
        mo52035j();
        C0199s sVar = this;
        this.f62238e.mo48227a("comment_visible", sVar, true).mo48227a("comment_aweme_and_params", sVar, true);
    }

    /* renamed from: a */
    protected static <T extends View> C25429a<T> m61852a(int i) {
        return new C25429a<>(i);
    }

    /* renamed from: a */
    protected static void m61853a(View... viewArr) {
        C52711k.m112240b(viewArr, "views");
        for (View visibility : viewArr) {
            visibility.setVisibility(0);
        }
    }

    /* renamed from: b */
    protected static void m61854b(View... viewArr) {
        C52711k.m112240b(viewArr, "views");
        for (View visibility : viewArr) {
            visibility.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void onChanged(C23274a aVar) {
        if (aVar != null) {
            String str = aVar.f62242a;
            int hashCode = str.hashCode();
            if (hashCode != 278836882) {
                if (hashCode == 2016314694 && str.equals("comment_aweme_and_params")) {
                    C52847n nVar = (C52847n) aVar.mo48246a();
                    if (nVar != null) {
                        Aweme aweme = (Aweme) nVar.getFirst();
                        if (aweme != null) {
                            this.f67261a = aweme;
                            C52847n nVar2 = (C52847n) aVar.mo48246a();
                            if (nVar2 != null) {
                                C25171f fVar = (C25171f) nVar2.getSecond();
                                if (fVar != null) {
                                    this.f67262h = fVar;
                                }
                            }
                        }
                    }
                }
            } else if (str.equals("comment_visible")) {
                Boolean bool = (Boolean) aVar.mo48246a();
                if (bool != null) {
                    bool.booleanValue();
                }
            }
        }
    }
}
