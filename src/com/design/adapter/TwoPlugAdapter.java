package com.design.adapter;

/**
 * Created by yunfei on 2017/3/20.
 */
public class TwoPlugAdapter implements ThreePlugIf {
    private TwoPlug plug;
    public TwoPlugAdapter(TwoPlug twoPlug) {
        this.plug = twoPlug;
    }

    @Override
    public void powerWithThree() {
        plug.powerWithTwo();
    }
}
