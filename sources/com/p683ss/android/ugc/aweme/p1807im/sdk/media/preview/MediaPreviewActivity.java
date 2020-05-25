package com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview;

import android.arch.lifecycle.C0176h;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.BaseContainerActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34472c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.model.C34537a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.model.MediaPreviewLifecycleObserver;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1858b.C34517a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1859c.C34521b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.viewmodel.MediaPreviewViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.viewmodel.MediaPreviewViewModel.C34539a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity */
public final class MediaPreviewActivity extends BaseContainerActivity {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88962a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaPreviewActivity.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/im/sdk/media/preview/viewmodel/MediaPreviewViewModel;"))};

    /* renamed from: b */
    public static final C34497a f88963b = new C34497a(null);

    /* renamed from: c */
    private final C52668f f88964c = C52732g.m112285a(new C34498b(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity$a */
    public static final class C34497a {
        private C34497a() {
        }

        public /* synthetic */ C34497a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity$b */
    static final class C34498b extends C52712l implements C52670a<MediaPreviewViewModel> {

        /* renamed from: a */
        final /* synthetic */ MediaPreviewActivity f88965a;

        C34498b(MediaPreviewActivity mediaPreviewActivity) {
            this.f88965a = mediaPreviewActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C34539a.m78480a(this.f88965a);
        }
    }

    /* renamed from: c */
    private final MediaPreviewViewModel m78430c() {
        return (MediaPreviewViewModel) this.f88964c.getValue();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onBackPressed() {
        mo72517a(false);
    }

    /* renamed from: a */
    public final void mo71919a() {
        Serializable serializable;
        Intent intent = getIntent();
        if (intent != null) {
            serializable = intent.getSerializableExtra("extra_preview_settings");
        } else {
            serializable = null;
        }
        if (serializable instanceof C34537a) {
            MediaPreviewViewModel c = m78430c();
            C34537a aVar = (C34537a) serializable;
            C52711k.m112240b(aVar, "<set-?>");
            c.f89038g = aVar;
            m78430c().f88934c = aVar.getSendRaw();
        }
        C34517a aVar2 = C34521b.f88999a;
        C34521b.f88999a = null;
        if (aVar2 != null) {
            m78430c().f89039h = aVar2;
        }
    }

    /* renamed from: b */
    public final Fragment mo71920b() {
        C23526a bVar;
        if (m78430c().f89038g.isChooseMode()) {
            bVar = new C34499a();
        } else {
            bVar = new C34516b();
        }
        C23526a aVar = bVar;
        MediaPreviewViewModel c = m78430c();
        C0176h lifecycle = aVar.getLifecycle();
        C52711k.m112236a((Object) lifecycle, "fragment.lifecycle");
        C52711k.m112240b(lifecycle, "lifecycle");
        lifecycle.mo324a(new MediaPreviewLifecycleObserver(c.mo72559o()));
        return aVar;
    }

    /* renamed from: a */
    public final void mo72517a(boolean z) {
        int i;
        if (m78430c().f89038g.isChooseMode()) {
            Intent intent = new Intent();
            if (z) {
                i = 2012;
            } else {
                i = 2011;
            }
            ArrayList arrayList = new ArrayList();
            List list = (List) m78430c().mo72510e().getValue();
            if (list != null) {
                arrayList.addAll(list);
            }
            if (z && arrayList.isEmpty()) {
                C34409a aVar = (C34409a) m78430c().mo72558n().getValue();
                if (aVar != null) {
                    MediaPreviewViewModel c = m78430c();
                    C52711k.m112236a((Object) aVar, "it");
                    if (c.mo72509b(aVar) == -2) {
                        C10691a.m21542b((Context) this, (int) R.string.gj1).mo19066a();
                        return;
                    }
                    arrayList.add(aVar);
                }
            }
            intent.putExtra("extra_choose_result", new C34472c(m78430c().f88934c, arrayList));
            setResult(i, intent);
        }
        finish();
    }
}
