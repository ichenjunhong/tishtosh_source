package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.widget.C6640a.C6642a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.widget.C8555i;
import com.bytedance.android.livesdkapi.depend.model.live.C8719s;
import com.bytedance.android.livesdkapi.depend.model.live.C8721u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.g */
public final class C6676g extends C6640a {
    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo12759d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo12758c() {
        return LayoutInflater.from(getContext()).inflate(R.layout.bwb, this, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo12761f() {
        C8555i.m16887a();
        C8555i.m16886a(getContext()).mo15012d((int) R.string.h0o).mo15008c((int) R.string.h0n).mo15003b(0, (int) R.string.h0m, (OnClickListener) new C6678i(this)).mo15003b(1, (int) R.string.e45, C6679j.f18226a).mo15005b(C6680k.f18227a).mo15006b(C6681l.f18228a).mo15011d();
    }

    public final JSONObject getDecorationInfo() {
        if (this.f18127h == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", String.valueOf(this.f18127h.f23947h));
            jSONObject.put(C42311c.f106865i, this.f18127h.f23943d);
            jSONObject.put("type", 3);
            jSONObject.put("x", this.f18127h.f23948i);
            jSONObject.put("y", this.f18127h.f23949j);
            jSONObject.put("w", this.f18132m);
            jSONObject.put("h", this.f18133n);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12757b(View view) {
        C8719s sVar;
        float f;
        ImageView imageView = (ImageView) view.findViewById(R.id.exv);
        TextView textView = (TextView) view.findViewById(R.id.exy);
        if (this.f18127h != null) {
            sVar = this.f18127h.mo15389a();
        } else {
            sVar = null;
        }
        if (sVar != null) {
            textView.setText(sVar.f23929a);
            if (sVar.f23931c != null) {
                C5213c.m11824b(imageView, sVar.f23931c.mo7701a());
            }
            int d = C3922z.m9913d(R.dimen.a21);
            view.measure(MeasureSpec.makeMeasureSpec(d, 1073741824), MeasureSpec.makeMeasureSpec(this.f18133n, DynamicTabYellowPointVersion.DEFAULT));
            int measuredHeight = view.getMeasuredHeight();
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = d;
                layoutParams.height = -2;
                view.setLayoutParams(layoutParams);
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int i = (measuredWidth - d) / 2;
            int i2 = (measuredHeight2 - measuredHeight) / 2;
            if (this.f18127h != null) {
                if (this.f18127h.f23948i != -1 || this.f18127h.f23949j != -1) {
                    float f2 = 1.0f;
                    if (this.f18127h.f23950k > 0) {
                        f = ((float) this.f18132m) / ((float) this.f18127h.f23950k);
                    } else {
                        f = 1.0f;
                    }
                    if (this.f18127h.f23951l > 0) {
                        f2 = ((float) this.f18133n) / ((float) this.f18127h.f23951l);
                    }
                    i = ((int) (((float) this.f18127h.f23948i) * f)) - (d / 2);
                    i2 = ((int) (((float) this.f18127h.f23949j) * f2)) - (measuredHeight / 2);
                } else if (this.f18127h.f23954o != null && this.f18127h.f23954o.size() > 1) {
                    double d2 = (double) measuredWidth;
                    double doubleValue = ((Double) this.f18127h.f23954o.get(0)).doubleValue();
                    Double.isNaN(d2);
                    i = ((int) (d2 * doubleValue)) - (d / 2);
                    double d3 = (double) measuredHeight2;
                    double doubleValue2 = ((Double) this.f18127h.f23954o.get(1)).doubleValue();
                    Double.isNaN(d3);
                    i2 = ((int) (d3 * doubleValue2)) - (measuredHeight / 2);
                }
            }
            if (i < this.f18131l[2]) {
                i = this.f18131l[2];
            } else if (i + d > this.f18131l[3]) {
                i = this.f18131l[3] - d;
            }
            if (i2 < this.f18131l[0]) {
                i2 = this.f18131l[0];
            } else if (i2 + measuredHeight > this.f18131l[1]) {
                i2 = this.f18131l[1] - measuredHeight;
            }
            view.setX((float) i);
            view.setY((float) i2);
            if (this.f18127h != null) {
                this.f18127h.f23948i = i + (d / 2);
                this.f18127h.f23949j = i2 + (measuredHeight / 2);
            }
            if (this.f18128i && this.f18129j != null) {
                this.f18129j.mo12360g();
            }
            if (!this.f18128i) {
                view.setOnClickListener(new C6677h(sVar));
                C8049c.m15979a().mo14203a("livesdk_donation_stick_audience_show", Room.class, C8059j.class);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12805a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        super.mo12761f();
    }

    public C6676g(Context context, C8721u uVar, boolean z, int[] iArr, C6642a aVar) {
        super(context, uVar, z, iArr, aVar);
    }
}
