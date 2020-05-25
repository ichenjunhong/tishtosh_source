package com.zego.zegoliveroom.callback;

import com.zego.zegoliveroom.entity.ZegoAudioFrame;

public interface IZegoAudioPostpCallback {
    ZegoAudioFrame onAudioPostp(ZegoAudioFrame zegoAudioFrame, String str);
}
