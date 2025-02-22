package com.airbnb.android.react.navigation;

import android.annotation.TargetApi;
import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.TransitionSet;

import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
class FragmentSharedElementTransition extends TransitionSet {

  public FragmentSharedElementTransition() {
    addTransition(new ChangeBounds());
    addTransition(new Fade());
    addTransition(new ChangeImageTransform());
    addTransition(new ChangeTransform());
    setInterpolator(new FastOutSlowInInterpolator());
  }
}
