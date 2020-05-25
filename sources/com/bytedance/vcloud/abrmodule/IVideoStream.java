package com.bytedance.vcloud.abrmodule;

public interface IVideoStream extends IStream {
    float getFrameRate();

    int getHeight();

    int getWidth();
}
