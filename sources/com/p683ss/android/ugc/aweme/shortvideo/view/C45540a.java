package com.p683ss.android.ugc.aweme.shortvideo.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a;
import com.ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.a */
public final class C45540a extends AlertDialog implements OnKeyListener {

    /* renamed from: a */
    public boolean f115073a = true;

    /* renamed from: b */
    public boolean f115074b;

    /* renamed from: c */
    public C45544a f115075c;

    /* renamed from: d */
    public TextView f115076d;

    /* renamed from: e */
    public ImageView f115077e;

    /* renamed from: f */
    public View f115078f;

    /* renamed from: g */
    private CharSequence f115079g;

    /* renamed from: h */
    private boolean f115080h;

    /* renamed from: i */
    private int f115081i;

    /* renamed from: j */
    private Drawable f115082j;

    /* renamed from: k */
    private String f115083k;

    /* renamed from: l */
    private long f115084l;

    /* renamed from: m */
    private int f115085m = 100;

    /* renamed from: n */
    private CircularProgressView f115086n;

    /* renamed from: o */
    private TextView f115087o;

    /* renamed from: p */
    private TextView f115088p;

    /* renamed from: q */
    private C42245a f115089q;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.a$a */
    public interface C45544a {
        /* renamed from: a */
        void mo91826a();
    }

    /* renamed from: b */
    private void m99201b() {
        if (this.f115074b) {
            if (this.f115073a) {
                this.f115088p.setVisibility(0);
                return;
            }
            this.f115088p.setVisibility(4);
        }
    }

    public final void dismiss() {
        C45545b bVar = new C45545b(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            bVar.run();
        } else {
            C18842a.m45934b(bVar);
        }
        this.f115089q.mo86211b(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo91813a() {
        if (this.f115086n == null) {
            this.f115086n = (CircularProgressView) findViewById(R.id.b25);
        }
        this.f115086n.mo49173b();
        super.dismiss();
    }

    /* renamed from: b */
    private void m99202b(int i) {
        if (this.f115074b) {
            this.f115086n.setMaxProgress((float) i);
        }
        this.f115085m = i;
    }

    /* renamed from: a */
    private void m99199a(String str) {
        if (this.f115074b && this.f115087o != null && !C9431p.m18664a(str)) {
            this.f115087o.setText(str);
            C9432q.m18691b((View) this.f115087o, 0);
        }
        this.f115083k = str;
    }

    public final void setMessage(CharSequence charSequence) {
        int i;
        if (this.f115074b) {
            this.f115076d.setText(charSequence);
            TextView textView = this.f115076d;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
        this.f115079g = charSequence;
    }

    /* renamed from: a */
    private void m99200a(boolean z) {
        int i;
        if (this.f115074b) {
            this.f115086n.setIndeterminate(z);
            TextView textView = this.f115088p;
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
        this.f115080h = z;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b4c);
        this.f115078f = findViewById(R.id.cfc);
        this.f115076d = (TextView) findViewById(R.id.bld);
        this.f115086n = (CircularProgressView) findViewById(R.id.b25);
        this.f115087o = (TextView) findViewById(R.id.d0l);
        this.f115077e = (ImageView) findViewById(R.id.q8);
        this.f115088p = (TextView) findViewById(R.id.c62);
        this.f115074b = true;
        this.f115089q = C42245a.m92680a(getContext());
        this.f115089q.mo86211b(true);
        setMessage(this.f115079g);
        m99200a(this.f115080h);
        m99202b(this.f115085m);
        mo91814a(this.f115081i);
        m99199a(this.f115083k);
        m99201b();
        if (this.f115082j != null) {
            Drawable drawable = this.f115082j;
            if (this.f115074b) {
                this.f115078f.setBackground(new LayerDrawable(new Drawable[]{drawable, C0726c.m2091a(getContext(), (int) R.drawable.h1)}));
            }
            this.f115082j = drawable;
        }
        setOnKeyListener(this);
        this.f115084l = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo91814a(int i) {
        if (this.f115074b) {
            TextView textView = this.f115088p;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("%");
            textView.setText(sb.toString());
            this.f115086n.setProgress((float) i);
        }
        this.f115081i = i;
    }

    private C45540a(Context context, int i) {
        super(context, i);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("time", (currentTimeMillis - this.f115084l) / 1000);
            } catch (JSONException unused) {
            }
            C23569o.m57779a("ug_save_video_click_back", jSONObject);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo91815a(boolean z, float f, Context context) {
        if (this.f115074b) {
            final ImageView imageView = (ImageView) findViewById(R.id.q8);
            if (imageView != null) {
                imageView.setAlpha(f);
                imageView.setVisibility(0);
                View findViewById = findViewById(R.id.a2w);
                if (findViewById != null) {
                    LayoutParams layoutParams = new LayoutParams(-2, -2);
                    layoutParams.gravity = 1;
                    layoutParams.setMargins(0, 0, 0, (int) C9432q.m18687b(context, 10.0f));
                    findViewById.setLayoutParams(layoutParams);
                }
                imageView.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        imageView.setAlpha(0.5f);
                        if (C45540a.this.f115075c != null) {
                            C45540a.this.f115075c.mo91826a();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static C45540a m99198a(Context context, String str, String str2, int i) {
        C45540a aVar = new C45540a(context, i);
        aVar.setCancelable(false);
        aVar.m99200a(false);
        aVar.m99202b(100);
        aVar.setMessage(str);
        aVar.m99199a(str2);
        aVar.m99201b();
        if ((context instanceof Activity) && ((!(context instanceof AbsActivity) || ((AbsActivity) context).isActive()) && !((Activity) context).isFinishing())) {
            aVar.show();
        }
        return aVar;
    }
}
