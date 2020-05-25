package com.p683ss.android.ugc.tools.view.p2512e;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.tools.view.widget.CircularProgressView;
import com.ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.tools.view.e.b */
public final class C50233b extends ProgressDialog implements OnKeyListener {

    /* renamed from: a */
    public boolean f125837a = true;

    /* renamed from: b */
    private boolean f125838b;

    /* renamed from: c */
    private CharSequence f125839c;

    /* renamed from: d */
    private Drawable f125840d;

    /* renamed from: e */
    private String f125841e;

    /* renamed from: f */
    private long f125842f;

    /* renamed from: g */
    private Handler f125843g = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98012a() {
        CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.b25);
        if (circularProgressView != null) {
            circularProgressView.mo98127b();
        }
        super.dismiss();
    }

    public final void dismiss() {
        C50234c cVar = new C50234c(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            cVar.run();
        } else {
            this.f125843g.post(cVar);
        }
    }

    public final void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.f125838b) {
            CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.b25);
            if (circularProgressView != null) {
                circularProgressView.setIndeterminate(z);
            }
            TextView textView = (TextView) findViewById(R.id.c62);
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
    }

    public final void setMessage(CharSequence charSequence) {
        int i;
        super.setMessage(charSequence);
        if (this.f125838b) {
            TextView textView = (TextView) findViewById(R.id.bld);
            if (textView != null) {
                textView.setText(charSequence);
                if (TextUtils.isEmpty(charSequence)) {
                    i = 8;
                } else {
                    i = 0;
                }
                textView.setVisibility(i);
            }
        }
        this.f125839c = charSequence;
    }

    public final void setProgress(int i) {
        super.setProgress(i);
        TextView textView = (TextView) findViewById(R.id.c62);
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("%");
            textView.setText(sb.toString());
        }
        CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.b25);
        if (circularProgressView != null) {
            circularProgressView.setProgress((float) i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bva);
        this.f125838b = true;
        setMessage(this.f125839c);
        setIndeterminate(false);
        String str = this.f125841e;
        if (this.f125838b) {
            TextView textView = (TextView) findViewById(R.id.d0l);
            if (textView != null && !C9431p.m18664a(str)) {
                textView.setText(str);
                C9432q.m18691b((View) textView, 0);
            }
        }
        this.f125841e = str;
        if (this.f125840d != null) {
            Drawable drawable = this.f125840d;
            if (this.f125838b) {
                View findViewById = findViewById(R.id.cfc);
                if (findViewById != null) {
                    findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C0726c.m2091a(getContext(), (int) R.drawable.dyf)}));
                }
            }
            this.f125840d = drawable;
        }
        setOnKeyListener(this);
        this.f125842f = System.currentTimeMillis();
    }

    private C50233b(Context context, int i) {
        super(context, 3);
    }

    /* renamed from: a */
    public static C50233b m108421a(Context context, String str) {
        C50233b bVar = new C50233b(context, 3);
        bVar.setCancelable(false);
        bVar.setIndeterminate(false);
        bVar.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            bVar.show();
        }
        bVar.setMessage(str);
        View findViewById = bVar.findViewById(R.id.c62);
        if (findViewById != null) {
            if (bVar.f125837a) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
        return bVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("time", (currentTimeMillis - this.f125842f) / 1000);
            } catch (JSONException unused) {
            }
            C39629l.m88232a().mo58567E().mo49431a("ug_save_video_click_back", jSONObject);
        }
        return false;
    }
}
