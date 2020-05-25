package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.model.C5731at;
import com.bytedance.android.livesdk.chatroom.model.C5732au;
import com.bytedance.android.livesdk.chatroom.model.TaskGiftEvent;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p279af.C4604n;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.p522b.C9376b;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.fg */
public final class C6205fg extends Dialog implements OnClickListener {

    /* renamed from: a */
    private View f16668a;

    /* renamed from: b */
    private TextView f16669b;

    /* renamed from: c */
    private View[] f16670c;

    /* renamed from: d */
    private String f16671d = null;

    /* renamed from: e */
    private Room f16672e;

    /* renamed from: f */
    private List<TaskGiftEvent> f16673f;

    public final void onClick(View view) {
        boolean z;
        int id = view.getId();
        int i = 8;
        if (R.id.aou == id) {
            String str = (String) LiveConfigSettingKeys.TASK_GIFT_DESC_URL.mo9431a();
            if (!TextUtils.isEmpty(str)) {
                ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a(getContext(), C4704c.m11227b(str).mo10505a(""));
            } else {
                if (this.f16668a.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                View view2 = this.f16668a;
                if (!z) {
                    i = 0;
                }
                view2.setVisibility(i);
            }
            C8068g.m16014a(getContext());
            return;
        }
        if (R.id.aot == id) {
            if (this.f16668a.getVisibility() == 0) {
                this.f16668a.setVisibility(8);
            }
        } else if (R.id.c89 == id) {
            if (!TextUtils.isEmpty(this.f16671d)) {
                ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a(getContext(), C4704c.m11227b(this.f16671d).mo10505a(getContext().getString(R.string.etr)));
            }
            C8068g.m16014a(getContext());
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        List list;
        int i2;
        int i3;
        boolean z;
        int i4;
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.aji, null));
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(80);
        }
        View findViewById = findViewById(R.id.aou);
        this.f16668a = findViewById(R.id.aot);
        this.f16669b = (TextView) findViewById(R.id.dts);
        TextView textView = (TextView) findViewById(R.id.cnu);
        TextView textView2 = (TextView) findViewById(R.id.cn3);
        TextView textView3 = (TextView) findViewById(R.id.aif);
        TextView textView4 = (TextView) findViewById(R.id.ai4);
        TextView textView5 = (TextView) findViewById(R.id.cms);
        TextView textView6 = (TextView) findViewById(R.id.ai2);
        this.f16670c = new View[6];
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.mq);
        int childCount = viewGroup.getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            if (!(childAt instanceof ImageView)) {
                if (i5 > 5) {
                    break;
                }
                this.f16670c[i5] = childAt;
                i5++;
            }
        }
        findViewById(R.id.c89).setOnClickListener(this);
        findViewById.setOnClickListener(this);
        this.f16668a.setOnClickListener(this);
        TaskGiftEvent taskGiftEvent = (TaskGiftEvent) this.f16673f.get(0);
        if (taskGiftEvent.getType() == 1) {
            List asList = Arrays.asList((C5732au[]) C2942b.m8369a().mo34884a(taskGiftEvent.getData(), C5732au[].class));
            if (!C9376b.m18558a((Collection<T>) asList)) {
                int size = asList.size();
                int i7 = 0;
                while (i7 < size) {
                    C5732au auVar = (C5732au) asList.get(i7);
                    if (auVar == null) {
                        list = asList;
                        i = size;
                    } else {
                        View view = this.f16670c[i7];
                        ImageView imageView = (ImageView) view.findViewById(R.id.mn);
                        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mo);
                        TextView textView7 = (TextView) view.findViewById(R.id.mp);
                        if (auVar.f15086a > 0) {
                            i3 = R.drawable.c0q;
                            list = asList;
                            i = size;
                            i4 = R.string.etv;
                        } else if (auVar.f15087b > 0) {
                            list = asList;
                            i = size;
                            i2 = (int) ((((float) auVar.f15087b) / ((float) auVar.f15088c)) * 100.0f);
                            i4 = R.string.etw;
                            z = true;
                            i3 = R.drawable.c0o;
                            imageView.setImageResource(i3);
                            progressBar.setProgress(i2);
                            textView7.setText(i4);
                            textView7.setEnabled(z);
                        } else {
                            i3 = R.drawable.c0p;
                            list = asList;
                            i = size;
                            i4 = R.string.ety;
                        }
                        z = false;
                        i2 = 0;
                        imageView.setImageResource(i3);
                        progressBar.setProgress(i2);
                        textView7.setText(i4);
                        textView7.setEnabled(z);
                    }
                    i7++;
                    asList = list;
                    size = i;
                }
                this.f16669b.setText(taskGiftEvent.getSubtitle());
            }
        }
        m13387a((TaskGiftEvent) this.f16673f.get(1), 2, R.string.ets, textView, textView2, textView5);
        m13387a((TaskGiftEvent) this.f16673f.get(2), 4, R.string.etp, textView3, textView4, textView6);
    }

    public C6205fg(Context context, Room room, List<TaskGiftEvent> list, String str) {
        super(context, R.style.yl);
        this.f16672e = room;
        this.f16673f = list;
    }

    /* renamed from: a */
    private void m13387a(TaskGiftEvent taskGiftEvent, int i, int i2, TextView textView, TextView textView2, TextView textView3) {
        int i3;
        if (taskGiftEvent != null && i == taskGiftEvent.getType()) {
            C5731at atVar = (C5731at) C2942b.m8369a().mo34884a(taskGiftEvent.getData(), C5731at.class);
            int i4 = 3;
            if (atVar.f15085b < 3) {
                i3 = R.string.etx;
            } else {
                i3 = R.string.etv;
            }
            textView3.setEnabled(false);
            textView3.setText(i3);
            String string = getContext().getString(i2);
            if (atVar.f15085b <= 3) {
                i4 = atVar.f15085b;
            }
            textView.setText(C4604n.m11050a(string, Integer.valueOf(i4)));
            textView2.setText(taskGiftEvent.getSubtitle());
        }
    }
}
