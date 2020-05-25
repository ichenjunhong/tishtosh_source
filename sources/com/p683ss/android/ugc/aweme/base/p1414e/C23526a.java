package com.p683ss.android.ugc.aweme.base.p1414e;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.analysis.C22582c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.common.component.p2417a.C48519a;
import com.p683ss.android.ugc.common.component.p2417a.C48521c;
import org.greenrobot.eventbus.C53755c;

/* renamed from: com.ss.android.ugc.aweme.base.e.a */
public abstract class C23526a extends C48519a implements C22582c {

    /* renamed from: N */
    public boolean f62623N;

    /* renamed from: a */
    private Unbinder f62624a;

    /* renamed from: Y_ */
    public boolean mo45396Y_() {
        return false;
    }

    public Analysis getAnalysis() {
        return null;
    }

    /* renamed from: B */
    public SparseArray<C48521c> mo48685B() {
        return new SparseArray<>();
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f62624a != null) {
            this.f62624a.unbind();
        }
        C53755c a = C53755c.m114319a();
        if (mo45396Y_() && a.mo112958b((Object) this)) {
            a.mo112959c((Object) this);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StringBuilder sb = new StringBuilder("当前页面：");
        sb.append(getClass().getSimpleName());
        C32458a.m75144a(sb.toString());
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f62624a = ButterKnife.bind((Object) this, view);
        super.onViewCreated(view, bundle);
        C53755c a = C53755c.m114319a();
        if (!a.mo112958b((Object) this) && mo45396Y_()) {
            a.mo112955a((Object) this);
        }
    }
}
