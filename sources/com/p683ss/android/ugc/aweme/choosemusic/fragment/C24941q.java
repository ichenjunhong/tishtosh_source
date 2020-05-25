package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.content.C0726c;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.arch.C23269c;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24832a;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24857m;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24992m;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.q */
public final class C24941q extends C24908a implements C24832a<MusicModel> {

    /* renamed from: l */
    private C24857m f66030l;

    /* renamed from: m */
    private long f66031m;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50728a(Object obj, int i) {
    }

    /* renamed from: c */
    public final String mo48208c() {
        return "local_music_list_data";
    }

    /* renamed from: d */
    public final String mo48209d() {
        return "local_music_list_status";
    }

    /* renamed from: e */
    public final String mo48210e() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo50875m() {
        return 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final String mo50876n() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo50877o() {
        return R.layout.on;
    }

    /* renamed from: a */
    public final void mo48207a() {
        super.mo48207a();
        this.f66030l = new C24857m(this.f65964e);
        mo50906l();
    }

    /* renamed from: r */
    public final void mo50730r() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* renamed from: q */
    public final void mo50729q() {
        if (this.f66030l != null) {
            this.f66030l.mo50769a(new WeakReference(getActivity()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo50906l() {
        if (getActivity() != null) {
            if (C0726c.m2090a((Context) getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0 || this.f66030l == null) {
                C23361b.m57419a(getActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C24942r(this));
                return;
            }
            this.f66030l.mo50769a(new WeakReference(getActivity()));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f66031m = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static Fragment m60632a(int i) {
        C24941q qVar = new C24941q();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        qVar.setArguments(bundle);
        return qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C23269c mo50872b(View view) {
        C24992m mVar = new C24992m(getContext(), view, this, R.string.chf, null, null, this.f65966k);
        mVar.f66168h = this.f66031m;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.vm, null);
        ((DmtTextView) inflate.findViewById(R.id.bi3)).setText(R.string.cel);
        mVar.mStatusView.setBuilder(mVar.mStatusView.mo19207c().mo19231b(inflate));
        mVar.mo50981a((int) R.string.cel);
        mVar.mo50983a((C24833b) this);
        mVar.mo50982a(new C24803a("change_music_page_detail", "local_music", "click_button", C24963c.m60726b()));
        mVar.mStatusView.mo19209d();
        mVar.mo50933e();
        return mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50871a(String str, MusicModel musicModel, String str2, Activity activity) {
        String str3;
        String str4;
        Intent intent = new Intent();
        intent.putExtra(LeakCanaryFileProvider.f132050j, str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        String str5 = "local_music_name";
        if (musicModel == null) {
            str3 = "";
        } else {
            str3 = musicModel.getName();
        }
        intent.putExtra(str5, str3);
        String str6 = "local_music_path";
        if (musicModel == null) {
            str4 = "";
        } else {
            str4 = musicModel.getLocalPath();
        }
        intent.putExtra(str6, str4);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
