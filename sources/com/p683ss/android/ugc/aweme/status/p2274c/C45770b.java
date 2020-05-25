package com.p683ss.android.ugc.aweme.status.p2274c;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C43092a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C43092a.C43093a;
import com.p683ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p683ss.android.ugc.aweme.status.p2272a.C45735b;
import com.p683ss.android.ugc.aweme.status.p2272a.C45736c;
import com.p683ss.android.ugc.aweme.status.p2273b.C45739a;
import com.p683ss.android.ugc.tools.utils.C50205i;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.status.c.b */
public final class C45770b extends C1352v implements OnClickListener {

    /* renamed from: j */
    public static final C45772a f115673j = new C45772a(null);

    /* renamed from: a */
    public C43092a f115674a;

    /* renamed from: b */
    public SimpleDraweeView f115675b;

    /* renamed from: c */
    public C45739a f115676c;

    /* renamed from: d */
    public int f115677d = -1;

    /* renamed from: e */
    public final boolean f115678e = (!C23337c.m57398a());

    /* renamed from: f */
    public RecordStatusViewModel f115679f;

    /* renamed from: g */
    public View f115680g;

    /* renamed from: h */
    public FragmentActivity f115681h;

    /* renamed from: i */
    public int f115682i;

    /* renamed from: com.ss.android.ugc.aweme.status.c.b$a */
    public static final class C45772a {
        private C45772a() {
        }

        public /* synthetic */ C45772a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.c.b$b */
    public static final class C45773b extends C45735b {

        /* renamed from: a */
        final /* synthetic */ C45770b f115684a;

        /* renamed from: com.ss.android.ugc.aweme.status.c.b$b$a */
        public static final class C45774a implements C43093a {

            /* renamed from: a */
            final /* synthetic */ C45773b f115685a;

            /* renamed from: a */
            public final void mo87412a() {
                Downloader.getInstance(this.f115685a.f115684a.f115681h).cancel(this.f115685a.f115684a.f115677d);
            }

            C45774a(C45773b bVar) {
                this.f115685a = bVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.status.c.b$b$b */
        static final class C45775b<V> implements Callable<Object> {

            /* renamed from: a */
            final /* synthetic */ C45773b f115686a;

            C45775b(C45773b bVar) {
                this.f115686a = bVar;
            }

            public final /* synthetic */ Object call() {
                C45739a aVar = this.f115686a.f115684a.f115676c;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                File file = new File(aVar.f115619c.getZipPath());
                C45739a aVar2 = this.f115686a.f115684a.f115676c;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                C50205i.m108365a(file, new File(aVar2.f115619c.getUnzipPath()));
                this.f115686a.f115684a.f115679f.mo92160e().postValue(this.f115686a.f115684a.f115676c);
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.status.c.b$b$c */
        static final class C45776c<TTaskResult, TContinuationResult> implements C0011g<Object, Void> {

            /* renamed from: a */
            final /* synthetic */ C45773b f115687a;

            C45776c(C45773b bVar) {
                this.f115687a = bVar;
            }

            public final /* synthetic */ Object then(C0013i iVar) {
                if (this.f115687a.f115684a.f115674a != null) {
                    C43092a aVar = this.f115687a.f115684a.f115674a;
                    if (aVar == null) {
                        C52711k.m112234a();
                    }
                    if (aVar.isShowing()) {
                        C43092a aVar2 = this.f115687a.f115684a.f115674a;
                        if (aVar2 != null) {
                            aVar2.dismiss();
                        }
                        this.f115687a.f115684a.f115674a = null;
                    }
                }
                return null;
            }
        }

        C45773b(C45770b bVar) {
            this.f115684a = bVar;
        }

        public final void onCanceled(DownloadInfo downloadInfo) {
            super.onCanceled(downloadInfo);
            if (this.f115684a.f115674a != null) {
                C43092a aVar = this.f115684a.f115674a;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                if (aVar.isShowing()) {
                    C43092a aVar2 = this.f115684a.f115674a;
                    if (aVar2 != null) {
                        aVar2.dismiss();
                    }
                    this.f115684a.f115674a = null;
                }
            }
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            C0013i.m16a((Callable<TResult>) new C45775b<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C45776c<TResult,TContinuationResult>(this), C0013i.f25b);
            C23569o.m57776a("status_template_download_error_state", 0, (JSONObject) null);
        }

        public final void onProgress(DownloadInfo downloadInfo) {
            super.onProgress(downloadInfo);
            if (this.f115684a.f115674a == null) {
                this.f115684a.f115674a = new C43092a(this.f115684a.f115681h);
                C43092a aVar = this.f115684a.f115674a;
                if (aVar != null) {
                    StringBuilder sb = new StringBuilder("       ");
                    sb.append(this.f115684a.f115681h.getString(R.string.fj));
                    sb.append("       ");
                    aVar.setMessage(sb.toString());
                }
                C43092a aVar2 = this.f115684a.f115674a;
                if (aVar2 != null) {
                    aVar2.mo87485a(0);
                }
                C43092a aVar3 = this.f115684a.f115674a;
                if (aVar3 != null) {
                    aVar3.mo87486a((C43093a) new C45774a(this));
                }
                C43092a aVar4 = this.f115684a.f115674a;
                if (aVar4 != null) {
                    aVar4.show();
                }
            }
            if (downloadInfo != null) {
                C43092a aVar5 = this.f115684a.f115674a;
                if (aVar5 != null) {
                    aVar5.mo87485a(downloadInfo.getDownloadProcess());
                }
            }
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            if (this.f115684a.f115674a != null) {
                C43092a aVar = this.f115684a.f115674a;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                if (aVar.isShowing()) {
                    C43092a aVar2 = this.f115684a.f115674a;
                    if (aVar2 != null) {
                        aVar2.dismiss();
                    }
                    this.f115684a.f115674a = null;
                }
            }
            JSONObject jSONObject = new JSONObject();
            String str = "effectid";
            C45739a aVar3 = this.f115684a.f115676c;
            if (aVar3 == null) {
                C52711k.m112234a();
            }
            jSONObject.put(str, aVar3.f115619c.getEffectId());
            C23569o.m57776a("status_template_download_error_state", 1, jSONObject);
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f115676c != null) {
            Context context = this.f115681h;
            C45739a aVar = this.f115676c;
            if (aVar == null) {
                C52711k.m112234a();
            }
            this.f115677d = C45736c.m99543a(context, aVar, new C45773b(this));
        }
    }

    public C45770b(RecordStatusViewModel recordStatusViewModel, View view, FragmentActivity fragmentActivity, int i) {
        C52711k.m112240b(recordStatusViewModel, "statusViewModel");
        C52711k.m112240b(view, "rootView");
        C52711k.m112240b(fragmentActivity, "context");
        super(view);
        this.f115679f = recordStatusViewModel;
        this.f115680g = view;
        this.f115681h = fragmentActivity;
        this.f115682i = i;
        View findViewById = this.f115680g.findViewById(R.id.ex4);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.id.status_template_iv)");
        this.f115675b = (SimpleDraweeView) findViewById;
        this.f115675b.post(new Runnable(this) {

            /* renamed from: a */
            final /* synthetic */ C45770b f115683a;

            {
                this.f115683a = r1;
            }

            public final void run() {
                LayoutParams layoutParams = this.f115683a.f115675b.getLayoutParams();
                layoutParams.height = (this.f115683a.f115675b.getWidth() * 16) / 9;
                this.f115683a.f115675b.setLayoutParams(layoutParams);
            }
        });
        this.f115680g.setOnClickListener(this);
    }
}
