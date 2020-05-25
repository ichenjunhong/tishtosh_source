package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.p524d.C9396a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29367a;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29368b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33561f.C33565a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo.C33655i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33440v;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33445y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35186ab;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity */
public class EmojiAddActivity extends AmeActivity implements C29367a {

    /* renamed from: a */
    public C33655i f86929a;

    /* renamed from: b */
    public boolean f86930b;

    /* renamed from: c */
    public C33445y f86931c = new C33445y() {
        /* renamed from: a */
        public final void mo70782a() {
        }

        /* renamed from: a */
        public final void mo70783a(double d) {
        }

        /* renamed from: a */
        public final void mo70784a(String str) {
            EmojiAddActivity.this.mo71004a(str);
        }

        /* renamed from: a */
        public final void mo70785a(Throwable th) {
            EmojiAddActivity.this.mo71004a(EmojiAddActivity.this.getString(R.string.bl6));
        }

        /* renamed from: a */
        public final void mo70787a(String str, UrlModel urlModel) {
            if (urlModel == null) {
                EmojiAddActivity.this.mo71004a(EmojiAddActivity.this.getString(R.string.bl6));
                return;
            }
            if (!C29368b.m69241a().mo59390a(EmojiAddActivity.this.f86929a.getPath(), str, urlModel.getUri())) {
                EmojiAddActivity.this.mo71004a("");
            }
        }
    };

    /* renamed from: d */
    private RemoteImageView f86932d;

    /* renamed from: e */
    private ImTextTitleBar f86933e;

    /* renamed from: a */
    public final void mo51837a(List<C29366a> list, boolean z, String str) {
    }

    /* renamed from: b */
    public final void mo51838b(List<C29366a> list, boolean z, String str) {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onDestroy() {
        super.onDestroy();
        C29368b.m69241a().mo59393b((C29367a) this);
    }

    /* renamed from: a */
    public final void mo71004a(String str) {
        m76884a(str, true);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("photo_param", this.f86929a);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bbw);
        C34004b.m77718b().setupStatusBar(this);
        if (bundle != null) {
            this.f86929a = (C33655i) bundle.getSerializable("photo_param");
        } else {
            this.f86929a = (C33655i) getIntent().getSerializableExtra("photo_param");
        }
        this.f86932d = (RemoteImageView) findViewById(R.id.bxn);
        this.f86933e = (ImTextTitleBar) findViewById(R.id.d10);
        this.f86933e.setOnTitlebarClickListener(new C35356a() {
            /* renamed from: c */
            public final void mo70671c() {
            }

            /* renamed from: a */
            public final void mo70669a() {
                EmojiAddActivity.this.finish();
            }

            /* renamed from: b */
            public final void mo70670b() {
                if (!EmojiAddActivity.this.f86930b) {
                    EmojiAddActivity.this.f86930b = true;
                    EmojiAddActivity.this.showProgressDialog(EmojiAddActivity.this.getString(R.string.bgv));
                    C33655i iVar = EmojiAddActivity.this.f86929a;
                    C33445y yVar = EmojiAddActivity.this.f86931c;
                    if (!C33566g.m76958a(C11010c.m22280a())) {
                        C10691a.m21542b(C11010c.m22280a(), (int) R.string.bl6).mo19066a();
                        if (yVar != null) {
                            yVar.mo70784a("");
                        }
                        return;
                    }
                    C0013i.m18a((Callable<TResult>) new Callable<C33565a>(iVar) {

                        /* renamed from: a */
                        final /* synthetic */ C33655i f87009a;

                        public final /* synthetic */ Object call() throws Exception {
                            C33565a aVar = new C33565a();
                            File file = new File(this.f87009a.getPath());
                            if (C9396a.m18582b(file)) {
                                if (file.length() > 1048576) {
                                    aVar.f87012b = C11010c.m22280a().getResources().getString(R.string.bhl);
                                } else {
                                    aVar.f87011a = this.f87009a.getPath();
                                }
                                return aVar;
                            }
                            String a = C35186ab.m79431a(this.f87009a.getPath());
                            if (C35186ab.m79428a(this.f87009a.getPath(), a, 300, 300) == 2) {
                                aVar.f87012b = C11010c.m22280a().getResources().getString(R.string.bg0);
                            } else {
                                aVar.f87011a = a;
                            }
                            return aVar;
                        }

                        {
                            this.f87009a = r1;
                        }
                    }, (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<C33565a, Void>(yVar) {

                        /* renamed from: a */
                        final /* synthetic */ C33445y f87008a;

                        {
                            this.f87008a = r1;
                        }

                        public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                            C33565a aVar = (C33565a) iVar.mo34e();
                            if (aVar != null) {
                                if (!TextUtils.isEmpty(aVar.f87011a)) {
                                    C33440v.m76638a().mo70846a(aVar.f87011a, this.f87008a);
                                } else if (this.f87008a != null) {
                                    this.f87008a.mo70784a(aVar.f87012b);
                                }
                            } else if (this.f87008a != null) {
                                this.f87008a.mo70784a("");
                            }
                            return null;
                        }
                    }, C0013i.f25b);
                }
            }
        });
        RemoteImageView remoteImageView = this.f86932d;
        StringBuilder sb = new StringBuilder("file://");
        sb.append(this.f86929a.getPath());
        C23515d.m57677a(remoteImageView, sb.toString());
        C29368b.m69241a().mo59384a((C29367a) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity", "onCreate", false);
    }

    /* renamed from: a */
    private void m76884a(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && z) {
            C10691a.m21545b((Context) this, str).mo19066a();
        }
        C35190af.m79442a();
        C35190af.m79476a(false);
        dismissProgressDialog();
        this.f86930b = false;
    }

    /* renamed from: a */
    public final void mo51836a(List<C29366a> list, C29366a aVar, boolean z, String str) {
        if (z) {
            dismissProgressDialog();
            C35190af.m79442a();
            C35190af.m79476a(true);
            setResult(-1);
            finish();
            this.f86930b = false;
            return;
        }
        m76884a(str, false);
    }
}
