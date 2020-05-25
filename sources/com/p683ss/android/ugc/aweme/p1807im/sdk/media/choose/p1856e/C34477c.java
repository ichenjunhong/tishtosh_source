package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1856e;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C33298c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1853b.C34448a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34463a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1849a.C34407b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.C34518c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.model.C34537a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1858b.C34517a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1859c.C34521b.C34522a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1859c.C34521b.C34523b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.e.c */
public class C34477c extends C33298c<C34409a> {

    /* renamed from: c */
    protected RemoteImageView f88917c;

    /* renamed from: d */
    public View f88918d;

    /* renamed from: e */
    public View f88919e;

    /* renamed from: f */
    public ImageView f88920f;

    /* renamed from: g */
    public DmtTextView f88921g;

    /* renamed from: h */
    public C34409a f88922h;

    /* renamed from: i */
    public boolean f88923i;

    /* renamed from: j */
    public final C0199s<List<C34409a>> f88924j = new C34480c(this);

    /* renamed from: k */
    public final MediaChooseViewModel f88925k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.e.c$a */
    static final class C34478a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34477c f88926a;

        C34478a(C34477c cVar) {
            this.f88926a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C34477c cVar = this.f88926a;
            C34409a aVar = cVar.f88922h;
            if (aVar != null) {
                cVar.f88923i = true;
                boolean a = true ^ cVar.f88925k.mo72508a(aVar);
                cVar.f88925k.mo72507a(aVar, a, new C34481d(a, cVar));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.e.c$b */
    static final class C34479b extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34477c f88927a;

        C34479b(C34477c cVar) {
            this.f88927a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            this.f88927a.mo72504h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.e.c$c */
    static final class C34480c<T> implements C0199s<List<C34409a>> {

        /* renamed from: a */
        final /* synthetic */ C34477c f88928a;

        C34480c(C34477c cVar) {
            this.f88928a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            C34477c cVar = this.f88928a;
            if (this.f88928a.f88923i) {
                cVar = null;
            }
            if (cVar != null) {
                cVar.mo72503g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.e.c$d */
    static final class C34481d extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ boolean f88929a;

        /* renamed from: b */
        final /* synthetic */ C34477c f88930b;

        C34481d(boolean z, C34477c cVar) {
            this.f88929a = z;
            this.f88930b = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (!this.f88929a || intValue > 0) {
                View e = this.f88930b.mo72501e();
                View view = this.f88930b.f88918d;
                if (view == null) {
                    C52711k.m112237a("ivMask");
                }
                View view2 = this.f88930b.f88919e;
                if (view2 == null) {
                    C52711k.m112237a("layoutSelect");
                }
                ImageView imageView = this.f88930b.f88920f;
                if (imageView == null) {
                    C52711k.m112237a("ivSelect");
                }
                DmtTextView dmtTextView = this.f88930b.f88921g;
                if (dmtTextView == null) {
                    C52711k.m112237a("tvSelect");
                }
                C34448a.m78385a(e, view, view2, imageView, dmtTextView, intValue);
            }
            this.f88930b.f88923i = false;
            return C52860x.f131107a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final RemoteImageView mo72501e() {
        RemoteImageView remoteImageView = this.f88917c;
        if (remoteImageView == null) {
            C52711k.m112237a("ivCover");
        }
        return remoteImageView;
    }

    /* renamed from: f */
    public final void mo72502f() {
        FragmentActivity d = mo70630d();
        if (d != null) {
            this.f88925k.mo72510e().observe(d, this.f88924j);
        }
        mo72503g();
    }

    /* renamed from: c */
    public final void mo70629c() {
        View view = this.f88919e;
        if (view == null) {
            C52711k.m112237a("layoutSelect");
        }
        view.setOnClickListener(new C34478a(this));
        RemoteImageView remoteImageView = this.f88917c;
        if (remoteImageView == null) {
            C52711k.m112237a("ivCover");
        }
        C34407b.m78359a(remoteImageView, new C34479b(this));
    }

    /* renamed from: b */
    public void mo70628b() {
        Object a = mo70624a((int) R.id.azj);
        C52711k.m112236a(a, "findViewById(R.id.iv_cover)");
        this.f88917c = (RemoteImageView) a;
        Object a2 = mo70624a((int) R.id.b2a);
        C52711k.m112236a(a2, "findViewById(R.id.iv_mask)");
        this.f88918d = (View) a2;
        Object a3 = mo70624a((int) R.id.eim);
        C52711k.m112236a(a3, "findViewById(R.id.layout_select)");
        this.f88919e = (View) a3;
        Object a4 = mo70624a((int) R.id.b41);
        C52711k.m112236a(a4, "findViewById(R.id.iv_select)");
        this.f88920f = (ImageView) a4;
        Object a5 = mo70624a((int) R.id.f4a);
        C52711k.m112236a(a5, "findViewById(R.id.tv_select)");
        this.f88921g = (DmtTextView) a5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo72504h() {
        List list;
        FragmentActivity d = mo70630d();
        if (d != null) {
            C34537a aVar = new C34537a(1, this.f88925k.f88934c);
            MediaChooseViewModel mediaChooseViewModel = this.f88925k;
            C34463a aVar2 = (C34463a) mediaChooseViewModel.mo72511f().getValue();
            if (aVar2 != null) {
                list = aVar2.mo72477c();
            } else {
                list = null;
            }
            Activity activity = d;
            C34517a cVar = new C34518c(list, this.f88922h, (List) mediaChooseViewModel.mo72510e().getValue());
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(aVar, "settings");
            C52711k.m112240b(cVar, "provider");
            C52670a bVar = new C34523b(cVar, activity, aVar, 2002);
            C34409a a = cVar.mo72529a();
            if (a != null) {
                a.accurateSize(false, new C34522a(bVar));
            } else {
                bVar.invoke();
            }
        }
    }

    /* renamed from: g */
    public final void mo72503g() {
        C34409a aVar = this.f88922h;
        if (aVar != null) {
            int i = -1;
            if (this.f88925k.mo72509b(aVar) < 0) {
                RemoteImageView remoteImageView = this.f88917c;
                if (remoteImageView == null) {
                    C52711k.m112237a("ivCover");
                }
                View view = remoteImageView;
                View view2 = this.f88918d;
                if (view2 == null) {
                    C52711k.m112237a("ivMask");
                }
                ImageView imageView = this.f88920f;
                if (imageView == null) {
                    C52711k.m112237a("ivSelect");
                }
                DmtTextView dmtTextView = this.f88921g;
                if (dmtTextView == null) {
                    C52711k.m112237a("tvSelect");
                }
                C34448a.m78386a(view, view2, imageView, dmtTextView, -1);
                View view3 = this.f88918d;
                if (view3 == null) {
                    C52711k.m112237a("ivMask");
                }
                view3.setBackgroundResource(R.color.a2o);
                View view4 = this.f88918d;
                if (view4 == null) {
                    C52711k.m112237a("ivMask");
                }
                view4.setAlpha(1.0f);
                View view5 = this.f88918d;
                if (view5 == null) {
                    C52711k.m112237a("ivMask");
                }
                view5.setVisibility(0);
                return;
            }
            List list = (List) this.f88925k.mo72510e().getValue();
            if (list == null) {
                list = new ArrayList();
            }
            C52711k.m112236a((Object) list, "viewModel.selectedMediaL….value ?: mutableListOf()");
            if (!list.contains(aVar)) {
                list = null;
            }
            if (list != null) {
                i = list.indexOf(aVar) + 1;
            }
            RemoteImageView remoteImageView2 = this.f88917c;
            if (remoteImageView2 == null) {
                C52711k.m112237a("ivCover");
            }
            View view6 = remoteImageView2;
            View view7 = this.f88918d;
            if (view7 == null) {
                C52711k.m112237a("ivMask");
            }
            ImageView imageView2 = this.f88920f;
            if (imageView2 == null) {
                C52711k.m112237a("ivSelect");
            }
            DmtTextView dmtTextView2 = this.f88921g;
            if (dmtTextView2 == null) {
                C52711k.m112237a("tvSelect");
            }
            C34448a.m78386a(view6, view7, imageView2, dmtTextView2, i);
        }
    }

    public C34477c(View view, MediaChooseViewModel mediaChooseViewModel) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(mediaChooseViewModel, "viewModel");
        super(view);
        this.f88925k = mediaChooseViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r2.getHeight() != r4) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo72500a(com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a r2, int r3, int r4) {
        /*
            r1 = this;
            java.lang.String r0 = "data"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            r1.f88922h = r2
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r1.f88917c
            if (r2 != 0) goto L_0x0010
            java.lang.String r0 = "ivCover"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0010:
            int r2 = r2.getWidth()
            if (r2 != r3) goto L_0x0025
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r1.f88917c
            if (r2 != 0) goto L_0x001f
            java.lang.String r0 = "ivCover"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x001f:
            int r2 = r2.getHeight()
            if (r2 == r4) goto L_0x004e
        L_0x0025:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r1.f88917c
            if (r2 != 0) goto L_0x002e
            java.lang.String r0 = "ivCover"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x002e:
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            r2.width = r3
            r2.height = r4
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r1.f88917c
            if (r3 != 0) goto L_0x003f
            java.lang.String r4 = "ivCover"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x003f:
            r3.setLayoutParams(r2)
            android.view.View r3 = r1.f88918d
            if (r3 != 0) goto L_0x004b
            java.lang.String r4 = "ivMask"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x004b:
            r3.setLayoutParams(r2)
        L_0x004e:
            r1.mo72503g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1856e.C34477c.mo72500a(com.ss.android.ugc.aweme.im.sdk.media.b.a, int, int):void");
    }
}
