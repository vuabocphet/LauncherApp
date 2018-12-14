package com.tinh.dev.launcherapp;

import android.graphics.drawable.Drawable;

public class Item {
  CharSequence lable;
  CharSequence name1;
  Drawable icon1;

  public Item(CharSequence lable, CharSequence name1, Drawable icon1) {
    this.lable = lable;
    this.name1 = name1;
    this.icon1 = icon1;
  }

  public CharSequence getLable() {
    return lable;
  }

  public void setLable(CharSequence lable) {
    this.lable = lable;
  }

  public CharSequence getName1() {
    return name1;
  }

  public void setName1(CharSequence name1) {
    this.name1 = name1;
  }

  public Drawable getIcon1() {
    return icon1;
  }

  public void setIcon1(Drawable icon1) {
    this.icon1 = icon1;
  }
}


