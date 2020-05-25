package com.bytedance.android.live.broadcast.p198b;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.model.C3455c;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.ies.p672e.C10753b;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C1673aa;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.b.c */
public final class C3066c extends Dialog implements OnClickListener {

    /* renamed from: b */
    private static final int f8943b = Color.parseColor("#80FFFFFF");

    /* renamed from: c */
    private static final int f8944c = Color.parseColor("#FF2200");

    /* renamed from: a */
    public C3067a f8945a;

    /* renamed from: d */
    private ImageView f8946d;

    /* renamed from: e */
    private TextView f8947e;

    /* renamed from: f */
    private View f8948f;

    /* renamed from: g */
    private ImageView f8949g;

    /* renamed from: h */
    private TextView f8950h;

    /* renamed from: i */
    private View f8951i;

    /* renamed from: j */
    private ImageView f8952j;

    /* renamed from: k */
    private TextView f8953k;

    /* renamed from: l */
    private View f8954l;

    /* renamed from: m */
    private ImageView f8955m;

    /* renamed from: n */
    private TextView f8956n;

    /* renamed from: o */
    private View f8957o;

    /* renamed from: p */
    private boolean f8958p;

    /* renamed from: q */
    private boolean f8959q;

    /* renamed from: r */
    private boolean f8960r;

    /* renamed from: s */
    private C8710m f8961s;

    /* renamed from: t */
    private View f8962t;

    /* renamed from: u */
    private View f8963u;

    /* renamed from: v */
    private View f8964v;

    /* renamed from: w */
    private C3455c f8965w;

    /* renamed from: x */
    private C1690c f8966x;

    /* renamed from: com.bytedance.android.live.broadcast.b.c$a */
    public interface C3067a {
        /* renamed from: a */
        void mo8352a(C8710m mVar);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8552a(this.f8961s);
    }

    public final void onDetachedFromWindow() {
        this.f8945a = null;
        if (this.f8966x != null && !this.f8966x.isDisposed()) {
            this.f8966x.dispose();
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: b */
    private void m8553b(C8710m mVar) {
        int i;
        int i2;
        int i3;
        this.f8961s = mVar;
        View view = this.f8948f;
        int i4 = 8;
        if (this.f8961s == C8710m.VIDEO) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        View view2 = this.f8951i;
        if (this.f8961s == C8710m.AUDIO) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view2.setVisibility(i2);
        View view3 = this.f8954l;
        if (this.f8961s == C8710m.THIRD_PARTY) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view3.setVisibility(i3);
        View view4 = this.f8957o;
        if (this.f8961s == C8710m.SCREEN_RECORD) {
            i4 = 0;
        }
        view4.setVisibility(i4);
        if (this.f8945a != null) {
            this.f8945a.mo8352a(this.f8961s);
        }
    }

    /* renamed from: a */
    private void m8552a(C8710m mVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4 = true;
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 1) {
            m8553b(mVar);
            return;
        }
        this.f8961s = mVar;
        if (this.f8961s == C8710m.VIDEO) {
            z = true;
        } else {
            z = false;
        }
        if (this.f8961s == C8710m.AUDIO) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f8961s == C8710m.THIRD_PARTY) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f8961s != C8710m.SCREEN_RECORD) {
            z4 = false;
        }
        ImageView imageView = this.f8946d;
        if (z) {
            i = R.drawable.bzm;
        } else {
            i = R.drawable.bzk;
        }
        imageView.setImageResource(i);
        TextView textView = this.f8947e;
        if (z) {
            i2 = f8944c;
        } else {
            i2 = f8943b;
        }
        textView.setTextColor(i2);
        ImageView imageView2 = this.f8949g;
        if (z2) {
            i3 = R.drawable.bzd;
        } else {
            i3 = R.drawable.bzb;
        }
        imageView2.setImageResource(i3);
        TextView textView2 = this.f8950h;
        if (z2) {
            i4 = f8944c;
        } else {
            i4 = f8943b;
        }
        textView2.setTextColor(i4);
        ImageView imageView3 = this.f8952j;
        if (z3) {
            i5 = R.drawable.bzj;
        } else {
            i5 = R.drawable.bzh;
        }
        imageView3.setImageResource(i5);
        TextView textView3 = this.f8953k;
        if (z3) {
            i6 = f8944c;
        } else {
            i6 = f8943b;
        }
        textView3.setTextColor(i6);
        TextView textView4 = this.f8956n;
        if (z4) {
            i7 = f8944c;
        } else {
            i7 = f8943b;
        }
        textView4.setTextColor(i7);
        ImageView imageView4 = this.f8955m;
        if (z4) {
            i8 = R.drawable.bzg;
        } else {
            i8 = R.drawable.bze;
        }
        imageView4.setImageResource(i8);
        if (this.f8945a != null) {
            this.f8945a.mo8352a(this.f8961s);
        }
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.doz) {
            m8552a(C8710m.VIDEO);
            dismiss();
        } else if (id == R.id.gr) {
            m8552a(C8710m.AUDIO);
            dismiss();
        } else if (id == R.id.czr) {
            m8552a(C8710m.THIRD_PARTY);
            dismiss();
            HashMap hashMap = new HashMap();
            hashMap.put("event_page", "live_take_page");
            C8049c.m15979a().mo14202a("thirdparty_take_click", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click"));
        } else {
            if (id == R.id.chm) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("event_page", "live_take_page");
                C8049c.m15979a().mo14202a("game_take_click", hashMap2, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click"));
                m8552a(C8710m.SCREEN_RECORD);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        String str;
        String str2;
        super.onCreate(bundle);
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 1) {
            i = R.layout.ahk;
            i2 = 48;
        } else {
            i = R.layout.ahj;
            i2 = 80;
        }
        setContentView(LayoutInflater.from(getContext()).inflate(i, null));
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(i2);
        }
        findViewById(R.id.doz).setOnClickListener(this);
        this.f8946d = (ImageView) findViewById(R.id.dpa);
        this.f8947e = (TextView) findViewById(R.id.dqa);
        this.f8948f = findViewById(R.id.dq5);
        this.f8962t = findViewById(R.id.gr);
        this.f8962t.setOnClickListener(this);
        this.f8949g = (ImageView) findViewById(R.id.gu);
        this.f8950h = (TextView) findViewById(R.id.gw);
        this.f8951i = findViewById(R.id.gv);
        this.f8963u = findViewById(R.id.czr);
        this.f8963u.setOnClickListener(this);
        this.f8952j = (ImageView) findViewById(R.id.czt);
        this.f8953k = (TextView) findViewById(R.id.czv);
        this.f8954l = findViewById(R.id.czu);
        this.f8964v = findViewById(R.id.chm);
        this.f8964v.setOnClickListener(this);
        this.f8955m = (ImageView) findViewById(R.id.chn);
        this.f8956n = (TextView) findViewById(R.id.chp);
        this.f8957o = findViewById(R.id.cho);
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 1) {
            findViewById(R.id.a6c).setOnClickListener(new C3068d(this));
        }
        this.f8965w = new C3455c(this.f8958p, this.f8959q, this.f8960r);
        mo8347a(this.f8965w, false);
        HashMap hashMap = new HashMap();
        String str3 = "thirdparty_button";
        if (this.f8959q) {
            str = "show";
        } else {
            str = "not_show";
        }
        hashMap.put(str3, str);
        String str4 = "game_live_button";
        if (this.f8960r) {
            str2 = "show";
        } else {
            str2 = "not_show";
        }
        hashMap.put(str4, str2);
        C8049c.m15979a().mo14202a("live_take_type_click", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click").mo14213a("live_take_page"));
        this.f8966x = C3395f.m9156f().mo8742c().mo9019b().getBroadcastConfig().mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C3069e<Object>(this), C3070f.f8969a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8347a(C3455c cVar, boolean z) {
        if (!z || !cVar.equals(this.f8965w)) {
            this.f8962t.setVisibility(0);
            this.f8964v.setVisibility(0);
            this.f8963u.setVisibility(0);
            if (z) {
                C10753b.m21794a(getContext(), "ttrlive_sp_live_setting").mo19441a("enable_radio", (Object) Boolean.valueOf(cVar.f9884a)).mo19441a("enable_live_third_party", (Object) Boolean.valueOf(cVar.f9885b)).mo19441a("enable_live_screenshot", (Object) Boolean.valueOf(cVar.f9886c)).mo19443a();
            }
        }
    }
}
