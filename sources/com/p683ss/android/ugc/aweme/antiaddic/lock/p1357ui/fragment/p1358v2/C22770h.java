package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemBase.C10731a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.BaseLockActivity;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.widget.NewSettingItem;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.widget.TimeLockDesc;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22781a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.mobile.p1965a.C37133a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.h */
public class C22770h extends C22753a {

    /* renamed from: e */
    public NewSettingItem f61012e;

    /* renamed from: j */
    private TimeLockDesc f61013j;

    /* renamed from: k */
    private TimeLockDesc f61014k;

    /* renamed from: l */
    private TimeLockDesc f61015l;

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.h$a */
    public static class C22773a {

        /* renamed from: a */
        public static ArrayList<C22773a> f61018a;

        /* renamed from: b */
        public int f61019b;

        static {
            ArrayList<C22773a> arrayList = new ArrayList<>();
            f61018a = arrayList;
            arrayList.add(new C22773a(40));
            f61018a.add(new C22773a(60));
            f61018a.add(new C22773a(90));
            f61018a.add(new C22773a(120));
        }

        public C22773a(int i) {
            this.f61019b = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo47204a() {
        return R.layout.ql;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo47205f() {
        C26890h.m65011a("open_time_lock", C23089d.m56640a().f61491a);
        super.mo47205f();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f61013j = (TimeLockDesc) view.findViewById(R.id.d0b);
        this.f61014k = (TimeLockDesc) view.findViewById(R.id.d0c);
        this.f61015l = (TimeLockDesc) view.findViewById(R.id.d0d);
        this.f61012e = (NewSettingItem) view.findViewById(R.id.axb);
        this.f61012e.mo47233a();
        this.f61012e.setOnSettingItemClickListener(new C10731a() {
            public final void OnSettingItemClick(View view) {
                ((BaseLockActivity) C22770h.this.getActivity()).mo47173a(C37133a.m83365a(TimeLockSelectTimeFragmentV2.class).mo76411a());
            }
        });
        TimeLockOptionViewModel timeLockOptionViewModel = (TimeLockOptionViewModel) C0214z.m440a(getActivity()).mo359a(TimeLockOptionViewModel.class);
        timeLockOptionViewModel.f61036a.observe(this, new C0199s<C22773a>() {
            public final /* synthetic */ void onChanged(Object obj) {
                C22773a aVar = (C22773a) obj;
                C22770h.this.f61012e.setRightTxt(C22770h.this.getString(R.string.dz9, Integer.valueOf(aVar.f61019b)));
            }
        });
        if (timeLockOptionViewModel.f61036a.getValue() == null) {
            timeLockOptionViewModel.f61036a.setValue(new C22773a(60));
        }
        this.f61015l.setText(getString(R.string.hga));
        if (mo47214j()) {
            String str = ((C22781a) mo47213i().getValue()).f61038b.f61040b;
            if (!TextUtils.isEmpty(str)) {
                this.f60984a.setText(getString(R.string.gcu, str));
            } else {
                this.f60984a.setText(getString(R.string.cmy));
            }
            this.f61013j.setText(getString(R.string.cmz));
            this.f61014k.setText(getString(R.string.gcv));
            this.f61015l.setText(getString(R.string.gcw));
        }
    }
}
