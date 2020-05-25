package com.snapchat.kit.sdk.creative.media;

import android.net.Uri;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public class SnapSticker {

    /* renamed from: a */
    private final File f50530a;

    /* renamed from: b */
    private float f50531b;

    /* renamed from: c */
    private float f50532c = 0.5f;

    /* renamed from: d */
    private float f50533d = 0.5f;

    /* renamed from: e */
    private float f50534e = 200.0f;

    /* renamed from: f */
    private float f50535f = 200.0f;

    /* renamed from: g */
    private boolean f50536g;

    public File getStickerFile() {
        return this.f50530a;
    }

    public void setHeight(float f) {
        this.f50535f = f;
    }

    public void setPosX(float f) {
        this.f50532c = f;
    }

    public void setPosY(float f) {
        this.f50533d = f;
    }

    public void setRotationDegreesClockwise(float f) {
        this.f50531b = f;
    }

    public void setWidth(float f) {
        this.f50534e = f;
    }

    SnapSticker(File file) {
        this.f50530a = file;
    }

    public JSONObject getJsonForm(Uri uri) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uri", uri);
            jSONObject.put("posX", (double) this.f50532c);
            jSONObject.put("posY", (double) this.f50533d);
            jSONObject.put("rotation", (double) this.f50531b);
            jSONObject.put("width", (double) this.f50534e);
            jSONObject.put("height", (double) this.f50535f);
            jSONObject.put("isAnimated", this.f50536g);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
