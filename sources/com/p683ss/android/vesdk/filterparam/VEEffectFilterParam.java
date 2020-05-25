package com.p683ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VEEffectFilterParam */
public class VEEffectFilterParam extends VEBaseFilterParam {
    private volatile C50698a audioProgressCallback;
    public String beatFilePath;
    public String[] composerTags;
    public float[] composerValues;
    public String effectPath;
    public boolean isSyncLoadResource;
    public boolean needReload;
    public int reqId;
    public int stickerId;
    public String stickerTag;
    public int timeout;

    /* renamed from: com.ss.android.vesdk.filterparam.VEEffectFilterParam$a */
    public interface C50698a {
        /* renamed from: a */
        long mo99211a();
    }

    public long getAudioProgress() {
        if (this.audioProgressCallback != null) {
            return this.audioProgressCallback.mo99211a();
        }
        return 0;
    }

    public VEEffectFilterParam() {
        this.filterName = "filter effect";
        this.filterType = 8;
        this.effectPath = "";
        this.stickerTag = "";
        this.beatFilePath = "";
    }

    public void setObtainAudioProgressCallback(C50698a aVar) {
        this.audioProgressCallback = aVar;
    }
}
