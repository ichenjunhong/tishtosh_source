package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3896j;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5529ew;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5529ew.C5533a;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.widget.C8543d;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bp */
public final class C5994bp extends C8543d implements C5533a {

    /* renamed from: a */
    C5529ew f15897a;

    /* renamed from: b */
    Room f15898b;

    /* renamed from: c */
    private TextView f15899c;

    /* renamed from: d */
    private TextView f15900d;

    /* renamed from: e */
    private RecyclerView f15901e;

    /* renamed from: f */
    private View f15902f;

    /* renamed from: h */
    private C8548h f15903h;

    /* renamed from: i */
    private C6000bv f15904i;

    /* renamed from: a */
    public final int mo8344a() {
        return R.layout.aik;
    }

    /* renamed from: b */
    public final void mo11448b() {
        m13090e();
        dismiss();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15897a.f14583j = null;
    }

    /* renamed from: e */
    private void m13090e() {
        if (this.f15903h != null && this.f15903h.isShowing()) {
            this.f15903h.dismiss();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo11991d() {
        if (this.f15903h == null) {
            this.f15903h = new C8552a(getContext(), 2).mo14996a(false).mo15001b();
        }
        if (!this.f15903h.isShowing()) {
            this.f15903h.show();
        }
    }

    /* renamed from: c */
    public final void mo11450c() {
        m13090e();
        this.f15899c.setTextColor(getContext().getResources().getColor(R.color.abm));
        this.f15899c.setText(C3922z.m9903a((int) R.string.gy6));
        this.f15899c.setBackgroundResource(R.drawable.bik);
        this.f15904i.mo11998a(TTLiveSDKContext.getHostService().mo10315h().mo14529b());
        if (this.f15904i.getItemCount() > 0) {
            this.f15902f.setVisibility(8);
            this.f15901e.setVisibility(0);
        } else {
            this.f15902f.setVisibility(0);
            this.f15901e.setVisibility(8);
        }
        this.f15900d.setText(C3896j.m9851a(R.string.gzg, Integer.valueOf(this.f15904i.getItemCount())));
    }

    /* renamed from: a */
    public final void mo11447a(Throwable th) {
        m13090e();
        C4602l.m11047a(getContext(), th, (int) R.string.elm);
    }

    /* renamed from: b */
    public final void mo11449b(Throwable th) {
        m13090e();
        C4602l.m11047a(getContext(), th, (int) R.string.eli);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11990a(View view) {
        if (this.f23427g) {
            int intValue = ((Integer) C4639e.m11122a().f12651b).intValue();
            if (2 == intValue) {
                C8552a aVar = new C8552a(getContext(), 0);
                aVar.mo15012d((int) R.string.gyj).mo15008c((int) R.string.h0i);
                aVar.mo15003b(0, (int) R.string.gyi, (OnClickListener) new C5996br(this)).mo15003b(1, (int) R.string.e45, C5997bs.f15907a).mo15011d();
            } else if (1 == intValue) {
                C8552a aVar2 = new C8552a(getContext(), 0);
                aVar2.mo15012d((int) R.string.h0h).mo15008c((int) R.string.h0i);
                aVar2.mo15003b(0, (int) R.string.e45, (OnClickListener) new C5998bt(this)).mo15003b(1, (int) R.string.h0k, C5999bu.f15909a).mo15011d();
            } else {
                dismiss();
                this.f15897a.mo11437d();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        super.onCreate(bundle);
        this.f15901e = (RecyclerView) findViewById(R.id.caf);
        this.f15901e.mo4798a((C1331h) new C5948aw());
        this.f15901e.setLayoutManager(new SSLinearLayoutManager(getContext(), 0, false));
        this.f15901e.setAdapter(this.f15904i);
        this.f15900d = (TextView) findViewById(R.id.title);
        this.f15900d.setText(C3896j.m9851a(R.string.gzg, Integer.valueOf(this.f15904i.getItemCount())));
        this.f15899c = (TextView) findViewById(R.id.aa);
        int intValue = ((Integer) C4639e.m11122a().f12651b).intValue();
        this.f15904i.mo11999b();
        int i4 = R.string.h0u;
        switch (intValue) {
            case 1:
                i4 = R.string.gy8;
                break;
            case 2:
                i4 = R.string.gyi;
                break;
        }
        this.f15899c.setText(i4);
        TextView textView = this.f15899c;
        if (intValue != 0) {
            i = C3922z.m9909b((int) R.color.akg);
        } else {
            i = C3922z.m9909b((int) R.color.akf);
        }
        textView.setTextColor(i);
        TextView textView2 = this.f15899c;
        if (intValue != 0) {
            i2 = R.drawable.bil;
        } else {
            i2 = R.drawable.bik;
        }
        textView2.setBackgroundResource(i2);
        TextView textView3 = this.f15899c;
        if (intValue != 0) {
            i3 = R.color.b44;
        } else {
            i3 = R.color.aso;
        }
        textView3.setTextColor(C3922z.m9909b(i3));
        this.f15899c.setOnClickListener(new C5995bq(this));
        this.f15902f = findViewById(R.id.aa2);
        if (this.f15904i.getItemCount() > 0) {
            this.f15902f.setVisibility(8);
            this.f15901e.setVisibility(0);
            return;
        }
        this.f15902f.setVisibility(0);
        this.f15901e.setVisibility(8);
    }

    public C5994bp(Context context, Room room, List<C5696e> list, C5529ew ewVar) {
        super(context);
        this.f15898b = room;
        if (list == null) {
            list = new ArrayList<>();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5696e eVar = (C5696e) it.next();
            if (eVar == null || eVar.f14953d == null || 1 == eVar.f14957h) {
                it.remove();
            }
        }
        this.f15904i = new C6000bv(null, list, 1);
        this.f15897a = ewVar;
        this.f15897a.f14583j = this;
    }
}
