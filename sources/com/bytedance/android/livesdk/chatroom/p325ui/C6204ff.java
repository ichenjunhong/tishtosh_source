package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.event.C5207z;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.Quality;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ff */
public final class C6204ff extends Dialog implements OnClickListener {

    /* renamed from: a */
    private final Room f16664a;

    /* renamed from: b */
    private String f16665b;

    /* renamed from: c */
    private List<Button> f16666c = new ArrayList();

    /* renamed from: d */
    private LinearLayout f16667d;

    public final void onClick(View view) {
        if (view.getId() == R.id.n_) {
            HashMap hashMap = new HashMap();
            if (view.getTag(R.id.d5l) != null) {
                m13386a((Button) view, ((Quality) view.getTag(R.id.d5l)).name);
                C4495a.m10823a().mo10301a((Object) new C5207z((String) view.getTag(R.id.d5m), (String) view.getTag(R.id.d5o), (String) view.getTag(R.id.d5n), (Quality) view.getTag(R.id.d5l)));
                hashMap.put("definition", ((Quality) view.getTag(R.id.d5l)).name);
            } else {
                m13386a((Button) view, (String) view.getTag(R.id.d5m));
                C4495a.m10823a().mo10301a((Object) new C5207z((String) view.getTag(R.id.d5m), (String) view.getTag(R.id.d5o), (String) view.getTag(R.id.d5n), null));
                hashMap.put("definition", (String) view.getTag(R.id.d5m));
            }
            C8049c.m15979a().mo14202a("definition_setting", hashMap, Room.class, new C8059j().mo14213a("live_detail").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other"));
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ajh, null);
        setContentView(inflate);
        this.f16667d = (LinearLayout) inflate.findViewById(R.id.bb6);
        if (getWindow() != null) {
            if (getContext().getResources().getConfiguration().orientation == 2) {
                getWindow().setLayout(C3922z.m9899a(376.0f), C3922z.m9899a(104.0f));
                getWindow().setGravity(8388693);
            } else {
                getWindow().setLayout(-1, (int) C9432q.m18687b(getContext(), 80.0f));
                getWindow().setGravity(80);
            }
        }
        if (this.f16664a.isMultiPullDataValid()) {
            for (Quality quality : this.f16664a.getStreamUrl().qualityList) {
                View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.amy, null);
                LayoutParams layoutParams = new LayoutParams(-1, 0);
                layoutParams.weight = 1.0f;
                inflate2.setLayoutParams(layoutParams);
                Button button = (Button) inflate2.findViewById(R.id.n_);
                button.setText(quality.name);
                button.setTag(R.id.d5l, quality);
                button.setOnClickListener(this);
                this.f16666c.add(button);
                this.f16667d.addView(inflate2);
                if (quality.name.equals(this.f16665b)) {
                    m13386a(button, quality.name);
                }
                if (this.f16666c.size() > 5) {
                    break;
                }
            }
            return;
        }
        for (String str : this.f16664a.getStreamUrl().mo15384d()) {
            View inflate3 = LayoutInflater.from(getContext()).inflate(R.layout.amy, null);
            LayoutParams layoutParams2 = new LayoutParams(-1, 0);
            layoutParams2.weight = 1.0f;
            inflate3.setLayoutParams(layoutParams2);
            Button button2 = (Button) inflate3.findViewById(R.id.n_);
            button2.setText(str);
            button2.setTag(R.id.d5m, str);
            button2.setTag(R.id.d5o, this.f16664a.buildPullUrl(str));
            button2.setTag(R.id.d5n, this.f16664a.getSdkParams(str));
            button2.setOnClickListener(this);
            this.f16666c.add(button2);
            this.f16667d.addView(inflate3);
            if (str.equals(this.f16665b)) {
                m13386a(button2, str);
            }
            if (this.f16666c.size() > 5) {
                break;
            }
        }
    }

    public C6204ff(Context context, Room room) {
        super(context, R.style.zh);
        this.f16664a = room;
        if (room.isMultiPullDataValid()) {
            this.f16665b = room.getStreamUrl().mo15385e();
        } else {
            this.f16665b = room.getStreamUrl().f23790r;
        }
    }

    /* renamed from: a */
    private void m13386a(Button button, String str) {
        this.f16665b = str;
        for (Button button2 : this.f16666c) {
            if (C3922z.m9916f()) {
                button2.setBackgroundResource(R.drawable.bj8);
            }
            button2.setTextColor(getContext().getResources().getColor(R.color.aa7));
        }
        if (C3922z.m9916f()) {
            button.setBackgroundResource(R.drawable.bj9);
            button.setTextColor(getContext().getResources().getColor(R.color.aso));
            return;
        }
        button.setTextColor(getContext().getResources().getColor(R.color.ak3));
    }
}
