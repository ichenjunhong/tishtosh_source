package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter;
import com.p683ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter.C37393a;
import com.p683ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter.C37394b;
import com.p683ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter.MusicTitleApi;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.trill.R;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity */
public class EditOriginMusicTitleActivity extends AmeSSActivity implements C37394b {

    /* renamed from: a */
    public static final String f95498a = "EditOriginMusicTitleActivity";

    /* renamed from: b */
    public static final int f95499b = 50;

    /* renamed from: c */
    public String f95500c;
    ImageView clearBtn;

    /* renamed from: d */
    public String f95501d;

    /* renamed from: e */
    public Activity f95502e;

    /* renamed from: f */
    public EditOriginMusicTitlePresenter f95503f;

    /* renamed from: g */
    private final String f95504g = "[._ \\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]+";
    TextTitleBar mTitleBar;
    EditText musicTitleEdt;

    /* renamed from: b */
    public final void mo76904b() {
        dismissProgressDialog();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo76903a() {
        dismissProgressDialog();
        Intent intent = new Intent();
        intent.putExtra("MUSIC_TITLE", this.f95500c);
        setResult(-1, intent);
        finish();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    public void onViewClicked(View view) {
        if (view.getId() == R.id.tr) {
            this.musicTitleEdt.setText("");
        }
    }

    /* renamed from: a */
    public final void mo76964a(boolean z) {
        if (z) {
            this.mTitleBar.getEndText().setTextColor(getResources().getColor(R.color.av6));
            this.mTitleBar.getEndText().setAlpha(1.0f);
            this.mTitleBar.getEndText().setClickable(true);
            return;
        }
        this.mTitleBar.getEndText().setTextColor(getResources().getColor(R.color.avo));
        this.mTitleBar.getEndText().setAlpha(0.5f);
        this.mTitleBar.getEndText().setClickable(false);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f95502e = this;
        setContentView((int) R.layout.blf);
        this.f95503f = new EditOriginMusicTitlePresenter(this);
        this.f95501d = getIntent().getStringExtra("MUSIC_TITLE");
        mo76964a(false);
        this.musicTitleEdt.setFilters(new InputFilter[]{new LengthFilter(f95499b)});
        this.musicTitleEdt.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.length() > 0) {
                    EditOriginMusicTitleActivity.this.mo76964a(true);
                    EditOriginMusicTitleActivity.this.clearBtn.setVisibility(0);
                    return;
                }
                EditOriginMusicTitleActivity.this.mo76964a(false);
                EditOriginMusicTitleActivity.this.clearBtn.setVisibility(4);
            }
        });
        findViewById(R.id.csm).setLayoutParams(new LayoutParams(-1, C11065a.m22390a((Context) this)));
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: a */
            public final void mo19166a(View view) {
                EditOriginMusicTitleActivity.this.finish();
            }

            /* renamed from: b */
            public final void mo19167b(View view) {
                String trim = EditOriginMusicTitleActivity.this.musicTitleEdt.getText().toString().trim().replaceAll("[ ]{2,}", " ").trim();
                if (!Pattern.matches("[._ \\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]+", trim)) {
                    C10691a.m21548c((Context) EditOriginMusicTitleActivity.this.f95502e, (int) R.string.auz).mo19066a();
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("title", trim);
                } catch (JSONException unused) {
                }
                C26890h.onEvent(MobClick.obtain().setEventName("confirm_title").setLabelName("song_cover").setValue(EditOriginMusicTitleActivity.this.f95501d).setJsonObject(jSONObject));
                C26890h.onEvent(MobClick.obtain().setEventName("original_title_change_alert").setLabelName("original_music"));
                EditOriginMusicTitleActivity.this.f95500c = trim;
                EditOriginMusicTitlePresenter editOriginMusicTitlePresenter = EditOriginMusicTitleActivity.this.f95503f;
                ((MusicTitleApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(MusicTitleApi.class)).alterMusicTitle(EditOriginMusicTitleActivity.this.f95501d, EditOriginMusicTitleActivity.this.f95500c).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C1674ab<C37393a>() {
                    public final void onComplete() {
                    }

                    public final void onSubscribe(C1690c cVar) {
                    }

                    public final void onError(Throwable th) {
                        if (EditOriginMusicTitlePresenter.this.f95404a != null) {
                            EditOriginMusicTitlePresenter.this.f95404a.mo76904b();
                        }
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        C37393a aVar = (C37393a) obj;
                        if (EditOriginMusicTitlePresenter.this.f95404a != null) {
                            if (aVar.f95406a == 0) {
                                EditOriginMusicTitlePresenter.this.f95404a.mo76903a();
                                return;
                            }
                            EditOriginMusicTitlePresenter.this.f95404a.mo76904b();
                        }
                    }
                });
                C26890h.onEvent(MobClick.obtain().setEventName("original_title_change_alert").setLabelName("confirm"));
                EditOriginMusicTitleActivity.this.showProgressDialog();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onCreate", false);
    }
}
