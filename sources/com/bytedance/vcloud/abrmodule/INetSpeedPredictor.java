package com.bytedance.vcloud.abrmodule;

public interface INetSpeedPredictor {
    float getSpeed();

    void release();

    void update(ISpeedRecord iSpeedRecord);
}
