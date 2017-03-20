package com.design.adapter;

/**
 * Created by yunfei on 2017/3/20.
 */
public class NoteBook {
    private ThreePlugIf plugIf;

    public NoteBook(ThreePlugIf plugIf) {
        this.plugIf = plugIf;
    }

    public void charge(){
        plugIf.powerWithThree();
    }

    public static void main(String[] args) {
        TwoPlug twoPlug = new TwoPlug();
        ThreePlugIf threePlugIf = new TwoPlugAdapter(twoPlug);
        NoteBook noteBook = new NoteBook(threePlugIf);
        noteBook.charge();
    }
}
