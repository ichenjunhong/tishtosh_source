package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.android.livesdk.chatroom.model.C5711ad;
import com.bytedance.android.livesdk.chatroom.presenter.C5789al;
import com.bytedance.android.livesdk.chatroom.presenter.C5789al.C5790a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dh */
public final class C6086dh extends C6736d implements OnClickListener, C5790a {

    /* renamed from: a */
    C5789al f16304a;

    /* renamed from: b */
    C6089b f16305b;

    /* renamed from: c */
    String f16306c = "";

    /* renamed from: d */
    String f16307d = "";

    /* renamed from: e */
    String f16308e = "";

    /* renamed from: f */
    C6088a f16309f = C6088a.Part;

    /* renamed from: g */
    private boolean f16310g;

    /* renamed from: h */
    private ImageView f16311h;

    /* renamed from: i */
    private ImageView f16312i;

    /* renamed from: k */
    private ImageView f16313k;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dh$a */
    public enum C6088a {
        Null,
        All,
        Part,
        No
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dh$b */
    public interface C6089b {
        /* renamed from: a */
        void mo12078a();

        /* renamed from: a */
        void mo12079a(int i);
    }

    public final void onDetach() {
        this.f16310g = false;
        this.f16305b.mo12078a();
        super.onDetach();
    }

    public final void onAttach(Context context) {
        this.f16310g = true;
        super.onAttach(context);
    }

    /* renamed from: a */
    public final void mo11675a(Throwable th) {
        if (this.f16310g) {
            C4575an.m10987a(getString(R.string.eon));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.yw);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putString("tuid", this.f16307d);
            bundle.putString("roomId", this.f16306c);
        }
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: b */
    private void m13250b(C6088a aVar) {
        switch (aVar) {
            case All:
                m13251c(C6088a.All);
                m13248a(this.f16311h, true);
                return;
            case Part:
                m13251c(C6088a.Part);
                m13248a(this.f16312i, true);
                return;
            case No:
                m13251c(C6088a.No);
                m13248a(this.f16313k, true);
                break;
        }
    }

    /* renamed from: c */
    private void m13251c(C6088a aVar) {
        switch (this.f16309f) {
            case All:
                m13248a(this.f16311h, false);
                this.f16309f = aVar;
                return;
            case Part:
                m13248a(this.f16312i, false);
                this.f16309f = aVar;
                return;
            case No:
                m13248a(this.f16313k, false);
                this.f16309f = aVar;
                break;
        }
    }

    /* renamed from: a */
    public final void mo11674a(C5711ad adVar) {
        if (this.f16310g) {
            switch (adVar.f15011a) {
                case 1:
                    this.f16309f = C6088a.All;
                    break;
                case 2:
                    this.f16309f = C6088a.Part;
                    break;
                case 3:
                    this.f16309f = C6088a.No;
                    break;
            }
            m13250b(this.f16309f);
        }
        this.f16305b.mo12079a(adVar.f15011a);
        dismiss();
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ede) {
            m13249a(C6088a.All);
        } else if (id == R.id.edp) {
            m13249a(C6088a.Part);
        } else if (id == R.id.edn) {
            m13249a(C6088a.No);
        } else {
            if (id == R.id.e4d) {
                dismiss();
            }
        }
    }

    /* renamed from: a */
    private void m13249a(C6088a aVar) {
        if (this.f16309f != aVar) {
            this.f16304a.mo11673a(aVar.ordinal(), this.f16307d);
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", this.f16308e);
            hashMap.put("room_id", this.f16306c);
            String str = "";
            switch (aVar) {
                case All:
                    str = "all";
                    break;
                case Part:
                    str = "personalized";
                    break;
                case No:
                    str = "off";
                    break;
            }
            hashMap.put("enter_from_merge", "message");
            hashMap.put("enter_method", "live_cell");
            hashMap.put("setting_type", str);
            C8049c.m15979a().mo14202a("livesdk_live_notification_choose", hashMap, new C8059j().mo14218f("click").mo14214b(CustomActionPushReceiver.f104061f).mo14213a("notification_setting"));
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        if (bundle != null && bundle.containsKey("uid") && bundle.containsKey("tuid")) {
            this.f16307d = bundle.getString("tuid");
            this.f16306c = bundle.getString("roomId");
        }
    }

    /* renamed from: a */
    private void m13248a(ImageView imageView, boolean z) {
        if (z) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.e3t));
        } else {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.e3u));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.title);
        View findViewById = view.findViewById(R.id.ede);
        View findViewById2 = view.findViewById(R.id.edp);
        View findViewById3 = view.findViewById(R.id.edn);
        this.f16311h = (ImageView) findViewById.findViewById(R.id.ckq);
        this.f16312i = (ImageView) findViewById2.findViewById(R.id.ckq);
        this.f16313k = (ImageView) findViewById3.findViewById(R.id.ckq);
        ImageView imageView = (ImageView) view.findViewById(R.id.e4d);
        TextView textView2 = (TextView) findViewById.findViewById(R.id.edr);
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.edr);
        TextView textView4 = (TextView) findViewById3.findViewById(R.id.edr);
        m13248a(this.f16311h, false);
        m13248a(this.f16312i, false);
        m13248a(this.f16313k, false);
        findViewById2.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        imageView.setOnClickListener(this);
        textView.setText(R.string.h08);
        textView2.setText(R.string.h09);
        textView3.setText(R.string.h0_);
        textView4.setText(R.string.h0a);
        ImageView imageView2 = (ImageView) findViewById.findViewById(R.id.dz5);
        ImageView imageView3 = (ImageView) findViewById2.findViewById(R.id.dz5);
        ImageView imageView4 = (ImageView) findViewById3.findViewById(R.id.dz5);
        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.e3s));
        imageView3.setImageDrawable(getResources().getDrawable(R.drawable.e3x));
        imageView4.setImageDrawable(getResources().getDrawable(R.drawable.e3w));
        m13250b(this.f16309f);
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", "message");
        hashMap.put("enter_method", "live_cell");
        hashMap.put("anchor_id", this.f16308e);
        hashMap.put("room_id", this.f16306c);
        C8049c.m15979a().mo14202a("livesdk_live_notification_show", hashMap, new C8059j().mo14218f("show").mo14214b(CustomActionPushReceiver.f104061f).mo14213a("notification_setting"));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.bw_, viewGroup, false);
    }
}
