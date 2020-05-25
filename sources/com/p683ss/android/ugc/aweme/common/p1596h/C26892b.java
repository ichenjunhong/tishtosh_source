package com.p683ss.android.ugc.aweme.common.p1596h;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.view.View;
import com.bytedance.common.utility.p522b.C9379e;
import com.bytedance.ies.uikit.base.C11087e;
import java.util.Iterator;
import org.greenrobot.eventbus.C53755c;

/* renamed from: com.ss.android.ugc.aweme.common.h.b */
public class C26892b extends C0649f {

    /* renamed from: a */
    private C9379e<C11087e> f70745a = new C9379e<>();

    /* renamed from: w */
    public boolean f70746w;

    /* renamed from: x */
    protected boolean f70747x;

    /* renamed from: y */
    public boolean f70748y;

    /* renamed from: j */
    public boolean mo54846j() {
        return this.f70747x;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f70747x = false;
        C53755c.m114319a();
    }

    public void onPause() {
        super.onPause();
        if (!this.f70745a.mo17007b()) {
            Iterator it = this.f70745a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f70747x = false;
        this.f70748y = true;
        if (!this.f70745a.mo17007b()) {
            Iterator it = this.f70745a.iterator();
            while (it.hasNext()) {
                C11087e eVar = (C11087e) it.next();
                if (eVar != null) {
                    eVar.bi_();
                }
            }
            this.f70745a.mo17004a();
        }
    }

    public void onResume() {
        super.onResume();
        this.f70746w = true;
        if (!this.f70745a.mo17007b()) {
            Iterator it = this.f70745a.iterator();
            while (it.hasNext()) {
                C11087e eVar = (C11087e) it.next();
                if (eVar != null) {
                    eVar.mo20108a();
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        this.f70746w = false;
        if (!this.f70745a.mo17007b()) {
            Iterator it = this.f70745a.iterator();
            while (it.hasNext()) {
                C11087e eVar = (C11087e) it.next();
                if (eVar != null) {
                    eVar.bj_();
                }
            }
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C53755c.m114319a().mo112958b((Object) this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f70746w = false;
        this.f70747x = false;
        this.f70748y = false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (getFragmentManager() != null && isAdded()) {
            try {
                dismiss();
            } catch (IllegalStateException unused) {
                dismissAllowingStateLoss();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f70747x = true;
    }
}
