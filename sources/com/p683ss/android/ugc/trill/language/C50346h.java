package com.p683ss.android.ugc.trill.language;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.main.C36634ec;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.user.C47549c;
import com.p683ss.android.ugc.aweme.user.C47557d;
import com.p683ss.android.ugc.aweme.views.C48217o;
import com.p683ss.android.ugc.trill.language.api.LanguageApi;
import com.p683ss.android.ugc.trill.settings.ContentLangDialogBoxSettings;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.trill.language.h */
public final class C50346h extends C48217o implements OnClickListener, C50368m {

    /* renamed from: a */
    public C50342g f126255a;

    /* renamed from: b */
    public String f126256b;

    /* renamed from: c */
    public final C36634ec f126257c = new C36634ec();

    /* renamed from: d */
    public final LanguageApi f126258d = ((LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(LanguageApi.class));

    /* renamed from: e */
    public long f126259e;

    /* renamed from: f */
    private ArrayList<String> f126260f = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.trill.language.h$a */
    static final class C50347a implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C50346h f126261a;

        C50347a(C50346h hVar) {
            this.f126261a = hVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            String str;
            C52711k.m112236a((Object) C47549c.m102974a(), "UserManager.inst()");
            if (C47549c.m102978c()) {
                this.f126261a.f126258d.setContentLanguageDialogShown("content_language_already_popup").mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C1674ab<BaseResponse>() {
                    public final void onComplete() {
                    }

                    public final void onError(Throwable th) {
                        C52711k.m112240b(th, "e");
                    }

                    public final void onSubscribe(C1690c cVar) {
                        C52711k.m112240b(cVar, "d");
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        C52711k.m112240b(baseResponse, "t");
                        if (baseResponse.status_code == 0) {
                            IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
                            C52711k.m112236a((Object) baseUserService_Monster, "ServiceManager.get().get…IUserService::class.java)");
                            User currentUser = baseUserService_Monster.getCurrentUser();
                            C52711k.m112236a((Object) currentUser, "ServiceManager.get().get…             .currentUser");
                            currentUser.setContentLanguageDialogShown(true);
                            C47557d.m102995i();
                        }
                    }
                });
            } else {
                this.f126261a.f126257c.mo75724a(true);
            }
            String str2 = "show_content_language_popup";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", this.f126261a.f126256b);
            String str3 = "is_login";
            C52711k.m112236a((Object) C47549c.m102974a(), "UserManager.inst()");
            if (C47549c.m102978c()) {
                str = "1";
            } else {
                str = "0";
            }
            C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.h$b */
    public static final class C50349b implements C1674ab<BaseResponse> {
        C50349b() {
        }

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final /* synthetic */ void onNext(Object obj) {
            C52711k.m112240b((BaseResponse) obj, "t");
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        mo98247a();
    }

    public final void onStart() {
        super.onStart();
        this.f126259e = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo98247a() {
        if (this.f126259e > 0) {
            C26890h.m65011a("popup_duration", C23089d.m56640a().mo47829a("enter_from", this.f126256b).mo47827a("duration", System.currentTimeMillis() - this.f126259e).mo47826a("icon_load", this.f126260f.size()).f61491a);
            this.f126259e = 0;
        }
    }

    /* renamed from: c */
    public final void mo63505c() {
        super.mo63505c();
        this.f121344h = (int) C9432q.m18687b(getContext(), 280.0f);
        double b = (double) C9432q.m18688b(getContext());
        Double.isNaN(b);
        this.f121345i = (int) (b * 0.67d);
    }

    /* renamed from: b */
    private final void m108619b() {
        ArrayList<String> arrayList;
        float f;
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.oo);
        C52711k.m112236a((Object) dmtTextView, "btn_ok");
        C50342g gVar = this.f126255a;
        if (gVar != null) {
            arrayList = gVar.f126244b;
        } else {
            arrayList = null;
        }
        dmtTextView.setEnabled(!C9376b.m18558a((Collection<T>) arrayList));
        DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.oo);
        C52711k.m112236a((Object) dmtTextView2, "btn_ok");
        DmtTextView dmtTextView3 = (DmtTextView) findViewById(R.id.oo);
        C52711k.m112236a((Object) dmtTextView3, "btn_ok");
        if (dmtTextView3.isEnabled()) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        dmtTextView2.setAlpha(f);
    }

    /* renamed from: a */
    public final void mo98248a(String str) {
        C52711k.m112240b(str, "code");
        m108619b();
    }

    /* renamed from: b */
    public final void mo98249b(String str) {
        if (!TextUtils.isEmpty(str) && !C52575l.m112125a((Iterable<? extends T>) this.f126260f, str)) {
            ArrayList<String> arrayList = this.f126260f;
            if (str == null) {
                C52711k.m112234a();
            }
            arrayList.add(str);
        }
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        ArrayList<String> arrayList = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.ni) {
            C26890h.m65011a("choose_content_language_popup", C23089d.m56640a().mo47829a("enter_from", this.f126256b).mo47829a("language_type", "cancel").f61491a);
            dismiss();
            return;
        }
        if (num != null && num.intValue() == R.id.oo) {
            C50342g gVar = this.f126255a;
            if (gVar != null) {
                arrayList = gVar.f126244b;
            }
            if (arrayList == null || C9376b.m18558a((Collection<T>) arrayList)) {
                C26890h.m65011a("click_content_language_popup", C23089d.m56640a().mo47829a("enter_from", this.f126256b).mo47829a("language_type", "ok").mo47829a("click_type", TEVideoRecorder.FACE_BEAUTY_NULL).f61491a);
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (String append : arrayList) {
                sb.append(append);
                if (i != arrayList.size() - 1) {
                    sb.append(",");
                }
                i++;
            }
            C52711k.m112236a((Object) C47549c.m102974a(), "UserManager.inst()");
            if (C47549c.m102978c()) {
                this.f126258d.setContentLanguage("content_language", sb.toString(), 1).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C50349b<Object>());
            } else {
                C36634ec ecVar = this.f126257c;
                String sb2 = sb.toString();
                C52711k.m112236a((Object) sb2, "languageCode.toString()");
                ecVar.mo75723a(sb2);
            }
            C26890h.m65011a("choose_content_language_popup", C23089d.m56640a().mo47829a("enter_from", this.f126256b).mo47829a("language_type", sb.toString()).f61491a);
            dismiss();
        }
    }

    public C50346h(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "enterFrom");
        super(context, (int) R.style.wc, 0, 0);
        this.f126256b = str;
        setContentView(R.layout.jr);
        setCanceledOnTouchOutside(false);
        setOnShowListener(new C50347a(this));
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.title);
        C52711k.m112236a((Object) dmtTextView, "title");
        dmtTextView.setText(ContentLangDialogBoxSettings.getContentLangDialogContent().getTitle());
        DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.a4e);
        C52711k.m112236a((Object) dmtTextView2, "desc");
        dmtTextView2.setText(ContentLangDialogBoxSettings.getContentLangDialogContent().getText());
        OnClickListener onClickListener = this;
        ((DmtTextView) findViewById(R.id.oo)).setOnClickListener(onClickListener);
        m108619b();
        ((ImageView) findViewById(R.id.ni)).setOnClickListener(onClickListener);
        this.f126255a = new C50342g(this.f126256b, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.caf);
        C52711k.m112236a((Object) recyclerView, "recycler_view");
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.caf);
        C52711k.m112236a((Object) recyclerView2, "recycler_view");
        recyclerView2.setAdapter(this.f126255a);
        ((RecyclerView) findViewById(R.id.caf)).mo4798a((C1331h) new C50367l());
    }
}
