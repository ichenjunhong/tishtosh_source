package com.p683ss.android.ugc.aweme.sticker.prop.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.sticker.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity */
public class StickerPropDetailActicity extends AmeSSActivity {

    /* renamed from: a */
    private List<String> f116960a = new ArrayList();

    /* renamed from: b */
    private String f116961b;

    /* renamed from: c */
    private String f116962c;

    /* renamed from: d */
    private boolean f116963d;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ax);
        findViewById(R.id.yw).setBackgroundColor(getResources().getColor(R.color.a3i));
        I18nBridgeService.getBridgeService_Monster().setStatusBar(this, findViewById(R.id.csm));
        String stringExtra = getIntent().getStringExtra("extra_log_pb");
        this.f116961b = getIntent().getStringExtra("aweme_id");
        this.f116962c = getIntent().getStringExtra("extra_music_from");
        this.f116963d = getIntent().getBooleanExtra("is_green_screen_mode", false);
        C42482c cVar = (C42482c) getIntent().getSerializableExtra("sticker_music");
        Serializable serializableExtra = getIntent().getSerializableExtra("music_model");
        getIntent().getStringExtra("sticker_id");
        getIntent().getStringExtra("from_token");
        ArrayList stringArrayListExtra = getIntent().getStringArrayListExtra("extra_stickers");
        if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
            stringArrayListExtra = new ArrayList();
            String stringExtra2 = getIntent().getStringExtra("id");
            if (!TextUtils.isEmpty(stringExtra2)) {
                String[] split = stringExtra2.split(",");
                if (split.length > 0) {
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            stringArrayListExtra.add(str);
                        }
                    }
                }
            }
        }
        if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
            finish();
        } else {
            this.f116960a.addAll(stringArrayListExtra);
            C0654k supportFragmentManager = getSupportFragmentManager();
            C0679r a = supportFragmentManager.mo2225a();
            Fragment a2 = supportFragmentManager.mo2224a("sticker_prop_detail_fragment_tag");
            String stringExtra3 = getIntent().getStringExtra("extra_sticker_from");
            if (a2 == 0) {
                String str2 = this.f116961b;
                String str3 = this.f116962c;
                boolean z = this.f116963d;
                Bundle bundle2 = new Bundle(3);
                bundle2.putStringArrayList("extra_stickers", stringArrayListExtra);
                bundle2.putString("aweme_id", str2);
                bundle2.putString("extra_music_from", str3);
                bundle2.putString("extra_sticker_from", stringExtra3);
                bundle2.putSerializable("sticker_music", cVar);
                bundle2.putSerializable("music_model", serializableExtra);
                bundle2.putString("extra_log_pb", stringExtra);
                bundle2.putBoolean("is_green_screen_mode", z);
                StickerPropDetailFragment stickerPropDetailFragment = new StickerPropDetailFragment();
                stickerPropDetailFragment.setArguments(bundle2);
                a2 = stickerPropDetailFragment;
            }
            a2.setUserVisibleHint(true);
            a.mo2192b(R.id.yw, a2, "sticker_prop_detail_fragment_tag");
            a.mo2189b();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }

    /* renamed from: a */
    public static Intent m100711a(Context context, String str, C42482c cVar, Serializable serializable, ArrayList<String> arrayList, String str2) {
        Intent intent = new Intent(context, StickerPropDetailActicity.class);
        if (str != null) {
            intent.putExtra("aweme_id", str);
        }
        if (cVar != null) {
            intent.putExtra("sticker_music", cVar);
        }
        if (serializable != null) {
            intent.putExtra("music_model", serializable);
        }
        intent.putExtra("extra_sticker_from", str2);
        intent.putExtra("extra_stickers", arrayList);
        return intent;
    }
}
