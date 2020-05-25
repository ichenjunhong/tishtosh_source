package com.bytedance.android.live.broadcast.p198b;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.model.C5728aq;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.b.m */
final /* synthetic */ class C3080m implements Runnable {

    /* renamed from: a */
    private final C3076j f9017a;

    C3080m(C3076j jVar) {
        this.f9017a = jVar;
    }

    public final void run() {
        int i;
        C3076j jVar = this.f9017a;
        if (jVar.f9008b.getChildCount() != jVar.f9012f.size() && jVar.f9014h) {
            boolean z = true;
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 1) {
                i = (int) ((((float) jVar.f9008b.getWidth()) - C9432q.m18687b(jVar.getContext(), 24.0f)) / 4.0f);
            } else {
                i = (jVar.f9008b.getWidth() - ((int) C9432q.m18687b(jVar.getContext(), 45.0f))) / 4;
            }
            for (int i2 = 0; i2 < jVar.f9012f.size(); i2++) {
                TextView textView = (TextView) LayoutInflater.from(jVar.getActivity()).inflate(((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 1 ? R.layout.ame : R.layout.amd, jVar.f9008b, false);
                C5728aq aqVar = (C5728aq) jVar.f9012f.get(i2);
                textView.setText(aqVar.f15082b);
                textView.setTag(Integer.valueOf(i2));
                textView.setOnClickListener(jVar);
                textView.setWidth(i);
                jVar.f9008b.addView(textView);
                jVar.f9010d.add(textView);
                if (jVar.f9011e == -1 && aqVar.f15081a == jVar.f9007a) {
                    jVar.f9011e = i2;
                    textView.setSelected(true);
                }
            }
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 0) {
                View view = jVar.f9009c;
                if (jVar.f9011e == -1) {
                    z = false;
                }
                view.setEnabled(z);
            }
        }
    }
}
