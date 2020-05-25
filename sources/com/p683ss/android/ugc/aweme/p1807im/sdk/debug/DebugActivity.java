package com.p683ss.android.ugc.aweme.p1807im.sdk.debug;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.TextContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity */
public class DebugActivity extends AppCompatActivity implements OnClickListener, OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public TextView f88010a;

    /* renamed from: b */
    public TextView f88011b;

    /* renamed from: c */
    public EditText f88012c;

    /* renamed from: d */
    public CheckBox f88013d;

    /* renamed from: e */
    public String f88014e;

    /* renamed from: f */
    public String f88015f;

    /* renamed from: g */
    private TextView f88016g;

    /* renamed from: h */
    private TextView f88017h;

    /* renamed from: i */
    private TextView f88018i;

    /* renamed from: j */
    private Button f88019j;

    /* renamed from: k */
    private Button f88020k;

    /* renamed from: l */
    private Button f88021l;

    /* renamed from: m */
    private Button f88022m;

    /* renamed from: n */
    private EditText f88023n;

    /* renamed from: o */
    private EditText f88024o;

    /* renamed from: p */
    private EditText f88025p;

    /* renamed from: q */
    private RadioGroup f88026q;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    private void m77823a(final Runnable runnable) {
        new C1161a(this).mo3764a((CharSequence) "想清楚你在干什么！！").mo3770b((CharSequence) "去掉严格模式，意味着不会对消息内容进行检查，如果将错误的消息发出去，可能会导致严重的后果！！").mo3766a(false).mo3771b((CharSequence) "好好好，我怂了", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                DebugActivity.this.f88013d.setChecked(true);
            }
        }).mo3765a((CharSequence) "我不怕死，来吧", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }).mo3775c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0121 A[Catch:{ Exception -> 0x0144 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
            r7 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r8)
            android.widget.Button r0 = r7.f88019j
            if (r8 != r0) goto L_0x0026
            com.bytedance.im.core.c.d r8 = com.bytedance.p702im.core.p706c.C11182d.m22641a()
            java.lang.String r0 = r7.f88014e
            com.bytedance.im.core.c.b r8 = r8.mo20658a(r0)
            if (r8 == 0) goto L_0x001e
            android.widget.EditText r0 = r7.f88012c
            java.lang.String r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o.m79761a(r8)
            r0.setText(r8)
            goto L_0x017c
        L_0x001e:
            android.widget.EditText r8 = r7.f88012c
            java.lang.String r0 = "会话不存在或还没有被加入内存中"
            r8.setText(r0)
            return
        L_0x0026:
            android.widget.Button r0 = r7.f88020k
            r1 = 0
            if (r8 != r0) goto L_0x0067
            r8 = 0
            android.widget.EditText r0 = r7.f88012c     // Catch:{ Exception -> 0x003f }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x003f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x003f }
            java.lang.Class<com.bytedance.im.core.c.p> r2 = com.bytedance.p702im.core.p706c.C11207p.class
            java.lang.Object r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o.m79760a(r0, r2)     // Catch:{ Exception -> 0x003f }
            com.bytedance.im.core.c.p r0 = (com.bytedance.p702im.core.p706c.C11207p) r0     // Catch:{ Exception -> 0x003f }
            r8 = r0
        L_0x003f:
            if (r8 == 0) goto L_0x005d
            android.widget.EditText r0 = r7.f88023n
            int r1 = r8.getMsgType()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setText(r1)
            android.widget.EditText r0 = r7.f88024o
            java.lang.String r8 = r8.getContent()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r0.setText(r8)
            goto L_0x017c
        L_0x005d:
            java.lang.String r8 = "解析失败"
            android.widget.Toast r8 = android.widget.Toast.makeText(r7, r8, r1)
            com.p683ss.android.ugc.aweme.p1807im.sdk.debug.C34053a.m77825a(r8)
            return
        L_0x0067:
            android.widget.Button r0 = r7.f88021l
            if (r8 != r0) goto L_0x014e
            android.widget.EditText r8 = r7.f88023n     // Catch:{ Exception -> 0x0144 }
            android.text.Editable r8 = r8.getText()     // Catch:{ Exception -> 0x0144 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0144 }
            if (r8 == 0) goto L_0x008a
            android.widget.EditText r8 = r7.f88023n     // Catch:{ Exception -> 0x0144 }
            java.lang.CharSequence r8 = r8.getHint()     // Catch:{ Exception -> 0x0144 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0144 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0144 }
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x0144 }
            goto L_0x009c
        L_0x008a:
            android.widget.EditText r8 = r7.f88023n     // Catch:{ Exception -> 0x0144 }
            android.text.Editable r8 = r8.getText()     // Catch:{ Exception -> 0x0144 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0144 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0144 }
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x0144 }
        L_0x009c:
            android.widget.EditText r0 = r7.f88024o     // Catch:{ Exception -> 0x0144 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x0144 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0144 }
            if (r0 == 0) goto L_0x00b3
            android.widget.EditText r0 = r7.f88024o     // Catch:{ Exception -> 0x0144 }
            java.lang.CharSequence r0 = r0.getHint()     // Catch:{ Exception -> 0x0144 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0144 }
            goto L_0x00bd
        L_0x00b3:
            android.widget.EditText r0 = r7.f88024o     // Catch:{ Exception -> 0x0144 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x0144 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0144 }
        L_0x00bd:
            android.widget.CheckBox r2 = r7.f88013d     // Catch:{ Exception -> 0x0144 }
            boolean r2 = r2.isChecked()     // Catch:{ Exception -> 0x0144 }
            if (r2 != 0) goto L_0x00cf
            com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity$6 r2 = new com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity$6     // Catch:{ Exception -> 0x0144 }
            r2.<init>(r8, r0)     // Catch:{ Exception -> 0x0144 }
            r7.m77823a(r2)     // Catch:{ Exception -> 0x0144 }
            goto L_0x014d
        L_0x00cf:
            java.lang.String r2 = r7.f88014e     // Catch:{ Exception -> 0x0144 }
            long r2 = com.bytedance.p702im.core.p706c.C11190e.m22685a(r2)     // Catch:{ Exception -> 0x0144 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0115
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0144 }
            if (r2 == 0) goto L_0x00e2
            goto L_0x0115
        L_0x00e2:
            r2 = 7
            if (r8 == r2) goto L_0x00ef
            java.lang.String r2 = "严格模式下，该消息类型暂不支持"
            android.widget.Toast r2 = android.widget.Toast.makeText(r7, r2, r1)     // Catch:{ Exception -> 0x0144 }
            com.p683ss.android.ugc.aweme.p1807im.sdk.debug.C34053a.m77825a(r2)     // Catch:{ Exception -> 0x0144 }
            goto L_0x011e
        L_0x00ef:
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y.content(r8, r0, r1, r4)     // Catch:{ Exception -> 0x0144 }
            int r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am.m79553a(r2)     // Catch:{ Exception -> 0x0144 }
            if (r3 == r8) goto L_0x0103
            java.lang.String r2 = "消息内容和消息类型不匹配"
            android.widget.Toast r2 = android.widget.Toast.makeText(r7, r2, r1)     // Catch:{ Exception -> 0x0144 }
            com.p683ss.android.ugc.aweme.p1807im.sdk.debug.C34053a.m77825a(r2)     // Catch:{ Exception -> 0x0144 }
            goto L_0x011e
        L_0x0103:
            boolean r2 = r2.isValid()     // Catch:{ Exception -> 0x0144 }
            if (r2 != 0) goto L_0x0113
            java.lang.String r2 = "消息内容数据非法"
            android.widget.Toast r2 = android.widget.Toast.makeText(r7, r2, r1)     // Catch:{ Exception -> 0x0144 }
            com.p683ss.android.ugc.aweme.p1807im.sdk.debug.C34053a.m77825a(r2)     // Catch:{ Exception -> 0x0144 }
            goto L_0x011e
        L_0x0113:
            r2 = 1
            goto L_0x011f
        L_0x0115:
            java.lang.String r2 = "消息检查没通过，再看看？"
            android.widget.Toast r2 = android.widget.Toast.makeText(r7, r2, r1)     // Catch:{ Exception -> 0x0144 }
            com.p683ss.android.ugc.aweme.p1807im.sdk.debug.C34053a.m77825a(r2)     // Catch:{ Exception -> 0x0144 }
        L_0x011e:
            r2 = 0
        L_0x011f:
            if (r2 == 0) goto L_0x017c
            com.bytedance.im.core.c.d r2 = com.bytedance.p702im.core.p706c.C11182d.m22641a()     // Catch:{ Exception -> 0x0144 }
            java.lang.String r3 = r7.f88014e     // Catch:{ Exception -> 0x0144 }
            com.bytedance.im.core.c.b r2 = r2.mo20658a(r3)     // Catch:{ Exception -> 0x0144 }
            com.bytedance.im.core.c.p$a r3 = new com.bytedance.im.core.c.p$a     // Catch:{ Exception -> 0x0144 }
            r3.<init>()     // Catch:{ Exception -> 0x0144 }
            com.bytedance.im.core.c.p$a r2 = r3.mo20825a(r2)     // Catch:{ Exception -> 0x0144 }
            com.bytedance.im.core.c.p$a r8 = r2.mo20824a(r8)     // Catch:{ Exception -> 0x0144 }
            com.bytedance.im.core.c.p$a r8 = r8.mo20826a(r0)     // Catch:{ Exception -> 0x0144 }
            com.bytedance.im.core.c.p r8 = r8.mo20827a()     // Catch:{ Exception -> 0x0144 }
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am.m79563c(r8)     // Catch:{ Exception -> 0x0144 }
            goto L_0x017c
        L_0x0144:
            java.lang.String r8 = "哪一步错了，仔细检查一下"
            android.widget.Toast r8 = android.widget.Toast.makeText(r7, r8, r1)
            com.p683ss.android.ugc.aweme.p1807im.sdk.debug.C34053a.m77825a(r8)
        L_0x014d:
            return
        L_0x014e:
            android.widget.Button r0 = r7.f88022m
            if (r8 != r0) goto L_0x017c
            android.widget.EditText r8 = r7.f88025p
            android.text.Editable r8 = r8.getText()
            java.lang.String r8 = r8.toString()
            android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x0173 }
            com.bytedance.im.core.a.c r0 = com.bytedance.p702im.core.p703a.C11165c.m22588a()     // Catch:{ Exception -> 0x0173 }
            com.bytedance.im.core.a.e r0 = r0.mo20513b()     // Catch:{ Exception -> 0x0173 }
            r0.f30143g = r8     // Catch:{ Exception -> 0x0173 }
            java.lang.String r8 = "修改成功，下个请求生效，冷重启会重置"
            android.widget.Toast r8 = android.widget.Toast.makeText(r7, r8, r1)     // Catch:{ Exception -> 0x0173 }
            com.p683ss.android.ugc.aweme.p1807im.sdk.debug.C34053a.m77825a(r8)     // Catch:{ Exception -> 0x0173 }
            return
        L_0x0173:
            java.lang.String r8 = "填的Host似乎不合法吧？"
            android.widget.Toast r8 = android.widget.Toast.makeText(r7, r8, r1)
            com.p683ss.android.ugc.aweme.p1807im.sdk.debug.C34053a.m77825a(r8)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.debug.DebugActivity.onClick(android.view.View):void");
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.re);
        this.f88014e = getIntent().getStringExtra("EXTRA_CONVERSATION_ID");
        this.f88015f = getIntent().getStringExtra("EXTRA_MSG_UUID");
        this.f88016g = (TextView) findViewById(R.id.d93);
        this.f88010a = (TextView) findViewById(R.id.dfq);
        this.f88011b = (TextView) findViewById(R.id.dc6);
        this.f88017h = (TextView) findViewById(R.id.dhk);
        this.f88018i = (TextView) findViewById(R.id.d_k);
        this.f88019j = (Button) findViewById(R.id.ot);
        this.f88020k = (Button) findViewById(R.id.nn);
        this.f88021l = (Button) findViewById(R.id.p4);
        this.f88022m = (Button) findViewById(R.id.o1);
        this.f88012c = (EditText) findViewById(R.id.ac2);
        this.f88023n = (EditText) findViewById(R.id.abv);
        this.f88024o = (EditText) findViewById(R.id.abu);
        this.f88025p = (EditText) findViewById(R.id.abq);
        this.f88013d = (CheckBox) findViewById(R.id.r9);
        this.f88026q = (RadioGroup) findViewById(R.id.cc3);
        this.f88019j.setOnClickListener(this);
        this.f88020k.setOnClickListener(this);
        this.f88021l.setOnClickListener(this);
        this.f88022m.setOnClickListener(this);
        this.f88013d.setOnCheckedChangeListener(this);
        this.f88026q.setOnCheckedChangeListener(this);
        this.f88016g.setText(C35265e.m79730b());
        C0013i.m16a((Callable<TResult>) new Callable<Pair<Integer, Integer>>() {
            public final /* synthetic */ Object call() throws Exception {
                return m77824a();
            }

            /* JADX WARNING: Removed duplicated region for block: B:21:0x0030 A[SYNTHETIC, Splitter:B:21:0x0030] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static android.util.Pair<java.lang.Integer, java.lang.Integer> m77824a() throws java.lang.Exception {
                /*
                    r0 = 0
                    r1 = 0
                    java.lang.String r2 = "select * from conversation_list"
                    com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ Exception -> 0x0020, all -> 0x001b }
                    com.bytedance.im.core.internal.a.c.b r2 = com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22879a(r2, r0)     // Catch:{ Exception -> 0x0020, all -> 0x001b }
                    if (r2 == 0) goto L_0x0016
                    int r3 = r2.mo20990b()     // Catch:{ Exception -> 0x0021, all -> 0x0012 }
                    goto L_0x0017
                L_0x0012:
                    r0 = move-exception
                    r1 = r0
                    r0 = r2
                    goto L_0x001c
                L_0x0016:
                    r3 = 0
                L_0x0017:
                    com.bytedance.p702im.core.internal.p710a.C11323v.m23122a(r2)
                    goto L_0x0025
                L_0x001b:
                    r1 = move-exception
                L_0x001c:
                    com.bytedance.p702im.core.internal.p710a.C11323v.m23122a(r0)
                    throw r1
                L_0x0020:
                    r2 = r0
                L_0x0021:
                    com.bytedance.p702im.core.internal.p710a.C11323v.m23122a(r2)
                    r3 = 0
                L_0x0025:
                    java.lang.String r4 = "select * from msg"
                    com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ Exception -> 0x003e, all -> 0x0039 }
                    com.bytedance.im.core.internal.a.c.b r0 = com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22879a(r4, r0)     // Catch:{ Exception -> 0x003e, all -> 0x0039 }
                    if (r0 == 0) goto L_0x003f
                    int r2 = r0.mo20990b()     // Catch:{ Exception -> 0x003f, all -> 0x0036 }
                    r1 = r2
                    goto L_0x003f
                L_0x0036:
                    r1 = move-exception
                    r2 = r0
                    goto L_0x003a
                L_0x0039:
                    r1 = move-exception
                L_0x003a:
                    com.bytedance.p702im.core.internal.p710a.C11323v.m23122a(r2)
                    throw r1
                L_0x003e:
                    r0 = r2
                L_0x003f:
                    com.bytedance.p702im.core.internal.p710a.C11323v.m23122a(r0)
                    android.util.Pair r0 = new android.util.Pair
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r0.<init>(r2, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.debug.DebugActivity.C340473.m77824a():android.util.Pair");
            }
        }).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<Pair<Integer, Integer>, Object>() {
            public final Object then(C0013i<Pair<Integer, Integer>> iVar) throws Exception {
                if (iVar.mo26b() && iVar.mo34e() != null) {
                    DebugActivity.this.f88010a.setText(String.valueOf(((Pair) iVar.mo34e()).first));
                    DebugActivity.this.f88011b.setText(String.valueOf(((Pair) iVar.mo34e()).second));
                }
                return null;
            }
        }, C0013i.f25b);
        if (!TextUtils.isEmpty(this.f88014e)) {
            long a = C11190e.m22685a(this.f88014e);
            this.f88017h.setText(String.valueOf(a));
            if (a != -1) {
                IMUser b = C34010e.m77748a().mo71964b(String.valueOf(a));
                if (b != null) {
                    switch (b.getFollowStatus()) {
                        case 0:
                            this.f88018i.setText("没有互相关注或状态未知");
                            break;
                        case 1:
                            this.f88018i.setText("当前用户单向关注对方");
                            break;
                        case 2:
                            this.f88018i.setText("双向关注");
                            break;
                    }
                }
            }
            this.f88018i.setText("用户不存在或本地没有数据");
        }
        this.f88023n.setHint("7");
        this.f88024o.setHint(C35277o.m79761a(TextContent.obtain("这是一条测试消息")));
        if (!TextUtils.isEmpty(this.f88015f)) {
            C0013i.m16a((Callable<TResult>) new Callable<C11207p>() {
                public final /* synthetic */ Object call() throws Exception {
                    C11319r.m23086a();
                    return C11319r.m23094d(DebugActivity.this.f88015f);
                }
            }).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<C11207p, Object>() {
                public final Object then(C0013i<C11207p> iVar) throws Exception {
                    if (iVar.mo26b() && iVar.mo34e() != null) {
                        DebugActivity.this.f88012c.setText(C35277o.m79761a(iVar.mo34e()));
                    }
                    return null;
                }
            }, C0013i.f25b);
        }
        String str = C11165c.m22588a().mo20513b().f30143g;
        if (!TextUtils.isEmpty(str)) {
            this.f88025p.setText(str);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity", "onCreate", false);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == this.f88013d && !z) {
            m77823a(null);
        }
    }

    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (radioGroup == this.f88026q) {
            if (i == R.id.c93) {
                C11165c.m22588a().mo20513b().f30147k = 0;
            } else if (i == R.id.c95) {
                C11165c.m22588a().mo20513b().f30147k = 1;
            } else if (i == R.id.c94) {
                C11165c.m22588a().mo20513b().f30147k = 2;
            }
        }
    }
}
