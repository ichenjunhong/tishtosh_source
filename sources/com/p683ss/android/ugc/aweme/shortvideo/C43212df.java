package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.share.C41990b;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44371e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.df */
public class C43212df extends Fragment implements OnClickListener, C44334o<CreateAwemeResponse> {

    /* renamed from: a */
    protected CircularProgressView f109277a;

    /* renamed from: b */
    protected TextView f109278b;

    /* renamed from: c */
    public C44371e f109279c;

    /* renamed from: d */
    private int f109280d;

    /* renamed from: e */
    private boolean f109281e;

    /* renamed from: f */
    private View f109282f;

    /* renamed from: g */
    private MainActivity f109283g;

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void onSynthetiseSuccess(String str) {
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: b */
    public final void mo87846b() {
        getFragmentManager().mo2225a().mo2193b(this).mo2195c();
    }

    public void dismiss() {
        getFragmentManager().mo2225a().mo2177a((Fragment) this).mo2189b();
    }

    /* renamed from: c */
    private void m94813c() {
        if (getFragmentManager() != null) {
            getFragmentManager().mo2225a().mo2177a((Fragment) this).mo2195c();
        }
    }

    /* renamed from: a */
    public final void mo87845a() {
        getFragmentManager().mo2225a().mo2173a((int) R.anim.bp, (int) R.anim.bt).mo2196c(this).mo2195c();
    }

    public void onDestroy() {
        if (getActivity() != null) {
            C42245a.m92680a((Context) getActivity()).mo86207a(false);
        }
        m94813c();
        super.onDestroy();
    }

    public void onError(C43856fy fyVar) {
        this.f109281e = false;
        m94813c();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainActivity) {
            this.f109283g = (MainActivity) context;
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            C42245a.m92680a((Context) getActivity()).mo86207a(true);
        }
    }

    /* renamed from: a */
    private void m94812a(int i) {
        if (this.f109277a != null) {
            this.f109277a.setProgress((float) i);
            TextView textView = this.f109278b;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("%");
            textView.setText(sb.toString());
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f109283g != null && this.f109279c != null) {
            C26890h.m65011a("click_publishing_toast", new C23089d().mo47829a("creation_id", this.f109279c.mo80722d()).mo47826a("video_type", this.f109279c.mo80719b()).mo47829a("enter_from", this.f109283g.getEnterFrom()).f61491a);
        }
    }

    public void onProgressUpdate(int i, boolean z) {
        this.f109280d = i;
        m94812a(i);
        if (z && !this.f109281e) {
            this.f109281e = true;
            if (getContext() != null) {
                PoiServiceImpl.createIPoiServicebyMonsterPlugin().showPoiRateUploadVideoSuccessDialog(getContext());
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f109277a = (CircularProgressView) view.findViewById(R.id.b25);
        this.f109277a.setIndeterminate(false);
        this.f109278b = (TextView) view.findViewById(R.id.c62);
        this.f109282f = view.findViewById(R.id.cfc);
        this.f109282f.setOnClickListener(this);
        if (getActivity() != null) {
            C42245a.m92680a((Context) getActivity()).mo86207a(true);
        }
        m94812a(this.f109280d);
        if (this.f109283g != null && this.f109279c != null) {
            C26890h.m65011a("publishing_toast_show", new C23089d().mo47829a("creation_id", this.f109279c.mo80722d()).mo47826a("video_type", this.f109279c.mo80719b()).mo47829a("enter_from", this.f109283g.getEnterFrom()).f61491a);
        }
    }

    public /* synthetic */ void onSuccess(C42421al alVar, boolean z) {
        CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) alVar;
        this.f109281e = false;
        C41990b bVar = new C41990b();
        Aweme aweme = createAwemeResponse.aweme;
        if (!((Boolean) SharePrefCache.inst().getIsAwemePrivate().mo47782d()).booleanValue()) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                if (((Boolean) SharePrefCache.inst().getAutoSendTwitter().mo47782d()).booleanValue()) {
                    arrayList.add(Integer.valueOf(2));
                    jSONArray.put("twitter");
                }
                jSONObject.put("platform", jSONArray);
            } catch (JSONException unused) {
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((Integer) it.next());
                sb.append(",");
            }
            if (arrayList.size() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            C26890h.onEvent(MobClick.obtain().setJsonObject(jSONObject).setEventName("sync_video").setLabelName("edit_page"));
            if (!TextUtils.isEmpty(sb)) {
                bVar.f106282a.mo44934a_(sb.toString(), aweme.getShareInfo().getShareUrl(), aweme.getShareInfo().getShareTitle(), SharePrefCache.inst().getFacebookAccessToken().mo47782d(), SharePrefCache.inst().getTwitterAccessToken().mo47782d(), SharePrefCache.inst().getTwitterSecret().mo47782d(), SharePrefCache.inst().getGoogleServerAuthCode().mo47782d(), aweme.getAid(), aweme.getShareInfo().getShareTitle(), "");
            }
            SharePrefCache.inst().getIsAwemePrivate().mo47776a(Boolean.valueOf(false));
        }
        m94813c();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.a26, viewGroup, false);
    }
}
