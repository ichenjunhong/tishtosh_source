package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.C37321b.C37324a;
import com.p683ss.android.ugc.aweme.music.api.MusicApi;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1980b.C37528a;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1980b.C37528a.C37530a;
import com.p683ss.android.ugc.aweme.music.presenter.C37402h;
import com.p683ss.android.ugc.aweme.music.presenter.C37404i;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.ss.android.ugc.trill.R;
import java.io.File;
import okhttp3.C53500ac;
import okhttp3.C53678w;
import okhttp3.C53679x;
import okhttp3.C53679x.C53680a;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity */
public class MusicRecommendActivity extends AmeSSActivity implements C37626n {

    /* renamed from: a */
    public C37528a f95638a;

    /* renamed from: b */
    public C45547d f95639b;

    /* renamed from: c */
    public String f95640c;

    /* renamed from: d */
    public int f95641d;

    /* renamed from: e */
    ClickableSpan f95642e = new ClickableSpan() {
        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(C0726c.m2098c(MusicRecommendActivity.this, R.color.a36));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            if (MusicRecommendActivity.this.f95638a == null) {
                MusicRecommendActivity musicRecommendActivity = MusicRecommendActivity.this;
                C37530a aVar = new C37530a();
                aVar.f95751a = "https://api.tiktokv.com/aweme/in_app/music_agreement/";
                C37528a aVar2 = new C37528a(MusicRecommendActivity.this);
                aVar2.f95748a = aVar;
                musicRecommendActivity.f95638a = aVar2;
            }
            if (!MusicRecommendActivity.this.f95638a.isShowing()) {
                MusicRecommendActivity.this.f95638a.show();
            }
        }
    };
    EditText editSongLink;
    EditText editSongName;

    /* renamed from: f */
    public C37324a f95643f = new C37324a() {
        /* renamed from: a */
        public final void mo76631a(final int i) {
            MusicRecommendActivity.this.runOnUiThread(new Runnable() {
                public final void run() {
                    MusicRecommendActivity.this.f95639b.setProgress(i);
                }
            });
        }

        /* renamed from: a */
        public final void mo76632a(final String str, long j) {
            MusicRecommendActivity.this.runOnUiThread(new Runnable() {
                public final void run() {
                    MusicRecommendActivity.this.mo77010a(str);
                }
            });
        }

        /* renamed from: a */
        public final void mo76633a(String str, final Exception exc, long j) {
            MusicRecommendActivity.this.runOnUiThread(new Runnable() {
                public final void run() {
                    C10691a.m21542b((Context) MusicRecommendActivity.this, (int) R.string.cet).mo19066a();
                    if (MusicRecommendActivity.this.isViewValid() && MusicRecommendActivity.this.isActive()) {
                        MusicRecommendActivity.this.f95639b.dismiss();
                    }
                }
            });
        }
    };

    /* renamed from: g */
    private C37404i f95644g;

    /* renamed from: h */
    private String f95645h;
    ImageView ivClickUpload;
    LinearLayout llClickForUpload;
    TextTitleBar mTitleBar;
    TextView tvContentAgreement;
    TextView txtClickUploadTv;

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    /* renamed from: b */
    public final void mo77011b() {
        C10691a.m21542b((Context) this, (int) R.string.cet).mo19066a();
        this.f95639b.dismiss();
    }

    /* renamed from: a */
    public final void mo77009a() {
        this.f95639b.setContentView(R.layout.a4x);
        ((RelativeLayout) this.f95639b.findViewById(R.id.cfc)).setLayoutParams(new LayoutParams((int) C9432q.m18687b((Context) this, 140.0f), this.f95641d, 17));
        C18842a.m45933a(new Runnable() {
            public final void run() {
                MusicRecommendActivity.this.f95639b.dismiss();
                C10691a.m21533a((Context) MusicRecommendActivity.this, (int) R.string.dx4).mo19066a();
                MusicRecommendActivity.this.finish();
            }
        }, 500);
    }

    /* renamed from: a */
    public final void mo77010a(String str) {
        String str2;
        int i;
        String obj = this.editSongName.getText().toString();
        String obj2 = this.editSongLink.getText().toString();
        if (!TextUtils.isEmpty(str)) {
            str2 = "";
            i = 1;
        } else {
            str2 = obj2;
            i = 2;
        }
        this.f95644g.mo44934a_(Integer.valueOf(i), str, str2, obj);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity", "onCreate", true);
        super.onCreate(bundle);
        superOverridePendingTransition(R.anim.q, 0);
        setContentView((int) R.layout.du);
        this.f95644g = new C37404i();
        this.f95644g.mo54799a(new C37402h());
        this.f95644g.mo54800a(this);
        SpannableString spannableString = new SpannableString(getString(R.string.ai_));
        spannableString.setSpan(this.f95642e, 2, 10, 33);
        this.tvContentAgreement.setText(spannableString);
        this.tvContentAgreement.setMovementMethod(LinkMovementMethod.getInstance());
        this.tvContentAgreement.setHighlightColor(0);
        this.mTitleBar.setColorMode(0);
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: a */
            public final void mo19166a(View view) {
                MusicRecommendActivity.this.finish();
            }

            /* renamed from: b */
            public final void mo19167b(View view) {
                if (TextUtils.isEmpty(MusicRecommendActivity.this.editSongName.getText().toString())) {
                    C10691a.m21548c((Context) MusicRecommendActivity.this, (int) R.string.cpo).mo19066a();
                } else if (!AccountService.createIAccountServicebyMonsterPlugin().userService().isLogin()) {
                    C27965f.m66721a((Activity) MusicRecommendActivity.this, "recommend_music", "click_music", (Bundle) null, (C23505g) new C37540bi(view));
                } else {
                    MusicRecommendActivity musicRecommendActivity = MusicRecommendActivity.this;
                    musicRecommendActivity.f95639b = C45547d.m99208b(musicRecommendActivity, musicRecommendActivity.getResources().getString(R.string.dl3));
                    View findViewById = musicRecommendActivity.f95639b.findViewById(R.id.cfc);
                    if (findViewById != null) {
                        findViewById.post(new Runnable(findViewById) {

                            /* renamed from: a */
                            final /* synthetic */ View f95659a;

                            public final void run() {
                                MusicRecommendActivity.this.f95641d = this.f95659a.getHeight();
                            }

                            {
                                this.f95659a = r2;
                            }
                        });
                    }
                    musicRecommendActivity.f95639b.setOnDismissListener(new OnDismissListener() {
                        public final void onDismiss(DialogInterface dialogInterface) {
                            MusicRecommendActivity.this.f95639b.setContentView(R.layout.a4x);
                        }
                    });
                    if (!TextUtils.isEmpty(MusicRecommendActivity.this.f95640c)) {
                        C18842a.m45932a(new Runnable() {
                            public final void run() {
                                try {
                                    String str = MusicRecommendActivity.this.f95640c;
                                    C37324a aVar = MusicRecommendActivity.this.f95643f;
                                    C53680a a = new C53680a().mo111648a(C53679x.f133173e);
                                    File file = new File(str);
                                    if (file.exists()) {
                                        if (file.length() != 0) {
                                            a.mo111646a("file", file.getName(), new C53500ac(C53679x.f133173e, file, aVar) {

                                                /* renamed from: a */
                                                final /* synthetic */ C53678w f95252a;

                                                /* renamed from: b */
                                                final /* synthetic */ File f95253b;

                                                /* renamed from: c */
                                                final /* synthetic */ C37324a f95254c;

                                                public final C53678w contentType() {
                                                    return this.f95252a;
                                                }

                                                public final long contentLength() {
                                                    return this.f95253b.length();
                                                }

                                                /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
                                                /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
                                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                                public final void writeTo(okio.BufferedSink r14) throws java.io.IOException {
                                                    /*
                                                        r13 = this;
                                                        r0 = 0
                                                        java.io.File r1 = r13.f95253b     // Catch:{ Exception -> 0x0048, all -> 0x0040 }
                                                        okio.Source r1 = okio.Okio.source(r1)     // Catch:{ Exception -> 0x0048, all -> 0x0040 }
                                                        okio.Buffer r0 = new okio.Buffer     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                                                        r0.<init>()     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                                                        long r2 = r13.contentLength()     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                                                        r4 = 0
                                                        r6 = 2048(0x800, double:1.0118E-320)
                                                        long r8 = r1.read(r0, r6)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                                                    L_0x0018:
                                                        r10 = -1
                                                        int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                                                        if (r12 == 0) goto L_0x0033
                                                        r14.write(r0, r8)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                                                        r10 = 0
                                                        long r4 = r4 + r8
                                                        com.ss.android.ugc.aweme.music.b$a r8 = r13.f95254c     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                                                        r9 = 100
                                                        long r9 = r9 * r4
                                                        long r9 = r9 / r2
                                                        int r9 = (int) r9     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                                                        r8.mo76631a(r9)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                                                        long r8 = r1.read(r0, r6)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                                                        goto L_0x0018
                                                    L_0x0033:
                                                        r14.flush()     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                                                        if (r1 == 0) goto L_0x004e
                                                        r1.close()
                                                        return
                                                    L_0x003c:
                                                        r14 = move-exception
                                                        goto L_0x0042
                                                    L_0x003e:
                                                        r0 = r1
                                                        goto L_0x0048
                                                    L_0x0040:
                                                        r14 = move-exception
                                                        r1 = r0
                                                    L_0x0042:
                                                        if (r1 == 0) goto L_0x0047
                                                        r1.close()
                                                    L_0x0047:
                                                        throw r14
                                                    L_0x0048:
                                                        if (r0 == 0) goto L_0x004e
                                                        r0.close()
                                                        return
                                                    L_0x004e:
                                                        return
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.music.C37321b.C373232.writeTo(okio.BufferedSink):void");
                                                }

                                                {
                                                    this.f95252a = r1;
                                                    this.f95253b = r2;
                                                    this.f95254c = r3;
                                                }
                                            });
                                            a.mo111645a("file_type", "mpeg");
                                            MusicApi.f95243a.uploadLocalMusic(a.mo111650a()).mo19a((C0011g<TResult, TContinuationResult>) new C0011g<String, Object>(aVar, str, file) {

                                                /* renamed from: a */
                                                final /* synthetic */ C37324a f95249a;

                                                /* renamed from: b */
                                                final /* synthetic */ String f95250b;

                                                /* renamed from: c */
                                                final /* synthetic */ File f95251c;

                                                public final Object then(C0013i<String> iVar) throws Exception {
                                                    if (iVar.mo33d() || iVar.mo31c()) {
                                                        this.f95249a.mo76633a(this.f95250b, new Exception(iVar.mo35f()), this.f95251c.length());
                                                    } else {
                                                        try {
                                                            JSONObject optJSONObject = new JSONObject((String) iVar.mo34e()).optJSONObject("data");
                                                            if (optJSONObject != null) {
                                                                String optString = optJSONObject.optString("uri");
                                                                if (optString != null) {
                                                                    this.f95249a.mo76632a(optString, this.f95251c.length());
                                                                    return null;
                                                                }
                                                            }
                                                        } catch (JSONException unused) {
                                                        }
                                                    }
                                                    return null;
                                                }

                                                {
                                                    this.f95249a = r1;
                                                    this.f95250b = r2;
                                                    this.f95251c = r3;
                                                }
                                            });
                                            return;
                                        }
                                    }
                                    aVar.mo76633a(str, new Exception(), file.length());
                                } catch (Exception unused) {
                                }
                            }
                        });
                    } else {
                        MusicRecommendActivity.this.mo77010a("");
                    }
                }
            }
        });
        this.llClickForUpload.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MusicRecommendActivity musicRecommendActivity = MusicRecommendActivity.this;
                musicRecommendActivity.startActivityForResult(SmartRouter.buildRoute((Context) musicRecommendActivity, "//assmusic/category").withParam("music_type", 3).buildIntent(), 1);
                C26890h.onEvent(MobClick.obtain().setEventName("hand_in").setLabelName("recommend_music"));
            }
        });
        this.editSongName.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                MusicRecommendActivity.this.editSongName.setSelection(charSequence.length());
                MusicRecommendActivity musicRecommendActivity = MusicRecommendActivity.this;
                EditText editText = MusicRecommendActivity.this.editSongName;
                Editable text = editText.getText();
                if (text.length() > 50) {
                    C10691a.m21545b((Context) musicRecommendActivity, musicRecommendActivity.getString(R.string.c59, new Object[]{"50"})).mo19066a();
                    int selectionEnd = Selection.getSelectionEnd(text);
                    editText.setText(text.toString().substring(0, 50));
                    Editable text2 = editText.getText();
                    if (selectionEnd > text2.length()) {
                        selectionEnd = text2.length();
                    }
                    Selection.setSelection(text2, selectionEnd);
                }
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            this.f95645h = intent.getStringExtra("local_music_name");
            this.f95640c = intent.getStringExtra("local_music_path");
            this.editSongName.setText(this.f95645h);
            this.txtClickUploadTv.setText(this.f95645h);
            this.ivClickUpload.setImageResource(R.drawable.aej);
            this.mTitleBar.getEndText().setTextColor(Color.parseColor("#fe2c55"));
        }
    }
}
